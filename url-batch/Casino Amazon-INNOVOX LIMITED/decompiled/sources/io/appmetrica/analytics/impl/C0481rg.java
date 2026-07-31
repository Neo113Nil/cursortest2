package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.rg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0481rg implements InterfaceC0332lg {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f1469a;
    public boolean b;
    public C0407og c;

    public C0481rg() {
        this(C0401oa.k().u());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0332lg
    public final synchronized void a(C0407og c0407og) {
        if (c0407og != null) {
            LoggerStorage.getMainPublicOrAnonymousLogger().info("Received referrer from source %s: %s", c0407og.d.f1397a, c0407og.f1416a);
        }
        this.c = c0407og;
        this.b = true;
        Iterator it = this.f1469a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0203gg) it.next()).a(this.c);
        }
        this.f1469a.clear();
    }

    public C0481rg(C0357mg c0357mg) {
        this.f1469a = new HashSet();
        c0357mg.a(new C0661yl(this));
        c0357mg.a();
    }

    public final synchronized void a(InterfaceC0203gg interfaceC0203gg) {
        this.f1469a.add(interfaceC0203gg);
        if (this.b) {
            interfaceC0203gg.a(this.c);
            this.f1469a.remove(interfaceC0203gg);
        }
    }
}
