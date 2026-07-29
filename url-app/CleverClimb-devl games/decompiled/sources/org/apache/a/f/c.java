package org.apache.a.f;

import java.util.Locale;
import org.apache.a.ab;
import org.apache.a.ad;
import org.apache.a.h.h;
import org.apache.a.r;
import org.apache.a.s;

/* compiled from: DefaultHttpResponseFactory.java */
/* loaded from: classes2.dex */
public class c implements s {

    /* renamed from: a, reason: collision with root package name */
    protected final ab f9793a;

    public c(ab abVar) {
        if (abVar == null) {
            throw new IllegalArgumentException("Reason phrase catalog must not be null.");
        }
        this.f9793a = abVar;
    }

    public c() {
        this(d.f9857a);
    }

    @Override // org.apache.a.s
    public r a(ad adVar, org.apache.a.j.e eVar) {
        if (adVar == null) {
            throw new IllegalArgumentException("Status line may not be null");
        }
        return new h(adVar, this.f9793a, a(eVar));
    }

    protected Locale a(org.apache.a.j.e eVar) {
        return Locale.getDefault();
    }
}
