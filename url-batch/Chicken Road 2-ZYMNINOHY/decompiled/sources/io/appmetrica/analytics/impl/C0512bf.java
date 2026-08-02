package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.bf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0512bf implements InterfaceC0521bo {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11537a;

    public C0512bf(C0564df c0564df) {
        boolean z;
        List<C0538cf> list = c0564df.f11681b;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C0538cf) it.next()).f11614c == S7.f10933c) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        this.f11537a = z;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0521bo, o3.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0538cf> invoke(List<? extends C0538cf> list, C0900qf c0900qf) {
        C0538cf c0538cf = new C0538cf(c0900qf.f12616a, c0900qf.f12617b, c0900qf.f12620e);
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C0538cf) it.next()).f11614c == c0900qf.f12620e) {
                    if (c0538cf.f11614c == S7.f10933c && this.f11537a) {
                        return d3.i.i0(list, c0538cf);
                    }
                    return null;
                }
            }
        }
        return d3.i.i0(list, c0538cf);
    }
}
