package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.impl.h5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0218h5 implements Co {

    /* renamed from: a, reason: collision with root package name */
    public final List f1283a;

    public C0218h5(List<? extends Pair<String, ? extends Co>> list) {
        this.f1283a = list;
    }

    @Override // io.appmetrica.analytics.impl.Co
    public final String a() {
        Iterator it = this.f1283a.iterator();
        while (it.hasNext()) {
            String a2 = ((Co) ((Pair) it.next()).getSecond()).a();
            if (a2 != null && a2.length() > 0) {
                return a2;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Co
    public final void a(String str) {
        Iterator it = this.f1283a.iterator();
        while (it.hasNext()) {
            ((Co) ((Pair) it.next()).getSecond()).a(str);
        }
    }
}
