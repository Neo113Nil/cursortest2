package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Fn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Bl f10295a;

    public Fn() {
        this(new Bl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0503b6 fromModel(Gn gn) {
        C0503b6 c0503b6 = new C0503b6();
        c0503b6.f11478a = (String) WrapUtils.getOrDefault(gn.f10341a, "");
        c0503b6.f11479b = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(gn.f10342b, ""));
        List<Dl> list = gn.f10343c;
        if (list != null) {
            c0503b6.f11480c = this.f10295a.fromModel(list);
        }
        Gn gn2 = gn.f10344d;
        if (gn2 != null) {
            c0503b6.f11481d = fromModel(gn2);
        }
        List list2 = gn.f10345e;
        int i4 = 0;
        if (list2 == null) {
            c0503b6.f11482e = new C0503b6[0];
            return c0503b6;
        }
        c0503b6.f11482e = new C0503b6[list2.size()];
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            c0503b6.f11482e[i4] = fromModel((Gn) it.next());
            i4++;
        }
        return c0503b6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Fn(Bl bl) {
        this.f10295a = bl;
    }

    public final Gn a(C0503b6 c0503b6) {
        throw new UnsupportedOperationException();
    }
}
