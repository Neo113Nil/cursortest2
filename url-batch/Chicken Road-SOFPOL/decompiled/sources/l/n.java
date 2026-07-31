package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f4348a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4349b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4350c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4351d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4352e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4353f;

    public n(View view) {
        s sVar;
        this.f4348a = -1;
        this.f4349b = view;
        PorterDuff.Mode mode = s.f4401b;
        synchronized (s.class) {
            try {
                if (s.f4402c == null) {
                    s.c();
                }
                sVar = s.f4402c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4350c = sVar;
    }

    public void a() {
        View view = (View) this.f4349b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((x1) this.f4351d) != null) {
                if (((x1) this.f4353f) == null) {
                    this.f4353f = new x1();
                }
                x1 x1Var = (x1) this.f4353f;
                x1Var.f4452a = null;
                x1Var.f4455d = false;
                x1Var.f4453b = null;
                x1Var.f4454c = false;
                Field field = q3.k0.f6120a;
                ColorStateList c8 = q3.c0.c(view);
                if (c8 != null) {
                    x1Var.f4455d = true;
                    x1Var.f4452a = c8;
                }
                PorterDuff.Mode d8 = q3.c0.d(view);
                if (d8 != null) {
                    x1Var.f4454c = true;
                    x1Var.f4453b = d8;
                }
                if (x1Var.f4455d || x1Var.f4454c) {
                    s.d(background, x1Var, view.getDrawableState());
                    return;
                }
            }
            x1 x1Var2 = (x1) this.f4352e;
            if (x1Var2 != null) {
                s.d(background, x1Var2, view.getDrawableState());
                return;
            }
            x1 x1Var3 = (x1) this.f4351d;
            if (x1Var3 != null) {
                s.d(background, x1Var3, view.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        x1 x1Var = (x1) this.f4352e;
        if (x1Var != null) {
            return x1Var.f4452a;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        x1 x1Var = (x1) this.f4352e;
        if (x1Var != null) {
            return x1Var.f4453b;
        }
        return null;
    }

    public void d(AttributeSet attributeSet, int i) {
        ColorStateList f6;
        View view = (View) this.f4349b;
        Context context = view.getContext();
        int[] iArr = h.a.f3067t;
        a0.g1 E = a0.g1.E(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) E.f85c;
        View view2 = (View) this.f4349b;
        q3.k0.j(view2, view2.getContext(), iArr, attributeSet, (TypedArray) E.f85c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f4348a = typedArray.getResourceId(0, -1);
                s sVar = (s) this.f4350c;
                Context context2 = view.getContext();
                int i8 = this.f4348a;
                synchronized (sVar) {
                    f6 = sVar.f4403a.f(context2, i8);
                }
                if (f6 != null) {
                    h(f6);
                }
            }
            if (typedArray.hasValue(1)) {
                q3.c0.g(view, E.p(1));
            }
            if (typedArray.hasValue(2)) {
                q3.c0.h(view, r0.b(typedArray.getInt(2, -1), null));
            }
            E.G();
        } catch (Throwable th) {
            E.G();
            throw th;
        }
    }

    public o4.n e(String str) {
        o4.m mVar;
        q6.i.e(str, "route");
        c6.k kVar = (c6.k) this.f4353f;
        if (kVar == null || (mVar = (o4.m) kVar.getValue()) == null) {
            return null;
        }
        int i = o4.o.f5669h;
        String concat = "android-app://androidx.navigation/".concat(str);
        q6.i.e(concat, "uriString");
        Uri parse = Uri.parse(concat);
        q6.i.d(parse, "parse(...)");
        Bundle d8 = mVar.d(parse, (LinkedHashMap) this.f4351d);
        if (d8 == null) {
            return null;
        }
        return new o4.n((o4.o) this.f4349b, d8, mVar.f5663l, mVar.b(parse), false);
    }

    public void f() {
        this.f4348a = -1;
        h(null);
        a();
    }

    public void g(int i) {
        ColorStateList colorStateList;
        this.f4348a = i;
        s sVar = (s) this.f4350c;
        if (sVar != null) {
            Context context = ((View) this.f4349b).getContext();
            synchronized (sVar) {
                colorStateList = sVar.f4403a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        h(colorStateList);
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((x1) this.f4351d) == null) {
                this.f4351d = new x1();
            }
            x1 x1Var = (x1) this.f4351d;
            x1Var.f4452a = colorStateList;
            x1Var.f4455d = true;
        } else {
            this.f4351d = null;
        }
        a();
    }

    public void i(ColorStateList colorStateList) {
        if (((x1) this.f4352e) == null) {
            this.f4352e = new x1();
        }
        x1 x1Var = (x1) this.f4352e;
        x1Var.f4452a = colorStateList;
        x1Var.f4455d = true;
        a();
    }

    public void j(PorterDuff.Mode mode) {
        if (((x1) this.f4352e) == null) {
            this.f4352e = new x1();
        }
        x1 x1Var = (x1) this.f4352e;
        x1Var.f4453b = mode;
        x1Var.f4454c = true;
        a();
    }

    public n() {
        this.f4349b = new u1.m[32];
        this.f4350c = new float[32];
        this.f4351d = new byte[32];
        o.k0 k0Var = o.s0.f5536a;
        this.f4352e = new o.k0();
        this.f4353f = new o.k0();
    }
}
