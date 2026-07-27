package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.List;

/* loaded from: classes.dex */
public final class Tn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Hn f7553a;

    /* renamed from: b, reason: collision with root package name */
    public final W f7554b;

    /* renamed from: c, reason: collision with root package name */
    public final C0868o6 f7555c;

    /* renamed from: d, reason: collision with root package name */
    public final Fl f7556d;

    /* renamed from: e, reason: collision with root package name */
    public final Me f7557e;

    /* renamed from: f, reason: collision with root package name */
    public final Ne f7558f;

    public Tn() {
        this(new Hn(), new W(new C1168zn()), new C0868o6(), new Fl(), new Me(), new Ne());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0558c6 fromModel(Sn sn) {
        C0558c6 c0558c6 = new C0558c6();
        In in = sn.f7491a;
        if (in != null) {
            c0558c6.f7977a = this.f7553a.fromModel(in);
        }
        V v4 = sn.f7492b;
        if (v4 != null) {
            c0558c6.f7978b = this.f7554b.fromModel(v4);
        }
        List<Hl> list = sn.f7493c;
        if (list != null) {
            c0558c6.f7981e = this.f7556d.fromModel(list);
        }
        String str = sn.f7497g;
        if (str != null) {
            c0558c6.f7979c = str;
        }
        c0558c6.f7980d = this.f7555c.a(sn.f7498h);
        if (!TextUtils.isEmpty(sn.f7494d)) {
            c0558c6.f7984h = this.f7557e.fromModel(sn.f7494d);
        }
        if (!TextUtils.isEmpty(sn.f7495e)) {
            c0558c6.f7985i = sn.f7495e.getBytes();
        }
        if (!AbstractC0860no.a(sn.f7496f)) {
            c0558c6.f7986j = this.f7558f.fromModel(sn.f7496f);
        }
        return c0558c6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Tn(Hn hn, W w3, C0868o6 c0868o6, Fl fl, Me me, Ne ne) {
        this.f7554b = w3;
        this.f7553a = hn;
        this.f7555c = c0868o6;
        this.f7556d = fl;
        this.f7557e = me;
        this.f7558f = ne;
    }

    public final Sn a(C0558c6 c0558c6) {
        throw new UnsupportedOperationException();
    }
}
