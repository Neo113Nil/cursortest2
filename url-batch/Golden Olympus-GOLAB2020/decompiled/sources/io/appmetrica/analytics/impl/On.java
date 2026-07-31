package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.List;

/* loaded from: classes3.dex */
public final class On implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Cn f38103a;

    /* renamed from: b, reason: collision with root package name */
    public final V f38104b;

    /* renamed from: c, reason: collision with root package name */
    public final D6 f38105c;

    /* renamed from: d, reason: collision with root package name */
    public final Bl f38106d;

    /* renamed from: e, reason: collision with root package name */
    public final Ve f38107e;

    /* renamed from: f, reason: collision with root package name */
    public final We f38108f;

    public On() {
        this(new Cn(), new V(new C3023un()), new D6(), new Bl(), new Ve(), new We());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2928r6 fromModel(@NonNull Nn nn) {
        C2928r6 c2928r6 = new C2928r6();
        Dn dn = nn.f38034a;
        if (dn != null) {
            c2928r6.f39706a = this.f38103a.fromModel(dn);
        }
        U u4 = nn.f38035b;
        if (u4 != null) {
            c2928r6.f39707b = this.f38104b.fromModel(u4);
        }
        List<Dl> list = nn.f38036c;
        if (list != null) {
            c2928r6.f39710e = this.f38106d.fromModel(list);
        }
        String str = nn.f38040g;
        if (str != null) {
            c2928r6.f39708c = str;
        }
        c2928r6.f39709d = this.f38105c.a(nn.f38041h);
        if (!TextUtils.isEmpty(nn.f38037d)) {
            c2928r6.f39713h = this.f38107e.fromModel(nn.f38037d);
        }
        if (!TextUtils.isEmpty(nn.f38038e)) {
            c2928r6.f39714i = nn.f38038e.getBytes();
        }
        if (!AbstractC2713io.a(nn.f38039f)) {
            c2928r6.f39715j = this.f38108f.fromModel(nn.f38039f);
        }
        return c2928r6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public On(Cn cn, V v4, D6 d6, Bl bl, Ve ve, We we) {
        this.f38104b = v4;
        this.f38103a = cn;
        this.f38105c = d6;
        this.f38106d = bl;
        this.f38107e = ve;
        this.f38108f = we;
    }

    @NonNull
    public final Nn a(@NonNull C2928r6 c2928r6) {
        throw new UnsupportedOperationException();
    }
}
