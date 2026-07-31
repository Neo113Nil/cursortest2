package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class Gl {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Il f862a;

    public Gl(Il il) {
        this.f862a = il;
    }

    public final void a(String str, Kl kl, C0209gm c0209gm) {
        ArrayList arrayList;
        synchronized (this.f862a.b) {
            Collection collection = (Collection) this.f862a.f895a.f1451a.get(str);
            arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Rl) it.next()).a(kl, c0209gm);
        }
    }
}
