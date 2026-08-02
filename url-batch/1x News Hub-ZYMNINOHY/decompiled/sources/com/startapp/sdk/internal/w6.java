package com.startapp.sdk.internal;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class w6 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f4669a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4670b;

    public w6(Object emitter) {
        kotlin.jvm.internal.j.e(emitter, "emitter");
        this.f4669a = new WeakReference(emitter);
        this.f4670b = new ArrayList();
    }

    public final boolean a(Object obj) {
        kotlin.jvm.internal.j.e(obj, "obj");
        if (this.f4669a.get() == obj) {
            return true;
        }
        Iterator it = this.f4670b.iterator();
        while (it.hasNext()) {
            w6 w6Var = (w6) it.next();
            if (w6Var.f4669a.get() == obj || w6Var.a(obj)) {
                return true;
            }
        }
        return false;
    }
}
