package androidx.cardview.widget;

import C3.e;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.icefishing.icefishingliveapp.C5284R;
import q.AbstractC4865a;
import r.C4951a;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f4750y = {R.attr.colorBackground};

    /* renamed from: z, reason: collision with root package name */
    public static final e f4751z = new e();

    /* renamed from: n, reason: collision with root package name */
    public boolean f4752n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4753u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f4754v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f4755w;

    /* renamed from: x, reason: collision with root package name */
    public final S0.e f4756x;

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5284R.attr.cardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f4754v = rect;
        this.f4755w = new Rect();
        S0.e eVar = new S0.e(16, this);
        this.f4756x = eVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4865a.f39878a, C5284R.attr.cardViewStyle, C5284R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f4750y);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(C5284R.color.cardview_light_background) : getResources().getColor(C5284R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f4752n = obtainStyledAttributes.getBoolean(7, false);
        this.f4753u = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        e eVar2 = f4751z;
        C4951a c4951a = new C4951a(valueOf, dimension);
        eVar.f2891u = c4951a;
        setBackgroundDrawable(c4951a);
        setClipToOutline(true);
        setElevation(dimension2);
        eVar2.m(eVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C4951a) ((Drawable) this.f4756x.f2891u)).f40194h;
    }

    public float getCardElevation() {
        return ((CardView) this.f4756x.f2892v).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f4754v.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f4754v.left;
    }

    public int getContentPaddingRight() {
        return this.f4754v.right;
    }

    public int getContentPaddingTop() {
        return this.f4754v.top;
    }

    public float getMaxCardElevation() {
        return ((C4951a) ((Drawable) this.f4756x.f2891u)).f40191e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f4753u;
    }

    public float getRadius() {
        return ((C4951a) ((Drawable) this.f4756x.f2891u)).f40187a;
    }

    public boolean getUseCompatPadding() {
        return this.f4752n;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C4951a c4951a = (C4951a) ((Drawable) this.f4756x.f2891u);
        if (valueOf == null) {
            c4951a.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        c4951a.f40194h = valueOf;
        c4951a.f40188b.setColor(valueOf.getColorForState(c4951a.getState(), c4951a.f40194h.getDefaultColor()));
        c4951a.invalidateSelf();
    }

    public void setCardElevation(float f6) {
        ((CardView) this.f4756x.f2892v).setElevation(f6);
    }

    public void setMaxCardElevation(float f6) {
        f4751z.m(this.f4756x, f6);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i4, int i9, int i10) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i4, int i9, int i10) {
    }

    public void setPreventCornerOverlap(boolean z8) {
        if (z8 != this.f4753u) {
            this.f4753u = z8;
            e eVar = f4751z;
            S0.e eVar2 = this.f4756x;
            eVar.m(eVar2, ((C4951a) ((Drawable) eVar2.f2891u)).f40191e);
        }
    }

    public void setRadius(float f6) {
        C4951a c4951a = (C4951a) ((Drawable) this.f4756x.f2891u);
        if (f6 == c4951a.f40187a) {
            return;
        }
        c4951a.f40187a = f6;
        c4951a.b(null);
        c4951a.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z8) {
        if (this.f4752n != z8) {
            this.f4752n = z8;
            e eVar = f4751z;
            S0.e eVar2 = this.f4756x;
            eVar.m(eVar2, ((C4951a) ((Drawable) eVar2.f2891u)).f40191e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C4951a c4951a = (C4951a) ((Drawable) this.f4756x.f2891u);
        if (colorStateList == null) {
            c4951a.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c4951a.f40194h = colorStateList;
        c4951a.f40188b.setColor(colorStateList.getColorForState(c4951a.getState(), c4951a.f40194h.getDefaultColor()));
        c4951a.invalidateSelf();
    }
}
