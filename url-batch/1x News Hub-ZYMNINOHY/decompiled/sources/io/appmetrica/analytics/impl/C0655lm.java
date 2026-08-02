package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.lm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0655lm implements InterfaceC0733om {

    /* renamed from: a, reason: collision with root package name */
    public volatile C0603jm f7838a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f7839b = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC0733om
    public final void a(C0603jm c0603jm) {
        this.f7838a = c0603jm;
        Iterator it = this.f7839b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0733om) it.next()).a(c0603jm);
        }
    }

    public final C0603jm b() {
        C0603jm c0603jm = this.f7838a;
        if (c0603jm != null) {
            return c0603jm;
        }
        kotlin.jvm.internal.j.g("startupState");
        throw null;
    }

    public final void b(InterfaceC0733om interfaceC0733om) {
        this.f7839b.remove(interfaceC0733om);
    }

    public final void a(InterfaceC0733om interfaceC0733om) {
        this.f7839b.add(interfaceC0733om);
        if (this.f7838a != null) {
            C0603jm c0603jm = this.f7838a;
            if (c0603jm != null) {
                interfaceC0733om.a(c0603jm);
            } else {
                kotlin.jvm.internal.j.g("startupState");
                throw null;
            }
        }
    }

    public final void a(Context context) {
        String optStringOrNull;
        ProtobufStateStorage<Object> create = ((Vm) Tm.a(C0707nm.class)).create(context);
        yo a3 = C0876ua.k().D().a();
        synchronized (a3) {
            optStringOrNull = JsonUtils.optStringOrNull(a3.f8654a.a(), "device_id");
        }
        a(new C0603jm(optStringOrNull, a3.a(), (C0707nm) create.read()));
    }
}
