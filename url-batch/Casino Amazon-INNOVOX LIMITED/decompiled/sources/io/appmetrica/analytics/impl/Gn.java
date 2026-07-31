package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class Gn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Cl f863a;

    public Gn() {
        this(new Cl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0090c6 fromModel(Hn hn) {
        C0090c6 c0090c6 = new C0090c6();
        c0090c6.f1191a = (String) WrapUtils.getOrDefault(hn.f880a, "");
        c0090c6.b = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(hn.b, ""));
        List<El> list = hn.c;
        if (list != null) {
            c0090c6.c = this.f863a.fromModel(list);
        }
        Hn hn2 = hn.d;
        if (hn2 != null) {
            c0090c6.d = fromModel(hn2);
        }
        List list2 = hn.e;
        int i = 0;
        if (list2 == null) {
            c0090c6.e = new C0090c6[0];
            return c0090c6;
        }
        c0090c6.e = new C0090c6[list2.size()];
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            c0090c6.e[i] = fromModel((Hn) it.next());
            i++;
        }
        return c0090c6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Gn(Cl cl) {
        this.f863a = cl;
    }

    public final Hn a(C0090c6 c0090c6) {
        throw new UnsupportedOperationException();
    }
}
