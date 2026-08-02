package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.gl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0647gl implements InterfaceC0505b8 {

    /* renamed from: a, reason: collision with root package name */
    public final Yi f11942a;

    public C0647gl() {
        this(new Yi());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Di> fromModel(C0621fl c0621fl) {
        C0996u8 c0996u8 = new C0996u8();
        c0996u8.f12816a = 1;
        c0996u8.f12817b = new C0970t8();
        Di fromModel = this.f11942a.fromModel(c0621fl.f11856a);
        c0996u8.f12817b.f12773a = (C0893q8) fromModel.f10202a;
        C0474a3 c0474a3 = new C0474a3(C0474a3.b(fromModel));
        fromModel.f10203b.getBytesTruncated();
        return Collections.singletonList(new Di(c0996u8, c0474a3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0647gl(Yi yi) {
        this.f11942a = yi;
    }

    public final C0621fl a(List<Di> list) {
        throw new UnsupportedOperationException();
    }
}
