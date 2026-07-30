package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class te {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public te() {
        this.b = new ay0[32];
        this.c = new float[32];
        this.d = new byte[32];
        int i = pe2.a;
        this.e = new un1();
        this.f = new un1();
    }

    public void a() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((e10) this.d) != null) {
                if (((e10) this.f) == null) {
                    this.f = new e10();
                }
                e10 e10Var = (e10) this.f;
                e10Var.c = null;
                e10Var.b = false;
                e10Var.d = null;
                e10Var.a = false;
                WeakHashMap weakHashMap = e53.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    e10Var.b = true;
                    e10Var.c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    e10Var.a = true;
                    e10Var.d = backgroundTintMode;
                }
                if (e10Var.b || e10Var.a) {
                    tf.d(background, e10Var, view.getDrawableState());
                    return;
                }
            }
            e10 e10Var2 = (e10) this.e;
            if (e10Var2 != null) {
                tf.d(background, e10Var2, view.getDrawableState());
                return;
            }
            e10 e10Var3 = (e10) this.d;
            if (e10Var3 != null) {
                tf.d(background, e10Var3, view.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        e10 e10Var = (e10) this.e;
        if (e10Var != null) {
            return (ColorStateList) e10Var.c;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        e10 e10Var = (e10) this.e;
        if (e10Var != null) {
            return (PorterDuff.Mode) e10Var.d;
        }
        return null;
    }

    public boolean d() {
        return this.a < ((List) this.d).size() || !((ArrayList) this.f).isEmpty();
    }

    public void e(AttributeSet attributeSet, int i) {
        ColorStateList f;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = b62.y;
        mh z = mh.z(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) z.n;
        View view2 = (View) this.b;
        e53.h(view2, view2.getContext(), iArr, attributeSet, (TypedArray) z.n, i);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                tf tfVar = (tf) this.c;
                Context context2 = view.getContext();
                int i2 = this.a;
                synchronized (tfVar) {
                    f = tfVar.a.f(context2, i2);
                }
                if (f != null) {
                    h(f);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(z.p(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(he0.b(typedArray.getInt(2, -1), null));
            }
            z.B();
        } catch (Throwable th) {
            z.B();
            throw th;
        }
    }

    public void f() {
        this.a = -1;
        h(null);
        a();
    }

    public void g(int i) {
        ColorStateList colorStateList;
        this.a = i;
        tf tfVar = (tf) this.c;
        if (tfVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (tfVar) {
                colorStateList = tfVar.a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        h(colorStateList);
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((e10) this.d) == null) {
                this.d = new e10();
            }
            e10 e10Var = (e10) this.d;
            e10Var.c = colorStateList;
            e10Var.b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void i(ColorStateList colorStateList) {
        if (((e10) this.e) == null) {
            this.e = new e10();
        }
        e10 e10Var = (e10) this.e;
        e10Var.c = colorStateList;
        e10Var.b = true;
        a();
    }

    public void j(PorterDuff.Mode mode) {
        if (((e10) this.e) == null) {
            this.e = new e10();
        }
        e10 e10Var = (e10) this.e;
        e10Var.d = mode;
        e10Var.a = true;
        a();
    }

    public te(View view) {
        this.a = -1;
        this.b = view;
        this.c = tf.a();
    }
}
