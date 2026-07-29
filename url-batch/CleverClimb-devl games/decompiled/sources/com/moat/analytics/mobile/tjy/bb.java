package com.moat.analytics.mobile.tjy;

import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: classes2.dex */
class bb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ay f7254a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference[] f7255b;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedList f7256c;

    /* renamed from: d, reason: collision with root package name */
    private final Method f7257d;

    private bb(ay ayVar, Method method, Object... objArr) {
        this.f7254a = ayVar;
        this.f7256c = new LinkedList();
        objArr = objArr == null ? ay.f7246a : objArr;
        WeakReference[] weakReferenceArr = new WeakReference[objArr.length];
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Object obj = objArr[i];
            if ((obj instanceof Map) || (obj instanceof Integer)) {
                this.f7256c.add(obj);
            }
            weakReferenceArr[i2] = new WeakReference(obj);
            i++;
            i2++;
        }
        this.f7255b = weakReferenceArr;
        this.f7257d = method;
    }

    /* synthetic */ bb(ay ayVar, Method method, Object[] objArr, az azVar) {
        this(ayVar, method, objArr);
    }
}
