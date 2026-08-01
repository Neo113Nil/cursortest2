package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.style.TtsSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.gdmhkmf.belbet.R;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class w<S> extends d0 {
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public f0 f1120a0;

    /* renamed from: b0, reason: collision with root package name */
    public b f1121b0;

    @Override // androidx.fragment.app.u
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f647k;
        }
        this.Z = bundle.getInt("THEME_RES_ID_KEY");
        this.f1120a0 = (f0) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f1121b0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0072, code lost:
    
        if ((r2 != null ? r2.toLowerCase(java.util.Locale.ENGLISH) : "").equals("samsung") != false) goto L16;
     */
    @Override // androidx.fragment.app.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(new ContextThemeWrapper(h(), this.Z));
        f0 f0Var = this.f1120a0;
        b bVar = this.f1121b0;
        u uVar = new u(1, this);
        f0Var.getClass();
        View inflate = cloneInContext.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        Integer q4 = b4.l.q(inflate.getContext(), R.attr.colorOnSurfaceVariant);
        if (q4 != null) {
            editText.setHintTextColor(q4.intValue());
        }
        String str = Build.MANUFACTURER;
        if (!(str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("lge")) {
        }
        editText.setInputType(17);
        AtomicReference atomicReference = i0.f1075a;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y"), Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        simpleDateFormat.setLenient(false);
        Resources resources = inflate.getResources();
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(R.string.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(R.string.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(R.string.mtrl_picker_text_input_day_abbr);
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage())) {
            pattern = pattern.replaceAll("d+", "d").replaceAll("M+", "M").replaceAll("y+", "y");
        }
        String replace = pattern.replace("d", string3).replace("M", string2).replace("y", string);
        SpannableString spannableString = new SpannableString(replace);
        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), 0, spannableString.length(), 33);
        textInputLayout.setPlaceholderText(spannableString);
        Long l4 = f0Var.f1067f;
        if (l4 != null) {
            editText.setText(simpleDateFormat.format(l4));
            Editable text = editText.getText();
            if (text != null) {
                editText.setSelection(text.length());
            }
        }
        editText.addTextChangedListener(new e0(f0Var, replace, simpleDateFormat, textInputLayout, bVar, uVar, textInputLayout));
        AccessibilityManager accessibilityManager = (AccessibilityManager) inflate.getContext().getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return inflate;
        }
        final EditText[] editTextArr = {editText};
        editTextArr[0].setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.google.android.material.datepicker.f
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z4) {
                for (EditText editText2 : editTextArr) {
                    if (editText2.hasFocus()) {
                        return;
                    }
                }
                InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
            }
        });
        EditText editText2 = editTextArr[0];
        editText2.postDelayed(new r(editText2, 1), 100L);
        return inflate;
    }

    @Override // androidx.fragment.app.u
    public final void x(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.Z);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f1120a0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1121b0);
    }
}
