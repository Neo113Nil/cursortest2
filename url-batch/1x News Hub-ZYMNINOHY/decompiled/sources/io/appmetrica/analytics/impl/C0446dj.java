package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.dj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0446dj implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0983ye f7189a;

    /* renamed from: b, reason: collision with root package name */
    public final C0843t3 f7190b;

    /* renamed from: c, reason: collision with root package name */
    public final C1004za f7191c;

    /* renamed from: d, reason: collision with root package name */
    public final C1004za f7192d;

    public C0446dj() {
        this(new C0983ye(), new C0843t3(), new C1004za(100), new C1004za(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(C0549hj c0549hj) {
        Ii ii;
        C0926w8 c0926w8 = new C0926w8();
        On a3 = this.f7191c.a(c0549hj.f7450a);
        c0926w8.f8556a = StringUtils.getUTF8Bytes((String) a3.f6419a);
        List<String> list = c0549hj.f7451b;
        Ii ii2 = null;
        if (list != null) {
            ii = this.f7190b.fromModel(list);
            c0926w8.f8557b = (C0641l8) ii.f6160a;
        } else {
            ii = null;
        }
        On a4 = this.f7192d.a(c0549hj.f7452c);
        c0926w8.f8558c = StringUtils.getUTF8Bytes((String) a4.f6419a);
        Map<String, String> map = c0549hj.f7453d;
        if (map != null) {
            ii2 = this.f7189a.fromModel(map);
            c0926w8.f8559d = (C0796r8) ii2.f6160a;
        }
        return new Ii(c0926w8, new C0559i3(C0559i3.b(a3, ii, a4, ii2)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0446dj(C0983ye c0983ye, C0843t3 c0843t3, C1004za c1004za, C1004za c1004za2) {
        this.f7189a = c0983ye;
        this.f7190b = c0843t3;
        this.f7191c = c1004za;
        this.f7192d = c1004za2;
    }

    public final C0549hj a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
