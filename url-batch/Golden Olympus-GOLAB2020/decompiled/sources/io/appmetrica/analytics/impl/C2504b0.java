package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2504b0 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final V f38689a;

    /* renamed from: b, reason: collision with root package name */
    public final D6 f38690b;

    public C2504b0() {
        this(new V(new C3023un()), new D6());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2851o6 fromModel(@NonNull C2477a0 c2477a0) {
        C2851o6 c2851o6 = new C2851o6();
        c2851o6.f39557a = this.f38689a.fromModel(c2477a0.f38652a);
        String str = c2477a0.f38653b;
        if (str != null) {
            c2851o6.f39558b = str;
        }
        c2851o6.f39559c = this.f38690b.a(c2477a0.f38654c);
        return c2851o6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C2504b0(V v4, D6 d6) {
        this.f38689a = v4;
        this.f38690b = d6;
    }

    @NonNull
    public final C2477a0 a(@NonNull C2851o6 c2851o6) {
        throw new UnsupportedOperationException();
    }
}
