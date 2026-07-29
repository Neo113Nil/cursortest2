package com.xsj.crasheye;

/* loaded from: classes2.dex */
public enum EnumActionType {
    invalid,
    error,
    event,
    ping,
    gnip,
    trstart,
    trstop,
    network,
    performance,
    view,
    log,
    ndkerror;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumActionType[] valuesCustom() {
        EnumActionType[] valuesCustom = values();
        int length = valuesCustom.length;
        EnumActionType[] enumActionTypeArr = new EnumActionType[length];
        System.arraycopy(valuesCustom, 0, enumActionTypeArr, 0, length);
        return enumActionTypeArr;
    }
}
