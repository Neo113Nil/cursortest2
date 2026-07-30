package com.google.android.material.datepicker;

import F3.ViewOnClickListenerC0307a;
import O.B0;
import O.C0;
import O.L;
import O.X;
import a.AbstractC0415a;
import android.R;
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
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0481n;
import com.google.android.material.internal.CheckableImageButton;
import com.icefishing.icefishingliveapp.C5284R;
import i3.AbstractC4576a;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import t3.ViewOnTouchListenerC5079a;

/* loaded from: classes2.dex */
public final class m<S> extends DialogInterfaceOnCancelListenerC0481n {

    /* renamed from: N0, reason: collision with root package name */
    public final LinkedHashSet f36136N0;

    /* renamed from: O0, reason: collision with root package name */
    public final LinkedHashSet f36137O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f36138P0;

    /* renamed from: Q0, reason: collision with root package name */
    public t f36139Q0;

    /* renamed from: R0, reason: collision with root package name */
    public b f36140R0;

    /* renamed from: S0, reason: collision with root package name */
    public k f36141S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f36142T0;

    /* renamed from: U0, reason: collision with root package name */
    public CharSequence f36143U0;

    /* renamed from: V0, reason: collision with root package name */
    public boolean f36144V0;

    /* renamed from: W0, reason: collision with root package name */
    public int f36145W0;

    /* renamed from: X0, reason: collision with root package name */
    public int f36146X0;

    /* renamed from: Y0, reason: collision with root package name */
    public CharSequence f36147Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int f36148Z0;

    /* renamed from: a1, reason: collision with root package name */
    public CharSequence f36149a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f36150b1;

    /* renamed from: c1, reason: collision with root package name */
    public CharSequence f36151c1;

    /* renamed from: d1, reason: collision with root package name */
    public int f36152d1;

    /* renamed from: e1, reason: collision with root package name */
    public CharSequence f36153e1;

    /* renamed from: f1, reason: collision with root package name */
    public TextView f36154f1;

    /* renamed from: g1, reason: collision with root package name */
    public CheckableImageButton f36155g1;

    /* renamed from: h1, reason: collision with root package name */
    public C3.g f36156h1;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f36157i1;

    /* renamed from: j1, reason: collision with root package name */
    public CharSequence f36158j1;

    /* renamed from: k1, reason: collision with root package name */
    public CharSequence f36159k1;

    public m() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f36136N0 = new LinkedHashSet();
        this.f36137O0 = new LinkedHashSet();
    }

    public static int F(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C5284R.dimen.mtrl_calendar_content_padding);
        Calendar b9 = w.b();
        b9.set(5, 1);
        Calendar a9 = w.a(b9);
        a9.get(2);
        a9.get(1);
        int maximum = a9.getMaximum(7);
        a9.getActualMaximum(5);
        a9.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(C5284R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(C5284R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean G(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0415a.B(context, k.class.getCanonicalName(), C5284R.attr.materialCalendarStyle).data, new int[]{i});
        boolean z8 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z8;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0481n
    public final Dialog C() {
        Context y6 = y();
        y();
        int i = this.f36138P0;
        if (i == 0) {
            E();
            throw null;
        }
        Dialog dialog = new Dialog(y6, i);
        Context context = dialog.getContext();
        this.f36144V0 = G(context, R.attr.windowFullscreen);
        this.f36156h1 = new C3.g(context, null, C5284R.attr.materialCalendarStyle, C5284R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC4576a.f38302l, C5284R.attr.materialCalendarStyle, C5284R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f36156h1.h(context);
        this.f36156h1.j(ColorStateList.valueOf(color));
        C3.g gVar = this.f36156h1;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = X.f2240a;
        gVar.i(L.i(decorView));
        return dialog;
    }

    public final void E() {
        if (this.f5180y.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0481n, androidx.fragment.app.AbstractComponentCallbacksC0485s
    public final void o(Bundle bundle) {
        super.o(bundle);
        if (bundle == null) {
            bundle = this.f5180y;
        }
        this.f36138P0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f36140R0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f36142T0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f36143U0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f36145W0 = bundle.getInt("INPUT_MODE_KEY");
        this.f36146X0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f36147Y0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f36148Z0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f36149a1 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f36150b1 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f36151c1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f36152d1 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f36153e1 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f36143U0;
        if (charSequence == null) {
            charSequence = y().getResources().getText(this.f36142T0);
        }
        this.f36158j1 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f36159k1 = charSequence;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0481n, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f36136N0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0481n, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f36137O0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f5162X;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0485s
    public final View p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.f36144V0 ? C5284R.layout.mtrl_picker_fullscreen : C5284R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f36144V0) {
            inflate.findViewById(C5284R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(F(context), -2));
        } else {
            inflate.findViewById(C5284R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(F(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(C5284R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = X.f2240a;
        textView.setAccessibilityLiveRegion(1);
        this.f36155g1 = (CheckableImageButton) inflate.findViewById(C5284R.id.mtrl_picker_header_toggle);
        this.f36154f1 = (TextView) inflate.findViewById(C5284R.id.mtrl_picker_title_text);
        this.f36155g1.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f36155g1;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, com.bumptech.glide.f.h(context, C5284R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], com.bumptech.glide.f.h(context, C5284R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f36155g1.setChecked(this.f36145W0 != 0);
        X.o(this.f36155g1, null);
        CheckableImageButton checkableImageButton2 = this.f36155g1;
        this.f36155g1.setContentDescription(this.f36145W0 == 1 ? checkableImageButton2.getContext().getString(C5284R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(C5284R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f36155g1.setOnClickListener(new ViewOnClickListenerC0307a(3, this));
        E();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0481n, androidx.fragment.app.AbstractComponentCallbacksC0485s
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f36138P0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f36140R0;
        a aVar = new a();
        int i = a.f36096b;
        int i4 = a.f36096b;
        long j9 = bVar.f36098n.f36167y;
        long j10 = bVar.f36099u.f36167y;
        aVar.f36097a = Long.valueOf(bVar.f36101w.f36167y);
        k kVar = this.f36141S0;
        o oVar = kVar == null ? null : kVar.C0;
        if (oVar != null) {
            aVar.f36097a = Long.valueOf(oVar.f36167y);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f36100v);
        o b9 = o.b(j9);
        o b10 = o.b(j10);
        d dVar = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l9 = aVar.f36097a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b9, b10, dVar, l9 == null ? null : o.b(l9.longValue()), bVar.f36102x));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f36142T0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f36143U0);
        bundle.putInt("INPUT_MODE_KEY", this.f36145W0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f36146X0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f36147Y0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f36148Z0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f36149a1);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f36150b1);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f36151c1);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f36152d1);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f36153e1);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0481n, androidx.fragment.app.AbstractComponentCallbacksC0485s
    public final void u() {
        B0 c02;
        B0 c03;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        super.u();
        Window window = D().getWindow();
        if (this.f36144V0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f36156h1);
            if (!this.f36157i1) {
                View findViewById = z().findViewById(C5284R.id.fullscreen_header);
                ColorStateList q6 = com.bumptech.glide.d.q(findViewById.getBackground());
                Integer valueOf = q6 != null ? Integer.valueOf(q6.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z8 = false;
                boolean z9 = valueOf == null || valueOf.intValue() == 0;
                int g9 = U2.a.g(window.getContext(), R.attr.colorBackground, -16777216);
                if (z9) {
                    valueOf = Integer.valueOf(g9);
                }
                com.bumptech.glide.g.R(window, false);
                window.getContext();
                int d2 = i < 27 ? G.c.d(U2.a.g(window.getContext(), R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(d2);
                boolean z10 = U2.a.k(0) || U2.a.k(valueOf.intValue());
                I0.j jVar = new I0.j(window.getDecorView());
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 30) {
                    insetsController2 = window.getInsetsController();
                    c02 = new B0(insetsController2, jVar);
                    c02.f2217b = window;
                } else {
                    c02 = i4 >= 26 ? new C0(window, jVar) : new B0(window, jVar);
                }
                c02.n(z10);
                boolean k6 = U2.a.k(g9);
                if (U2.a.k(d2) || (d2 == 0 && k6)) {
                    z8 = true;
                }
                I0.j jVar2 = new I0.j(window.getDecorView());
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 30) {
                    insetsController = window.getInsetsController();
                    c03 = new B0(insetsController, jVar2);
                    c03.f2217b = window;
                } else {
                    c03 = i9 >= 26 ? new C0(window, jVar2) : new B0(window, jVar2);
                }
                c03.m(z8);
                l lVar = new l(findViewById.getLayoutParams().height, findViewById.getPaddingTop(), findViewById);
                WeakHashMap weakHashMap = X.f2240a;
                L.u(findViewById, lVar);
                this.f36157i1 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = y().getResources().getDimensionPixelOffset(C5284R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f36156h1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC5079a(D(), rect));
        }
        y();
        int i10 = this.f36138P0;
        if (i10 == 0) {
            E();
            throw null;
        }
        E();
        b bVar = this.f36140R0;
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f36101w);
        kVar.B(bundle);
        this.f36141S0 = kVar;
        t tVar = kVar;
        if (this.f36145W0 == 1) {
            E();
            b bVar2 = this.f36140R0;
            t nVar = new n();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i10);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            nVar.B(bundle2);
            tVar = nVar;
        }
        this.f36139Q0 = tVar;
        this.f36154f1.setText((this.f36145W0 == 1 && y().getResources().getConfiguration().orientation == 2) ? this.f36159k1 : this.f36158j1);
        E();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0481n, androidx.fragment.app.AbstractComponentCallbacksC0485s
    public final void v() {
        this.f36139Q0.f36181z0.clear();
        super.v();
    }
}
