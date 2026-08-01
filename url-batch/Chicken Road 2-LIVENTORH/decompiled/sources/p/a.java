package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.emoji2.text.q;
import l2.f;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class a extends FrameLayout {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f2990k = {R.attr.colorBackground};

    /* renamed from: l, reason: collision with root package name */
    public static final f f2991l = new f(22);

    /* renamed from: f, reason: collision with root package name */
    public boolean f2992f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2993g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f2994h;
    public final Rect i;

    /* renamed from: j, reason: collision with root package name */
    public final q f2995j;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.oriondriftchasers.arordrft.R.attr.materialCardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f2994h = rect;
        this.i = new Rect();
        q qVar = new q(14, this);
        this.f2995j = qVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.a.f2846a, com.oriondriftchasers.arordrft.R.attr.materialCardViewStyle, com.oriondriftchasers.arordrft.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f2990k);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.oriondriftchasers.arordrft.R.color.cardview_light_background) : getResources().getColor(com.oriondriftchasers.arordrft.R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f2992f = obtainStyledAttributes.getBoolean(7, false);
        this.f2993g = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        b bVar = new b(valueOf, dimension);
        qVar.f346g = bVar;
        setBackgroundDrawable(bVar);
        setClipToOutline(true);
        setElevation(dimension2);
        f2991l.n(qVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((b) ((Drawable) this.f2995j.f346g)).f3002h;
    }

    public float getCardElevation() {
        return ((a) this.f2995j.f347h).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f2994h.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f2994h.left;
    }

    public int getContentPaddingRight() {
        return this.f2994h.right;
    }

    public int getContentPaddingTop() {
        return this.f2994h.top;
    }

    public float getMaxCardElevation() {
        return ((b) ((Drawable) this.f2995j.f346g)).f2999e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f2993g;
    }

    public float getRadius() {
        return ((b) ((Drawable) this.f2995j.f346g)).f2996a;
    }

    public boolean getUseCompatPadding() {
        return this.f2992f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        b bVar = (b) ((Drawable) this.f2995j.f346g);
        if (valueOf == null) {
            bVar.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        bVar.f3002h = valueOf;
        bVar.f2997b.setColor(valueOf.getColorForState(bVar.getState(), bVar.f3002h.getDefaultColor()));
        bVar.invalidateSelf();
    }

    public void setCardElevation(float f2) {
        ((a) this.f2995j.f347h).setElevation(f2);
    }

    public void setMaxCardElevation(float f2) {
        f2991l.n(this.f2995j, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z3) {
        if (z3 != this.f2993g) {
            this.f2993g = z3;
            q qVar = this.f2995j;
            f2991l.n(qVar, ((b) ((Drawable) qVar.f346g)).f2999e);
        }
    }

    public void setRadius(float f2) {
        b bVar = (b) ((Drawable) this.f2995j.f346g);
        if (f2 == bVar.f2996a) {
            return;
        }
        bVar.f2996a = f2;
        bVar.b(null);
        bVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z3) {
        if (this.f2992f != z3) {
            this.f2992f = z3;
            q qVar = this.f2995j;
            f2991l.n(qVar, ((b) ((Drawable) qVar.f346g)).f2999e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        b bVar = (b) ((Drawable) this.f2995j.f346g);
        if (colorStateList == null) {
            bVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        bVar.f3002h = colorStateList;
        bVar.f2997b.setColor(colorStateList.getColorForState(bVar.getState(), bVar.f3002h.getDefaultColor()));
        bVar.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i4, int i5, int i6) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i4, int i5, int i6) {
    }
}
