package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.androidx.media3.common.Metadata;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.1f, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05561f extends AE implements Handler.Callback {
    public static byte[] A0C;
    public static String[] A0D = {"NK", "vMUMQm9t3PVEHAhulw0MAIkQwbUiUT4C", "VzHAp2e3DLoJMdzQNED0QcuPK7cYUDq5", "FnbOiwq", "xIduLB4T8250", "Cs28mBuu0mG0MZGGLuKaoZOHc13snW3U", "yvPpy336WGNf4g7OJVDaRPYRY7Bcuv5q", "KVpXSq2ZIE7gcar9k8WJ"};
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC0965Hw A03;
    public List<ImfDataTrack> A04;
    public boolean A05;
    public final Handler A06;
    public final InterfaceC0794Bd A07;
    public final InterfaceC0796Bf A08;
    public final C07539e A09;
    public final long[] A0A;
    public final Metadata[] A0B;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{86, 97, 97, 124, 97, 51, 122, 125, 51, 99, 114, 97, 96, 122, 125, 116, 51, 90, 94, 85, 51, 96, 99, 118, 112, 124, 84, 69, 80, 85, 80, 69, 80, 99, 84, 95, 85, 84, 67, 84, 67};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A07(Metadata metadata, List<Metadata.Entry> list) {
        for (int i = 0; i < metadata.A02(); i++) {
            C2399qI A9b = metadata.A03(i).A9b();
            if (A9b == null || !this.A07.AKN(A9b)) {
                list.add(metadata.A03(i));
            } else {
                InterfaceC0965Hw A5J = this.A07.A5J(A9b);
                byte[] bArr = (byte[]) AbstractC06233y.A01(metadata.A03(i).A9a());
                this.A09.A0A();
                this.A09.A0C(bArr.length);
                ((ByteBuffer) C5C.A0f(this.A09.A02)).put(bArr);
                this.A09.A0B();
                Metadata A5o = A5J.A5o(this.A09);
                if (A5o != null) {
                    A07(A5o, list);
                }
            }
        }
    }

    static {
        A02();
    }

    public C05561f(InterfaceC0796Bf interfaceC0796Bf, Looper looper) {
        this(interfaceC0796Bf, looper, InterfaceC0794Bd.A00, null);
    }

    public C05561f(InterfaceC0796Bf interfaceC0796Bf, Looper looper, InterfaceC0794Bd interfaceC0794Bd, String str) {
        super(5);
        this.A08 = (InterfaceC0796Bf) AbstractC06233y.A01(interfaceC0796Bf);
        this.A06 = looper == null ? null : C5C.A0c(looper, this);
        this.A07 = (InterfaceC0794Bd) AbstractC06233y.A01(interfaceC0794Bd);
        this.A09 = new C07539e();
        this.A0B = new Metadata[5];
        this.A0A = new long[5];
        A08(str);
    }

    private void A01() {
        Arrays.fill(this.A0B, (Object) null);
        this.A01 = 0;
        this.A00 = 0;
    }

    private void A03(long j9) {
        if (this.A04 == null) {
            return;
        }
        for (ImfDataTrack imfDataTrack : this.A04) {
            if (imfDataTrack.A01 > j9 || imfDataTrack.A00 >= j9) {
            }
        }
    }

    private void A04(long j9) {
        if (this.A04 == null) {
            return;
        }
        long A01 = C2Y.A01(j9);
        if (this.A06 != null) {
            this.A06.obtainMessage(1, Long.valueOf(A01)).sendToTarget();
        } else {
            A03(A01);
        }
    }

    private void A05(Metadata metadata, long j9) {
        if (this.A06 != null) {
            Handler handler = this.A06;
            String[] strArr = A0D;
            if (strArr[4].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A0D[5] = "4kdXpcjsywiaLxx0LOctAJHWIf081Tdg";
            handler.obtainMessage(0, new Object[]{metadata, Long.valueOf(j9)}).sendToTarget();
            return;
        }
        A06(metadata, j9);
    }

    private void A06(Metadata metadata, long j9) {
        this.A08.AEt(metadata, j9);
    }

    private void A08(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                this.A04 = ImfSpecParser.A01(str);
            } catch (JSONException unused) {
                AbstractC06314g.A05(A00(25, 16, 46), A00(0, 25, 12));
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AE
    public final void A1Z() {
        A01();
        this.A03 = null;
    }

    @Override // com.instagram.common.viewpoint.core.AE
    public final void A1a(long j9, boolean z8) {
        A01();
        this.A05 = false;
    }

    @Override // com.instagram.common.viewpoint.core.AE
    public final void A1c(C2399qI[] c2399qIArr, long j9, long j10) {
        this.A03 = this.A07.A5J(c2399qIArr[0]);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo
    public final boolean AAP() {
        return this.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo
    public final boolean AAe() {
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo
    public final void AIX(long j9, long j10) {
        A04(j9);
        if (!this.A05) {
            int i = this.A00;
            String[] strArr = A0D;
            if (strArr[7].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0D[6] = "1aiib0Ku6fHDvKwfwiyuvRv8M83XUpBK";
            if (i < 5) {
                this.A09.A0A();
                C07026z A1U = A1U();
                int A1R = A1R(A1U, this.A09, 0);
                if (A1R == -4) {
                    if (this.A09.A05()) {
                        this.A05 = true;
                    } else if (!this.A09.A04()) {
                        this.A09.A00 = this.A02;
                        this.A09.A0B();
                        Metadata A5o = ((InterfaceC0965Hw) C5C.A0f(this.A03)).A5o(this.A09);
                        if (A5o != null) {
                            ArrayList arrayList = new ArrayList(A5o.A02());
                            A07(A5o, arrayList);
                            if (!arrayList.isEmpty()) {
                                Metadata metadata = new Metadata(arrayList);
                                int i4 = (this.A01 + this.A00) % 5;
                                this.A0B[i4] = metadata;
                                this.A0A[i4] = this.A09.A01;
                                this.A00++;
                            }
                        }
                    }
                } else if (A1R == -5) {
                    this.A02 = ((C2399qI) AbstractC06233y.A01(A1U.A00)).A0M;
                }
            }
        }
        if (this.A00 > 0 && this.A0A[this.A01] <= j9) {
            A05((Metadata) C5C.A0f(this.A0B[this.A01]), C2Y.A01(j9 - this.A0A[this.A01]));
            this.A0B[this.A01] = null;
            this.A01 = (this.A01 + 1) % 5;
            this.A00--;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07187p
    public final int AKM(C2399qI c2399qI) {
        int i;
        if (this.A07.AKN(c2399qI)) {
            if (AbstractC05571g.A1G(c2399qI)) {
                i = 4;
            } else {
                i = 2;
            }
            return AbstractC07117i.A00(i);
        }
        return AbstractC07117i.A00(0);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo, com.instagram.common.viewpoint.core.InterfaceC07187p
    public final String getName() {
        return A00(25, 16, 46);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                Object[] objArr = (Object[]) message.obj;
                A06((Metadata) objArr[0], ((Long) objArr[1]).longValue());
                return true;
            case 1:
                A03(((Long) message.obj).longValue());
                String[] strArr = A0D;
                if (strArr[2].charAt(28) != strArr[1].charAt(28)) {
                    throw new RuntimeException();
                }
                A0D[5] = "UckPrHUV0DeFsLdW0mSA3sL7bYTaY94z";
                return true;
            default:
                throw new IllegalStateException();
        }
    }
}
