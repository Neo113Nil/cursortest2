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
import com.awerser.monnit.betplay.MainActivity2;
import com.awerser.monnit.betplay.R;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class cs extends v2 {
    public final rt c;
    public final Rect d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cs(MainActivity2 mainActivity2) {
        super(r6, r14 == null ? 0 : r14.data);
        TypedValue P = l70.P(mainActivity2.getTheme(), R.attr.materialAlertDialogTheme);
        int i = P == null ? 0 : P.data;
        Context Z = op.Z(mainActivity2, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        Z = i != 0 ? new od(Z, i) : Z;
        TypedValue P2 = l70.P(mainActivity2.getTheme(), R.attr.materialAlertDialogTheme);
        ContextThemeWrapper contextThemeWrapper = ((r2) this.b).a;
        Resources.Theme theme = contextThemeWrapper.getTheme();
        vw.n(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int[] iArr = ly.m;
        vw.r(contextThemeWrapper, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(3, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(1, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(0, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        obtainStyledAttributes.recycle();
        int layoutDirection = contextThemeWrapper.getResources().getConfiguration().getLayoutDirection();
        this.d = new Rect(layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize2, layoutDirection != 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize4);
        int L = j8.L(contextThemeWrapper, l70.R(contextThemeWrapper, R.attr.colorSurface, cs.class.getCanonicalName()));
        TypedArray obtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color = obtainStyledAttributes2.getColor(4, L);
        obtainStyledAttributes2.recycle();
        rt rtVar = new rt(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        rtVar.n(contextThemeWrapper);
        rtVar.r(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(((r2) this.b).a.getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                rtVar.setShapeAppearanceModel(rtVar.g.a.a(dimension));
            }
        }
        this.c = rtVar;
    }

    @Override // defpackage.v2
    public final w2 a() {
        w2 a = super.a();
        Window window = a.getWindow();
        View decorView = window.getDecorView();
        rt rtVar = this.c;
        if (rtVar != null) {
            rtVar.q(decorView.getElevation());
        }
        Rect rect = this.d;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) rtVar, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new hp(a, rect));
        return a;
    }
}
