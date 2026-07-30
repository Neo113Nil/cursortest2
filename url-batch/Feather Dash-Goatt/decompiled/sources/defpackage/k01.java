package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class k01 implements pq0 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final wx g = new wx("key", qy0.p(qy0.o(h01.class, new ga(1))));
    public static final wx h = new wx("value", qy0.p(qy0.o(h01.class, new ga(2))));
    public static final sb0 i = new sb0(1);
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final oq0 d;
    public final l01 e = new l01(this);

    public k01(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, oq0 oq0Var) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = oq0Var;
    }

    public static int h(wx wxVar) {
        h01 h01Var = (h01) ((Annotation) wxVar.b.get(h01.class));
        if (h01Var != null) {
            return h01Var.tag();
        }
        throw new wv("Field has no @Protobuf config");
    }

    @Override // defpackage.pq0
    public final pq0 a(wx wxVar, Object obj) {
        f(wxVar, obj, true);
        return this;
    }

    public final void b(wx wxVar, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        h01 h01Var = (h01) ((Annotation) wxVar.b.get(h01.class));
        if (h01Var == null) {
            throw new wv("Field has no @Protobuf config");
        }
        int ordinal = h01Var.intEncoding().ordinal();
        if (ordinal == 0) {
            i(h01Var.tag() << 3);
            i(i2);
        } else if (ordinal == 1) {
            i(h01Var.tag() << 3);
            i((i2 << 1) ^ (i2 >> 31));
        } else {
            if (ordinal != 2) {
                return;
            }
            i((h01Var.tag() << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
        }
    }

    public final void c(wx wxVar, long j, boolean z) {
        if (z && j == 0) {
            return;
        }
        h01 h01Var = (h01) ((Annotation) wxVar.b.get(h01.class));
        if (h01Var == null) {
            throw new wv("Field has no @Protobuf config");
        }
        int ordinal = h01Var.intEncoding().ordinal();
        if (ordinal == 0) {
            i(h01Var.tag() << 3);
            j(j);
        } else if (ordinal == 1) {
            i(h01Var.tag() << 3);
            j((j >> 63) ^ (j << 1));
        } else {
            if (ordinal != 2) {
                return;
            }
            i((h01Var.tag() << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    @Override // defpackage.pq0
    public final pq0 d(wx wxVar, int i2) {
        b(wxVar, i2, true);
        return this;
    }

    @Override // defpackage.pq0
    public final pq0 e(wx wxVar, long j) {
        c(wxVar, j, true);
        return this;
    }

    public final void f(wx wxVar, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            i((h(wxVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            i(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                f(wxVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                g(i, wxVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z && doubleValue == 0.0d) {
                return;
            }
            i((h(wxVar) << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z && floatValue == 0.0f) {
                return;
            }
            i((h(wxVar) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            c(wxVar, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            b(wxVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            i((h(wxVar) << 3) | 2);
            i(bArr.length);
            this.a.write(bArr);
            return;
        }
        oq0 oq0Var = (oq0) this.b.get(obj.getClass());
        if (oq0Var != null) {
            g(oq0Var, wxVar, obj, z);
            return;
        }
        em1 em1Var = (em1) this.c.get(obj.getClass());
        if (em1Var != null) {
            l01 l01Var = this.e;
            l01Var.a = false;
            l01Var.c = wxVar;
            l01Var.b = z;
            em1Var.a(obj, l01Var);
            return;
        }
        if (obj instanceof f01) {
            b(wxVar, ((f01) obj).a(), true);
        } else if (obj instanceof Enum) {
            b(wxVar, ((Enum) obj).ordinal(), true);
        } else {
            g(this.d, wxVar, obj, z);
        }
    }

    public final void g(oq0 oq0Var, wx wxVar, Object obj, boolean z) {
        ig0 ig0Var = new ig0();
        ig0Var.d = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = ig0Var;
            try {
                oq0Var.a(obj, this);
                this.a = outputStream;
                long j = ig0Var.d;
                ig0Var.close();
                if (z && j == 0) {
                    return;
                }
                i((h(wxVar) << 3) | 2);
                j(j);
                oq0Var.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                ig0Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void i(int i2) {
        while (true) {
            long j = i2 & (-128);
            OutputStream outputStream = this.a;
            if (j == 0) {
                outputStream.write(i2 & 127);
                return;
            } else {
                outputStream.write((i2 & 127) | 128);
                i2 >>>= 7;
            }
        }
    }

    public final void j(long j) {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }
}
