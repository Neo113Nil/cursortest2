package defpackage;

import android.content.Context;
import android.os.Build;
import com.majelw.libystne.R;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x9 implements cw0 {
    public static boolean f = true;
    public final t7 a;
    public final Object b = new Object();
    public m53 c;
    public boolean d;
    public final w9 e;

    public x9(t7 t7Var) {
        this.a = t7Var;
        w9 w9Var = new w9();
        this.e = w9Var;
        if (t7Var.isAttachedToWindow()) {
            Context context = t7Var.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(w9Var);
                this.d = true;
            }
        }
        t7Var.addOnAttachStateChangeListener(new w7(1, this));
    }

    @Override // defpackage.cw0
    public final void a(dw0 dw0Var) {
        synchronized (this.b) {
            if (!dw0Var.s) {
                dw0Var.s = true;
                dw0Var.b();
            }
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.cw0
    public final dw0 b() {
        ew0 kw0Var;
        ew0 ew0Var;
        dw0 dw0Var;
        synchronized (this.b) {
            try {
                t7 t7Var = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    x6.n(t7Var);
                }
                if (i >= 29) {
                    ew0Var = new iw0();
                } else {
                    if (f) {
                        try {
                            kw0Var = new hw0(this.a, new os(), new ns());
                        } catch (Throwable unused) {
                            f = false;
                            kw0Var = new kw0(c(this.a));
                        }
                    } else {
                        kw0Var = new kw0(c(this.a));
                    }
                    ew0Var = kw0Var;
                }
                dw0Var = new dw0(ew0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dw0Var;
    }

    public final ud0 c(t7 t7Var) {
        m53 m53Var = this.c;
        if (m53Var != null) {
            return m53Var;
        }
        m53 m53Var2 = new m53(t7Var.getContext());
        m53Var2.setClipChildren(false);
        m53Var2.setClipToPadding(false);
        m53Var2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        t7Var.addView(m53Var2, -1);
        this.c = m53Var2;
        return m53Var2;
    }
}
