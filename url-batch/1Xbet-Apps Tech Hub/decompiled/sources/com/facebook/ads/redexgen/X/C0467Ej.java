package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.facebook.ads.redexgen.X.Ej, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0467Ej {
    public static String[] A04 = {"XHo", "ubtbrXFiKU0aMD9WZdFFXMvL5SNCKhBD", "k9cdhOGQS1oEdCdR21VeueSE4nGT", "BZNadIlHUT8LbNbZ8qdMYncW4fXCJJFh", "22DNreJXUwzG5I9t9ymbmjKefjfUTWMr", "OkM0GcBH5aVjMNZagw1JqhxPR8ijdnHI", "ik3Hzc9el9B7KCBCFVHKN4tCPL2D2JGF", "0FgMGgJ2UsG2ZcXwt2m5OtQLezKmVI44"};
    public final int A00;
    public final EW A01;
    public final long A02;
    public final CopyOnWriteArrayList<C0466Ei> A03;

    public C0467Ej() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public C0467Ej(CopyOnWriteArrayList<C0466Ei> copyOnWriteArrayList, int i, EW ew, long j) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = ew;
        this.A02 = j;
    }

    private long A00(long j) {
        long A01 = C9E.A01(j);
        if (A01 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + A01;
    }

    private void A01(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public final C0467Ej A02(int i, EW ew, long j) {
        return new C0467Ej(this.A03, i, ew, j);
    }

    public final void A03() {
        HI.A04(this.A01 != null);
        Iterator<C0466Ei> it = this.A03.iterator();
        while (it.hasNext()) {
            C0466Ei next = it.next();
            InterfaceC0470Em listener = next.A01;
            A01(next.A00, new EZ(this, listener));
        }
    }

    public final void A04() {
        HI.A04(this.A01 != null);
        String[] strArr = A04;
        if (strArr[4].charAt(4) != strArr[1].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "rYA4ryMG3XFm73cnSWA4HWNW3HUxv7KC";
        strArr2[1] = "1YJ2rSWw51hvYcz1kikUBhJeKIWd76IZ";
        Iterator<C0466Ei> it = this.A03.iterator();
        while (it.hasNext()) {
            C0466Ei next = it.next();
            InterfaceC0470Em listener = next.A01;
            A01(next.A00, new RunnableC0458Ea(this, listener));
        }
    }

    public final void A05() {
        HI.A04(this.A01 != null);
        Iterator<C0466Ei> it = this.A03.iterator();
        while (it.hasNext()) {
            C0466Ei next = it.next();
            InterfaceC0470Em listener = next.A01;
            A01(next.A00, new RunnableC0463Ef(this, listener));
        }
    }

    public final void A06(int i, Format format, int i2, Object obj, long j) {
        A0C(new C0469El(1, i, format, i2, obj, A00(j), -9223372036854775807L));
    }

    public final void A07(Handler handler, InterfaceC0470Em interfaceC0470Em) {
        HI.A03((handler == null || interfaceC0470Em == null) ? false : true);
        this.A03.add(new C0466Ei(handler, interfaceC0470Em));
    }

    public final void A08(C0468Ek c0468Ek, C0469El c0469El) {
        Iterator<C0466Ei> it = this.A03.iterator();
        while (it.hasNext()) {
            C0466Ei next = it.next();
            InterfaceC0470Em listener = next.A01;
            A01(next.A00, new RunnableC0461Ed(this, listener, c0468Ek, c0469El));
        }
    }

    public final void A09(C0468Ek c0468Ek, C0469El c0469El) {
        Iterator<C0466Ei> it = this.A03.iterator();
        while (it.hasNext()) {
            C0466Ei next = it.next();
            InterfaceC0470Em listener = next.A01;
            A01(next.A00, new RunnableC0460Ec(this, listener, c0468Ek, c0469El));
        }
    }

    public final void A0A(C0468Ek c0468Ek, C0469El c0469El) {
        Iterator<C0466Ei> it = this.A03.iterator();
        while (it.hasNext()) {
            C0466Ei next = it.next();
            InterfaceC0470Em listener = next.A01;
            A01(next.A00, new RunnableC0459Eb(this, listener, c0468Ek, c0469El));
        }
    }

    public final void A0B(C0468Ek c0468Ek, C0469El c0469El, IOException iOException, boolean z) {
        Iterator<C0466Ei> it = this.A03.iterator();
        while (it.hasNext()) {
            C0466Ei next = it.next();
            A01(next.A00, new RunnableC0462Ee(this, next.A01, c0468Ek, c0469El, iOException, z));
        }
    }

    public final void A0C(C0469El c0469El) {
        Iterator<C0466Ei> it = this.A03.iterator();
        while (it.hasNext()) {
            C0466Ei next = it.next();
            InterfaceC0470Em listener = next.A01;
            A01(next.A00, new RunnableC0465Eh(this, listener, c0469El));
        }
    }

    public final void A0D(InterfaceC0470Em interfaceC0470Em) {
        Iterator<C0466Ei> it = this.A03.iterator();
        while (it.hasNext()) {
            C0466Ei listenerAndHandler = it.next();
            if (listenerAndHandler.A01 == interfaceC0470Em) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final void A0E(C0516Gg c0516Gg, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3) {
        A0A(new C0468Ek(c0516Gg, j3, 0L, 0L), new C0469El(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0F(C0516Gg c0516Gg, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        A08(new C0468Ek(c0516Gg, j3, j4, j5), new C0469El(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0G(C0516Gg c0516Gg, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        A09(new C0468Ek(c0516Gg, j3, j4, j5), new C0469El(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0H(C0516Gg c0516Gg, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
        A0B(new C0468Ek(c0516Gg, j3, j4, j5), new C0469El(i, i2, format, i3, obj, A00(j), A00(j2)), iOException, z);
    }
}
