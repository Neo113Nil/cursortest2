package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import com.ironsource.b9;

/* renamed from: io.appmetrica.analytics.impl.bd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2517bd {

    /* renamed from: c, reason: collision with root package name */
    public static final SparseArray f38717c;

    /* renamed from: a, reason: collision with root package name */
    public final String f38718a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38719b;

    static {
        SparseArray sparseArray = new SparseArray();
        f38717c = sparseArray;
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5891, new C2517bd("jvm", "binder"));
        sparseArray.put(5890, new C2517bd("jvm", b9.h.f15468b));
        sparseArray.put(5889, new C2517bd("jvm", b9.h.f15468b));
        sparseArray.put(5897, new C2517bd("jni_native", b9.h.f15468b));
        sparseArray.put(5898, new C2517bd("jni_native", b9.h.f15468b));
    }

    public C2517bd(String str, String str2) {
        this.f38718a = str;
        this.f38719b = str2;
    }
}
