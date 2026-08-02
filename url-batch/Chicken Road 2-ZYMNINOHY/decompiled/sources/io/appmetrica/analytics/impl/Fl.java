package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class Fl {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Hl f10294a;

    public Fl(Hl hl) {
        this.f10294a = hl;
    }

    public final void a(String str, Jl jl, C0622fm c0622fm) {
        ArrayList arrayList;
        synchronized (this.f10294a.f10383b) {
            try {
                Collection collection = (Collection) this.f10294a.f10382a.f12571a.get(str);
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
            ((Ql) obj).a(jl, c0622fm);
        }
    }
}
