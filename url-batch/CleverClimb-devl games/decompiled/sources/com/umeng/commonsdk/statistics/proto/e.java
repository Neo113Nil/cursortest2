package com.umeng.commonsdk.statistics.proto;

import com.tapjoy.TapjoyConstants;
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

/* compiled from: ImprintValue.java */
/* loaded from: classes2.dex */
public class e implements i<e, EnumC0402e>, Serializable, Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public static final Map<EnumC0402e, u> f9248d;
    private static final long e = 7501688097813630241L;
    private static final am f = new am("ImprintValue");
    private static final ac g = new ac("value", (byte) 11, 1);
    private static final ac h = new ac("ts", (byte) 10, 2);
    private static final ac i = new ac(TapjoyConstants.TJC_GUID, (byte) 11, 3);
    private static final Map<Class<? extends ap>, aq> j = new HashMap();
    private static final int k = 0;

    /* renamed from: a, reason: collision with root package name */
    public String f9249a;

    /* renamed from: b, reason: collision with root package name */
    public long f9250b;

    /* renamed from: c, reason: collision with root package name */
    public String f9251c;
    private byte l;
    private EnumC0402e[] m;

    static {
        j.put(ar.class, new b());
        j.put(as.class, new d());
        EnumMap enumMap = new EnumMap(EnumC0402e.class);
        enumMap.put((EnumMap) EnumC0402e.VALUE, (EnumC0402e) new u("value", (byte) 2, new v((byte) 11)));
        enumMap.put((EnumMap) EnumC0402e.TS, (EnumC0402e) new u("ts", (byte) 1, new v((byte) 10)));
        enumMap.put((EnumMap) EnumC0402e.GUID, (EnumC0402e) new u(TapjoyConstants.TJC_GUID, (byte) 1, new v((byte) 11)));
        f9248d = Collections.unmodifiableMap(enumMap);
        u.a(e.class, f9248d);
    }

    /* compiled from: ImprintValue.java */
    /* renamed from: com.umeng.commonsdk.statistics.proto.e$e, reason: collision with other inner class name */
    public enum EnumC0402e implements p {
        VALUE(1, "value"),
        TS(2, "ts"),
        GUID(3, TapjoyConstants.TJC_GUID);


        /* renamed from: d, reason: collision with root package name */
        private static final Map<String, EnumC0402e> f9255d = new HashMap();
        private final short e;
        private final String f;

        static {
            Iterator it = EnumSet.allOf(EnumC0402e.class).iterator();
            while (it.hasNext()) {
                EnumC0402e enumC0402e = (EnumC0402e) it.next();
                f9255d.put(enumC0402e.b(), enumC0402e);
            }
        }

        public static EnumC0402e a(int i) {
            switch (i) {
                case 1:
                    return VALUE;
                case 2:
                    return TS;
                case 3:
                    return GUID;
                default:
                    return null;
            }
        }

        public static EnumC0402e b(int i) {
            EnumC0402e a2 = a(i);
            if (a2 != null) {
                return a2;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        public static EnumC0402e a(String str) {
            return f9255d.get(str);
        }

        EnumC0402e(short s, String str) {
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

    public e() {
        this.l = (byte) 0;
        this.m = new EnumC0402e[]{EnumC0402e.VALUE};
    }

    public e(long j2, String str) {
        this();
        this.f9250b = j2;
        b(true);
        this.f9251c = str;
    }

    public e(e eVar) {
        this.l = (byte) 0;
        this.m = new EnumC0402e[]{EnumC0402e.VALUE};
        this.l = eVar.l;
        if (eVar.d()) {
            this.f9249a = eVar.f9249a;
        }
        this.f9250b = eVar.f9250b;
        if (eVar.j()) {
            this.f9251c = eVar.f9251c;
        }
    }

    @Override // com.umeng.commonsdk.proguard.i
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e deepCopy() {
        return new e(this);
    }

    @Override // com.umeng.commonsdk.proguard.i
    public void clear() {
        this.f9249a = null;
        b(false);
        this.f9250b = 0L;
        this.f9251c = null;
    }

    public String b() {
        return this.f9249a;
    }

    public e a(String str) {
        this.f9249a = str;
        return this;
    }

    public void c() {
        this.f9249a = null;
    }

    public boolean d() {
        return this.f9249a != null;
    }

    public void a(boolean z) {
        if (z) {
            return;
        }
        this.f9249a = null;
    }

    public long e() {
        return this.f9250b;
    }

    public e a(long j2) {
        this.f9250b = j2;
        b(true);
        return this;
    }

    public void f() {
        this.l = f.b(this.l, 0);
    }

    public boolean g() {
        return f.a(this.l, 0);
    }

    public void b(boolean z) {
        this.l = f.a(this.l, 0, z);
    }

    public String h() {
        return this.f9251c;
    }

    public e b(String str) {
        this.f9251c = str;
        return this;
    }

    public void i() {
        this.f9251c = null;
    }

    public boolean j() {
        return this.f9251c != null;
    }

    public void c(boolean z) {
        if (z) {
            return;
        }
        this.f9251c = null;
    }

    @Override // com.umeng.commonsdk.proguard.i
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public EnumC0402e fieldForId(int i2) {
        return EnumC0402e.a(i2);
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
        boolean z;
        StringBuilder sb = new StringBuilder("ImprintValue(");
        if (d()) {
            sb.append("value:");
            if (this.f9249a == null) {
                sb.append("null");
            } else {
                sb.append(this.f9249a);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("ts:");
        sb.append(this.f9250b);
        sb.append(", ");
        sb.append("guid:");
        if (this.f9251c == null) {
            sb.append("null");
        } else {
            sb.append(this.f9251c);
        }
        sb.append(")");
        return sb.toString();
    }

    public void k() throws o {
        if (this.f9251c != null) {
            return;
        }
        throw new ai("Required field 'guid' was not present! Struct: " + toString());
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

    /* compiled from: ImprintValue.java */
    private static class b implements aq {
        private b() {
        }

        @Override // com.umeng.commonsdk.proguard.aq
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* compiled from: ImprintValue.java */
    private static class a extends ar<e> {
        private a() {
        }

        @Override // com.umeng.commonsdk.proguard.ap
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(ah ahVar, e eVar) throws o {
            ahVar.j();
            while (true) {
                ac l = ahVar.l();
                if (l.f9012b != 0) {
                    switch (l.f9013c) {
                        case 1:
                            if (l.f9012b == 11) {
                                eVar.f9249a = ahVar.z();
                                eVar.a(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 2:
                            if (l.f9012b == 10) {
                                eVar.f9250b = ahVar.x();
                                eVar.b(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 3:
                            if (l.f9012b == 11) {
                                eVar.f9251c = ahVar.z();
                                eVar.c(true);
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
                    if (!eVar.g()) {
                        throw new ai("Required field 'ts' was not found in serialized data! Struct: " + toString());
                    }
                    eVar.k();
                    return;
                }
            }
        }

        @Override // com.umeng.commonsdk.proguard.ap
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ah ahVar, e eVar) throws o {
            eVar.k();
            ahVar.a(e.f);
            if (eVar.f9249a != null && eVar.d()) {
                ahVar.a(e.g);
                ahVar.a(eVar.f9249a);
                ahVar.c();
            }
            ahVar.a(e.h);
            ahVar.a(eVar.f9250b);
            ahVar.c();
            if (eVar.f9251c != null) {
                ahVar.a(e.i);
                ahVar.a(eVar.f9251c);
                ahVar.c();
            }
            ahVar.d();
            ahVar.b();
        }
    }

    /* compiled from: ImprintValue.java */
    private static class d implements aq {
        private d() {
        }

        @Override // com.umeng.commonsdk.proguard.aq
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    /* compiled from: ImprintValue.java */
    private static class c extends as<e> {
        private c() {
        }

        @Override // com.umeng.commonsdk.proguard.ap
        public void a(ah ahVar, e eVar) throws o {
            an anVar = (an) ahVar;
            anVar.a(eVar.f9250b);
            anVar.a(eVar.f9251c);
            BitSet bitSet = new BitSet();
            if (eVar.d()) {
                bitSet.set(0);
            }
            anVar.a(bitSet, 1);
            if (eVar.d()) {
                anVar.a(eVar.f9249a);
            }
        }

        @Override // com.umeng.commonsdk.proguard.ap
        public void b(ah ahVar, e eVar) throws o {
            an anVar = (an) ahVar;
            eVar.f9250b = anVar.x();
            eVar.b(true);
            eVar.f9251c = anVar.z();
            eVar.c(true);
            if (anVar.b(1).get(0)) {
                eVar.f9249a = anVar.z();
                eVar.a(true);
            }
        }
    }
}
