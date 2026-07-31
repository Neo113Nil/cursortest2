package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.List;

/* loaded from: classes3.dex */
public final class Rg implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Cn f38207a;

    /* renamed from: b, reason: collision with root package name */
    public final V f38208b;

    /* renamed from: c, reason: collision with root package name */
    public final D6 f38209c;

    /* renamed from: d, reason: collision with root package name */
    public final Bl f38210d;

    /* renamed from: e, reason: collision with root package name */
    public final Ve f38211e;

    /* renamed from: f, reason: collision with root package name */
    public final We f38212f;

    public Rg() {
        this(new Cn(), new V(new C3023un()), new D6(), new Bl(), new Ve(), new We());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2980t6 fromModel(@NonNull Qg qg) {
        C2980t6 c2980t6 = new C2980t6();
        c2980t6.f39837f = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(qg.f38167a, c2980t6.f39837f));
        Nn nn = qg.f38168b;
        if (nn != null) {
            Dn dn = nn.f38034a;
            if (dn != null) {
                c2980t6.f39832a = this.f38207a.fromModel(dn);
            }
            U u4 = nn.f38035b;
            if (u4 != null) {
                c2980t6.f39833b = this.f38208b.fromModel(u4);
            }
            List<Dl> list = nn.f38036c;
            if (list != null) {
                c2980t6.f39836e = this.f38210d.fromModel(list);
            }
            c2980t6.f39834c = (String) WrapUtils.getOrDefault(nn.f38040g, c2980t6.f39834c);
            c2980t6.f39835d = this.f38209c.a(nn.f38041h);
            if (!TextUtils.isEmpty(nn.f38037d)) {
                c2980t6.f39840i = this.f38211e.fromModel(nn.f38037d);
            }
            if (!TextUtils.isEmpty(nn.f38038e)) {
                c2980t6.f39841j = nn.f38038e.getBytes();
            }
            if (!AbstractC2713io.a(nn.f38039f)) {
                c2980t6.f39842k = this.f38212f.fromModel(nn.f38039f);
            }
        }
        return c2980t6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Rg(Cn cn, V v4, D6 d6, Bl bl, Ve ve, We we) {
        this.f38207a = cn;
        this.f38208b = v4;
        this.f38209c = d6;
        this.f38210d = bl;
        this.f38211e = ve;
        this.f38212f = we;
    }

    @NonNull
    public final Qg a(@NonNull C2980t6 c2980t6) {
        throw new UnsupportedOperationException();
    }
}
