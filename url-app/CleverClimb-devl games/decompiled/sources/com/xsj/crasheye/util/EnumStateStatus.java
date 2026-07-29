package com.xsj.crasheye.util;

/* loaded from: classes2.dex */
public enum EnumStateStatus {
    ON,
    OFF,
    NA;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumStateStatus[] valuesCustom() {
        EnumStateStatus[] valuesCustom = values();
        int length = valuesCustom.length;
        EnumStateStatus[] enumStateStatusArr = new EnumStateStatus[length];
        System.arraycopy(valuesCustom, 0, enumStateStatusArr, 0, length);
        return enumStateStatusArr;
    }
}
