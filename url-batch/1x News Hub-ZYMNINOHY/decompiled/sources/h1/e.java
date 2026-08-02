package h1;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import e1.C0311b;
import e1.C0312c;
import e1.InterfaceC0313d;
import e1.InterfaceC0314e;
import e1.InterfaceC0315f;
import g1.C0332a;
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
public final class e implements InterfaceC0314e {
    public static final Charset f = Charset.forName(CharEncoding.UTF_8);

    /* renamed from: g, reason: collision with root package name */
    public static final C0312c f5058g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0312c f5059h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0332a f5060i;

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f5061a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5062b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f5063c;

    /* renamed from: d, reason: collision with root package name */
    public final C0332a f5064d;

    /* renamed from: e, reason: collision with root package name */
    public final g f5065e = new g(this);

    static {
        C0339a c0339a = new C0339a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(d.class, c0339a);
        f5058g = new C0312c("key", Collections.unmodifiableMap(new HashMap(hashMap)));
        C0339a c0339a2 = new C0339a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(d.class, c0339a2);
        f5059h = new C0312c("value", Collections.unmodifiableMap(new HashMap(hashMap2)));
        f5060i = new C0332a(1);
    }

    public e(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, C0332a c0332a) {
        this.f5061a = byteArrayOutputStream;
        this.f5062b = hashMap;
        this.f5063c = hashMap2;
        this.f5064d = c0332a;
    }

    public static int f(C0312c c0312c) {
        d dVar = (d) ((Annotation) c0312c.f4968b.get(d.class));
        if (dVar != null) {
            return ((C0339a) dVar).f5054a;
        }
        throw new C0311b("Field has no @Protobuf config");
    }

    @Override // e1.InterfaceC0314e
    public final InterfaceC0314e a(C0312c c0312c, long j3) {
        if (j3 == 0) {
            return this;
        }
        d dVar = (d) ((Annotation) c0312c.f4968b.get(d.class));
        if (dVar == null) {
            throw new C0311b("Field has no @Protobuf config");
        }
        g(((C0339a) dVar).f5054a << 3);
        h(j3);
        return this;
    }

    public final void b(C0312c c0312c, int i3, boolean z) {
        if (z && i3 == 0) {
            return;
        }
        d dVar = (d) ((Annotation) c0312c.f4968b.get(d.class));
        if (dVar == null) {
            throw new C0311b("Field has no @Protobuf config");
        }
        g(((C0339a) dVar).f5054a << 3);
        g(i3);
    }

    public final void c(C0312c c0312c, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            g((f(c0312c) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            g(bytes.length);
            this.f5061a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                c(c0312c, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                e(f5060i, c0312c, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z && doubleValue == 0.0d) {
                return;
            }
            g((f(c0312c) << 3) | 1);
            this.f5061a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z && floatValue == 0.0f) {
                return;
            }
            g((f(c0312c) << 3) | 5);
            this.f5061a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z && longValue == 0) {
                return;
            }
            d dVar = (d) ((Annotation) c0312c.f4968b.get(d.class));
            if (dVar == null) {
                throw new C0311b("Field has no @Protobuf config");
            }
            g(((C0339a) dVar).f5054a << 3);
            h(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            b(c0312c, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            g((f(c0312c) << 3) | 2);
            g(bArr.length);
            this.f5061a.write(bArr);
            return;
        }
        InterfaceC0313d interfaceC0313d = (InterfaceC0313d) this.f5062b.get(obj.getClass());
        if (interfaceC0313d != null) {
            e(interfaceC0313d, c0312c, obj, z);
            return;
        }
        InterfaceC0315f interfaceC0315f = (InterfaceC0315f) this.f5063c.get(obj.getClass());
        if (interfaceC0315f != null) {
            g gVar = this.f5065e;
            gVar.f5067a = false;
            gVar.f5069c = c0312c;
            gVar.f5068b = z;
            interfaceC0315f.a(obj, gVar);
            return;
        }
        if (obj instanceof y0.c) {
            b(c0312c, ((y0.c) obj).f10815a, true);
        } else if (obj instanceof Enum) {
            b(c0312c, ((Enum) obj).ordinal(), true);
        } else {
            e(this.f5064d, c0312c, obj, z);
        }
    }

    @Override // e1.InterfaceC0314e
    public final InterfaceC0314e d(C0312c c0312c, Object obj) {
        c(c0312c, obj, true);
        return this;
    }

    public final void e(InterfaceC0313d interfaceC0313d, C0312c c0312c, Object obj, boolean z) {
        b bVar = new b();
        bVar.f5055a = 0L;
        try {
            OutputStream outputStream = this.f5061a;
            this.f5061a = bVar;
            try {
                interfaceC0313d.a(obj, this);
                this.f5061a = outputStream;
                long j3 = bVar.f5055a;
                bVar.close();
                if (z && j3 == 0) {
                    return;
                }
                g((f(c0312c) << 3) | 2);
                h(j3);
                interfaceC0313d.a(obj, this);
            } catch (Throwable th) {
                this.f5061a = outputStream;
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

    public final void g(int i3) {
        while ((i3 & (-128)) != 0) {
            this.f5061a.write((i3 & 127) | 128);
            i3 >>>= 7;
        }
        this.f5061a.write(i3 & 127);
    }

    public final void h(long j3) {
        while (((-128) & j3) != 0) {
            this.f5061a.write((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        this.f5061a.write(((int) j3) & 127);
    }
}
