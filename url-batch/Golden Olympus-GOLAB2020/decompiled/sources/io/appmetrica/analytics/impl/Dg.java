package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class Dg implements InterfaceC3094xg {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f37368a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f37369b;

    /* renamed from: c, reason: collision with root package name */
    public Ag f37370c;

    public Dg() {
        this(Ia.j().t());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3094xg
    public final synchronized void a(Ag ag) {
        if (ag != null) {
            try {
                LoggerStorage.getMainPublicOrAnonymousLogger().info("Received referrer from source %s: %s", ag.f37186d.f40388a, ag.f37183a);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f37370c = ag;
        this.f37369b = true;
        Iterator it = this.f37368a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2964sg) it.next()).a(this.f37370c);
        }
        this.f37368a.clear();
    }

    public Dg(C3120yg c3120yg) {
        this.f37368a = new HashSet();
        c3120yg.a(new C3099xl(this));
        c3120yg.a();
    }

    public final synchronized void a(@NonNull InterfaceC2964sg interfaceC2964sg) {
        this.f37368a.add(interfaceC2964sg);
        if (this.f37369b) {
            interfaceC2964sg.a(this.f37370c);
            this.f37368a.remove(interfaceC2964sg);
        }
    }
}
