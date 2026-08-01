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
import com.google.android.material.internal.CheckableImageButton;
import com.moontiko.really.admiralcasino.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class yv<S> extends ph {
    public int A0;
    public CharSequence B0;
    public int C0;
    public CharSequence D0;
    public int E0;
    public CharSequence F0;
    public TextView G0;
    public CheckableImageButton H0;
    public dw I0;
    public boolean J0;
    public CharSequence K0;
    public CharSequence L0;
    public final LinkedHashSet o0;
    public final LinkedHashSet p0;
    public int q0;
    public wz r0;
    public p9 s0;
    public pv t0;
    public int u0;
    public CharSequence v0;
    public boolean w0;
    public int x0;
    public int y0;
    public CharSequence z0;

    public yv() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.o0 = new LinkedHashSet();
        this.p0 = new LinkedHashSet();
    }

    public static int M(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b = za0.b();
        b.set(5, 1);
        Calendar a = za0.a(b);
        a.get(2);
        a.get(1);
        int maximum = a.getMaximum(7);
        a.getActualMaximum(5);
        a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean N(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b9.M(context, R.attr.materialCalendarStyle, pv.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    @Override // defpackage.ph
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
        this.I0 = new dw(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, y00.u, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
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
        g9.b();
    }

    @Override // defpackage.ph, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.o0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // defpackage.ph, android.content.DialogInterface.OnDismissListener
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

    @Override // defpackage.ph, defpackage.pm
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.k;
        }
        this.q0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            g9.b();
            return;
        }
        this.s0 = (p9) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            g9.b();
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

    @Override // defpackage.pm
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
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, mz.m(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], mz.m(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.H0.setChecked(this.x0 != 0);
        ic0.m(this.H0, null);
        CheckableImageButton checkableImageButton2 = this.H0;
        this.H0.setContentDescription(this.x0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        CheckableImageButton checkableImageButton3 = this.H0;
        t90.a(this.H0, this.x0 == 1 ? checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
        this.H0.setOnClickListener(new kb(3, this));
        L();
        throw null;
    }

    @Override // defpackage.ph, defpackage.pm
    public final void x(Bundle bundle) {
        super.x(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.q0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        p9 p9Var = this.s0;
        o9 o9Var = new o9();
        long j = p9Var.f.k;
        long j2 = p9Var.g.k;
        o9Var.a = Long.valueOf(p9Var.i.k);
        int i = p9Var.j;
        sf sfVar = p9Var.h;
        pv pvVar = this.t0;
        kx kxVar = pvVar == null ? null : pvVar.b0;
        if (kxVar != null) {
            o9Var.a = Long.valueOf(kxVar.k);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", sfVar);
        kx b = kx.b(j);
        kx b2 = kx.b(j2);
        sf sfVar2 = (sf) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = o9Var.a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new p9(b, b2, sfVar2, l == null ? null : kx.b(l.longValue()), i));
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

    @Override // defpackage.ph, defpackage.pm
    public final void y() {
        wz wzVar;
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
                ColorStateList q = xf.q(findViewById.getBackground());
                Integer valueOf = q != null ? Integer.valueOf(q.getDefaultColor()) : null;
                boolean z = false;
                boolean z2 = valueOf == null || valueOf.intValue() == 0;
                Integer p = xf.p(window.getContext(), android.R.attr.colorBackground);
                int intValue = p != null ? p.intValue() : -16777216;
                if (z2) {
                    valueOf = Integer.valueOf(intValue);
                }
                xf.H(window, false);
                window.getContext();
                Context context = window.getContext();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 27) {
                    Integer p2 = xf.p(context, android.R.attr.navigationBarColor);
                    i = gc.d(p2 != null ? p2.intValue() : -16777216, 128);
                } else {
                    i = 0;
                }
                if (i2 < 35) {
                    window.setStatusBarColor(0);
                }
                if (i2 < 35) {
                    window.setNavigationBarColor(i);
                }
                boolean z3 = xf.y(0) || xf.y(valueOf.intValue());
                ky kyVar = new ky(window.getDecorView(), 14);
                (i2 >= 35 ? new cf0(window, kyVar) : i2 >= 30 ? new bf0(window, kyVar) : new ze0(window, kyVar)).H(z3);
                boolean y = xf.y(intValue);
                if (xf.y(i) || (i == 0 && y)) {
                    z = true;
                }
                ky kyVar2 = new ky(window.getDecorView(), 14);
                int i3 = Build.VERSION.SDK_INT;
                (i3 >= 35 ? new cf0(window, kyVar2) : i3 >= 30 ? new bf0(window, kyVar2) : new ze0(window, kyVar2)).G(z);
                xv xvVar = new xv(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight());
                WeakHashMap weakHashMap = ic0.a;
                ac0.c(findViewById, xvVar);
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
            decorView.setOnTouchListener(new dr(dialog2, rect));
        }
        E();
        int i4 = this.q0;
        if (i4 == 0) {
            L();
            throw null;
        }
        pm B = g().B(this.x0 == 1 ? "TEXT_INPUT_FRAGMENT_TAG" : "CALENDAR_FRAGMENT_TAG");
        wz wzVar2 = B instanceof wz ? (wz) B : null;
        if (wzVar2 == null) {
            if (this.x0 == 1) {
                L();
                p9 p9Var = this.s0;
                gw gwVar = new gw();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i4);
                bundle.putParcelable("DATE_SELECTOR_KEY", null);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", p9Var);
                gwVar.H(bundle);
                wzVar = gwVar;
            } else {
                L();
                p9 p9Var2 = this.s0;
                pv pvVar = new pv();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i4);
                bundle2.putParcelable("GRID_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", p9Var2);
                bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                bundle2.putParcelable("CURRENT_MONTH_KEY", p9Var2.i);
                pvVar.H(bundle2);
                this.t0 = pvVar;
                wzVar = pvVar;
            }
            wzVar2 = wzVar;
        }
        this.r0 = wzVar2;
        wzVar2.I(new ej(29));
        this.G0.setText((this.x0 == 1 && E().getResources().getConfiguration().orientation == 2) ? this.L0 : this.K0);
        L();
        throw null;
    }

    @Override // defpackage.ph, defpackage.pm
    public final void z() {
        this.r0.Y.clear();
        super.z();
    }
}
