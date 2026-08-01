package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import defpackage.xh0;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class b extends xh0 {
    public final /* synthetic */ ChipTextInputComboView f;

    public b(ChipTextInputComboView chipTextInputComboView) {
        this.f = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f;
        if (isEmpty) {
            chipTextInputComboView.i = ChipTextInputComboView.a(chipTextInputComboView, "00");
            return;
        }
        String a = ChipTextInputComboView.a(chipTextInputComboView, editable);
        if (TextUtils.isEmpty(a)) {
            a = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chipTextInputComboView.i = a;
    }
}
