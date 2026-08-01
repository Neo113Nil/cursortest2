package com.google.android.material.datepicker;

import M.F;
import M.Q;
import M.w0;
import M.y0;
import O0.ViewOnClickListenerC0025a;
import Z.DialogInterfaceOnCancelListenerC0043m;
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
import com.winfour.neondrop.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import q0.AbstractC0257a;

/* loaded from: classes.dex */
public final class m<S> extends DialogInterfaceOnCancelListenerC0043m {

    /* renamed from: A0, reason: collision with root package name */
    public L0.g f1884A0;
    public boolean B0;

    /* renamed from: C0, reason: collision with root package name */
    public CharSequence f1885C0;

    /* renamed from: D0, reason: collision with root package name */
    public CharSequence f1886D0;

    /* renamed from: g0, reason: collision with root package name */
    public final LinkedHashSet f1887g0;

    /* renamed from: h0, reason: collision with root package name */
    public final LinkedHashSet f1888h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f1889i0;

    /* renamed from: j0, reason: collision with root package name */
    public t f1890j0;

    /* renamed from: k0, reason: collision with root package name */
    public b f1891k0;

    /* renamed from: l0, reason: collision with root package name */
    public k f1892l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f1893m0;

    /* renamed from: n0, reason: collision with root package name */
    public CharSequence f1894n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f1895o0;
    public int p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f1896q0;

    /* renamed from: r0, reason: collision with root package name */
    public CharSequence f1897r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f1898s0;

    /* renamed from: t0, reason: collision with root package name */
    public CharSequence f1899t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f1900u0;

    /* renamed from: v0, reason: collision with root package name */
    public CharSequence f1901v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f1902w0;

    /* renamed from: x0, reason: collision with root package name */
    public CharSequence f1903x0;

    /* renamed from: y0, reason: collision with root package name */
    public TextView f1904y0;

    /* renamed from: z0, reason: collision with root package name */
    public CheckableImageButton f1905z0;

    public m() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f1887g0 = new LinkedHashSet();
        this.f1888h0 = new LinkedHashSet();
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(z1.l.o0(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, new int[]{i});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    @Override // Z.DialogInterfaceOnCancelListenerC0043m
    public final Dialog G() {
        Context C2 = C();
        C();
        int i = this.f1889i0;
        if (i == 0) {
            H();
            throw null;
        }
        Dialog dialog = new Dialog(C2, i);
        Context context = dialog.getContext();
        this.f1895o0 = J(context, android.R.attr.windowFullscreen);
        this.f1884A0 = new L0.g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0257a.f3389m, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f1884A0.i(context);
        this.f1884A0.l(ColorStateList.valueOf(color));
        L0.g gVar = this.f1884A0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = Q.f513a;
        gVar.k(F.i(decorView));
        return dialog;
    }

    public final void H() {
        if (this.f1193f.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // Z.DialogInterfaceOnCancelListenerC0043m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f1887g0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // Z.DialogInterfaceOnCancelListenerC0043m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f1888h0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f1176E;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // Z.DialogInterfaceOnCancelListenerC0043m, Z.AbstractComponentCallbacksC0047q
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f1193f;
        }
        this.f1889i0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1891k0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1893m0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f1894n0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.p0 = bundle.getInt("INPUT_MODE_KEY");
        this.f1896q0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1897r0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f1898s0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f1899t0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f1900u0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1901v0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f1902w0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f1903x0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f1894n0;
        if (charSequence == null) {
            charSequence = C().getResources().getText(this.f1893m0);
        }
        this.f1885C0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f1886D0 = charSequence;
    }

    @Override // Z.AbstractComponentCallbacksC0047q
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.f1895o0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f1895o0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(I(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(I(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = Q.f513a;
        textView.setAccessibilityLiveRegion(1);
        this.f1905z0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f1904y0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f1905z0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f1905z0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, z1.l.F(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], z1.l.F(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f1905z0.setChecked(this.p0 != 0);
        Q.l(this.f1905z0, null);
        CheckableImageButton checkableImageButton2 = this.f1905z0;
        this.f1905z0.setContentDescription(this.p0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f1905z0.setOnClickListener(new ViewOnClickListenerC0025a(7, this));
        H();
        throw null;
    }

    @Override // Z.DialogInterfaceOnCancelListenerC0043m, Z.AbstractComponentCallbacksC0047q
    public final void x(Bundle bundle) {
        super.x(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f1889i0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f1891k0;
        a aVar = new a();
        int i = a.f1845b;
        int i2 = a.f1845b;
        long j2 = bVar.f1847a.f1912f;
        long j3 = bVar.f1848b.f1912f;
        aVar.f1846a = Long.valueOf(bVar.d.f1912f);
        k kVar = this.f1892l0;
        o oVar = kVar == null ? null : kVar.f1872W;
        if (oVar != null) {
            aVar.f1846a = Long.valueOf(oVar.f1912f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f1849c);
        o b2 = o.b(j2);
        o b3 = o.b(j3);
        d dVar = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = aVar.f1846a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b2, b3, dVar, l2 == null ? null : o.b(l2.longValue()), bVar.f1850e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f1893m0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f1894n0);
        bundle.putInt("INPUT_MODE_KEY", this.p0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f1896q0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f1897r0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1898s0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1899t0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f1900u0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f1901v0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1902w0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1903x0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z.DialogInterfaceOnCancelListenerC0043m, Z.AbstractComponentCallbacksC0047q
    public final void y() {
        w0 w0Var;
        w0 w0Var2;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        super.y();
        Dialog dialog = this.f1157c0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f1895o0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f1884A0);
            if (!this.B0) {
                View findViewById = D().findViewById(R.id.fullscreen_header);
                ColorStateList E2 = z1.l.E(findViewById.getBackground());
                Integer valueOf = E2 != null ? Integer.valueOf(E2.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z2 = false;
                boolean z3 = valueOf == null || valueOf.intValue() == 0;
                int s2 = z1.d.s(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z3) {
                    valueOf = Integer.valueOf(s2);
                }
                z1.d.Y(window, false);
                window.getContext();
                int d = i < 27 ? E.a.d(z1.d.s(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(d);
                boolean z4 = z1.d.F(0) || z1.d.F(valueOf.intValue());
                E.g gVar = new E.g(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController2 = window.getInsetsController();
                    y0 y0Var = new y0(insetsController2, gVar);
                    y0Var.f605f = window;
                    w0Var = y0Var;
                } else {
                    w0Var = new w0(window, gVar);
                }
                w0Var.X(z4);
                boolean F2 = z1.d.F(s2);
                if (z1.d.F(d) || (d == 0 && F2)) {
                    z2 = true;
                }
                E.g gVar2 = new E.g(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController = window.getInsetsController();
                    y0 y0Var2 = new y0(insetsController, gVar2);
                    y0Var2.f605f = window;
                    w0Var2 = y0Var2;
                } else {
                    w0Var2 = new w0(window, gVar2);
                }
                w0Var2.W(z2);
                l lVar = new l(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = Q.f513a;
                F.u(findViewById, lVar);
                this.B0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = C().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f1884A0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f1157c0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new C0.a(dialog2, rect));
        }
        C();
        int i2 = this.f1889i0;
        if (i2 == 0) {
            H();
            throw null;
        }
        H();
        b bVar = this.f1891k0;
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.d);
        kVar.F(bundle);
        this.f1892l0 = kVar;
        t tVar = kVar;
        if (this.p0 == 1) {
            H();
            b bVar2 = this.f1891k0;
            t nVar = new n();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i2);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            nVar.F(bundle2);
            tVar = nVar;
        }
        this.f1890j0 = tVar;
        this.f1904y0.setText((this.p0 == 1 && C().getResources().getConfiguration().orientation == 2) ? this.f1886D0 : this.f1885C0);
        H();
        throw null;
    }

    @Override // Z.DialogInterfaceOnCancelListenerC0043m, Z.AbstractComponentCallbacksC0047q
    public final void z() {
        this.f1890j0.f1924T.clear();
        super.z();
    }
}
