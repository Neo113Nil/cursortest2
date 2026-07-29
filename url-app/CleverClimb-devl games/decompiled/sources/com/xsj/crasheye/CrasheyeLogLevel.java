package com.xsj.crasheye;

/* loaded from: classes2.dex */
public enum CrasheyeLogLevel {
    Verbose,
    Debug,
    Info,
    Warning,
    Error;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static CrasheyeLogLevel[] valuesCustom() {
        CrasheyeLogLevel[] valuesCustom = values();
        int length = valuesCustom.length;
        CrasheyeLogLevel[] crasheyeLogLevelArr = new CrasheyeLogLevel[length];
        System.arraycopy(valuesCustom, 0, crasheyeLogLevelArr, 0, length);
        return crasheyeLogLevelArr;
    }
}
