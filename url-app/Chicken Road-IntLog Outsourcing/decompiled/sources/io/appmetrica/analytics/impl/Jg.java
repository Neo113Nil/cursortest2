package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class Jg implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Hn f7011a;

    /* renamed from: b, reason: collision with root package name */
    public final W f7012b;

    /* renamed from: c, reason: collision with root package name */
    public final C0868o6 f7013c;

    /* renamed from: d, reason: collision with root package name */
    public final Fl f7014d;

    /* renamed from: e, reason: collision with root package name */
    public final Me f7015e;

    /* renamed from: f, reason: collision with root package name */
    public final Ne f7016f;

    public Jg() {
        this(new Hn(), new W(new C1168zn()), new C0868o6(), new Fl(), new Me(), new Ne());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0609e6 fromModel(Ig ig) {
        C0609e6 c0609e6 = new C0609e6();
        c0609e6.f8117f = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(ig.f6956a, c0609e6.f8117f));
        Sn sn = ig.f6957b;
        if (sn != null) {
            In in = sn.f7491a;
            if (in != null) {
                c0609e6.f8112a = this.f7011a.fromModel(in);
            }
            V v4 = sn.f7492b;
            if (v4 != null) {
                c0609e6.f8113b = this.f7012b.fromModel(v4);
            }
            List<Hl> list = sn.f7493c;
            if (list != null) {
                c0609e6.f8116e = this.f7014d.fromModel(list);
            }
            c0609e6.f8114c = (String) WrapUtils.getOrDefault(sn.f7497g, c0609e6.f8114c);
            c0609e6.f8115d = this.f7013c.a(sn.f7498h);
            if (!TextUtils.isEmpty(sn.f7494d)) {
                c0609e6.f8120i = this.f7015e.fromModel(sn.f7494d);
            }
            if (!TextUtils.isEmpty(sn.f7495e)) {
                c0609e6.f8121j = sn.f7495e.getBytes();
            }
            if (!AbstractC0860no.a(sn.f7496f)) {
                c0609e6.f8122k = this.f7016f.fromModel(sn.f7496f);
            }
        }
        return c0609e6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Jg(Hn hn, W w3, C0868o6 c0868o6, Fl fl, Me me, Ne ne) {
        this.f7011a = hn;
        this.f7012b = w3;
        this.f7013c = c0868o6;
        this.f7014d = fl;
        this.f7015e = me;
        this.f7016f = ne;
    }

    public final Ig a(C0609e6 c0609e6) {
        throw new UnsupportedOperationException();
    }
}
