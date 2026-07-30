package a2;

import C4.p;
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

/* loaded from: classes.dex */
public final class f implements X1.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f3087f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final X1.c f3088g = new X1.c("key", p.n(p.m(e.class, new C0172a(1))));

    /* renamed from: h, reason: collision with root package name */
    public static final X1.c f3089h = new X1.c("value", p.n(p.m(e.class, new C0172a(2))));

    /* renamed from: i, reason: collision with root package name */
    public static final Z1.a f3090i = new Z1.a(1);

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f3091a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3092b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3093c;

    /* renamed from: d, reason: collision with root package name */
    public final X1.d f3094d;

    /* renamed from: e, reason: collision with root package name */
    public final h f3095e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, X1.d dVar) {
        this.f3091a = byteArrayOutputStream;
        this.f3092b = hashMap;
        this.f3093c = hashMap2;
        this.f3094d = dVar;
    }

    public static int g(X1.c cVar) {
        e eVar = (e) ((Annotation) cVar.f2856b.get(e.class));
        if (eVar != null) {
            return ((C0172a) eVar).f3083a;
        }
        throw new X1.b("Field has no @Protobuf config");
    }

    @Override // X1.e
    public final X1.e a(X1.c cVar, int i2) {
        c(cVar, i2, true);
        return this;
    }

    @Override // X1.e
    public final X1.e b(X1.c cVar, long j) {
        if (j == 0) {
            return this;
        }
        e eVar = (e) ((Annotation) cVar.f2856b.get(e.class));
        if (eVar == null) {
            throw new X1.b("Field has no @Protobuf config");
        }
        h(((C0172a) eVar).f3083a << 3);
        i(j);
        return this;
    }

    public final void c(X1.c cVar, int i2, boolean z7) {
        if (z7 && i2 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f2856b.get(e.class));
        if (eVar == null) {
            throw new X1.b("Field has no @Protobuf config");
        }
        h(((C0172a) eVar).f3083a << 3);
        h(i2);
    }

    public final void d(X1.c cVar, Object obj, boolean z7) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z7 && charSequence.length() == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f3087f);
            h(bytes.length);
            this.f3091a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                d(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                f(f3090i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z7 && doubleValue == 0.0d) {
                return;
            }
            h((g(cVar) << 3) | 1);
            this.f3091a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z7 && floatValue == 0.0f) {
                return;
            }
            h((g(cVar) << 3) | 5);
            this.f3091a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z7 && longValue == 0) {
                return;
            }
            e eVar = (e) ((Annotation) cVar.f2856b.get(e.class));
            if (eVar == null) {
                throw new X1.b("Field has no @Protobuf config");
            }
            h(((C0172a) eVar).f3083a << 3);
            i(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            c(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z7);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z7 && bArr.length == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            h(bArr.length);
            this.f3091a.write(bArr);
            return;
        }
        X1.d dVar = (X1.d) this.f3092b.get(obj.getClass());
        if (dVar != null) {
            f(dVar, cVar, obj, z7);
            return;
        }
        X1.f fVar = (X1.f) this.f3093c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.f3095e;
            hVar.f3097a = false;
            hVar.f3099c = cVar;
            hVar.f3098b = z7;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof InterfaceC0174c) {
            c(cVar, ((InterfaceC0174c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            c(cVar, ((Enum) obj).ordinal(), true);
        } else {
            f(this.f3094d, cVar, obj, z7);
        }
    }

    @Override // X1.e
    public final X1.e e(X1.c cVar, Object obj) {
        d(cVar, obj, true);
        return this;
    }

    public final void f(X1.d dVar, X1.c cVar, Object obj, boolean z7) {
        C0173b c0173b = new C0173b();
        c0173b.f3084d = 0L;
        try {
            OutputStream outputStream = this.f3091a;
            this.f3091a = c0173b;
            try {
                dVar.a(obj, this);
                this.f3091a = outputStream;
                long j = c0173b.f3084d;
                c0173b.close();
                if (z7 && j == 0) {
                    return;
                }
                h((g(cVar) << 3) | 2);
                i(j);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f3091a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c0173b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void h(int i2) {
        while ((i2 & (-128)) != 0) {
            this.f3091a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.f3091a.write(i2 & 127);
    }

    public final void i(long j) {
        while (((-128) & j) != 0) {
            this.f3091a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f3091a.write(((int) j) & 127);
    }
}
