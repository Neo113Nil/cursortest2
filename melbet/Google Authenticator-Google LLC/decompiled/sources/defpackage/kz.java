package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kz extends ViewGroup.MarginLayoutParams {
    public lp c;
    public final Rect d;
    public boolean e;
    boolean f;

    public kz(int i, int i2) {
        super(i, i2);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public final int a() {
        return this.c.b();
    }

    public final boolean b() {
        return this.c.x();
    }

    public final boolean c() {
        return this.c.u();
    }

    public kz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public kz(kz kzVar) {
        super((ViewGroup.LayoutParams) kzVar);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public kz(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public kz(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }
}
