package com.umeng.commonsdk.statistics.proto;

import com.umeng.commonsdk.proguard.ab;
import com.umeng.commonsdk.proguard.ac;
import com.umeng.commonsdk.proguard.ad;
import com.umeng.commonsdk.proguard.ae;
import com.umeng.commonsdk.proguard.ah;
import com.umeng.commonsdk.proguard.ai;
import com.umeng.commonsdk.proguard.ak;
import com.umeng.commonsdk.proguard.am;
import com.umeng.commonsdk.proguard.an;
import com.umeng.commonsdk.proguard.ao;
import com.umeng.commonsdk.proguard.ap;
import com.umeng.commonsdk.proguard.aq;
import com.umeng.commonsdk.proguard.ar;
import com.umeng.commonsdk.proguard.as;
import com.umeng.commonsdk.proguard.at;
import com.umeng.commonsdk.proguard.i;
import com.umeng.commonsdk.proguard.o;
import com.umeng.commonsdk.proguard.p;
import com.umeng.commonsdk.proguard.u;
import com.umeng.commonsdk.proguard.v;
import com.umeng.commonsdk.proguard.w;
import com.umeng.commonsdk.proguard.x;
import com.umeng.commonsdk.proguard.z;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: IdTracking.java */
/* loaded from: classes2.dex */
public class c implements i<c, e>, Serializable, Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public static final Map<e, u> f9232d;
    private static final long e = -5764118265293965743L;
    private static final am f = new am("IdTracking");
    private static final ac g = new ac("snapshots", ao.k, 1);
    private static final ac h = new ac("journals", ao.m, 2);
    private static final ac i = new ac("checksum", (byte) 11, 3);
    private static final Map<Class<? extends ap>, aq> j = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public Map<String, com.umeng.commonsdk.statistics.proto.b> f9233a;

    /* renamed from: b, reason: collision with root package name */
    public List<com.umeng.commonsdk.statistics.proto.a> f9234b;

    /* renamed from: c, reason: collision with root package name */
    public String f9235c;
    private e[] k;

    static {
        j.put(ar.class, new b());
        j.put(as.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.SNAPSHOTS, (e) new u("snapshots", (byte) 1, new x(ao.k, new v((byte) 11), new z((byte) 12, com.umeng.commonsdk.statistics.proto.b.class))));
        enumMap.put((EnumMap) e.JOURNALS, (e) new u("journals", (byte) 2, new w(ao.m, new z((byte) 12, com.umeng.commonsdk.statistics.proto.a.class))));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new u("checksum", (byte) 2, new v((byte) 11)));
        f9232d = Collections.unmodifiableMap(enumMap);
        u.a(c.class, f9232d);
    }

    /* compiled from: IdTracking.java */
    public enum e implements p {
        SNAPSHOTS(1, "snapshots"),
        JOURNALS(2, "journals"),
        CHECKSUM(3, "checksum");


        /* renamed from: d, reason: collision with root package name */
        private static final Map<String, e> f9239d = new HashMap();
        private final short e;
        private final String f;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f9239d.put(eVar.b(), eVar);
            }
        }

        public static e a(int i) {
            switch (i) {
                case 1:
                    return SNAPSHOTS;
                case 2:
                    return JOURNALS;
                case 3:
                    return CHECKSUM;
                default:
                    return null;
            }
        }

        public static e b(int i) {
            e a2 = a(i);
            if (a2 != null) {
                return a2;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        public static e a(String str) {
            return f9239d.get(str);
        }

        e(short s, String str) {
            this.e = s;
            this.f = str;
        }

        @Override // com.umeng.commonsdk.proguard.p
        public short a() {
            return this.e;
        }

        @Override // com.umeng.commonsdk.proguard.p
        public String b() {
            return this.f;
        }
    }

    public c() {
        this.k = new e[]{e.JOURNALS, e.CHECKSUM};
    }

    public c(Map<String, com.umeng.commonsdk.statistics.proto.b> map) {
        this();
        this.f9233a = map;
    }

    public c(c cVar) {
        this.k = new e[]{e.JOURNALS, e.CHECKSUM};
        if (cVar.e()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.b> entry : cVar.f9233a.entrySet()) {
                hashMap.put(entry.getKey(), new com.umeng.commonsdk.statistics.proto.b(entry.getValue()));
            }
            this.f9233a = hashMap;
        }
        if (cVar.j()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.umeng.commonsdk.statistics.proto.a> it = cVar.f9234b.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.umeng.commonsdk.statistics.proto.a(it.next()));
            }
            this.f9234b = arrayList;
        }
        if (cVar.m()) {
            this.f9235c = cVar.f9235c;
        }
    }

    @Override // com.umeng.commonsdk.proguard.i
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c deepCopy() {
        return new c(this);
    }

    @Override // com.umeng.commonsdk.proguard.i
    public void clear() {
        this.f9233a = null;
        this.f9234b = null;
        this.f9235c = null;
    }

    public int b() {
        if (this.f9233a == null) {
            return 0;
        }
        return this.f9233a.size();
    }

    public void a(String str, com.umeng.commonsdk.statistics.proto.b bVar) {
        if (this.f9233a == null) {
            this.f9233a = new HashMap();
        }
        this.f9233a.put(str, bVar);
    }

    public Map<String, com.umeng.commonsdk.statistics.proto.b> c() {
        return this.f9233a;
    }

    public c a(Map<String, com.umeng.commonsdk.statistics.proto.b> map) {
        this.f9233a = map;
        return this;
    }

    public void d() {
        this.f9233a = null;
    }

    public boolean e() {
        return this.f9233a != null;
    }

    public void a(boolean z) {
        if (z) {
            return;
        }
        this.f9233a = null;
    }

    public int f() {
        if (this.f9234b == null) {
            return 0;
        }
        return this.f9234b.size();
    }

    public Iterator<com.umeng.commonsdk.statistics.proto.a> g() {
        if (this.f9234b == null) {
            return null;
        }
        return this.f9234b.iterator();
    }

    public void a(com.umeng.commonsdk.statistics.proto.a aVar) {
        if (this.f9234b == null) {
            this.f9234b = new ArrayList();
        }
        this.f9234b.add(aVar);
    }

    public List<com.umeng.commonsdk.statistics.proto.a> h() {
        return this.f9234b;
    }

    public c a(List<com.umeng.commonsdk.statistics.proto.a> list) {
        this.f9234b = list;
        return this;
    }

    public void i() {
        this.f9234b = null;
    }

    public boolean j() {
        return this.f9234b != null;
    }

    public void b(boolean z) {
        if (z) {
            return;
        }
        this.f9234b = null;
    }

    public String k() {
        return this.f9235c;
    }

    public c a(String str) {
        this.f9235c = str;
        return this;
    }

    public void l() {
        this.f9235c = null;
    }

    public boolean m() {
        return this.f9235c != null;
    }

    public void c(boolean z) {
        if (z) {
            return;
        }
        this.f9235c = null;
    }

    @Override // com.umeng.commonsdk.proguard.i
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i2) {
        return e.a(i2);
    }

    @Override // com.umeng.commonsdk.proguard.i
    public void read(ah ahVar) throws o {
        j.get(ahVar.D()).b().b(ahVar, this);
    }

    @Override // com.umeng.commonsdk.proguard.i
    public void write(ah ahVar) throws o {
        j.get(ahVar.D()).b().a(ahVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdTracking(");
        sb.append("snapshots:");
        if (this.f9233a == null) {
            sb.append("null");
        } else {
            sb.append(this.f9233a);
        }
        if (j()) {
            sb.append(", ");
            sb.append("journals:");
            if (this.f9234b == null) {
                sb.append("null");
            } else {
                sb.append(this.f9234b);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("checksum:");
            if (this.f9235c == null) {
                sb.append("null");
            } else {
                sb.append(this.f9235c);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public void n() throws o {
        if (this.f9233a != null) {
            return;
        }
        throw new ai("Required field 'snapshots' was not present! Struct: " + toString());
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new ab(new at(objectOutputStream)));
        } catch (o e2) {
            throw new IOException(e2.getMessage());
        }
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            read(new ab(new at(objectInputStream)));
        } catch (o e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* compiled from: IdTracking.java */
    private static class b implements aq {
        private b() {
        }

        @Override // com.umeng.commonsdk.proguard.aq
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* compiled from: IdTracking.java */
    private static class a extends ar<c> {
        private a() {
        }

        @Override // com.umeng.commonsdk.proguard.ap
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(ah ahVar, c cVar) throws o {
            ahVar.j();
            while (true) {
                ac l = ahVar.l();
                if (l.f9012b != 0) {
                    int i = 0;
                    switch (l.f9013c) {
                        case 1:
                            if (l.f9012b == 13) {
                                ae n = ahVar.n();
                                cVar.f9233a = new HashMap(n.f9018c * 2);
                                while (i < n.f9018c) {
                                    String z = ahVar.z();
                                    com.umeng.commonsdk.statistics.proto.b bVar = new com.umeng.commonsdk.statistics.proto.b();
                                    bVar.read(ahVar);
                                    cVar.f9233a.put(z, bVar);
                                    i++;
                                }
                                ahVar.o();
                                cVar.a(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 2:
                            if (l.f9012b == 15) {
                                ad p = ahVar.p();
                                cVar.f9234b = new ArrayList(p.f9015b);
                                while (i < p.f9015b) {
                                    com.umeng.commonsdk.statistics.proto.a aVar = new com.umeng.commonsdk.statistics.proto.a();
                                    aVar.read(ahVar);
                                    cVar.f9234b.add(aVar);
                                    i++;
                                }
                                ahVar.q();
                                cVar.b(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 3:
                            if (l.f9012b == 11) {
                                cVar.f9235c = ahVar.z();
                                cVar.c(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        default:
                            ak.a(ahVar, l.f9012b);
                            break;
                    }
                    ahVar.m();
                } else {
                    ahVar.k();
                    cVar.n();
                    return;
                }
            }
        }

        @Override // com.umeng.commonsdk.proguard.ap
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ah ahVar, c cVar) throws o {
            cVar.n();
            ahVar.a(c.f);
            if (cVar.f9233a != null) {
                ahVar.a(c.g);
                ahVar.a(new ae((byte) 11, (byte) 12, cVar.f9233a.size()));
                for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.b> entry : cVar.f9233a.entrySet()) {
                    ahVar.a(entry.getKey());
                    entry.getValue().write(ahVar);
                }
                ahVar.e();
                ahVar.c();
            }
            if (cVar.f9234b != null && cVar.j()) {
                ahVar.a(c.h);
                ahVar.a(new ad((byte) 12, cVar.f9234b.size()));
                Iterator<com.umeng.commonsdk.statistics.proto.a> it = cVar.f9234b.iterator();
                while (it.hasNext()) {
                    it.next().write(ahVar);
                }
                ahVar.f();
                ahVar.c();
            }
            if (cVar.f9235c != null && cVar.m()) {
                ahVar.a(c.i);
                ahVar.a(cVar.f9235c);
                ahVar.c();
            }
            ahVar.d();
            ahVar.b();
        }
    }

    /* compiled from: IdTracking.java */
    private static class d implements aq {
        private d() {
        }

        @Override // com.umeng.commonsdk.proguard.aq
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0400c b() {
            return new C0400c();
        }
    }

    /* compiled from: IdTracking.java */
    /* renamed from: com.umeng.commonsdk.statistics.proto.c$c, reason: collision with other inner class name */
    private static class C0400c extends as<c> {
        private C0400c() {
        }

        @Override // com.umeng.commonsdk.proguard.ap
        public void a(ah ahVar, c cVar) throws o {
            an anVar = (an) ahVar;
            anVar.a(cVar.f9233a.size());
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.b> entry : cVar.f9233a.entrySet()) {
                anVar.a(entry.getKey());
                entry.getValue().write(anVar);
            }
            BitSet bitSet = new BitSet();
            if (cVar.j()) {
                bitSet.set(0);
            }
            if (cVar.m()) {
                bitSet.set(1);
            }
            anVar.a(bitSet, 2);
            if (cVar.j()) {
                anVar.a(cVar.f9234b.size());
                Iterator<com.umeng.commonsdk.statistics.proto.a> it = cVar.f9234b.iterator();
                while (it.hasNext()) {
                    it.next().write(anVar);
                }
            }
            if (cVar.m()) {
                anVar.a(cVar.f9235c);
            }
        }

        @Override // com.umeng.commonsdk.proguard.ap
        public void b(ah ahVar, c cVar) throws o {
            an anVar = (an) ahVar;
            ae aeVar = new ae((byte) 11, (byte) 12, anVar.w());
            cVar.f9233a = new HashMap(aeVar.f9018c * 2);
            for (int i = 0; i < aeVar.f9018c; i++) {
                String z = anVar.z();
                com.umeng.commonsdk.statistics.proto.b bVar = new com.umeng.commonsdk.statistics.proto.b();
                bVar.read(anVar);
                cVar.f9233a.put(z, bVar);
            }
            cVar.a(true);
            BitSet b2 = anVar.b(2);
            if (b2.get(0)) {
                ad adVar = new ad((byte) 12, anVar.w());
                cVar.f9234b = new ArrayList(adVar.f9015b);
                for (int i2 = 0; i2 < adVar.f9015b; i2++) {
                    com.umeng.commonsdk.statistics.proto.a aVar = new com.umeng.commonsdk.statistics.proto.a();
                    aVar.read(anVar);
                    cVar.f9234b.add(aVar);
                }
                cVar.b(true);
            }
            if (b2.get(1)) {
                cVar.f9235c = anVar.z();
                cVar.c(true);
            }
        }
    }
}
