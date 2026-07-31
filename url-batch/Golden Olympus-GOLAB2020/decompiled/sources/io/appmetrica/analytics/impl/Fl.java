package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class Fl {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Hl f37543a;

    public Fl(Hl hl) {
        this.f37543a = hl;
    }

    public final void a(String str, Jl jl, C2633fm c2633fm) {
        ArrayList arrayList;
        synchronized (this.f37543a.f37671b) {
            try {
                Collection collection = (Collection) this.f37543a.f37670a.f37877a.get(str);
                arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((Ql) obj).a(jl, c2633fm);
        }
    }
}
