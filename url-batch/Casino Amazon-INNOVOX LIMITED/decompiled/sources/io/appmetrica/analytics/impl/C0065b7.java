package io.appmetrica.analytics.impl;

import java.io.File;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.b7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0065b7 {

    /* renamed from: a, reason: collision with root package name */
    public final J6 f1179a;
    public final ArrayList b;

    public C0065b7(File file) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        if (file != null) {
            this.f1179a = new C0479re(file, new O6());
            arrayList.add(new C0479re(file, new C0304ke()));
        } else {
            this.f1179a = new K6(new O6());
        }
        arrayList.add(new K6(new C0304ke()));
    }
}
