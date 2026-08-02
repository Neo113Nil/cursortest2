package U;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class v extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f1457a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1458b;

    public v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1457a = new Rect();
        this.f1458b = true;
    }

    public v(int i3, int i4) {
        super(i3, i4);
        this.f1457a = new Rect();
        this.f1458b = true;
    }

    public v(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1457a = new Rect();
        this.f1458b = true;
    }

    public v(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1457a = new Rect();
        this.f1458b = true;
    }

    public v(v vVar) {
        super((ViewGroup.LayoutParams) vVar);
        this.f1457a = new Rect();
        this.f1458b = true;
    }
}
