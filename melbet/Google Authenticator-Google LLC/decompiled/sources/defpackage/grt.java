package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class grt implements gzf {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ grt(fye fyeVar, fyg fygVar, frv frvVar, int i) {
        this.d = i;
        this.c = fyeVar;
        this.a = fygVar;
        this.b = frvVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r5v4, types: [j$.time.temporal.Temporal, java.lang.Object] */
    @Override // defpackage.gzf
    public final Object a(Object obj) {
        if (this.d != 0) {
            fuf fufVar = (fuf) obj;
            hoq.H(fufVar.c == 2);
            boolean equals = fufVar.b.k.equals("incognito");
            Object obj2 = this.a;
            if (equals) {
                return obj2;
            }
            Object obj3 = this.b;
            Object obj4 = this.c;
            jkj C = ((jkp) obj2).C();
            C.C(((fye) obj4).a, ((frv) obj3).a);
            return (fyg) C.q();
        }
        if (!((Boolean) obj).booleanValue()) {
            return null;
        }
        Object obj5 = this.c;
        Object obj6 = this.b;
        ldt ldtVar = (ldt) this.a;
        ?? r4 = ldtVar.c;
        goh gohVar = (goh) r4.b();
        ikj ikjVar = (ikj) ldtVar.b;
        Object obj7 = ikjVar.b;
        Object obj8 = ikjVar.a;
        gpt gptVar = (gpt) obj6;
        gohVar.b((String) obj7, (String) obj8, gptVar.b(), "attempt");
        ikj ikjVar2 = (ikj) obj5;
        gzp gzpVar = (gzp) ikjVar2.a;
        if (!gzpVar.f()) {
            return null;
        }
        ((fdx) ((goh) r4.b()).b.bB()).b(hsj.a(Duration.between(gzpVar.b(), Instant.now())), obj7, obj8, gptVar.b());
        ((fdx) ((goh) r4.b()).c.bB()).b(hsj.a((Duration) ikjVar2.b), obj7, obj8, gptVar.b());
        return null;
    }

    public /* synthetic */ grt(ldt ldtVar, gpt gptVar, ikj ikjVar, int i) {
        this.d = i;
        this.a = ldtVar;
        this.b = gptVar;
        this.c = ikjVar;
    }
}
