package com.baidu.ar.imu;

/* loaded from: classes.dex */
public enum a {
    WORLD(0),
    RELATIVE(1);


    /* renamed from: a, reason: collision with root package name */
    public int f2515a;

    a(int i8) {
        this.f2515a = i8;
    }

    public int a() {
        return this.f2515a;
    }

    public static a a(int i8) {
        for (a aVar : values()) {
            if (aVar.a() == i8) {
                return aVar;
            }
        }
        return null;
    }
}
