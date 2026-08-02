package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.gg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0642gg implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Yi f11931a;

    /* renamed from: b, reason: collision with root package name */
    public final C0946sa f11932b;

    /* renamed from: c, reason: collision with root package name */
    public final C0946sa f11933c;

    public C0642gg() {
        this(new Yi(), new C0946sa(100), new C0946sa(2048));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(C1082xg c1082xg) {
        Di di;
        C0867p8 c0867p8 = new C0867p8();
        Mn a3 = this.f11932b.a(c1082xg.f13028a);
        c0867p8.f12568a = StringUtils.getUTF8Bytes((String) a3.f10676a);
        Mn a4 = this.f11933c.a(c1082xg.f13029b);
        c0867p8.f12569b = StringUtils.getUTF8Bytes((String) a4.f10676a);
        C0542cj c0542cj = c1082xg.f13030c;
        if (c0542cj != null) {
            di = this.f11931a.fromModel(c0542cj);
            c0867p8.f12570c = (C0893q8) di.f10202a;
        } else {
            di = null;
        }
        return new Di(c0867p8, new C0474a3(C0474a3.b(a3, a4, di)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0642gg(Yi yi, C0946sa c0946sa, C0946sa c0946sa2) {
        this.f11931a = yi;
        this.f11932b = c0946sa;
        this.f11933c = c0946sa2;
    }

    public final C1082xg a(Di di) {
        throw new UnsupportedOperationException();
    }
}
