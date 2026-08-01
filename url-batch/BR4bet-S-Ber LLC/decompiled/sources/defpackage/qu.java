package defpackage;

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
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class qu extends l2 {
    public final dw h;
    public final Rect i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qu(Context context) {
        super(r3, r14 == null ? 0 : r14.data);
        TypedValue K = b9.K(context.getTheme(), R.attr.materialAlertDialogTheme);
        int i = K == null ? 0 : K.data;
        Context i0 = la0.i0(R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, context, null, new int[0]);
        i0 = i != 0 ? new ke(i0, i) : i0;
        TypedValue K2 = b9.K(context.getTheme(), R.attr.materialAlertDialogTheme);
        ContextThemeWrapper contextThemeWrapper = ((h2) this.g).a;
        Resources.Theme theme = contextThemeWrapper.getTheme();
        la0.j(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int[] iArr = y00.o;
        la0.m(contextThemeWrapper, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(3, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(1, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(0, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        obtainStyledAttributes.recycle();
        int layoutDirection = contextThemeWrapper.getResources().getConfiguration().getLayoutDirection();
        this.i = new Rect(layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize2, layoutDirection != 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize4);
        int G = xf.G(contextThemeWrapper, b9.M(contextThemeWrapper, R.attr.colorSurface, qu.class.getCanonicalName()));
        TypedArray obtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color = obtainStyledAttributes2.getColor(4, G);
        obtainStyledAttributes2.recycle();
        dw dwVar = new dw(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        dwVar.n(contextThemeWrapper);
        dwVar.r(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(((h2) this.g).a.getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                dwVar.setShapeAppearanceModel(dwVar.g.a.a(dimension));
            }
        }
        this.h = dwVar;
    }

    @Override // defpackage.l2
    public final m2 b() {
        m2 b = super.b();
        Window window = b.getWindow();
        View decorView = window.getDecorView();
        dw dwVar = this.h;
        if (dwVar != null) {
            dwVar.q(decorView.getElevation());
        }
        Rect rect = this.i;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) dwVar, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new dr(b, rect));
        return b;
    }
}
