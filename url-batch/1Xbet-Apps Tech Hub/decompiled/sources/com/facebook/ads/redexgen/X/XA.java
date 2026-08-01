package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.facebook.ads.redexgen.X.BL;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public final class XA<T extends BL> implements BK<T>, B1<T> {
    public static byte[] A0D;
    public static String[] A0E = {"ANYLgz", "oJggquXjFajkvVakw", "NhfBTMehdsUwmjJG25", "fCdIhqwNOTcaInr5tUyGNlroBtV", "OEWoY1V4f4faBwRg332bHxVOSHWwx21M", "QEXYlj0kmMt4ztT6jdLWJjem", "2UI8DlmhQXrJ84vyuAUmahlNAt", "mJ2nqf9sK7no"};
    public int A00;
    public Looper A01;
    public byte[] A02;
    public final int A03;
    public final B7 A04;
    public final BR<T> A05;
    public final BV A06;
    public final HashMap<String, String> A07;
    public final List<XB<T>> A08;
    public final List<XB<T>> A09;
    public final UUID A0A;
    public final boolean A0B;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/XA<TT;>.MediaDrmHandler; */
    public volatile BA A0C;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            String[] strArr = A0E;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0E[4] = "NBGjCtubpQRAXyW4McbyIV8QsblEY4y1";
            copyOfRange[i4] = (byte) (i5 ^ 105);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0D = new byte[]{105, 72, 75, 76, 88, 65, 89, 105, 95, 64, 126, 72, 94, 94, 68, 66, 67, 96, 74, 95, 53, 3, Ascii.FS, 56, Ascii.US, Ascii.CAN, 5, 53, 16, 5, 16, 81, Ascii.RS, Ascii.US, Ascii.GS, 8, 81, Ascii.DC2, Ascii.RS, Ascii.US, 5, 16, Ascii.CAN, Ascii.US, 2, 81, Ascii.DC2, Ascii.RS, Ascii.FS, Ascii.FS, Ascii.RS, Ascii.US, 81, 33, 34, 34, 57, 81, 34, Ascii.DC2, Ascii.EM, Ascii.DC4, Ascii.FS, Ascii.DC4, 53, 16, 5, 16, 95, 81, 48, 2, 2, 4, Ascii.FS, Ascii.CAN, Ascii.US, Ascii.SYN, 81, 2, 4, 1, 1, Ascii.RS, 3, 5, 81, Ascii.ETB, Ascii.RS, 3, 75, 81, Ascii.US, Ascii.RS, Ascii.US, 77, 119, 118, 119, 103, 48, 54, Base64.padSymbol, 48, 98, 100, 111, 114};
    }

    static {
        A03();
    }

    public static DrmInitData.SchemeData A00(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.A01);
        int i = 0;
        while (true) {
            boolean z2 = false;
            if (i >= drmInitData.A01) {
                break;
            }
            DrmInitData.SchemeData A01 = drmInitData.A01(i);
            if (A01.A02(uuid) || (C9E.A01.equals(uuid) && A01.A02(C9E.A02))) {
                z2 = true;
            }
            if (z2 && (A01.A04 != null || z)) {
                arrayList.add(A01);
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (C9E.A05.equals(uuid)) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList.get(i2);
                int A00 = schemeData.A01() ? CJ.A00(schemeData.A04) : -1;
                if (C0557Hx.A02 < 23 && A00 == 0) {
                    return schemeData;
                }
                if (C0557Hx.A02 >= 23 && A00 == 1) {
                    return schemeData;
                }
            }
        }
        return (DrmInitData.SchemeData) arrayList.get(0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XA != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.BL> */
    public final void A04(Handler handler, B8 b8) {
        this.A04.A03(handler, b8);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XA != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.BL> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    @Override // com.facebook.ads.redexgen.X.BK
    public final BJ<T> A2X(Looper looper, DrmInitData drmInitData) {
        Looper looper2 = this.A01;
        HI.A04(looper2 == null || looper2 == looper);
        if (this.A09.isEmpty()) {
            this.A01 = looper;
            if (this.A0C == null) {
                this.A0C = new BA(this, looper);
            }
        }
        DrmInitData.SchemeData schemeData = null;
        XB<T> xb = null;
        if (this.A02 == null && (schemeData = A00(drmInitData, this.A0A, false)) == null) {
            BB bb = new BB(this.A0A);
            this.A04.A04(bb);
            return new X9(new BH(bb));
        }
        if (!this.A0B) {
            if (!this.A09.isEmpty()) {
                xb = this.A09.get(0);
            }
        } else {
            byte[] bArr = schemeData != null ? schemeData.A04 : null;
            if (A0E[7].length() == 0) {
                throw new RuntimeException();
            }
            A0E[7] = "zebyso9QALf6mFi2tznux8P";
            Iterator<XB<T>> it = this.A09.iterator();
            while (true) {
                if (it.hasNext()) {
                    XB<T> next = it.next();
                    if (next.A0M(bArr)) {
                        xb = next;
                        break;
                    }
                } else {
                    xb = null;
                    break;
                }
            }
        }
        if (xb == null) {
            xb = new XB<>(this.A0A, this.A05, this, schemeData, this.A00, this.A02, this.A07, this.A06, looper, this.A04, this.A03);
            this.A09.add(xb);
        }
        xb.A0G();
        return xb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
    
        if (r4.equals(r5) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ca, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c7, code lost:
    
        if (r4.equals(r5) != false) goto L27;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XA != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.BL> */
    @Override // com.facebook.ads.redexgen.X.BK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A46(DrmInitData drmInitData) {
        if (this.A02 != null) {
            return true;
        }
        DrmInitData.SchemeData schemeData = A00(drmInitData, this.A0A, true);
        if (schemeData == null) {
            int i = drmInitData.A01;
            if (A0E[7].length() == 0) {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[5] = "Gq1nb8ZpgvmUzJpUyLgmbdlX";
            strArr[0] = "zEBygY";
            if (i != 1 || !drmInitData.A01(0).A02(C9E.A02)) {
                return false;
            }
            Log.w(A01(0, 20, 68), A01(20, 72, 24) + this.A0A);
        }
        String str = drmInitData.A02;
        if (str == null || A01(100, 4, 58).equals(str)) {
            return true;
        }
        if (!A01(92, 4, 21).equals(str) && !A01(96, 4, 125).equals(str)) {
            String A01 = A01(104, 4, 104);
            String[] strArr2 = A0E;
            if (strArr2[6].length() != strArr2[2].length()) {
                A0E[4] = "bzvSTEO2NGjBPpa5noKORqr6ZpHh1m8T";
            }
        }
        return C0557Hx.A02 >= 25;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XA != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.BL> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    @Override // com.facebook.ads.redexgen.X.B1
    public final void ACb() {
        for (XB<T> xb : this.A08) {
            String[] strArr = A0E;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A0E[4] = "E3b0MKGlV7Qlh8NFsi3ziriRt4u9XqXm";
            xb.A0H();
        }
        this.A08.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XA != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.BL> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    @Override // com.facebook.ads.redexgen.X.B1
    public final void ACc(Exception exc) {
        Iterator<XB<T>> it = this.A08.iterator();
        while (it.hasNext()) {
            it.next().A0K(exc);
        }
        this.A08.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XA != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.BL> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    @Override // com.facebook.ads.redexgen.X.B1
    public final void AE4(XB<T> xb) {
        this.A08.add(xb);
        if (this.A08.size() == 1) {
            xb.A0I();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BJ != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XA != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.BL> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    @Override // com.facebook.ads.redexgen.X.BK
    public final void AEU(BJ<T> bj) {
        if (bj instanceof X9) {
            return;
        }
        XB<T> xb = (XB) bj;
        if (xb.A0L()) {
            this.A09.remove(xb);
            if (this.A08.size() > 1 && this.A08.get(0) == xb) {
                List<XB<T>> list = this.A08;
                if (A0E[7].length() == 0) {
                    throw new RuntimeException();
                }
                String[] strArr = A0E;
                strArr[1] = "8HEKS9j6P5APhESSR";
                strArr[3] = "SFo7ZRHt72jFDiQQTk8v57UjUPr";
                list.get(1).A0I();
            }
            this.A08.remove(xb);
        }
    }
}
