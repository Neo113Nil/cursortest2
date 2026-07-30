package com.anythink.core.common.w.a.a;

import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.j;
import com.anythink.core.common.h.ai;
import com.anythink.core.common.h.ak;
import com.anythink.core.common.h.al;
import com.anythink.core.common.h.am;
import com.anythink.core.common.h.n;
import com.anythink.core.common.w.a.a;
import java.util.Map;

/* loaded from: classes.dex */
public class b implements com.anythink.core.common.w.a.b.d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17144a = "b";

    /* renamed from: b, reason: collision with root package name */
    private final String f17145b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.w.a.b.c f17146c;

    /* renamed from: d, reason: collision with root package name */
    private final c f17147d = new c();

    /* renamed from: e, reason: collision with root package name */
    private j f17148e;

    /* renamed from: com.anythink.core.common.w.a.a.b$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f17151a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f17152b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f17153c;

        public AnonymousClass2(n nVar, boolean z8, String str) {
            this.f17151a = nVar;
            this.f17152b = z8;
            this.f17153c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f17151a.ac(this.f17152b ? 1 : 2);
            this.f17151a.A(this.f17153c);
            com.anythink.core.common.u.c.a(t.b().g()).a(3, this.f17151a);
        }
    }

    public b(String str, com.anythink.core.common.w.a.b.c cVar) {
        this.f17145b = str;
        this.f17146c = cVar;
        try {
            this.f17148e = j.a(t.b().g());
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.common.w.a.b.d
    public final void b(String str) {
        j jVar = this.f17148e;
        if (jVar != null) {
            jVar.b(str);
        }
    }

    @Override // com.anythink.core.common.w.a.b.d
    public final am a(String str) {
        j jVar = this.f17148e;
        if (jVar != null) {
            return jVar.a(str);
        }
        return null;
    }

    @Override // com.anythink.core.common.w.a.b.d
    public final void a(final al alVar) {
        c cVar;
        n i;
        String str;
        com.anythink.core.common.w.a.b.c cVar2 = this.f17146c;
        ai a9 = cVar2 != null ? cVar2.a() : null;
        if (a9 == null || a9.a() || alVar == null || !alVar.b().equals(this.f17145b)) {
            return;
        }
        if (alVar.d() == a.b.f17143c && (i = alVar.i()) != null) {
            if (a9.e() != null) {
                str = com.anythink.core.common.w.a.d.a.a(alVar.e(), a9.e().get(Integer.valueOf(alVar.c())));
            } else {
                str = "";
            }
            boolean j9 = alVar.j();
            if (!TextUtils.isEmpty(str)) {
                com.anythink.core.common.v.b.b.a().a(new AnonymousClass2(i, j9, str));
            }
        }
        Map<Integer, ak> e6 = a9.e();
        ak akVar = e6 != null ? e6.get(Integer.valueOf(alVar.c())) : null;
        if (akVar == null) {
            alVar.a();
            alVar.c();
            return;
        }
        alVar.a(akVar.b());
        if (a9.b() && (cVar = this.f17147d) != null) {
            cVar.a(alVar, akVar, a9);
        }
        com.anythink.core.common.v.b.b.a().c(new Runnable() { // from class: com.anythink.core.common.w.a.a.b.1
            @Override // java.lang.Runnable
            public final void run() {
                if (b.this.f17148e != null) {
                    b.this.f17148e.a(alVar);
                }
            }
        }, 13);
    }

    @Override // com.anythink.core.common.w.a.b.b
    public final void b() {
        c cVar = this.f17147d;
        if (cVar != null) {
            cVar.a();
        }
    }

    private void a(al alVar, ai aiVar) {
        n i;
        String str;
        if (alVar == null || alVar.d() != a.b.f17143c || (i = alVar.i()) == null) {
            return;
        }
        if (aiVar != null && aiVar.e() != null) {
            str = com.anythink.core.common.w.a.d.a.a(alVar.e(), aiVar.e().get(Integer.valueOf(alVar.c())));
        } else {
            str = "";
        }
        boolean j9 = alVar.j();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.anythink.core.common.v.b.b.a().a(new AnonymousClass2(i, j9, str));
    }
}
