package q4;

import android.os.Bundle;
import androidx.lifecycle.o0;
import androidx.lifecycle.p;
import androidx.lifecycle.r0;
import androidx.lifecycle.w;
import hd.q;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.collections.k0;
import n0.u;
import n4.l;
import n4.s;
import wd.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final n4.h f7970a;

    /* renamed from: b, reason: collision with root package name */
    public final s f7971b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f7972c;

    /* renamed from: d, reason: collision with root package name */
    public p f7973d;

    /* renamed from: e, reason: collision with root package name */
    public final l f7974e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7975f;
    public final Bundle g;

    /* renamed from: h, reason: collision with root package name */
    public final c6.s f7976h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7977i;
    public final w j;

    /* renamed from: k, reason: collision with root package name */
    public p f7978k;

    /* renamed from: l, reason: collision with root package name */
    public final r0 f7979l;

    /* renamed from: m, reason: collision with root package name */
    public final q f7980m;

    public c(n4.h hVar) {
        this.f7970a = hVar;
        this.f7971b = hVar.f7063e;
        this.f7972c = hVar.f7064i;
        this.f7973d = hVar.f7065r;
        this.f7974e = hVar.f7066s;
        this.f7975f = hVar.f7067t;
        this.g = hVar.f7068u;
        this.f7976h = new c6.s(new h5.b(hVar, new a1.b(10, hVar)));
        q b10 = hd.h.b(new u(2));
        this.j = new w(hVar, true);
        this.f7978k = p.f708e;
        this.f7979l = (r0) b10.getValue();
        this.f7980m = hd.h.b(new u(3));
    }

    public final Bundle a() {
        Bundle bundle = this.f7972c;
        if (bundle == null) {
            return null;
        }
        k0.f5575d.getClass();
        Bundle h10 = z4.w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
        h10.putAll(bundle);
        return h10;
    }

    public final void b() {
        if (!this.f7977i) {
            c6.s sVar = this.f7976h;
            sVar.f();
            this.f7977i = true;
            if (this.f7974e != null) {
                o0.c(this.f7970a);
            }
            sVar.g(this.g);
        }
        int ordinal = this.f7973d.ordinal();
        int ordinal2 = this.f7978k.ordinal();
        w wVar = this.j;
        if (ordinal < ordinal2) {
            p pVar = this.f7973d;
            wVar.getClass();
            pVar.getClass();
            wVar.c("setCurrentState");
            wVar.e(pVar);
            return;
        }
        p pVar2 = this.f7978k;
        wVar.getClass();
        pVar2.getClass();
        wVar.c("setCurrentState");
        wVar.e(pVar2);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c0.a(n4.h.class).c());
        sb2.append("(" + this.f7975f + ')');
        sb2.append(" destination=");
        sb2.append(this.f7971b);
        return sb2.toString();
    }
}
