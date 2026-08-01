package c2;

import a4.e0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import b4.d;
import b4.l;
import com.gdmhkmf.belbet.R;
import g.f;
import i2.o;
import j.c;
import o2.j;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b extends e0 {

    /* renamed from: c, reason: collision with root package name */
    public final j f877c;
    public final Rect d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Context context) {
        super(r0 != 0 ? new c(r14, r0) : r14, R.style.Theme_Win_Dialog);
        TypedValue O = d.O(context.getTheme(), R.attr.materialAlertDialogTheme);
        int i = O == null ? 0 : O.data;
        Context a5 = u2.a.a(R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, context, null, new int[0]);
        ContextThemeWrapper contextThemeWrapper = ((g.b) this.f168b).f1470a;
        Resources.Theme theme = contextThemeWrapper.getTheme();
        o.a(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int[] iArr = q1.a.f3149m;
        o.b(contextThemeWrapper, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(3, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(1, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(0, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        obtainStyledAttributes.recycle();
        int layoutDirection = contextThemeWrapper.getResources().getConfiguration().getLayoutDirection();
        this.d = new Rect(layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize2, layoutDirection != 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize4);
        int U = l.U(contextThemeWrapper, d.Q(contextThemeWrapper, R.attr.colorSurface, b.class.getCanonicalName()));
        TypedArray obtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color = obtainStyledAttributes2.getColor(4, U);
        obtainStyledAttributes2.recycle();
        j jVar = new j(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        jVar.n(contextThemeWrapper);
        jVar.r(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(((g.b) this.f168b).f1470a.getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                jVar.setShapeAppearanceModel(jVar.f2955g.f2940a.a(dimension));
            }
        }
        this.f877c = jVar;
    }

    @Override // a4.e0
    public final f b() {
        f b2 = super.b();
        Window window = b2.getWindow();
        View decorView = window.getDecorView();
        j jVar = this.f877c;
        if (jVar != null) {
            jVar.q(decorView.getElevation());
        }
        Rect rect = this.d;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) jVar, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new a(b2, rect));
        return b2;
    }
}
