package g0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class I extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public Y f2736a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f2737b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2738c;
    public boolean d;

    public I(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2737b = new Rect();
        this.f2738c = true;
        this.d = false;
    }

    public I(int i, int i2) {
        super(i, i2);
        this.f2737b = new Rect();
        this.f2738c = true;
        this.d = false;
    }

    public I(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2737b = new Rect();
        this.f2738c = true;
        this.d = false;
    }

    public I(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2737b = new Rect();
        this.f2738c = true;
        this.d = false;
    }

    public I(I i) {
        super((ViewGroup.LayoutParams) i);
        this.f2737b = new Rect();
        this.f2738c = true;
        this.d = false;
    }
}
