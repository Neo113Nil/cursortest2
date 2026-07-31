package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.tf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2989tf implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Ff f39858a;

    /* renamed from: b, reason: collision with root package name */
    public final C2860of f39859b;

    public C2989tf() {
        this(new Ff(), new C2860of());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Bf fromModel(@NonNull C2937rf c2937rf) {
        Bf bf = new Bf();
        bf.f37245a = this.f39858a.fromModel(c2937rf.f39728a);
        bf.f37246b = new Af[c2937rf.f39729b.size()];
        Iterator<C2912qf> it = c2937rf.f39729b.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            bf.f37246b[i4] = this.f39859b.fromModel(it.next());
            i4++;
        }
        return bf;
    }

    public C2989tf(Ff ff, C2860of c2860of) {
        this.f39858a = ff;
        this.f39859b = c2860of;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2937rf toModel(@NonNull Bf bf) {
        Ef model;
        ArrayList arrayList = new ArrayList(bf.f37246b.length);
        for (Af af : bf.f37246b) {
            arrayList.add(this.f39859b.toModel(af));
        }
        C3145zf c3145zf = bf.f37245a;
        if (c3145zf == null) {
            model = this.f39858a.toModel(new C3145zf());
        } else {
            model = this.f39858a.toModel(c3145zf);
        }
        return new C2937rf(model, arrayList);
    }
}
