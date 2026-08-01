package com.trembin.nirefon.betfury.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.trembin.nirefon.betfury.R;
import defpackage.bd0;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class BottomSheetNoteBinding {
    public final MaterialButton btnAlert;
    public final ImageButton btnDelete;
    public final MaterialButton btnPin;
    public final MaterialButton btnSave;
    public final ChipGroup chipGroupPriority;
    public final Chip chipHigh;
    public final Chip chipLow;
    public final Chip chipMedium;
    public final Chip chipUrgent;
    public final TextInputEditText etContent;
    public final TextInputEditText etTitle;
    private final NestedScrollView rootView;
    public final TextInputLayout tilContent;
    public final TextInputLayout tilTitle;
    public final TextView tvReminderTime;
    public final TextView tvSheetTitle;

    private BottomSheetNoteBinding(NestedScrollView nestedScrollView, MaterialButton materialButton, ImageButton imageButton, MaterialButton materialButton2, MaterialButton materialButton3, ChipGroup chipGroup, Chip chip, Chip chip2, Chip chip3, Chip chip4, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextView textView, TextView textView2) {
        this.rootView = nestedScrollView;
        this.btnAlert = materialButton;
        this.btnDelete = imageButton;
        this.btnPin = materialButton2;
        this.btnSave = materialButton3;
        this.chipGroupPriority = chipGroup;
        this.chipHigh = chip;
        this.chipLow = chip2;
        this.chipMedium = chip3;
        this.chipUrgent = chip4;
        this.etContent = textInputEditText;
        this.etTitle = textInputEditText2;
        this.tilContent = textInputLayout;
        this.tilTitle = textInputLayout2;
        this.tvReminderTime = textView;
        this.tvSheetTitle = textView2;
    }

    public static BottomSheetNoteBinding bind(View view) {
        int i = R.id.btnAlert;
        MaterialButton materialButton = (MaterialButton) bd0.d(view, R.id.btnAlert);
        if (materialButton != null) {
            i = R.id.btnDelete;
            ImageButton imageButton = (ImageButton) bd0.d(view, R.id.btnDelete);
            if (imageButton != null) {
                i = R.id.btnPin;
                MaterialButton materialButton2 = (MaterialButton) bd0.d(view, R.id.btnPin);
                if (materialButton2 != null) {
                    i = R.id.btnSave;
                    MaterialButton materialButton3 = (MaterialButton) bd0.d(view, R.id.btnSave);
                    if (materialButton3 != null) {
                        i = R.id.chipGroupPriority;
                        ChipGroup chipGroup = (ChipGroup) bd0.d(view, R.id.chipGroupPriority);
                        if (chipGroup != null) {
                            i = R.id.chipHigh;
                            Chip chip = (Chip) bd0.d(view, R.id.chipHigh);
                            if (chip != null) {
                                i = R.id.chipLow;
                                Chip chip2 = (Chip) bd0.d(view, R.id.chipLow);
                                if (chip2 != null) {
                                    i = R.id.chipMedium;
                                    Chip chip3 = (Chip) bd0.d(view, R.id.chipMedium);
                                    if (chip3 != null) {
                                        i = R.id.chipUrgent;
                                        Chip chip4 = (Chip) bd0.d(view, R.id.chipUrgent);
                                        if (chip4 != null) {
                                            i = R.id.etContent;
                                            TextInputEditText textInputEditText = (TextInputEditText) bd0.d(view, R.id.etContent);
                                            if (textInputEditText != null) {
                                                i = R.id.etTitle;
                                                TextInputEditText textInputEditText2 = (TextInputEditText) bd0.d(view, R.id.etTitle);
                                                if (textInputEditText2 != null) {
                                                    i = R.id.tilContent;
                                                    TextInputLayout textInputLayout = (TextInputLayout) bd0.d(view, R.id.tilContent);
                                                    if (textInputLayout != null) {
                                                        i = R.id.tilTitle;
                                                        TextInputLayout textInputLayout2 = (TextInputLayout) bd0.d(view, R.id.tilTitle);
                                                        if (textInputLayout2 != null) {
                                                            i = R.id.tvReminderTime;
                                                            TextView textView = (TextView) bd0.d(view, R.id.tvReminderTime);
                                                            if (textView != null) {
                                                                i = R.id.tvSheetTitle;
                                                                TextView textView2 = (TextView) bd0.d(view, R.id.tvSheetTitle);
                                                                if (textView2 != null) {
                                                                    return new BottomSheetNoteBinding((NestedScrollView) view, materialButton, imageButton, materialButton2, materialButton3, chipGroup, chip, chip2, chip3, chip4, textInputEditText, textInputEditText2, textInputLayout, textInputLayout2, textView, textView2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static BottomSheetNoteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_note, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public NestedScrollView getRoot() {
        return this.rootView;
    }

    public static BottomSheetNoteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
