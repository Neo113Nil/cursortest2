package k0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.AbstractC1281a0;

/* renamed from: k0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3188A {

    /* renamed from: a, reason: collision with root package name */
    private static final M f40869a;

    /* renamed from: b, reason: collision with root package name */
    static final Property f40870b;

    /* renamed from: c, reason: collision with root package name */
    static final Property f40871c;

    /* renamed from: k0.A$a */
    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(AbstractC3188A.c(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f4) {
            AbstractC3188A.g(view, f4.floatValue());
        }
    }

    /* renamed from: k0.A$b */
    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return AbstractC1281a0.v(view);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            AbstractC1281a0.v0(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f40869a = new L();
        } else {
            f40869a = new K();
        }
        f40870b = new a(Float.class, "translationAlpha");
        f40871c = new b(Rect.class, "clipBounds");
    }

    static void a(View view) {
        f40869a.a(view);
    }

    static z b(View view) {
        return new y(view);
    }

    static float c(View view) {
        return f40869a.b(view);
    }

    static P d(View view) {
        return new O(view);
    }

    static void e(View view) {
        f40869a.c(view);
    }

    static void f(View view, int i4, int i5, int i6, int i7) {
        f40869a.d(view, i4, i5, i6, i7);
    }

    static void g(View view, float f4) {
        f40869a.e(view, f4);
    }

    static void h(View view, int i4) {
        f40869a.f(view, i4);
    }

    static void i(View view, Matrix matrix) {
        f40869a.g(view, matrix);
    }

    static void j(View view, Matrix matrix) {
        f40869a.h(view, matrix);
    }
}
