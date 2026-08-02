package io.appmetrica.analytics.impl;

import c3.C0292d;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.g5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0631g5 implements Bo {

    /* renamed from: a, reason: collision with root package name */
    public final List f11906a;

    public C0631g5(List<? extends C0292d> list) {
        this.f11906a = list;
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final String a() {
        Iterator it = this.f11906a.iterator();
        while (it.hasNext()) {
            String a3 = ((Bo) ((C0292d) it.next()).f5725b).a();
            if (a3 != null && a3.length() > 0) {
                return a3;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final void a(String str) {
        Iterator it = this.f11906a.iterator();
        while (it.hasNext()) {
            ((Bo) ((C0292d) it.next()).f5725b).a(str);
        }
    }
}
