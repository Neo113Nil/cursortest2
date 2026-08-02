package com.squareup.cash.work.data.api;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class EmployerTaxForms {
    public final String employerName;
    public final ArrayList forms;
    public final String merchantToken;

    public EmployerTaxForms(String str, String str2, ArrayList arrayList) {
        str2.getClass();
        this.employerName = str;
        this.merchantToken = str2;
        this.forms = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmployerTaxForms)) {
            return false;
        }
        EmployerTaxForms employerTaxForms = (EmployerTaxForms) obj;
        return this.employerName.equals(employerTaxForms.employerName) && Intrinsics.areEqual(this.merchantToken, employerTaxForms.merchantToken) && this.forms.equals(employerTaxForms.forms);
    }

    public final int hashCode() {
        return this.forms.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.employerName.hashCode() * 31, 31, this.merchantToken);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EmployerTaxForms(employerName=", this.employerName, ", merchantToken=", this.merchantToken, ", forms="), this.forms);
    }
}
