package io.appmetrica.analytics.impl;

import g4.AbstractC0465j;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.gf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0670gf implements Cdo {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8276a;

    public C0670gf(Cif cif) {
        boolean z;
        List<C0696hf> list = cif.f8456b;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C0696hf) it.next()).f8322c == Y7.f7730c) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        this.f8276a = z;
    }

    @Override // io.appmetrica.analytics.impl.Cdo, t4.InterfaceC1445p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0696hf> invoke(List<? extends C0696hf> list, C1058vf c1058vf) {
        C0696hf c0696hf = new C0696hf(c1058vf.f9469a, c1058vf.f9470b, c1058vf.f9473e);
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C0696hf) it.next()).f8322c == c1058vf.f9473e) {
                    if (c0696hf.f8322c == Y7.f7730c && this.f8276a) {
                        return AbstractC0465j.M0(list, c0696hf);
                    }
                    return null;
                }
            }
        }
        return AbstractC0465j.M0(list, c0696hf);
    }
}
