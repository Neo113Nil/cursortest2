package com.iab.omid.library.startio.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes2.dex */
public class c {
    private static c c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f32a = new ArrayList();
    private final ArrayList b = new ArrayList();

    private c() {
    }

    public static c c() {
        return c;
    }

    public Collection a() {
        return Collections.unmodifiableCollection(this.b);
    }

    public void a(com.iab.omid.library.startio.adsession.a aVar) {
        this.f32a.add(aVar);
    }

    public Collection b() {
        return Collections.unmodifiableCollection(this.f32a);
    }

    public void b(com.iab.omid.library.startio.adsession.a aVar) {
        boolean d = d();
        this.f32a.remove(aVar);
        this.b.remove(aVar);
        if (!d || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.startio.adsession.a aVar) {
        boolean d = d();
        this.b.add(aVar);
        if (d) {
            return;
        }
        i.c().d();
    }

    public boolean d() {
        return this.b.size() > 0;
    }
}
