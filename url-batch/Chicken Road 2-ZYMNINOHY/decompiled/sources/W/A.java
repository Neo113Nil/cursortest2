package W;

import a0.C0130F;
import a0.C0146l;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final int f3237a;

    /* renamed from: b, reason: collision with root package name */
    public int f3238b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3239c;

    /* renamed from: d, reason: collision with root package name */
    public long f3240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ B f3241e;

    public A(B b4, int i4) {
        this.f3241e = b4;
        this.f3237a = i4;
    }

    public final void a() {
        B b4 = this.f3241e;
        F f4 = b4.f3247f;
        C0130F c0130f = b4.f3242a;
        c0130f.L();
        int i4 = c0130f.f3886i0.n;
        if (!c0130f.t() || c0130f.u() == 1 || c0130f.u() == 4 || i4 == 0 || i4 == 1) {
            if (this.f3239c) {
                f4.d(4);
            }
            this.f3239c = false;
            return;
        }
        b4.f3245d.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f3239c;
        int i5 = this.f3237a;
        if (z && this.f3238b == i4) {
            if (elapsedRealtime - this.f3240d >= i5) {
                b4.f3244c.f3838a.G(new C0146l(2, new C(4, i5), 1003));
                return;
            }
            return;
        }
        this.f3239c = true;
        this.f3240d = elapsedRealtime;
        this.f3238b = i4;
        f4.d(4);
        f4.f3257a.sendEmptyMessageDelayed(4, i5);
    }
}
