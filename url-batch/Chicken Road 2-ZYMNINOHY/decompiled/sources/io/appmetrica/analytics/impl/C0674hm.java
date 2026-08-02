package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.hm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0674hm implements InterfaceC0751km {

    /* renamed from: a, reason: collision with root package name */
    public volatile C0622fm f12004a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f12005b = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC0751km
    public final void a(C0622fm c0622fm) {
        this.f12004a = c0622fm;
        Iterator it = this.f12005b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0751km) it.next()).a(c0622fm);
        }
    }

    public final C0622fm b() {
        C0622fm c0622fm = this.f12004a;
        if (c0622fm != null) {
            return c0622fm;
        }
        kotlin.jvm.internal.i.i("startupState");
        throw null;
    }

    public final void b(InterfaceC0751km interfaceC0751km) {
        this.f12005b.remove(interfaceC0751km);
    }

    public final void a(InterfaceC0751km interfaceC0751km) {
        this.f12005b.add(interfaceC0751km);
        if (this.f12004a != null) {
            C0622fm c0622fm = this.f12004a;
            if (c0622fm != null) {
                interfaceC0751km.a(c0622fm);
            } else {
                kotlin.jvm.internal.i.i("startupState");
                throw null;
            }
        }
    }

    public final void a(Context context) {
        String optStringOrNull;
        ProtobufStateStorage<Object> create = ((Rm) Pm.a(C0725jm.class)).create(context);
        C1064wo a3 = C0817na.k().D().a();
        synchronized (a3) {
            optStringOrNull = JsonUtils.optStringOrNull(a3.f12987a.a(), "device_id");
        }
        a(new C0622fm(optStringOrNull, a3.a(), (C0725jm) create.read()));
    }
}
