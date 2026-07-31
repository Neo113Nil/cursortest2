package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.hm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2686hm implements InterfaceC2763km {

    /* renamed from: a, reason: collision with root package name */
    public volatile C2633fm f39159a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f39160b = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC2763km
    public final void a(@NotNull C2633fm c2633fm) {
        this.f39159a = c2633fm;
        Iterator it = this.f39160b.iterator();
        while (it.hasNext()) {
            ((InterfaceC2763km) it.next()).a(c2633fm);
        }
    }

    @NotNull
    public final C2633fm b() {
        C2633fm c2633fm = this.f39159a;
        if (c2633fm != null) {
            return c2633fm;
        }
        Intrinsics.throwUninitializedPropertyAccessException("startupState");
        return null;
    }

    public final void b(@NotNull InterfaceC2763km interfaceC2763km) {
        this.f39160b.remove(interfaceC2763km);
    }

    public final void a(@NotNull InterfaceC2763km interfaceC2763km) {
        this.f39160b.add(interfaceC2763km);
        if (this.f39159a != null) {
            C2633fm c2633fm = this.f39159a;
            if (c2633fm == null) {
                Intrinsics.throwUninitializedPropertyAccessException("startupState");
                c2633fm = null;
            }
            interfaceC2763km.a(c2633fm);
        }
    }

    public final void a(@NotNull Context context) {
        String optStringOrNull;
        ProtobufStateStorage<Object> a4 = Qm.a(C2737jm.class).a(context);
        C2998to a5 = Ia.j().B().a();
        synchronized (a5) {
            optStringOrNull = JsonUtils.optStringOrNull(a5.f39884a.a(), "device_id");
        }
        a(new C2633fm(optStringOrNull, a5.a(), (C2737jm) a4.read()));
    }
}
