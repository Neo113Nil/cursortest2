package com.google.android.material.timepicker;

import B0.q;
import K.X;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.fortuneink.neonpad.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a, reason: collision with root package name */
    public final Chip f2049a;

    /* renamed from: b, reason: collision with root package name */
    public final EditText f2050b;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f2049a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f2050b = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a(this));
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        WeakHashMap weakHashMap = X.f418a;
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2049a.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2050b.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z2) {
        Chip chip = this.f2049a;
        chip.setChecked(z2);
        int i = z2 ? 0 : 4;
        EditText editText = this.f2050b;
        editText.setVisibility(i);
        chip.setVisibility(z2 ? 8 : 0);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new q(0, editText));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f2049a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.f2049a.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f2049a.toggle();
    }
}
