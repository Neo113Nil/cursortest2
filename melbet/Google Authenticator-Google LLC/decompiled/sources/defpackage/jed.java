package defpackage;

import android.app.Service;
import android.content.Context;
import j$.util.DesugarCollections;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jed {
    public final Object a;
    public Object b;

    public jed(iyh iyhVar) {
        this.b = new jdc();
        this.a = iyhVar;
        jeh.a();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final ibf a() {
        ?? r1 = this.b;
        return new ibf((String) this.a, r1 == 0 ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(new HashMap((Map) r1)));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void b(Annotation annotation) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        this.b.put(ibu.class, annotation);
    }

    public final guc c() {
        return gta.u() ? guc.d(hoq.aH((Context) this.a)) : gub.a;
    }

    public final String d(String str) {
        return str + " " + this.a.getClass().getSimpleName();
    }

    public jed(String str) {
        this.b = null;
        this.a = str;
    }

    public jed(Service service) {
        this.a = service;
    }
}
