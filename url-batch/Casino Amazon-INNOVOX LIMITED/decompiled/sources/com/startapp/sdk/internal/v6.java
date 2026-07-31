package com.startapp.sdk.internal;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class v6 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f463a;
    public final ArrayList b;

    public v6(Object obj) {
        obj.getClass();
        this.f463a = new WeakReference(obj);
        this.b = new ArrayList();
    }

    public final boolean a(Object obj) {
        obj.getClass();
        if (this.f463a.get() == obj) {
            return true;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            v6 v6Var = (v6) obj2;
            if (v6Var.f463a.get() == obj || v6Var.a(obj)) {
                return true;
            }
        }
        return false;
    }
}
