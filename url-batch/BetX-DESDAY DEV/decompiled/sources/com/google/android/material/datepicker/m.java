package com.google.android.material.datepicker;

import K.C0;
import K.E0;
import K.L;
import K.X;
import K0.ViewOnClickListenerC0030a;
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
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0056m;
import com.google.android.material.internal.CheckableImageButton;
import com.luckyarcade.spinthrow.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import n0.AbstractC0305a;
import y0.ViewOnTouchListenerC0368a;

/* loaded from: classes.dex */
public final class m<S> extends DialogInterfaceOnCancelListenerC0056m {

    /* renamed from: A0, reason: collision with root package name */
    public H0.g f1870A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f1871B0;
    public CharSequence C0;

    /* renamed from: D0, reason: collision with root package name */
    public CharSequence f1872D0;

    /* renamed from: g0, reason: collision with root package name */
    public final LinkedHashSet f1873g0;

    /* renamed from: h0, reason: collision with root package name */
    public final LinkedHashSet f1874h0;
    public int i0;

    /* renamed from: j0, reason: collision with root package name */
    public t f1875j0;

    /* renamed from: k0, reason: collision with root package name */
    public b f1876k0;

    /* renamed from: l0, reason: collision with root package name */
    public k f1877l0;
    public int m0;

    /* renamed from: n0, reason: collision with root package name */
    public CharSequence f1878n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f1879o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f1880p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f1881q0;

    /* renamed from: r0, reason: collision with root package name */
    public CharSequence f1882r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f1883s0;

    /* renamed from: t0, reason: collision with root package name */
    public CharSequence f1884t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f1885u0;

    /* renamed from: v0, reason: collision with root package name */
    public CharSequence f1886v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f1887w0;
    public CharSequence x0;

    /* renamed from: y0, reason: collision with root package name */
    public TextView f1888y0;

    /* renamed from: z0, reason: collision with root package name */
    public CheckableImageButton f1889z0;

    public m() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f1873g0 = new LinkedHashSet();
        this.f1874h0 = new LinkedHashSet();
    }

    public static int E(Context context) {
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

    public static boolean F(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(q1.l.h0(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, new int[]{i});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0056m
    public final Dialog C() {
        Context y2 = y();
        y();
        int i = this.i0;
        if (i == 0) {
            D();
            throw null;
        }
        Dialog dialog = new Dialog(y2, i);
        Context context = dialog.getContext();
        this.f1879o0 = F(context, android.R.attr.windowFullscreen);
        this.f1870A0 = new H0.g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0305a.f3643l, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f1870A0.h(context);
        this.f1870A0.j(ColorStateList.valueOf(color));
        H0.g gVar = this.f1870A0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = X.f419a;
        gVar.i(L.i(decorView));
        return dialog;
    }

    public final void D() {
        if (this.f1400f.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0056m, androidx.fragment.app.AbstractComponentCallbacksC0060q
    public final void o(Bundle bundle) {
        super.o(bundle);
        if (bundle == null) {
            bundle = this.f1400f;
        }
        this.i0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1876k0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.m0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f1878n0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f1880p0 = bundle.getInt("INPUT_MODE_KEY");
        this.f1881q0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1882r0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f1883s0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f1884t0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f1885u0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1886v0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f1887w0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.x0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f1878n0;
        if (charSequence == null) {
            charSequence = y().getResources().getText(this.m0);
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
        this.f1872D0 = charSequence;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0056m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f1873g0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0056m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f1874h0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f1382E;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0060q
    public final View p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.f1879o0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f1879o0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(E(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(E(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = X.f419a;
        textView.setAccessibilityLiveRegion(1);
        this.f1889z0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f1888y0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f1889z0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f1889z0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, q1.d.z(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], q1.d.z(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f1889z0.setChecked(this.f1880p0 != 0);
        X.l(this.f1889z0, null);
        CheckableImageButton checkableImageButton2 = this.f1889z0;
        this.f1889z0.setContentDescription(this.f1880p0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f1889z0.setOnClickListener(new ViewOnClickListenerC0030a(3, this));
        D();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0056m, androidx.fragment.app.AbstractComponentCallbacksC0060q
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.i0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f1876k0;
        a aVar = new a();
        int i = a.f1831b;
        int i2 = a.f1831b;
        long j2 = bVar.f1833a.f1897f;
        long j3 = bVar.f1834b.f1897f;
        aVar.f1832a = Long.valueOf(bVar.f1836d.f1897f);
        k kVar = this.f1877l0;
        o oVar = kVar == null ? null : kVar.f1858W;
        if (oVar != null) {
            aVar.f1832a = Long.valueOf(oVar.f1897f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f1835c);
        o b2 = o.b(j2);
        o b3 = o.b(j3);
        d dVar = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = aVar.f1832a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b2, b3, dVar, l2 == null ? null : o.b(l2.longValue()), bVar.f1837e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.m0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f1878n0);
        bundle.putInt("INPUT_MODE_KEY", this.f1880p0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f1881q0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f1882r0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1883s0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1884t0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f1885u0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f1886v0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1887w0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.x0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0056m, androidx.fragment.app.AbstractComponentCallbacksC0060q
    public final void u() {
        C0 c02;
        C0 c03;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        super.u();
        Dialog dialog = this.f1362c0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f1879o0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f1870A0);
            if (!this.f1871B0) {
                View findViewById = z().findViewById(R.id.fullscreen_header);
                ColorStateList l2 = i1.m.l(findViewById.getBackground());
                Integer valueOf = l2 != null ? Integer.valueOf(l2.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z2 = false;
                boolean z3 = valueOf == null || valueOf.intValue() == 0;
                int g2 = i1.r.g(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z3) {
                    valueOf = Integer.valueOf(g2);
                }
                q1.l.n0(window, false);
                window.getContext();
                int d2 = i < 27 ? C.a.d(i1.r.g(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(d2);
                boolean z4 = i1.r.k(0) || i1.r.k(valueOf.intValue());
                B0.d dVar = new B0.d(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController2 = window.getInsetsController();
                    E0 e02 = new E0(insetsController2, dVar);
                    e02.h = window;
                    c02 = e02;
                } else {
                    c02 = new C0(window, dVar);
                }
                c02.m0(z4);
                boolean k2 = i1.r.k(g2);
                if (i1.r.k(d2) || (d2 == 0 && k2)) {
                    z2 = true;
                }
                B0.d dVar2 = new B0.d(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController = window.getInsetsController();
                    E0 e03 = new E0(insetsController, dVar2);
                    e03.h = window;
                    c03 = e03;
                } else {
                    c03 = new C0(window, dVar2);
                }
                c03.l0(z2);
                l lVar = new l(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = X.f419a;
                L.u(findViewById, lVar);
                this.f1871B0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = y().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f1870A0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f1362c0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new ViewOnTouchListenerC0368a(dialog2, rect));
        }
        y();
        int i2 = this.i0;
        if (i2 == 0) {
            D();
            throw null;
        }
        D();
        b bVar = this.f1876k0;
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f1836d);
        kVar.B(bundle);
        this.f1877l0 = kVar;
        t tVar = kVar;
        if (this.f1880p0 == 1) {
            D();
            b bVar2 = this.f1876k0;
            t nVar = new n();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i2);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            nVar.B(bundle2);
            tVar = nVar;
        }
        this.f1875j0 = tVar;
        this.f1888y0.setText((this.f1880p0 == 1 && y().getResources().getConfiguration().orientation == 2) ? this.f1872D0 : this.C0);
        D();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0056m, androidx.fragment.app.AbstractComponentCallbacksC0060q
    public final void v() {
        this.f1875j0.f1911T.clear();
        super.v();
    }
}
