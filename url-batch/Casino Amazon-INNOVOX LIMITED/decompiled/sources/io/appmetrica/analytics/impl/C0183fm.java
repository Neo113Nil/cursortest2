package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.fm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0183fm {

    /* renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f1262a;
    public final xo b;

    public C0183fm(ProtobufStateStorage protobufStateStorage, xo xoVar) {
        this.f1262a = protobufStateStorage;
        this.b = xoVar;
    }

    public C0183fm(Context context) {
        this(((Sm) Qm.a(C0312km.class)).create(context), C0401oa.k().D().a());
    }
}
