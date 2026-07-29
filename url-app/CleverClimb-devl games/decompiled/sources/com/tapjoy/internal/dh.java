package com.tapjoy.internal;

import com.tapjoy.internal.de;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class dh implements co, de.a {

    /* renamed from: c, reason: collision with root package name */
    private static dh f7942c;

    /* renamed from: a, reason: collision with root package name */
    public float f7943a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public cp f7944b;

    /* renamed from: d, reason: collision with root package name */
    private final cq f7945d;
    private final cn e;
    private dd f;

    private dh(cq cqVar, cn cnVar) {
        this.f7945d = cqVar;
        this.e = cnVar;
    }

    public static dh a() {
        if (f7942c == null) {
            f7942c = new dh(new cq(), new cn());
        }
        return f7942c;
    }

    @Override // com.tapjoy.internal.de.a
    public final void a(boolean z) {
        if (z) {
            dw.a();
            dw.b();
        } else {
            dw.a();
            dw.c();
        }
    }

    @Override // com.tapjoy.internal.co
    public final void a(float f) {
        this.f7943a = f;
        if (this.f == null) {
            this.f = dd.a();
        }
        Iterator it = Collections.unmodifiableCollection(this.f.f7930b).iterator();
        while (it.hasNext()) {
            ((cz) it.next()).f7917c.a(f);
        }
    }
}
