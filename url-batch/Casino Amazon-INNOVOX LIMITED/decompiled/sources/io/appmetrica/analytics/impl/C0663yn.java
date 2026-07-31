package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.yn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0663yn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Cl f1590a;

    public C0663yn() {
        this(new Cl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0064b6 fromModel(C0638xn c0638xn) {
        C0064b6 c0064b6 = new C0064b6();
        Integer num = c0638xn.e;
        c0064b6.e = num == null ? -1 : num.intValue();
        c0064b6.d = c0638xn.d;
        c0064b6.b = c0638xn.b;
        c0064b6.f1178a = c0638xn.f1571a;
        c0064b6.c = c0638xn.c;
        Cl cl = this.f1590a;
        List list = c0638xn.f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new El((StackTraceElement) it.next()));
        }
        c0064b6.f = cl.fromModel(arrayList);
        return c0064b6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0663yn(Cl cl) {
        this.f1590a = cl;
    }

    public final C0638xn a(C0064b6 c0064b6) {
        throw new UnsupportedOperationException();
    }
}
