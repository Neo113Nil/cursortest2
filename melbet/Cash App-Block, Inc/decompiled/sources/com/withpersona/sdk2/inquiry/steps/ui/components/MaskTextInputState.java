package com.withpersona.sdk2.inquiry.steps.ui.components;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class MaskTextInputState {
    public final String label;
    public final String mask;
    public final String placeholder;
    public final String prefill;
    public final Boolean secure;

    public MaskTextInputState(Boolean bool, String str, String str2, String str3, String str4) {
        this.prefill = str;
        this.mask = str2;
        this.secure = bool;
        this.label = str3;
        this.placeholder = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaskTextInputState)) {
            return false;
        }
        MaskTextInputState maskTextInputState = (MaskTextInputState) obj;
        return Intrinsics.areEqual(this.prefill, maskTextInputState.prefill) && Intrinsics.areEqual(this.mask, maskTextInputState.mask) && Intrinsics.areEqual(this.secure, maskTextInputState.secure) && Intrinsics.areEqual(this.label, maskTextInputState.label) && Intrinsics.areEqual(this.placeholder, maskTextInputState.placeholder);
    }

    public final int hashCode() {
        String str = this.prefill;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mask;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.secure;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.label;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.placeholder;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MaskTextInputState(prefill=", this.prefill, ", mask=", this.mask, ", secure=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.secure, ", label=", this.label, ", placeholder=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.placeholder, ")");
    }
}
