package r4;

import android.os.Bundle;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p;
import androidx.lifecycle.p0;
import androidx.lifecycle.w;
import c6.k;
import java.util.Arrays;
import o4.o;
import q6.t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final o4.d f6563a;

    /* renamed from: b, reason: collision with root package name */
    public final o f6564b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f6565c;

    /* renamed from: d, reason: collision with root package name */
    public p f6566d;

    /* renamed from: e, reason: collision with root package name */
    public final o4.h f6567e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6568f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f6569g;

    /* renamed from: h, reason: collision with root package name */
    public final x4.e f6570h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final w f6571j;

    /* renamed from: k, reason: collision with root package name */
    public p f6572k;

    /* renamed from: l, reason: collision with root package name */
    public final p0 f6573l;

    /* renamed from: m, reason: collision with root package name */
    public final k f6574m;

    public c(o4.d dVar) {
        this.f6563a = dVar;
        this.f6564b = dVar.f5621e;
        this.f6565c = dVar.f5622f;
        this.f6566d = dVar.f5623g;
        this.f6567e = dVar.f5624h;
        this.f6568f = dVar.i;
        this.f6569g = dVar.f5625j;
        this.f6570h = new x4.e(new z4.a(dVar, new m0(18, dVar)), 1);
        k r7 = a.a.r(new c.e(21));
        this.f6571j = new w(dVar, true);
        this.f6572k = p.f848e;
        this.f6573l = (p0) r7.getValue();
        this.f6574m = a.a.r(new c.e(22));
    }

    public final Bundle a() {
        Bundle bundle = this.f6565c;
        if (bundle == null) {
            return null;
        }
        Bundle j7 = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
        j7.putAll(bundle);
        return j7;
    }

    public final void b() {
        if (!this.i) {
            x4.e eVar = this.f6570h;
            eVar.c();
            this.i = true;
            if (this.f6567e != null) {
                l0.c(this.f6563a);
            }
            eVar.d(this.f6569g);
        }
        int ordinal = this.f6566d.ordinal();
        int ordinal2 = this.f6572k.ordinal();
        w wVar = this.f6571j;
        if (ordinal < ordinal2) {
            wVar.g(this.f6566d);
        } else {
            wVar.g(this.f6572k);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(t.a(o4.d.class).b());
        sb.append("(" + this.f6568f + ')');
        sb.append(" destination=");
        sb.append(this.f6564b);
        String sb2 = sb.toString();
        q6.i.d(sb2, "toString(...)");
        return sb2;
    }
}
