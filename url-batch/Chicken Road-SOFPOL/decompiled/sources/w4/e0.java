package w4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class e0 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f7908a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7909b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7910c;

    public e0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7908a = new Rect();
        this.f7909b = true;
        this.f7910c = false;
    }

    public e0(int i, int i8) {
        super(i, i8);
        this.f7908a = new Rect();
        this.f7909b = true;
        this.f7910c = false;
    }

    public e0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f7908a = new Rect();
        this.f7909b = true;
        this.f7910c = false;
    }

    public e0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f7908a = new Rect();
        this.f7909b = true;
        this.f7910c = false;
    }

    public e0(e0 e0Var) {
        super((ViewGroup.LayoutParams) e0Var);
        this.f7908a = new Rect();
        this.f7909b = true;
        this.f7910c = false;
    }
}
