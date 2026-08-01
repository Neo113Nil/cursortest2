package com.google.android.material.datepicker;

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
import com.oriondriftchasers.arordrft.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import n0.d0;
import n0.l0;
import n0.r1;
import n0.s1;
import n0.u1;
import n0.v1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class p<S> extends androidx.fragment.app.p {
    public CharSequence A0;
    public int B0;
    public CharSequence C0;
    public TextView D0;
    public CheckableImageButton E0;
    public l2.j F0;
    public boolean G0;
    public CharSequence H0;
    public CharSequence I0;

    /* renamed from: l0, reason: collision with root package name */
    public final LinkedHashSet f939l0;

    /* renamed from: m0, reason: collision with root package name */
    public final LinkedHashSet f940m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f941n0;

    /* renamed from: o0, reason: collision with root package name */
    public w f942o0;

    /* renamed from: p0, reason: collision with root package name */
    public b f943p0;

    /* renamed from: q0, reason: collision with root package name */
    public m f944q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f945r0;

    /* renamed from: s0, reason: collision with root package name */
    public CharSequence f946s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f947t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f948u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f949v0;

    /* renamed from: w0, reason: collision with root package name */
    public CharSequence f950w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f951x0;

    /* renamed from: y0, reason: collision with root package name */
    public CharSequence f952y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f953z0;

    public p() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f939l0 = new LinkedHashSet();
        this.f940m0 = new LinkedHashSet();
    }

    public static int I(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b4 = z.b();
        b4.set(5, 1);
        Calendar a2 = z.a(b4);
        a2.get(2);
        a2.get(1);
        int maximum = a2.getMaximum(7);
        a2.getActualMaximum(5);
        a2.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean J(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(h.a.c0(context, R.attr.materialCalendarStyle, m.class.getCanonicalName()).data, new int[]{i});
        boolean z3 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z3;
    }

    @Override // androidx.fragment.app.p
    public final Dialog G() {
        Context C = C();
        C();
        int i = this.f941n0;
        if (i == 0) {
            H();
            throw null;
        }
        Dialog dialog = new Dialog(C, i);
        Context context = dialog.getContext();
        this.f947t0 = J(context, android.R.attr.windowFullscreen);
        this.F0 = new l2.j(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, n1.a.f2822o, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.F0.m(context);
        this.F0.q(ColorStateList.valueOf(color));
        this.F0.p(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    public final void H() {
        if (this.f539k.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // androidx.fragment.app.p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f939l0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.p, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f940m0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.J;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.u
    public final void r(Bundle bundle) {
        super.r(bundle);
        if (bundle == null) {
            bundle = this.f539k;
        }
        this.f941n0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f943p0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f945r0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f946s0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f948u0 = bundle.getInt("INPUT_MODE_KEY");
        this.f949v0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f950w0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f951x0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f952y0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f953z0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.A0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.B0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.C0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f946s0;
        if (charSequence == null) {
            charSequence = C().getResources().getText(this.f945r0);
        }
        this.H0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.I0 = charSequence;
    }

    @Override // androidx.fragment.app.u
    public final View s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.f947t0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f947t0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(I(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(I(context), -1));
        }
        ((TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.E0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.D0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.E0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.E0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, h.a.x(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], h.a.x(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.E0.setChecked(this.f948u0 != 0);
        l0.m(this.E0, null);
        CheckableImageButton checkableImageButton2 = this.E0;
        this.E0.setContentDescription(this.f948u0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.E0.setOnClickListener(new n(0, this));
        H();
        throw null;
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.u
    public final void w(Bundle bundle) {
        super.w(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f941n0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f943p0;
        a aVar = new a();
        int i = a.f900b;
        int i4 = a.f900b;
        long j4 = bVar.f903f.f959k;
        long j5 = bVar.f904g.f959k;
        aVar.f901a = Long.valueOf(bVar.i.f959k);
        int i5 = bVar.f906j;
        d dVar = bVar.f905h;
        m mVar = this.f944q0;
        r rVar = mVar == null ? null : mVar.f924b0;
        if (rVar != null) {
            aVar.f901a = Long.valueOf(rVar.f959k);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dVar);
        r b4 = r.b(j4);
        r b5 = r.b(j5);
        d dVar2 = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l4 = aVar.f901a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b4, b5, dVar2, l4 == null ? null : r.b(l4.longValue()), i5));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f945r0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f946s0);
        bundle.putInt("INPUT_MODE_KEY", this.f948u0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f949v0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f950w0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f951x0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f952y0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f953z0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.A0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.B0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.C0);
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.u
    public final void x() {
        super.x();
        Dialog dialog = this.f503h0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f947t0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.F0);
            if (!this.G0) {
                View findViewById = D().findViewById(R.id.fullscreen_header);
                ColorStateList C = a.y.C(findViewById.getBackground());
                Integer valueOf = C != null ? Integer.valueOf(C.getDefaultColor()) : null;
                boolean z3 = false;
                boolean z4 = valueOf == null || valueOf.intValue() == 0;
                int z5 = a.y.z(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z4) {
                    valueOf = Integer.valueOf(z5);
                }
                h.a.f0(window, false);
                window.getContext();
                int d = Build.VERSION.SDK_INT < 27 ? f0.a.d(a.y.z(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(d);
                boolean z6 = a.y.H(0) || a.y.H(valueOf.intValue());
                l2.f fVar = new l2.f(window.getDecorView(), 20);
                int i = Build.VERSION.SDK_INT;
                (i >= 35 ? new v1(window, fVar) : i >= 30 ? new u1(window, fVar) : i >= 26 ? new s1(window, fVar) : new r1(window, fVar)).e0(z6);
                boolean H = a.y.H(z5);
                if (a.y.H(d) || (d == 0 && H)) {
                    z3 = true;
                }
                l2.f fVar2 = new l2.f(window.getDecorView(), 20);
                int i4 = Build.VERSION.SDK_INT;
                (i4 >= 35 ? new v1(window, fVar2) : i4 >= 30 ? new u1(window, fVar2) : i4 >= 26 ? new s1(window, fVar2) : new r1(window, fVar2)).d0(z3);
                o oVar = new o(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight());
                WeakHashMap weakHashMap = l0.f2757a;
                d0.j(findViewById, oVar);
                this.G0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = C().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.F0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f503h0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new b2.a(dialog2, rect));
        }
        C();
        int i5 = this.f941n0;
        if (i5 == 0) {
            H();
            throw null;
        }
        H();
        b bVar = this.f943p0;
        m mVar = new m();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i5);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.i);
        mVar.F(bundle);
        this.f944q0 = mVar;
        w wVar = mVar;
        if (this.f948u0 == 1) {
            H();
            b bVar2 = this.f943p0;
            w qVar = new q();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i5);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            qVar.F(bundle2);
            wVar = qVar;
        }
        this.f942o0 = wVar;
        this.D0.setText((this.f948u0 == 1 && C().getResources().getConfiguration().orientation == 2) ? this.I0 : this.H0);
        H();
        throw null;
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.u
    public final void y() {
        this.f942o0.Y.clear();
        super.y();
    }
}
