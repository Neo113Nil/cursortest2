package com.instagram.common.viewpoint.core;

import android.view.View;
import com.google.common.base.Ascii;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.hT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1402hT implements MX {
    public static byte[] A02;
    public static String[] A03 = {"ebJtInVgM8lwtLsL8CqjQvfHZTFWXyTj", "MRT4Iz3aNiJEaKRUIrDApfghDq01n6sB", "qhIcWii6jOsLbVLe4G", "jd0Ec4CahT7YYBjB568owPC0gY4s3zOU", "RPiMcfQYBdHC0SSG6XvNc0NsjlYurq5U", "E74vSWGMqEH8Jt4WlgBEkdQ8nTEO7fKB", "DEVdv4rr1ByH9p4ezSF9ryFdFyWOGnGy", "23RYwIDt1nJrIBpc57"};
    public final /* synthetic */ AnonymousClass72 A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{93, Ascii.SI, 93, 88, Ascii.SI, Ascii.SI, 10, Ascii.CR, 32, 3, Ascii.FF, Ascii.FF, 7, 16, 66, Ascii.VT, Ascii.SI, Ascii.DC2, 16, 7, 17, 17, Ascii.VT, Ascii.CR, Ascii.FF, 66, 4, Ascii.VT, 16, 7, 6, Ascii.FS, Ascii.GS, 49, Ascii.DC2, Ascii.GS, Ascii.GS, Ascii.SYN, 1, Utf8.REPLACEMENT_BYTE, Ascii.FS, Ascii.DC4, Ascii.DC4, Ascii.SUB, Ascii.GS, Ascii.DC4, 58, Ascii.RS, 3, 1, Ascii.SYN, 0, 0, Ascii.SUB, Ascii.FS, Ascii.GS};
    }

    static {
        A01();
    }

    public C1402hT(AnonymousClass72 anonymousClass72, Runnable runnable) {
        this.A00 = anonymousClass72;
        this.A01 = runnable;
    }

    @Override // com.instagram.common.viewpoint.core.MX
    public final void ACb(InterfaceC1465id interfaceC1465id) {
        C6M c6m;
        c6m = this.A00.A02;
        c6m.A0F().A4S();
        this.A00.A07.A0C();
    }

    @Override // com.instagram.common.viewpoint.core.MX
    public final void ACc(InterfaceC1465id interfaceC1465id, View view) {
        C6M c6m;
        c6m = this.A00.A02;
        c6m.A0F().A4R(interfaceC1465id == ((AbstractC1399hQ) this.A00).A00);
        if (interfaceC1465id != ((AbstractC1399hQ) this.A00).A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        MP mp = ((AbstractC1399hQ) this.A00).A01;
        AnonymousClass72 anonymousClass72 = this.A00;
        String[] strArr = A03;
        if (strArr[6].charAt(14) != strArr[5].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[0] = "gfJNIdbF2FrCa8qL8kuytpSS0QUlrsrj";
        strArr2[1] = "KzSpIsxhAVssntgB7OlLodebxm4ynnXJ";
        ((AbstractC1399hQ) anonymousClass72).A01 = interfaceC1465id;
        this.A00.A01 = view;
        if (!this.A00.A0C) {
            this.A00.A07.A0F(interfaceC1465id);
        } else {
            this.A00.A07.A0E(view);
            this.A00.A0Q(mp);
        }
    }

    @Override // com.instagram.common.viewpoint.core.MX
    public final void ACd(InterfaceC1465id interfaceC1465id) {
        C6M c6m;
        VF.A05(A00(31, 25, 61), A00(8, 23, 44), A00(0, 8, 37));
        c6m = this.A00.A02;
        c6m.A0F().A4U();
        this.A00.A07.A0D();
        this.A00.A0O();
    }

    @Override // com.instagram.common.viewpoint.core.MX
    public final void ADj(InterfaceC1465id interfaceC1465id, V1 v1) {
        C6M c6m;
        c6m = this.A00.A02;
        c6m.A0F().A4T(interfaceC1465id == ((AbstractC1399hQ) this.A00).A00, v1.A03().getErrorCode());
        if (interfaceC1465id != ((AbstractC1399hQ) this.A00).A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A0Q(interfaceC1465id);
        this.A00.ADB(v1);
    }
}
