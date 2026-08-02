package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fhm extends df {
    private final Drawable b;
    private final Rect c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fhm(Context context, int i) {
        super(r0 != 0 ? new on(r4, r0) : r4, i == 0 ? u(context) : i);
        int u = u(context);
        Context a = frj.a(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        Context a2 = a();
        Resources.Theme theme = a2.getTheme();
        int[] iArr = fhn.a;
        TypedArray a3 = fjw.a(a2, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        int dimensionPixelSize = a3.getDimensionPixelSize(2, a2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = a3.getDimensionPixelSize(3, a2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = a3.getDimensionPixelSize(1, a2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = a3.getDimensionPixelSize(0, a2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        a3.recycle();
        int layoutDirection = a2.getResources().getConfiguration().getLayoutDirection();
        this.c = new Rect(layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize2, layoutDirection != 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize4);
        int g = fhq.g(a2, getClass().getCanonicalName());
        TypedArray obtainStyledAttributes = a2.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color = obtainStyledAttributes.getColor(4, g);
        obtainStyledAttributes.recycle();
        fob fobVar = new fob(a2, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        fobVar.J(a2);
        fobVar.M(ColorStateList.valueOf(color));
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
        float dimension = typedValue.getDimension(a().getResources().getDisplayMetrics());
        if (typedValue.type == 5 && dimension >= 0.0f) {
            fobVar.bz(fobVar.p.a.c(dimension));
        }
        this.b = fobVar;
    }

    private static int u(Context context) {
        TypedValue j = fny.j(context, R.attr.materialAlertDialogTheme);
        if (j == null) {
            return 0;
        }
        return j.data;
    }

    @Override // defpackage.df
    public final dg b() {
        dg b = super.b();
        Window window = b.getWindow();
        View decorView = window.getDecorView();
        float elevation = decorView.getElevation();
        Drawable drawable = this.b;
        ((fob) drawable).L(elevation);
        Rect rect = this.c;
        window.setBackgroundDrawable(new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new fhl(b, rect));
        return b;
    }

    public final void j(int i) {
        this.a.c = i;
    }

    public final void k(Drawable drawable) {
        super.c(drawable);
    }

    public final void l(int i) {
        db dbVar = this.a;
        dbVar.g = dbVar.a.getText(i);
    }

    public final void m(CharSequence charSequence) {
        super.d(charSequence);
    }

    public final void n(int i, DialogInterface.OnClickListener onClickListener) {
        db dbVar = this.a;
        dbVar.j = dbVar.a.getText(i);
        dbVar.k = onClickListener;
    }

    public final void o(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.e(charSequence, onClickListener);
    }

    public final void p(DialogInterface.OnCancelListener onCancelListener) {
        this.a.o = onCancelListener;
    }

    public final void q(int i, DialogInterface.OnClickListener onClickListener) {
        db dbVar = this.a;
        dbVar.h = dbVar.a.getText(i);
        dbVar.i = onClickListener;
    }

    public final void r(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.f(charSequence, onClickListener);
    }

    public final void s(int i) {
        db dbVar = this.a;
        dbVar.e = dbVar.a.getText(i);
    }

    public final void t(CharSequence charSequence) {
        super.g(charSequence);
    }
}
