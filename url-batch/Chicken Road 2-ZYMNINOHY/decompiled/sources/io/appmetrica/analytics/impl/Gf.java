package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Gf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0950se f10320a;

    /* renamed from: b, reason: collision with root package name */
    public final C1081xf f10321b;

    /* renamed from: c, reason: collision with root package name */
    public final C0758l3 f10322c;

    /* renamed from: d, reason: collision with root package name */
    public final If f10323d;

    /* renamed from: e, reason: collision with root package name */
    public final C0946sa f10324e;

    /* renamed from: f, reason: collision with root package name */
    public final C0946sa f10325f;

    public Gf() {
        this(new C0950se(), new C1081xf(), new C0758l3(), new If(), new C0946sa(100), new C0946sa(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(Hf hf) {
        Di di;
        Di di2;
        Di di3;
        Di di4;
        C0815n8 c0815n8 = new C0815n8();
        Mn a3 = this.f10324e.a(hf.f10366a);
        c0815n8.f12408a = StringUtils.getUTF8Bytes((String) a3.f10676a);
        Mn a4 = this.f10325f.a(hf.f10367b);
        c0815n8.f12409b = StringUtils.getUTF8Bytes((String) a4.f10676a);
        List<String> list = hf.f10368c;
        Di di5 = null;
        if (list != null) {
            di = this.f10322c.fromModel(list);
            c0815n8.f12410c = (C0608f8) di.f10202a;
        } else {
            di = null;
        }
        Map<String, String> map = hf.f10369d;
        if (map != null) {
            di2 = this.f10320a.fromModel(map);
            c0815n8.f12411d = (C0763l8) di2.f10202a;
        } else {
            di2 = null;
        }
        C1133zf c1133zf = hf.f10370e;
        if (c1133zf != null) {
            di3 = this.f10321b.fromModel(c1133zf);
            c0815n8.f12412e = (C0789m8) di3.f10202a;
        } else {
            di3 = null;
        }
        C1133zf c1133zf2 = hf.f10371f;
        if (c1133zf2 != null) {
            di4 = this.f10321b.fromModel(c1133zf2);
            c0815n8.f12413f = (C0789m8) di4.f10202a;
        } else {
            di4 = null;
        }
        List<String> list2 = hf.f10372g;
        if (list2 != null) {
            di5 = this.f10323d.fromModel(list2);
            c0815n8.f12414g = (C0841o8[]) di5.f10202a;
        }
        return new Di(c0815n8, new C0474a3(C0474a3.b(a3, a4, di, di2, di3, di4, di5)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Gf(C0950se c0950se, C1081xf c1081xf, C0758l3 c0758l3, If r4, C0946sa c0946sa, C0946sa c0946sa2) {
        this.f10320a = c0950se;
        this.f10321b = c1081xf;
        this.f10322c = c0758l3;
        this.f10323d = r4;
        this.f10324e = c0946sa;
        this.f10325f = c0946sa2;
    }

    public final Hf a(Di di) {
        throw new UnsupportedOperationException();
    }
}
