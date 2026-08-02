package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.xn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1089xn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Bl f13039a;

    public C1089xn() {
        this(new Bl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0477a6 fromModel(C1063wn c1063wn) {
        C0477a6 c0477a6 = new C0477a6();
        Integer num = c1063wn.f12985e;
        c0477a6.f11428e = num == null ? -1 : num.intValue();
        c0477a6.f11427d = c1063wn.f12984d;
        c0477a6.f11425b = c1063wn.f12982b;
        c0477a6.f11424a = c1063wn.f12981a;
        c0477a6.f11426c = c1063wn.f12983c;
        Bl bl = this.f13039a;
        List list = c1063wn.f12986f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Dl((StackTraceElement) it.next()));
        }
        c0477a6.f11429f = bl.fromModel(arrayList);
        return c0477a6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1089xn(Bl bl) {
        this.f13039a = bl;
    }

    public final C1063wn a(C0477a6 c0477a6) {
        throw new UnsupportedOperationException();
    }
}
