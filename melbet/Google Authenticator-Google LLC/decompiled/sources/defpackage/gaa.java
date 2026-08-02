package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import j$.util.Optional;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gaa implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final /* synthetic */ int d;

    public gaa(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, int i) {
        this.d = i;
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
    }

    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, koe] */
    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        byte[] bArr = null;
        int i = 0;
        switch (this.d) {
            case 0:
                return fzy.b((gzp) ((jrx) this.a).a, (gzp) ((jrx) this.b).a, this.c);
            case 1:
                jsb jsbVar = this.c;
                return ((gpn) this.b).b().b(((fyb) this.a).b(), (iyi) jsbVar.b());
            case 2:
                return fzy.b((gzp) ((jrx) this.a).a, (gzp) ((jrx) this.b).a, this.c);
            case 3:
                return new gbn((afr) ((jrx) this.b).a, ((jrk) this.a).b(), (Executor) this.c.b());
            case 4:
                gzp gzpVar = (gzp) ((jrx) this.a).a;
                gce gceVar = (gzpVar.f() && ((gbu) gzpVar.b()).j()) ? (gce) this.b.b() : (gce) this.c.b();
                gceVar.getClass();
                return gceVar;
            case 5:
                return new ger((dih) this.a.b(), (iwq) this.b.b(), (Executor) this.c.b());
            case 6:
                return new gfw((bd) ((jrx) this.a).a, (iwq) this.b.b(), (Executor) this.c.b());
            case 7:
                return new iyi(jrv.a(this.a), ((ghs) this.c).b(), ((jrk) this.b).b());
            case 8:
                final fym fymVar = (fym) this.c.b();
                Object obj = ((jrx) this.b).a;
                final fwm b = ((ewo) this.a).b();
                final Optional optional = (Optional) obj;
                fymVar.getClass();
                optional.getClass();
                return new gjj() { // from class: gii
                    @Override // defpackage.gjj
                    public final hvi a() {
                        if (!hnu.bu(fwm.this, optional)) {
                            return hve.a;
                        }
                        hvi f = fymVar.f(true);
                        gaj.d(178, f, "Failed to obtain initial snapshot", new Object[0]);
                        return f;
                    }
                };
            case 9:
                return new gkj((glu) this.b.b(), (jpu) ((jrx) this.c).a, ((glb) this.a).b());
            case 10:
                jsb jsbVar2 = this.b;
                jsb jsbVar3 = this.a;
                cka b2 = ((gnl) this.c).b();
                Activity a = ((jrh) jsbVar3).a();
                gnj gnjVar = (gnj) jsbVar2.b();
                if (!(a instanceof bg)) {
                    throw new IllegalStateException("must use FragmentActivity");
                }
                bg bgVar = (bg) a;
                return new gnh(new gnk(b2, new eqn(bgVar, 6), i, bArr), new gng(bgVar, gnjVar, 1));
            case 11:
                jsb jsbVar4 = this.b;
                Object obj2 = ((jrx) this.a).a;
                cka b3 = ((gnl) this.c).b();
                bd bdVar = (bd) obj2;
                gnj gnjVar2 = (gnj) jsbVar4.b();
                bdVar.Q().getClass();
                return new gnh(new gnk(b3, new eqn(bdVar, 7), i, bArr), new gng(bdVar, gnjVar2, 0));
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                jsb jsbVar5 = this.a;
                final Context b4 = ((jrk) this.b).b();
                final long longValue = ((gnn) jsbVar5).a().longValue();
                final jsb jsbVar6 = this.c;
                return new ewq() { // from class: goa
                    @Override // defpackage.ewq
                    public final void a() {
                        if (eos.H()) {
                            long j = longValue;
                            eql eqlVar = eql.a;
                            if (j <= SystemClock.elapsedRealtime()) {
                                eqlVar.b = new ems(j, j);
                                if (fao.g() && eqlVar.c == null) {
                                    Context context = b4;
                                    eqlVar.c = ems.a();
                                    fao.e(new ect(eqlVar, 10));
                                    Application application = (Application) context;
                                    application.registerActivityLifecycleCallbacks(new eqk(eqlVar, application));
                                }
                            }
                            ein einVar = ((eim) jsbVar6.b()).a;
                            einVar.b();
                            einVar.d();
                        }
                    }
                };
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                gvn gvnVar = (gvn) this.c.b();
                brn b5 = ((gvb) this.a).b();
                Set<guc> set = (Set) this.b.b();
                new HashSet();
                HashSet hashSet = new HashSet();
                new HashMap();
                new HashMap();
                gvnVar.getClass();
                ?? r1 = b5.a;
                for (guc gucVar : set) {
                    gucVar.getClass();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(ixd.m(hashSet.size() + 1));
                    linkedHashSet.addAll(hashSet);
                    linkedHashSet.add(gucVar);
                    hashSet = linkedHashSet;
                }
                return new gva(gvnVar, (koe) r1, hashSet, 2);
            default:
                gzp a2 = ((bnu) this.c).a();
                gzp a3 = ((bnu) this.b).a();
                gzp gzpVar2 = (gzp) ((jrx) this.a).a;
                gzpVar2.getClass();
                return Boolean.valueOf(((epz) ((gzs) a2).a).b() && (gzpVar2.f() ? (Boolean) gzpVar2.b() : (Boolean) a3.d(false)).booleanValue());
        }
    }

    public gaa(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, int i, short[] sArr) {
        this.d = i;
        this.b = jsbVar;
        this.a = jsbVar2;
        this.c = jsbVar3;
    }

    public gaa(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, int i, byte[][] bArr) {
        this.d = i;
        this.a = jsbVar;
        this.c = jsbVar2;
        this.b = jsbVar3;
    }

    public gaa(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, int i, char[][] cArr) {
        this.d = i;
        this.c = jsbVar;
        this.a = jsbVar2;
        this.b = jsbVar3;
    }

    public gaa(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, int i, short[][] sArr) {
        this.d = i;
        this.b = jsbVar;
        this.c = jsbVar2;
        this.a = jsbVar3;
    }

    public gaa(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, int i, char[][][] cArr) {
        this.d = i;
        this.c = jsbVar;
        this.b = jsbVar2;
        this.a = jsbVar3;
    }
}
