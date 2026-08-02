package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Yi implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0950se f11310a;

    /* renamed from: b, reason: collision with root package name */
    public final C0758l3 f11311b;

    /* renamed from: c, reason: collision with root package name */
    public final C0946sa f11312c;

    /* renamed from: d, reason: collision with root package name */
    public final C0946sa f11313d;

    public Yi() {
        this(new C0950se(), new C0758l3(), new C0946sa(100), new C0946sa(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(C0542cj c0542cj) {
        Di di;
        C0893q8 c0893q8 = new C0893q8();
        Mn a3 = this.f11312c.a(c0542cj.f11619a);
        c0893q8.f12608a = StringUtils.getUTF8Bytes((String) a3.f10676a);
        List<String> list = c0542cj.f11620b;
        Di di2 = null;
        if (list != null) {
            di = this.f11311b.fromModel(list);
            c0893q8.f12609b = (C0608f8) di.f10202a;
        } else {
            di = null;
        }
        Mn a4 = this.f11313d.a(c0542cj.f11621c);
        c0893q8.f12610c = StringUtils.getUTF8Bytes((String) a4.f10676a);
        Map<String, String> map = c0542cj.f11622d;
        if (map != null) {
            di2 = this.f11310a.fromModel(map);
            c0893q8.f12611d = (C0763l8) di2.f10202a;
        }
        return new Di(c0893q8, new C0474a3(C0474a3.b(a3, di, a4, di2)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Yi(C0950se c0950se, C0758l3 c0758l3, C0946sa c0946sa, C0946sa c0946sa2) {
        this.f11310a = c0950se;
        this.f11311b = c0758l3;
        this.f11312c = c0946sa;
        this.f11313d = c0946sa2;
    }

    public final C0542cj a(Di di) {
        throw new UnsupportedOperationException();
    }
}
