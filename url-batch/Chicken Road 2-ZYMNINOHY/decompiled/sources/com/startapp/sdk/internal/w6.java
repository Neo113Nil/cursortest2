package com.startapp.sdk.internal;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class w6 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f7814a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7815b;

    public w6(Object emitter) {
        kotlin.jvm.internal.i.e(emitter, "emitter");
        this.f7814a = new WeakReference(emitter);
        this.f7815b = new ArrayList();
    }

    public final boolean a(Object obj) {
        kotlin.jvm.internal.i.e(obj, "obj");
        if (this.f7814a.get() == obj) {
            return true;
        }
        ArrayList arrayList = this.f7815b;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            w6 w6Var = (w6) obj2;
            if (w6Var.f7814a.get() == obj || w6Var.a(obj)) {
                return true;
            }
        }
        return false;
    }
}
