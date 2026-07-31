package b0;

import android.os.Build;
import com.gates.olympus.miruv.R;
import d0.C0321b;
import e0.C0336b;
import f0.AbstractC0384a;
import f0.C0385b;
import u0.C0997t;

/* renamed from: b0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274g implements InterfaceC0251B {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f4267d = true;

    /* renamed from: a, reason: collision with root package name */
    public final C0997t f4268a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4269b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public C0385b f4270c;

    public C0274g(C0997t c0997t) {
        this.f4268a = c0997t;
    }

    @Override // b0.InterfaceC0251B
    public final void a(C0336b c0336b) {
        synchronized (this.f4269b) {
            if (!c0336b.f4488r) {
                c0336b.f4488r = true;
                c0336b.b();
            }
        }
    }

    @Override // b0.InterfaceC0251B
    public final C0336b b() {
        e0.d iVar;
        C0336b c0336b;
        synchronized (this.f4269b) {
            try {
                C0997t c0997t = this.f4268a;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    AbstractC0273f.a(c0997t);
                }
                if (i3 >= 29) {
                    iVar = new e0.g();
                } else if (f4267d) {
                    try {
                        iVar = new e0.e(this.f4268a, new C0286s(), new C0321b());
                    } catch (Throwable unused) {
                        f4267d = false;
                        iVar = new e0.i(c(this.f4268a));
                    }
                } else {
                    iVar = new e0.i(c(this.f4268a));
                }
                c0336b = new C0336b(iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0336b;
    }

    public final AbstractC0384a c(C0997t c0997t) {
        C0385b c0385b = this.f4270c;
        if (c0385b != null) {
            return c0385b;
        }
        C0385b c0385b2 = new C0385b(c0997t.getContext());
        c0385b2.setClipChildren(false);
        c0385b2.setClipToPadding(false);
        c0385b2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        c0997t.addView(c0385b2, -1);
        this.f4270c = c0385b2;
        return c0385b2;
    }
}
