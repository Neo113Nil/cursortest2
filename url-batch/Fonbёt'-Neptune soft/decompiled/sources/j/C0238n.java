package j;

import B0.C0031i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import c.AbstractC0165a;
import java.lang.reflect.Field;

/* renamed from: j.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0238n {

    /* renamed from: a, reason: collision with root package name */
    public final View f3007a;

    /* renamed from: b, reason: collision with root package name */
    public final C0240p f3008b;

    /* renamed from: c, reason: collision with root package name */
    public int f3009c = -1;

    /* renamed from: d, reason: collision with root package name */
    public l0 f3010d;

    /* renamed from: e, reason: collision with root package name */
    public l0 f3011e;

    /* renamed from: f, reason: collision with root package name */
    public l0 f3012f;

    public C0238n(View view) {
        C0240p c0240p;
        this.f3007a = view;
        PorterDuff.Mode mode = C0240p.f3024b;
        synchronized (C0240p.class) {
            try {
                if (C0240p.f3025c == null) {
                    C0240p.b();
                }
                c0240p = C0240p.f3025c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3008b = c0240p;
    }

    public final void a() {
        View view = this.f3007a;
        Drawable background = view.getBackground();
        if (background != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 <= 21 ? i2 == 21 : this.f3010d != null) {
                if (this.f3012f == null) {
                    this.f3012f = new l0();
                }
                l0 l0Var = this.f3012f;
                l0Var.f3000a = null;
                l0Var.f3003d = false;
                l0Var.f3001b = null;
                l0Var.f3002c = false;
                Field field = A.z.f58a;
                ColorStateList g2 = A.r.g(view);
                if (g2 != null) {
                    l0Var.f3003d = true;
                    l0Var.f3000a = g2;
                }
                PorterDuff.Mode h2 = A.r.h(view);
                if (h2 != null) {
                    l0Var.f3002c = true;
                    l0Var.f3001b = h2;
                }
                if (l0Var.f3003d || l0Var.f3002c) {
                    C0240p.c(background, l0Var, view.getDrawableState());
                    return;
                }
            }
            l0 l0Var2 = this.f3011e;
            if (l0Var2 != null) {
                C0240p.c(background, l0Var2, view.getDrawableState());
                return;
            }
            l0 l0Var3 = this.f3010d;
            if (l0Var3 != null) {
                C0240p.c(background, l0Var3, view.getDrawableState());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:3:0x0011, B:5:0x0018, B:6:0x0026, B:9:0x002d, B:11:0x0030, B:15:0x0039, B:17:0x003a, B:19:0x0043, B:21:0x0050, B:23:0x005a, B:29:0x0068, B:31:0x006e, B:32:0x0075, B:34:0x0078, B:36:0x007f, B:38:0x0091, B:40:0x009b, B:44:0x00a6, B:46:0x00ac, B:47:0x00b3, B:8:0x0027), top: B:2:0x0011, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(AttributeSet attributeSet, int i2) {
        boolean z2;
        ColorStateList i3;
        View view = this.f3007a;
        C0031i J = C0031i.J(view.getContext(), attributeSet, AbstractC0165a.f1983u, i2);
        TypedArray typedArray = (TypedArray) J.f154f;
        try {
            if (typedArray.hasValue(0)) {
                this.f3009c = typedArray.getResourceId(0, -1);
                C0240p c0240p = this.f3008b;
                Context context = view.getContext();
                int i4 = this.f3009c;
                synchronized (c0240p) {
                    i3 = c0240p.f3026a.i(context, i4);
                }
                if (i3 != null) {
                    d(i3);
                }
            }
            if (typedArray.hasValue(1)) {
                ColorStateList z3 = J.z(1);
                Field field = A.z.f58a;
                int i5 = Build.VERSION.SDK_INT;
                A.r.q(view, z3);
                if (i5 == 21) {
                    Drawable background = view.getBackground();
                    if (A.r.g(view) == null && A.r.h(view) == null) {
                        z2 = false;
                        if (background != null && z2) {
                            if (background.isStateful()) {
                                background.setState(view.getDrawableState());
                            }
                            view.setBackground(background);
                        }
                    }
                    z2 = true;
                    if (background != null) {
                        if (background.isStateful()) {
                        }
                        view.setBackground(background);
                    }
                }
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode d2 = A.d(typedArray.getInt(2, -1), null);
                Field field2 = A.z.f58a;
                int i6 = Build.VERSION.SDK_INT;
                A.r.r(view, d2);
                if (i6 == 21) {
                    Drawable background2 = view.getBackground();
                    boolean z4 = (A.r.g(view) == null && A.r.h(view) == null) ? false : true;
                    if (background2 != null && z4) {
                        if (background2.isStateful()) {
                            background2.setState(view.getDrawableState());
                        }
                        view.setBackground(background2);
                    }
                }
            }
        } finally {
            J.N();
        }
    }

    public final void c(int i2) {
        ColorStateList colorStateList;
        this.f3009c = i2;
        C0240p c0240p = this.f3008b;
        if (c0240p != null) {
            Context context = this.f3007a.getContext();
            synchronized (c0240p) {
                colorStateList = c0240p.f3026a.i(context, i2);
            }
        } else {
            colorStateList = null;
        }
        d(colorStateList);
        a();
    }

    public final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3010d == null) {
                this.f3010d = new l0();
            }
            l0 l0Var = this.f3010d;
            l0Var.f3000a = colorStateList;
            l0Var.f3003d = true;
        } else {
            this.f3010d = null;
        }
        a();
    }

    public final void e(ColorStateList colorStateList) {
        if (this.f3011e == null) {
            this.f3011e = new l0();
        }
        l0 l0Var = this.f3011e;
        l0Var.f3000a = colorStateList;
        l0Var.f3003d = true;
        a();
    }

    public final void f(PorterDuff.Mode mode) {
        if (this.f3011e == null) {
            this.f3011e = new l0();
        }
        l0 l0Var = this.f3011e;
        l0Var.f3001b = mode;
        l0Var.f3002c = true;
        a();
    }
}
