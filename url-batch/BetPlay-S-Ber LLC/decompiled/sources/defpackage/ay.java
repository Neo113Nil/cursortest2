package defpackage;

import android.view.View;
import android.view.animation.PathInterpolator;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class ay {
    public final int a;
    public final zx b;
    public ip c;
    public ip d;
    public cy e;

    static {
        new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    public ay(int i) {
        zx zxVar = new zx();
        zxVar.a = -1;
        zxVar.b = -1;
        ip ipVar = ip.e;
        zxVar.c = ipVar;
        zxVar.d = false;
        zxVar.e = null;
        zxVar.f = 0.0f;
        zxVar.g = 0.0f;
        zxVar.h = 1.0f;
        this.b = zxVar;
        this.c = ipVar;
        this.d = ipVar;
        this.e = null;
        if (i == 1 || i == 2 || i == 4 || i == 8) {
            this.a = i;
        } else {
            o8.j(o30.e("Unexpected side: ", i));
            throw null;
        }
    }

    public abstract void a(int i);

    public abstract int b(int i);

    public final void c(float f) {
        float f2 = f * 1.0f;
        zx zxVar = this.b;
        if (zxVar.h != f2) {
            zxVar.h = f2;
            h5 h5Var = zxVar.i;
            if (h5Var != null) {
                ((View) h5Var.h).setAlpha(f2);
            }
        }
    }

    public final void d(float f) {
        float f2 = f * 1.0f;
        zx zxVar = this.b;
        int i = this.a;
        if (i == 1) {
            float f3 = (-(1.0f - f2)) * zxVar.a;
            if (zxVar.f != f3) {
                zxVar.f = f3;
                h5 h5Var = zxVar.i;
                if (h5Var != null) {
                    ((View) h5Var.h).setTranslationX(f3);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            float f4 = (-(1.0f - f2)) * zxVar.b;
            if (zxVar.g != f4) {
                zxVar.g = f4;
                h5 h5Var2 = zxVar.i;
                if (h5Var2 != null) {
                    ((View) h5Var2.h).setTranslationY(f4);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            float f5 = (1.0f - f2) * zxVar.a;
            if (zxVar.f != f5) {
                zxVar.f = f5;
                h5 h5Var3 = zxVar.i;
                if (h5Var3 != null) {
                    ((View) h5Var3.h).setTranslationX(f5);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 8) {
            return;
        }
        float f6 = (1.0f - f2) * zxVar.b;
        if (zxVar.g != f6) {
            zxVar.g = f6;
            h5 h5Var4 = zxVar.i;
            if (h5Var4 != null) {
                ((View) h5Var4.h).setTranslationY(f6);
            }
        }
    }
}
