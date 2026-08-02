package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kgj implements Runnable {
    final /* synthetic */ kgm a;
    public final ixd b;

    public kgj(kgm kgmVar, ixd ixdVar) {
        this.a = kgmVar;
        ixdVar.getClass();
        this.b = ixdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x026f, code lost:
    
        if (r10.nextInt(100) >= r13) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x032e, code lost:
    
        if (r8.a.d() == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0350, code lost:
    
        if (r8.a.d() != false) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a1 A[LOOP:2: B:87:0x01f8->B:111:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ea A[Catch: all -> 0x0335, IOException -> 0x0338, TryCatch #3 {IOException -> 0x0338, blocks: (B:6:0x002a, B:10:0x0040, B:12:0x0049, B:14:0x0051, B:15:0x0066, B:30:0x007b, B:38:0x00e7, B:40:0x00eb, B:44:0x0155, B:46:0x015b, B:86:0x01f3, B:87:0x01f8, B:89:0x01fe, B:91:0x0204, B:92:0x020c, B:94:0x0212, B:96:0x0228, B:98:0x0230, B:100:0x0236, B:101:0x023a, B:103:0x0240, B:124:0x0251, B:126:0x0259, B:130:0x0266, B:134:0x0273, B:136:0x027b, B:138:0x0281, B:139:0x0285, B:141:0x028b, B:146:0x0297, B:150:0x02a4, B:151:0x02b6, B:154:0x02b8, B:117:0x02ea, B:119:0x02ee, B:120:0x0314, B:122:0x02f4, B:123:0x02ce, B:157:0x02d7, B:160:0x02ff, B:166:0x0148, B:167:0x00f7, B:171:0x012d, B:173:0x0137, B:175:0x013b, B:176:0x0102, B:180:0x010d, B:182:0x0113, B:189:0x0126, B:191:0x0127, B:201:0x00c0, B:203:0x003a), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ff A[Catch: all -> 0x0335, IOException -> 0x0338, TryCatch #3 {IOException -> 0x0338, blocks: (B:6:0x002a, B:10:0x0040, B:12:0x0049, B:14:0x0051, B:15:0x0066, B:30:0x007b, B:38:0x00e7, B:40:0x00eb, B:44:0x0155, B:46:0x015b, B:86:0x01f3, B:87:0x01f8, B:89:0x01fe, B:91:0x0204, B:92:0x020c, B:94:0x0212, B:96:0x0228, B:98:0x0230, B:100:0x0236, B:101:0x023a, B:103:0x0240, B:124:0x0251, B:126:0x0259, B:130:0x0266, B:134:0x0273, B:136:0x027b, B:138:0x0281, B:139:0x0285, B:141:0x028b, B:146:0x0297, B:150:0x02a4, B:151:0x02b6, B:154:0x02b8, B:117:0x02ea, B:119:0x02ee, B:120:0x0314, B:122:0x02f4, B:123:0x02ce, B:157:0x02d7, B:160:0x02ff, B:166:0x0148, B:167:0x00f7, B:171:0x012d, B:173:0x0137, B:175:0x013b, B:176:0x0102, B:180:0x010d, B:182:0x0113, B:189:0x0126, B:191:0x0127, B:201:0x00c0, B:203:0x003a), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015b A[Catch: all -> 0x0335, IOException -> 0x0338, TRY_LEAVE, TryCatch #3 {IOException -> 0x0338, blocks: (B:6:0x002a, B:10:0x0040, B:12:0x0049, B:14:0x0051, B:15:0x0066, B:30:0x007b, B:38:0x00e7, B:40:0x00eb, B:44:0x0155, B:46:0x015b, B:86:0x01f3, B:87:0x01f8, B:89:0x01fe, B:91:0x0204, B:92:0x020c, B:94:0x0212, B:96:0x0228, B:98:0x0230, B:100:0x0236, B:101:0x023a, B:103:0x0240, B:124:0x0251, B:126:0x0259, B:130:0x0266, B:134:0x0273, B:136:0x027b, B:138:0x0281, B:139:0x0285, B:141:0x028b, B:146:0x0297, B:150:0x02a4, B:151:0x02b6, B:154:0x02b8, B:117:0x02ea, B:119:0x02ee, B:120:0x0314, B:122:0x02f4, B:123:0x02ce, B:157:0x02d7, B:160:0x02ff, B:166:0x0148, B:167:0x00f7, B:171:0x012d, B:173:0x0137, B:175:0x013b, B:176:0x0102, B:180:0x010d, B:182:0x0113, B:189:0x0126, B:191:0x0127, B:201:0x00c0, B:203:0x003a), top: B:5:0x002a }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        kao kaoVar;
        kbs b;
        kam kamVar;
        kgk kgkVar;
        kgl kglVar;
        kam kamVar2;
        Logger logger = kgm.b;
        if (logger.isLoggable(Level.FINER)) {
            logger.logp(Level.FINER, "io.grpc.internal.DnsNameResolver$Resolve", "run", "Attempting DNS resolution of ".concat(String.valueOf(this.a.j)));
        }
        kao kaoVar2 = null;
        Map map = null;
        try {
            try {
                try {
                    kgm kgmVar = this.a;
                    String str = kgmVar.j;
                    int i = kgmVar.k;
                    InetSocketAddress createUnresolved = InetSocketAddress.createUnresolved(str, i);
                    kbc a = !(createUnresolved instanceof InetSocketAddress) ? null : kka.a(createUnresolved);
                    jxx jxxVar = a != null ? new jxx(a) : null;
                    if (jxxVar != null) {
                        if (logger.isLoggable(Level.FINER)) {
                            logger.logp(Level.FINER, "io.grpc.internal.DnsNameResolver$Resolve", "run", "Using proxy address " + jxxVar.toString());
                        }
                        List list = Collections.EMPTY_LIST;
                        kaoVar = new kao(new kbs(null, Collections.singletonList(jxxVar)), jwt.a, null);
                    } else {
                        List list2 = Collections.EMPTY_LIST;
                        jwt jwtVar = jwt.a;
                        try {
                            int i2 = kgmVar.r;
                            List unmodifiableList = DesugarCollections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
                            ArrayList arrayList = new ArrayList(unmodifiableList.size());
                            Iterator it = unmodifiableList.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new jxx(new InetSocketAddress((InetAddress) it.next(), i)));
                            }
                            b = new kbs(null, DesugarCollections.unmodifiableList(arrayList));
                        } catch (Exception e) {
                            kgm.b.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "doResolve", "Address resolution failure", (Throwable) e);
                            b = kbs.b(kbq.l.e("Unable to resolve host ".concat(String.valueOf(kgmVar.j))).d(e));
                        }
                        if (kgm.f) {
                            List<String> list3 = Collections.EMPTY_LIST;
                            boolean z = kgm.d;
                            boolean z2 = kgm.e;
                            String str2 = kgmVar.j;
                            if (z) {
                                if ("localhost".equalsIgnoreCase(str2)) {
                                    if (!z2) {
                                    }
                                    kgkVar = (kgk) kgmVar.i.get();
                                    if (kgkVar == null && (kglVar = kgm.g) != null) {
                                        kgkVar = kglVar.a();
                                    }
                                } else if (!str2.contains(":")) {
                                    boolean z3 = true;
                                    int i3 = 0;
                                    while (i3 < str2.length()) {
                                        char charAt = str2.charAt(i3);
                                        if (charAt != '.') {
                                            z3 = (z3 ? 1 : 0) & (charAt >= '0' && charAt <= '9');
                                        }
                                        i3++;
                                        z3 = z3;
                                    }
                                    if (z3) {
                                    }
                                    kgkVar = (kgk) kgmVar.i.get();
                                    if (kgkVar == null) {
                                        kgkVar = kglVar.a();
                                    }
                                }
                                if (kgkVar != null) {
                                    try {
                                        list3 = kgkVar.a();
                                    } catch (Exception e2) {
                                        kgm.b.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveServiceConfig", "ServiceConfig resolution failure", (Throwable) e2);
                                    }
                                }
                                if (list3.isEmpty()) {
                                    Random random = kgmVar.h;
                                    String e3 = kgm.e();
                                    try {
                                        try {
                                            ArrayList<Map> arrayList2 = new ArrayList();
                                            for (String str3 : list3) {
                                                if (str3.startsWith("grpc_config=")) {
                                                    String substring = str3.substring(12);
                                                    Logger logger2 = khv.a;
                                                    ihs ihsVar = new ihs(new StringReader(substring));
                                                    try {
                                                        Object a2 = khv.a(ihsVar);
                                                        try {
                                                            ihsVar.close();
                                                        } catch (IOException e4) {
                                                            khv.a.logp(Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", (Throwable) e4);
                                                        }
                                                        if (!(a2 instanceof List)) {
                                                            throw new ClassCastException("wrong type ".concat(String.valueOf(String.valueOf(a2))));
                                                        }
                                                        List list4 = (List) a2;
                                                        ixb.j(list4);
                                                        arrayList2.addAll(list4);
                                                    } finally {
                                                    }
                                                } else {
                                                    kgm.b.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "parseTxtResults", "Ignoring non service config {0}", new Object[]{str3});
                                                }
                                            }
                                            Object obj = null;
                                            for (Map map2 : arrayList2) {
                                                try {
                                                    for (Map.Entry entry : map2.entrySet()) {
                                                        hoq.t(kgm.c.contains(entry.getKey()), "Bad key: %s", entry);
                                                    }
                                                    List h = ixb.h(map2, "clientLanguage");
                                                    if (h != null && !h.isEmpty()) {
                                                        Iterator it2 = h.iterator();
                                                        while (it2.hasNext()) {
                                                            if ("java".equalsIgnoreCase((String) it2.next())) {
                                                            }
                                                        }
                                                        obj = map;
                                                        if (obj != null) {
                                                            break;
                                                        } else {
                                                            map = null;
                                                        }
                                                    }
                                                    Double b2 = ixb.b(map2, "percentage");
                                                    if (b2 != null) {
                                                        int intValue = b2.intValue();
                                                        hoq.t(intValue >= 0 && intValue <= 100, "Bad percentage: %s", b2);
                                                    }
                                                    List h2 = ixb.h(map2, "clientHostname");
                                                    if (h2 != null && !h2.isEmpty()) {
                                                        Iterator it3 = h2.iterator();
                                                        while (it3.hasNext()) {
                                                            if (((String) it3.next()).equals(e3)) {
                                                            }
                                                        }
                                                        obj = null;
                                                        if (obj != null) {
                                                        }
                                                    }
                                                    map = ixb.i(map2, "serviceConfig");
                                                    if (map == null) {
                                                        throw new haj(String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                    }
                                                    obj = map;
                                                    if (obj != null) {
                                                    }
                                                } catch (RuntimeException e5) {
                                                    kamVar2 = new kam(kbq.d.e("failed to pick service config choice").d(e5));
                                                }
                                            }
                                            kamVar2 = obj == null ? null : new kam(obj);
                                        } catch (IOException e6) {
                                            e = e6;
                                            kamVar2 = new kam(kbq.d.e("failed to parse TXT records").d(e));
                                            if (kamVar2 != null) {
                                            }
                                            kamVar = null;
                                            kaoVar = new kao(b, jwtVar, kamVar);
                                            this.a.m.execute(new kga(this, kaoVar, 9));
                                        }
                                    } catch (RuntimeException e7) {
                                        e = e7;
                                        kamVar2 = new kam(kbq.d.e("failed to parse TXT records").d(e));
                                        if (kamVar2 != null) {
                                        }
                                        kamVar = null;
                                        kaoVar = new kao(b, jwtVar, kamVar);
                                        this.a.m.execute(new kga(this, kaoVar, 9));
                                    }
                                    if (kamVar2 != null) {
                                        kbq kbqVar = kamVar2.a;
                                        kamVar = kbqVar != null ? new kam(kbqVar) : kgmVar.n.a((Map) kamVar2.b);
                                        kaoVar = new kao(b, jwtVar, kamVar);
                                    }
                                } else {
                                    kgm.b.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveServiceConfig", "No TXT records found for {0}", new Object[]{kgmVar.j});
                                }
                            }
                            kgkVar = null;
                            if (kgkVar != null) {
                            }
                            if (list3.isEmpty()) {
                            }
                        }
                        kamVar = null;
                        kaoVar = new kao(b, jwtVar, kamVar);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.a.m.execute(new kgi(this, kaoVar2 == null && kaoVar2.a.d(), 0));
                    throw th;
                }
            } catch (IOException e8) {
                e = e8;
                kaoVar = null;
            }
            try {
                this.a.m.execute(new kga(this, kaoVar, 9));
            } catch (IOException e9) {
                e = e9;
                this.a.m.execute(new kga(this, e, 10));
                if (kaoVar != null) {
                }
                r4 = false;
                this.a.m.execute(new kgi(this, r4, 0));
            }
        } catch (Throwable th2) {
            th = th2;
            kaoVar2 = null;
            this.a.m.execute(new kgi(this, kaoVar2 == null && kaoVar2.a.d(), 0));
            throw th;
        }
    }
}
