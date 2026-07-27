package g2;

import j2.AbstractC0720j;
import j2.InterfaceC0714d;
import java.util.HashMap;
import l2.C0823c;
import o2.C0924c;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0638a implements InterfaceC0714d {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f6676d;

    public C0638a() {
        this.f6676d = new HashMap();
    }

    public void a(C0823c c0823c) {
        int i2 = c0823c.f7968a;
        AbstractC0720j.b("Only child changes supported for tracking", i2 == 2 || i2 == 4 || i2 == 1);
        C0924c c0924c = C0924c.f8919j;
        C0924c c0924c2 = c0823c.f7971d;
        AbstractC0720j.c(!c0924c2.equals(c0924c));
        HashMap hashMap = this.f6676d;
        if (!hashMap.containsKey(c0924c2)) {
            hashMap.put(c0924c2, c0823c);
            return;
        }
        C0823c c0823c2 = (C0823c) hashMap.get(c0924c2);
        int i4 = c0823c2.f7968a;
        o2.m mVar = c0823c.f7969b;
        if (i2 == 2 && i4 == 1) {
            hashMap.put(c0924c2, new C0823c(4, mVar, c0924c2, c0823c2.f7969b));
            return;
        }
        if (i2 == 1 && i4 == 2) {
            hashMap.remove(c0924c2);
            return;
        }
        o2.m mVar2 = c0823c2.f7970c;
        if (i2 == 1 && i4 == 4) {
            hashMap.put(c0924c2, new C0823c(1, mVar2, c0924c2, null));
            return;
        }
        if (i2 == 4 && i4 == 2) {
            hashMap.put(c0924c2, new C0823c(2, mVar, c0924c2, null));
            return;
        }
        if (i2 == 4 && i4 == 4) {
            hashMap.put(c0924c2, new C0823c(4, mVar, c0924c2, mVar2));
            return;
        }
        throw new IllegalStateException("Illegal combination of changes: " + c0823c + " occurred after " + c0823c2);
    }

    @Override // j2.InterfaceC0714d
    public Object k(e eVar, Object obj, Object obj2) {
        o2.s sVar = (o2.s) obj;
        String str = "/";
        if (!eVar.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int i2 = eVar.f6696e;
            for (int i4 = i2; i4 < eVar.f6697i; i4++) {
                if (i4 > i2) {
                    sb.append("/");
                }
                sb.append(eVar.f6695d[i4].f8920d);
            }
            str = sb.toString();
        }
        this.f6676d.put(str, sVar.t(true));
        return null;
    }

    public C0638a(HashMap hashMap) {
        this.f6676d = hashMap;
    }
}
