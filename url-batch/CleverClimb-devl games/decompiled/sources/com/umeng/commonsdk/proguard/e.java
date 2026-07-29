package com.umeng.commonsdk.proguard;

import com.tapjoy.TapjoyConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: UMEnvelope.java */
/* loaded from: classes2.dex */
public class e implements i<e, EnumC0395e>, Serializable, Cloneable {
    private static final int A = 2;
    private static final int B = 3;
    public static final Map<EnumC0395e, u> k;
    private static final long l = 420342210744516016L;
    private static final am m = new am("UMEnvelope");
    private static final ac n = new ac("version", (byte) 11, 1);
    private static final ac o = new ac("address", (byte) 11, 2);
    private static final ac p = new ac(InAppPurchaseMetaData.KEY_SIGNATURE, (byte) 11, 3);
    private static final ac q = new ac("serial_num", (byte) 8, 4);
    private static final ac r = new ac("ts_secs", (byte) 8, 5);
    private static final ac s = new ac("length", (byte) 8, 6);
    private static final ac t = new ac("entity", (byte) 11, 7);
    private static final ac u = new ac(TapjoyConstants.TJC_GUID, (byte) 11, 8);
    private static final ac v = new ac("checksum", (byte) 11, 9);
    private static final ac w = new ac("codex", (byte) 8, 10);
    private static final Map<Class<? extends ap>, aq> x = new HashMap();
    private static final int y = 0;
    private static final int z = 1;
    private byte C;
    private EnumC0395e[] D;

    /* renamed from: a, reason: collision with root package name */
    public String f9055a;

    /* renamed from: b, reason: collision with root package name */
    public String f9056b;

    /* renamed from: c, reason: collision with root package name */
    public String f9057c;

    /* renamed from: d, reason: collision with root package name */
    public int f9058d;
    public int e;
    public int f;
    public ByteBuffer g;
    public String h;
    public String i;
    public int j;

    static {
        x.put(ar.class, new b());
        x.put(as.class, new d());
        EnumMap enumMap = new EnumMap(EnumC0395e.class);
        enumMap.put((EnumMap) EnumC0395e.VERSION, (EnumC0395e) new u("version", (byte) 1, new v((byte) 11)));
        enumMap.put((EnumMap) EnumC0395e.ADDRESS, (EnumC0395e) new u("address", (byte) 1, new v((byte) 11)));
        enumMap.put((EnumMap) EnumC0395e.SIGNATURE, (EnumC0395e) new u(InAppPurchaseMetaData.KEY_SIGNATURE, (byte) 1, new v((byte) 11)));
        enumMap.put((EnumMap) EnumC0395e.SERIAL_NUM, (EnumC0395e) new u("serial_num", (byte) 1, new v((byte) 8)));
        enumMap.put((EnumMap) EnumC0395e.TS_SECS, (EnumC0395e) new u("ts_secs", (byte) 1, new v((byte) 8)));
        enumMap.put((EnumMap) EnumC0395e.LENGTH, (EnumC0395e) new u("length", (byte) 1, new v((byte) 8)));
        enumMap.put((EnumMap) EnumC0395e.ENTITY, (EnumC0395e) new u("entity", (byte) 1, new v((byte) 11, true)));
        enumMap.put((EnumMap) EnumC0395e.GUID, (EnumC0395e) new u(TapjoyConstants.TJC_GUID, (byte) 1, new v((byte) 11)));
        enumMap.put((EnumMap) EnumC0395e.CHECKSUM, (EnumC0395e) new u("checksum", (byte) 1, new v((byte) 11)));
        enumMap.put((EnumMap) EnumC0395e.CODEX, (EnumC0395e) new u("codex", (byte) 2, new v((byte) 8)));
        k = Collections.unmodifiableMap(enumMap);
        u.a(e.class, k);
    }

    /* compiled from: UMEnvelope.java */
    /* renamed from: com.umeng.commonsdk.proguard.e$e, reason: collision with other inner class name */
    public enum EnumC0395e implements p {
        VERSION(1, "version"),
        ADDRESS(2, "address"),
        SIGNATURE(3, InAppPurchaseMetaData.KEY_SIGNATURE),
        SERIAL_NUM(4, "serial_num"),
        TS_SECS(5, "ts_secs"),
        LENGTH(6, "length"),
        ENTITY(7, "entity"),
        GUID(8, TapjoyConstants.TJC_GUID),
        CHECKSUM(9, "checksum"),
        CODEX(10, "codex");

        private static final Map<String, EnumC0395e> k = new HashMap();
        private final short l;
        private final String m;

        static {
            Iterator it = EnumSet.allOf(EnumC0395e.class).iterator();
            while (it.hasNext()) {
                EnumC0395e enumC0395e = (EnumC0395e) it.next();
                k.put(enumC0395e.b(), enumC0395e);
            }
        }

        public static EnumC0395e a(int i) {
            switch (i) {
                case 1:
                    return VERSION;
                case 2:
                    return ADDRESS;
                case 3:
                    return SIGNATURE;
                case 4:
                    return SERIAL_NUM;
                case 5:
                    return TS_SECS;
                case 6:
                    return LENGTH;
                case 7:
                    return ENTITY;
                case 8:
                    return GUID;
                case 9:
                    return CHECKSUM;
                case 10:
                    return CODEX;
                default:
                    return null;
            }
        }

        public static EnumC0395e b(int i) {
            EnumC0395e a2 = a(i);
            if (a2 != null) {
                return a2;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        public static EnumC0395e a(String str) {
            return k.get(str);
        }

        EnumC0395e(short s, String str) {
            this.l = s;
            this.m = str;
        }

        @Override // com.umeng.commonsdk.proguard.p
        public short a() {
            return this.l;
        }

        @Override // com.umeng.commonsdk.proguard.p
        public String b() {
            return this.m;
        }
    }

    public e() {
        this.C = (byte) 0;
        this.D = new EnumC0395e[]{EnumC0395e.CODEX};
    }

    public e(String str, String str2, String str3, int i, int i2, int i3, ByteBuffer byteBuffer, String str4, String str5) {
        this();
        this.f9055a = str;
        this.f9056b = str2;
        this.f9057c = str3;
        this.f9058d = i;
        d(true);
        this.e = i2;
        e(true);
        this.f = i3;
        f(true);
        this.g = byteBuffer;
        this.h = str4;
        this.i = str5;
    }

    public e(e eVar) {
        this.C = (byte) 0;
        this.D = new EnumC0395e[]{EnumC0395e.CODEX};
        this.C = eVar.C;
        if (eVar.d()) {
            this.f9055a = eVar.f9055a;
        }
        if (eVar.g()) {
            this.f9056b = eVar.f9056b;
        }
        if (eVar.j()) {
            this.f9057c = eVar.f9057c;
        }
        this.f9058d = eVar.f9058d;
        this.e = eVar.e;
        this.f = eVar.f;
        if (eVar.w()) {
            this.g = j.d(eVar.g);
        }
        if (eVar.z()) {
            this.h = eVar.h;
        }
        if (eVar.C()) {
            this.i = eVar.i;
        }
        this.j = eVar.j;
    }

    @Override // com.umeng.commonsdk.proguard.i
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e deepCopy() {
        return new e(this);
    }

    @Override // com.umeng.commonsdk.proguard.i
    public void clear() {
        this.f9055a = null;
        this.f9056b = null;
        this.f9057c = null;
        d(false);
        this.f9058d = 0;
        e(false);
        this.e = 0;
        f(false);
        this.f = 0;
        this.g = null;
        this.h = null;
        this.i = null;
        j(false);
        this.j = 0;
    }

    public String b() {
        return this.f9055a;
    }

    public e a(String str) {
        this.f9055a = str;
        return this;
    }

    public void c() {
        this.f9055a = null;
    }

    public boolean d() {
        return this.f9055a != null;
    }

    public void a(boolean z2) {
        if (z2) {
            return;
        }
        this.f9055a = null;
    }

    public String e() {
        return this.f9056b;
    }

    public e b(String str) {
        this.f9056b = str;
        return this;
    }

    public void f() {
        this.f9056b = null;
    }

    public boolean g() {
        return this.f9056b != null;
    }

    public void b(boolean z2) {
        if (z2) {
            return;
        }
        this.f9056b = null;
    }

    public String h() {
        return this.f9057c;
    }

    public e c(String str) {
        this.f9057c = str;
        return this;
    }

    public void i() {
        this.f9057c = null;
    }

    public boolean j() {
        return this.f9057c != null;
    }

    public void c(boolean z2) {
        if (z2) {
            return;
        }
        this.f9057c = null;
    }

    public int k() {
        return this.f9058d;
    }

    public e a(int i) {
        this.f9058d = i;
        d(true);
        return this;
    }

    public void l() {
        this.C = f.b(this.C, 0);
    }

    public boolean m() {
        return f.a(this.C, 0);
    }

    public void d(boolean z2) {
        this.C = f.a(this.C, 0, z2);
    }

    public int n() {
        return this.e;
    }

    public e b(int i) {
        this.e = i;
        e(true);
        return this;
    }

    public void o() {
        this.C = f.b(this.C, 1);
    }

    public boolean p() {
        return f.a(this.C, 1);
    }

    public void e(boolean z2) {
        this.C = f.a(this.C, 1, z2);
    }

    public int q() {
        return this.f;
    }

    public e c(int i) {
        this.f = i;
        f(true);
        return this;
    }

    public void r() {
        this.C = f.b(this.C, 2);
    }

    public boolean s() {
        return f.a(this.C, 2);
    }

    public void f(boolean z2) {
        this.C = f.a(this.C, 2, z2);
    }

    public byte[] t() {
        a(j.c(this.g));
        if (this.g == null) {
            return null;
        }
        return this.g.array();
    }

    public ByteBuffer u() {
        return this.g;
    }

    public e a(byte[] bArr) {
        a(bArr == null ? (ByteBuffer) null : ByteBuffer.wrap(bArr));
        return this;
    }

    public e a(ByteBuffer byteBuffer) {
        this.g = byteBuffer;
        return this;
    }

    public void v() {
        this.g = null;
    }

    public boolean w() {
        return this.g != null;
    }

    public void g(boolean z2) {
        if (z2) {
            return;
        }
        this.g = null;
    }

    public String x() {
        return this.h;
    }

    public e d(String str) {
        this.h = str;
        return this;
    }

    public void y() {
        this.h = null;
    }

    public boolean z() {
        return this.h != null;
    }

    public void h(boolean z2) {
        if (z2) {
            return;
        }
        this.h = null;
    }

    public String A() {
        return this.i;
    }

    public e e(String str) {
        this.i = str;
        return this;
    }

    public void B() {
        this.i = null;
    }

    public boolean C() {
        return this.i != null;
    }

    public void i(boolean z2) {
        if (z2) {
            return;
        }
        this.i = null;
    }

    public int D() {
        return this.j;
    }

    public e d(int i) {
        this.j = i;
        j(true);
        return this;
    }

    public void E() {
        this.C = f.b(this.C, 3);
    }

    public boolean F() {
        return f.a(this.C, 3);
    }

    public void j(boolean z2) {
        this.C = f.a(this.C, 3, z2);
    }

    @Override // com.umeng.commonsdk.proguard.i
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public EnumC0395e fieldForId(int i) {
        return EnumC0395e.a(i);
    }

    @Override // com.umeng.commonsdk.proguard.i
    public void read(ah ahVar) throws o {
        x.get(ahVar.D()).b().b(ahVar, this);
    }

    @Override // com.umeng.commonsdk.proguard.i
    public void write(ah ahVar) throws o {
        x.get(ahVar.D()).b().a(ahVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UMEnvelope(");
        sb.append("version:");
        if (this.f9055a == null) {
            sb.append("null");
        } else {
            sb.append(this.f9055a);
        }
        sb.append(", ");
        sb.append("address:");
        if (this.f9056b == null) {
            sb.append("null");
        } else {
            sb.append(this.f9056b);
        }
        sb.append(", ");
        sb.append("signature:");
        if (this.f9057c == null) {
            sb.append("null");
        } else {
            sb.append(this.f9057c);
        }
        sb.append(", ");
        sb.append("serial_num:");
        sb.append(this.f9058d);
        sb.append(", ");
        sb.append("ts_secs:");
        sb.append(this.e);
        sb.append(", ");
        sb.append("length:");
        sb.append(this.f);
        sb.append(", ");
        sb.append("entity:");
        if (this.g == null) {
            sb.append("null");
        } else {
            j.a(this.g, sb);
        }
        sb.append(", ");
        sb.append("guid:");
        if (this.h == null) {
            sb.append("null");
        } else {
            sb.append(this.h);
        }
        sb.append(", ");
        sb.append("checksum:");
        if (this.i == null) {
            sb.append("null");
        } else {
            sb.append(this.i);
        }
        if (F()) {
            sb.append(", ");
            sb.append("codex:");
            sb.append(this.j);
        }
        sb.append(")");
        return sb.toString();
    }

    public void G() throws o {
        if (this.f9055a == null) {
            throw new ai("Required field 'version' was not present! Struct: " + toString());
        }
        if (this.f9056b == null) {
            throw new ai("Required field 'address' was not present! Struct: " + toString());
        }
        if (this.f9057c == null) {
            throw new ai("Required field 'signature' was not present! Struct: " + toString());
        }
        if (this.g == null) {
            throw new ai("Required field 'entity' was not present! Struct: " + toString());
        }
        if (this.h == null) {
            throw new ai("Required field 'guid' was not present! Struct: " + toString());
        }
        if (this.i != null) {
            return;
        }
        throw new ai("Required field 'checksum' was not present! Struct: " + toString());
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new ab(new at(objectOutputStream)));
        } catch (o e) {
            throw new IOException(e.getMessage());
        }
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.C = (byte) 0;
            read(new ab(new at(objectInputStream)));
        } catch (o e) {
            throw new IOException(e.getMessage());
        }
    }

    /* compiled from: UMEnvelope.java */
    private static class b implements aq {
        private b() {
        }

        @Override // com.umeng.commonsdk.proguard.aq
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* compiled from: UMEnvelope.java */
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
                                eVar.f9055a = ahVar.z();
                                eVar.a(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 2:
                            if (l.f9012b == 11) {
                                eVar.f9056b = ahVar.z();
                                eVar.b(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 3:
                            if (l.f9012b == 11) {
                                eVar.f9057c = ahVar.z();
                                eVar.c(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 4:
                            if (l.f9012b == 8) {
                                eVar.f9058d = ahVar.w();
                                eVar.d(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 5:
                            if (l.f9012b == 8) {
                                eVar.e = ahVar.w();
                                eVar.e(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 6:
                            if (l.f9012b == 8) {
                                eVar.f = ahVar.w();
                                eVar.f(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 7:
                            if (l.f9012b == 11) {
                                eVar.g = ahVar.A();
                                eVar.g(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 8:
                            if (l.f9012b == 11) {
                                eVar.h = ahVar.z();
                                eVar.h(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 9:
                            if (l.f9012b == 11) {
                                eVar.i = ahVar.z();
                                eVar.i(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 10:
                            if (l.f9012b == 8) {
                                eVar.j = ahVar.w();
                                eVar.j(true);
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
                    if (!eVar.m()) {
                        throw new ai("Required field 'serial_num' was not found in serialized data! Struct: " + toString());
                    }
                    if (!eVar.p()) {
                        throw new ai("Required field 'ts_secs' was not found in serialized data! Struct: " + toString());
                    }
                    if (!eVar.s()) {
                        throw new ai("Required field 'length' was not found in serialized data! Struct: " + toString());
                    }
                    eVar.G();
                    return;
                }
            }
        }

        @Override // com.umeng.commonsdk.proguard.ap
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ah ahVar, e eVar) throws o {
            eVar.G();
            ahVar.a(e.m);
            if (eVar.f9055a != null) {
                ahVar.a(e.n);
                ahVar.a(eVar.f9055a);
                ahVar.c();
            }
            if (eVar.f9056b != null) {
                ahVar.a(e.o);
                ahVar.a(eVar.f9056b);
                ahVar.c();
            }
            if (eVar.f9057c != null) {
                ahVar.a(e.p);
                ahVar.a(eVar.f9057c);
                ahVar.c();
            }
            ahVar.a(e.q);
            ahVar.a(eVar.f9058d);
            ahVar.c();
            ahVar.a(e.r);
            ahVar.a(eVar.e);
            ahVar.c();
            ahVar.a(e.s);
            ahVar.a(eVar.f);
            ahVar.c();
            if (eVar.g != null) {
                ahVar.a(e.t);
                ahVar.a(eVar.g);
                ahVar.c();
            }
            if (eVar.h != null) {
                ahVar.a(e.u);
                ahVar.a(eVar.h);
                ahVar.c();
            }
            if (eVar.i != null) {
                ahVar.a(e.v);
                ahVar.a(eVar.i);
                ahVar.c();
            }
            if (eVar.F()) {
                ahVar.a(e.w);
                ahVar.a(eVar.j);
                ahVar.c();
            }
            ahVar.d();
            ahVar.b();
        }
    }

    /* compiled from: UMEnvelope.java */
    private static class d implements aq {
        private d() {
        }

        @Override // com.umeng.commonsdk.proguard.aq
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    /* compiled from: UMEnvelope.java */
    private static class c extends as<e> {
        private c() {
        }

        @Override // com.umeng.commonsdk.proguard.ap
        public void a(ah ahVar, e eVar) throws o {
            an anVar = (an) ahVar;
            anVar.a(eVar.f9055a);
            anVar.a(eVar.f9056b);
            anVar.a(eVar.f9057c);
            anVar.a(eVar.f9058d);
            anVar.a(eVar.e);
            anVar.a(eVar.f);
            anVar.a(eVar.g);
            anVar.a(eVar.h);
            anVar.a(eVar.i);
            BitSet bitSet = new BitSet();
            if (eVar.F()) {
                bitSet.set(0);
            }
            anVar.a(bitSet, 1);
            if (eVar.F()) {
                anVar.a(eVar.j);
            }
        }

        @Override // com.umeng.commonsdk.proguard.ap
        public void b(ah ahVar, e eVar) throws o {
            an anVar = (an) ahVar;
            eVar.f9055a = anVar.z();
            eVar.a(true);
            eVar.f9056b = anVar.z();
            eVar.b(true);
            eVar.f9057c = anVar.z();
            eVar.c(true);
            eVar.f9058d = anVar.w();
            eVar.d(true);
            eVar.e = anVar.w();
            eVar.e(true);
            eVar.f = anVar.w();
            eVar.f(true);
            eVar.g = anVar.A();
            eVar.g(true);
            eVar.h = anVar.z();
            eVar.h(true);
            eVar.i = anVar.z();
            eVar.i(true);
            if (anVar.b(1).get(0)) {
                eVar.j = anVar.w();
                eVar.j(true);
            }
        }
    }
}
