package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Jl {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ll f6218a;

    public Jl(Ll ll) {
        this.f6218a = ll;
    }

    public final void a(String str, Nl nl, C0603jm c0603jm) {
        ArrayList arrayList;
        synchronized (this.f6218a.f6300b) {
            try {
                Collection collection = (Collection) this.f6218a.f6299a.f8560a.get(str);
                arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Ul) it.next()).a(nl, c0603jm);
        }
    }
}
