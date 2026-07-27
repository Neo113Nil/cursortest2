package U1;

import B0.o;
import com.yandex.varioqub.config.model.ConfigValue;
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
public final class f implements R1.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f3156f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final R1.c f3157g = new R1.c("key", o.n(o.m(e.class, new a(1))));

    /* renamed from: h, reason: collision with root package name */
    public static final R1.c f3158h = new R1.c("value", o.n(o.m(e.class, new a(2))));

    /* renamed from: i, reason: collision with root package name */
    public static final T1.a f3159i = new T1.a(1);

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f3160a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3161b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3162c;

    /* renamed from: d, reason: collision with root package name */
    public final T1.a f3163d;

    /* renamed from: e, reason: collision with root package name */
    public final h f3164e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, T1.a aVar) {
        this.f3160a = byteArrayOutputStream;
        this.f3161b = hashMap;
        this.f3162c = hashMap2;
        this.f3163d = aVar;
    }

    public static int g(R1.c cVar) {
        e eVar = (e) ((Annotation) cVar.f2618b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).f3152a;
        }
        throw new R1.b("Field has no @Protobuf config");
    }

    @Override // R1.e
    public final R1.e a(R1.c cVar, Object obj) {
        c(cVar, obj, true);
        return this;
    }

    public final void b(R1.c cVar, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f2618b.get(e.class));
        if (eVar == null) {
            throw new R1.b("Field has no @Protobuf config");
        }
        h(((a) eVar).f3152a << 3);
        h(i2);
    }

    public final void c(R1.c cVar, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f3156f);
            h(bytes.length);
            this.f3160a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                c(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                f(f3159i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z && doubleValue == ConfigValue.DOUBLE_DEFAULT_VALUE) {
                return;
            }
            h((g(cVar) << 3) | 1);
            this.f3160a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z && floatValue == 0.0f) {
                return;
            }
            h((g(cVar) << 3) | 5);
            this.f3160a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z && longValue == 0) {
                return;
            }
            e eVar = (e) ((Annotation) cVar.f2618b.get(e.class));
            if (eVar == null) {
                throw new R1.b("Field has no @Protobuf config");
            }
            h(((a) eVar).f3152a << 3);
            i(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            b(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            h(bArr.length);
            this.f3160a.write(bArr);
            return;
        }
        R1.d dVar = (R1.d) this.f3161b.get(obj.getClass());
        if (dVar != null) {
            f(dVar, cVar, obj, z);
            return;
        }
        R1.f fVar = (R1.f) this.f3162c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.f3164e;
            hVar.f3166a = false;
            hVar.f3168c = cVar;
            hVar.f3167b = z;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof c) {
            b(cVar, ((c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            b(cVar, ((Enum) obj).ordinal(), true);
        } else {
            f(this.f3163d, cVar, obj, z);
        }
    }

    @Override // R1.e
    public final R1.e d(R1.c cVar, int i2) {
        b(cVar, i2, true);
        return this;
    }

    @Override // R1.e
    public final R1.e e(R1.c cVar, long j2) {
        if (j2 != 0) {
            e eVar = (e) ((Annotation) cVar.f2618b.get(e.class));
            if (eVar == null) {
                throw new R1.b("Field has no @Protobuf config");
            }
            h(((a) eVar).f3152a << 3);
            i(j2);
        }
        return this;
    }

    public final void f(R1.d dVar, R1.c cVar, Object obj, boolean z) {
        b bVar = new b();
        bVar.f3153a = 0L;
        try {
            OutputStream outputStream = this.f3160a;
            this.f3160a = bVar;
            try {
                dVar.a(obj, this);
                this.f3160a = outputStream;
                long j2 = bVar.f3153a;
                bVar.close();
                if (z && j2 == 0) {
                    return;
                }
                h((g(cVar) << 3) | 2);
                i(j2);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f3160a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void h(int i2) {
        while ((i2 & (-128)) != 0) {
            this.f3160a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.f3160a.write(i2 & 127);
    }

    public final void i(long j2) {
        while (((-128) & j2) != 0) {
            this.f3160a.write((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        this.f3160a.write(((int) j2) & 127);
    }
}
