package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.a;
import com.google.android.material.internal.CheckableImageButton;
import com.trembin.nirefon.betfury.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class b10<S> extends vj {
    public int A0;
    public CharSequence B0;
    public int C0;
    public CharSequence D0;
    public int E0;
    public CharSequence F0;
    public TextView G0;
    public CheckableImageButton H0;
    public g10 I0;
    public boolean J0;
    public CharSequence K0;
    public CharSequence L0;
    public final LinkedHashSet o0;
    public final LinkedHashSet p0;
    public int q0;
    public n50 r0;
    public ca s0;
    public s00 t0;
    public int u0;
    public CharSequence v0;
    public boolean w0;
    public int x0;
    public int y0;
    public CharSequence z0;

    public b10() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.o0 = new LinkedHashSet();
        this.p0 = new LinkedHashSet();
    }

    public static int M(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b = xk0.b();
        b.set(5, 1);
        Calendar a = xk0.a(b);
        a.get(2);
        a.get(1);
        int maximum = a.getMaximum(7);
        a.getActualMaximum(5);
        a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean N(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n9.L(context, R.attr.materialCalendarStyle, s00.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    @Override // defpackage.vj
    public final Dialog J() {
        Context E = E();
        E();
        int i = this.q0;
        if (i == 0) {
            L();
            throw null;
        }
        Dialog dialog = new Dialog(E, i);
        Context context = dialog.getContext();
        this.w0 = N(context, android.R.attr.windowFullscreen);
        this.I0 = new g10(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, c70.t, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.I0.n(context);
        this.I0.r(ColorStateList.valueOf(color));
        this.I0.q(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    public final void L() {
        if (this.k.getParcelable("DATE_SELECTOR_KEY") == null) {
            return;
        }
        s9.c();
    }

    @Override // defpackage.vj, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.o0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // defpackage.vj, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.p0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.J;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // defpackage.vj, androidx.fragment.app.a
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.k;
        }
        this.q0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            s9.c();
            return;
        }
        this.s0 = (ca) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            s9.c();
            return;
        }
        this.u0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.v0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.x0 = bundle.getInt("INPUT_MODE_KEY");
        this.y0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.z0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.A0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.B0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.C0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.D0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.E0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.F0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.v0;
        if (charSequence == null) {
            charSequence = E().getResources().getText(this.u0);
        }
        this.K0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.L0 = charSequence;
    }

    @Override // androidx.fragment.app.a
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.w0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.w0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(M(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(M(context), -1));
        }
        ((TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.H0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.G0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.H0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.H0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, d50.v(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], d50.v(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.H0.setChecked(this.x0 != 0);
        hm0.m(this.H0, null);
        CheckableImageButton checkableImageButton2 = this.H0;
        this.H0.setContentDescription(this.x0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        CheckableImageButton checkableImageButton3 = this.H0;
        zi0.a(this.H0, this.x0 == 1 ? checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
        this.H0.setOnClickListener(new hc(3, this));
        L();
        throw null;
    }

    @Override // defpackage.vj, androidx.fragment.app.a
    public final void x(Bundle bundle) {
        super.x(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.q0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        ca caVar = this.s0;
        ba baVar = new ba();
        long j = caVar.f.k;
        long j2 = caVar.g.k;
        baVar.a = Long.valueOf(caVar.i.k);
        int i = caVar.j;
        wh whVar = caVar.h;
        s00 s00Var = this.t0;
        o20 o20Var = s00Var == null ? null : s00Var.b0;
        if (o20Var != null) {
            baVar.a = Long.valueOf(o20Var.k);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", whVar);
        o20 b = o20.b(j);
        o20 b2 = o20.b(j2);
        wh whVar2 = (wh) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = baVar.a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new ca(b, b2, whVar2, l == null ? null : o20.b(l.longValue()), i));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.u0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.v0);
        bundle.putInt("INPUT_MODE_KEY", this.x0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.y0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.z0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.A0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.B0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.C0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.D0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.E0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.F0);
    }

    @Override // defpackage.vj, androidx.fragment.app.a
    public final void y() {
        n50 n50Var;
        int i;
        super.y();
        Dialog dialog = this.j0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.w0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.I0);
            if (!this.J0) {
                View findViewById = F().findViewById(R.id.fullscreen_header);
                ColorStateList B = bi.B(findViewById.getBackground());
                Integer valueOf = B != null ? Integer.valueOf(B.getDefaultColor()) : null;
                boolean z = false;
                boolean z2 = valueOf == null || valueOf.intValue() == 0;
                Integer z3 = bi.z(window.getContext(), android.R.attr.colorBackground);
                int intValue = z3 != null ? z3.intValue() : -16777216;
                if (z2) {
                    valueOf = Integer.valueOf(intValue);
                }
                ud0.z(window, false);
                window.getContext();
                Context context = window.getContext();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 27) {
                    Integer z4 = bi.z(context, android.R.attr.navigationBarColor);
                    i = fd.d(z4 != null ? z4.intValue() : -16777216, 128);
                } else {
                    i = 0;
                }
                if (i2 < 35) {
                    window.setStatusBarColor(0);
                }
                if (i2 < 35) {
                    window.setNavigationBarColor(i);
                }
                boolean z5 = bi.I(0) || bi.I(valueOf.intValue());
                xy xyVar = new xy(window.getDecorView(), 17);
                (i2 >= 35 ? new hp0(window, xyVar) : i2 >= 30 ? new gp0(window, xyVar) : new ep0(window, xyVar)).l(z5);
                boolean I = bi.I(intValue);
                if (bi.I(i) || (i == 0 && I)) {
                    z = true;
                }
                xy xyVar2 = new xy(window.getDecorView(), 17);
                int i3 = Build.VERSION.SDK_INT;
                (i3 >= 35 ? new hp0(window, xyVar2) : i3 >= 30 ? new gp0(window, xyVar2) : new ep0(window, xyVar2)).k(z);
                a10 a10Var = new a10(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight());
                WeakHashMap weakHashMap = hm0.a;
                zl0.c(findViewById, a10Var);
                this.J0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = E().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.I0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.j0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new ev(dialog2, rect));
        }
        E();
        int i4 = this.q0;
        if (i4 == 0) {
            L();
            throw null;
        }
        a B2 = g().B(this.x0 == 1 ? "TEXT_INPUT_FRAGMENT_TAG" : "CALENDAR_FRAGMENT_TAG");
        n50 n50Var2 = B2 instanceof n50 ? (n50) B2 : null;
        if (n50Var2 == null) {
            if (this.x0 == 1) {
                L();
                ca caVar = this.s0;
                j10 j10Var = new j10();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i4);
                bundle.putParcelable("DATE_SELECTOR_KEY", null);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", caVar);
                j10Var.H(bundle);
                n50Var = j10Var;
            } else {
                L();
                ca caVar2 = this.s0;
                s00 s00Var = new s00();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i4);
                bundle2.putParcelable("GRID_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", caVar2);
                bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                bundle2.putParcelable("CURRENT_MONTH_KEY", caVar2.i);
                s00Var.H(bundle2);
                this.t0 = s00Var;
                n50Var = s00Var;
            }
            n50Var2 = n50Var;
        }
        this.r0 = n50Var2;
        n50Var2.I(new xy(2));
        this.G0.setText((this.x0 == 1 && E().getResources().getConfiguration().orientation == 2) ? this.L0 : this.K0);
        L();
        throw null;
    }

    @Override // defpackage.vj, androidx.fragment.app.a
    public final void z() {
        this.r0.Y.clear();
        super.z();
    }
}
