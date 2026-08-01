package g0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class M extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public c0 f2287a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f2288b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2289c;
    public boolean d;

    public M(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2288b = new Rect();
        this.f2289c = true;
        this.d = false;
    }

    public M(int i, int i2) {
        super(i, i2);
        this.f2288b = new Rect();
        this.f2289c = true;
        this.d = false;
    }

    public M(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2288b = new Rect();
        this.f2289c = true;
        this.d = false;
    }

    public M(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2288b = new Rect();
        this.f2289c = true;
        this.d = false;
    }

    public M(M m2) {
        super((ViewGroup.LayoutParams) m2);
        this.f2288b = new Rect();
        this.f2289c = true;
        this.d = false;
    }
}
