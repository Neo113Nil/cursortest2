package c2;

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

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public int f1694a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1695b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1696c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1697d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1698e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1699f;

    public w1() {
        this.f1695b = new a2.k[32];
        this.f1696c = new float[32];
        this.f1697d = new byte[32];
        int i3 = s.q0.f8360a;
        this.f1698e = new s.i0();
        this.f1699f = new s.i0();
    }

    public void a() {
        View view = (View) this.f1695b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((m.q1) this.f1697d) != null) {
                if (((m.q1) this.f1699f) == null) {
                    this.f1699f = new m.q1();
                }
                m.q1 q1Var = (m.q1) this.f1699f;
                q1Var.f6171a = null;
                q1Var.f6174d = false;
                q1Var.f6172b = null;
                q1Var.f6173c = false;
                Field field = o3.c0.f7378a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    q1Var.f6174d = true;
                    q1Var.f6171a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    q1Var.f6173c = true;
                    q1Var.f6172b = backgroundTintMode;
                }
                if (q1Var.f6174d || q1Var.f6173c) {
                    m.o.c(background, q1Var, view.getDrawableState());
                    return;
                }
            }
            m.q1 q1Var2 = (m.q1) this.f1698e;
            if (q1Var2 != null) {
                m.o.c(background, q1Var2, view.getDrawableState());
                return;
            }
            m.q1 q1Var3 = (m.q1) this.f1697d;
            if (q1Var3 != null) {
                m.o.c(background, q1Var3, view.getDrawableState());
            }
        }
    }

    public void b(AttributeSet attributeSet, int i3) {
        ColorStateList g;
        View view = (View) this.f1695b;
        Context context = view.getContext();
        int[] iArr = i.a.f4556s;
        a1.n z10 = a1.n.z(context, attributeSet, iArr, i3);
        TypedArray typedArray = (TypedArray) z10.f40e;
        View view2 = (View) this.f1695b;
        o3.c0.c(view2, view2.getContext(), iArr, attributeSet, (TypedArray) z10.f40e, i3);
        try {
            if (typedArray.hasValue(0)) {
                this.f1694a = typedArray.getResourceId(0, -1);
                m.o oVar = (m.o) this.f1696c;
                Context context2 = view.getContext();
                int i10 = this.f1694a;
                synchronized (oVar) {
                    g = oVar.f6143a.g(context2, i10);
                }
                if (g != null) {
                    e(g);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(z10.q(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(m.k0.b(typedArray.getInt(2, -1), null));
            }
            z10.D();
        } catch (Throwable th) {
            z10.D();
            throw th;
        }
    }

    public n4.r c(String str) {
        n4.q qVar;
        str.getClass();
        hd.q qVar2 = (hd.q) this.f1699f;
        if (qVar2 == null || (qVar = (n4.q) qVar2.getValue()) == null) {
            return null;
        }
        int i3 = n4.s.f7113s;
        Uri parse = Uri.parse("android-app://androidx.navigation/".concat(str));
        parse.getClass();
        Bundle d10 = qVar.d(parse, (LinkedHashMap) this.f1697d);
        if (d10 == null) {
            return null;
        }
        return new n4.r((n4.s) this.f1695b, d10, qVar.f7107l, qVar.b(parse), false);
    }

    public void d(int i3) {
        ColorStateList colorStateList;
        this.f1694a = i3;
        m.o oVar = (m.o) this.f1696c;
        if (oVar != null) {
            Context context = ((View) this.f1695b).getContext();
            synchronized (oVar) {
                colorStateList = oVar.f6143a.g(context, i3);
            }
        } else {
            colorStateList = null;
        }
        e(colorStateList);
        a();
    }

    public void e(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((m.q1) this.f1697d) == null) {
                this.f1697d = new m.q1();
            }
            m.q1 q1Var = (m.q1) this.f1697d;
            q1Var.f6171a = colorStateList;
            q1Var.f6174d = true;
        } else {
            this.f1697d = null;
        }
        a();
    }

    public void f(ColorStateList colorStateList) {
        if (((m.q1) this.f1698e) == null) {
            this.f1698e = new m.q1();
        }
        m.q1 q1Var = (m.q1) this.f1698e;
        q1Var.f6171a = colorStateList;
        q1Var.f6174d = true;
        a();
    }

    public void g(PorterDuff.Mode mode) {
        if (((m.q1) this.f1698e) == null) {
            this.f1698e = new m.q1();
        }
        m.q1 q1Var = (m.q1) this.f1698e;
        q1Var.f6172b = mode;
        q1Var.f6173c = true;
        a();
    }

    public w1(View view) {
        m.o oVar;
        this.f1694a = -1;
        this.f1695b = view;
        PorterDuff.Mode mode = m.o.f6141b;
        synchronized (m.o.class) {
            try {
                if (m.o.f6142c == null) {
                    m.o.b();
                }
                oVar = m.o.f6142c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1696c = oVar;
    }
}
