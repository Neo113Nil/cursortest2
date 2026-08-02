package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class Eg implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Fn f10252a;

    /* renamed from: b, reason: collision with root package name */
    public final W f10253b;

    /* renamed from: c, reason: collision with root package name */
    public final C0658h6 f10254c;

    /* renamed from: d, reason: collision with root package name */
    public final Bl f10255d;

    /* renamed from: e, reason: collision with root package name */
    public final He f10256e;

    /* renamed from: f, reason: collision with root package name */
    public final Ie f10257f;

    public Eg() {
        this(new Fn(), new W(new C1089xn()), new C0658h6(), new Bl(), new He(), new Ie());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X5 fromModel(Dg dg) {
        X5 x5 = new X5();
        x5.f11249f = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(dg.f10198a, x5.f11249f));
        Qn qn = dg.f10199b;
        if (qn != null) {
            Gn gn = qn.f10850a;
            if (gn != null) {
                x5.f11244a = this.f10252a.fromModel(gn);
            }
            V v = qn.f10851b;
            if (v != null) {
                x5.f11245b = this.f10253b.fromModel(v);
            }
            List<Dl> list = qn.f10852c;
            if (list != null) {
                x5.f11248e = this.f10255d.fromModel(list);
            }
            x5.f11246c = (String) WrapUtils.getOrDefault(qn.f10856g, x5.f11246c);
            x5.f11247d = this.f10254c.a(qn.f10857h);
            if (!TextUtils.isEmpty(qn.f10853d)) {
                x5.f11252i = this.f10256e.fromModel(qn.f10853d);
            }
            if (!TextUtils.isEmpty(qn.f10854e)) {
                x5.f11253j = qn.f10854e.getBytes();
            }
            if (!AbstractC0779lo.a(qn.f10855f)) {
                x5.f11254k = this.f10257f.fromModel(qn.f10855f);
            }
        }
        return x5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Eg(Fn fn, W w4, C0658h6 c0658h6, Bl bl, He he, Ie ie) {
        this.f10252a = fn;
        this.f10253b = w4;
        this.f10254c = c0658h6;
        this.f10255d = bl;
        this.f10256e = he;
        this.f10257f = ie;
    }

    public final Dg a(X5 x5) {
        throw new UnsupportedOperationException();
    }
}
