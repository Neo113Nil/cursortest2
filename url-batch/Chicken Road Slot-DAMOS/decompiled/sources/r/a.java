package r;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends FrameLayout {

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f8065t = {R.attr.colorBackground};

    /* renamed from: d, reason: collision with root package name */
    public boolean f8066d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8067e;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f8068i;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f8069r;

    /* renamed from: s, reason: collision with root package name */
    public final c6.c f8070s;

    public a(Context context) {
        super(context, null, com.appsflyer.R.attr.cardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f8068i = rect;
        this.f8069r = new Rect();
        c6.c cVar = new c6.c(this);
        this.f8070s = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, q.a.f7720a, com.appsflyer.R.attr.cardViewStyle, com.appsflyer.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f8065t);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.appsflyer.R.color.cardview_light_background) : getResources().getColor(com.appsflyer.R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f8066d = obtainStyledAttributes.getBoolean(7, false);
        this.f8067e = obtainStyledAttributes.getBoolean(6, true);
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
        cVar.f1809e = bVar;
        setBackgroundDrawable(bVar);
        setClipToOutline(true);
        setElevation(dimension2);
        i7.a.f0(cVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((b) this.f8070s.f1809e).f8077h;
    }

    public float getCardElevation() {
        return ((a) this.f8070s.f1810i).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f8068i.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f8068i.left;
    }

    public int getContentPaddingRight() {
        return this.f8068i.right;
    }

    public int getContentPaddingTop() {
        return this.f8068i.top;
    }

    public float getMaxCardElevation() {
        return ((b) this.f8070s.f1809e).f8075e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f8067e;
    }

    public float getRadius() {
        return ((b) this.f8070s.f1809e).f8071a;
    }

    public boolean getUseCompatPadding() {
        return this.f8066d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
    }

    public void setCardBackgroundColor(int i3) {
        ColorStateList valueOf = ColorStateList.valueOf(i3);
        b bVar = (b) this.f8070s.f1809e;
        if (valueOf == null) {
            bVar.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        bVar.f8077h = valueOf;
        bVar.f8072b.setColor(valueOf.getColorForState(bVar.getState(), bVar.f8077h.getDefaultColor()));
        bVar.invalidateSelf();
    }

    public void setCardElevation(float f3) {
        ((a) this.f8070s.f1810i).setElevation(f3);
    }

    public void setMaxCardElevation(float f3) {
        i7.a.f0(this.f8070s, f3);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i3) {
        super.setMinimumHeight(i3);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i3) {
        super.setMinimumWidth(i3);
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f8067e) {
            this.f8067e = z10;
            c6.c cVar = this.f8070s;
            i7.a.f0(cVar, ((b) cVar.f1809e).f8075e);
        }
    }

    public void setRadius(float f3) {
        b bVar = (b) this.f8070s.f1809e;
        if (f3 == bVar.f8071a) {
            return;
        }
        bVar.f8071a = f3;
        bVar.b(null);
        bVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f8066d != z10) {
            this.f8066d = z10;
            c6.c cVar = this.f8070s;
            i7.a.f0(cVar, ((b) cVar.f1809e).f8075e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        b bVar = (b) this.f8070s.f1809e;
        if (colorStateList == null) {
            bVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        bVar.f8077h = colorStateList;
        bVar.f8072b.setColor(colorStateList.getColorForState(bVar.getState(), bVar.f8077h.getDefaultColor()));
        bVar.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i3, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i3, int i10, int i11, int i12) {
    }
}
