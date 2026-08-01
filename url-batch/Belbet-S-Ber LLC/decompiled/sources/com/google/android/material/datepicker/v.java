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
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.gdmhkmf.belbet.R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l.b3;
import n0.p0;
import n0.w1;
import n0.x1;
import n0.z1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class v<S> extends androidx.fragment.app.p {
    public int A0;
    public int B0;
    public CharSequence C0;
    public int D0;
    public CharSequence E0;
    public int F0;
    public CharSequence G0;
    public int H0;
    public CharSequence I0;
    public TextView J0;
    public TextView K0;
    public CheckableImageButton L0;
    public o2.j M0;
    public Button N0;
    public boolean O0;
    public CharSequence P0;
    public CharSequence Q0;

    /* renamed from: o0, reason: collision with root package name */
    public final LinkedHashSet f1108o0 = new LinkedHashSet();

    /* renamed from: p0, reason: collision with root package name */
    public final LinkedHashSet f1109p0 = new LinkedHashSet();

    /* renamed from: q0, reason: collision with root package name */
    public final LinkedHashSet f1110q0 = new LinkedHashSet();

    /* renamed from: r0, reason: collision with root package name */
    public final LinkedHashSet f1111r0 = new LinkedHashSet();

    /* renamed from: s0, reason: collision with root package name */
    public int f1112s0;

    /* renamed from: t0, reason: collision with root package name */
    public f0 f1113t0;

    /* renamed from: u0, reason: collision with root package name */
    public d0 f1114u0;

    /* renamed from: v0, reason: collision with root package name */
    public b f1115v0;

    /* renamed from: w0, reason: collision with root package name */
    public q f1116w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f1117x0;

    /* renamed from: y0, reason: collision with root package name */
    public CharSequence f1118y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f1119z0;

    public static int K(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar d = i0.d();
        d.set(5, 1);
        Calendar c5 = i0.c(d);
        c5.get(2);
        c5.get(1);
        int maximum = c5.getMaximum(7);
        c5.getActualMaximum(5);
        c5.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean L(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b4.d.Q(context, R.attr.materialCalendarStyle, q.class.getCanonicalName()).data, new int[]{i});
        boolean z4 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z4;
    }

    @Override // androidx.fragment.app.p
    public final Dialog H() {
        Context C = C();
        Context C2 = C();
        int i = this.f1112s0;
        if (i == 0) {
            I().getClass();
            i = b4.d.Q(C2, R.attr.materialCalendarTheme, v.class.getCanonicalName()).data;
        }
        Dialog dialog = new Dialog(C, i);
        Context context = dialog.getContext();
        this.f1119z0 = L(context, android.R.attr.windowFullscreen);
        this.M0 = new o2.j(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, q1.a.f3155s, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.M0.n(context);
        this.M0.r(ColorStateList.valueOf(color));
        this.M0.q(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    public final f0 I() {
        if (this.f1113t0 == null) {
            this.f1113t0 = (f0) this.f647k.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f1113t0;
    }

    public final String J() {
        f0 I = I();
        Context h = h();
        I.getClass();
        Resources resources = h.getResources();
        Long l4 = I.f1067f;
        return l4 == null ? resources.getString(R.string.mtrl_picker_date_header_unselected) : resources.getString(R.string.mtrl_picker_date_header_selected, b4.d.B(l4.longValue()));
    }

    public final void M() {
        Context C = C();
        int i = this.f1112s0;
        if (i == 0) {
            I().getClass();
            i = b4.d.Q(C, R.attr.materialCalendarTheme, v.class.getCanonicalName()).data;
        }
        String str = this.A0 == 1 ? "TEXT_INPUT_FRAGMENT_TAG" : "CALENDAR_FRAGMENT_TAG";
        androidx.fragment.app.u C2 = g().C(str);
        d0 d0Var = C2 instanceof d0 ? (d0) C2 : null;
        if (d0Var == null) {
            if (this.A0 == 1) {
                f0 I = I();
                b bVar = this.f1115v0;
                w wVar = new w();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i);
                bundle.putParcelable("DATE_SELECTOR_KEY", I);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
                wVar.F(bundle);
                d0Var = wVar;
            } else {
                f0 I2 = I();
                b bVar2 = this.f1115v0;
                q qVar = new q();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i);
                bundle2.putParcelable("GRID_SELECTOR_KEY", I2);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
                bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                bundle2.putParcelable("CURRENT_MONTH_KEY", bVar2.i);
                qVar.F(bundle2);
                this.f1116w0 = qVar;
                d0Var = qVar;
            }
        }
        this.f1114u0 = d0Var;
        d0Var.G(new u(0, this));
        this.J0.setText((this.A0 == 1 && C().getResources().getConfiguration().orientation == 2) ? this.Q0 : this.P0);
        N(J());
        androidx.fragment.app.k0 g3 = g();
        g3.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(g3);
        aVar.e(R.id.mtrl_calendar_frame, this.f1114u0, str, 2);
        if (aVar.f498g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        aVar.f505p.z(aVar, false);
    }

    public final void N(String str) {
        TextView textView = this.K0;
        f0 I = I();
        Context C = C();
        I.getClass();
        Resources resources = C.getResources();
        Long l4 = I.f1067f;
        textView.setContentDescription(resources.getString(R.string.mtrl_picker_announce_current_selection, l4 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : b4.d.B(l4.longValue())));
        this.K0.setText(str);
    }

    public final void O(CheckableImageButton checkableImageButton) {
        this.L0.setContentDescription(this.A0 == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    public final void P(CheckableImageButton checkableImageButton) {
        b3.a(this.L0, this.A0 == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
    }

    @Override // androidx.fragment.app.p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f1110q0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.p, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f1111r0.iterator();
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
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f647k;
        }
        this.f1112s0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f1113t0 = (f0) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f1115v0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1117x0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f1118y0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.A0 = bundle.getInt("INPUT_MODE_KEY");
        this.B0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.C0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.D0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.E0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.F0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.G0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.H0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.I0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f1118y0;
        if (charSequence == null) {
            charSequence = C().getResources().getText(this.f1117x0);
        }
        this.P0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.Q0 = charSequence;
    }

    @Override // androidx.fragment.app.u
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.f1119z0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f1119z0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(K(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(K(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.K0 = textView;
        textView.setAccessibilityLiveRegion(1);
        this.L0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.J0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.L0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.L0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, b4.d.y(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], b4.d.y(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.L0.setChecked(this.A0 != 0);
        p0.m(this.L0, null);
        O(this.L0);
        P(this.L0);
        final int i = 2;
        this.L0.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.s

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ v f1102g;

            {
                this.f1102g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        v vVar = this.f1102g;
                        Iterator it = vVar.f1108o0.iterator();
                        while (it.hasNext()) {
                            ((o1.g) it.next()).f2897a.b(vVar.I().f1067f);
                        }
                        vVar.G(false, false);
                        break;
                    case 1:
                        v vVar2 = this.f1102g;
                        Iterator it2 = vVar2.f1109p0.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        vVar2.G(false, false);
                        break;
                    default:
                        v vVar3 = this.f1102g;
                        vVar3.N0.setEnabled(vVar3.I().f1067f != null);
                        vVar3.L0.toggle();
                        vVar3.A0 = vVar3.A0 != 1 ? 1 : 0;
                        vVar3.O(vVar3.L0);
                        vVar3.P(vVar3.L0);
                        vVar3.M();
                        break;
                }
            }
        });
        this.N0 = (Button) inflate.findViewById(R.id.confirm_button);
        if (I().f1067f != null) {
            this.N0.setEnabled(true);
        } else {
            this.N0.setEnabled(false);
        }
        this.N0.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.C0;
        if (charSequence != null) {
            this.N0.setText(charSequence);
        } else {
            int i4 = this.B0;
            if (i4 != 0) {
                this.N0.setText(i4);
            }
        }
        CharSequence charSequence2 = this.E0;
        if (charSequence2 != null) {
            this.N0.setContentDescription(charSequence2);
        } else if (this.D0 != 0) {
            this.N0.setContentDescription(h().getResources().getText(this.D0));
        }
        final int i5 = 0;
        this.N0.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.s

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ v f1102g;

            {
                this.f1102g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        v vVar = this.f1102g;
                        Iterator it = vVar.f1108o0.iterator();
                        while (it.hasNext()) {
                            ((o1.g) it.next()).f2897a.b(vVar.I().f1067f);
                        }
                        vVar.G(false, false);
                        break;
                    case 1:
                        v vVar2 = this.f1102g;
                        Iterator it2 = vVar2.f1109p0.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        vVar2.G(false, false);
                        break;
                    default:
                        v vVar3 = this.f1102g;
                        vVar3.N0.setEnabled(vVar3.I().f1067f != null);
                        vVar3.L0.toggle();
                        vVar3.A0 = vVar3.A0 != 1 ? 1 : 0;
                        vVar3.O(vVar3.L0);
                        vVar3.P(vVar3.L0);
                        vVar3.M();
                        break;
                }
            }
        });
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.G0;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i6 = this.F0;
            if (i6 != 0) {
                button.setText(i6);
            }
        }
        CharSequence charSequence4 = this.I0;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.H0 != 0) {
            button.setContentDescription(h().getResources().getText(this.H0));
        }
        final int i7 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.s

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ v f1102g;

            {
                this.f1102g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        v vVar = this.f1102g;
                        Iterator it = vVar.f1108o0.iterator();
                        while (it.hasNext()) {
                            ((o1.g) it.next()).f2897a.b(vVar.I().f1067f);
                        }
                        vVar.G(false, false);
                        break;
                    case 1:
                        v vVar2 = this.f1102g;
                        Iterator it2 = vVar2.f1109p0.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        vVar2.G(false, false);
                        break;
                    default:
                        v vVar3 = this.f1102g;
                        vVar3.N0.setEnabled(vVar3.I().f1067f != null);
                        vVar3.L0.toggle();
                        vVar3.A0 = vVar3.A0 != 1 ? 1 : 0;
                        vVar3.O(vVar3.L0);
                        vVar3.P(vVar3.L0);
                        vVar3.M();
                        break;
                }
            }
        });
        return inflate;
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.u
    public final void x(Bundle bundle) {
        super.x(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f1112s0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f1113t0);
        b bVar = this.f1115v0;
        a aVar = new a();
        aVar.f1027a = a.f1025f;
        aVar.f1028b = a.f1026g;
        aVar.f1030e = new g(Long.MIN_VALUE);
        aVar.f1027a = bVar.f1033f.f1125k;
        aVar.f1028b = bVar.f1034g.f1125k;
        aVar.f1029c = Long.valueOf(bVar.i.f1125k);
        aVar.d = bVar.f1035j;
        aVar.f1030e = bVar.h;
        q qVar = this.f1116w0;
        x xVar = qVar == null ? null : qVar.f1088c0;
        if (xVar != null) {
            aVar.f1029c = Long.valueOf(xVar.f1125k);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f1117x0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f1118y0);
        bundle.putInt("INPUT_MODE_KEY", this.A0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.B0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.C0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.D0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.E0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.F0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.G0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.H0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.I0);
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.u
    public final void y() {
        int i;
        super.y();
        Dialog dialog = this.f613j0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f1119z0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.M0);
            if (!this.O0) {
                View findViewById = D().findViewById(R.id.fullscreen_header);
                ColorStateList t4 = b4.l.t(findViewById.getBackground());
                Integer valueOf = t4 != null ? Integer.valueOf(t4.getDefaultColor()) : null;
                boolean z4 = false;
                boolean z5 = valueOf == null || valueOf.intValue() == 0;
                Integer q4 = b4.l.q(window.getContext(), android.R.attr.colorBackground);
                int intValue = q4 != null ? q4.intValue() : -16777216;
                if (z5) {
                    valueOf = Integer.valueOf(intValue);
                }
                b4.l.a0(window, false);
                window.getContext();
                Context context = window.getContext();
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 27) {
                    Integer q5 = b4.l.q(context, android.R.attr.navigationBarColor);
                    i = f0.a.d(q5 != null ? q5.intValue() : -16777216, 128);
                } else {
                    i = 0;
                }
                if (i4 < 35) {
                    window.setStatusBarColor(0);
                }
                if (i4 < 35) {
                    window.setNavigationBarColor(i);
                }
                boolean z6 = b4.l.I(0) || b4.l.I(valueOf.intValue());
                o2.f fVar = new o2.f(window.getDecorView(), 21);
                int i5 = Build.VERSION.SDK_INT;
                (i5 >= 35 ? new z1(window, fVar) : i5 >= 30 ? new x1(window, fVar) : new w1(window, fVar)).Z(z6);
                boolean I = b4.l.I(intValue);
                if (b4.l.I(i) || (i == 0 && I)) {
                    z4 = true;
                }
                o2.f fVar2 = new o2.f(window.getDecorView(), 21);
                int i6 = Build.VERSION.SDK_INT;
                (i6 >= 35 ? new z1(window, fVar2) : i6 >= 30 ? new x1(window, fVar2) : new w1(window, fVar2)).Y(z4);
                t tVar = new t(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight());
                WeakHashMap weakHashMap = p0.f2816a;
                n0.h0.c(findViewById, tVar);
                this.O0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = C().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.M0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f613j0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new c2.a(dialog2, rect));
        }
        M();
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.u
    public final void z() {
        this.f1114u0.Y.clear();
        super.z();
    }
}
