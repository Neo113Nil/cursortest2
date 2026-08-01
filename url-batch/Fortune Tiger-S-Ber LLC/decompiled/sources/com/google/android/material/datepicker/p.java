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
import com.gglhk.bofio.fortunetiger.R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k.a3;
import k0.j0;
import k0.n1;
import k0.o1;
import k0.p1;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class p<S> extends androidx.fragment.app.p {
    public CharSequence A0;
    public int B0;
    public CharSequence C0;
    public TextView D0;
    public CheckableImageButton E0;
    public g2.j F0;
    public boolean G0;
    public CharSequence H0;
    public CharSequence I0;

    /* renamed from: l0, reason: collision with root package name */
    public final LinkedHashSet f1309l0;

    /* renamed from: m0, reason: collision with root package name */
    public final LinkedHashSet f1310m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f1311n0;

    /* renamed from: o0, reason: collision with root package name */
    public x f1312o0;

    /* renamed from: p0, reason: collision with root package name */
    public b f1313p0;

    /* renamed from: q0, reason: collision with root package name */
    public l f1314q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f1315r0;

    /* renamed from: s0, reason: collision with root package name */
    public CharSequence f1316s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f1317t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f1318u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f1319v0;

    /* renamed from: w0, reason: collision with root package name */
    public CharSequence f1320w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f1321x0;

    /* renamed from: y0, reason: collision with root package name */
    public CharSequence f1322y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f1323z0;

    public p() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f1309l0 = new LinkedHashSet();
        this.f1310m0 = new LinkedHashSet();
    }

    public static int I(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b2 = a0.b();
        b2.set(5, 1);
        Calendar a4 = a0.a(b2);
        a4.get(2);
        a4.get(1);
        int maximum = a4.getMaximum(7);
        a4.getActualMaximum(5);
        a4.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean J(Context context, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(k3.d.Z(context, R.attr.materialCalendarStyle, l.class.getCanonicalName()).data, new int[]{i4});
        boolean z3 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z3;
    }

    @Override // androidx.fragment.app.p
    public final Dialog G() {
        Context C = C();
        C();
        int i4 = this.f1311n0;
        if (i4 == 0) {
            H();
            throw null;
        }
        Dialog dialog = new Dialog(C, i4);
        Context context = dialog.getContext();
        this.f1317t0 = J(context, android.R.attr.windowFullscreen);
        this.F0 = new g2.j(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, l1.a.f2869o, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.F0.m(context);
        this.F0.q(ColorStateList.valueOf(color));
        this.F0.p(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    public final void H() {
        if (this.f523k.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // androidx.fragment.app.p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f1309l0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.p, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f1310m0.iterator();
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
            bundle = this.f523k;
        }
        this.f1311n0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1313p0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1315r0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f1316s0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f1318u0 = bundle.getInt("INPUT_MODE_KEY");
        this.f1319v0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1320w0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f1321x0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f1322y0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f1323z0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.A0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.B0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.C0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f1316s0;
        if (charSequence == null) {
            charSequence = C().getResources().getText(this.f1315r0);
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
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.f1317t0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f1317t0) {
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
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, k3.m.w(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], k3.m.w(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.E0.setChecked(this.f1318u0 != 0);
        j0.m(this.E0, null);
        CheckableImageButton checkableImageButton2 = this.E0;
        this.E0.setContentDescription(this.f1318u0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        CheckableImageButton checkableImageButton3 = this.E0;
        a3.a(this.E0, this.f1318u0 == 1 ? checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
        this.E0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.this.H();
                throw null;
            }
        });
        H();
        throw null;
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.u
    public final void x(Bundle bundle) {
        super.x(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f1311n0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f1313p0;
        a aVar = new a();
        int i4 = a.f1273b;
        int i5 = a.f1273b;
        long j4 = bVar.f1276f.f1327k;
        long j5 = bVar.g.f1327k;
        aVar.f1274a = Long.valueOf(bVar.f1277i.f1327k);
        int i6 = bVar.f1278j;
        c cVar = bVar.h;
        l lVar = this.f1314q0;
        r rVar = lVar == null ? null : lVar.f1292b0;
        if (rVar != null) {
            aVar.f1274a = Long.valueOf(rVar.f1327k);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", cVar);
        r b2 = r.b(j4);
        r b4 = r.b(j5);
        c cVar2 = (c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l4 = aVar.f1274a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b2, b4, cVar2, l4 == null ? null : r.b(l4.longValue()), i6));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f1315r0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f1316s0);
        bundle.putInt("INPUT_MODE_KEY", this.f1318u0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f1319v0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f1320w0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1321x0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1322y0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f1323z0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.A0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.B0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.C0);
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.u
    public final void y() {
        x xVar;
        super.y();
        Dialog dialog = this.f492h0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f1317t0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.F0);
            if (!this.G0) {
                View findViewById = D().findViewById(R.id.fullscreen_header);
                ColorStateList i4 = m0.a.i(findViewById.getBackground());
                Integer valueOf = i4 != null ? Integer.valueOf(i4.getDefaultColor()) : null;
                boolean z3 = false;
                boolean z4 = valueOf == null || valueOf.intValue() == 0;
                int h = l0.g.h(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z4) {
                    valueOf = Integer.valueOf(h);
                }
                k3.d.d0(window, false);
                window.getContext();
                Context context = window.getContext();
                int i5 = Build.VERSION.SDK_INT;
                int d4 = i5 < 27 ? c0.a.d(l0.g.h(context, android.R.attr.navigationBarColor, -16777216), 128) : 0;
                if (i5 < 35) {
                    window.setStatusBarColor(0);
                }
                if (i5 < 35) {
                    window.setNavigationBarColor(d4);
                }
                boolean z5 = l0.g.n(0) || l0.g.n(valueOf.intValue());
                g2.f fVar = new g2.f(window.getDecorView(), 15);
                int i6 = Build.VERSION.SDK_INT;
                (i6 >= 35 ? new p1(window, fVar) : i6 >= 30 ? new o1(window, fVar) : new n1(window, fVar)).c0(z5);
                boolean n3 = l0.g.n(h);
                if (l0.g.n(d4) || (d4 == 0 && n3)) {
                    z3 = true;
                }
                g2.f fVar2 = new g2.f(window.getDecorView(), 15);
                int i7 = Build.VERSION.SDK_INT;
                (i7 >= 35 ? new p1(window, fVar2) : i7 >= 30 ? new o1(window, fVar2) : new n1(window, fVar2)).b0(z3);
                o oVar = new o(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight());
                WeakHashMap weakHashMap = j0.f2752a;
                k0.b0.j(findViewById, oVar);
                this.G0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = C().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.F0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f492h0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new w1.a(dialog2, rect));
        }
        C();
        int i8 = this.f1311n0;
        if (i8 == 0) {
            H();
            throw null;
        }
        androidx.fragment.app.u B = g().B(this.f1318u0 == 1 ? "TEXT_INPUT_FRAGMENT_TAG" : "CALENDAR_FRAGMENT_TAG");
        x xVar2 = B instanceof x ? (x) B : null;
        if (xVar2 == null) {
            if (this.f1318u0 == 1) {
                H();
                b bVar = this.f1313p0;
                q qVar = new q();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i8);
                bundle.putParcelable("DATE_SELECTOR_KEY", null);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
                qVar.F(bundle);
                xVar = qVar;
            } else {
                H();
                b bVar2 = this.f1313p0;
                l lVar = new l();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i8);
                bundle2.putParcelable("GRID_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
                bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                bundle2.putParcelable("CURRENT_MONTH_KEY", bVar2.f1277i);
                lVar.F(bundle2);
                this.f1314q0 = lVar;
                xVar = lVar;
            }
            xVar2 = xVar;
        }
        this.f1312o0 = xVar2;
        xVar2.G(new g2.f(9));
        this.D0.setText((this.f1318u0 == 1 && C().getResources().getConfiguration().orientation == 2) ? this.I0 : this.H0);
        H();
        throw null;
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.u
    public final void z() {
        this.f1312o0.Y.clear();
        super.z();
    }
}
