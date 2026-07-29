package com.umeng.commonsdk.statistics.proto;

import com.umeng.commonsdk.proguard.ab;
import com.umeng.commonsdk.proguard.ac;
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
import com.umeng.commonsdk.proguard.f;
import com.umeng.commonsdk.proguard.i;
import com.umeng.commonsdk.proguard.o;
import com.umeng.commonsdk.proguard.p;
import com.umeng.commonsdk.proguard.u;
import com.umeng.commonsdk.proguard.v;
import com.umeng.commonsdk.proguard.x;
import com.umeng.commonsdk.proguard.z;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Imprint.java */
/* loaded from: classes2.dex */
public class d implements i<d, e>, Serializable, Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public static final Map<e, u> f9240d;
    private static final long e = 2846460275012375038L;
    private static final am f = new am("Imprint");
    private static final ac g = new ac("property", ao.k, 1);
    private static final ac h = new ac("version", (byte) 8, 2);
    private static final ac i = new ac("checksum", (byte) 11, 3);
    private static final Map<Class<? extends ap>, aq> j = new HashMap();
    private static final int k = 0;

    /* renamed from: a, reason: collision with root package name */
    public Map<String, com.umeng.commonsdk.statistics.proto.e> f9241a;

    /* renamed from: b, reason: collision with root package name */
    public int f9242b;

    /* renamed from: c, reason: collision with root package name */
    public String f9243c;
    private byte l;

    static {
        j.put(ar.class, new b());
        j.put(as.class, new C0401d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.PROPERTY, (e) new u("property", (byte) 1, new x(ao.k, new v((byte) 11), new z((byte) 12, com.umeng.commonsdk.statistics.proto.e.class))));
        enumMap.put((EnumMap) e.VERSION, (e) new u("version", (byte) 1, new v((byte) 8)));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new u("checksum", (byte) 1, new v((byte) 11)));
        f9240d = Collections.unmodifiableMap(enumMap);
        u.a(d.class, f9240d);
    }

    /* compiled from: Imprint.java */
    public enum e implements p {
        PROPERTY(1, "property"),
        VERSION(2, "version"),
        CHECKSUM(3, "checksum");


        /* renamed from: d, reason: collision with root package name */
        private static final Map<String, e> f9247d = new HashMap();
        private final short e;
        private final String f;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f9247d.put(eVar.b(), eVar);
            }
        }

        public static e a(int i) {
            switch (i) {
                case 1:
                    return PROPERTY;
                case 2:
                    return VERSION;
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
            return f9247d.get(str);
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

    public d() {
        this.l = (byte) 0;
    }

    public d(Map<String, com.umeng.commonsdk.statistics.proto.e> map, int i2, String str) {
        this();
        this.f9241a = map;
        this.f9242b = i2;
        b(true);
        this.f9243c = str;
    }

    public d(d dVar) {
        this.l = (byte) 0;
        this.l = dVar.l;
        if (dVar.e()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar.f9241a.entrySet()) {
                hashMap.put(entry.getKey(), new com.umeng.commonsdk.statistics.proto.e(entry.getValue()));
            }
            this.f9241a = hashMap;
        }
        this.f9242b = dVar.f9242b;
        if (dVar.k()) {
            this.f9243c = dVar.f9243c;
        }
    }

    @Override // com.umeng.commonsdk.proguard.i
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public d deepCopy() {
        return new d(this);
    }

    @Override // com.umeng.commonsdk.proguard.i
    public void clear() {
        this.f9241a = null;
        b(false);
        this.f9242b = 0;
        this.f9243c = null;
    }

    public int b() {
        if (this.f9241a == null) {
            return 0;
        }
        return this.f9241a.size();
    }

    public void a(String str, com.umeng.commonsdk.statistics.proto.e eVar) {
        if (this.f9241a == null) {
            this.f9241a = new HashMap();
        }
        this.f9241a.put(str, eVar);
    }

    public Map<String, com.umeng.commonsdk.statistics.proto.e> c() {
        return this.f9241a;
    }

    public d a(Map<String, com.umeng.commonsdk.statistics.proto.e> map) {
        this.f9241a = map;
        return this;
    }

    public void d() {
        this.f9241a = null;
    }

    public boolean e() {
        return this.f9241a != null;
    }

    public void a(boolean z) {
        if (z) {
            return;
        }
        this.f9241a = null;
    }

    public int f() {
        return this.f9242b;
    }

    public d a(int i2) {
        this.f9242b = i2;
        b(true);
        return this;
    }

    public void g() {
        this.l = f.b(this.l, 0);
    }

    public boolean h() {
        return f.a(this.l, 0);
    }

    public void b(boolean z) {
        this.l = f.a(this.l, 0, z);
    }

    public String i() {
        return this.f9243c;
    }

    public d a(String str) {
        this.f9243c = str;
        return this;
    }

    public void j() {
        this.f9243c = null;
    }

    public boolean k() {
        return this.f9243c != null;
    }

    public void c(boolean z) {
        if (z) {
            return;
        }
        this.f9243c = null;
    }

    @Override // com.umeng.commonsdk.proguard.i
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
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
        StringBuilder sb = new StringBuilder("Imprint(");
        sb.append("property:");
        if (this.f9241a == null) {
            sb.append("null");
        } else {
            sb.append(this.f9241a);
        }
        sb.append(", ");
        sb.append("version:");
        sb.append(this.f9242b);
        sb.append(", ");
        sb.append("checksum:");
        if (this.f9243c == null) {
            sb.append("null");
        } else {
            sb.append(this.f9243c);
        }
        sb.append(")");
        return sb.toString();
    }

    public void l() throws o {
        if (this.f9241a == null) {
            throw new ai("Required field 'property' was not present! Struct: " + toString());
        }
        if (this.f9243c != null) {
            return;
        }
        throw new ai("Required field 'checksum' was not present! Struct: " + toString());
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
            this.l = (byte) 0;
            read(new ab(new at(objectInputStream)));
        } catch (o e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* compiled from: Imprint.java */
    private static class b implements aq {
        private b() {
        }

        @Override // com.umeng.commonsdk.proguard.aq
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* compiled from: Imprint.java */
    private static class a extends ar<d> {
        private a() {
        }

        @Override // com.umeng.commonsdk.proguard.ap
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(ah ahVar, d dVar) throws o {
            ahVar.j();
            while (true) {
                ac l = ahVar.l();
                if (l.f9012b != 0) {
                    switch (l.f9013c) {
                        case 1:
                            if (l.f9012b == 13) {
                                ae n = ahVar.n();
                                dVar.f9241a = new HashMap(n.f9018c * 2);
                                for (int i = 0; i < n.f9018c; i++) {
                                    String z = ahVar.z();
                                    com.umeng.commonsdk.statistics.proto.e eVar = new com.umeng.commonsdk.statistics.proto.e();
                                    eVar.read(ahVar);
                                    dVar.f9241a.put(z, eVar);
                                }
                                ahVar.o();
                                dVar.a(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 2:
                            if (l.f9012b == 8) {
                                dVar.f9242b = ahVar.w();
                                dVar.b(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 3:
                            if (l.f9012b == 11) {
                                dVar.f9243c = ahVar.z();
                                dVar.c(true);
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
                    if (!dVar.h()) {
                        throw new ai("Required field 'version' was not found in serialized data! Struct: " + toString());
                    }
                    dVar.l();
                    return;
                }
            }
        }

        @Override // com.umeng.commonsdk.proguard.ap
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ah ahVar, d dVar) throws o {
            dVar.l();
            ahVar.a(d.f);
            if (dVar.f9241a != null) {
                ahVar.a(d.g);
                ahVar.a(new ae((byte) 11, (byte) 12, dVar.f9241a.size()));
                for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar.f9241a.entrySet()) {
                    ahVar.a(entry.getKey());
                    entry.getValue().write(ahVar);
                }
                ahVar.e();
                ahVar.c();
            }
            ahVar.a(d.h);
            ahVar.a(dVar.f9242b);
            ahVar.c();
            if (dVar.f9243c != null) {
                ahVar.a(d.i);
                ahVar.a(dVar.f9243c);
                ahVar.c();
            }
            ahVar.d();
            ahVar.b();
        }
    }

    /* compiled from: Imprint.java */
    /* renamed from: com.umeng.commonsdk.statistics.proto.d$d, reason: collision with other inner class name */
    private static class C0401d implements aq {
        private C0401d() {
        }

        @Override // com.umeng.commonsdk.proguard.aq
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    /* compiled from: Imprint.java */
    private static class c extends as<d> {
        private c() {
        }

        @Override // com.umeng.commonsdk.proguard.ap
        public void a(ah ahVar, d dVar) throws o {
            an anVar = (an) ahVar;
            anVar.a(dVar.f9241a.size());
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar.f9241a.entrySet()) {
                anVar.a(entry.getKey());
                entry.getValue().write(anVar);
            }
            anVar.a(dVar.f9242b);
            anVar.a(dVar.f9243c);
        }

        @Override // com.umeng.commonsdk.proguard.ap
        public void b(ah ahVar, d dVar) throws o {
            an anVar = (an) ahVar;
            ae aeVar = new ae((byte) 11, (byte) 12, anVar.w());
            dVar.f9241a = new HashMap(aeVar.f9018c * 2);
            for (int i = 0; i < aeVar.f9018c; i++) {
                String z = anVar.z();
                com.umeng.commonsdk.statistics.proto.e eVar = new com.umeng.commonsdk.statistics.proto.e();
                eVar.read(anVar);
                dVar.f9241a.put(z, eVar);
            }
            dVar.a(true);
            dVar.f9242b = anVar.w();
            dVar.b(true);
            dVar.f9243c = anVar.z();
            dVar.c(true);
        }
    }
}
