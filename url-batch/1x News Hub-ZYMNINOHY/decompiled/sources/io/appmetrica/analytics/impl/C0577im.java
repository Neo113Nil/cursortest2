package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.im, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0577im {

    /* renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f7572a;

    /* renamed from: b, reason: collision with root package name */
    public final yo f7573b;

    public C0577im(ProtobufStateStorage protobufStateStorage, yo yoVar) {
        this.f7572a = protobufStateStorage;
        this.f7573b = yoVar;
    }

    public C0577im(Context context) {
        this(((Vm) Tm.a(C0707nm.class)).create(context), C0876ua.k().D().a());
    }
}
