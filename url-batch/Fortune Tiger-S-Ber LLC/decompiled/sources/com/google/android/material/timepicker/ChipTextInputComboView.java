package com.google.android.material.timepicker;

import a2.r;
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
import com.gglhk.bofio.fortunetiger.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: f, reason: collision with root package name */
    public final Chip f1436f;
    public final EditText g;
    public final TextView h;

    /* renamed from: i, reason: collision with root package name */
    public String f1437i;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1437i = "";
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f1436f = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.g = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new b(this));
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        this.h = textView;
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
        new a(this, 0);
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
        return this.f1436f.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z3) {
        Chip chip = this.f1436f;
        chip.setChecked(z3);
        if (z3) {
            chip.setText("");
            chip.setImportantForAccessibility(2);
        } else {
            chip.setText(this.f1437i);
            chip.setImportantForAccessibility(1);
        }
        int i4 = z3 ? 0 : 4;
        EditText editText = this.g;
        editText.setVisibility(i4);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new r(0, editText));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f1436f.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i4, Object obj) {
        this.f1436f.setTag(i4, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f1436f.toggle();
    }
}
