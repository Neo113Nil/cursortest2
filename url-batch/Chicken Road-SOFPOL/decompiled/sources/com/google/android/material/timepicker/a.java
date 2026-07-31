package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends r5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f2032d;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f2032d = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f2032d;
        if (isEmpty) {
            chipTextInputComboView.f2011d.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String a8 = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f2011d;
        if (TextUtils.isEmpty(a8)) {
            a8 = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a8);
    }
}
