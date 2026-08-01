package com.google.android.material.datepicker;

import K.A0;
import K.H;
import K.T;
import K.y0;
import K0.ViewOnClickListenerC0026a;
import X.DialogInterfaceOnCancelListenerC0045m;
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
import android.view.WindowInsetsController;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.skydrop.fallring.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import n0.AbstractC0279a;
import y0.ViewOnTouchListenerC0344a;

/* loaded from: classes.dex */
public final class m<S> extends DialogInterfaceOnCancelListenerC0045m {

    /* renamed from: A0, reason: collision with root package name */
    public H0.g f1677A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f1678B0;
    public CharSequence C0;

    /* renamed from: D0, reason: collision with root package name */
    public CharSequence f1679D0;

    /* renamed from: g0, reason: collision with root package name */
    public final LinkedHashSet f1680g0;

    /* renamed from: h0, reason: collision with root package name */
    public final LinkedHashSet f1681h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f1682i0;
    public t j0;

    /* renamed from: k0, reason: collision with root package name */
    public b f1683k0;

    /* renamed from: l0, reason: collision with root package name */
    public k f1684l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f1685m0;

    /* renamed from: n0, reason: collision with root package name */
    public CharSequence f1686n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f1687o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f1688p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f1689q0;

    /* renamed from: r0, reason: collision with root package name */
    public CharSequence f1690r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f1691s0;

    /* renamed from: t0, reason: collision with root package name */
    public CharSequence f1692t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f1693u0;

    /* renamed from: v0, reason: collision with root package name */
    public CharSequence f1694v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f1695w0;
    public CharSequence x0;

    /* renamed from: y0, reason: collision with root package name */
    public TextView f1696y0;

    /* renamed from: z0, reason: collision with root package name */
    public CheckableImageButton f1697z0;

    public m() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f1680g0 = new LinkedHashSet();
        this.f1681h0 = new LinkedHashSet();
    }

    public static int I(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b2 = w.b();
        b2.set(5, 1);
        Calendar a2 = w.a(b2);
        a2.get(2);
        a2.get(1);
        int maximum = a2.getMaximum(7);
        a2.getActualMaximum(5);
        a2.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean J(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(q1.l.S(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, new int[]{i});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    @Override // X.DialogInterfaceOnCancelListenerC0045m
    public final Dialog G() {
        Context C2 = C();
        C();
        int i = this.f1682i0;
        if (i == 0) {
            H();
            throw null;
        }
        Dialog dialog = new Dialog(C2, i);
        Context context = dialog.getContext();
        this.f1687o0 = J(context, android.R.attr.windowFullscreen);
        this.f1677A0 = new H0.g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0279a.f3274l, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f1677A0.h(context);
        this.f1677A0.j(ColorStateList.valueOf(color));
        H0.g gVar = this.f1677A0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = T.f381a;
        gVar.i(H.i(decorView));
        return dialog;
    }

    public final void H() {
        if (this.f975f.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // X.DialogInterfaceOnCancelListenerC0045m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f1680g0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // X.DialogInterfaceOnCancelListenerC0045m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f1681h0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f958E;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // X.DialogInterfaceOnCancelListenerC0045m, X.AbstractComponentCallbacksC0049q
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f975f;
        }
        this.f1682i0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1683k0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1685m0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f1686n0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f1688p0 = bundle.getInt("INPUT_MODE_KEY");
        this.f1689q0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1690r0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f1691s0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f1692t0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f1693u0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1694v0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f1695w0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.x0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f1686n0;
        if (charSequence == null) {
            charSequence = C().getResources().getText(this.f1685m0);
        }
        this.C0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f1679D0 = charSequence;
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.f1687o0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f1687o0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(I(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(I(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = T.f381a;
        textView.setAccessibilityLiveRegion(1);
        this.f1697z0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f1696y0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f1697z0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f1697z0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, q1.l.v(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], q1.l.v(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f1697z0.setChecked(this.f1688p0 != 0);
        T.l(this.f1697z0, null);
        CheckableImageButton checkableImageButton2 = this.f1697z0;
        this.f1697z0.setContentDescription(this.f1688p0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f1697z0.setOnClickListener(new ViewOnClickListenerC0026a(3, this));
        H();
        throw null;
    }

    @Override // X.DialogInterfaceOnCancelListenerC0045m, X.AbstractComponentCallbacksC0049q
    public final void x(Bundle bundle) {
        super.x(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f1682i0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f1683k0;
        a aVar = new a();
        int i = a.f1639b;
        int i2 = a.f1639b;
        long j2 = bVar.f1641a.f1704f;
        long j3 = bVar.f1642b.f1704f;
        aVar.f1640a = Long.valueOf(bVar.d.f1704f);
        k kVar = this.f1684l0;
        o oVar = kVar == null ? null : kVar.f1665W;
        if (oVar != null) {
            aVar.f1640a = Long.valueOf(oVar.f1704f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f1643c);
        o b2 = o.b(j2);
        o b3 = o.b(j3);
        d dVar = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = aVar.f1640a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b2, b3, dVar, l2 == null ? null : o.b(l2.longValue()), bVar.f1644e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f1685m0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f1686n0);
        bundle.putInt("INPUT_MODE_KEY", this.f1688p0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f1689q0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f1690r0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1691s0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1692t0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f1693u0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f1694v0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1695w0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.x0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.DialogInterfaceOnCancelListenerC0045m, X.AbstractComponentCallbacksC0049q
    public final void y() {
        y0 y0Var;
        y0 y0Var2;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        super.y();
        Dialog dialog = this.f939c0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f1687o0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f1677A0);
            if (!this.f1678B0) {
                View findViewById = D().findViewById(R.id.fullscreen_header);
                ColorStateList g2 = i1.p.g(findViewById.getBackground());
                Integer valueOf = g2 != null ? Integer.valueOf(g2.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z2 = false;
                boolean z3 = valueOf == null || valueOf.intValue() == 0;
                int h = i1.r.h(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z3) {
                    valueOf = Integer.valueOf(h);
                }
                q1.d.n0(window, false);
                window.getContext();
                int d = i < 27 ? C.a.d(i1.r.h(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(d);
                boolean z4 = i1.r.l(0) || i1.r.l(valueOf.intValue());
                B0.d dVar = new B0.d(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController2 = window.getInsetsController();
                    A0 a02 = new A0(insetsController2, dVar);
                    a02.f368f = window;
                    y0Var = a02;
                } else {
                    y0Var = new y0(window, dVar);
                }
                y0Var.m0(z4);
                boolean l2 = i1.r.l(h);
                if (i1.r.l(d) || (d == 0 && l2)) {
                    z2 = true;
                }
                B0.d dVar2 = new B0.d(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController = window.getInsetsController();
                    A0 a03 = new A0(insetsController, dVar2);
                    a03.f368f = window;
                    y0Var2 = a03;
                } else {
                    y0Var2 = new y0(window, dVar2);
                }
                y0Var2.l0(z2);
                l lVar = new l(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = T.f381a;
                H.u(findViewById, lVar);
                this.f1678B0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = C().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f1677A0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f939c0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new ViewOnTouchListenerC0344a(dialog2, rect));
        }
        C();
        int i2 = this.f1682i0;
        if (i2 == 0) {
            H();
            throw null;
        }
        H();
        b bVar = this.f1683k0;
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.d);
        kVar.F(bundle);
        this.f1684l0 = kVar;
        t tVar = kVar;
        if (this.f1688p0 == 1) {
            H();
            b bVar2 = this.f1683k0;
            t nVar = new n();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i2);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            nVar.F(bundle2);
            tVar = nVar;
        }
        this.j0 = tVar;
        this.f1696y0.setText((this.f1688p0 == 1 && C().getResources().getConfiguration().orientation == 2) ? this.f1679D0 : this.C0);
        H();
        throw null;
    }

    @Override // X.DialogInterfaceOnCancelListenerC0045m, X.AbstractComponentCallbacksC0049q
    public final void z() {
        this.j0.f1716T.clear();
        super.z();
    }
}
