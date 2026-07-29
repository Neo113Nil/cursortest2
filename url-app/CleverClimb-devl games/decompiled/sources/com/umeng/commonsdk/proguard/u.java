package com.umeng.commonsdk.proguard;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FieldMetaData.java */
/* loaded from: classes2.dex */
public class u implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    private static Map<Class<? extends i>, Map<? extends p, u>> f9083d = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f9084a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f9085b;

    /* renamed from: c, reason: collision with root package name */
    public final v f9086c;

    public u(String str, byte b2, v vVar) {
        this.f9084a = str;
        this.f9085b = b2;
        this.f9086c = vVar;
    }

    public static void a(Class<? extends i> cls, Map<? extends p, u> map) {
        f9083d.put(cls, map);
    }

    public static Map<? extends p, u> a(Class<? extends i> cls) {
        if (!f9083d.containsKey(cls)) {
            try {
                cls.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("IllegalAccessException for TBase class: " + cls.getName() + ", message: " + e.getMessage());
            } catch (InstantiationException e2) {
                throw new RuntimeException("InstantiationException for TBase class: " + cls.getName() + ", message: " + e2.getMessage());
            }
        }
        return f9083d.get(cls);
    }
}
