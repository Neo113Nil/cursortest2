package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.kf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0622kf implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0933wf f7720a;

    /* renamed from: b, reason: collision with root package name */
    public final C0493ff f7721b;

    public C0622kf() {
        this(new C0933wf(), new C0493ff());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0829sf fromModel(Cif cif) {
        C0829sf c0829sf = new C0829sf();
        c0829sf.f8313a = this.f7720a.fromModel(cif.f7566a);
        c0829sf.f8314b = new C0803rf[cif.f7567b.size()];
        Iterator<C0545hf> it = cif.f7567b.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            c0829sf.f8314b[i3] = this.f7721b.fromModel(it.next());
            i3++;
        }
        return c0829sf;
    }

    public C0622kf(C0933wf c0933wf, C0493ff c0493ff) {
        this.f7720a = c0933wf;
        this.f7721b = c0493ff;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Cif toModel(C0829sf c0829sf) {
        C0907vf model;
        ArrayList arrayList = new ArrayList(c0829sf.f8314b.length);
        for (C0803rf c0803rf : c0829sf.f8314b) {
            arrayList.add(this.f7721b.toModel(c0803rf));
        }
        C0778qf c0778qf = c0829sf.f8313a;
        if (c0778qf == null) {
            model = this.f7720a.toModel(new C0778qf());
        } else {
            model = this.f7720a.toModel(c0778qf);
        }
        return new Cif(model, arrayList);
    }
}
