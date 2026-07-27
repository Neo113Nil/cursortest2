package l2;

import b2.C0517a;
import f1.C0607a;
import g2.w;
import j2.AbstractC0720j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l.AbstractC0784j;
import m2.InterfaceC0861c;
import o2.C0924c;
import o2.l;
import o2.m;
import o2.q;
import o2.s;
import y.t;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final i f7986a;

    /* renamed from: b, reason: collision with root package name */
    public final k f7987b;

    /* renamed from: c, reason: collision with root package name */
    public g f7988c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7989d;

    /* renamed from: e, reason: collision with root package name */
    public final t f7990e;

    public j(i iVar, g gVar) {
        InterfaceC0861c bVar;
        this.f7986a = iVar;
        h hVar = iVar.f7985b;
        C0607a c0607a = new C0607a(12, hVar.f7983e);
        if (hVar.d()) {
            bVar = new C0607a(12, hVar.f7983e);
        } else {
            bVar = new Y0.b(hVar);
        }
        this.f7987b = new k(bVar);
        C0821a c0821a = (C0821a) gVar.f7977c;
        m mVar = new m(o2.k.f8939k, iVar.f7985b.f7983e);
        m mVar2 = c0821a.f7962a;
        c0607a.m(mVar, mVar2, null);
        C0821a c0821a2 = (C0821a) gVar.f7976b;
        m m4 = bVar.m(mVar, c0821a2.f7962a, null);
        this.f7988c = new g(new C0821a(m4, c0821a2.f7963b, bVar.p()), 1, new C0821a(mVar2, c0821a.f7963b, false));
        this.f7989d = new ArrayList();
        this.f7990e = new t(iVar);
    }

    public final ArrayList a(ArrayList arrayList, m mVar, w wVar) {
        List asList = wVar == null ? this.f7989d : Arrays.asList(wVar);
        t tVar = this.f7990e;
        tVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0823c c0823c = (C0823c) it.next();
            if (AbstractC0784j.b(c0823c.f7968a, 4)) {
                s sVar = c0823c.f7970c.f8941d;
                m mVar2 = c0823c.f7969b;
                s sVar2 = mVar2.f8941d;
                l lVar = (l) tVar.f11495i;
                C0924c c0924c = C0924c.f8917e;
                if (lVar.compare(new q(c0924c, sVar), new q(c0924c, sVar2)) != 0) {
                    arrayList3.add(new C0823c(3, mVar2, c0823c.f7971d, null));
                }
            }
        }
        List list = asList;
        tVar.n(arrayList2, 1, arrayList, list, mVar);
        tVar.n(arrayList2, 2, arrayList, list, mVar);
        tVar.n(arrayList2, 3, arrayList3, list, mVar);
        tVar.n(arrayList2, 4, arrayList, list, mVar);
        tVar.n(arrayList2, 5, arrayList, list, mVar);
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public final List b(w wVar, C0517a c0517a) {
        ?? emptyList;
        ArrayList arrayList = this.f7989d;
        int i2 = 0;
        if (c0517a != null) {
            emptyList = new ArrayList();
            AbstractC0720j.b("A cancel should cancel all event registrations", wVar == null);
            g2.e eVar = this.f7986a.f7984a;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                emptyList.add(new C0822b((w) it.next(), c0517a, eVar));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        if (wVar != null) {
            int i4 = -1;
            while (true) {
                if (i2 >= arrayList.size()) {
                    i2 = i4;
                    break;
                }
                w wVar2 = (w) arrayList.get(i2);
                wVar2.getClass();
                if (wVar.f6768e.equals(wVar2.f6768e)) {
                    if (wVar2.f6764a.get()) {
                        break;
                    }
                    i4 = i2;
                }
                i2++;
            }
            if (i2 != -1) {
                w wVar3 = (w) arrayList.get(i2);
                arrayList.remove(i2);
                wVar3.a();
            }
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((w) it2.next()).a();
            }
            arrayList.clear();
        }
        return emptyList;
    }
}
