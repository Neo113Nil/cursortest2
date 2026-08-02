package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.ff, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0615ff implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0925rf f11839a;

    /* renamed from: b, reason: collision with root package name */
    public final C0486af f11840b;

    public C0615ff() {
        this(new C0925rf(), new C0486af());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0822nf fromModel(C0564df c0564df) {
        C0822nf c0822nf = new C0822nf();
        c0822nf.f12462a = this.f11839a.fromModel(c0564df.f11680a);
        c0822nf.f12463b = new C0796mf[c0564df.f11681b.size()];
        Iterator<C0538cf> it = c0564df.f11681b.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            c0822nf.f12463b[i4] = this.f11840b.fromModel(it.next());
            i4++;
        }
        return c0822nf;
    }

    public C0615ff(C0925rf c0925rf, C0486af c0486af) {
        this.f11839a = c0925rf;
        this.f11840b = c0486af;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0564df toModel(C0822nf c0822nf) {
        C0900qf model;
        ArrayList arrayList = new ArrayList(c0822nf.f12463b.length);
        for (C0796mf c0796mf : c0822nf.f12463b) {
            arrayList.add(this.f11840b.toModel(c0796mf));
        }
        C0770lf c0770lf = c0822nf.f12462a;
        if (c0770lf == null) {
            model = this.f11839a.toModel(new C0770lf());
        } else {
            model = this.f11839a.toModel(c0770lf);
        }
        return new C0564df(model, arrayList);
    }
}
