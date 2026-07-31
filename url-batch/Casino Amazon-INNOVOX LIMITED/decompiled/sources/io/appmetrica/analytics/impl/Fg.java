package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.List;

/* loaded from: classes3.dex */
public final class Fg implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Gn f846a;
    public final W b;
    public final C0245i6 c;
    public final Cl d;
    public final Ie e;
    public final Je f;

    public Fg() {
        this(new Gn(), new W(new C0663yn()), new C0245i6(), new Cl(), new Ie(), new Je());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y5 fromModel(Eg eg) {
        Y5 y5 = new Y5();
        y5.f = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(eg.f828a, y5.f));
        Rn rn = eg.b;
        if (rn != null) {
            Hn hn = rn.f1032a;
            if (hn != null) {
                y5.f1127a = this.f846a.fromModel(hn);
            }
            V v = rn.b;
            if (v != null) {
                y5.b = this.b.fromModel(v);
            }
            List<El> list = rn.c;
            if (list != null) {
                y5.e = this.d.fromModel(list);
            }
            y5.c = (String) WrapUtils.getOrDefault(rn.g, y5.c);
            y5.d = this.c.a(rn.h);
            if (!TextUtils.isEmpty(rn.d)) {
                y5.i = this.e.fromModel(rn.d);
            }
            if (!TextUtils.isEmpty(rn.e)) {
                y5.j = rn.e.getBytes();
            }
            if (!mo.a(rn.f)) {
                y5.k = this.f.fromModel(rn.f);
            }
        }
        return y5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Fg(Gn gn, W w, C0245i6 c0245i6, Cl cl, Ie ie, Je je) {
        this.f846a = gn;
        this.b = w;
        this.c = c0245i6;
        this.d = cl;
        this.e = ie;
        this.f = je;
    }

    public final Eg a(Y5 y5) {
        throw new UnsupportedOperationException();
    }
}
