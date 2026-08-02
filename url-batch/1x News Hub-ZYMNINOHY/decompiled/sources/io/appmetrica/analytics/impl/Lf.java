package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Lf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0983ye f6282a;

    /* renamed from: b, reason: collision with root package name */
    public final Cf f6283b;

    /* renamed from: c, reason: collision with root package name */
    public final C0843t3 f6284c;

    /* renamed from: d, reason: collision with root package name */
    public final Nf f6285d;

    /* renamed from: e, reason: collision with root package name */
    public final C1004za f6286e;
    public final C1004za f;

    public Lf() {
        this(new C0983ye(), new Cf(), new C0843t3(), new Nf(), new C1004za(100), new C1004za(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(Mf mf) {
        Ii ii;
        Ii ii2;
        Ii ii3;
        Ii ii4;
        C0848t8 c0848t8 = new C0848t8();
        On a3 = this.f6286e.a(mf.f6334a);
        c0848t8.f8354a = StringUtils.getUTF8Bytes((String) a3.f6419a);
        On a4 = this.f.a(mf.f6335b);
        c0848t8.f8355b = StringUtils.getUTF8Bytes((String) a4.f6419a);
        List<String> list = mf.f6336c;
        Ii ii5 = null;
        if (list != null) {
            ii = this.f6284c.fromModel(list);
            c0848t8.f8356c = (C0641l8) ii.f6160a;
        } else {
            ii = null;
        }
        Map<String, String> map = mf.f6337d;
        if (map != null) {
            ii2 = this.f6282a.fromModel(map);
            c0848t8.f8357d = (C0796r8) ii2.f6160a;
        } else {
            ii2 = null;
        }
        Ef ef = mf.f6338e;
        if (ef != null) {
            ii3 = this.f6283b.fromModel(ef);
            c0848t8.f8358e = (C0822s8) ii3.f6160a;
        } else {
            ii3 = null;
        }
        Ef ef2 = mf.f;
        if (ef2 != null) {
            ii4 = this.f6283b.fromModel(ef2);
            c0848t8.f = (C0822s8) ii4.f6160a;
        } else {
            ii4 = null;
        }
        List<String> list2 = mf.f6339g;
        if (list2 != null) {
            ii5 = this.f6285d.fromModel(list2);
            c0848t8.f8359g = (C0874u8[]) ii5.f6160a;
        }
        return new Ii(c0848t8, new C0559i3(C0559i3.b(a3, a4, ii, ii2, ii3, ii4, ii5)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Lf(C0983ye c0983ye, Cf cf, C0843t3 c0843t3, Nf nf, C1004za c1004za, C1004za c1004za2) {
        this.f6282a = c0983ye;
        this.f6283b = cf;
        this.f6284c = c0843t3;
        this.f6285d = nf;
        this.f6286e = c1004za;
        this.f = c1004za2;
    }

    public final Mf a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
