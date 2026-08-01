package s8;

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

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f implements p8.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f9155f = Charset.forName("UTF-8");
    public static final p8.c g = new p8.c("key", v4.a.s(v4.a.r(e.class, new a(1))));

    /* renamed from: h, reason: collision with root package name */
    public static final p8.c f9156h = new p8.c("value", v4.a.s(v4.a.r(e.class, new a(2))));

    /* renamed from: i, reason: collision with root package name */
    public static final r8.a f9157i = new r8.a(1);

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f9158a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f9159b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f9160c;

    /* renamed from: d, reason: collision with root package name */
    public final p8.d f9161d;

    /* renamed from: e, reason: collision with root package name */
    public final h f9162e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, p8.d dVar) {
        this.f9158a = byteArrayOutputStream;
        this.f9159b = hashMap;
        this.f9160c = hashMap2;
        this.f9161d = dVar;
    }

    public static int h(p8.c cVar) {
        e eVar = (e) ((Annotation) cVar.f7690b.get(e.class));
        if (eVar != null) {
            return eVar.tag();
        }
        throw new p8.b("Field has no @Protobuf config");
    }

    @Override // p8.e
    public final p8.e a(p8.c cVar, Object obj) {
        f(cVar, obj, true);
        return this;
    }

    public final void b(p8.c cVar, int i3, boolean z10) {
        if (z10 && i3 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f7690b.get(e.class));
        if (eVar == null) {
            throw new p8.b("Field has no @Protobuf config");
        }
        int ordinal = eVar.intEncoding().ordinal();
        if (ordinal == 0) {
            i(eVar.tag() << 3);
            i(i3);
        } else if (ordinal == 1) {
            i(eVar.tag() << 3);
            i((i3 << 1) ^ (i3 >> 31));
        } else {
            if (ordinal != 2) {
                return;
            }
            i((eVar.tag() << 3) | 5);
            this.f9158a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i3).array());
        }
    }

    @Override // p8.e
    public final p8.e c(p8.c cVar, long j) {
        d(cVar, j, true);
        return this;
    }

    public final void d(p8.c cVar, long j, boolean z10) {
        if (z10 && j == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f7690b.get(e.class));
        if (eVar == null) {
            throw new p8.b("Field has no @Protobuf config");
        }
        int ordinal = eVar.intEncoding().ordinal();
        if (ordinal == 0) {
            i(eVar.tag() << 3);
            j(j);
        } else if (ordinal == 1) {
            i(eVar.tag() << 3);
            j((j >> 63) ^ (j << 1));
        } else {
            if (ordinal != 2) {
                return;
            }
            i((eVar.tag() << 3) | 1);
            this.f9158a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    @Override // p8.e
    public final p8.e e(p8.c cVar, int i3) {
        b(cVar, i3, true);
        return this;
    }

    public final void f(p8.c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return;
            }
            i((h(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f9155f);
            i(bytes.length);
            this.f9158a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                f(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                g(f9157i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z10 && doubleValue == 0.0d) {
                return;
            }
            i((h(cVar) << 3) | 1);
            this.f9158a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z10 && floatValue == 0.0f) {
                return;
            }
            i((h(cVar) << 3) | 5);
            this.f9158a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            d(cVar, ((Number) obj).longValue(), z10);
            return;
        }
        if (obj instanceof Boolean) {
            b(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return;
            }
            i((h(cVar) << 3) | 2);
            i(bArr.length);
            this.f9158a.write(bArr);
            return;
        }
        p8.d dVar = (p8.d) this.f9159b.get(obj.getClass());
        if (dVar != null) {
            g(dVar, cVar, obj, z10);
            return;
        }
        p8.f fVar = (p8.f) this.f9160c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.f9162e;
            hVar.f9164a = false;
            hVar.f9166c = cVar;
            hVar.f9165b = z10;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof c) {
            b(cVar, ((c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            b(cVar, ((Enum) obj).ordinal(), true);
        } else {
            g(this.f9161d, cVar, obj, z10);
        }
    }

    public final void g(p8.d dVar, p8.c cVar, Object obj, boolean z10) {
        b bVar = new b();
        bVar.f9152d = 0L;
        try {
            OutputStream outputStream = this.f9158a;
            this.f9158a = bVar;
            try {
                dVar.a(obj, this);
                this.f9158a = outputStream;
                long j = bVar.f9152d;
                bVar.close();
                if (z10 && j == 0) {
                    return;
                }
                i((h(cVar) << 3) | 2);
                j(j);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f9158a = outputStream;
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

    public final void i(int i3) {
        while (true) {
            long j = i3 & (-128);
            OutputStream outputStream = this.f9158a;
            if (j == 0) {
                outputStream.write(i3 & 127);
                return;
            } else {
                outputStream.write((i3 & 127) | 128);
                i3 >>>= 7;
            }
        }
    }

    public final void j(long j) {
        while (true) {
            long j3 = (-128) & j;
            OutputStream outputStream = this.f9158a;
            if (j3 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }
}
