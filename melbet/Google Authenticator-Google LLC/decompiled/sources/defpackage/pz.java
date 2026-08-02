package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class pz extends FrameLayout {
    private static final int[] f = {R.attr.colorBackground};
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    public final acd e;

    public pz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.c = rect;
        this.d = new Rect();
        acd acdVar = new acd(this);
        this.e = acdVar;
        int[] iArr = py.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, com.google.android.apps.authenticator2.R.style.CardView);
        yq.k(this, context, iArr, attributeSet, obtainStyledAttributes, i, com.google.android.apps.authenticator2.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.google.android.apps.authenticator2.R.color.cardview_light_background) : getResources().getColor(com.google.android.apps.authenticator2.R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.a = obtainStyledAttributes.getBoolean(7, false);
        this.b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        qa qaVar = new qa(valueOf, dimension);
        acdVar.a = qaVar;
        Object obj = acdVar.b;
        ((pz) obj).setBackgroundDrawable(qaVar);
        View view = (View) obj;
        view.setClipToOutline(true);
        view.setElevation(dimension2);
        Object obj2 = acdVar.a;
        boolean c = acdVar.c();
        boolean b = acdVar.b();
        qa qaVar2 = (qa) obj2;
        if (dimension3 != qaVar2.b || qaVar2.c != c || qaVar2.d != b) {
            qaVar2.b = dimension3;
            qaVar2.c = c;
            qaVar2.d = b;
            qaVar2.a(null);
            qaVar2.invalidateSelf();
        }
        pi.p(acdVar);
    }

    public final float a() {
        return pi.n(this.e);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public pz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.authenticator2.R.attr.cardViewStyle);
    }

    public pz(Context context) {
        this(context, null);
    }
}
