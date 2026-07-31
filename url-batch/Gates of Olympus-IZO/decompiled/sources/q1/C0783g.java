package q1;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C0238x;
import androidx.lifecycle.EnumC0230o;
import androidx.lifecycle.T;

/* renamed from: q1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0783g extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6892e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0784h f6893f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0783g(C0784h c0784h, int i3) {
        super(0);
        this.f6892e = i3;
        this.f6893f = c0784h;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f6892e) {
            case 0:
                C0784h c0784h = this.f6893f;
                Context context = c0784h.f6894d;
                Context applicationContext = context != null ? context.getApplicationContext() : null;
                return new T(applicationContext instanceof Application ? (Application) applicationContext : null, c0784h, c0784h.g());
            default:
                C0784h c0784h2 = this.f6893f;
                if (!c0784h2.f6903m) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                C0238x c0238x = c0784h2.f6901k;
                if (c0238x.f4041d == EnumC0230o.f4025d) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                C0781e c0781e = new C0781e();
                c0781e.f6889a = (u1.e) c0784h2.f6902l.f3455c;
                c0781e.f6890b = c0238x;
                return ((C0782f) new A2.g(c0784h2.d(), c0781e, c0784h2.a()).k(Z1.u.a(C0782f.class))).f6891b;
        }
    }
}
