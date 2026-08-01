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
import o2.f;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class a extends FrameLayout {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3040k = {R.attr.colorBackground};

    /* renamed from: l, reason: collision with root package name */
    public static final f f3041l = new f(22);

    /* renamed from: f, reason: collision with root package name */
    public boolean f3042f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3043g;
    public final Rect h;
    public final Rect i;

    /* renamed from: j, reason: collision with root package name */
    public final q f3044j;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.gdmhkmf.belbet.R.attr.materialCardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.h = rect;
        this.i = new Rect();
        q qVar = new q(15, this);
        this.f3044j = qVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.a.f2867a, com.gdmhkmf.belbet.R.attr.materialCardViewStyle, com.gdmhkmf.belbet.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f3040k);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.gdmhkmf.belbet.R.color.cardview_light_background) : getResources().getColor(com.gdmhkmf.belbet.R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f3042f = obtainStyledAttributes.getBoolean(7, false);
        this.f3043g = obtainStyledAttributes.getBoolean(6, true);
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
        qVar.f466g = bVar;
        setBackgroundDrawable(bVar);
        setClipToOutline(true);
        setElevation(dimension2);
        f3041l.q(qVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((b) ((Drawable) this.f3044j.f466g)).h;
    }

    public float getCardElevation() {
        return ((a) this.f3044j.h).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.h.bottom;
    }

    public int getContentPaddingLeft() {
        return this.h.left;
    }

    public int getContentPaddingRight() {
        return this.h.right;
    }

    public int getContentPaddingTop() {
        return this.h.top;
    }

    public float getMaxCardElevation() {
        return ((b) ((Drawable) this.f3044j.f466g)).f3048e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f3043g;
    }

    public float getRadius() {
        return ((b) ((Drawable) this.f3044j.f466g)).f3045a;
    }

    public boolean getUseCompatPadding() {
        return this.f3042f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        b bVar = (b) ((Drawable) this.f3044j.f466g);
        if (valueOf == null) {
            bVar.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        bVar.h = valueOf;
        bVar.f3046b.setColor(valueOf.getColorForState(bVar.getState(), bVar.h.getDefaultColor()));
        bVar.invalidateSelf();
    }

    public void setCardElevation(float f5) {
        ((a) this.f3044j.h).setElevation(f5);
    }

    public void setMaxCardElevation(float f5) {
        f3041l.q(this.f3044j, f5);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z4) {
        if (z4 != this.f3043g) {
            this.f3043g = z4;
            q qVar = this.f3044j;
            f3041l.q(qVar, ((b) ((Drawable) qVar.f466g)).f3048e);
        }
    }

    public void setRadius(float f5) {
        b bVar = (b) ((Drawable) this.f3044j.f466g);
        if (f5 == bVar.f3045a) {
            return;
        }
        bVar.f3045a = f5;
        bVar.b(null);
        bVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z4) {
        if (this.f3042f != z4) {
            this.f3042f = z4;
            q qVar = this.f3044j;
            f3041l.q(qVar, ((b) ((Drawable) qVar.f466g)).f3048e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        b bVar = (b) ((Drawable) this.f3044j.f466g);
        if (colorStateList == null) {
            bVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        bVar.h = colorStateList;
        bVar.f3046b.setColor(colorStateList.getColorForState(bVar.getState(), bVar.h.getDefaultColor()));
        bVar.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i4, int i5, int i6) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i4, int i5, int i6) {
    }
}
