package com.google.android.material.timepicker;

import a2.o;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b extends o {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f1456f;

    public b(ChipTextInputComboView chipTextInputComboView) {
        this.f1456f = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f1456f;
        if (isEmpty) {
            chipTextInputComboView.f1437i = ChipTextInputComboView.a(chipTextInputComboView, "00");
            return;
        }
        String a4 = ChipTextInputComboView.a(chipTextInputComboView, editable);
        if (TextUtils.isEmpty(a4)) {
            a4 = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chipTextInputComboView.f1437i = a4;
    }
}
