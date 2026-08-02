package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.vg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0908vg implements InterfaceC0753pg {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f8522a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8523b;

    /* renamed from: c, reason: collision with root package name */
    public C0830sg f8524c;

    public C0908vg() {
        this(C0876ua.k().u());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0753pg
    public final synchronized void a(C0830sg c0830sg) {
        if (c0830sg != null) {
            try {
                LoggerStorage.getMainPublicOrAnonymousLogger().info("Received referrer from source %s: %s", c0830sg.f8318d.f8242a, c0830sg.f8315a);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f8524c = c0830sg;
        this.f8523b = true;
        Iterator it = this.f8522a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0623kg) it.next()).a(this.f8524c);
        }
        this.f8522a.clear();
    }

    public C0908vg(C0779qg c0779qg) {
        this.f8522a = new HashSet();
        c0779qg.a(new Bl(this));
        c0779qg.a();
    }

    public final synchronized void a(InterfaceC0623kg interfaceC0623kg) {
        this.f8522a.add(interfaceC0623kg);
        if (this.f8523b) {
            interfaceC0623kg.a(this.f8524c);
            this.f8522a.remove(interfaceC0623kg);
        }
    }
}
