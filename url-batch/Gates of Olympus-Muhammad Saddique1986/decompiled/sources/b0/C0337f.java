package b0;

import android.os.Build;
import com.gatesof.olympus.martu.marku.R;
import d0.C0401b;
import e0.C0416b;
import e0.C0419e;
import e0.InterfaceC0418d;
import f0.AbstractC0431a;
import f0.C0432b;
import u0.C1123s;

/* renamed from: b0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0337f implements D {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f5409d = true;

    /* renamed from: a, reason: collision with root package name */
    public final C1123s f5410a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5411b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public C0432b f5412c;

    public C0337f(C1123s c1123s) {
        this.f5410a = c1123s;
    }

    @Override // b0.D
    public final void a(C0416b c0416b) {
        synchronized (this.f5411b) {
            if (!c0416b.f5711r) {
                c0416b.f5711r = true;
                c0416b.b();
            }
        }
    }

    @Override // b0.D
    public final C0416b b() {
        InterfaceC0418d iVar;
        C0416b c0416b;
        synchronized (this.f5411b) {
            try {
                C1123s c1123s = this.f5410a;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    AbstractC0336e.a(c1123s);
                }
                if (i3 >= 29) {
                    iVar = new e0.g();
                } else if (f5409d) {
                    try {
                        iVar = new C0419e(this.f5410a, new C0349s(), new C0401b());
                    } catch (Throwable unused) {
                        f5409d = false;
                        iVar = new e0.i(c(this.f5410a));
                    }
                } else {
                    iVar = new e0.i(c(this.f5410a));
                }
                c0416b = new C0416b(iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0416b;
    }

    public final AbstractC0431a c(C1123s c1123s) {
        C0432b c0432b = this.f5412c;
        if (c0432b != null) {
            return c0432b;
        }
        C0432b c0432b2 = new C0432b(c1123s.getContext());
        c0432b2.setClipChildren(false);
        c0432b2.setClipToPadding(false);
        c0432b2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        c1123s.addView(c0432b2, -1);
        this.f5412c = c0432b2;
        return c0432b2;
    }
}
