package t1;

import B.Y;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C0294x;
import androidx.lifecycle.EnumC0286o;
import androidx.lifecycle.T;
import e2.InterfaceC0422a;

/* renamed from: t1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1027g extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8871e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1028h f8872f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1027g(C1028h c1028h, int i3) {
        super(0);
        this.f8871e = i3;
        this.f8872f = c1028h;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f8871e) {
            case 0:
                C1028h c1028h = this.f8872f;
                Context context = c1028h.f8873d;
                Context applicationContext = context != null ? context.getApplicationContext() : null;
                return new T(applicationContext instanceof Application ? (Application) applicationContext : null, c1028h, c1028h.g());
            default:
                C1028h c1028h2 = this.f8872f;
                if (!c1028h2.f8882m) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                C0294x c0294x = c1028h2.f8880k;
                if (c0294x.f5242d == EnumC0286o.f5226d) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                C1025e c1025e = new C1025e();
                c1025e.f8868a = (y1.e) c1028h2.f8881l.f320d;
                c1025e.f8869b = c0294x;
                return ((C1026f) new Y(c1028h2.d(), c1025e, c1028h2.a()).e(f2.v.a(C1026f.class))).f8870b;
        }
    }
}
