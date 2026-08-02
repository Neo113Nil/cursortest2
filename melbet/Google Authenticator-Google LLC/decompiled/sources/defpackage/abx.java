package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abx extends ViewGroup.MarginLayoutParams {
    public int a;
    public float b;
    public boolean c;
    public int d;

    public abx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.a);
        this.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public abx() {
        super(-1, -1);
        this.a = 0;
    }

    public abx(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }

    public abx(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 0;
    }

    public abx(abx abxVar) {
        super((ViewGroup.MarginLayoutParams) abxVar);
        this.a = 0;
        this.a = abxVar.a;
    }
}
