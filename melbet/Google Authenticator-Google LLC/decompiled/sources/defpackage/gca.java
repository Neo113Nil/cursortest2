package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gca {
    public final Class a;
    public final ary b;
    public final gzp c;
    public final gby d;
    public final gzp e;
    public final asa f;
    public final gzp g;
    public final gzp h;
    public final hfm i;
    public final gzp j;
    public final gzp k;
    public final gzp l;

    public gca(Class cls, ary aryVar, gzp gzpVar, gby gbyVar, gzp gzpVar2, asa asaVar, gzp gzpVar3, gzp gzpVar4, hfm hfmVar, gzp gzpVar5, gzp gzpVar6, gzp gzpVar7) {
        this.a = cls;
        this.b = aryVar;
        this.c = gzpVar;
        this.d = gbyVar;
        this.e = gzpVar2;
        this.f = asaVar;
        this.g = gzpVar3;
        this.h = gzpVar4;
        this.i = hfmVar;
        this.j = gzpVar5;
        this.k = gzpVar6;
        this.l = gzpVar7;
    }

    public static gbw a(Class cls) {
        gbw gbwVar = new gbw();
        gbwVar.a = cls;
        gbwVar.c(ary.a);
        gbwVar.d = new gby(0L, TimeUnit.SECONDS);
        gbwVar.d(hjb.a);
        gbwVar.f = new brn((char[]) null, (char[]) null).x();
        return gbwVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gca) {
            gca gcaVar = (gca) obj;
            if (this.a.equals(gcaVar.a) && this.b.equals(gcaVar.b) && this.c.equals(gcaVar.c) && this.d.equals(gcaVar.d) && this.e.equals(gcaVar.e) && this.f.equals(gcaVar.f) && this.g.equals(gcaVar.g) && this.h.equals(gcaVar.h) && this.i.equals(gcaVar.i) && this.j.equals(gcaVar.j) && this.k.equals(gcaVar.k) && this.l.equals(gcaVar.l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
        return this.l.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        gzp gzpVar = this.l;
        gzp gzpVar2 = this.k;
        gzp gzpVar3 = this.j;
        hfm hfmVar = this.i;
        gzp gzpVar4 = this.h;
        gzp gzpVar5 = this.g;
        asa asaVar = this.f;
        gzp gzpVar6 = this.e;
        gby gbyVar = this.d;
        gzp gzpVar7 = this.c;
        ary aryVar = this.b;
        return "TikTokWorkSpec{workerClass=" + String.valueOf(this.a) + ", constraints=" + String.valueOf(aryVar) + ", expedited=" + String.valueOf(gzpVar7) + ", initialDelay=" + String.valueOf(gbyVar) + ", nextScheduleTimeOverride=" + String.valueOf(gzpVar6) + ", inputData=" + String.valueOf(asaVar) + ", periodic=" + String.valueOf(gzpVar5) + ", unique=" + String.valueOf(gzpVar4) + ", tags=" + String.valueOf(hfmVar) + ", backoffPolicy=" + String.valueOf(gzpVar3) + ", backoffDelayDuration=" + String.valueOf(gzpVar2) + ", targetProcess=" + String.valueOf(gzpVar) + "}";
    }

    public gca() {
        throw null;
    }
}
