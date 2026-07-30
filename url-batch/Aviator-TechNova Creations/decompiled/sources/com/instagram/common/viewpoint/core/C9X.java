package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.9X, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9X extends AbstractC1841ox implements InterfaceC1750nQ {
    public static byte[] A0n;
    public static String[] A0o = {"elvUyEpYiUQqaqvwUQo90L33x5mfGGF5", "x3rc7jsIv6nSbJc9JPlcAze5yGxzQZsd", "UU9CG9klJf", "SZBoHO9Iw1qJ", "kHgqOkYqcJ", "2J3DKpzV", "imAdJlgwdHrtl5IWv7XQyaTS97", "KGY40HmMWVqKFUFEVN2bB10ght87eGPu"};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public C1842oy A09;
    public C1825og A0A;
    public C1825og A0B;
    public C1825og A0C;
    public C1820ob A0D;
    public C1818oZ A0E;
    public C1789o4 A0F;
    public C1785o0 A0G;
    public C4N A0H;
    public C9Y A0I;
    public C02236x A0J;
    public C7I A0K;
    public CL A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final C1818oZ A0T;
    public final long A0U;
    public final long A0V;
    public final long A0W;
    public final Handler A0X;
    public final Handler A0Y;
    public final Looper A0Z;
    public final InterfaceC01212z A0a;
    public final C1807oN A0b;
    public final C3T A0c;
    public final C3W A0d;
    public final C1748nO A0e;
    public final C9W A0f;
    public final InterfaceC1739nF A0g;
    public final EK A0h;
    public final EL A0i;
    public final CopyOnWriteArraySet<InterfaceC01945u> A0j;
    public final CopyOnWriteArraySet<InterfaceC01142s> A0k;
    public final boolean A0l;
    public final InterfaceC1746nM[] A0m;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0n, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0n = new byte[]{102, Ascii.GS, 74, 119, 96, 95, 99, 110, 118, 106, 125, 70, 98, Byte.MAX_VALUE, 99, 0, Base64.padSymbol, 42, Ascii.NAK, 41, 36, 60, 32, 55, 9, 44, 39, 106, 119, 107, 125, 107, 116, 70, 97, 102, 123, 47, 71, 123, 118, 110, 114, 101, 55, 126, 100, 55, 118, 116, 116, 114, 100, 100, 114, 115, 55, 120, 121, 55, 99, Byte.MAX_VALUE, 114, 55, 96, 101, 120, 121, 112, 55, 99, Byte.MAX_VALUE, 101, 114, 118, 115, 57, Ascii.GS, 84, 98, 101, 101, 114, 121, 99, 55, 99, Byte.MAX_VALUE, 101, 114, 118, 115, 45, 55, 48, 50, 100, 48, Ascii.GS, 82, 111, 103, 114, 116, 99, 114, 115, 55, 99, Byte.MAX_VALUE, 101, 114, 118, 115, 45, 55, 48, 50, 100, 48, Ascii.GS, 68, 114, 114, 55, Byte.MAX_VALUE, 99, 99, 103, 100, 45, 56, 56, 114, 111, 120, 103, 123, 118, 110, 114, 101, 57, 115, 114, 97, 56, 126, 100, 100, 98, 114, 100, 56, 103, 123, 118, 110, 114, 101, 58, 118, 116, 116, 114, 100, 100, 114, 115, 58, 120, 121, 58, 96, 101, 120, 121, 112, 58, 99, Byte.MAX_VALUE, 101, 114, 118, 115, Ascii.DC4, 35, 42, 35, 39, 53, 35, 102, 122, 86, 43, 80, 99, 98, 92, 96, 109, 117, 105, 126, 95, 120, 109, 120, 105, 79, 100, 109, 98, 107, 105, 104, 93, 75, 75, 69, 122, 65, Ascii.SO, 71, 73, 64, 65, 92, 75, 74, Ascii.SO, 76, 75, 77, 79, 91, 93, 75, Ascii.SO, 79, 64, Ascii.SO, 79, 74, Ascii.SO, 71, 93, Ascii.SO, 94, 66, 79, 87, 71, 64, 73};
    }

    static {
        A06();
    }

    public C9X(InterfaceC1746nM[] interfaceC1746nMArr, EK ek, C6S c6s, EU eu, C3T c3t) {
        this(interfaceC1746nMArr, ek, c6s, eu, c3t, false, false, false, false, false, false, 0L, false, 0, false, false, false, false, false, false, false, null);
    }

    public C9X(@MetaExoPlayerCustomization("qe_android_video_exoplayer2.update_loading_priority_exo2 is consistently false. We do not need to port this in the upgrade") InterfaceC1746nM[] interfaceC1746nMArr, @MetaExoPlayerCustomization("Introduced in D13513334 and also used in loop playing for IG: D38285740") EK ek, @MetaExoPlayerCustomization("Currently used to load chunks while seeking on pause D13827150") C6S c6s, @MetaExoPlayerCustomization("D40987428 Brought in for clippingmediasource") EU eu, @MetaExoPlayerCustomization("D45597293 for Oculus - allowing the start renderer offset to not be 0; Eventually changed in Exo: https://github.com/google/ExoPlayer/commit/9f352434c72da527d1fa7963447c3cf680db884f") C3T c3t, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, long j, boolean z7, int i, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, InterfaceC01212z interfaceC01212z) {
        InterfaceC01212z interfaceC01212z2 = interfaceC01212z;
        Log.i(A04(2, 13, 30), A04(33, 5, 30) + Integer.toHexString(System.identityHashCode(this)) + A04(0, 2, 87) + A04(15, 18, 84) + A04(Opcodes.MONITORENTER, 3, 26) + AbstractC01484a.A04 + A04(Opcodes.INSTANCEOF, 1, 54));
        this.A0d = new C3W();
        try {
            this.A0M = z13;
            C3M.A08(interfaceC1746nMArr.length > 0);
            this.A0m = (InterfaceC1746nM[]) C3M.A01(interfaceC1746nMArr);
            this.A0h = (EK) C3M.A01(ek);
            this.A0Q = false;
            this.A00 = 1.0f;
            this.A05 = 0;
            this.A0A = C1825og.A0Z;
            this.A0B = C1825og.A0Z;
            this.A0C = C1825og.A0Z;
            this.A0S = false;
            this.A0V = 0L;
            this.A09 = C1842oy.A07;
            this.A0W = 0L;
            this.A0k = new CopyOnWriteArraySet<>();
            this.A0U = 0L;
            InterfaceC1739nF analyticsCollector = InterfaceC1739nF.A00;
            this.A0g = analyticsCollector;
            this.A0K = C7I.A03;
            this.A06 = 1;
            this.A0e = new C1748nO();
            this.A0i = new EL(new C7G[interfaceC1746nMArr.length], new InterfaceC1646lj[interfaceC1746nMArr.length], C1791o6.A03, null);
            this.A0b = new C1807oN();
            this.A0T = new C01092n().A03(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).A01(29, ek.A0Y()).A04();
            this.A0E = new C01092n().A02(this.A0T).A00(4).A00(10).A04();
            this.A0G = C1785o0.A03;
            this.A0D = C1820ob.A06;
            this.A0Z = Looper.myLooper();
            final Looper myLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
            this.A0X = new Handler(myLooper) { // from class: com.facebook.ads.redexgen.X.60
                @Override // android.os.Handler
                public final void handleMessage(Message msg) {
                    if (AbstractC0838Vl.A02(this)) {
                        return;
                    }
                    try {
                        C9X.this.A0N(msg);
                    } catch (Throwable th) {
                        AbstractC0838Vl.A00(th, this);
                    }
                }
            };
            this.A0c = c3t;
            this.A0a = interfaceC01212z2 == null ? this : interfaceC01212z2;
            this.A0J = new C02236x(Timeline.A02, 0L, C1673mA.A06, this.A0i);
            this.A0f = new C9W(interfaceC1746nMArr, ek, this.A0i, c6s, eu, this.A0Q, this.A05, this.A0S, this.A0X, c3t, z, z2, z3, z4, z5, z6, j, z7, i, z8, z9, z10, z11, z12, z14, C02387m.A03);
            this.A0F = C1789o4.A06;
            this.A0H = C4N.A03;
            this.A0Y = new Handler(this.A0f.A1B());
            this.A0j = new CopyOnWriteArraySet<>();
        } finally {
            this.A0d.A04();
        }
    }

    private long A00(long j) {
        long A01 = AbstractC00941w.A01(j);
        if (!this.A0J.A05.A00()) {
            this.A0J.A03.A0J(this.A0J.A05.A04, this.A0b);
            long positionMs = this.A0b.A0B();
            return A01 + positionMs;
        }
        return A01;
    }

    private long A01(Timeline timeline, C1683mL c1683mL, long j) {
        timeline.A0J(c1683mL.A04, this.A0b);
        return j + this.A0b.A0C();
    }

    private C02236x A02(boolean z, boolean z2, int i) {
        EL el;
        if (z) {
            this.A02 = 0;
            this.A01 = 0;
            this.A08 = 0L;
            this.A07 = 0L;
        } else {
            this.A02 = A7Z();
            this.A01 = A7U();
            this.A08 = A7W();
            this.A07 = A0J();
        }
        Timeline timeline = z2 ? Timeline.A02 : this.A0J.A03;
        C1683mL c1683mL = this.A0J.A05;
        long j = this.A0J.A02;
        long j2 = this.A0J.A01;
        C1673mA c1673mA = z2 ? C1673mA.A06 : this.A0J.A06;
        if (z2) {
            el = this.A0i;
        } else {
            C02236x c02236x = this.A0J;
            String[] strArr = A0o;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0o;
            strArr2[3] = "Omd19LzmWdt3";
            strArr2[5] = "slTdP4Xe";
            el = c02236x.A07;
        }
        return new C02236x(timeline, c1683mL, j, j2, i, false, c1673mA, el, this.A0J.A05, this.A0J.A02, 0L, this.A0J.A02);
    }

    private AnonymousClass71 A03(AnonymousClass70 anonymousClass70) {
        int A7Z = A7Z();
        C9W c9w = this.A0f;
        Timeline timeline = this.A0J.A03;
        if (A7Z == -1) {
            A7Z = 0;
        }
        return new AnonymousClass71(c9w, anonymousClass70, timeline, A7Z, this.A0c, this.A0f.A1B());
    }

    private void A05() {
        if (!this.A0M) {
            return;
        }
        this.A0d.A01();
        if (Thread.currentThread() != A0K().getThread()) {
            String A0n2 = AbstractC01484a.A0n(A04(38, Opcodes.I2S, 6), Thread.currentThread().getName(), A0K().getThread().getName());
            if (!this.A0l) {
                Log.w(A04(2, 13, 30), A0n2, this.A0N ? null : new IllegalStateException());
                if (A0o[6].length() == 12) {
                    throw new RuntimeException();
                }
                A0o[6] = "OHv4LuNWT";
                this.A0N = true;
                return;
            }
            throw new IllegalStateException(A0n2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        if (r5 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A07(C02236x c02236x, int i, boolean z, int i2) {
        int i3;
        C02236x c02236x2 = c02236x;
        this.A03 -= i;
        if (this.A03 == 0) {
            if (c02236x2.A02 == -9223372036854775807L) {
                c02236x2 = c02236x2.A06(c02236x2.A05, 0L, c02236x2.A01, c02236x2.A0D);
            }
            C02236x playbackInfo = this.A0J;
            if (playbackInfo.A03.A0N()) {
                boolean z2 = this.A0O;
                String[] strArr = A0o;
                if (strArr[3].length() == strArr[5].length()) {
                    throw new RuntimeException();
                }
                A0o[6] = "E7I7Mej0S3DTzUCwep";
            }
            if (c02236x2.A03.A0N()) {
                this.A01 = 0;
                this.A02 = 0;
                this.A08 = 0L;
                this.A07 = 0L;
            }
            if (this.A0O) {
                i3 = 0;
            } else {
                i3 = 2;
            }
            boolean z3 = this.A0P;
            this.A0O = false;
            this.A0P = false;
            A08(c02236x2, z, i2, i3, z3);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:23:0x009b */
    /* JADX WARN: Incorrect condition in loop: B:29:0x00b8 */
    /* JADX WARN: Incorrect condition in loop: B:47:0x0121 */
    /* JADX WARN: Incorrect condition in loop: B:54:0x0144 */
    /* JADX WARN: Incorrect condition in loop: B:61:0x0058 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A08(C02236x c02236x, boolean z, int i, int i2, boolean z2) {
        Iterator<InterfaceC01142s> it;
        boolean isLoadingChanged = this.A0J.A03 != c02236x.A03;
        int i3 = this.A0J.A00;
        String[] strArr = A0o;
        if (strArr[2].length() == strArr[4].length()) {
            String[] strArr2 = A0o;
            strArr2[7] = "RJsywmu9iXbSHAOSoooup4iB6ctJ9GEd";
            strArr2[0] = "je0JKUsqzBp1pj8TVGEWBsFZVePcLGnq";
            boolean z3 = i3 != c02236x.A00;
            boolean playbackStateChanged = this.A0J.A0A;
            boolean timelineChanged = c02236x.A0A;
            boolean z4 = playbackStateChanged != timelineChanged;
            boolean z5 = this.A0J.A07 != c02236x.A07;
            this.A0J = c02236x;
            if (isLoadingChanged || i2 == 0) {
                Iterator<InterfaceC01142s> it2 = this.A0k.iterator();
                while (timelineChanged) {
                    InterfaceC01142s next = it2.next();
                    Timeline timeline = this.A0J.A03;
                    String[] strArr3 = A0o;
                    if (strArr3[7].charAt(29) != strArr3[0].charAt(29)) {
                        throw new RuntimeException();
                    }
                    A0o[6] = "RAQE2IWZazAhX";
                    next.AFQ(timeline, i2);
                }
            }
            if (z) {
                Iterator<InterfaceC01142s> it3 = this.A0k.iterator();
                while (timelineChanged) {
                    it3.next();
                }
            }
            if (z5) {
                this.A0h.A0c(this.A0J.A07.A02);
                Iterator<InterfaceC01142s> it4 = this.A0k.iterator();
                while (timelineChanged) {
                    it4.next().AFU(this.A0J.A07.A01);
                }
            }
            if (z4) {
                Iterator<InterfaceC01142s> it5 = this.A0k.iterator();
                while (true) {
                    boolean hasNext = it5.hasNext();
                    String[] strArr4 = A0o;
                    if (strArr4[2].length() == strArr4[4].length()) {
                        A0o[6] = "XRa";
                        if (!hasNext) {
                            break;
                        } else {
                            it5.next();
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z3) {
                CopyOnWriteArraySet<InterfaceC01142s> copyOnWriteArraySet = this.A0k;
                if (A0o[1].charAt(28) != 'y') {
                    String[] strArr5 = A0o;
                    strArr5[3] = "HK22odgNy2pi";
                    strArr5[5] = "HFqBrVui";
                    it = copyOnWriteArraySet.iterator();
                } else {
                    it = copyOnWriteArraySet.iterator();
                }
                while (playbackStateChanged) {
                    InterfaceC01142s next2 = it.next();
                    boolean trackSelectorResultChanged = this.A0R;
                    next2.AEf(trackSelectorResultChanged, this.A0J.A00);
                }
            }
            if (z2) {
                Iterator<InterfaceC01142s> it6 = this.A0k.iterator();
                while (timelineChanged) {
                    it6.next().AFB();
                }
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    @MetaExoPlayerCustomization("D31846300; Custom MediaSessionEventListener")
    private final void A09(boolean z, boolean z2) {
        if (this.A0Q != z) {
            this.A0Q = z;
            this.A04++;
            this.A0f.A1G(z);
            C02236x c02236x = this.A0J;
            if (!z) {
                this.A0R = z;
                Iterator<InterfaceC01142s> it = this.A0k.iterator();
                while (it.hasNext()) {
                    InterfaceC01142s next = it.next();
                    if (0 != 0) {
                        throw new NullPointerException(A04(Opcodes.MULTIANEWARRAY, 20, 29));
                    }
                    next.AEf(z, c02236x.A00);
                }
            }
        }
    }

    private boolean A0A() {
        return this.A0J.A03.A0N() || this.A03 > 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1841ox
    public final void A0H(int i, long j) {
        long A00;
        Timeline timeline = this.A0J.A03;
        if (i >= 0) {
            boolean A0N = timeline.A0N();
            if (A0o[6].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0o;
            strArr[3] = "u5DgO7GwYyET";
            strArr[5] = "hfn3fs8A";
            if (A0N || i < timeline.A07()) {
                this.A0P = true;
                this.A03++;
                if (AAU()) {
                    Log.w(A04(2, 13, 30), A04(217, 39, 63));
                    this.A0X.obtainMessage(0, 1, -1, this.A0J).sendToTarget();
                    return;
                }
                this.A02 = i;
                if (timeline.A0N()) {
                    this.A08 = j == -9223372036854775807L ? 0L : j;
                    this.A01 = 0;
                } else {
                    if (j == -9223372036854775807L) {
                        A00 = timeline.A0K(i, super.A00).A05();
                    } else {
                        A00 = AbstractC00941w.A00(j);
                    }
                    Pair<Object, Long> A0D = timeline.A0D(super.A00, this.A0b, i, A00);
                    this.A08 = AbstractC00941w.A01(A00);
                    this.A01 = timeline.A0A(A0D.first);
                }
                this.A0f.A1D(timeline, i, AbstractC00941w.A00(j));
                Iterator<InterfaceC01142s> it = this.A0k.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                return;
            }
        }
        throw new C2E(timeline, i, j);
    }

    public final long A0I() {
        if (A0A()) {
            return this.A08;
        }
        if (this.A0J.A04.A03 != this.A0J.A05.A03) {
            return this.A0J.A03.A0K(A7Z(), super.A00).A06();
        }
        long j = this.A0J.A0B;
        if (this.A0J.A04.A00()) {
            C1807oN A0J = this.A0J.A03.A0J(this.A0J.A04.A04, this.A0b);
            j = A0J.A0D(this.A0J.A04.A00);
            if (j == Long.MIN_VALUE) {
                j = A0J.A01;
            }
        }
        long contentBufferedPositionUs = A01(this.A0J.A03, this.A0J.A04, j);
        return AbstractC01484a.A0P(contentBufferedPositionUs);
    }

    public final long A0J() {
        if (A0A()) {
            long j = this.A07;
            String[] strArr = A0o;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            A0o[1] = "SWSNQbytnn5JxmoGO3rxXNMtbmar9O4q";
            return j;
        }
        C02236x c02236x = this.A0J;
        if (A0o[1].charAt(28) == 'y') {
            throw new RuntimeException();
        }
        A0o[1] = "VYQpOR71WpATH6H66c6IUhHHWo1qZbHI";
        return AbstractC00941w.A01(c02236x.A0C);
    }

    public final Looper A0K() {
        return this.A0Z;
    }

    public final AnonymousClass71 A0L(AnonymousClass70 anonymousClass70) {
        A05();
        return A03(anonymousClass70);
    }

    public final void A0M() {
        StringBuilder append = new StringBuilder().append(A04(Opcodes.INVOKEINTERFACE, 8, 87)).append(Integer.toHexString(System.identityHashCode(this))).append(A04(0, 2, 87)).append(A04(15, 18, 84));
        String A04 = A04(Opcodes.MONITORENTER, 3, 26);
        Log.i(A04(2, 13, 30), append.append(A04).append(AbstractC01484a.A04).append(A04).append(C2T.A00()).append(A04(Opcodes.INSTANCEOF, 1, 54)).toString());
        this.A0L = null;
        this.A0f.A1C();
        this.A0X.removeCallbacksAndMessages(null);
        this.A0J = A02(false, false, 1);
        this.A0G = C1785o0.A03;
    }

    public final void A0N(Message message) {
        switch (message.what) {
            case 0:
                A07((C02236x) message.obj, message.arg1, message.arg2 != -1, message.arg2);
                return;
            case 1:
                C1820ob c1820ob = (C1820ob) message.obj;
                C1820ob c1820ob2 = this.A0D;
                String[] strArr = A0o;
                if (strArr[2].length() == strArr[4].length()) {
                    String[] strArr2 = A0o;
                    strArr2[2] = "M5Fz4bo4aU";
                    strArr2[4] = "jAP48pK2xI";
                    if (!c1820ob2.equals(c1820ob)) {
                        this.A0D = c1820ob;
                        Iterator<InterfaceC01142s> it = this.A0k.iterator();
                        while (it.hasNext()) {
                            it.next().AEb(c1820ob);
                        }
                        return;
                    }
                    return;
                }
                break;
            case 2:
                C9Y c9y = (C9Y) message.obj;
                this.A0I = c9y;
                CopyOnWriteArraySet<InterfaceC01142s> copyOnWriteArraySet = this.A0k;
                String[] strArr3 = A0o;
                if (strArr3[7].charAt(29) != strArr3[0].charAt(29)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0o;
                strArr4[3] = "qauhWK691fBn";
                strArr4[5] = "FsOQ1ovS";
                Iterator<InterfaceC01142s> it2 = copyOnWriteArraySet.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    String[] strArr5 = A0o;
                    if (strArr5[3].length() != strArr5[5].length()) {
                        A0o[6] = "DbAY1NxOkLRBmNTAZlCZyxXxDbYRxJk";
                        if (!hasNext) {
                            return;
                        }
                    } else if (!hasNext) {
                        return;
                    }
                    it2.next().AEd(c9y);
                }
            case 3:
                this.A04--;
                if (this.A04 == 0) {
                    this.A0R = ((Boolean) message.obj).booleanValue();
                    CopyOnWriteArraySet<InterfaceC01142s> copyOnWriteArraySet2 = this.A0k;
                    if (A0o[1].charAt(28) == 'y') {
                        throw new RuntimeException();
                    }
                    String[] strArr6 = A0o;
                    strArr6[3] = "yizDUJeCRugc";
                    strArr6[5] = "UffiDbl9";
                    Iterator<InterfaceC01142s> it3 = copyOnWriteArraySet2.iterator();
                    while (it3.hasNext()) {
                        InterfaceC01142s next = it3.next();
                        if (this.A0R) {
                            next.AEf(this.A0R, this.A0J.A00);
                        }
                    }
                    return;
                }
                return;
            case 4:
                Iterator<InterfaceC01142s> it4 = this.A0k.iterator();
                while (it4.hasNext()) {
                    it4.next();
                }
                return;
            case 5:
                CopyOnWriteArraySet<InterfaceC01142s> copyOnWriteArraySet3 = this.A0k;
                String[] strArr7 = A0o;
                if (strArr7[7].charAt(29) == strArr7[0].charAt(29)) {
                    String[] strArr8 = A0o;
                    strArr8[3] = "QQxFLYRHq8rv";
                    strArr8[5] = "zDzShVZM";
                    Iterator<InterfaceC01142s> it5 = copyOnWriteArraySet3.iterator();
                    while (it5.hasNext()) {
                        it5.next();
                    }
                    return;
                }
                break;
            default:
                throw new IllegalStateException();
        }
        throw new RuntimeException();
    }

    public final void A0O(InterfaceC01142s interfaceC01142s) {
        this.A0k.add(interfaceC01142s);
    }

    public final void A0P(CL cl, boolean z, boolean z2) {
        this.A0I = null;
        this.A0L = cl;
        C02236x A02 = A02(z, z2, 2);
        this.A0O = true;
        this.A03++;
        this.A0f.A1F(cl, z, z2);
        A08(A02, false, 4, 1, false);
    }

    public final void A0Q(boolean z) {
        A09(z, false);
    }

    public final boolean A0R() {
        return this.A0Q;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01212z
    public final long A6z() {
        if (AAU()) {
            if (this.A0J.A04.equals(this.A0J.A05)) {
                return AbstractC00941w.A01(this.A0J.A0B);
            }
            return A7k();
        }
        return A0I();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01212z
    public final long A7L() {
        if (AAU()) {
            this.A0J.A03.A0J(this.A0J.A05.A04, this.A0b);
            return this.A0b.A0B() + AbstractC00941w.A01(this.A0J.A01);
        }
        return A7W();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01212z
    public final int A7Q() {
        if (AAU()) {
            return this.A0J.A05.A00;
        }
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01212z
    public final int A7R() {
        if (AAU()) {
            return this.A0J.A05.A01;
        }
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01212z
    @MetaExoPlayerCustomization("getCurrentWindowIndex needs to be upgraded to getCurrentWindowIndexInternal")
    public final int A7T() {
        A05();
        int A7Z = A7Z();
        if (A7Z == -1) {
            return 0;
        }
        return A7Z;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01212z
    public final int A7U() {
        if (A0A()) {
            return this.A01;
        }
        Timeline timeline = this.A0J.A03;
        C1683mL c1683mL = this.A0J.A05;
        String[] strArr = A0o;
        if (strArr[3].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A0o[1] = "6o1scJ9TwXJl7WSt7vZ9WMBcl2tfzHGN";
        return timeline.A0A(c1683mL.A04);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01212z
    public final long A7W() {
        if (A0A()) {
            return this.A08;
        }
        if (this.A0J.A05.A00()) {
            return AbstractC00941w.A01(this.A0J.A0C);
        }
        return A00(this.A0J.A0C);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01212z
    public final Timeline A7Y() {
        return this.A0J.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01212z
    public final int A7Z() {
        if (A0A()) {
            int i = this.A02;
            String[] strArr = A0o;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0o;
            strArr2[3] = "0i1iYNlUg7j9";
            strArr2[5] = "Koyujpdg";
            return i;
        }
        return this.A0J.A03.A0J(this.A0J.A05.A04, this.A0b).A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01212z
    public final long A7k() {
        Timeline timeline = this.A0J.A03;
        if (timeline.A0N()) {
            return -9223372036854775807L;
        }
        if (AAU()) {
            C1683mL c1683mL = this.A0J.A05;
            timeline.A0J(c1683mL.A04, this.A0b);
            return AbstractC00941w.A01(this.A0b.A0E(c1683mL.A00, c1683mL.A01));
        }
        return timeline.A0K(A7Z(), super.A00).A06();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01212z
    public final long A9B() {
        return Math.max(0L, AbstractC00941w.A01(this.A0J.A0D));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01212z
    public final boolean AAU() {
        return !A0A() && this.A0J.A05.A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01212z
    public final void AJV(boolean z) {
        if (z) {
            this.A0I = null;
            this.A0L = null;
        }
        C02236x A02 = A02(z, z, 1);
        this.A03++;
        this.A0f.A1H(z);
        A08(A02, false, 4, 1, false);
        this.A0G = new C1785o0(MetaExoPlayerCustomizedCollections.A01(), A02.A0C);
    }
}
