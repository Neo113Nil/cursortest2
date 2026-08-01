package g0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class K extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public a0 f2322a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f2323b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2324c;
    public boolean d;

    public K(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2323b = new Rect();
        this.f2324c = true;
        this.d = false;
    }

    public K(int i, int i2) {
        super(i, i2);
        this.f2323b = new Rect();
        this.f2324c = true;
        this.d = false;
    }

    public K(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2323b = new Rect();
        this.f2324c = true;
        this.d = false;
    }

    public K(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2323b = new Rect();
        this.f2324c = true;
        this.d = false;
    }

    public K(K k2) {
        super((ViewGroup.LayoutParams) k2);
        this.f2323b = new Rect();
        this.f2324c = true;
        this.d = false;
    }
}
