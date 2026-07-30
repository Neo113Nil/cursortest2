package com.instagram.common.viewpoint.core;

import android.media.MediaCodec;
import android.os.SystemClock;
import android.util.Log;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: assets/audience_network/classes2.dex */
public class B6 {
    public static byte[] A03;
    public boolean A00 = false;
    public final ConcurrentLinkedQueue<B4> A01 = new ConcurrentLinkedQueue<>();
    public final /* synthetic */ B7 A02;

    static {
        A05();
    }

    public static String A04(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 52);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-89, -38, -59, -57, -46, -42, -53, -47, -48, -126, -39, -54, -57, -48, -126, -42, -44, -37, -53, -48, -55, -126, -42, -47, -126, -53, -48, -43, -42, -61, -48, -42, -53, -61, -42, -57, -126, -121, -43, -100, -126, -121, -43, -72, -48, -49, -44, -52, -82, -38, -49, -48, -50, -69, -38, -38, -41, -70, -37, -33, -44, -40, -44, -27, -48, -49, -59, -46, -46, -49, -46, -115, -41, -56, -55, -52, -59, -115, -46, -59, -52, -59, -63, -45, -59, -115, -61, -49, -60, -59, -61, -115, -58, -46, -49, -51, -115, -45, -59, -44, -115, -58, -55, -50, -63, -52, -52, -39, -102, c.f16474a, -123, -45, -40, -27, -27, -30, -27, -96, -22, -37, -36, -33, -40, -96, -27, -40, -33, -40, -44, -26, -40, -96, -42, -30, -41, -40, -42, -96, -39, -27, -30, -32, -96, -26, -40, -25, -83, -109, -104, -26, -34, -15, -24, -23, -27, -38, -14, -34, -21, -85, -89, -38, -17, -86, -89, -20, -21, -36, -89, -67, -38, -17, -86, -35, -58, -34, -35, -30, -38, -68, -24, -35, -34, -36, -70, -35, -38, -23, -19, -34, -21};
    }

    public B6(B7 b72) {
        this.A02 = b72;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public B0 A02(boolean z8, C1995jQ c1995jQ, EnumC1992jL enumC1992jL, String str) throws MediaCodecInitializationException {
        Set<B0> set;
        if (this.A02.A0I(z8, c1995jQ) && B7.A0G(str, c1995jQ)) {
            synchronized (this.A02.A04) {
                set = this.A02.A04.get(str);
            }
            if (set != null) {
                synchronized (set) {
                    if (!set.isEmpty()) {
                        B7 b72 = this.A02;
                        b72.A00--;
                        Iterator<B0> it = set.iterator();
                        B0 ret = it.next();
                        it.remove();
                        this.A02.A03().A0A(z8, str, enumC1992jL, ret.hashCode());
                        return ret;
                    }
                }
            }
        }
        try {
            C1990jJ A05 = this.A02.A03().A05(z8, str, enumC1992jL);
            B0 A032 = A03(z8, str);
            this.A02.A03().A06(A05, A032.hashCode());
            return A032;
        } catch (Exception e6) {
            throw new MediaCodecInitializationException(str, e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public B0 A03(boolean z8, String str) throws Exception {
        String A04 = A04(150, 41, 69);
        if (z8 && B7.A0E(str)) {
            try {
                return (B0) Class.forName(A04).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e6) {
                Log.w(A04(43, 23, 55), String.format(A04(0, 43, 46), A04, e6.getMessage()));
            }
        }
        return new C2264o6(MediaCodec.createByCodecName(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public void A0B(EnumC1992jL enumC1992jL) {
        String A04;
        String format;
        B7 b72;
        Set<B0> set;
        Iterator<B4> it = this.A01.iterator();
        while (it.hasNext()) {
            B4 next = it.next();
            try {
                try {
                    if (!next.A05) {
                        A08(next.A01, enumC1992jL, Boolean.valueOf(next.A04), next.A00);
                    } else {
                        try {
                            try {
                                this.A02.A05 = SystemClock.elapsedRealtime();
                                next.A00.reset();
                                b72 = this.A02;
                            } catch (Throwable th) {
                                this.A02.A05 = -1L;
                                throw th;
                            }
                        } catch (IllegalStateException unused) {
                            A09(next.A02, next.A00);
                            b72 = this.A02;
                        }
                        b72.A05 = -1L;
                        if (next.A03) {
                            synchronized (this.A02.A04) {
                                set = this.A02.A04.get(next.A02);
                            }
                            if (set != null) {
                                synchronized (set) {
                                    set.add(next.A00);
                                    this.A02.A00++;
                                }
                            }
                        }
                    }
                } catch (Exception e6) {
                    Log.w(A04(43, 23, 55), String.format(A04(112, 38, 63), e6.getMessage()));
                    try {
                        synchronized (this.A01) {
                            this.A01.remove(next);
                        }
                    } catch (Exception e9) {
                        A04 = A04(43, 23, 55);
                        format = String.format(A04(66, 46, 44), e9.getMessage());
                        Log.w(A04, format);
                    }
                }
                try {
                    synchronized (this.A01) {
                        this.A01.remove(next);
                    }
                } catch (Exception e10) {
                    A04 = A04(43, 23, 55);
                    format = String.format(A04(66, 46, 44), e10.getMessage());
                    Log.w(A04, format);
                }
            } catch (Throwable th2) {
                try {
                } catch (Exception e11) {
                    Log.w(A04(43, 23, 55), String.format(A04(66, 46, 44), e11.getMessage()));
                }
                synchronized (this.A01) {
                    this.A01.remove(next);
                    throw th2;
                }
            }
        }
    }

    private void A08(C1995jQ c1995jQ, EnumC1992jL enumC1992jL, Boolean bool, B0 b02) {
        try {
            if (!c1995jQ.A0R || (!bool.booleanValue() && !c1995jQ.A0Q)) {
                b02.stop();
            }
        } finally {
            this.A02.A03().A08(enumC1992jL, b02.hashCode());
            b02.AHb();
            this.A02.A03().A07(enumC1992jL, b02.hashCode());
        }
    }

    private void A09(String str, B0 b02) {
        Set<B0> set;
        synchronized (this.A02.A04) {
            set = this.A02.A04.get(str);
        }
        if (set != null) {
            synchronized (set) {
                if (set.remove(b02)) {
                    B7 b72 = this.A02;
                    b72.A00--;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A0A(boolean z8, C1995jQ c1995jQ, final EnumC1992jL enumC1992jL, String str, B0 b02) {
        boolean z9 = false;
        if (this.A02.A0I(z8, c1995jQ) && B7.A0G(str, c1995jQ)) {
            if (c1995jQ.A0L && !this.A00) {
                this.A00 = true;
                Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(new Runnable() { // from class: com.facebook.ads.redexgen.X.B5
                    @Override // java.lang.Runnable
                    public final void run() {
                        B6.this.A0B(enumC1992jL);
                    }
                }, 5L, Math.max(1000, c1995jQ.A08), TimeUnit.MILLISECONDS);
            }
            boolean z10 = true;
            Set<B0> set = null;
            if (this.A02.A00 < c1995jQ.A07) {
                synchronized (this.A02.A04) {
                    set = this.A02.A04.get(str);
                    if (set == null) {
                        set = this.A02.A06();
                        this.A02.A04.put(str, set);
                    }
                }
                synchronized (set) {
                    if (set.contains(b02)) {
                        z10 = false;
                    } else if (((z8 && c1995jQ.A0N) || (!z8 && c1995jQ.A0M)) && set.size() < c1995jQ.A06) {
                        z9 = true;
                        z10 = false;
                    }
                }
            }
            if (!z10) {
                long j9 = -1;
                try {
                    try {
                        try {
                            if (!c1995jQ.A0L) {
                                try {
                                    this.A02.A05 = SystemClock.elapsedRealtime();
                                    b02.reset();
                                    if (z9 && set != null) {
                                        synchronized (set) {
                                            set.add(b02);
                                            this.A02.A00++;
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    if (!c1995jQ.A0L) {
                                        this.A02.A05 = j9;
                                    }
                                    throw th;
                                }
                            } else {
                                try {
                                    B4 b42 = new B4(b02, c1995jQ, str, z8, z9, true);
                                    synchronized (this.A01) {
                                        try {
                                            this.A01.add(b42);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            while (true) {
                                                try {
                                                    throw th;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                }
                                            }
                                        }
                                    }
                                } catch (IllegalStateException unused) {
                                    j9 = -1;
                                    A09(str, b02);
                                    if (!c1995jQ.A0L) {
                                        this.A02.A05 = j9;
                                    }
                                    if (c1995jQ.A0L) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    j9 = -1;
                                    if (!c1995jQ.A0L) {
                                    }
                                    throw th;
                                }
                            }
                            if (c1995jQ.A0L) {
                                return;
                            }
                            this.A02.A05 = -1L;
                            return;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } catch (IllegalStateException unused2) {
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        }
        if (c1995jQ.A0L) {
            A08(c1995jQ, enumC1992jL, Boolean.valueOf(z8), b02);
            return;
        }
        B4 b43 = new B4(b02, c1995jQ, str, z8, false, false);
        synchronized (this.A01) {
            this.A01.add(b43);
        }
    }
}
