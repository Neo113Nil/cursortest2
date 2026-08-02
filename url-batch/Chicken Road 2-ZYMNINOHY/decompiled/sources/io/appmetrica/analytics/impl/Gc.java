package io.appmetrica.analytics.impl;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class Gc {

    /* renamed from: c, reason: collision with root package name */
    public static final SparseArray f10313c;

    /* renamed from: a, reason: collision with root package name */
    public final String f10314a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10315b;

    static {
        SparseArray sparseArray = new SparseArray();
        f10313c = sparseArray;
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5891, new Gc("jvm", "binder"));
        sparseArray.put(5890, new Gc("jvm", "file"));
        sparseArray.put(5889, new Gc("jvm", "file"));
        sparseArray.put(5897, new Gc("jni_native", "file"));
        sparseArray.put(5898, new Gc("jni_native", "file"));
    }

    public Gc(String str, String str2) {
        this.f10314a = str;
        this.f10315b = str2;
    }
}
