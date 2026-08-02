package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class keq extends jzm {
    public final jzm a;
    private final jzn b;

    public keq(jzn jznVar, String str) {
        jznVar.getClass();
        this.b = jznVar;
        str.getClass();
        jzm a = jznVar.a(str);
        if (a == null) {
            kbq e = kbq.k.e(a.Z(str, "Could not find policy '", "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
            a = new kgs(jxi.c, new jzb(jze.b(e)), e);
        }
        this.a = a;
    }

    @Override // defpackage.jza
    public final /* synthetic */ jzk a(jzc jzcVar) {
        return new kep(this, jzcVar);
    }

    @Override // defpackage.jzm
    public final kam b(Map map) {
        List<kmd> unmodifiableList;
        String e;
        if (map != null) {
            try {
                ArrayList arrayList = new ArrayList();
                if (map.containsKey("loadBalancingConfig")) {
                    arrayList.addAll(ixb.g(map, "loadBalancingConfig"));
                }
                if (arrayList.isEmpty() && (e = ixb.e(map, "loadBalancingPolicy")) != null) {
                    arrayList.add(Collections.singletonMap(e.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
                }
                List<Map> unmodifiableList2 = DesugarCollections.unmodifiableList(arrayList);
                if (unmodifiableList2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Map map2 : unmodifiableList2) {
                        if (map2.size() != 1) {
                            throw new RuntimeException("There are " + map2.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + String.valueOf(map2));
                        }
                        String str = (String) ((Map.Entry) map2.entrySet().iterator().next()).getKey();
                        arrayList2.add(new kmd(str, ixb.i(map2, str)));
                    }
                    unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
                    if (unmodifiableList != null || unmodifiableList.isEmpty()) {
                        return null;
                    }
                    jzn jznVar = this.b;
                    ArrayList arrayList3 = new ArrayList();
                    for (kmd kmdVar : unmodifiableList) {
                        String str2 = kmdVar.a;
                        jzm a = jznVar.a(str2);
                        if (a != null) {
                            if (!arrayList3.isEmpty()) {
                                Logger.getLogger(kmf.class.getName()).logp(Level.FINEST, "io.grpc.internal.ServiceConfigUtil", "selectLbPolicyFromList", "{0} specified by Service Config are not available", arrayList3);
                            }
                            kam b = a.b(kmdVar.b);
                            return b.a == null ? new kam(new kme(a, b.b)) : b;
                        }
                        arrayList3.add(str2);
                    }
                    return new kam(kbq.d.e(a.aa(arrayList3, "None of ", " specified by Service Config are available.")));
                }
            } catch (RuntimeException e2) {
                return new kam(kbq.d.e("can't parse load balancer configuration").d(e2));
            }
        }
        unmodifiableList = null;
        if (unmodifiableList != null) {
        }
        return null;
    }

    @Override // defpackage.jzm
    public final String c() {
        return "auto_configured_internal";
    }

    @Override // defpackage.jzm
    public final void d() {
    }

    @Override // defpackage.jzm
    public final void e() {
    }
}
