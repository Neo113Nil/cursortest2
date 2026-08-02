package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class Jg implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Hn f6209a;

    /* renamed from: b, reason: collision with root package name */
    public final W f6210b;

    /* renamed from: c, reason: collision with root package name */
    public final C0717o6 f6211c;

    /* renamed from: d, reason: collision with root package name */
    public final Fl f6212d;

    /* renamed from: e, reason: collision with root package name */
    public final Me f6213e;
    public final Ne f;

    public Jg() {
        this(new Hn(), new W(new C1017zn()), new C0717o6(), new Fl(), new Me(), new Ne());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0458e6 fromModel(Ig ig) {
        C0458e6 c0458e6 = new C0458e6();
        c0458e6.f = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(ig.f6156a, c0458e6.f));
        Sn sn = ig.f6157b;
        if (sn != null) {
            In in = sn.f6664a;
            if (in != null) {
                c0458e6.f7248a = this.f6209a.fromModel(in);
            }
            V v = sn.f6665b;
            if (v != null) {
                c0458e6.f7249b = this.f6210b.fromModel(v);
            }
            List<Hl> list = sn.f6666c;
            if (list != null) {
                c0458e6.f7252e = this.f6212d.fromModel(list);
            }
            c0458e6.f7250c = (String) WrapUtils.getOrDefault(sn.f6669g, c0458e6.f7250c);
            c0458e6.f7251d = this.f6211c.a(sn.f6670h);
            if (!TextUtils.isEmpty(sn.f6667d)) {
                c0458e6.f7255i = this.f6213e.fromModel(sn.f6667d);
            }
            if (!TextUtils.isEmpty(sn.f6668e)) {
                c0458e6.f7256j = sn.f6668e.getBytes();
            }
            if (!AbstractC0709no.a(sn.f)) {
                c0458e6.f7257k = this.f.fromModel(sn.f);
            }
        }
        return c0458e6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Jg(Hn hn, W w3, C0717o6 c0717o6, Fl fl, Me me, Ne ne) {
        this.f6209a = hn;
        this.f6210b = w3;
        this.f6211c = c0717o6;
        this.f6212d = fl;
        this.f6213e = me;
        this.f = ne;
    }

    public final Ig a(C0458e6 c0458e6) {
        throw new UnsupportedOperationException();
    }
}
