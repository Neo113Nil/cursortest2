package com.crrepa.g1;

/* loaded from: classes3.dex */
public class k {
    private k() {
    }

    public static <T> T a(String str, Class<T> cls) {
        try {
            return (T) new com.crrepa.l1.e().a(str, (Class) cls);
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static String a(Object obj) {
        return new com.crrepa.l1.e().a(obj);
    }
}
