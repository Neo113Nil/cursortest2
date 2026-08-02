package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.List;

/* loaded from: classes.dex */
public final class Rn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Fn f10898a;

    /* renamed from: b, reason: collision with root package name */
    public final W f10899b;

    /* renamed from: c, reason: collision with root package name */
    public final C0658h6 f10900c;

    /* renamed from: d, reason: collision with root package name */
    public final Bl f10901d;

    /* renamed from: e, reason: collision with root package name */
    public final He f10902e;

    /* renamed from: f, reason: collision with root package name */
    public final Ie f10903f;

    public Rn() {
        this(new Fn(), new W(new C1089xn()), new C0658h6(), new Bl(), new He(), new Ie());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V5 fromModel(Qn qn) {
        V5 v5 = new V5();
        Gn gn = qn.f10850a;
        if (gn != null) {
            v5.f11099a = this.f10898a.fromModel(gn);
        }
        V v = qn.f10851b;
        if (v != null) {
            v5.f11100b = this.f10899b.fromModel(v);
        }
        List<Dl> list = qn.f10852c;
        if (list != null) {
            v5.f11103e = this.f10901d.fromModel(list);
        }
        String str = qn.f10856g;
        if (str != null) {
            v5.f11101c = str;
        }
        v5.f11102d = this.f10900c.a(qn.f10857h);
        if (!TextUtils.isEmpty(qn.f10853d)) {
            v5.f11106h = this.f10902e.fromModel(qn.f10853d);
        }
        if (!TextUtils.isEmpty(qn.f10854e)) {
            v5.f11107i = qn.f10854e.getBytes();
        }
        if (!AbstractC0779lo.a(qn.f10855f)) {
            v5.f11108j = this.f10903f.fromModel(qn.f10855f);
        }
        return v5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Rn(Fn fn, W w4, C0658h6 c0658h6, Bl bl, He he, Ie ie) {
        this.f10899b = w4;
        this.f10898a = fn;
        this.f10900c = c0658h6;
        this.f10901d = bl;
        this.f10902e = he;
        this.f10903f = ie;
    }

    public final Qn a(V5 v5) {
        throw new UnsupportedOperationException();
    }
}
