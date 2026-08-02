package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.zn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1017zn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Fl f8715a;

    public C1017zn() {
        this(new Fl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0536h6 fromModel(C0992yn c0992yn) {
        C0536h6 c0536h6 = new C0536h6();
        Integer num = c0992yn.f8653e;
        c0536h6.f7434e = num == null ? -1 : num.intValue();
        c0536h6.f7433d = c0992yn.f8652d;
        c0536h6.f7431b = c0992yn.f8650b;
        c0536h6.f7430a = c0992yn.f8649a;
        c0536h6.f7432c = c0992yn.f8651c;
        Fl fl = this.f8715a;
        List list = c0992yn.f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Hl((StackTraceElement) it.next()));
        }
        c0536h6.f = fl.fromModel(arrayList);
        return c0536h6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1017zn(Fl fl) {
        this.f8715a = fl;
    }

    public final C0992yn a(C0536h6 c0536h6) {
        throw new UnsupportedOperationException();
    }
}
