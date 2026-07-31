package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.bg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0074bg implements Xf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0177fg f1184a;

    public C0074bg(C0177fg c0177fg) {
        this.f1184a = c0177fg;
    }

    @Override // io.appmetrica.analytics.impl.Xf
    public final void a() {
        C0177fg c0177fg = this.f1184a;
        ArrayList arrayList = c0177fg.g;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C0407og c0407og = (C0407og) next;
            c0177fg.c.getClass();
            String str = c0407og != null ? c0407og.f1416a : null;
            if (!(str == null || str.length() == 0)) {
                arrayList2.add(next);
            }
        }
        c0177fg.a(c0177fg.c.a(CollectionsKt.filterNotNull(arrayList2)));
    }
}
