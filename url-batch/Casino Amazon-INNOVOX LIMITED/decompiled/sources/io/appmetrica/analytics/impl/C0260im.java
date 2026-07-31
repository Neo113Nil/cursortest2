package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.im, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0260im implements InterfaceC0338lm {

    /* renamed from: a, reason: collision with root package name */
    public volatile C0209gm f1311a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC0338lm
    public final void a(C0209gm c0209gm) {
        this.f1311a = c0209gm;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0338lm) it.next()).a(c0209gm);
        }
    }

    public final C0209gm b() {
        C0209gm c0209gm = this.f1311a;
        if (c0209gm != null) {
            return c0209gm;
        }
        Intrinsics.throwUninitializedPropertyAccessException("startupState");
        return null;
    }

    public final void b(InterfaceC0338lm interfaceC0338lm) {
        this.b.remove(interfaceC0338lm);
    }

    public final void a(InterfaceC0338lm interfaceC0338lm) {
        this.b.add(interfaceC0338lm);
        if (this.f1311a != null) {
            C0209gm c0209gm = this.f1311a;
            if (c0209gm == null) {
                Intrinsics.throwUninitializedPropertyAccessException("startupState");
                c0209gm = null;
            }
            interfaceC0338lm.a(c0209gm);
        }
    }

    public final void a(Context context) {
        String optStringOrNull;
        ProtobufStateStorage<Object> create = ((Sm) Qm.a(C0312km.class)).create(context);
        xo a2 = C0401oa.k().D().a();
        synchronized (a2) {
            optStringOrNull = JsonUtils.optStringOrNull(a2.f1572a.a(), "device_id");
        }
        a(new C0209gm(optStringOrNull, a2.a(), (C0312km) create.read()));
    }
}
