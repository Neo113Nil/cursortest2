package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.util.Arrays;
import okio.Utf8;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* renamed from: com.facebook.ads.redexgen.X.0z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00710z extends C9Z implements Handler.Callback {
    public static byte[] A0H;
    public static String[] A0I = {"58lW15hp88fFpLaSxErp", "56QScXrV6I", "DwEmmtKo2ODeTiA17rxauXwet98Z4", "A4aLtxZMLOPLaVE6SeDzXnpOLTGefetw", "FhOKuZuvLBWd8lghoK1mwxVLtzQRZ", "h1d8vpIJ83Cnf8DVjx4Ui7av1xQxYsFL", "y1YT0hSXczs7bGZDGpuR", "alxZNjekiwxoo3ZSsAAxphzspQJfVEZr"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public C1836or A05;
    public InterfaceC1575kN A06;
    public C02357j A07;
    public AbstractC02347i A08;
    public AbstractC02347i A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D;
    public final C6N A0E;
    public final InterfaceC0379Dn A0F;
    public final InterfaceC0382Dq A0G;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0I;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[2] = "1YRuRVntTKbD5w1SSS8awuyRss3tM";
            strArr2[4] = "HmFGzdsys3t1iPkkAdwtO8Q44Z9aJ";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 122);
            i4++;
        }
    }

    public static void A09() {
        A0H = new byte[]{89, Byte.MAX_VALUE, 104, 126, 99, 126, 102, 111, 42, 110, 111, 105, 101, 110, 99, 100, 109, 42, 108, 107, 99, 102, 111, 110, 36, 42, 121, 126, 120, 111, 107, 103, 76, 101, 120, 103, 107, 126, 55, 57, 8, Ascii.NAK, Ascii.EM, Utf8.REPLACEMENT_BYTE, 8, 3, 9, 8, Ascii.US, 8, Ascii.US};
    }

    static {
        A09();
    }

    public C00710z(InterfaceC0382Dq interfaceC0382Dq, Looper looper, InterfaceC0379Dn interfaceC0379Dn) {
        super(3);
        this.A0G = (InterfaceC0382Dq) C3M.A01(interfaceC0382Dq);
        this.A0D = looper == null ? null : AbstractC01484a.A0c(looper, this);
        this.A0F = interfaceC0379Dn;
        this.A0E = new C6N();
        this.A02 = -9223372036854775807L;
        this.A04 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
    }

    private long A00() {
        if (this.A01 == -1) {
            return Long.MAX_VALUE;
        }
        C3M.A01(this.A09);
        if (this.A01 >= this.A09.A7w()) {
            return Long.MAX_VALUE;
        }
        return this.A09.A7v(this.A01);
    }

    @RequiresNonNull({"subtitle"})
    @SideEffectFree
    private long A01(long j) {
        int A8S = this.A09.A8S(j);
        if (A8S != 0) {
            int nextEventTimeIndex = this.A09.A7w();
            if (nextEventTimeIndex != 0) {
                String[] strArr = A0I;
                String str = strArr[6];
                String str2 = strArr[0];
                int length = str.length();
                int nextEventTimeIndex2 = str2.length();
                if (length != nextEventTimeIndex2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[2] = "dWbBH4lKinuUlTA8CpNFonpmnzuPl";
                strArr2[4] = "MDue3s6tkJ65MZJ0TxYFZvpfeIb1w";
                if (A8S == -1) {
                    AbstractC02347i abstractC02347i = this.A09;
                    if (A0I[1].length() != 10) {
                        int nextEventTimeIndex3 = this.A09.A7w();
                        return abstractC02347i.A7v(nextEventTimeIndex3 - 1);
                    }
                    A0I[3] = "us0wUp64B7rq5nQeuQUWAOSOIfPFOl8I";
                    int nextEventTimeIndex4 = this.A09.A7w();
                    return abstractC02347i.A7v(nextEventTimeIndex4 - 1);
                }
                int nextEventTimeIndex5 = A8S - 1;
                return this.A09.A7v(nextEventTimeIndex5);
            }
        }
        return ((AbstractC1757nX) this.A09).A01;
    }

    @SideEffectFree
    private long A02(long j) {
        boolean z = true;
        C3M.A08(j != -9223372036854775807L);
        if (this.A04 == -9223372036854775807L) {
            z = false;
        }
        C3M.A08(z);
        return j - this.A04;
    }

    private void A04() {
        A0B(new C1785o0(MetaExoPlayerCustomizedCollections.A01(), A02(this.A03)));
    }

    private void A05() {
        this.A0C = true;
        this.A06 = this.A0F.A5C((C1836or) C3M.A01(this.A05));
    }

    private void A06() {
        this.A07 = null;
        this.A01 = -1;
        if (this.A09 != null) {
            this.A09.A0B();
            this.A09 = null;
        }
        if (this.A08 != null) {
            this.A08.A0B();
            this.A08 = null;
        }
    }

    private void A07() {
        A06();
        ((InterfaceC1575kN) C3M.A01(this.A06)).AGr();
        this.A06 = null;
        this.A00 = 0;
    }

    private void A08() {
        A07();
        A05();
    }

    private void A0A(C1785o0 c1785o0) {
        this.A0G.ACw(c1785o0.A01);
        this.A0G.ACv(c1785o0);
    }

    private void A0B(C1785o0 c1785o0) {
        if (this.A0D != null) {
            this.A0D.obtainMessage(0, c1785o0).sendToTarget();
        } else {
            A0A(c1785o0);
        }
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Method to propagate any SubtitleDecoder Error upwards")
    private void A0C(C0381Dp c0381Dp) {
        if (this.A0D != null) {
            this.A0D.obtainMessage(1, c0381Dp).sendToTarget();
        }
    }

    private void A0D(C1574kM c1574kM) {
        AnonymousClass44.A08(A03(39, 12, 23), A03(0, 39, 112) + this.A05, c1574kM);
        A0C(new C0381Dp(this.A05, c1574kM));
        A04();
        A08();
    }

    @Override // com.instagram.common.viewpoint.core.C9Z
    public final void A1Z() {
        this.A05 = null;
        this.A02 = -9223372036854775807L;
        A04();
        this.A04 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        A07();
    }

    @Override // com.instagram.common.viewpoint.core.C9Z
    public final void A1a(long j, boolean z) {
        this.A03 = j;
        A04();
        this.A0A = false;
        this.A0B = false;
        this.A02 = -9223372036854775807L;
        if (this.A00 != 0) {
            A08();
        } else {
            A06();
            ((InterfaceC1575kN) C3M.A01(this.A06)).flush();
        }
    }

    @Override // com.instagram.common.viewpoint.core.C9Z
    public final void A1c(C1836or[] c1836orArr, long j, long j2) {
        this.A04 = j2;
        this.A05 = c1836orArr[0];
        if (this.A06 != null) {
            this.A00 = 1;
        } else {
            A05();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1746nM
    public final boolean AAG() {
        return this.A0B;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1746nM
    public final boolean AAV() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e8, code lost:
    
        if (r7 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ea, code lost:
    
        r9.A09.A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ef, code lost:
    
        r9.A01 = r6.A8S(r10);
        r9.A09 = r6;
        r9.A08 = null;
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0102, code lost:
    
        if (r7 != null) goto L51;
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1746nM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AHn(long j, long j2) {
        this.A03 = j;
        if (AAE() && this.A02 != -9223372036854775807L && j >= this.A02) {
            A06();
            this.A0B = true;
        }
        if (this.A0B) {
            return;
        }
        if (this.A08 == null) {
            ((InterfaceC1575kN) C3M.A01(this.A06)).AIx(j);
            try {
                this.A08 = ((InterfaceC1575kN) C3M.A01(this.A06)).A5l();
            } catch (C1574kM e) {
                A0D(e);
                return;
            }
        }
        if (A92() != 2) {
            return;
        }
        boolean z = false;
        if (this.A09 != null) {
            long A00 = A00();
            while (A00 <= j) {
                this.A01++;
                A00 = A00();
                z = true;
            }
        }
        if (this.A08 != null) {
            AbstractC02347i abstractC02347i = this.A08;
            boolean textRendererNeedsUpdate = abstractC02347i.A05();
            if (textRendererNeedsUpdate) {
                if (!z && A00() == Long.MAX_VALUE) {
                    if (this.A00 == 2) {
                        A08();
                    } else {
                        A06();
                        this.A0B = true;
                    }
                }
            } else if (((AbstractC1757nX) abstractC02347i).A01 <= j) {
                AbstractC02347i abstractC02347i2 = this.A09;
                if (A0I[1].length() != 10) {
                    String[] strArr = A0I;
                    strArr[6] = "SM2l9fwyY7vSK8U9dCan";
                    strArr[0] = "PLBzRsO91bLUZoRphjDr";
                } else {
                    A0I[1] = "uDUYlaOON0";
                }
            }
        }
        if (z) {
            C3M.A01(this.A09);
            A0B(new C1785o0(this.A09.A7P(j), A02(A01(j))));
        }
        int i = this.A00;
        if (A0I[3].charAt(23) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr2 = A0I;
        strArr2[6] = "ML0YoWWFYnm1pIYkMDlj";
        strArr2[0] = "WzY2c9YM67lXJGPj7nnt";
        if (i == 2) {
            return;
        }
        while (true) {
            try {
                boolean textRendererNeedsUpdate2 = this.A0A;
                if (!textRendererNeedsUpdate2) {
                    C02357j c02357j = this.A07;
                    if (c02357j == null) {
                        c02357j = ((InterfaceC1575kN) C3M.A01(this.A06)).A5j();
                        if (c02357j != null) {
                            this.A07 = c02357j;
                        } else {
                            return;
                        }
                    }
                    if (this.A00 == 1) {
                        c02357j.A02(4);
                        ((InterfaceC1575kN) C3M.A01(this.A06)).AGZ(c02357j);
                        this.A07 = null;
                        this.A00 = 2;
                        return;
                    }
                    int A1R = A1R(this.A0E, c02357j, 0);
                    if (A1R == -4) {
                        boolean textRendererNeedsUpdate3 = c02357j.A05();
                        if (textRendererNeedsUpdate3) {
                            this.A0A = true;
                            this.A0C = false;
                        } else {
                            C1836or c1836or = this.A0E.A00;
                            if (c1836or != null) {
                                c02357j.A00 = c1836or.A0M;
                                c02357j.A0B();
                                boolean z2 = this.A0C;
                                boolean textRendererNeedsUpdate4 = c02357j.A07();
                                this.A0C = (textRendererNeedsUpdate4 ? false : true) & z2;
                            } else {
                                return;
                            }
                        }
                        boolean textRendererNeedsUpdate5 = this.A0C;
                        if (!textRendererNeedsUpdate5) {
                            ((InterfaceC1575kN) C3M.A01(this.A06)).AGZ(c02357j);
                            this.A07 = null;
                        }
                    } else if (A1R == -3) {
                        return;
                    }
                } else {
                    return;
                }
            } catch (C1574kM e2) {
                A0D(e2);
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.C7D
    public final int AJb(C1836or c1836or) {
        if (this.A0F.AJc(c1836or)) {
            return AnonymousClass76.A00(4);
        }
        if (AbstractC01032h.A0E(c1836or.A0W)) {
            return AnonymousClass76.A00(1);
        }
        return AnonymousClass76.A00(0);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1746nM, com.instagram.common.viewpoint.core.C7D
    public final String getName() {
        return A03(39, 12, 23);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A0A((C1785o0) message.obj);
                return true;
            case 1:
                return true;
            default:
                throw new IllegalStateException();
        }
    }
}
