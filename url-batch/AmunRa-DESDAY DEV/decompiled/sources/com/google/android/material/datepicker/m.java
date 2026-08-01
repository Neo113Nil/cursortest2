package com.google.android.material.datepicker;

import K.G;
import K.S;
import K.x0;
import K.z0;
import L0.ViewOnClickListenerC0025a;
import X.DialogInterfaceOnCancelListenerC0044m;
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
import com.visualfortune.eyerest.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o0.AbstractC0275a;
import z0.ViewOnTouchListenerC0338a;

/* loaded from: classes.dex */
public final class m<S> extends DialogInterfaceOnCancelListenerC0044m {

    /* renamed from: A0, reason: collision with root package name */
    public I0.g f1707A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f1708B0;

    /* renamed from: C0, reason: collision with root package name */
    public CharSequence f1709C0;
    public CharSequence D0;

    /* renamed from: g0, reason: collision with root package name */
    public final LinkedHashSet f1710g0;

    /* renamed from: h0, reason: collision with root package name */
    public final LinkedHashSet f1711h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f1712i0;
    public t j0;

    /* renamed from: k0, reason: collision with root package name */
    public b f1713k0;

    /* renamed from: l0, reason: collision with root package name */
    public k f1714l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f1715m0;
    public CharSequence n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f1716o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f1717p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f1718q0;

    /* renamed from: r0, reason: collision with root package name */
    public CharSequence f1719r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f1720s0;

    /* renamed from: t0, reason: collision with root package name */
    public CharSequence f1721t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f1722u0;

    /* renamed from: v0, reason: collision with root package name */
    public CharSequence f1723v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f1724w0;

    /* renamed from: x0, reason: collision with root package name */
    public CharSequence f1725x0;
    public TextView y0;

    /* renamed from: z0, reason: collision with root package name */
    public CheckableImageButton f1726z0;

    public m() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f1710g0 = new LinkedHashSet();
        this.f1711h0 = new LinkedHashSet();
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(s1.l.W(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, new int[]{i});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    @Override // X.DialogInterfaceOnCancelListenerC0044m
    public final Dialog G() {
        Context C2 = C();
        C();
        int i = this.f1712i0;
        if (i == 0) {
            H();
            throw null;
        }
        Dialog dialog = new Dialog(C2, i);
        Context context = dialog.getContext();
        this.f1716o0 = J(context, android.R.attr.windowFullscreen);
        this.f1707A0 = new I0.g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0275a.f3347l, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f1707A0.h(context);
        this.f1707A0.j(ColorStateList.valueOf(color));
        I0.g gVar = this.f1707A0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = S.f362a;
        gVar.i(G.i(decorView));
        return dialog;
    }

    public final void H() {
        if (this.f1012f.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // X.DialogInterfaceOnCancelListenerC0044m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f1710g0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // X.DialogInterfaceOnCancelListenerC0044m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f1711h0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f995E;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // X.DialogInterfaceOnCancelListenerC0044m, X.AbstractComponentCallbacksC0048q
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f1012f;
        }
        this.f1712i0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1713k0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1715m0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.n0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f1717p0 = bundle.getInt("INPUT_MODE_KEY");
        this.f1718q0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1719r0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f1720s0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f1721t0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f1722u0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1723v0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f1724w0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f1725x0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.n0;
        if (charSequence == null) {
            charSequence = C().getResources().getText(this.f1715m0);
        }
        this.f1709C0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.D0 = charSequence;
    }

    @Override // X.AbstractComponentCallbacksC0048q
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.f1716o0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f1716o0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(I(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(I(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = S.f362a;
        textView.setAccessibilityLiveRegion(1);
        this.f1726z0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.y0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f1726z0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f1726z0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, s1.l.z(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], s1.l.z(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f1726z0.setChecked(this.f1717p0 != 0);
        S.l(this.f1726z0, null);
        CheckableImageButton checkableImageButton2 = this.f1726z0;
        this.f1726z0.setContentDescription(this.f1717p0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f1726z0.setOnClickListener(new ViewOnClickListenerC0025a(6, this));
        H();
        throw null;
    }

    @Override // X.DialogInterfaceOnCancelListenerC0044m, X.AbstractComponentCallbacksC0048q
    public final void x(Bundle bundle) {
        super.x(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f1712i0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f1713k0;
        a aVar = new a();
        int i = a.f1669b;
        int i2 = a.f1669b;
        long j2 = bVar.f1671a.f1733f;
        long j3 = bVar.f1672b.f1733f;
        aVar.f1670a = Long.valueOf(bVar.d.f1733f);
        k kVar = this.f1714l0;
        o oVar = kVar == null ? null : kVar.f1695W;
        if (oVar != null) {
            aVar.f1670a = Long.valueOf(oVar.f1733f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f1673c);
        o b2 = o.b(j2);
        o b3 = o.b(j3);
        d dVar = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = aVar.f1670a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b2, b3, dVar, l2 == null ? null : o.b(l2.longValue()), bVar.f1674e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f1715m0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.n0);
        bundle.putInt("INPUT_MODE_KEY", this.f1717p0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f1718q0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f1719r0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1720s0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1721t0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f1722u0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f1723v0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1724w0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1725x0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.DialogInterfaceOnCancelListenerC0044m, X.AbstractComponentCallbacksC0048q
    public final void y() {
        x0 x0Var;
        x0 x0Var2;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        super.y();
        Dialog dialog = this.f977c0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f1716o0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f1707A0);
            if (!this.f1708B0) {
                View findViewById = D().findViewById(R.id.fullscreen_header);
                ColorStateList x2 = s1.d.x(findViewById.getBackground());
                Integer valueOf = x2 != null ? Integer.valueOf(x2.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z2 = false;
                boolean z3 = valueOf == null || valueOf.intValue() == 0;
                int m2 = k1.c.m(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z3) {
                    valueOf = Integer.valueOf(m2);
                }
                s1.l.a0(window, false);
                window.getContext();
                int d = i < 27 ? C.a.d(k1.c.m(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(d);
                boolean z4 = k1.c.p(0) || k1.c.p(valueOf.intValue());
                C.g gVar = new C.g(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController2 = window.getInsetsController();
                    z0 z0Var = new z0(insetsController2, gVar);
                    z0Var.i = window;
                    x0Var = z0Var;
                } else {
                    x0Var = new x0(window, gVar);
                }
                x0Var.Z(z4);
                boolean p2 = k1.c.p(m2);
                if (k1.c.p(d) || (d == 0 && p2)) {
                    z2 = true;
                }
                C.g gVar2 = new C.g(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController = window.getInsetsController();
                    z0 z0Var2 = new z0(insetsController, gVar2);
                    z0Var2.i = window;
                    x0Var2 = z0Var2;
                } else {
                    x0Var2 = new x0(window, gVar2);
                }
                x0Var2.Y(z2);
                l lVar = new l(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = S.f362a;
                G.u(findViewById, lVar);
                this.f1708B0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = C().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f1707A0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f977c0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new ViewOnTouchListenerC0338a(dialog2, rect));
        }
        C();
        int i2 = this.f1712i0;
        if (i2 == 0) {
            H();
            throw null;
        }
        H();
        b bVar = this.f1713k0;
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.d);
        kVar.F(bundle);
        this.f1714l0 = kVar;
        t tVar = kVar;
        if (this.f1717p0 == 1) {
            H();
            b bVar2 = this.f1713k0;
            t nVar = new n();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i2);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            nVar.F(bundle2);
            tVar = nVar;
        }
        this.j0 = tVar;
        this.y0.setText((this.f1717p0 == 1 && C().getResources().getConfiguration().orientation == 2) ? this.D0 : this.f1709C0);
        H();
        throw null;
    }

    @Override // X.DialogInterfaceOnCancelListenerC0044m, X.AbstractComponentCallbacksC0048q
    public final void z() {
        this.j0.f1745T.clear();
        super.z();
    }
}
