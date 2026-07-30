package androidx.lifecycle;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class G implements InterfaceC0256w {

    /* renamed from: q, reason: collision with root package name */
    public static final G f3847q = new G();

    /* renamed from: d, reason: collision with root package name */
    public int f3848d;

    /* renamed from: e, reason: collision with root package name */
    public int f3849e;

    /* renamed from: m, reason: collision with root package name */
    public Handler f3852m;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3850i = true;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3851l = true;

    /* renamed from: n, reason: collision with root package name */
    public final C0258y f3853n = new C0258y(this);

    /* renamed from: o, reason: collision with root package name */
    public final A.k f3854o = new A.k(5, this);

    /* renamed from: p, reason: collision with root package name */
    public final l2.c f3855p = new l2.c(this);

    public final void a() {
        int i2 = this.f3849e + 1;
        this.f3849e = i2;
        if (i2 == 1) {
            if (this.f3850i) {
                this.f3853n.e(EnumC0248n.ON_RESUME);
                this.f3850i = false;
            } else {
                Handler handler = this.f3852m;
                Intrinsics.b(handler);
                handler.removeCallbacks(this.f3854o);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0256w
    public final AbstractC0250p getLifecycle() {
        return this.f3853n;
    }
}
