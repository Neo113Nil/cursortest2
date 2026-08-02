package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.qg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0901qg implements InterfaceC0745kg {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f12621a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12622b;

    /* renamed from: c, reason: collision with root package name */
    public C0823ng f12623c;

    public C0901qg() {
        this(C0817na.k().u());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0745kg
    public final synchronized void a(C0823ng c0823ng) {
        if (c0823ng != null) {
            try {
                LoggerStorage.getMainPublicOrAnonymousLogger().info("Received referrer from source %s: %s", c0823ng.f12467d.f12365a, c0823ng.f12464a);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f12623c = c0823ng;
        this.f12622b = true;
        Iterator it = this.f12621a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0616fg) it.next()).a(this.f12623c);
        }
        this.f12621a.clear();
    }

    public C0901qg(C0771lg c0771lg) {
        this.f12621a = new HashSet();
        c0771lg.a(new C1087xl(this));
        c0771lg.a();
    }

    public final synchronized void a(InterfaceC0616fg interfaceC0616fg) {
        this.f12621a.add(interfaceC0616fg);
        if (this.f12622b) {
            interfaceC0616fg.a(this.f12623c);
            this.f12621a.remove(interfaceC0616fg);
        }
    }
}
