package com.anythink.expressad.advanced.d;

import android.text.TextUtils;
import com.anythink.expressad.foundation.d.h;
import com.anythink.expressad.out.p;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements com.anythink.expressad.advanced.b.a {

    /* renamed from: a, reason: collision with root package name */
    private p f17982a;

    /* renamed from: b, reason: collision with root package name */
    private c f17983b;

    public b(c cVar) {
        this.f17983b = cVar;
    }

    private static void a() {
    }

    private void b() {
        if (this.f17982a != null) {
            this.f17982a = null;
        }
        if (this.f17983b != null) {
            this.f17983b = null;
        }
    }

    public final void a(p pVar) {
        this.f17982a = pVar;
    }

    @Override // com.anythink.expressad.advanced.b.a
    public final void a(com.anythink.expressad.foundation.d.d dVar, int i) {
        c cVar;
        c cVar2 = this.f17983b;
        if (cVar2 == null || !cVar2.a() || dVar == null) {
            return;
        }
        p pVar = this.f17982a;
        if (pVar != null && this.f17983b != null) {
            pVar.a();
        }
        this.f17983b.b();
        new ArrayList().add(dVar);
        if (i != 2 || (cVar = this.f17983b) == null) {
            return;
        }
        cVar.a(dVar, true);
    }

    private void a(h hVar) {
        c cVar = this.f17983b;
        if (cVar == null || !cVar.a()) {
            return;
        }
        p pVar = this.f17982a;
        if (pVar != null) {
            pVar.a(hVar != null ? hVar.a() : "");
        }
        this.f17983b.b();
    }

    @Override // com.anythink.expressad.advanced.b.a
    public final void a(com.anythink.expressad.foundation.e.c cVar) {
        c cVar2 = this.f17983b;
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
        p pVar = this.f17982a;
        if (pVar != null) {
            pVar.a(str);
        }
        this.f17983b.b();
    }
}
