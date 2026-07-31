package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.80, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass80 implements InterfaceC3414k8 {
    public static byte[] A09;
    public static String[] A0A = {"0TFgGHCmbDEnT", "P3BoNX3HbYs3p91Xznd9cH02Ego1LEzw", "OWrFl7C0gkEmqIZvATANnxtRvMpHSetZ", "XjLJU23F7IQ7TgYJbWjoa78", "8eUGin29aZrVydG4hLQZ04ng176drDiv", "tE42BGb8ExLW22Y3fw0IicKZ4ID1w2IZ", "N0c3cK9W7W98ikBdYu66t8J", "EarR2SOYmotvRVJvY11PbnGgxllwGrNq"};
    public N9 A01;
    public NA A02;
    public C3390jk A03;
    public C3388ji A04;
    public AnonymousClass76 A05;
    public Z1 A06;
    public Z2 A07;
    public final String A08 = UUID.randomUUID().toString();
    public long A00 = -1;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 16);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-81, -64, -11, -19, -20, -15, -3, -11, -25, -6, -19, -21, -4, -23, -10, -17, -12, -19};
    }

    static {
        A04();
    }

    private void A05(AnonymousClass76 anonymousClass76, C3388ji c3388ji, C2624Sx c2624Sx, N9 n9, Z2 z2) {
        String A7O = c3388ji.A7O();
        if (!TextUtils.isEmpty(A7O)) {
            c2624Sx.A0e(new VI(A7O, anonymousClass76.A0A()));
        }
        C2680Vb A0I = c3388ji.A0I();
        String[] strArr = A0A;
        String clientToken = strArr[3];
        if (clientToken.length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[3] = "l0iKT0z7S0YTo68xxrsf1qJ";
        strArr2[6] = "FTb7Q8n5ne47CtPUjUxYv1n";
        if (A0I != null) {
            C2622Sv c2622Sv = new C2622Sv(c3388ji.A0I().getUrl(), c3388ji.A0I().getHeight(), c3388ji.A0I().getWidth(), c3388ji.A0b(), A03(2, 16, 120));
            c2622Sv.A01 = new T3(false, -1, -1);
            c2624Sx.A0W();
            c2624Sx.A0c(c2622Sv);
        }
        if (c3388ji.A0H() != null) {
            c2624Sx.A0c(new C2622Sv(c3388ji.A0H().getUrl(), c3388ji.A0H().getHeight(), c3388ji.A0H().getWidth(), c3388ji.A0b(), A03(2, 16, 120)));
        }
        String A0e = c3388ji.A0e();
        if (A0e != null && !TextUtils.isEmpty(A0e)) {
            c2624Sx.A0b(new C2620St(A0e, c3388ji.A0b(), A03(2, 16, 120), c3388ji.A0D()));
        }
        AbstractC3383jd A0F = c3388ji.A0F();
        String A03 = A03(2, 16, 120);
        if (A0F != null) {
            O0.A00(c3388ji.A0F(), c2624Sx, A03);
        }
        C3402jw c3402jw = new C3402jw(this, z2, n9, anonymousClass76);
        String clientToken2 = c3388ji.A0b();
        c2624Sx.A0X(c3402jw, new C2617Sq(clientToken2, A03));
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final String A7O() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A7O();
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final AdPlacementType A8k() {
        return AdPlacementType.MEDIUM_RECTANGLE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3414k8
    public final void AAt(AnonymousClass76 anonymousClass76, VA va, EnumC2692Vp enumC2692Vp, N9 n9, JSONObject jSONObject, C2650Tx c2650Tx) {
        anonymousClass76.A0F().A4N();
        this.A05 = anonymousClass76;
        this.A01 = n9;
        C2624Sx c2624Sx = new C2624Sx(anonymousClass76);
        this.A00 = System.currentTimeMillis();
        C3388ji A00 = NI.A00(anonymousClass76, jSONObject, AbstractC2729Xd.A02(jSONObject, A03(0, 2, 60)));
        this.A04 = A00;
        if (!AbstractC2474Mx.A06(anonymousClass76, A00, va)) {
            Z1 adViewListener = new C3404jy(this, anonymousClass76);
            this.A06 = adViewListener;
            Z2 z2 = new Z2(anonymousClass76, va, c2624Sx, new WeakReference(adViewListener), c2650Tx.A04(), c2650Tx.A07(), c2650Tx.A08(), c2650Tx.A09(), A00, this.A08);
            this.A07 = z2;
            this.A03 = new C3390jk(anonymousClass76, new C3403jx(this, anonymousClass76, n9), z2.getViewabilityChecker(), va, A00);
            A05(anonymousClass76, A00, c2624Sx, n9, z2);
            this.A02 = new NA(anonymousClass76, this.A08, this, n9);
            this.A02.A02();
            return;
        }
        anonymousClass76.A0F().A52();
        n9.AEN(this, C2690Vm.A00(AdErrorType.NO_FILL));
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final boolean AKL() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final void onDestroy() {
        if (this.A05 != null) {
            InterfaceC3445kf A0F = this.A05.A0F();
            String[] strArr = A0A;
            if (strArr[1].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            A0A[7] = "tMGyCfr9ucO4oWdztKDfdPlDfRrhkMp8";
            A0F.A4L(this.A07 != null);
        }
        if (this.A07 != null) {
            this.A07.A0I();
            this.A07 = null;
            this.A06 = null;
        }
        NA na = this.A02;
        if (A0A[0].length() == 16) {
            throw new RuntimeException();
        }
        A0A[7] = "5ZoCIskAsYlLTmabnaeKVzywNB4LbbVC";
        if (na != null) {
            this.A02.A03();
        }
    }
}
