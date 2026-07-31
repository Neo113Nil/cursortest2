package N;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class x extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f781a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f782b;

    public x(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f781a = new Rect();
        this.f782b = true;
    }

    public x(int i2, int i3) {
        super(i2, i3);
        this.f781a = new Rect();
        this.f782b = true;
    }

    public x(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f781a = new Rect();
        this.f782b = true;
    }

    public x(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f781a = new Rect();
        this.f782b = true;
    }

    public x(x xVar) {
        super((ViewGroup.LayoutParams) xVar);
        this.f781a = new Rect();
        this.f782b = true;
    }
}
