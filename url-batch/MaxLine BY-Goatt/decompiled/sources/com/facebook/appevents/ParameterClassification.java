package com.facebook.appevents;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public enum ParameterClassification {
    CustomData("custom_data"),
    OperationalData("operational_data"),
    CustomAndOperationalData("custom_and_operational_data");

    private final String value;

    ParameterClassification(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
