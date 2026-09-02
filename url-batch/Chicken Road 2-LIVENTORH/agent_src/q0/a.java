package q0;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.emoji2.text.q;
import androidx.fragment.app.w0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f3040a;

    /* renamed from: b, reason: collision with root package name */
    public final b f3041b;

    /* renamed from: c, reason: collision with root package name */
    public f0.c f3042c;
    public f0.c d;

    /* renamed from: e, reason: collision with root package name */
    public c f3043e;

    /* renamed from: f, reason: collision with root package name */
    public final ColorDrawable f3044f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3045g;

    /* renamed from: h, reason: collision with root package name */
    public int f3046h;

    static {
        new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    public a(int i, int i4) {
        b bVar = new b();
        bVar.f3047a = -1;
        bVar.f3048b = -1;
        f0.c cVar = f0.c.f1265e;
        bVar.f3049c = cVar;
        bVar.d = false;
        bVar.f3050e = null;
        bVar.f3051f = 0.0f;
        bVar.f3052g = 0.0f;
        bVar.f3053h = 1.0f;
        this.f3041b = bVar;
        this.f3042c = cVar;
        this.d = cVar;
        this.f3043e = null;
        if (i != 1 && i != 2 && i != 4 && i != 8) {
            throw new IllegalArgumentException(w0.d("Unexpected side: ", i));
        }
        this.f3040a = i;
        ColorDrawable colorDrawable = new ColorDrawable();
        this.f3044f = colorDrawable;
        this.f3046h = 0;
        this.f3045g = true;
        if (i4 != 0) {
            this.f3046h = i4;
            colorDrawable.setColor(i4);
            bVar.f3050e = colorDrawable;
            q qVar = bVar.i;
            if (qVar != null) {
                ((View) qVar.f347h).setBackground(colorDrawable);
            }
        }
    }

    public final void a(float f2) {
        float f4 = f2 * 1.0f;
        b bVar = this.f3041b;
        if (bVar.f3053h != f4) {
            bVar.f3053h = f4;
            q qVar = bVar.i;
            if (qVar != null) {
                ((View) qVar.f347h).setAlpha(f4);
            }
        }
    }

    public final void b(float f2) {
        float f4 = f2 * 1.0f;
        b bVar = this.f3041b;
        int i = this.f3040a;
        if (i == 1) {
            float f5 = (-(1.0f - f4)) * bVar.f3047a;
            if (bVar.f3051f != f5) {
                bVar.f3051f = f5;
                q qVar = bVar.i;
                if (qVar != null) {
                    ((View) qVar.f347h).setTranslationX(f5);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            float f6 = (-(1.0f - f4)) * bVar.f3048b;
            if (bVar.f3052g != f6) {
                bVar.f3052g = f6;
                q qVar2 = bVar.i;
                if (qVar2 != null) {
                    ((View) qVar2.f347h).setTranslationY(f6);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            float f7 = (1.0f - f4) * bVar.f3047a;
            if (bVar.f3051f != f7) {
                bVar.f3051f = f7;
                q qVar3 = bVar.i;
                if (qVar3 != null) {
                    ((View) qVar3.f347h).setTranslationX(f7);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 8) {
            return;
        }
        float f8 = (1.0f - f4) * bVar.f3048b;
        if (bVar.f3052g != f8) {
            bVar.f3052g = f8;
            q qVar4 = bVar.i;
            if (qVar4 != null) {
                ((View) qVar4.f347h).setTranslationY(f8);
            }
        }
    }
}
