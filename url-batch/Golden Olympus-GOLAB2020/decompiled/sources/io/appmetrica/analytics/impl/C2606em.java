package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.em, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2606em {

    /* renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f38935a;

    /* renamed from: b, reason: collision with root package name */
    public final C2998to f38936b;

    public C2606em(ProtobufStateStorage protobufStateStorage, C2998to c2998to) {
        this.f38935a = protobufStateStorage;
        this.f38936b = c2998to;
    }

    public C2606em(Context context) {
        this(Qm.a(C2737jm.class).a(context), Ia.j().B().a());
    }
}
