package com.google.android.material.datepicker;

import L.A0;
import L.C0;
import L.H;
import L.T;
import N0.ViewOnClickListenerC0028a;
import Z.DialogInterfaceOnCancelListenerC0046m;
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
import com.winfour.winrandom.R;
import h.AbstractC0112a;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import q0.AbstractC0285a;

/* loaded from: classes.dex */
public final class m<S> extends DialogInterfaceOnCancelListenerC0046m {
    public K0.g A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f1899B0;

    /* renamed from: C0, reason: collision with root package name */
    public CharSequence f1900C0;

    /* renamed from: D0, reason: collision with root package name */
    public CharSequence f1901D0;

    /* renamed from: g0, reason: collision with root package name */
    public final LinkedHashSet f1902g0;

    /* renamed from: h0, reason: collision with root package name */
    public final LinkedHashSet f1903h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f1904i0;

    /* renamed from: j0, reason: collision with root package name */
    public t f1905j0;

    /* renamed from: k0, reason: collision with root package name */
    public b f1906k0;
    public k l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f1907m0;

    /* renamed from: n0, reason: collision with root package name */
    public CharSequence f1908n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f1909o0;
    public int p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f1910q0;

    /* renamed from: r0, reason: collision with root package name */
    public CharSequence f1911r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f1912s0;

    /* renamed from: t0, reason: collision with root package name */
    public CharSequence f1913t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f1914u0;

    /* renamed from: v0, reason: collision with root package name */
    public CharSequence f1915v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f1916w0;

    /* renamed from: x0, reason: collision with root package name */
    public CharSequence f1917x0;

    /* renamed from: y0, reason: collision with root package name */
    public TextView f1918y0;

    /* renamed from: z0, reason: collision with root package name */
    public CheckableImageButton f1919z0;

    public m() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f1902g0 = new LinkedHashSet();
        this.f1903h0 = new LinkedHashSet();
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(A1.m.b0(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, new int[]{i});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    @Override // Z.DialogInterfaceOnCancelListenerC0046m
    public final Dialog G() {
        Context C2 = C();
        C();
        int i = this.f1904i0;
        if (i == 0) {
            H();
            throw null;
        }
        Dialog dialog = new Dialog(C2, i);
        Context context = dialog.getContext();
        this.f1909o0 = J(context, android.R.attr.windowFullscreen);
        this.A0 = new K0.g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0285a.f3509l, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.A0.h(context);
        this.A0.j(ColorStateList.valueOf(color));
        K0.g gVar = this.A0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = T.f490a;
        gVar.i(H.i(decorView));
        return dialog;
    }

    public final void H() {
        if (this.f1183f.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // Z.DialogInterfaceOnCancelListenerC0046m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f1902g0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // Z.DialogInterfaceOnCancelListenerC0046m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f1903h0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f1166E;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // Z.DialogInterfaceOnCancelListenerC0046m, Z.AbstractComponentCallbacksC0050q
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f1183f;
        }
        this.f1904i0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1906k0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1907m0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f1908n0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.p0 = bundle.getInt("INPUT_MODE_KEY");
        this.f1910q0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1911r0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f1912s0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f1913t0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f1914u0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1915v0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f1916w0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f1917x0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f1908n0;
        if (charSequence == null) {
            charSequence = C().getResources().getText(this.f1907m0);
        }
        this.f1900C0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f1901D0 = charSequence;
    }

    @Override // Z.AbstractComponentCallbacksC0050q
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.f1909o0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f1909o0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(I(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(I(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = T.f490a;
        textView.setAccessibilityLiveRegion(1);
        this.f1919z0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f1918y0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f1919z0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f1919z0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC0112a.l(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC0112a.l(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f1919z0.setChecked(this.p0 != 0);
        T.l(this.f1919z0, null);
        CheckableImageButton checkableImageButton2 = this.f1919z0;
        this.f1919z0.setContentDescription(this.p0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f1919z0.setOnClickListener(new ViewOnClickListenerC0028a(5, this));
        H();
        throw null;
    }

    @Override // Z.DialogInterfaceOnCancelListenerC0046m, Z.AbstractComponentCallbacksC0050q
    public final void x(Bundle bundle) {
        super.x(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f1904i0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f1906k0;
        a aVar = new a();
        int i = a.f1860b;
        int i2 = a.f1860b;
        long j2 = bVar.f1862a.f1926f;
        long j3 = bVar.f1863b.f1926f;
        aVar.f1861a = Long.valueOf(bVar.d.f1926f);
        k kVar = this.l0;
        o oVar = kVar == null ? null : kVar.f1887W;
        if (oVar != null) {
            aVar.f1861a = Long.valueOf(oVar.f1926f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f1864c);
        o b2 = o.b(j2);
        o b3 = o.b(j3);
        d dVar = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = aVar.f1861a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b2, b3, dVar, l2 == null ? null : o.b(l2.longValue()), bVar.f1865e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f1907m0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f1908n0);
        bundle.putInt("INPUT_MODE_KEY", this.p0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f1910q0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f1911r0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1912s0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1913t0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f1914u0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f1915v0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1916w0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1917x0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z.DialogInterfaceOnCancelListenerC0046m, Z.AbstractComponentCallbacksC0050q
    public final void y() {
        A0 a02;
        A0 a03;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        super.y();
        Dialog dialog = this.f1146c0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f1909o0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.A0);
            if (!this.f1899B0) {
                View findViewById = D().findViewById(R.id.fullscreen_header);
                ColorStateList t2 = A1.m.t(findViewById.getBackground());
                Integer valueOf = t2 != null ? Integer.valueOf(t2.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z2 = false;
                boolean z3 = valueOf == null || valueOf.intValue() == 0;
                int A2 = A1.d.A(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z3) {
                    valueOf = Integer.valueOf(A2);
                }
                A1.d.f0(window, false);
                window.getContext();
                int d = i < 27 ? D.a.d(A1.d.A(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(d);
                boolean z4 = A1.d.O(0) || A1.d.O(valueOf.intValue());
                D.g gVar = new D.g(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController2 = window.getInsetsController();
                    C0 c02 = new C0(insetsController2, gVar);
                    c02.f478f = window;
                    a02 = c02;
                } else {
                    a02 = new A0(window, gVar);
                }
                a02.e0(z4);
                boolean O2 = A1.d.O(A2);
                if (A1.d.O(d) || (d == 0 && O2)) {
                    z2 = true;
                }
                D.g gVar2 = new D.g(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController = window.getInsetsController();
                    C0 c03 = new C0(insetsController, gVar2);
                    c03.f478f = window;
                    a03 = c03;
                } else {
                    a03 = new A0(window, gVar2);
                }
                a03.d0(z2);
                l lVar = new l(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = T.f490a;
                H.u(findViewById, lVar);
                this.f1899B0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = C().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.A0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f1146c0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new B0.a(dialog2, rect));
        }
        C();
        int i2 = this.f1904i0;
        if (i2 == 0) {
            H();
            throw null;
        }
        H();
        b bVar = this.f1906k0;
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.d);
        kVar.F(bundle);
        this.l0 = kVar;
        t tVar = kVar;
        if (this.p0 == 1) {
            H();
            b bVar2 = this.f1906k0;
            t nVar = new n();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i2);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            nVar.F(bundle2);
            tVar = nVar;
        }
        this.f1905j0 = tVar;
        this.f1918y0.setText((this.p0 == 1 && C().getResources().getConfiguration().orientation == 2) ? this.f1901D0 : this.f1900C0);
        H();
        throw null;
    }

    @Override // Z.DialogInterfaceOnCancelListenerC0046m, Z.AbstractComponentCallbacksC0050q
    public final void z() {
        this.f1905j0.f1938T.clear();
        super.z();
    }
}
