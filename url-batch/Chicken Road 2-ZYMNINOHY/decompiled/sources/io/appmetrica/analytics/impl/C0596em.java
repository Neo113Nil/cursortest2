package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.em, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0596em {

    /* renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f11811a;

    /* renamed from: b, reason: collision with root package name */
    public final C1064wo f11812b;

    public C0596em(ProtobufStateStorage protobufStateStorage, C1064wo c1064wo) {
        this.f11811a = protobufStateStorage;
        this.f11812b = c1064wo;
    }

    public C0596em(Context context) {
        this(((Rm) Pm.a(C0725jm.class)).create(context), C0817na.k().D().a());
    }
}
