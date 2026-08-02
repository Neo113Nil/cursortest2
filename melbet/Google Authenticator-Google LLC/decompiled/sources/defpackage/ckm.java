package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckm {
    private static volatile ckm c;
    public int a;
    public final Object b;

    private ckm() {
        this.a = 0;
        this.b = new qi();
    }

    public static ckm b() {
        if (c == null) {
            synchronized (ckm.class) {
                if (c == null) {
                    c = new ckm();
                }
            }
        }
        return c;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized ckd a() {
        ArrayList arrayList;
        ?? r0 = this.b;
        arrayList = new ArrayList(r0.values());
        int i = this.a;
        if (i > 0) {
            arrayList.add(new ckn("UNKNOWN", 1002, i));
            this.a = 0;
        }
        r0.clear();
        return new ckd(arrayList);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    final synchronized void c(ckn cknVar) {
        wp wpVar = new wp(cknVar.a, Integer.valueOf(cknVar.b));
        ?? r1 = this.b;
        ckn cknVar2 = (ckn) r1.get(wpVar);
        if (cknVar2 != null) {
            cknVar2.c = hoq.m(cknVar2.c, cknVar.c);
        } else if (((qy) r1).d >= 100) {
            this.a = hoq.m(this.a, cknVar.c);
        } else {
            r1.put(wpVar, cknVar);
        }
    }

    public final void d(int i, Context context) {
        if (jtc.a.bB().a(context)) {
            c(new ckn("UNKNOWN", i, 1));
        }
    }

    public final Object e() {
        int i = this.a;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = (Object[]) this.b;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.a = i2;
        return obj;
    }

    public final void f(Object obj) {
        int i = this.a;
        if (i < 256) {
            ((Object[]) this.b)[i] = obj;
            this.a = i + 1;
        }
    }

    public final void g() {
        ImageView imageView = (ImageView) this.b;
        if (imageView.getDrawable() != null) {
            imageView.getDrawable().setLevel(this.a);
        }
    }

    public final void h() {
        Drawable drawable = ((ImageView) this.b).getDrawable();
        if (drawable != null) {
            jl.b(drawable);
        }
    }

    public final void i(AttributeSet attributeSet, int i) {
        int h;
        Object obj = this.b;
        ImageView imageView = (ImageView) obj;
        Context context = imageView.getContext();
        int[] iArr = em.f;
        byo u = byo.u(context, attributeSet, iArr, i, 0);
        yq.k((View) obj, imageView.getContext(), iArr, attributeSet, (TypedArray) u.a, i, 0);
        try {
            Drawable drawable = ((ImageView) obj).getDrawable();
            if (drawable == null && (h = u.h(1, -1)) != -1 && (drawable = e.f(((ImageView) obj).getContext(), h)) != null) {
                ((ImageView) obj).setImageDrawable(drawable);
            }
            if (drawable != null) {
                jl.b(drawable);
            }
            if (u.p(2)) {
                ((ImageView) obj).setImageTintList(u.i(2));
            }
            if (u.p(3)) {
                int e = u.e(3, -1);
                Rect rect = jl.a;
                ((ImageView) obj).setImageTintMode(a.q(e, null));
            }
        } finally {
            u.n();
        }
    }

    public final void j(Drawable drawable) {
        this.a = drawable.getLevel();
    }

    public final void k(int i) {
        Object obj = this.b;
        if (i != 0) {
            ImageView imageView = (ImageView) obj;
            Drawable f = e.f(imageView.getContext(), i);
            if (f != null) {
                jl.b(f);
            }
            imageView.setImageDrawable(f);
        } else {
            ((ImageView) obj).setImageDrawable(null);
        }
        h();
    }

    public final boolean l() {
        return !(((ImageView) this.b).getBackground() instanceof RippleDrawable);
    }

    public ckm(char[] cArr) {
        this.b = new Object[256];
    }

    public ckm(byte[] bArr) {
        this.b = new ReentrantLock();
    }

    public ckm(ImageView imageView) {
        this.a = 0;
        this.b = imageView;
    }
}
