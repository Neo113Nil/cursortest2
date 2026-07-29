package com.xsj.crasheye;

/* loaded from: classes2.dex */
public enum EnumExceptionType {
    HANDLED,
    UNHANDLED;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumExceptionType[] valuesCustom() {
        EnumExceptionType[] valuesCustom = values();
        int length = valuesCustom.length;
        EnumExceptionType[] enumExceptionTypeArr = new EnumExceptionType[length];
        System.arraycopy(valuesCustom, 0, enumExceptionTypeArr, 0, length);
        return enumExceptionTypeArr;
    }
}
