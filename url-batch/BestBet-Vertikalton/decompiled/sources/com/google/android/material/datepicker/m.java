package com.google.android.material.datepicker;

import K.F;
import K.Q;
import K.x0;
import K.z0;
import U0.ViewOnClickListenerC0031a;
import Y.DialogInterfaceOnCancelListenerC0046m;
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
import c1.AbstractC0091d;
import com.fortunequest.neontrack.R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import x0.AbstractC0393a;

/* loaded from: classes.dex */
public final class m<S> extends DialogInterfaceOnCancelListenerC0046m {

    /* renamed from: A0, reason: collision with root package name */
    public R0.g f2279A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f2280B0;

    /* renamed from: C0, reason: collision with root package name */
    public CharSequence f2281C0;

    /* renamed from: D0, reason: collision with root package name */
    public CharSequence f2282D0;

    /* renamed from: g0, reason: collision with root package name */
    public final LinkedHashSet f2283g0;

    /* renamed from: h0, reason: collision with root package name */
    public final LinkedHashSet f2284h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f2285i0;

    /* renamed from: j0, reason: collision with root package name */
    public t f2286j0;

    /* renamed from: k0, reason: collision with root package name */
    public b f2287k0;

    /* renamed from: l0, reason: collision with root package name */
    public k f2288l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f2289m0;

    /* renamed from: n0, reason: collision with root package name */
    public CharSequence f2290n0;
    public boolean o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f2291p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f2292q0;

    /* renamed from: r0, reason: collision with root package name */
    public CharSequence f2293r0;
    public int s0;

    /* renamed from: t0, reason: collision with root package name */
    public CharSequence f2294t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f2295u0;

    /* renamed from: v0, reason: collision with root package name */
    public CharSequence f2296v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f2297w0;

    /* renamed from: x0, reason: collision with root package name */
    public CharSequence f2298x0;

    /* renamed from: y0, reason: collision with root package name */
    public TextView f2299y0;

    /* renamed from: z0, reason: collision with root package name */
    public CheckableImageButton f2300z0;

    public m() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f2283g0 = new LinkedHashSet();
        this.f2284h0 = new LinkedHashSet();
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(H1.d.f0(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, new int[]{i});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    @Override // Y.DialogInterfaceOnCancelListenerC0046m
    public final Dialog G() {
        Context C2 = C();
        C();
        int i = this.f2285i0;
        if (i == 0) {
            H();
            throw null;
        }
        Dialog dialog = new Dialog(C2, i);
        Context context = dialog.getContext();
        this.o0 = J(context, android.R.attr.windowFullscreen);
        this.f2279A0 = new R0.g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0393a.f4551l, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f2279A0.h(context);
        this.f2279A0.j(ColorStateList.valueOf(color));
        R0.g gVar = this.f2279A0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = Q.f578a;
        gVar.i(F.i(decorView));
        return dialog;
    }

    public final void H() {
        if (this.f1463f.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // Y.DialogInterfaceOnCancelListenerC0046m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f2283g0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // Y.DialogInterfaceOnCancelListenerC0046m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f2284h0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f1446E;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // Y.DialogInterfaceOnCancelListenerC0046m, Y.AbstractComponentCallbacksC0050q
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f1463f;
        }
        this.f2285i0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2287k0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2289m0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f2290n0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f2291p0 = bundle.getInt("INPUT_MODE_KEY");
        this.f2292q0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f2293r0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.s0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f2294t0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f2295u0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f2296v0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f2297w0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f2298x0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f2290n0;
        if (charSequence == null) {
            charSequence = C().getResources().getText(this.f2289m0);
        }
        this.f2281C0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f2282D0 = charSequence;
    }

    @Override // Y.AbstractComponentCallbacksC0050q
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.o0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.o0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(I(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(I(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = Q.f578a;
        textView.setAccessibilityLiveRegion(1);
        this.f2300z0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f2299y0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f2300z0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f2300z0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC0091d.j(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC0091d.j(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f2300z0.setChecked(this.f2291p0 != 0);
        Q.l(this.f2300z0, null);
        CheckableImageButton checkableImageButton2 = this.f2300z0;
        this.f2300z0.setContentDescription(this.f2291p0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f2300z0.setOnClickListener(new ViewOnClickListenerC0031a(3, this));
        H();
        throw null;
    }

    @Override // Y.DialogInterfaceOnCancelListenerC0046m, Y.AbstractComponentCallbacksC0050q
    public final void x(Bundle bundle) {
        super.x(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f2285i0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f2287k0;
        a aVar = new a();
        int i = a.f2241b;
        int i2 = a.f2241b;
        long j2 = bVar.f2243a.f2307f;
        long j3 = bVar.f2244b.f2307f;
        aVar.f2242a = Long.valueOf(bVar.d.f2307f);
        k kVar = this.f2288l0;
        o oVar = kVar == null ? null : kVar.f2267W;
        if (oVar != null) {
            aVar.f2242a = Long.valueOf(oVar.f2307f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f2245c);
        o b2 = o.b(j2);
        o b3 = o.b(j3);
        d dVar = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = aVar.f2242a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b2, b3, dVar, l2 == null ? null : o.b(l2.longValue()), bVar.f2246e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f2289m0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f2290n0);
        bundle.putInt("INPUT_MODE_KEY", this.f2291p0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f2292q0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f2293r0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.s0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f2294t0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f2295u0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f2296v0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f2297w0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f2298x0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y.DialogInterfaceOnCancelListenerC0046m, Y.AbstractComponentCallbacksC0050q
    public final void y() {
        x0 x0Var;
        x0 x0Var2;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        super.y();
        Dialog dialog = this.f1427c0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.o0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f2279A0);
            if (!this.f2280B0) {
                View findViewById = D().findViewById(R.id.fullscreen_header);
                ColorStateList D2 = H1.l.D(findViewById.getBackground());
                Integer valueOf = D2 != null ? Integer.valueOf(D2.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z2 = false;
                boolean z3 = valueOf == null || valueOf.intValue() == 0;
                int z4 = H1.l.z(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z3) {
                    valueOf = Integer.valueOf(z4);
                }
                H1.d.j0(window, false);
                window.getContext();
                int d = i < 27 ? C.a.d(H1.l.z(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(d);
                boolean z5 = H1.l.M(0) || H1.l.M(valueOf.intValue());
                A0.c cVar = new A0.c(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController2 = window.getInsetsController();
                    z0 z0Var = new z0(insetsController2, cVar);
                    z0Var.f677f = window;
                    x0Var = z0Var;
                } else {
                    x0Var = new x0(window, cVar);
                }
                x0Var.i0(z5);
                boolean M2 = H1.l.M(z4);
                if (H1.l.M(d) || (d == 0 && M2)) {
                    z2 = true;
                }
                A0.c cVar2 = new A0.c(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController = window.getInsetsController();
                    z0 z0Var2 = new z0(insetsController, cVar2);
                    z0Var2.f677f = window;
                    x0Var2 = z0Var2;
                } else {
                    x0Var2 = new x0(window, cVar2);
                }
                x0Var2.h0(z2);
                l lVar = new l(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = Q.f578a;
                F.u(findViewById, lVar);
                this.f2280B0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = C().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f2279A0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f1427c0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new I0.a(dialog2, rect));
        }
        C();
        int i2 = this.f2285i0;
        if (i2 == 0) {
            H();
            throw null;
        }
        H();
        b bVar = this.f2287k0;
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.d);
        kVar.F(bundle);
        this.f2288l0 = kVar;
        t tVar = kVar;
        if (this.f2291p0 == 1) {
            H();
            b bVar2 = this.f2287k0;
            t nVar = new n();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i2);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            nVar.F(bundle2);
            tVar = nVar;
        }
        this.f2286j0 = tVar;
        this.f2299y0.setText((this.f2291p0 == 1 && C().getResources().getConfiguration().orientation == 2) ? this.f2282D0 : this.f2281C0);
        H();
        throw null;
    }

    @Override // Y.DialogInterfaceOnCancelListenerC0046m, Y.AbstractComponentCallbacksC0050q
    public final void z() {
        this.f2286j0.f2319T.clear();
        super.z();
    }
}
