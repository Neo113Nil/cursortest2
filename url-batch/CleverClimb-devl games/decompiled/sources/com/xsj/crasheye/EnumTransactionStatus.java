package com.xsj.crasheye;

/* loaded from: classes2.dex */
enum EnumTransactionStatus {
    SUCCESS,
    FAIL,
    CANCEL;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumTransactionStatus[] valuesCustom() {
        EnumTransactionStatus[] valuesCustom = values();
        int length = valuesCustom.length;
        EnumTransactionStatus[] enumTransactionStatusArr = new EnumTransactionStatus[length];
        System.arraycopy(valuesCustom, 0, enumTransactionStatusArr, 0, length);
        return enumTransactionStatusArr;
    }
}
