package com.umeng.commonsdk.stateless;

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
import com.umeng.commonsdk.proguard.i;
import com.umeng.commonsdk.proguard.j;
import com.umeng.commonsdk.proguard.o;
import com.umeng.commonsdk.proguard.p;
import com.umeng.commonsdk.proguard.u;
import com.umeng.commonsdk.proguard.v;
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

/* compiled from: UMSLEnvelope.java */
/* loaded from: classes2.dex */
public class b implements i<b, e>, Serializable, Cloneable {
    private static final int A = 2;
    private static final int B = 3;
    public static final Map<e, u> k;
    private static final long l = 420342210744516016L;
    private static final am m = new am("UMSLEnvelope");
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
    private e[] D;

    /* renamed from: a, reason: collision with root package name */
    public String f9100a;

    /* renamed from: b, reason: collision with root package name */
    public String f9101b;

    /* renamed from: c, reason: collision with root package name */
    public String f9102c;

    /* renamed from: d, reason: collision with root package name */
    public int f9103d;
    public int e;
    public int f;
    public ByteBuffer g;
    public String h;
    public String i;
    public int j;

    static {
        x.put(ar.class, new C0396b());
        x.put(as.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.VERSION, (e) new u("version", (byte) 1, new v((byte) 11)));
        enumMap.put((EnumMap) e.ADDRESS, (e) new u("address", (byte) 1, new v((byte) 11)));
        enumMap.put((EnumMap) e.SIGNATURE, (e) new u(InAppPurchaseMetaData.KEY_SIGNATURE, (byte) 1, new v((byte) 11)));
        enumMap.put((EnumMap) e.SERIAL_NUM, (e) new u("serial_num", (byte) 1, new v((byte) 8)));
        enumMap.put((EnumMap) e.TS_SECS, (e) new u("ts_secs", (byte) 1, new v((byte) 8)));
        enumMap.put((EnumMap) e.LENGTH, (e) new u("length", (byte) 1, new v((byte) 8)));
        enumMap.put((EnumMap) e.ENTITY, (e) new u("entity", (byte) 1, new v((byte) 11, true)));
        enumMap.put((EnumMap) e.GUID, (e) new u(TapjoyConstants.TJC_GUID, (byte) 1, new v((byte) 11)));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new u("checksum", (byte) 1, new v((byte) 11)));
        enumMap.put((EnumMap) e.CODEX, (e) new u("codex", (byte) 2, new v((byte) 8)));
        k = Collections.unmodifiableMap(enumMap);
        u.a(b.class, k);
    }

    /* compiled from: UMSLEnvelope.java */
    public enum e implements p {
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

        private static final Map<String, e> k = new HashMap();
        private final short l;
        private final String m;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                k.put(eVar.b(), eVar);
            }
        }

        public static e a(int i) {
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

        public static e b(int i) {
            e a2 = a(i);
            if (a2 != null) {
                return a2;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        public static e a(String str) {
            return k.get(str);
        }

        e(short s, String str) {
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

    public b() {
        this.C = (byte) 0;
        this.D = new e[]{e.CODEX};
    }

    public b(String str, String str2, String str3, int i, int i2, int i3, ByteBuffer byteBuffer, String str4, String str5) {
        this();
        this.f9100a = str;
        this.f9101b = str2;
        this.f9102c = str3;
        this.f9103d = i;
        d(true);
        this.e = i2;
        e(true);
        this.f = i3;
        f(true);
        this.g = byteBuffer;
        this.h = str4;
        this.i = str5;
    }

    public b(b bVar) {
        this.C = (byte) 0;
        this.D = new e[]{e.CODEX};
        this.C = bVar.C;
        if (bVar.d()) {
            this.f9100a = bVar.f9100a;
        }
        if (bVar.g()) {
            this.f9101b = bVar.f9101b;
        }
        if (bVar.j()) {
            this.f9102c = bVar.f9102c;
        }
        this.f9103d = bVar.f9103d;
        this.e = bVar.e;
        this.f = bVar.f;
        if (bVar.w()) {
            this.g = j.d(bVar.g);
        }
        if (bVar.z()) {
            this.h = bVar.h;
        }
        if (bVar.C()) {
            this.i = bVar.i;
        }
        this.j = bVar.j;
    }

    @Override // com.umeng.commonsdk.proguard.i
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public b deepCopy() {
        return new b(this);
    }

    @Override // com.umeng.commonsdk.proguard.i
    public void clear() {
        this.f9100a = null;
        this.f9101b = null;
        this.f9102c = null;
        d(false);
        this.f9103d = 0;
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
        return this.f9100a;
    }

    public b a(String str) {
        this.f9100a = str;
        return this;
    }

    public void c() {
        this.f9100a = null;
    }

    public boolean d() {
        return this.f9100a != null;
    }

    public void a(boolean z2) {
        if (z2) {
            return;
        }
        this.f9100a = null;
    }

    public String e() {
        return this.f9101b;
    }

    public b b(String str) {
        this.f9101b = str;
        return this;
    }

    public void f() {
        this.f9101b = null;
    }

    public boolean g() {
        return this.f9101b != null;
    }

    public void b(boolean z2) {
        if (z2) {
            return;
        }
        this.f9101b = null;
    }

    public String h() {
        return this.f9102c;
    }

    public b c(String str) {
        this.f9102c = str;
        return this;
    }

    public void i() {
        this.f9102c = null;
    }

    public boolean j() {
        return this.f9102c != null;
    }

    public void c(boolean z2) {
        if (z2) {
            return;
        }
        this.f9102c = null;
    }

    public int k() {
        return this.f9103d;
    }

    public b a(int i) {
        this.f9103d = i;
        d(true);
        return this;
    }

    public void l() {
        this.C = com.umeng.commonsdk.proguard.f.b(this.C, 0);
    }

    public boolean m() {
        return com.umeng.commonsdk.proguard.f.a(this.C, 0);
    }

    public void d(boolean z2) {
        this.C = com.umeng.commonsdk.proguard.f.a(this.C, 0, z2);
    }

    public int n() {
        return this.e;
    }

    public b b(int i) {
        this.e = i;
        e(true);
        return this;
    }

    public void o() {
        this.C = com.umeng.commonsdk.proguard.f.b(this.C, 1);
    }

    public boolean p() {
        return com.umeng.commonsdk.proguard.f.a(this.C, 1);
    }

    public void e(boolean z2) {
        this.C = com.umeng.commonsdk.proguard.f.a(this.C, 1, z2);
    }

    public int q() {
        return this.f;
    }

    public b c(int i) {
        this.f = i;
        f(true);
        return this;
    }

    public void r() {
        this.C = com.umeng.commonsdk.proguard.f.b(this.C, 2);
    }

    public boolean s() {
        return com.umeng.commonsdk.proguard.f.a(this.C, 2);
    }

    public void f(boolean z2) {
        this.C = com.umeng.commonsdk.proguard.f.a(this.C, 2, z2);
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

    public b a(byte[] bArr) {
        a(bArr == null ? (ByteBuffer) null : ByteBuffer.wrap(bArr));
        return this;
    }

    public b a(ByteBuffer byteBuffer) {
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

    public b d(String str) {
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

    public b e(String str) {
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

    public b d(int i) {
        this.j = i;
        j(true);
        return this;
    }

    public void E() {
        this.C = com.umeng.commonsdk.proguard.f.b(this.C, 3);
    }

    public boolean F() {
        return com.umeng.commonsdk.proguard.f.a(this.C, 3);
    }

    public void j(boolean z2) {
        this.C = com.umeng.commonsdk.proguard.f.a(this.C, 3, z2);
    }

    @Override // com.umeng.commonsdk.proguard.i
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i) {
        return e.a(i);
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
        StringBuilder sb = new StringBuilder("UMSLEnvelope(");
        sb.append("version:");
        if (this.f9100a == null) {
            sb.append("null");
        } else {
            sb.append(this.f9100a);
        }
        sb.append(", ");
        sb.append("address:");
        if (this.f9101b == null) {
            sb.append("null");
        } else {
            sb.append(this.f9101b);
        }
        sb.append(", ");
        sb.append("signature:");
        if (this.f9102c == null) {
            sb.append("null");
        } else {
            sb.append(this.f9102c);
        }
        sb.append(", ");
        sb.append("serial_num:");
        sb.append(this.f9103d);
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
        if (this.f9100a == null) {
            throw new ai("Required field 'version' was not present! Struct: " + toString());
        }
        if (this.f9101b == null) {
            throw new ai("Required field 'address' was not present! Struct: " + toString());
        }
        if (this.f9102c == null) {
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
        } catch (o e2) {
            throw new IOException(e2.getMessage());
        }
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.C = (byte) 0;
            read(new ab(new at(objectInputStream)));
        } catch (o e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* compiled from: UMSLEnvelope.java */
    /* renamed from: com.umeng.commonsdk.stateless.b$b, reason: collision with other inner class name */
    private static class C0396b implements aq {
        private C0396b() {
        }

        @Override // com.umeng.commonsdk.proguard.aq
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* compiled from: UMSLEnvelope.java */
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
                                bVar.f9100a = ahVar.z();
                                bVar.a(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 2:
                            if (l.f9012b == 11) {
                                bVar.f9101b = ahVar.z();
                                bVar.b(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 3:
                            if (l.f9012b == 11) {
                                bVar.f9102c = ahVar.z();
                                bVar.c(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 4:
                            if (l.f9012b == 8) {
                                bVar.f9103d = ahVar.w();
                                bVar.d(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 5:
                            if (l.f9012b == 8) {
                                bVar.e = ahVar.w();
                                bVar.e(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 6:
                            if (l.f9012b == 8) {
                                bVar.f = ahVar.w();
                                bVar.f(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 7:
                            if (l.f9012b == 11) {
                                bVar.g = ahVar.A();
                                bVar.g(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 8:
                            if (l.f9012b == 11) {
                                bVar.h = ahVar.z();
                                bVar.h(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 9:
                            if (l.f9012b == 11) {
                                bVar.i = ahVar.z();
                                bVar.i(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 10:
                            if (l.f9012b == 8) {
                                bVar.j = ahVar.w();
                                bVar.j(true);
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
                    if (!bVar.m()) {
                        throw new ai("Required field 'serial_num' was not found in serialized data! Struct: " + toString());
                    }
                    if (!bVar.p()) {
                        throw new ai("Required field 'ts_secs' was not found in serialized data! Struct: " + toString());
                    }
                    if (!bVar.s()) {
                        throw new ai("Required field 'length' was not found in serialized data! Struct: " + toString());
                    }
                    bVar.G();
                    return;
                }
            }
        }

        @Override // com.umeng.commonsdk.proguard.ap
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ah ahVar, b bVar) throws o {
            bVar.G();
            ahVar.a(b.m);
            if (bVar.f9100a != null) {
                ahVar.a(b.n);
                ahVar.a(bVar.f9100a);
                ahVar.c();
            }
            if (bVar.f9101b != null) {
                ahVar.a(b.o);
                ahVar.a(bVar.f9101b);
                ahVar.c();
            }
            if (bVar.f9102c != null) {
                ahVar.a(b.p);
                ahVar.a(bVar.f9102c);
                ahVar.c();
            }
            ahVar.a(b.q);
            ahVar.a(bVar.f9103d);
            ahVar.c();
            ahVar.a(b.r);
            ahVar.a(bVar.e);
            ahVar.c();
            ahVar.a(b.s);
            ahVar.a(bVar.f);
            ahVar.c();
            if (bVar.g != null) {
                ahVar.a(b.t);
                ahVar.a(bVar.g);
                ahVar.c();
            }
            if (bVar.h != null) {
                ahVar.a(b.u);
                ahVar.a(bVar.h);
                ahVar.c();
            }
            if (bVar.i != null) {
                ahVar.a(b.v);
                ahVar.a(bVar.i);
                ahVar.c();
            }
            if (bVar.F()) {
                ahVar.a(b.w);
                ahVar.a(bVar.j);
                ahVar.c();
            }
            ahVar.d();
            ahVar.b();
        }
    }

    /* compiled from: UMSLEnvelope.java */
    private static class d implements aq {
        private d() {
        }

        @Override // com.umeng.commonsdk.proguard.aq
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    /* compiled from: UMSLEnvelope.java */
    private static class c extends as<b> {
        private c() {
        }

        @Override // com.umeng.commonsdk.proguard.ap
        public void a(ah ahVar, b bVar) throws o {
            an anVar = (an) ahVar;
            anVar.a(bVar.f9100a);
            anVar.a(bVar.f9101b);
            anVar.a(bVar.f9102c);
            anVar.a(bVar.f9103d);
            anVar.a(bVar.e);
            anVar.a(bVar.f);
            anVar.a(bVar.g);
            anVar.a(bVar.h);
            anVar.a(bVar.i);
            BitSet bitSet = new BitSet();
            if (bVar.F()) {
                bitSet.set(0);
            }
            anVar.a(bitSet, 1);
            if (bVar.F()) {
                anVar.a(bVar.j);
            }
        }

        @Override // com.umeng.commonsdk.proguard.ap
        public void b(ah ahVar, b bVar) throws o {
            an anVar = (an) ahVar;
            bVar.f9100a = anVar.z();
            bVar.a(true);
            bVar.f9101b = anVar.z();
            bVar.b(true);
            bVar.f9102c = anVar.z();
            bVar.c(true);
            bVar.f9103d = anVar.w();
            bVar.d(true);
            bVar.e = anVar.w();
            bVar.e(true);
            bVar.f = anVar.w();
            bVar.f(true);
            bVar.g = anVar.A();
            bVar.g(true);
            bVar.h = anVar.z();
            bVar.h(true);
            bVar.i = anVar.z();
            bVar.i(true);
            if (anVar.b(1).get(0)) {
                bVar.j = anVar.w();
                bVar.j(true);
            }
        }
    }
}
