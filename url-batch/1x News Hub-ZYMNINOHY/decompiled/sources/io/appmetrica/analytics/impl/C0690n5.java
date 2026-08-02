package io.appmetrica.analytics.impl;

import b2.C0190d;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.n5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0690n5 implements Do {

    /* renamed from: a, reason: collision with root package name */
    public final List f7922a;

    public C0690n5(List<? extends C0190d> list) {
        this.f7922a = list;
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final String a() {
        Iterator it = this.f7922a.iterator();
        while (it.hasNext()) {
            String a3 = ((Do) ((C0190d) it.next()).f2548b).a();
            if (a3 != null && a3.length() > 0) {
                return a3;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final void a(String str) {
        Iterator it = this.f7922a.iterator();
        while (it.hasNext()) {
            ((Do) ((C0190d) it.next()).f2548b).a(str);
        }
    }
}
