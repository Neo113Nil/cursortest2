package com.xsj.crasheye;

/* loaded from: classes2.dex */
enum EnumStateConnection {
    WiFi,
    net_3G,
    net_2G,
    NONE,
    NA;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumStateConnection[] valuesCustom() {
        EnumStateConnection[] valuesCustom = values();
        int length = valuesCustom.length;
        EnumStateConnection[] enumStateConnectionArr = new EnumStateConnection[length];
        System.arraycopy(valuesCustom, 0, enumStateConnectionArr, 0, length);
        return enumStateConnectionArr;
    }
}
