package com.google.android.material.datepicker;

import M.E;
import M.P;
import M.u0;
import M.w0;
import Q0.ViewOnClickListenerC0030a;
import Z.DialogInterfaceOnCancelListenerC0049m;
import a.AbstractC0058a;
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
import com.winpower.neonfit.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import t0.AbstractC0383a;

/* loaded from: classes.dex */
public final class m<S> extends DialogInterfaceOnCancelListenerC0049m {

    /* renamed from: A0, reason: collision with root package name */
    public N0.g f2392A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f2393B0;

    /* renamed from: C0, reason: collision with root package name */
    public CharSequence f2394C0;
    public CharSequence D0;

    /* renamed from: g0, reason: collision with root package name */
    public final LinkedHashSet f2395g0;

    /* renamed from: h0, reason: collision with root package name */
    public final LinkedHashSet f2396h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f2397i0;

    /* renamed from: j0, reason: collision with root package name */
    public t f2398j0;

    /* renamed from: k0, reason: collision with root package name */
    public b f2399k0;

    /* renamed from: l0, reason: collision with root package name */
    public k f2400l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f2401m0;

    /* renamed from: n0, reason: collision with root package name */
    public CharSequence f2402n0;
    public boolean o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f2403p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f2404q0;

    /* renamed from: r0, reason: collision with root package name */
    public CharSequence f2405r0;
    public int s0;

    /* renamed from: t0, reason: collision with root package name */
    public CharSequence f2406t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f2407u0;

    /* renamed from: v0, reason: collision with root package name */
    public CharSequence f2408v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f2409w0;

    /* renamed from: x0, reason: collision with root package name */
    public CharSequence f2410x0;

    /* renamed from: y0, reason: collision with root package name */
    public TextView f2411y0;

    /* renamed from: z0, reason: collision with root package name */
    public CheckableImageButton f2412z0;

    public m() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f2395g0 = new LinkedHashSet();
        this.f2396h0 = new LinkedHashSet();
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0058a.X(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, new int[]{i});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    @Override // Z.DialogInterfaceOnCancelListenerC0049m
    public final Dialog G() {
        Context C2 = C();
        C();
        int i = this.f2397i0;
        if (i == 0) {
            H();
            throw null;
        }
        Dialog dialog = new Dialog(C2, i);
        Context context = dialog.getContext();
        this.o0 = J(context, android.R.attr.windowFullscreen);
        this.f2392A0 = new N0.g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0383a.f4155l, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f2392A0.h(context);
        this.f2392A0.j(ColorStateList.valueOf(color));
        N0.g gVar = this.f2392A0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = P.f711a;
        gVar.i(E.i(decorView));
        return dialog;
    }

    public final void H() {
        if (this.f1612f.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // Z.DialogInterfaceOnCancelListenerC0049m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f2395g0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // Z.DialogInterfaceOnCancelListenerC0049m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f2396h0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f1595E;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // Z.DialogInterfaceOnCancelListenerC0049m, Z.AbstractComponentCallbacksC0053q
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f1612f;
        }
        this.f2397i0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2399k0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2401m0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f2402n0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f2403p0 = bundle.getInt("INPUT_MODE_KEY");
        this.f2404q0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f2405r0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.s0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f2406t0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f2407u0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f2408v0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f2409w0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f2410x0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f2402n0;
        if (charSequence == null) {
            charSequence = C().getResources().getText(this.f2401m0);
        }
        this.f2394C0 = charSequence;
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

    @Override // Z.AbstractComponentCallbacksC0053q
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.o0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.o0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(I(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(I(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = P.f711a;
        textView.setAccessibilityLiveRegion(1);
        this.f2412z0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f2411y0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f2412z0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f2412z0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, H1.d.F(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], H1.d.F(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f2412z0.setChecked(this.f2403p0 != 0);
        P.l(this.f2412z0, null);
        CheckableImageButton checkableImageButton2 = this.f2412z0;
        this.f2412z0.setContentDescription(this.f2403p0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f2412z0.setOnClickListener(new ViewOnClickListenerC0030a(5, this));
        H();
        throw null;
    }

    @Override // Z.DialogInterfaceOnCancelListenerC0049m, Z.AbstractComponentCallbacksC0053q
    public final void x(Bundle bundle) {
        super.x(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f2397i0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f2399k0;
        a aVar = new a();
        int i = a.f2353b;
        int i2 = a.f2353b;
        long j = bVar.f2355a.f2419f;
        long j2 = bVar.f2356b.f2419f;
        aVar.f2354a = Long.valueOf(bVar.f2358d.f2419f);
        k kVar = this.f2400l0;
        o oVar = kVar == null ? null : kVar.f2380W;
        if (oVar != null) {
            aVar.f2354a = Long.valueOf(oVar.f2419f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f2357c);
        o b2 = o.b(j);
        o b3 = o.b(j2);
        d dVar = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = aVar.f2354a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b2, b3, dVar, l2 == null ? null : o.b(l2.longValue()), bVar.e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f2401m0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f2402n0);
        bundle.putInt("INPUT_MODE_KEY", this.f2403p0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f2404q0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f2405r0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.s0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f2406t0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f2407u0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f2408v0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f2409w0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f2410x0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z.DialogInterfaceOnCancelListenerC0049m, Z.AbstractComponentCallbacksC0053q
    public final void y() {
        u0 u0Var;
        u0 u0Var2;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        super.y();
        Dialog dialog = this.f1576c0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.o0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f2392A0);
            if (!this.f2393B0) {
                View findViewById = D().findViewById(R.id.fullscreen_header);
                ColorStateList t2 = AbstractC0058a.t(findViewById.getBackground());
                Integer valueOf = t2 != null ? Integer.valueOf(t2.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z2 = false;
                boolean z3 = valueOf == null || valueOf.intValue() == 0;
                int t3 = H1.l.t(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z3) {
                    valueOf = Integer.valueOf(t3);
                }
                H1.l.W(window, false);
                window.getContext();
                int d2 = i < 27 ? E.a.d(H1.l.t(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(d2);
                boolean z4 = H1.l.D(0) || H1.l.D(valueOf.intValue());
                C1.d dVar = new C1.d(window.getDecorView());
                if (i >= 30) {
                    insetsController2 = window.getInsetsController();
                    w0 w0Var = new w0(insetsController2, dVar);
                    w0Var.f800c = window;
                    u0Var = w0Var;
                } else {
                    u0Var = new u0(window, dVar);
                }
                u0Var.d0(z4);
                boolean D2 = H1.l.D(t3);
                if (H1.l.D(d2) || (d2 == 0 && D2)) {
                    z2 = true;
                }
                C1.d dVar2 = new C1.d(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController = window.getInsetsController();
                    w0 w0Var2 = new w0(insetsController, dVar2);
                    w0Var2.f800c = window;
                    u0Var2 = w0Var2;
                } else {
                    u0Var2 = new u0(window, dVar2);
                }
                u0Var2.c0(z2);
                l lVar = new l(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = P.f711a;
                E.u(findViewById, lVar);
                this.f2393B0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = C().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f2392A0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f1576c0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new E0.a(dialog2, rect));
        }
        C();
        int i2 = this.f2397i0;
        if (i2 == 0) {
            H();
            throw null;
        }
        H();
        b bVar = this.f2399k0;
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f2358d);
        kVar.F(bundle);
        this.f2400l0 = kVar;
        t tVar = kVar;
        if (this.f2403p0 == 1) {
            H();
            b bVar2 = this.f2399k0;
            t nVar = new n();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i2);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            nVar.F(bundle2);
            tVar = nVar;
        }
        this.f2398j0 = tVar;
        this.f2411y0.setText((this.f2403p0 == 1 && C().getResources().getConfiguration().orientation == 2) ? this.D0 : this.f2394C0);
        H();
        throw null;
    }

    @Override // Z.DialogInterfaceOnCancelListenerC0049m, Z.AbstractComponentCallbacksC0053q
    public final void z() {
        this.f2398j0.f2431T.clear();
        super.z();
    }
}
