package com.anythink.expressad.splash.d;

import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements com.anythink.expressad.splash.b.c {

    /* renamed from: a, reason: collision with root package name */
    private com.anythink.expressad.out.d f20770a;

    /* renamed from: b, reason: collision with root package name */
    private c f20771b;

    /* renamed from: c, reason: collision with root package name */
    private String f20772c;

    /* renamed from: d, reason: collision with root package name */
    private String f20773d;

    public b(c cVar) {
        this.f20771b = cVar;
    }

    public final void a(com.anythink.expressad.out.d dVar) {
        this.f20770a = dVar;
    }

    public final void a(String str) {
        this.f20773d = str;
    }

    @Override // com.anythink.expressad.splash.b.c
    public final void a(com.anythink.expressad.foundation.d.d dVar, int i) {
        c cVar;
        c cVar2 = this.f20771b;
        if (cVar2 == null || !cVar2.a() || dVar == null) {
            return;
        }
        com.anythink.expressad.out.d dVar2 = this.f20770a;
        if (dVar2 != null) {
            dVar2.a();
            dVar.u();
        }
        this.f20771b.b();
        new ArrayList().add(dVar);
        if (i != 2 || (cVar = this.f20771b) == null) {
            return;
        }
        cVar.a(dVar, true);
    }

    @Override // com.anythink.expressad.splash.b.c
    public final void a(com.anythink.expressad.foundation.e.c cVar) {
        c cVar2 = this.f20771b;
        if (cVar2 == null || !cVar2.a()) {
            return;
        }
        String str = "";
        if (cVar != null) {
            String a9 = cVar.a();
            if (!TextUtils.isEmpty(a9)) {
                str = a9;
            }
        }
        com.anythink.expressad.out.d dVar = this.f20770a;
        if (dVar != null) {
            dVar.a(str);
        }
        this.f20771b.b();
    }

    private void a() {
        if (this.f20770a != null) {
            this.f20770a = null;
        }
    }
}
