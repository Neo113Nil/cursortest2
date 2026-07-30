package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Handler;
import androidx.work.WorkRequest;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.9A, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9A implements InterfaceC1684mM, GY, InterfaceC0398Eg<C1682mK>, InterfaceC0402Ek, InterfaceC0353Cn {
    public static byte[] A0e;
    public static String[] A0f = {"o2fAJH6DTExx5HfWJCXs", "", "TsjJo55j6Kq128TfeQrvBtnORCvXohBg", "QpymssT", "p1Azi7mByqrjPk9ZTQVOCdIp8WANOiZ", "P8K3es9juVbjT7QsA9zjw4fZ7CWDxkC3", "f2TCNbDOQ", "8xae32DDfRwM"};
    public static final C1836or A0g;
    public static final Map<String, String> A0h;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public InterfaceC1685mN A06;
    public C0348Ci A07;
    public InterfaceC0466Gw A08;
    public IcyHeaders A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public C0347Ch[] A0K;
    public C1676mE[] A0L;
    public final long A0M;
    public final Uri A0N;
    public final Handler A0O;
    public final C3W A0P;
    public final InterfaceC1771nl A0Q;
    public final C9P A0R;
    public final C9U A0S;
    public final CW A0T;
    public final InterfaceC0341Cb A0U;
    public final InterfaceC0346Cg A0V;
    public final EO A0W;
    public final InterfaceC0395Ed A0X;
    public final C1639lc A0Y;
    public final Runnable A0Z;
    public final Runnable A0a;
    public final String A0b;
    public final boolean A0c;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"})
    public final boolean A0d;

    public static String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0e, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 68);
        }
        return new String(copyOfRange);
    }

    public static void A0I() {
        A0e = new byte[]{-76, -81, -55, -33, -109, -77, -53, -38, -57, -86, -57, -38, -57, -29, 6, -8, -5, -4, 9, -47, -25, 9, 6, -2, 9, -4, 10, 10, 0, Ascii.CR, -4, -28, -4, -5, 0, -8, -25, -4, 9, 0, 6, -5, -62, -27, -41, -38, -33, -28, -35, -106, -36, -33, -28, -33, -23, -34, -37, -38, -106, -40, -37, -36, -27, -24, -37, -106, -26, -24, -37, -26, -41, -24, -41, -22, -33, -27, -28, -106, -33, -23, -106, -39, -27, -29, -26, -30, -37, -22, -37, -92, -49, -14, -28, -25, -20, -15, -22, -93, -23, -20, -15, -20, -10, -21, -24, -25, -93, -27, -24, -23, -14, -11, -24, -93, -13, -11, -24, -13, -28, -11, -28, -9, -20, -14, -15, -93, -20, -10, -93, -26, -14, -16, -13, -17, -24, -9, -24, -79, -93, -40, -43, -52, -67, -93, -12, 3, 3, -1, -4, -10, -12, 7, -4, 2, 1, -62, Ascii.VT, -64, -4, -10, Ascii.FF, -6, -12, 10, 47, 54, 45, 45};
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1684mM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long AIP(InterfaceC1646lj[] interfaceC1646ljArr, boolean[] zArr, InterfaceC0357Cr[] interfaceC0357CrArr, boolean[] zArr2, long j) {
        long j2 = j;
        A0E();
        C1673mA c1673mA = this.A07.A00;
        boolean[] zArr3 = this.A07.A01;
        int i = this.A01;
        int i2 = 0;
        while (true) {
            int i3 = 0;
            if (i2 >= interfaceC1646ljArr.length) {
                boolean z = !this.A0J ? j2 == 0 : i != 0;
                for (int i4 = 0; i4 < interfaceC1646ljArr.length; i4++) {
                    InterfaceC0357Cr interfaceC0357Cr = interfaceC0357CrArr[i4];
                    if (A0f[0].length() == 20) {
                        String[] strArr = A0f;
                        strArr[6] = "NEStfGRt7";
                        strArr[7] = "7J9sRP18njyY";
                        if (interfaceC0357Cr == null && interfaceC1646ljArr[i4] != null) {
                            InterfaceC1646lj interfaceC1646lj = interfaceC1646ljArr[i4];
                            C3M.A08(interfaceC1646lj.length() == 1);
                            C3M.A08(interfaceC1646lj.A89(0) == 0);
                            int A04 = c1673mA.A04(interfaceC1646lj.A9D());
                            C3M.A08(!zArr3[A04]);
                            this.A01++;
                            zArr3[A04] = true;
                            interfaceC0357CrArr[i4] = new C1681mJ(this, A04);
                            zArr2[i4] = true;
                            if (!z) {
                                C1676mE c1676mE = this.A0L[A04];
                                z = (c1676mE.A0f(j2, true) || c1676mE.A0O() == 0) ? false : true;
                            }
                        }
                    }
                }
                if (this.A01 == 0) {
                    this.A0F = false;
                    this.A0E = false;
                    if (this.A0Y.A0E()) {
                        C1676mE[] c1676mEArr = this.A0L;
                        int length = c1676mEArr.length;
                        while (i3 < length) {
                            c1676mEArr[i3].A0V();
                            i3++;
                        }
                        this.A0Y.A09();
                    } else {
                        C1676mE[] c1676mEArr2 = this.A0L;
                        int length2 = c1676mEArr2.length;
                        while (i3 < length2) {
                            c1676mEArr2[i3].A0Z();
                            i3++;
                        }
                    }
                } else if (z) {
                    j2 = AIO(j2, false);
                    for (int i5 = 0; i5 < interfaceC0357CrArr.length; i5++) {
                        if (interfaceC0357CrArr[i5] != null) {
                            zArr2[i5] = true;
                        }
                    }
                }
                this.A0J = true;
                return j2;
            }
            if (interfaceC0357CrArr[i2] != null) {
                if (interfaceC1646ljArr[i2] != null) {
                    boolean z2 = zArr[i2];
                    String[] strArr2 = A0f;
                    if (strArr2[2].charAt(7) != strArr2[5].charAt(7)) {
                        break;
                    }
                    A0f[0] = "eW7kSByjGiBvUls6sdXN";
                    if (z2) {
                    }
                }
                int i6 = ((C1681mJ) interfaceC0357CrArr[i2]).A00;
                C3M.A08(zArr3[i6]);
                this.A01--;
                zArr3[i6] = false;
                interfaceC0357CrArr[i2] = null;
            }
            i2++;
        }
    }

    static {
        A0I();
        A0h = A0D();
        A0g = new C2D().A0y(A0B(Opcodes.IF_ICMPLT, 3, 77)).A11(A0B(Opcodes.D2F, 17, 79)).A14();
    }

    public C9A(Uri uri, InterfaceC1771nl interfaceC1771nl, InterfaceC0341Cb interfaceC0341Cb, C9U c9u, C9P c9p, InterfaceC0395Ed interfaceC0395Ed, CW cw, InterfaceC0346Cg interfaceC0346Cg, EO eo, String str, int i, InterfaceExecutorC0417Ez interfaceExecutorC0417Ez) {
        C1639lc c1639lc;
        this.A0N = uri;
        this.A0Q = interfaceC1771nl;
        this.A0S = c9u;
        this.A0R = c9p;
        this.A0X = interfaceC0395Ed;
        this.A0T = cw;
        this.A0V = interfaceC0346Cg;
        this.A0W = eo;
        this.A0b = str;
        this.A0M = i;
        if (interfaceExecutorC0417Ez != null) {
            c1639lc = new C1639lc(interfaceExecutorC0417Ez);
        } else {
            c1639lc = new C1639lc(A0B(13, 29, 83));
        }
        this.A0Y = c1639lc;
        this.A0U = interfaceC0341Cb;
        this.A0P = new C3W();
        this.A0Z = new Runnable() { // from class: com.facebook.ads.redexgen.X.Ce
            @Override // java.lang.Runnable
            public final void run() {
                C9A.this.A0F();
            }
        };
        this.A0a = new Runnable() { // from class: com.facebook.ads.redexgen.X.Cf
            @Override // java.lang.Runnable
            public final void run() {
                C9A.this.A0b();
            }
        };
        this.A0O = AbstractC01484a.A0Y();
        this.A0K = new C0347Ch[0];
        this.A0L = new C1676mE[0];
        this.A05 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        this.A00 = 1;
        this.A0d = MetaExoPlayerUpgradeConfig.A03(EnumC1435i2.A0d) || MetaExoPlayerUpgradeConfig.A03(EnumC1435i2.A0e) || MetaExoPlayerUpgradeConfig.A03(EnumC1435i2.A1f);
        this.A0c = MetaExoPlayerUpgradeConfig.A03(EnumC1435i2.A0g);
    }

    private int A00() {
        int i = 0;
        for (C1676mE c1676mE : this.A0L) {
            int extractedSamplesCount = c1676mE.A0P();
            i += extractedSamplesCount;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A03(boolean z) {
        long j = Long.MIN_VALUE;
        for (int i = 0; i < this.A0L.length; i++) {
            if (!z) {
                Object A01 = C3M.A01(this.A07);
                String[] strArr = A0f;
                if (strArr[6].length() == strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0f;
                strArr2[6] = "FDopTuaFs";
                strArr2[7] = "ze95XzERDUjm";
                if (!((C0348Ci) A01).A01[i]) {
                }
            }
            j = Math.max(j, this.A0L[i].A0T());
        }
        return j;
    }

    private C1676mE A06(C0347Ch c0347Ch) {
        int length = this.A0L.length;
        for (int i = 0; i < length; i++) {
            if (c0347Ch.equals(this.A0K[i])) {
                return this.A0L[i];
            }
        }
        C1676mE A0B = C1676mE.A0B(this.A0W, this.A0S, this.A0R);
        A0B.A0d(this);
        int trackCount = length + 1;
        C0347Ch[] c0347ChArr = (C0347Ch[]) Arrays.copyOf(this.A0K, trackCount);
        c0347ChArr[length] = c0347Ch;
        this.A0K = (C0347Ch[]) AbstractC01484a.A1H(c0347ChArr);
        int trackCount2 = length + 1;
        C1676mE[] c1676mEArr = (C1676mE[]) Arrays.copyOf(this.A0L, trackCount2);
        c1676mEArr[length] = A0B;
        this.A0L = (C1676mE[]) AbstractC01484a.A1H(c1676mEArr);
        return A0B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0398Eg
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final C0399Eh AE0(C1682mK c1682mK, long j, long j2, IOException iOException, int i) {
        C02669b c02669b;
        long j3;
        AnonymousClass56 anonymousClass56;
        long j4;
        C0399Eh c0399Eh;
        long j5;
        c02669b = c1682mK.A08;
        j3 = c1682mK.A05;
        anonymousClass56 = c1682mK.A01;
        CE ce = new CE(j3, anonymousClass56, c02669b.A01(), c02669b.A02(), j, j2, c02669b.A00());
        j4 = c1682mK.A00;
        long A8m = this.A0X.A8m(new C0394Ec(ce, new CG(1, -1, null, 0, null, AbstractC01484a.A0P(j4), AbstractC01484a.A0P(this.A03)), iOException, i));
        if (A8m == -9223372036854775807L) {
            c0399Eh = C1639lc.A06;
        } else {
            int A00 = A00();
            boolean z = A00 > this.A02;
            if (A0U(c1682mK, A00)) {
                c0399Eh = C1639lc.A01(z, A8m);
            } else {
                c0399Eh = C1639lc.A05;
            }
        }
        boolean z2 = !c0399Eh.A02();
        CW cw = this.A0T;
        j5 = c1682mK.A00;
        cw.A07(ce, 1, -1, null, 0, null, j5, this.A03, iOException, z2);
        return c0399Eh;
    }

    public static Map<String, String> A0D() {
        HashMap hashMap = new HashMap();
        hashMap.put(A0B(1, 12, 34), A0B(0, 1, 63));
        Map<String, String> headers = Collections.unmodifiableMap(hashMap);
        return headers;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private void A0E() {
        C3M.A08(this.A0G);
        C3M.A01(this.A07);
        C3M.A01(this.A08);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F() {
        Metadata A05;
        if (this.A0H || this.A0G) {
            return;
        }
        boolean z = this.A0I;
        String[] strArr = A0f;
        if (strArr[1].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[2] = "grMxxjGjFdBhxw9MDZtvFg4OZy35nlzN";
        strArr2[5] = "E38rNlujzeckGRbn7d7aukKxtTtuF9Uw";
        if (!z || this.A08 == null) {
            return;
        }
        for (C1676mE c1676mE : this.A0L) {
            if (c1676mE.A0U() == null) {
                return;
            }
        }
        this.A0P.A02();
        int length = this.A0L.length;
        C1802oH[] c1802oHArr = new C1802oH[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            C1836or c1836or = (C1836or) C3M.A01(this.A0L[i].A0U());
            String str = c1836or.A0W;
            boolean A0C = AbstractC01032h.A0C(str);
            boolean z2 = A0C || AbstractC01032h.A0F(str);
            zArr[i] = z2;
            this.A0A |= z2;
            IcyHeaders icyHeaders = this.A09;
            if (icyHeaders != null) {
                if (A0C || this.A0K[i].A01) {
                    Metadata metadata = c1836or.A0P;
                    if (metadata == null) {
                        A05 = new Metadata(icyHeaders);
                    } else {
                        A05 = metadata.A05(icyHeaders);
                    }
                    C2D A0v = c1836or.A07().A0v(A05);
                    if (A0f[0].length() != 20) {
                        throw new RuntimeException();
                    }
                    String[] strArr3 = A0f;
                    strArr3[2] = "WsODqr3j7Qd6qKAaI5Z8JETVOkriGcMH";
                    strArr3[5] = "rCf1buyjz0YjJBdswvkAeWhqIr4TjJn3";
                    c1836or = A0v.A14();
                }
                if (A0C) {
                    int trackCount = c1836or.A04;
                    if (trackCount == -1) {
                        int trackCount2 = c1836or.A0D;
                        if (trackCount2 == -1) {
                            int trackCount3 = icyHeaders.A00;
                            if (trackCount3 != -1) {
                                C2D A07 = c1836or.A07();
                                int trackCount4 = icyHeaders.A00;
                                c1836or = A07.A0a(trackCount4).A14();
                            }
                        }
                    }
                }
            }
            c1802oHArr[i] = new C1802oH(c1836or);
        }
        this.A07 = new C0348Ci(new C1673mA(c1802oHArr), zArr);
        this.A0G = true;
        ((InterfaceC1685mN) C3M.A01(this.A06)).AEk(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G() {
        this.A0O.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Cd
            @Override // java.lang.Runnable
            public final void run() {
                C9A.this.A0c();
            }
        });
    }

    private void A0H() {
        AnonymousClass56 anonymousClass56;
        long j;
        long j2;
        C1682mK c1682mK = new C1682mK(this, this.A0N, this.A0Q, this.A0U, this, this.A0P);
        if (this.A0G) {
            C3M.A08(A0S());
            if (this.A03 != -9223372036854775807L && this.A05 >= this.A03) {
                this.A0D = true;
                this.A05 = -9223372036854775807L;
                return;
            }
            c1682mK.A04(((InterfaceC0466Gw) C3M.A01(this.A08)).A8t(this.A05).A00.A00, this.A05);
            for (C1676mE c1676mE : this.A0L) {
                c1676mE.A0b(this.A05);
            }
            this.A05 = -9223372036854775807L;
        }
        this.A02 = A00();
        long A08 = this.A0Y.A08(c1682mK, this, this.A0X.A8R(this.A00));
        anonymousClass56 = c1682mK.A01;
        CW cw = this.A0T;
        j = c1682mK.A05;
        CE ce = new CE(j, anonymousClass56, A08);
        j2 = c1682mK.A00;
        cw.A06(ce, 1, -1, null, 0, null, j2, this.A03, 0);
    }

    private final void A0J() throws IOException {
        this.A0Y.A0B(this.A0X.A8R(this.A00));
    }

    private void A0K(int i) {
        A0E();
        boolean[] zArr = this.A07.A03;
        if (!zArr[i]) {
            C1836or A08 = this.A07.A00.A05(i).A08(0);
            this.A0T.A03(AbstractC01032h.A01(A08.A0W), A08, 0, null, this.A04);
            zArr[i] = true;
        }
    }

    private void A0L(int i) {
        A0E();
        boolean[] zArr = this.A07.A02;
        if (this.A0F && zArr[i]) {
            if (this.A0L[i].A0g(false)) {
                return;
            }
            this.A05 = 0L;
            this.A0F = false;
            this.A0E = true;
            this.A04 = 0L;
            this.A02 = 0;
            for (C1676mE c1676mE : this.A0L) {
                c1676mE.A0Z();
            }
            ((InterfaceC1685mN) C3M.A01(this.A06)).ACs(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0398Eg
    /* renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public final void ADz(C1682mK c1682mK, long j, long j2) {
        C02669b c02669b;
        long j3;
        AnonymousClass56 anonymousClass56;
        long j4;
        long largestQueuedTimestampUs;
        if (this.A03 == -9223372036854775807L && this.A08 != null) {
            boolean AAa = this.A08.AAa();
            long A03 = A03(true);
            String[] strArr = A0f;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0f;
            strArr2[6] = "VBgm4XD5c";
            strArr2[7] = "eM9hzsMViOdm";
            if (A03 == Long.MIN_VALUE) {
                largestQueuedTimestampUs = 0;
            } else {
                largestQueuedTimestampUs = WorkRequest.MIN_BACKOFF_MILLIS + A03;
            }
            this.A03 = largestQueuedTimestampUs;
            this.A0V.AFH(this.A03, AAa, this.A0C);
        }
        c02669b = c1682mK.A08;
        j3 = c1682mK.A05;
        anonymousClass56 = c1682mK.A01;
        CE ce = new CE(j3, anonymousClass56, c02669b.A01(), c02669b.A02(), j, j2, c02669b.A00());
        CW cw = this.A0T;
        j4 = c1682mK.A00;
        cw.A08(ce, 1, -1, null, 0, null, j4, this.A03, c1682mK, null);
        this.A0D = true;
        ((InterfaceC1685mN) C3M.A01(this.A06)).ACs(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0398Eg
    /* renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public final void AE3(C1682mK c1682mK, long j, long j2, int i) {
        C02669b dataSource;
        CE ce;
        long j3;
        AnonymousClass56 anonymousClass56;
        long j4;
        long j5;
        AnonymousClass56 anonymousClass562;
        dataSource = c1682mK.A08;
        if (i == 0) {
            j5 = c1682mK.A05;
            anonymousClass562 = c1682mK.A01;
            ce = new CE(j5, anonymousClass562, j);
        } else {
            j3 = c1682mK.A05;
            anonymousClass56 = c1682mK.A01;
            ce = new CE(j3, anonymousClass56, dataSource.A01(), dataSource.A02(), j, j2, dataSource.A00());
        }
        CW cw = this.A0T;
        j4 = c1682mK.A00;
        cw.A06(ce, 1, -1, null, 0, null, j4, this.A03, i);
        String[] strArr = A0f;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[6] = "RSQzFltms";
        strArr2[7] = "MablvJN0SXK9";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0398Eg
    /* renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public final void ADx(C1682mK c1682mK, long j, long j2, boolean z) {
        C02669b dataSource;
        long j3;
        AnonymousClass56 anonymousClass56;
        long j4;
        dataSource = c1682mK.A08;
        j3 = c1682mK.A05;
        anonymousClass56 = c1682mK.A01;
        CE ce = new CE(j3, anonymousClass56, dataSource.A01(), dataSource.A02(), j, j2, dataSource.A00());
        CW cw = this.A0T;
        j4 = c1682mK.A00;
        cw.A05(ce, 1, -1, null, 0, null, j4, this.A03);
        if (!z) {
            for (C1676mE c1676mE : this.A0L) {
                c1676mE.A0Z();
            }
            if (this.A01 > 0) {
                ((InterfaceC1685mN) C3M.A01(this.A06)).ACs(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0R, reason: merged with bridge method [inline-methods] */
    public void A0e(InterfaceC0466Gw interfaceC0466Gw) {
        this.A08 = interfaceC0466Gw;
        this.A03 = interfaceC0466Gw.A7l();
        this.A0C = !this.A0B && interfaceC0466Gw.A7l() == -9223372036854775807L;
        this.A00 = this.A0C ? 7 : 1;
        this.A0V.AFH(this.A03, interfaceC0466Gw.AAa(), this.A0C);
        if (!this.A0G) {
            A0F();
        }
    }

    private boolean A0S() {
        return this.A05 != -9223372036854775807L;
    }

    private boolean A0T() {
        return this.A0E || A0S();
    }

    private boolean A0U(C1682mK c1682mK, int i) {
        if (this.A0B || (this.A08 != null && this.A08.A7l() != -9223372036854775807L)) {
            this.A02 = i;
            return true;
        }
        if (this.A0G && !A0T()) {
            this.A0F = true;
            return false;
        }
        this.A0E = this.A0G;
        this.A04 = 0L;
        this.A02 = 0;
        for (C1676mE c1676mE : this.A0L) {
            c1676mE.A0Z();
        }
        c1682mK.A04(0L, 0L);
        return true;
    }

    private boolean A0V(boolean[] zArr, long j) {
        int length = this.A0L.length;
        for (int i = 0; i < length; i++) {
            if (!this.A0L[i].A0f(j, false) && (zArr[i] || !this.A0A)) {
                return false;
            }
        }
        return true;
    }

    public final int A0X(int i, long j) {
        if (A0T()) {
            return 0;
        }
        A0K(i);
        C1676mE c1676mE = this.A0L[i];
        int A0Q = c1676mE.A0Q(j, this.A0D);
        c1676mE.A0a(A0Q);
        if (A0Q == 0) {
            A0L(i);
        }
        return A0Q;
    }

    public final int A0Y(int i, C6N c6n, C1758nY c1758nY, int i2) {
        if (A0T()) {
            return -3;
        }
        A0K(i);
        int result = this.A0L[i].A0R(c6n, c1758nY, i2, this.A0D);
        if (result == -3) {
            A0L(i);
        }
        return result;
    }

    public final H1 A0Z() {
        return A06(new C0347Ch(0, true));
    }

    public final void A0a() {
        if (this.A0G) {
            for (C1676mE c1676mE : this.A0L) {
                c1676mE.A0X();
            }
        }
        this.A0Y.A0C(this);
        this.A0O.removeCallbacksAndMessages(null);
        this.A06 = null;
        this.A0H = true;
    }

    public final /* synthetic */ void A0b() {
        if (!this.A0H) {
            ((InterfaceC1685mN) C3M.A01(this.A06)).ACs(this);
        }
    }

    public final /* synthetic */ void A0c() {
        this.A0B = true;
    }

    public final void A0d(int i) throws IOException {
        this.A0L[i].A0W();
        A0J();
    }

    public final boolean A0f(int i) {
        return !A0T() && this.A0L[i].A0g(this.A0D);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0361Cv
    @MetaExoPlayerCustomization("Added in D19760981 for cancel request")
    public final void A4k(long j) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1684mM
    public final boolean A54(long j) {
        if (this.A0D || this.A0Y.A0D() || this.A0F) {
            return false;
        }
        if (this.A0G && this.A01 == 0) {
            return false;
        }
        boolean A04 = this.A0P.A04();
        boolean continuedLoading = this.A0Y.A0E();
        if (!continuedLoading) {
            A0H();
            return true;
        }
        return A04;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1684mM
    public final void A5s(long j, boolean z) {
        A0E();
        if (A0S()) {
            return;
        }
        boolean[] zArr = this.A07.A01;
        int length = this.A0L.length;
        for (int i = 0; i < length; i++) {
            C1676mE[] c1676mEArr = this.A0L;
            String[] strArr = A0f;
            String str = strArr[6];
            String str2 = strArr[7];
            int trackCount = str.length();
            if (trackCount == str2.length()) {
                throw new RuntimeException();
            }
            A0f[0] = "xFMIvf7swbs88yH1ASsn";
            c1676mEArr[i].A0c(j, z, zArr[i]);
        }
    }

    @Override // com.instagram.common.viewpoint.core.GY
    public final void A6G() {
        this.A0I = true;
        this.A0O.post(this.A0Z);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1684mM
    public final long A6j(long j, C7I c7i) {
        A0E();
        if (!this.A08.AAa()) {
            return 0L;
        }
        C0465Gv A8t = this.A08.A8t(j);
        long j2 = A8t.A00.A01;
        String[] strArr = A0f;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[2] = "A6SKS5Ejxr3dBguC5asmpR7Eo1U8ekaX";
        strArr2[5] = "H67kjT3j1V6FB1MougrbLEHHMAKkStlF";
        return c7i.A00(j, j2, A8t.A01.A01);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0361Cv
    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Added in D9949576 for unstall buffer")
    public final long A6y(long j) {
        if (this.A0d && !this.A0G) {
            return 0L;
        }
        if (this.A0D) {
            return this.A03 - j;
        }
        return A70() - j;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1684mM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long A70() {
        int length;
        int trackCount;
        A0E();
        if (this.A0D || this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        boolean A0S = A0S();
        String[] strArr = A0f;
        if (strArr[1].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0f[0] = "YocKG9EsUqAPXBELOuFE";
        if (A0S) {
            return this.A05;
        }
        long j = Long.MAX_VALUE;
        if (this.A0A) {
            int length2 = this.A0L.length;
            for (int i = 0; i < length2; i++) {
                if (this.A07.A02[i]) {
                    C0348Ci c0348Ci = this.A07;
                    if (A0f[3].length() == 29) {
                        throw new RuntimeException();
                    }
                    A0f[0] = "CWn0xvSWDOv6yRiyH00v";
                    if (c0348Ci.A01[i]) {
                        C1676mE[] c1676mEArr = this.A0L;
                        String[] strArr2 = A0f;
                        String str = strArr2[2];
                        String str2 = strArr2[5];
                        int charAt = str.charAt(7);
                        int trackCount2 = str2.charAt(7);
                        if (charAt != trackCount2) {
                            if (c1676mEArr[i].A0e()) {
                            }
                            C1676mE[] c1676mEArr2 = this.A0L;
                            String[] strArr3 = A0f;
                            String str3 = strArr3[6];
                            String str4 = strArr3[7];
                            length = str3.length();
                            trackCount = str4.length();
                            if (length == trackCount) {
                                String[] strArr4 = A0f;
                                strArr4[2] = "XlyJfiuja8URoHVDmmAk9tswNdXWeReZ";
                                strArr4[5] = "M3k0l25jfFhaASrq1DtlqcrTUVRM508s";
                                j = Math.min(j, c1676mEArr2[i].A0T());
                            } else {
                                j = Math.min(j, c1676mEArr2[i].A0T());
                            }
                        } else {
                            String[] strArr5 = A0f;
                            strArr5[6] = "r97slta5r";
                            strArr5[7] = "NJT5wUbHJHvk";
                            if (c1676mEArr[i].A0e()) {
                            }
                            C1676mE[] c1676mEArr22 = this.A0L;
                            String[] strArr32 = A0f;
                            String str32 = strArr32[6];
                            String str42 = strArr32[7];
                            length = str32.length();
                            trackCount = str42.length();
                            if (length == trackCount) {
                            }
                        }
                    }
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            j = A03(false);
        }
        if (j == Long.MIN_VALUE) {
            return this.A04;
        }
        return j;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1684mM
    public final long A8T() {
        return A70();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1684mM
    public final C1673mA A9E() {
        A0E();
        return this.A07.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1684mM
    public final void ABt() throws IOException {
        A0J();
        if (this.A0D && !this.A0G) {
            if (this.A0c) {
                throw C01042i.A01(A0B(90, 54, 63) + (this.A0N != null ? this.A0N.toString() : A0B(Opcodes.IF_ICMPLE, 4, Opcodes.LUSHR)), null);
            }
            throw C01042i.A01(A0B(42, 48, 50), null);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0402Ek
    public final void AE4() {
        for (C1676mE c1676mE : this.A0L) {
            c1676mE.A0Y();
        }
        this.A0U.AGr();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0353Cn
    public final void AFb(C1836or c1836or) {
        this.A0O.post(this.A0Z);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1684mM
    public final void AGL(InterfaceC1685mN interfaceC1685mN, long j) {
        this.A06 = interfaceC1685mN;
        this.A0P.A04();
        A0H();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1684mM
    public final long AGg() {
        if (!this.A0E) {
            return -9223372036854775807L;
        }
        boolean z = this.A0D;
        if (A0f[0].length() == 20) {
            String[] strArr = A0f;
            strArr[1] = "";
            strArr[4] = "OLDtf0M6xpFiQAaUF2mFzXoKXa03XjZ";
            if (z || A00() > this.A02) {
                this.A0E = false;
                long j = this.A04;
                if (A0f[0].length() == 20) {
                    String[] strArr2 = A0f;
                    strArr2[6] = "30bUCuPdV";
                    strArr2[7] = "qvk1tPvPLdJz";
                    return j;
                }
            } else {
                return -9223372036854775807L;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1684mM
    public final void AGm(long j) {
    }

    @Override // com.instagram.common.viewpoint.core.GY
    public final void AIN(final InterfaceC0466Gw interfaceC0466Gw) {
        this.A0O.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Cc
            @Override // java.lang.Runnable
            public final void run() {
                C9A.this.A0e(interfaceC0466Gw);
            }
        });
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1684mM
    public final long AIO(@MetaExoPlayerCustomization long j, boolean z) {
        A0E();
        boolean[] zArr = this.A07.A02;
        if (!this.A08.AAa()) {
            j = 0;
        }
        int i = 0;
        this.A0E = false;
        this.A04 = j;
        if (A0S()) {
            this.A05 = j;
            return j;
        }
        if (this.A00 != 7 && A0V(zArr, j)) {
            return j;
        }
        this.A0F = false;
        this.A05 = j;
        this.A0D = false;
        if (this.A0Y.A0E()) {
            C1676mE[] c1676mEArr = this.A0L;
            int length = c1676mEArr.length;
            while (i < length) {
                c1676mEArr[i].A0V();
                String[] strArr = A0f;
                if (strArr[6].length() == strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0f;
                strArr2[2] = "OrOS7Vhjp4VBbz175mMxq2SuFvjpl5bQ";
                strArr2[5] = "EAKZg7yj0ctHJiN4FHg90oFZJxg2ecfG";
                i++;
            }
            this.A0Y.A09();
            return j;
        }
        this.A0Y.A0A();
        C1676mE[] c1676mEArr2 = this.A0L;
        int length2 = c1676mEArr2.length;
        while (i < length2) {
            c1676mEArr2[i].A0Z();
            String[] strArr3 = A0f;
            if (strArr3[2].charAt(7) != strArr3[5].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0f;
            strArr4[6] = "p5drqiHAR";
            strArr4[7] = "h8TdfbRbJweW";
            i++;
        }
        return j;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0361Cv
    @MetaExoPlayerCustomization("Added in D19875605 for error load during pause")
    public final void AIs(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.GY
    public final H1 AJh(int i, int i2) {
        return A06(new C0347Ch(i, false));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0361Cv
    @MetaExoPlayerCustomization("Added in D13267633 for lower priority during pause")
    public final void AJq(byte b) {
    }
}
