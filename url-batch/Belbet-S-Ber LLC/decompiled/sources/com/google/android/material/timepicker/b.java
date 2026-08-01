package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import i2.n;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b extends n {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f1262f;

    public b(ChipTextInputComboView chipTextInputComboView) {
        this.f1262f = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f1262f;
        if (isEmpty) {
            chipTextInputComboView.i = ChipTextInputComboView.a(chipTextInputComboView, "00");
            return;
        }
        String a5 = ChipTextInputComboView.a(chipTextInputComboView, editable);
        if (TextUtils.isEmpty(a5)) {
            a5 = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chipTextInputComboView.i = a5;
    }
}
