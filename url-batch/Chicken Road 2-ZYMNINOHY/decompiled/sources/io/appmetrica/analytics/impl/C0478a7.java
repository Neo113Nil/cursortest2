package io.appmetrica.analytics.impl;

import java.io.File;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.a7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0478a7 {

    /* renamed from: a, reason: collision with root package name */
    public final I6 f11430a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11431b;

    public C0478a7(File file) {
        ArrayList arrayList = new ArrayList();
        this.f11431b = arrayList;
        if (file != null) {
            this.f11430a = new C0899qe(file, new N6());
            arrayList.add(new C0899qe(file, new C0717je()));
        } else {
            this.f11430a = new J6(new N6());
        }
        arrayList.add(new J6(new C0717je()));
    }
}
