package com.baidu.ar;

/* loaded from: classes.dex */
public enum z7 {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");


    /* renamed from: a, reason: collision with root package name */
    public String f3808a;

    z7(int i8, String str) {
        this.f3808a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f3808a;
    }
}
