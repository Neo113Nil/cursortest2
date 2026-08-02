package com.stripe.android.model;

import com.knotapi.knot.utilities.BreadcrumbHelper;

/* loaded from: classes8.dex */
public enum EmailSource {
    USER_ACTION(BreadcrumbHelper.Category.USER_ACTION),
    CUSTOMER_OBJECT("customer_object");

    public final String backendValue;

    EmailSource(String str) {
        this.backendValue = str;
    }
}
