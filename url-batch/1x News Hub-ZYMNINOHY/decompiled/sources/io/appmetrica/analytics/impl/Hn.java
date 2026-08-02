package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Hn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Fl f6100a;

    public Hn() {
        this(new Fl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0562i6 fromModel(In in) {
        C0562i6 c0562i6 = new C0562i6();
        c0562i6.f7504a = (String) WrapUtils.getOrDefault(in.f6176a, "");
        c0562i6.f7505b = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(in.f6177b, ""));
        List<Hl> list = in.f6178c;
        if (list != null) {
            c0562i6.f7506c = this.f6100a.fromModel(list);
        }
        In in2 = in.f6179d;
        if (in2 != null) {
            c0562i6.f7507d = fromModel(in2);
        }
        List list2 = in.f6180e;
        int i3 = 0;
        if (list2 == null) {
            c0562i6.f7508e = new C0562i6[0];
            return c0562i6;
        }
        c0562i6.f7508e = new C0562i6[list2.size()];
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            c0562i6.f7508e[i3] = fromModel((In) it.next());
            i3++;
        }
        return c0562i6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Hn(Fl fl) {
        this.f6100a = fl;
    }

    public final In a(C0562i6 c0562i6) {
        throw new UnsupportedOperationException();
    }
}
