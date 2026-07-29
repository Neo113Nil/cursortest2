package com.xsj.crasheye;

/* loaded from: classes2.dex */
public enum EnumErrorType {
    java,
    ndk,
    unityndk,
    script;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumErrorType[] valuesCustom() {
        EnumErrorType[] valuesCustom = values();
        int length = valuesCustom.length;
        EnumErrorType[] enumErrorTypeArr = new EnumErrorType[length];
        System.arraycopy(valuesCustom, 0, enumErrorTypeArr, 0, length);
        return enumErrorTypeArr;
    }
}
