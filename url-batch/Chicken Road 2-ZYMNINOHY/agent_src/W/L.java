package W;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class L implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f3280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3281c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f3282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3283e;

    public /* synthetic */ L(Object obj, AtomicBoolean atomicBoolean, boolean z, boolean z4, int i4) {
        this.f3279a = i4;
        this.f3283e = obj;
        this.f3280b = atomicBoolean;
        this.f3281c = z;
        this.f3282d = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3279a) {
            case 0:
                M m4 = (M) this.f3283e;
                m4.getClass();
                this.f3280b.set(false);
                l2.e.i((l2.e) m4.f3289f, this.f3281c, this.f3282d);
                break;
            default:
                M m5 = (M) this.f3283e;
                m5.getClass();
                this.f3280b.set(false);
                ((l2.e) m5.f3289f).t(this.f3281c, this.f3282d);
                break;
        }
    }
}
