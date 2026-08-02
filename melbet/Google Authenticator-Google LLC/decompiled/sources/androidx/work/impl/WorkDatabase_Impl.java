package androidx.work.impl;

import defpackage.ajk;
import defpackage.akb;
import defpackage.aun;
import defpackage.auo;
import defpackage.aup;
import defpackage.auq;
import defpackage.aur;
import defpackage.aus;
import defpackage.aut;
import defpackage.auu;
import defpackage.auv;
import defpackage.auw;
import defpackage.aux;
import defpackage.awx;
import defpackage.axb;
import defpackage.axe;
import defpackage.axi;
import defpackage.axm;
import defpackage.axp;
import defpackage.axu;
import defpackage.ayf;
import defpackage.koi;
import defpackage.kop;
import defpackage.kpk;
import defpackage.ksj;
import defpackage.ksx;
import defpackage.nb;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private final koi k = new kop(new nb(this, 14));
    private final koi l = new kop(new nb(this, 15));
    private final koi m = new kop(new nb(this, 16));
    private final koi n = new kop(new nb(this, 17));
    private final koi o = new kop(new nb(this, 18));
    private final koi p = new kop(new nb(this, 19));
    private final koi q = new kop(new nb(this, 20));
    private final koi r = new kop(new aux(this, 1));

    @Override // androidx.work.impl.WorkDatabase
    public final axm A() {
        return (axm) this.o.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final axp B() {
        return (axp) this.p.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final axu C() {
        return (axu) this.k.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ayf D() {
        return (ayf) this.m.a();
    }

    @Override // defpackage.ajw
    public final ajk a() {
        return new ajk(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.ajw
    public final /* synthetic */ akb c() {
        return new auw(this);
    }

    @Override // defpackage.ajw
    public final List f(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new aun());
        arrayList.add(new auo());
        arrayList.add(new aup());
        arrayList.add(new auq());
        arrayList.add(new aur());
        arrayList.add(new aus());
        arrayList.add(new aut());
        arrayList.add(new auu());
        arrayList.add(new auv());
        return arrayList;
    }

    @Override // defpackage.ajw
    public final Map g() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = ksx.a;
        ksj ksjVar = new ksj(axu.class);
        kpk kpkVar = kpk.a;
        linkedHashMap.put(ksjVar, kpkVar);
        linkedHashMap.put(new ksj(awx.class), kpkVar);
        linkedHashMap.put(new ksj(ayf.class), kpkVar);
        linkedHashMap.put(new ksj(axi.class), kpkVar);
        linkedHashMap.put(new ksj(axm.class), kpkVar);
        linkedHashMap.put(new ksj(axp.class), kpkVar);
        linkedHashMap.put(new ksj(axb.class), kpkVar);
        linkedHashMap.put(new ksj(axe.class), kpkVar);
        return linkedHashMap;
    }

    @Override // defpackage.ajw
    public final Set i() {
        return new LinkedHashSet();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final awx w() {
        return (awx) this.l.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final axb x() {
        return (axb) this.q.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final axe y() {
        return (axe) this.r.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final axi z() {
        return (axi) this.n.a();
    }
}
