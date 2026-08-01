package com.google.android.material.datepicker;

import K.A0;
import K.C0;
import K.H;
import K.T;
import M0.ViewOnClickListenerC0028a;
import Y.DialogInterfaceOnCancelListenerC0047m;
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
import com.winworm.neongrid.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k0.AbstractC0180a;
import p0.AbstractC0285a;

/* loaded from: classes.dex */
public final class m<S> extends DialogInterfaceOnCancelListenerC0047m {

    /* renamed from: A0, reason: collision with root package name */
    public J0.g f1830A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f1831B0;

    /* renamed from: C0, reason: collision with root package name */
    public CharSequence f1832C0;

    /* renamed from: D0, reason: collision with root package name */
    public CharSequence f1833D0;

    /* renamed from: g0, reason: collision with root package name */
    public final LinkedHashSet f1834g0;

    /* renamed from: h0, reason: collision with root package name */
    public final LinkedHashSet f1835h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f1836i0;

    /* renamed from: j0, reason: collision with root package name */
    public t f1837j0;

    /* renamed from: k0, reason: collision with root package name */
    public b f1838k0;

    /* renamed from: l0, reason: collision with root package name */
    public k f1839l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f1840m0;

    /* renamed from: n0, reason: collision with root package name */
    public CharSequence f1841n0;
    public boolean o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f1842p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f1843q0;

    /* renamed from: r0, reason: collision with root package name */
    public CharSequence f1844r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f1845s0;

    /* renamed from: t0, reason: collision with root package name */
    public CharSequence f1846t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f1847u0;

    /* renamed from: v0, reason: collision with root package name */
    public CharSequence f1848v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f1849w0;

    /* renamed from: x0, reason: collision with root package name */
    public CharSequence f1850x0;

    /* renamed from: y0, reason: collision with root package name */
    public TextView f1851y0;
    public CheckableImageButton z0;

    public m() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f1834g0 = new LinkedHashSet();
        this.f1835h0 = new LinkedHashSet();
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(z1.d.j0(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, new int[]{i});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    @Override // Y.DialogInterfaceOnCancelListenerC0047m
    public final Dialog G() {
        Context C2 = C();
        C();
        int i = this.f1836i0;
        if (i == 0) {
            H();
            throw null;
        }
        Dialog dialog = new Dialog(C2, i);
        Context context = dialog.getContext();
        this.o0 = J(context, android.R.attr.windowFullscreen);
        this.f1830A0 = new J0.g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0285a.f3331l, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f1830A0.h(context);
        this.f1830A0.j(ColorStateList.valueOf(color));
        J0.g gVar = this.f1830A0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = T.f440a;
        gVar.i(H.i(decorView));
        return dialog;
    }

    public final void H() {
        if (this.f1131f.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // Y.DialogInterfaceOnCancelListenerC0047m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f1834g0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // Y.DialogInterfaceOnCancelListenerC0047m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f1835h0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f1114E;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // Y.DialogInterfaceOnCancelListenerC0047m, Y.AbstractComponentCallbacksC0051q
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f1131f;
        }
        this.f1836i0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1838k0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1840m0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f1841n0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f1842p0 = bundle.getInt("INPUT_MODE_KEY");
        this.f1843q0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1844r0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f1845s0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f1846t0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f1847u0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1848v0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f1849w0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f1850x0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f1841n0;
        if (charSequence == null) {
            charSequence = C().getResources().getText(this.f1840m0);
        }
        this.f1832C0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f1833D0 = charSequence;
    }

    @Override // Y.AbstractComponentCallbacksC0051q
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.o0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.o0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(I(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(I(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = T.f440a;
        textView.setAccessibilityLiveRegion(1);
        this.z0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f1851y0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.z0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.z0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, z1.l.w(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], z1.l.w(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.z0.setChecked(this.f1842p0 != 0);
        T.l(this.z0, null);
        CheckableImageButton checkableImageButton2 = this.z0;
        this.z0.setContentDescription(this.f1842p0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.z0.setOnClickListener(new ViewOnClickListenerC0028a(6, this));
        H();
        throw null;
    }

    @Override // Y.DialogInterfaceOnCancelListenerC0047m, Y.AbstractComponentCallbacksC0051q
    public final void x(Bundle bundle) {
        super.x(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f1836i0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f1838k0;
        a aVar = new a();
        int i = a.f1792b;
        int i2 = a.f1792b;
        long j2 = bVar.f1794a.f1858f;
        long j3 = bVar.f1795b.f1858f;
        aVar.f1793a = Long.valueOf(bVar.d.f1858f);
        k kVar = this.f1839l0;
        o oVar = kVar == null ? null : kVar.f1818W;
        if (oVar != null) {
            aVar.f1793a = Long.valueOf(oVar.f1858f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f1796c);
        o b2 = o.b(j2);
        o b3 = o.b(j3);
        d dVar = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = aVar.f1793a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b2, b3, dVar, l2 == null ? null : o.b(l2.longValue()), bVar.f1797e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f1840m0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f1841n0);
        bundle.putInt("INPUT_MODE_KEY", this.f1842p0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f1843q0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f1844r0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1845s0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1846t0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f1847u0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f1848v0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1849w0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1850x0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y.DialogInterfaceOnCancelListenerC0047m, Y.AbstractComponentCallbacksC0051q
    public final void y() {
        A0 a02;
        A0 a03;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        super.y();
        Dialog dialog = this.f1095c0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.o0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f1830A0);
            if (!this.f1831B0) {
                View findViewById = D().findViewById(R.id.fullscreen_header);
                ColorStateList D2 = z1.d.D(findViewById.getBackground());
                Integer valueOf = D2 != null ? Integer.valueOf(D2.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z2 = false;
                boolean z3 = valueOf == null || valueOf.intValue() == 0;
                int h = AbstractC0180a.h(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z3) {
                    valueOf = Integer.valueOf(h);
                }
                z1.l.V(window, false);
                window.getContext();
                int d = i < 27 ? C.a.d(AbstractC0180a.h(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(d);
                boolean z4 = AbstractC0180a.j(0) || AbstractC0180a.j(valueOf.intValue());
                C.g gVar = new C.g(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController2 = window.getInsetsController();
                    C0 c02 = new C0(insetsController2, gVar);
                    c02.f428f = window;
                    a02 = c02;
                } else {
                    a02 = new A0(window, gVar);
                }
                a02.U(z4);
                boolean j2 = AbstractC0180a.j(h);
                if (AbstractC0180a.j(d) || (d == 0 && j2)) {
                    z2 = true;
                }
                C.g gVar2 = new C.g(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController = window.getInsetsController();
                    C0 c03 = new C0(insetsController, gVar2);
                    c03.f428f = window;
                    a03 = c03;
                } else {
                    a03 = new A0(window, gVar2);
                }
                a03.T(z2);
                l lVar = new l(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = T.f440a;
                H.u(findViewById, lVar);
                this.f1831B0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = C().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f1830A0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f1095c0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new A0.a(dialog2, rect));
        }
        C();
        int i2 = this.f1836i0;
        if (i2 == 0) {
            H();
            throw null;
        }
        H();
        b bVar = this.f1838k0;
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.d);
        kVar.F(bundle);
        this.f1839l0 = kVar;
        t tVar = kVar;
        if (this.f1842p0 == 1) {
            H();
            b bVar2 = this.f1838k0;
            t nVar = new n();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i2);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            nVar.F(bundle2);
            tVar = nVar;
        }
        this.f1837j0 = tVar;
        this.f1851y0.setText((this.f1842p0 == 1 && C().getResources().getConfiguration().orientation == 2) ? this.f1833D0 : this.f1832C0);
        H();
        throw null;
    }

    @Override // Y.DialogInterfaceOnCancelListenerC0047m, Y.AbstractComponentCallbacksC0051q
    public final void z() {
        this.f1837j0.f1870T.clear();
        super.z();
    }
}
