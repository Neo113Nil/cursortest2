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
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: IdSnapshot.java */
/* loaded from: classes2.dex */
public class b implements i<b, e>, Serializable, Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public static final Map<e, u> f9224d;
    private static final long e = -6496538196005191531L;
    private static final am f = new am("IdSnapshot");
    private static final ac g = new ac("identity", (byte) 11, 1);
    private static final ac h = new ac("ts", (byte) 10, 2);
    private static final ac i = new ac("version", (byte) 8, 3);
    private static final Map<Class<? extends ap>, aq> j = new HashMap();
    private static final int k = 0;
    private static final int l = 1;

    /* renamed from: a, reason: collision with root package name */
    public String f9225a;

    /* renamed from: b, reason: collision with root package name */
    public long f9226b;

    /* renamed from: c, reason: collision with root package name */
    public int f9227c;
    private byte m;

    static {
        j.put(ar.class, new C0399b());
        j.put(as.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.IDENTITY, (e) new u("identity", (byte) 1, new v((byte) 11)));
        enumMap.put((EnumMap) e.TS, (e) new u("ts", (byte) 1, new v((byte) 10)));
        enumMap.put((EnumMap) e.VERSION, (e) new u("version", (byte) 1, new v((byte) 8)));
        f9224d = Collections.unmodifiableMap(enumMap);
        u.a(b.class, f9224d);
    }

    /* compiled from: IdSnapshot.java */
    public enum e implements p {
        IDENTITY(1, "identity"),
        TS(2, "ts"),
        VERSION(3, "version");


        /* renamed from: d, reason: collision with root package name */
        private static final Map<String, e> f9231d = new HashMap();
        private final short e;
        private final String f;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f9231d.put(eVar.b(), eVar);
            }
        }

        public static e a(int i) {
            switch (i) {
                case 1:
                    return IDENTITY;
                case 2:
                    return TS;
                case 3:
                    return VERSION;
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
            return f9231d.get(str);
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

    public b() {
        this.m = (byte) 0;
    }

    public b(String str, long j2, int i2) {
        this();
        this.f9225a = str;
        this.f9226b = j2;
        b(true);
        this.f9227c = i2;
        c(true);
    }

    public b(b bVar) {
        this.m = (byte) 0;
        this.m = bVar.m;
        if (bVar.d()) {
            this.f9225a = bVar.f9225a;
        }
        this.f9226b = bVar.f9226b;
        this.f9227c = bVar.f9227c;
    }

    @Override // com.umeng.commonsdk.proguard.i
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public b deepCopy() {
        return new b(this);
    }

    @Override // com.umeng.commonsdk.proguard.i
    public void clear() {
        this.f9225a = null;
        b(false);
        this.f9226b = 0L;
        c(false);
        this.f9227c = 0;
    }

    public String b() {
        return this.f9225a;
    }

    public b a(String str) {
        this.f9225a = str;
        return this;
    }

    public void c() {
        this.f9225a = null;
    }

    public boolean d() {
        return this.f9225a != null;
    }

    public void a(boolean z) {
        if (z) {
            return;
        }
        this.f9225a = null;
    }

    public long e() {
        return this.f9226b;
    }

    public b a(long j2) {
        this.f9226b = j2;
        b(true);
        return this;
    }

    public void f() {
        this.m = f.b(this.m, 0);
    }

    public boolean g() {
        return f.a(this.m, 0);
    }

    public void b(boolean z) {
        this.m = f.a(this.m, 0, z);
    }

    public int h() {
        return this.f9227c;
    }

    public b a(int i2) {
        this.f9227c = i2;
        c(true);
        return this;
    }

    public void i() {
        this.m = f.b(this.m, 1);
    }

    public boolean j() {
        return f.a(this.m, 1);
    }

    public void c(boolean z) {
        this.m = f.a(this.m, 1, z);
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
        StringBuilder sb = new StringBuilder("IdSnapshot(");
        sb.append("identity:");
        if (this.f9225a == null) {
            sb.append("null");
        } else {
            sb.append(this.f9225a);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.f9226b);
        sb.append(", ");
        sb.append("version:");
        sb.append(this.f9227c);
        sb.append(")");
        return sb.toString();
    }

    public void k() throws o {
        if (this.f9225a != null) {
            return;
        }
        throw new ai("Required field 'identity' was not present! Struct: " + toString());
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
            this.m = (byte) 0;
            read(new ab(new at(objectInputStream)));
        } catch (o e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* compiled from: IdSnapshot.java */
    /* renamed from: com.umeng.commonsdk.statistics.proto.b$b, reason: collision with other inner class name */
    private static class C0399b implements aq {
        private C0399b() {
        }

        @Override // com.umeng.commonsdk.proguard.aq
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* compiled from: IdSnapshot.java */
    private static class a extends ar<b> {
        private a() {
        }

        @Override // com.umeng.commonsdk.proguard.ap
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(ah ahVar, b bVar) throws o {
            ahVar.j();
            while (true) {
                ac l = ahVar.l();
                if (l.f9012b != 0) {
                    switch (l.f9013c) {
                        case 1:
                            if (l.f9012b == 11) {
                                bVar.f9225a = ahVar.z();
                                bVar.a(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 2:
                            if (l.f9012b == 10) {
                                bVar.f9226b = ahVar.x();
                                bVar.b(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 3:
                            if (l.f9012b == 8) {
                                bVar.f9227c = ahVar.w();
                                bVar.c(true);
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
                    if (!bVar.g()) {
                        throw new ai("Required field 'ts' was not found in serialized data! Struct: " + toString());
                    }
                    if (!bVar.j()) {
                        throw new ai("Required field 'version' was not found in serialized data! Struct: " + toString());
                    }
                    bVar.k();
                    return;
                }
            }
        }

        @Override // com.umeng.commonsdk.proguard.ap
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ah ahVar, b bVar) throws o {
            bVar.k();
            ahVar.a(b.f);
            if (bVar.f9225a != null) {
                ahVar.a(b.g);
                ahVar.a(bVar.f9225a);
                ahVar.c();
            }
            ahVar.a(b.h);
            ahVar.a(bVar.f9226b);
            ahVar.c();
            ahVar.a(b.i);
            ahVar.a(bVar.f9227c);
            ahVar.c();
            ahVar.d();
            ahVar.b();
        }
    }

    /* compiled from: IdSnapshot.java */
    private static class d implements aq {
        private d() {
        }

        @Override // com.umeng.commonsdk.proguard.aq
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    /* compiled from: IdSnapshot.java */
    private static class c extends as<b> {
        private c() {
        }

        @Override // com.umeng.commonsdk.proguard.ap
        public void a(ah ahVar, b bVar) throws o {
            an anVar = (an) ahVar;
            anVar.a(bVar.f9225a);
            anVar.a(bVar.f9226b);
            anVar.a(bVar.f9227c);
        }

        @Override // com.umeng.commonsdk.proguard.ap
        public void b(ah ahVar, b bVar) throws o {
            an anVar = (an) ahVar;
            bVar.f9225a = anVar.z();
            bVar.a(true);
            bVar.f9226b = anVar.x();
            bVar.b(true);
            bVar.f9227c = anVar.w();
            bVar.c(true);
        }
    }
}
