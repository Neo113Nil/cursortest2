package com.pgl.ssdk;

/* compiled from: DomainMgr.java */
/* loaded from: classes3.dex */
public class F {
    public static int a = -1;

    public static String a() {
        int i = a;
        return i != 0 ? i != 1 ? "" : "https://ssdk-va.pangle.io/ssdk/v2/r" : "https://ssdk-sg.pangle.io/ssdk/v2/r";
    }

    public static String b() {
        int i = a;
        return i != 0 ? i != 1 ? "" : "https://ssdk-va.pangle.io/ssdk/sd/token" : "https://ssdk-sg.pangle.io/ssdk/sd/token";
    }
}
