package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.List;

/* loaded from: classes.dex */
public final class Tn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Hn f6724a;

    /* renamed from: b, reason: collision with root package name */
    public final W f6725b;

    /* renamed from: c, reason: collision with root package name */
    public final C0717o6 f6726c;

    /* renamed from: d, reason: collision with root package name */
    public final Fl f6727d;

    /* renamed from: e, reason: collision with root package name */
    public final Me f6728e;
    public final Ne f;

    public Tn() {
        this(new Hn(), new W(new C1017zn()), new C0717o6(), new Fl(), new Me(), new Ne());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0407c6 fromModel(Sn sn) {
        C0407c6 c0407c6 = new C0407c6();
        In in = sn.f6664a;
        if (in != null) {
            c0407c6.f7122a = this.f6724a.fromModel(in);
        }
        V v = sn.f6665b;
        if (v != null) {
            c0407c6.f7123b = this.f6725b.fromModel(v);
        }
        List<Hl> list = sn.f6666c;
        if (list != null) {
            c0407c6.f7126e = this.f6727d.fromModel(list);
        }
        String str = sn.f6669g;
        if (str != null) {
            c0407c6.f7124c = str;
        }
        c0407c6.f7125d = this.f6726c.a(sn.f6670h);
        if (!TextUtils.isEmpty(sn.f6667d)) {
            c0407c6.f7128h = this.f6728e.fromModel(sn.f6667d);
        }
        if (!TextUtils.isEmpty(sn.f6668e)) {
            c0407c6.f7129i = sn.f6668e.getBytes();
        }
        if (!AbstractC0709no.a(sn.f)) {
            c0407c6.f7130j = this.f.fromModel(sn.f);
        }
        return c0407c6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Tn(Hn hn, W w3, C0717o6 c0717o6, Fl fl, Me me, Ne ne) {
        this.f6725b = w3;
        this.f6724a = hn;
        this.f6726c = c0717o6;
        this.f6727d = fl;
        this.f6728e = me;
        this.f = ne;
    }

    public final Sn a(C0407c6 c0407c6) {
        throw new UnsupportedOperationException();
    }
}
