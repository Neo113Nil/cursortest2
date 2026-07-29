package com.aiming.mdt.adt;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.aiming.mdt.adt.ʻʽʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0234 {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static Map<String, InterfaceC0231> f746 = new HashMap();

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static InterfaceC0231 m847(String str) {
        return f746.get(str);
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static void m848(String str, InterfaceC0231 interfaceC0231) {
        f746.put(str, interfaceC0231);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m849(String str) {
        f746.remove(str);
    }
}
