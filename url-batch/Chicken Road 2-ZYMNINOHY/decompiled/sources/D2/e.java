package D2;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements A2.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f357f = Charset.forName(CharEncoding.UTF_8);

    /* renamed from: g, reason: collision with root package name */
    public static final A2.c f358g;

    /* renamed from: h, reason: collision with root package name */
    public static final A2.c f359h;

    /* renamed from: i, reason: collision with root package name */
    public static final C2.a f360i;

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f361a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f362b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f363c;

    /* renamed from: d, reason: collision with root package name */
    public final A2.d f364d;

    /* renamed from: e, reason: collision with root package name */
    public final g f365e = new g(this);

    static {
        a aVar = new a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(d.class, aVar);
        f358g = new A2.c("key", Collections.unmodifiableMap(new HashMap(hashMap)));
        a aVar2 = new a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(d.class, aVar2);
        f359h = new A2.c("value", Collections.unmodifiableMap(new HashMap(hashMap2)));
        f360i = new C2.a(1);
    }

    public e(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, A2.d dVar) {
        this.f361a = byteArrayOutputStream;
        this.f362b = hashMap;
        this.f363c = hashMap2;
        this.f364d = dVar;
    }

    public static int f(A2.c cVar) {
        d dVar = (d) ((Annotation) cVar.f67b.get(d.class));
        if (dVar != null) {
            return ((a) dVar).f353a;
        }
        throw new A2.b("Field has no @Protobuf config");
    }

    @Override // A2.e
    public final A2.e a(A2.c cVar, Object obj) {
        d(cVar, obj, true);
        return this;
    }

    @Override // A2.e
    public final A2.e b(A2.c cVar, long j4) {
        if (j4 == 0) {
            return this;
        }
        d dVar = (d) ((Annotation) cVar.f67b.get(d.class));
        if (dVar == null) {
            throw new A2.b("Field has no @Protobuf config");
        }
        g(((a) dVar).f353a << 3);
        h(j4);
        return this;
    }

    public final void c(A2.c cVar, int i4, boolean z) {
        if (z && i4 == 0) {
            return;
        }
        d dVar = (d) ((Annotation) cVar.f67b.get(d.class));
        if (dVar == null) {
            throw new A2.b("Field has no @Protobuf config");
        }
        g(((a) dVar).f353a << 3);
        g(i4);
    }

    public final void d(A2.c cVar, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            g((f(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f357f);
            g(bytes.length);
            this.f361a.write(bytes);
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
                e(f360i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z && doubleValue == 0.0d) {
                return;
            }
            g((f(cVar) << 3) | 1);
            this.f361a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z && floatValue == 0.0f) {
                return;
            }
            g((f(cVar) << 3) | 5);
            this.f361a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z && longValue == 0) {
                return;
            }
            d dVar = (d) ((Annotation) cVar.f67b.get(d.class));
            if (dVar == null) {
                throw new A2.b("Field has no @Protobuf config");
            }
            g(((a) dVar).f353a << 3);
            h(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            c(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            g((f(cVar) << 3) | 2);
            g(bArr.length);
            this.f361a.write(bArr);
            return;
        }
        A2.d dVar2 = (A2.d) this.f362b.get(obj.getClass());
        if (dVar2 != null) {
            e(dVar2, cVar, obj, z);
            return;
        }
        A2.f fVar = (A2.f) this.f363c.get(obj.getClass());
        if (fVar != null) {
            g gVar = this.f365e;
            gVar.f367a = false;
            gVar.f369c = cVar;
            gVar.f368b = z;
            fVar.a(obj, gVar);
            return;
        }
        if (obj instanceof O1.c) {
            c(cVar, ((O1.c) obj).f2022a, true);
        } else if (obj instanceof Enum) {
            c(cVar, ((Enum) obj).ordinal(), true);
        } else {
            e(this.f364d, cVar, obj, z);
        }
    }

    public final void e(A2.d dVar, A2.c cVar, Object obj, boolean z) {
        b bVar = new b();
        bVar.f354a = 0L;
        try {
            OutputStream outputStream = this.f361a;
            this.f361a = bVar;
            try {
                dVar.a(obj, this);
                this.f361a = outputStream;
                long j4 = bVar.f354a;
                bVar.close();
                if (z && j4 == 0) {
                    return;
                }
                g((f(cVar) << 3) | 2);
                h(j4);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f361a = outputStream;
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

    public final void g(int i4) {
        while ((i4 & (-128)) != 0) {
            this.f361a.write((i4 & 127) | 128);
            i4 >>>= 7;
        }
        this.f361a.write(i4 & 127);
    }

    public final void h(long j4) {
        while (((-128) & j4) != 0) {
            this.f361a.write((((int) j4) & 127) | 128);
            j4 >>>= 7;
        }
        this.f361a.write(((int) j4) & 127);
    }
}
