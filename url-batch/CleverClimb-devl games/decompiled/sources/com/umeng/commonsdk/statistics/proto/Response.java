package com.umeng.commonsdk.statistics.proto;

import android.support.v4.app.NotificationCompat;
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
import com.umeng.commonsdk.proguard.z;
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

/* loaded from: classes2.dex */
public class Response implements i<Response, e>, Serializable, Cloneable {
    private static final int __RESP_CODE_ISSET_ID = 0;
    public static final Map<e, u> metaDataMap;
    private static final long serialVersionUID = -4549277923241195391L;
    private byte __isset_bitfield;
    public com.umeng.commonsdk.statistics.proto.d imprint;
    public String msg;
    private e[] optionals;
    public int resp_code;
    private static final am STRUCT_DESC = new am("Response");
    private static final ac RESP_CODE_FIELD_DESC = new ac("resp_code", (byte) 8, 1);
    private static final ac MSG_FIELD_DESC = new ac(NotificationCompat.CATEGORY_MESSAGE, (byte) 11, 2);
    private static final ac IMPRINT_FIELD_DESC = new ac(com.umeng.commonsdk.proguard.d.U, (byte) 12, 3);
    private static final Map<Class<? extends ap>, aq> schemes = new HashMap();

    static {
        schemes.put(ar.class, new b());
        schemes.put(as.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.RESP_CODE, (e) new u("resp_code", (byte) 1, new v((byte) 8)));
        enumMap.put((EnumMap) e.MSG, (e) new u(NotificationCompat.CATEGORY_MESSAGE, (byte) 2, new v((byte) 11)));
        enumMap.put((EnumMap) e.IMPRINT, (e) new u(com.umeng.commonsdk.proguard.d.U, (byte) 2, new z((byte) 12, com.umeng.commonsdk.statistics.proto.d.class)));
        metaDataMap = Collections.unmodifiableMap(enumMap);
        u.a(Response.class, metaDataMap);
    }

    public enum e implements p {
        RESP_CODE(1, "resp_code"),
        MSG(2, NotificationCompat.CATEGORY_MESSAGE),
        IMPRINT(3, com.umeng.commonsdk.proguard.d.U);


        /* renamed from: d, reason: collision with root package name */
        private static final Map<String, e> f9215d = new HashMap();
        private final short e;
        private final String f;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f9215d.put(eVar.b(), eVar);
            }
        }

        public static e a(int i) {
            switch (i) {
                case 1:
                    return RESP_CODE;
                case 2:
                    return MSG;
                case 3:
                    return IMPRINT;
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
            return f9215d.get(str);
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

    public Response() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new e[]{e.MSG, e.IMPRINT};
    }

    public Response(int i) {
        this();
        this.resp_code = i;
        setResp_codeIsSet(true);
    }

    public Response(Response response) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new e[]{e.MSG, e.IMPRINT};
        this.__isset_bitfield = response.__isset_bitfield;
        this.resp_code = response.resp_code;
        if (response.isSetMsg()) {
            this.msg = response.msg;
        }
        if (response.isSetImprint()) {
            this.imprint = new com.umeng.commonsdk.statistics.proto.d(response.imprint);
        }
    }

    @Override // com.umeng.commonsdk.proguard.i
    public i<Response, e> deepCopy() {
        return new Response(this);
    }

    @Override // com.umeng.commonsdk.proguard.i
    public void clear() {
        setResp_codeIsSet(false);
        this.resp_code = 0;
        this.msg = null;
        this.imprint = null;
    }

    public int getResp_code() {
        return this.resp_code;
    }

    public Response setResp_code(int i) {
        this.resp_code = i;
        setResp_codeIsSet(true);
        return this;
    }

    public void unsetResp_code() {
        this.__isset_bitfield = f.b(this.__isset_bitfield, 0);
    }

    public boolean isSetResp_code() {
        return f.a(this.__isset_bitfield, 0);
    }

    public void setResp_codeIsSet(boolean z) {
        this.__isset_bitfield = f.a(this.__isset_bitfield, 0, z);
    }

    public String getMsg() {
        return this.msg;
    }

    public Response setMsg(String str) {
        this.msg = str;
        return this;
    }

    public void unsetMsg() {
        this.msg = null;
    }

    public boolean isSetMsg() {
        return this.msg != null;
    }

    public void setMsgIsSet(boolean z) {
        if (z) {
            return;
        }
        this.msg = null;
    }

    public com.umeng.commonsdk.statistics.proto.d getImprint() {
        return this.imprint;
    }

    public Response setImprint(com.umeng.commonsdk.statistics.proto.d dVar) {
        this.imprint = dVar;
        return this;
    }

    public void unsetImprint() {
        this.imprint = null;
    }

    public boolean isSetImprint() {
        return this.imprint != null;
    }

    public void setImprintIsSet(boolean z) {
        if (z) {
            return;
        }
        this.imprint = null;
    }

    @Override // com.umeng.commonsdk.proguard.i
    public e fieldForId(int i) {
        return e.a(i);
    }

    @Override // com.umeng.commonsdk.proguard.i
    public void read(ah ahVar) throws o {
        schemes.get(ahVar.D()).b().b(ahVar, this);
    }

    @Override // com.umeng.commonsdk.proguard.i
    public void write(ah ahVar) throws o {
        schemes.get(ahVar.D()).b().a(ahVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Response(");
        sb.append("resp_code:");
        sb.append(this.resp_code);
        if (isSetMsg()) {
            sb.append(", ");
            sb.append("msg:");
            if (this.msg == null) {
                sb.append("null");
            } else {
                sb.append(this.msg);
            }
        }
        if (isSetImprint()) {
            sb.append(", ");
            sb.append("imprint:");
            if (this.imprint == null) {
                sb.append("null");
            } else {
                sb.append(this.imprint);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws o {
        if (this.imprint != null) {
            this.imprint.l();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new ab(new at(objectOutputStream)));
        } catch (o e2) {
            throw new IOException(e2.getMessage());
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = (byte) 0;
            read(new ab(new at(objectInputStream)));
        } catch (o e2) {
            throw new IOException(e2.getMessage());
        }
    }

    private static class b implements aq {
        private b() {
        }

        @Override // com.umeng.commonsdk.proguard.aq
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    private static class a extends ar<Response> {
        private a() {
        }

        @Override // com.umeng.commonsdk.proguard.ap
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(ah ahVar, Response response) throws o {
            ahVar.j();
            while (true) {
                ac l = ahVar.l();
                if (l.f9012b != 0) {
                    switch (l.f9013c) {
                        case 1:
                            if (l.f9012b == 8) {
                                response.resp_code = ahVar.w();
                                response.setResp_codeIsSet(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 2:
                            if (l.f9012b == 11) {
                                response.msg = ahVar.z();
                                response.setMsgIsSet(true);
                                break;
                            } else {
                                ak.a(ahVar, l.f9012b);
                                break;
                            }
                        case 3:
                            if (l.f9012b == 12) {
                                response.imprint = new com.umeng.commonsdk.statistics.proto.d();
                                response.imprint.read(ahVar);
                                response.setImprintIsSet(true);
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
                    if (!response.isSetResp_code()) {
                        throw new ai("Required field 'resp_code' was not found in serialized data! Struct: " + toString());
                    }
                    response.validate();
                    return;
                }
            }
        }

        @Override // com.umeng.commonsdk.proguard.ap
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ah ahVar, Response response) throws o {
            response.validate();
            ahVar.a(Response.STRUCT_DESC);
            ahVar.a(Response.RESP_CODE_FIELD_DESC);
            ahVar.a(response.resp_code);
            ahVar.c();
            if (response.msg != null && response.isSetMsg()) {
                ahVar.a(Response.MSG_FIELD_DESC);
                ahVar.a(response.msg);
                ahVar.c();
            }
            if (response.imprint != null && response.isSetImprint()) {
                ahVar.a(Response.IMPRINT_FIELD_DESC);
                response.imprint.write(ahVar);
                ahVar.c();
            }
            ahVar.d();
            ahVar.b();
        }
    }

    private static class d implements aq {
        private d() {
        }

        @Override // com.umeng.commonsdk.proguard.aq
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    private static class c extends as<Response> {
        private c() {
        }

        @Override // com.umeng.commonsdk.proguard.ap
        public void a(ah ahVar, Response response) throws o {
            an anVar = (an) ahVar;
            anVar.a(response.resp_code);
            BitSet bitSet = new BitSet();
            if (response.isSetMsg()) {
                bitSet.set(0);
            }
            if (response.isSetImprint()) {
                bitSet.set(1);
            }
            anVar.a(bitSet, 2);
            if (response.isSetMsg()) {
                anVar.a(response.msg);
            }
            if (response.isSetImprint()) {
                response.imprint.write(anVar);
            }
        }

        @Override // com.umeng.commonsdk.proguard.ap
        public void b(ah ahVar, Response response) throws o {
            an anVar = (an) ahVar;
            response.resp_code = anVar.w();
            response.setResp_codeIsSet(true);
            BitSet b2 = anVar.b(2);
            if (b2.get(0)) {
                response.msg = anVar.z();
                response.setMsgIsSet(true);
            }
            if (b2.get(1)) {
                response.imprint = new com.umeng.commonsdk.statistics.proto.d();
                response.imprint.read(anVar);
                response.setImprintIsSet(true);
            }
        }
    }
}
