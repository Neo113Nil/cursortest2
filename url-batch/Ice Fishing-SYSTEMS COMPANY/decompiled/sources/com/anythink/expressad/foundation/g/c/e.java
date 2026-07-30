package com.anythink.expressad.foundation.g.c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private a f19338a;

    /* renamed from: b, reason: collision with root package name */
    private String f19339b;

    /* renamed from: c, reason: collision with root package name */
    private e f19340c;

    /* renamed from: d, reason: collision with root package name */
    private List<e> f19341d;

    public final a a() {
        return this.f19338a;
    }

    public final String b() {
        return this.f19339b;
    }

    public final e c() {
        return this.f19340c;
    }

    public final List<e> d() {
        return this.f19341d;
    }

    private void b(e eVar) {
        if (this.f19341d == null) {
            this.f19341d = new ArrayList();
        }
        eVar.f19340c = this;
        this.f19341d.add(eVar);
    }

    public final void a(a aVar) {
        this.f19338a = aVar;
    }

    public final void a(String str) {
        this.f19339b = str;
    }

    private void a(e eVar) {
        this.f19340c = eVar;
    }

    public final void a(a aVar, String str) {
        e eVar = new e();
        eVar.f19338a = aVar;
        eVar.f19339b = str;
        b(eVar);
    }

    public final void a(List<e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<e> it = list.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }
}
