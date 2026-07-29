package com.umeng.commonsdk.statistics.proto;

import com.umeng.commonsdk.proguard.ab;
import com.umeng.commonsdk.proguard.ac;
import com.umeng.commonsdk.proguard.ah;
import com.umeng.commonsdk.proguard.ai;
import com.umeng.commonsdk.proguard.ak;
import com.umeng.commonsdk.proguard.am;
import com.umeng.commonsdk.proguard.an;
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
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: IdJournal.java */
/* loaded from: classes2.dex */
public class a implements i<a, e>, Serializable, Cloneable {
    public static final Map<e, u> e;
    private static final long f = 9132678615281394583L;
    private static final am g = new am("IdJournal");
    private static final ac h = new ac("domain", (byte) 11, 1);
    private static final ac i = new ac("old_id", (byte) 11, 2);
    private static final ac j = new ac("new_id", (byte) 11, 3);
    private static final ac k = new ac("ts", (byte) 10, 4);
    private static final Map<Class<? extends ap>, aq> l = new HashMap();
    private static final int m = 0;

    /* renamed from: a, reason: collision with root package name */
    public String f9216a;

    /* renamed from: b, reason: collision with root package name */
    public String f9217b;

    /* renamed from: c, reason: collision with root package name */
    public String f9218c;

    /* renamed from: d, reason: collision with root package name */
    public long f9219d;
    private byte n;
    private e[] o;

    static {
        l.put(ar.class, new b());
        l.put(as.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.DOMAIN, (e) new u("domain", (byte) 1, new v((byte) 11)));
        enumMap.put((EnumMap) e.OLD_ID, (e) new u("old_id", (byte) 2, new v((byte) 11)));
        enumMap.put((EnumMap) e.NEW_ID, (e) new u("new_id", (byte) 1, new v((byte) 11)));
        enumMap.put((EnumMap) e.TS, (e) new u("ts", (byte) 1, new v((byte) 10)));
        e = Collections.unmodifiableMap(enumMap);
        u.a(a.class, e);
    }

    /* compiled from: IdJournal.java */
    public enum e implements p {
        DOMAIN(1, "domain"),
        OLD_ID(2, "old_id"),
        NEW_ID(3, "new_id"),
        TS(4, "ts");

        private static final Map<String, e> e = new HashMap();
        private final short f;
        private final String g;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                e.put(eVar.b(), eVar);
            }
        }

        public static e a(int i) {
            switch (i) {
                case 1:
                    return DOMAIN;
                case 2:
                    return OLD_ID;
                case 3:
                    return NEW_ID;
                case 4:
                    return TS;
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
            return e.get(str);
        }

        e(short s, String str) {
            this.f = s;
            this.g = str;
        }

        @Override // com.umeng.commonsdk.proguard.p
        public short a() {
            return this.f;
        }

        @Override // com.umeng.commonsdk.proguard.p
        public String b() {
            return this.g;
        }
    }

    public a() {
        this.n = (byte) 0;
        this.o = new e[]{e.OLD_ID};
    }

    public a(String str, String str2, long j2) {
        this();
        this.f9216a = str;
        this.f9218c = str2;
        this.f9219d = j2;
        d(true);
    }

    public a(a aVar) {
        this.n = (byte) 0;
        this.o = new e[]{e.OLD_ID};
        this.n = aVar.n;
        if (aVar.d()) {
            this.f9216a = aVar.f9216a;
        }
        if (aVar.g()) {
            this.f9217b = aVar.f9217b;
        }
        if (aVar.j()) {
            this.f9218c = aVar.f9218c;
        }
        this.f9219d = aVar.f9219d;
    }

    @Override // com.umeng.commonsdk.proguard.i
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a deepCopy() {
        return new a(this);
    }

    @Override // com.umeng.commonsdk.proguard.i
    public void clear() {
        this.f9216a = null;
        this.f9217b = null;
        this.f9218c = null;
        d(false);
        this.f9219d = 0L;
    }

    public String b() {
        return this.f9216a;
    }

    public a a(String str) {
        this.f9216a = str;
        return this;
    }

    public void c() {
        this.f9216a = null;
    }

    public boolean d() {
        return this.f9216a != null;
    }

    public void a(boolean z) {
        if (z) {
            return;
        }
        this.f9216a = null;
    }

    public String e() {
        return this.f9217b;
    }

    public a b(String str) {
        this.f9217b = str;
        return this;
    }

    public void f() {
        this.f9217b = null;
    }

    public boolean g() {
        return this.f9217b != null;
    }

    public void b(boolean z) {
        if (z) {
            return;
        }
        this.f9217b = null;
    }

    public String h() {
        return this.f9218c;
    }

    public a c(String str) {
        this.f9218c = str;
        return this;
    }

    public void i() {
        this.f9218c = null;
    }

    public boolean j() {
        return this.f9218c != null;
    }

    public void c(boolean z) {
        if (z) {
            return;
        }
        this.f9218c = null;
    }

    public long k() {
        return this.f9219d;
    }

    public a a(long j2) {
        this.f9219d = j2;
        d(true);
        return this;
    }

    public void l() {
        this.n = f.b(this.n, 0);
    }

    public boolean m() {
        return f.a(this.n, 0);
    }

    public void d(boolean z) {
        this.n = f.a(this.n, 0, z);
    }

    @Override // com.umeng.commonsdk.proguard.i
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i2) {
        return e.a(i2);
    }

    @Override // com.umeng.commonsdk.proguard.i
    public void read(ah ahVar) throws o {
        l.get(ahVar.D()).b().b(ahVar, this);
    }

    @Override // com.umeng.commonsdk.proguard.i
    public void write(ah ahVar) throws o {
        l.get(ahVar.D()).b().a(ahVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdJournal(");
        sb.append("domain:");
        if (this.f9216a == null) {
            sb.append("null");
        } else {
            sb.append(this.f9216a);
        }
        if (g()) {
            sb.append(", ");
            sb.append("old_id:");
            if (this.f9217b == null) {
                sb.append("null");
            } else {
                sb.append(this.f9217b);
            }
        }
        sb.append(", ");
        sb.append("new_id:");
        if (this.f9218c == null) {
            sb.append("null");
        } else {
            sb.append(this.f9218c);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.f9219d);
        sb.append(")");
        return sb.toString();
    }

    public void n() throws o {
        if (this.f9216a == null) {
            throw new ai("Required field 'domain' was not present! Struct: " + toString());
        }
        if (this.f9218c != null) {
            return;
        }
        throw new ai("Required field 'new_id' was not present! Struct: " + toString());
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
            this.n = (byte) 0;
            read(new ab(new at(objectInputStream)));
        } catch (o e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* compiled from: IdJournal.java */
    private static class b implements aq {
        private b() {
        }

        @Override // com.umeng.commonsdk.proguard.aq
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0398a b() {
            return new C0398a();
        }
    }

    /* compiled from: IdJournal.java */
    /* renamed from: com.umeng.commonsdk.statistics.proto.a$a, reason: collision with other inner class name */
    private static class C0398a extends ar<a> {
        private C0398a() {
        }

        @Override // com.umeng.commonsdk.proguard.ap
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(ah ahVar, a aVar) throws o {
            ahVar.j();
            while (true) {
                ac l = ahVar.l();
                if (l.f9012b != 0) {
                    switch (l.f9013c) {
                        case 1:
                            if (l.f9012b == 11) {
                                aVar.f9216a = ahVar.z();
                                aVar.a(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 2:
                            if (l.f9012b == 11) {
                                aVar.f9217b = ahVar.z();
                                aVar.b(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 3:
                            if (l.f9012b == 11) {
                                aVar.f9218c = ahVar.z();
                                aVar.c(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 4:
                            if (l.f9012b == 10) {
                                aVar.f9219d = ahVar.x();
                                aVar.d(true);
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
                    if (!aVar.m()) {
                        throw new ai("Required field 'ts' was not found in serialized data! Struct: " + toString());
                    }
                    aVar.n();
                    return;
                }
            }
        }

        @Override // com.umeng.commonsdk.proguard.ap
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ah ahVar, a aVar) throws o {
            aVar.n();
            ahVar.a(a.g);
            if (aVar.f9216a != null) {
                ahVar.a(a.h);
                ahVar.a(aVar.f9216a);
                ahVar.c();
            }
            if (aVar.f9217b != null && aVar.g()) {
                ahVar.a(a.i);
                ahVar.a(aVar.f9217b);
                ahVar.c();
            }
            if (aVar.f9218c != null) {
                ahVar.a(a.j);
                ahVar.a(aVar.f9218c);
                ahVar.c();
            }
            ahVar.a(a.k);
            ahVar.a(aVar.f9219d);
            ahVar.c();
            ahVar.d();
            ahVar.b();
        }
    }

    /* compiled from: IdJournal.java */
    private static class d implements aq {
        private d() {
        }

        @Override // com.umeng.commonsdk.proguard.aq
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    /* compiled from: IdJournal.java */
    private static class c extends as<a> {
        private c() {
        }

        @Override // com.umeng.commonsdk.proguard.ap
        public void a(ah ahVar, a aVar) throws o {
            an anVar = (an) ahVar;
            anVar.a(aVar.f9216a);
            anVar.a(aVar.f9218c);
            anVar.a(aVar.f9219d);
            BitSet bitSet = new BitSet();
            if (aVar.g()) {
                bitSet.set(0);
            }
            anVar.a(bitSet, 1);
            if (aVar.g()) {
                anVar.a(aVar.f9217b);
            }
        }

        @Override // com.umeng.commonsdk.proguard.ap
        public void b(ah ahVar, a aVar) throws o {
            an anVar = (an) ahVar;
            aVar.f9216a = anVar.z();
            aVar.a(true);
            aVar.f9218c = anVar.z();
            aVar.c(true);
            aVar.f9219d = anVar.x();
            aVar.d(true);
            if (anVar.b(1).get(0)) {
                aVar.f9217b = anVar.z();
                aVar.b(true);
            }
        }
    }
}
