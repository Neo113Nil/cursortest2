package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.lm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0806lm implements InterfaceC0884om {

    /* renamed from: a, reason: collision with root package name */
    public volatile C0754jm f8747a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f8748b = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC0884om
    public final void a(C0754jm c0754jm) {
        this.f8747a = c0754jm;
        Iterator it = this.f8748b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0884om) it.next()).a(c0754jm);
        }
    }

    public final C0754jm b() {
        C0754jm c0754jm = this.f8747a;
        if (c0754jm != null) {
            return c0754jm;
        }
        kotlin.jvm.internal.i.l("startupState");
        throw null;
    }

    public final void b(InterfaceC0884om interfaceC0884om) {
        this.f8748b.remove(interfaceC0884om);
    }

    public final void a(InterfaceC0884om interfaceC0884om) {
        this.f8748b.add(interfaceC0884om);
        if (this.f8747a != null) {
            C0754jm c0754jm = this.f8747a;
            if (c0754jm != null) {
                interfaceC0884om.a(c0754jm);
            } else {
                kotlin.jvm.internal.i.l("startupState");
                throw null;
            }
        }
    }

    public final void a(Context context) {
        String optStringOrNull;
        ProtobufStateStorage<Object> create = ((Vm) Tm.a(C0858nm.class)).create(context);
        yo a6 = C1027ua.k().D().a();
        synchronized (a6) {
            optStringOrNull = JsonUtils.optStringOrNull(a6.f9611a.a(), "device_id");
        }
        a(new C0754jm(optStringOrNull, a6.a(), (C0858nm) create.read()));
    }
}
