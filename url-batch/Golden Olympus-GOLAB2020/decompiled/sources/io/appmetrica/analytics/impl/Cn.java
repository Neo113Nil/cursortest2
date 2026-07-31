package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class Cn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Bl f37325a;

    public Cn() {
        this(new Bl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3084x6 fromModel(@NonNull Dn dn) {
        C3084x6 c3084x6 = new C3084x6();
        c3084x6.f40150a = (String) WrapUtils.getOrDefault(dn.f37384a, "");
        c3084x6.f40151b = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(dn.f37385b, ""));
        List<Dl> list = dn.f37386c;
        if (list != null) {
            c3084x6.f40152c = this.f37325a.fromModel(list);
        }
        Dn dn2 = dn.f37387d;
        if (dn2 != null) {
            c3084x6.f40153d = fromModel(dn2);
        }
        List list2 = dn.f37388e;
        int i4 = 0;
        if (list2 == null) {
            c3084x6.f40154e = new C3084x6[0];
            return c3084x6;
        }
        c3084x6.f40154e = new C3084x6[list2.size()];
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            c3084x6.f40154e[i4] = fromModel((Dn) it.next());
            i4++;
        }
        return c3084x6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Cn(Bl bl) {
        this.f37325a = bl;
    }

    @NonNull
    public final Dn a(@NonNull C3084x6 c3084x6) {
        throw new UnsupportedOperationException();
    }
}
