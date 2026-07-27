package W;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class u extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f3374a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3375b;

    public u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3374a = new Rect();
        this.f3375b = true;
    }

    public u(int i2, int i3) {
        super(i2, i3);
        this.f3374a = new Rect();
        this.f3375b = true;
    }

    public u(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f3374a = new Rect();
        this.f3375b = true;
    }

    public u(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3374a = new Rect();
        this.f3375b = true;
    }

    public u(u uVar) {
        super((ViewGroup.LayoutParams) uVar);
        this.f3374a = new Rect();
        this.f3375b = true;
    }
}
