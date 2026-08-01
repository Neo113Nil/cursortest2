package defpackage;

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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import com.awerser.monnit.betplay.R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class mt<S> extends g {
    public boolean A;
    public CharSequence B;
    public CharSequence C;
    public final LinkedHashSet f;
    public final LinkedHashSet g;
    public int h;
    public fx i;
    public x8 j;
    public ct k;
    public int l;
    public CharSequence m;
    public boolean n;
    public int o;
    public int p;
    public CharSequence q;
    public int r;
    public CharSequence s;
    public int t;
    public CharSequence u;
    public int v;
    public CharSequence w;
    public TextView x;
    public CheckableImageButton y;
    public rt z;

    public mt() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f = new LinkedHashSet();
        this.g = new LinkedHashSet();
    }

    public static int h(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b = w70.b();
        b.set(5, 1);
        Calendar a = w70.a(b);
        a.get(2);
        a.get(1);
        int maximum = a.getMaximum(7);
        a.getActualMaximum(5);
        a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean i(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(l70.R(context, R.attr.materialCalendarStyle, ct.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public final void g() {
        if (getArguments().getParcelable("DATE_SELECTOR_KEY") == null) {
            return;
        }
        o8.c();
    }

    @Override // androidx.fragment.app.g, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.h = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            o8.c();
            return;
        }
        this.j = (x8) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            o8.c();
            return;
        }
        this.l = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.m = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.o = bundle.getInt("INPUT_MODE_KEY");
        this.p = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.q = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.r = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.s = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.t = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.u = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.v = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.w = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.m;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.l);
        }
        this.B = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.C = charSequence;
    }

    @Override // androidx.fragment.app.g
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        requireContext();
        int i = this.h;
        if (i == 0) {
            g();
            throw null;
        }
        Dialog dialog = new Dialog(requireContext, i);
        Context context = dialog.getContext();
        this.n = i(context, android.R.attr.windowFullscreen);
        this.z = new rt(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, ly.s, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.z.n(context);
        this.z.r(ColorStateList.valueOf(color));
        this.z.q(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.n ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.n) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(h(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(h(context), -1));
        }
        ((TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.y = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.x = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.y.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.y;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, l70.p(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], l70.p(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.y.setChecked(this.o != 0);
        e90.m(this.y, null);
        CheckableImageButton checkableImageButton2 = this.y;
        this.y.setContentDescription(this.o == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        CheckableImageButton checkableImageButton3 = this.y;
        r60.a(this.y, this.o == 1 ? checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
        this.y.setOnClickListener(new m2(4, this));
        g();
        throw null;
    }

    @Override // androidx.fragment.app.g, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.h);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        x8 x8Var = this.j;
        w8 w8Var = new w8();
        long j = x8Var.f.k;
        long j2 = x8Var.g.k;
        w8Var.a = Long.valueOf(x8Var.i.k);
        int i = x8Var.j;
        ee eeVar = x8Var.h;
        ct ctVar = this.k;
        yu yuVar = ctVar == null ? null : ctVar.i;
        if (yuVar != null) {
            w8Var.a = Long.valueOf(yuVar.k);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", eeVar);
        yu b = yu.b(j);
        yu b2 = yu.b(j2);
        ee eeVar2 = (ee) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = w8Var.a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new x8(b, b2, eeVar2, l == null ? null : yu.b(l.longValue()), i));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.l);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.m);
        bundle.putInt("INPUT_MODE_KEY", this.o);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.p);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.q);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.r);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.s);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.t);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.u);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.v);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.w);
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onStart() {
        fx fxVar;
        int i;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.n) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.z);
            if (!this.A) {
                View findViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList r = j8.r(findViewById.getBackground());
                Integer valueOf = r != null ? Integer.valueOf(r.getDefaultColor()) : null;
                boolean z = false;
                boolean z2 = valueOf == null || valueOf.intValue() == 0;
                Integer p = j8.p(window.getContext(), android.R.attr.colorBackground);
                int intValue = p != null ? p.intValue() : -16777216;
                if (z2) {
                    valueOf = Integer.valueOf(intValue);
                }
                op.P(window, false);
                window.getContext();
                Context context = window.getContext();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 27) {
                    Integer p2 = j8.p(context, android.R.attr.navigationBarColor);
                    i = nb.d(p2 != null ? p2.intValue() : -16777216, 128);
                } else {
                    i = 0;
                }
                if (i2 < 35) {
                    window.setStatusBarColor(0);
                }
                if (i2 < 35) {
                    window.setNavigationBarColor(i);
                }
                boolean z3 = j8.C(0) || j8.C(valueOf.intValue());
                ix ixVar = new ix(window.getDecorView(), 12);
                (i2 >= 35 ? new ec0(window, ixVar) : i2 >= 30 ? new dc0(window, ixVar) : new bc0(window, ixVar)).U(z3);
                boolean C = j8.C(intValue);
                if (j8.C(i) || (i == 0 && C)) {
                    z = true;
                }
                ix ixVar2 = new ix(window.getDecorView(), 12);
                int i3 = Build.VERSION.SDK_INT;
                (i3 >= 35 ? new ec0(window, ixVar2) : i3 >= 30 ? new dc0(window, ixVar2) : new bc0(window, ixVar2)).T(z);
                lt ltVar = new lt(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight());
                WeakHashMap weakHashMap = e90.a;
                w80.c(findViewById, ltVar);
                this.A = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.z, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new hp(requireDialog(), rect));
        }
        requireContext();
        int i4 = this.h;
        if (i4 == 0) {
            g();
            throw null;
        }
        Fragment B = getChildFragmentManager().B(this.o == 1 ? "TEXT_INPUT_FRAGMENT_TAG" : "CALENDAR_FRAGMENT_TAG");
        fx fxVar2 = B instanceof fx ? (fx) B : null;
        if (fxVar2 == null) {
            if (this.o == 1) {
                g();
                x8 x8Var = this.j;
                ut utVar = new ut();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i4);
                bundle.putParcelable("DATE_SELECTOR_KEY", null);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", x8Var);
                utVar.setArguments(bundle);
                fxVar = utVar;
            } else {
                g();
                x8 x8Var2 = this.j;
                ct ctVar = new ct();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i4);
                bundle2.putParcelable("GRID_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", x8Var2);
                bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                bundle2.putParcelable("CURRENT_MONTH_KEY", x8Var2.i);
                ctVar.setArguments(bundle2);
                this.k = ctVar;
                fxVar = ctVar;
            }
            fxVar2 = fxVar;
        }
        this.i = fxVar2;
        fxVar2.f(new vg(28));
        this.x.setText((this.o == 1 && getResources().getConfiguration().orientation == 2) ? this.C : this.B);
        g();
        getContext();
        throw null;
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onStop() {
        this.i.f.clear();
        super.onStop();
    }
}
