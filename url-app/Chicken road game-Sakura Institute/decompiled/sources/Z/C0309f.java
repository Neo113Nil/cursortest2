package Z;

import android.os.Build;
import b0.C0494b;
import c0.C0531b;
import c0.C0534e;
import c0.InterfaceC0533d;
import com.chicken.road.kedro.laqer.R;
import d0.AbstractC0541a;
import d0.C0542b;
import kotlin.Unit;
import s0.C1166s;

/* renamed from: Z.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309f implements A {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f4519d = true;

    /* renamed from: a, reason: collision with root package name */
    public final C1166s f4520a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4521b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public C0542b f4522c;

    public C0309f(C1166s c1166s) {
        this.f4520a = c1166s;
    }

    @Override // Z.A
    public final void a(C0531b c0531b) {
        synchronized (this.f4521b) {
            if (!c0531b.f5741q) {
                c0531b.f5741q = true;
                c0531b.b();
            }
            Unit unit = Unit.f7487a;
        }
    }

    @Override // Z.A
    public final C0531b b() {
        InterfaceC0533d iVar;
        C0531b c0531b;
        synchronized (this.f4521b) {
            try {
                C1166s c1166s = this.f4520a;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29) {
                    AbstractC0308e.a(c1166s);
                }
                if (i2 >= 29) {
                    iVar = new c0.g();
                } else if (f4519d) {
                    try {
                        iVar = new C0534e(this.f4520a, new C0321s(), new C0494b());
                    } catch (Throwable unused) {
                        f4519d = false;
                        iVar = new c0.i(c(this.f4520a));
                    }
                } else {
                    iVar = new c0.i(c(this.f4520a));
                }
                c0531b = new C0531b(iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0531b;
    }

    public final AbstractC0541a c(C1166s c1166s) {
        C0542b c0542b = this.f4522c;
        if (c0542b != null) {
            return c0542b;
        }
        C0542b c0542b2 = new C0542b(c1166s.getContext());
        c0542b2.setClipChildren(false);
        c0542b2.setClipToPadding(false);
        c0542b2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        c1166s.addView(c0542b2, -1);
        this.f4522c = c0542b2;
        return c0542b2;
    }
}
