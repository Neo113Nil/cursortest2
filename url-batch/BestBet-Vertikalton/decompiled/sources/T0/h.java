package T0;

import K.D;
import K.F;
import K.Q;
import a0.C0057a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.fortunequest.neontrack.R;
import java.util.WeakHashMap;
import x0.AbstractC0393a;

/* loaded from: classes.dex */
public abstract class h extends FrameLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final g f1034l = new g();

    /* renamed from: a, reason: collision with root package name */
    public i f1035a;

    /* renamed from: b, reason: collision with root package name */
    public final R0.k f1036b;

    /* renamed from: c, reason: collision with root package name */
    public int f1037c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1038e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1039f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1040g;
    public ColorStateList h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public Rect f1041j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1042k;

    /* JADX WARN: Multi-variable type inference failed */
    public h(Context context, AttributeSet attributeSet) {
        super(W0.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0393a.f4563x);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = Q.f578a;
            F.s(this, dimensionPixelSize);
        }
        this.f1037c = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f1036b = R0.k.b(context2, attributeSet, 0, 0).a();
        }
        this.d = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(H1.l.B(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(L0.k.g(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f1038e = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f1039f = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f1040g = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f1034l);
        setFocusable(true);
        if (getBackground() == null) {
            int Q2 = H1.l.Q(getBackgroundOverlayColorAlpha(), H1.l.A(this, R.attr.colorSurface), H1.l.A(this, R.attr.colorOnSurface));
            R0.k kVar = this.f1036b;
            if (kVar != null) {
                C0057a c0057a = i.f1043u;
                R0.g gVar = new R0.g(kVar);
                gVar.j(ColorStateList.valueOf(Q2));
                gradientDrawable = gVar;
            } else {
                Resources resources = getResources();
                C0057a c0057a2 = i.f1043u;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(Q2);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.h;
            if (colorStateList != null) {
                D.a.h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = Q.f578a;
            setBackground(gradientDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseTransientBottomBar(i iVar) {
        this.f1035a = iVar;
    }

    public float getActionTextColorAlpha() {
        return this.f1038e;
    }

    public int getAnimationMode() {
        return this.f1037c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.d;
    }

    public int getMaxInlineActionWidth() {
        return this.f1040g;
    }

    public int getMaxWidth() {
        return this.f1039f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        Insets mandatorySystemGestureInsets;
        int i;
        super.onAttachedToWindow();
        i iVar = this.f1035a;
        if (iVar != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = iVar.i.getRootWindowInsets()) != null) {
            mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
            i = mandatorySystemGestureInsets.bottom;
            iVar.f1061p = i;
            iVar.e();
        }
        WeakHashMap weakHashMap = Q.f578a;
        D.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z2;
        super.onDetachedFromWindow();
        i iVar = this.f1035a;
        if (iVar != null) {
            m m2 = m.m();
            f fVar = iVar.f1065t;
            synchronized (m2.f1073a) {
                z2 = true;
                if (!m2.o(fVar)) {
                    l lVar = (l) m2.d;
                    if (!(lVar != null && lVar.f1069a.get() == fVar)) {
                        z2 = false;
                    }
                }
            }
            if (z2) {
                i.f1046x.post(new d(iVar, 1));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        i iVar = this.f1035a;
        if (iVar == null || !iVar.f1063r) {
            return;
        }
        iVar.d();
        iVar.f1063r = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f1039f;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.f1037c = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.h != null) {
            drawable = drawable.mutate();
            D.a.h(drawable, this.h);
            D.a.i(drawable, this.i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.h = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            D.a.h(mutate, colorStateList);
            D.a.i(mutate, this.i);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.i = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            D.a.i(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.f1042k || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.f1041j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        i iVar = this.f1035a;
        if (iVar != null) {
            C0057a c0057a = i.f1043u;
            iVar.e();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f1034l);
        super.setOnClickListener(onClickListener);
    }
}
