package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.gf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0202gf implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0505sf f1272a;
    public final C0073bf b;

    public C0202gf() {
        this(new C0505sf(), new C0073bf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0406of fromModel(C0150ef c0150ef) {
        C0406of c0406of = new C0406of();
        c0406of.f1415a = this.f1272a.fromModel(c0150ef.f1237a);
        c0406of.b = new C0381nf[c0150ef.b.size()];
        Iterator<C0125df> it = c0150ef.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            c0406of.b[i] = this.b.fromModel(it.next());
            i++;
        }
        return c0406of;
    }

    public C0202gf(C0505sf c0505sf, C0073bf c0073bf) {
        this.f1272a = c0505sf;
        this.b = c0073bf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0150ef toModel(C0406of c0406of) {
        C0480rf model;
        ArrayList arrayList = new ArrayList(c0406of.b.length);
        for (C0381nf c0381nf : c0406of.b) {
            arrayList.add(this.b.toModel(c0381nf));
        }
        C0356mf c0356mf = c0406of.f1415a;
        if (c0356mf == null) {
            model = this.f1272a.toModel(new C0356mf());
        } else {
            model = this.f1272a.toModel(c0356mf);
        }
        return new C0150ef(model, arrayList);
    }
}
