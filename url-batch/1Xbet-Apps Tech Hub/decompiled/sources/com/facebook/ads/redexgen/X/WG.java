package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class WG implements InterfaceC0420Cg {
    public static byte[] A06;
    public static String[] A07 = {"3GVDuA8wFVUyMgpUpbIewfrR9H99KrEk", "JlICi14zqaUcthBIG11pWTw91wh2yVCw", "SCc1nWfYKQsHAUfYf8T5wZndFViKre8j", "glAeXwJzdtWksZ9B0aFClAzpFAfPstjY", "", "MoUOfVVsEVomZ5Pq9PB", "UtG2kZW99inEJ5Gw9pPEuhVI3SuCWANI", "WpnQHVSEOc3lam6iocwMhSGypVEKzNDF"};
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC0409Bm A03;
    public boolean A04;
    public final C0541Hh A05 = new C0541Hh(10);

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A07[3].charAt(3) == 'p') {
                throw new RuntimeException();
            }
            A07[3] = "8BWuaIrledIbOr1Vvmzlm7GxjPqtlOKX";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
            i4++;
        }
    }

    public static void A01() {
        A06 = new byte[]{121, 84, 78, 94, 92, 79, 89, 84, 83, 90, Ascii.GS, 84, 83, 75, 92, 81, 84, 89, Ascii.GS, 116, 121, Ascii.SO, Ascii.GS, 73, 92, 90, Ascii.SYN, 59, 108, Ascii.CR, 58, 62, 59, 58, 45, 43, 58, 58, 38, 35, 41, 43, 62, 35, 37, 36, 101, 35, 46, 121};
    }

    static {
        A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (51 != r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b8, code lost:
    
        r8.A05.A0Z(3);
        r8.A01 = r8.A05.A0D() + 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00af, code lost:
    
        if (51 != r7) goto L19;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0420Cg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A4O(C0541Hh c0541Hh) {
        if (!this.A04) {
            return;
        }
        int A04 = c0541Hh.A04();
        int bytesAvailable = this.A00;
        if (bytesAvailable < 10) {
            int min = Math.min(A04, 10 - bytesAvailable);
            System.arraycopy(c0541Hh.A00, c0541Hh.A06(), this.A05.A00, this.A00, min);
            if (this.A00 + min == 10) {
                this.A05.A0Y(0);
                int headerBytesAvailable = this.A05.A0E();
                if (73 == headerBytesAvailable) {
                    int A0E = this.A05.A0E();
                    int headerBytesAvailable2 = A07[5].length();
                    if (headerBytesAvailable2 != 16) {
                        String[] strArr = A07;
                        strArr[0] = "eZdoRYLyKv4toCemxkiKJA2d6NIzFwiE";
                        strArr[1] = "sPPG97pGznW8OkCUNxQD0xF7olrTR4ou";
                        if (68 == A0E) {
                            int A0E2 = this.A05.A0E();
                            int headerBytesAvailable3 = A07[5].length();
                            if (headerBytesAvailable3 != 16) {
                                A07[3] = "eu3l96gSDWZf4lrXAqzHcIk6PJ9QX6gD";
                            } else {
                                A07[3] = "3RA5HWh0kmfEwFj0aBurDCdRc5WBxEPn";
                            }
                        }
                    }
                    throw new RuntimeException();
                }
                Log.w(A00(26, 9, 105), A00(0, 26, 11));
                int headerBytesAvailable4 = A07[3].charAt(3);
                if (headerBytesAvailable4 != 112) {
                    A07[6] = "G5eroEsu98sAd5xO02g5FkX9fDMbEAxT";
                    this.A04 = false;
                    return;
                }
                throw new RuntimeException();
            }
        }
        int headerBytesAvailable5 = this.A01;
        int bytesToWrite = Math.min(A04, headerBytesAvailable5 - this.A00);
        this.A03.AEr(c0541Hh, bytesToWrite);
        this.A00 += bytesToWrite;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0420Cg
    public final void A4l(InterfaceC0401Bc interfaceC0401Bc, C0431Cu c0431Cu) {
        c0431Cu.A05();
        InterfaceC0409Bm AFx = interfaceC0401Bc.AFx(c0431Cu.A03(), 4);
        this.A03 = AFx;
        AFx.A5j(Format.A0B(c0431Cu.A04(), A00(35, 15, 124), null, -1, null));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0420Cg
    public final void ADi() {
        int i;
        if (!this.A04 || (i = this.A01) == 0 || this.A00 != i) {
            return;
        }
        this.A03.AEs(this.A02, 1, i, 0, null);
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0420Cg
    public final void ADj(long j, boolean z) {
        if (!z) {
            return;
        }
        this.A04 = true;
        this.A02 = j;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0420Cg
    public final void AEv() {
        this.A04 = false;
    }
}
