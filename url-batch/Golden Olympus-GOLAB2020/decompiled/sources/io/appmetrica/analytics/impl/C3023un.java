package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.un, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3023un implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Bl f39950a;

    public C3023un() {
        this(new Bl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3058w6 fromModel(@NonNull C2997tn c2997tn) {
        C3058w6 c3058w6 = new C3058w6();
        Integer num = c2997tn.f39882e;
        c3058w6.f40014e = num == null ? -1 : num.intValue();
        c3058w6.f40013d = c2997tn.f39881d;
        c3058w6.f40011b = c2997tn.f39879b;
        c3058w6.f40010a = c2997tn.f39878a;
        c3058w6.f40012c = c2997tn.f39880c;
        Bl bl = this.f39950a;
        List list = c2997tn.f39883f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Dl((StackTraceElement) it.next()));
        }
        c3058w6.f40015f = bl.fromModel(arrayList);
        return c3058w6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C3023un(Bl bl) {
        this.f39950a = bl;
    }

    @NonNull
    public final C2997tn a(@NonNull C3058w6 c3058w6) {
        throw new UnsupportedOperationException();
    }
}
