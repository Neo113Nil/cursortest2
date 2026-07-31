package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.cf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0099cf implements InterfaceC0108co {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1199a;

    public C0099cf(C0150ef c0150ef) {
        boolean z;
        List<C0125df> list = c0150ef.b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C0125df) it.next()).c == T7.c) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        this.f1199a = z;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0125df> invoke(List<? extends C0125df> list, C0480rf c0480rf) {
        C0125df c0125df = new C0125df(c0480rf.f1468a, c0480rf.b, c0480rf.e);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C0125df) it.next()).c == c0480rf.e) {
                    if (c0125df.c == T7.c && this.f1199a) {
                        return CollectionsKt.plus((Collection<? extends C0125df>) list, c0125df);
                    }
                    return null;
                }
            }
        }
        return CollectionsKt.plus((Collection<? extends C0125df>) list, c0125df);
    }
}
