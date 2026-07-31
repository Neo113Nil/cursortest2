package w1;

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
import t1.C0655b;
import t1.C0656c;
import t1.InterfaceC0657d;
import t1.InterfaceC0658e;
import t1.InterfaceC0659f;
import v1.C0703a;

/* loaded from: classes.dex */
public final class f implements InterfaceC0658e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f6182f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final C0656c f6183g = new C0656c("key", C1.c.j(C1.c.i(e.class, new C0713a(1))));

    /* renamed from: h, reason: collision with root package name */
    public static final C0656c f6184h = new C0656c("value", C1.c.j(C1.c.i(e.class, new C0713a(2))));

    /* renamed from: i, reason: collision with root package name */
    public static final C0703a f6185i = new C0703a(1);

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f6186a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6187b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f6188c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0657d f6189d;

    /* renamed from: e, reason: collision with root package name */
    public final h f6190e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, InterfaceC0657d interfaceC0657d) {
        this.f6186a = byteArrayOutputStream;
        this.f6187b = hashMap;
        this.f6188c = hashMap2;
        this.f6189d = interfaceC0657d;
    }

    public static int g(C0656c c0656c) {
        e eVar = (e) ((Annotation) c0656c.f5959b.get(e.class));
        if (eVar != null) {
            return ((C0713a) eVar).f6178a;
        }
        throw new C0655b("Field has no @Protobuf config");
    }

    @Override // t1.InterfaceC0658e
    public final InterfaceC0658e a(C0656c c0656c, Object obj) {
        c(c0656c, obj, true);
        return this;
    }

    public final void b(C0656c c0656c, int i7, boolean z5) {
        if (z5 && i7 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) c0656c.f5959b.get(e.class));
        if (eVar == null) {
            throw new C0655b("Field has no @Protobuf config");
        }
        h(((C0713a) eVar).f6178a << 3);
        h(i7);
    }

    public final void c(C0656c c0656c, Object obj, boolean z5) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z5 && charSequence.length() == 0) {
                return;
            }
            h((g(c0656c) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f6182f);
            h(bytes.length);
            this.f6186a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                c(c0656c, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                f(f6185i, c0656c, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z5 && doubleValue == 0.0d) {
                return;
            }
            h((g(c0656c) << 3) | 1);
            this.f6186a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z5 && floatValue == 0.0f) {
                return;
            }
            h((g(c0656c) << 3) | 5);
            this.f6186a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z5 && longValue == 0) {
                return;
            }
            e eVar = (e) ((Annotation) c0656c.f5959b.get(e.class));
            if (eVar == null) {
                throw new C0655b("Field has no @Protobuf config");
            }
            h(((C0713a) eVar).f6178a << 3);
            i(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            b(c0656c, ((Boolean) obj).booleanValue() ? 1 : 0, z5);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z5 && bArr.length == 0) {
                return;
            }
            h((g(c0656c) << 3) | 2);
            h(bArr.length);
            this.f6186a.write(bArr);
            return;
        }
        InterfaceC0657d interfaceC0657d = (InterfaceC0657d) this.f6187b.get(obj.getClass());
        if (interfaceC0657d != null) {
            f(interfaceC0657d, c0656c, obj, z5);
            return;
        }
        InterfaceC0659f interfaceC0659f = (InterfaceC0659f) this.f6188c.get(obj.getClass());
        if (interfaceC0659f != null) {
            h hVar = this.f6190e;
            hVar.f6192a = false;
            hVar.f6194c = c0656c;
            hVar.f6193b = z5;
            interfaceC0659f.a(obj, hVar);
            return;
        }
        if (obj instanceof InterfaceC0715c) {
            b(c0656c, ((InterfaceC0715c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            b(c0656c, ((Enum) obj).ordinal(), true);
        } else {
            f(this.f6189d, c0656c, obj, z5);
        }
    }

    @Override // t1.InterfaceC0658e
    public final InterfaceC0658e d(C0656c c0656c, int i7) {
        b(c0656c, i7, true);
        return this;
    }

    @Override // t1.InterfaceC0658e
    public final InterfaceC0658e e(C0656c c0656c, long j4) {
        if (j4 == 0) {
            return this;
        }
        e eVar = (e) ((Annotation) c0656c.f5959b.get(e.class));
        if (eVar == null) {
            throw new C0655b("Field has no @Protobuf config");
        }
        h(((C0713a) eVar).f6178a << 3);
        i(j4);
        return this;
    }

    public final void f(InterfaceC0657d interfaceC0657d, C0656c c0656c, Object obj, boolean z5) {
        C0714b c0714b = new C0714b();
        c0714b.f6179f = 0L;
        try {
            OutputStream outputStream = this.f6186a;
            this.f6186a = c0714b;
            try {
                interfaceC0657d.a(obj, this);
                this.f6186a = outputStream;
                long j4 = c0714b.f6179f;
                c0714b.close();
                if (z5 && j4 == 0) {
                    return;
                }
                h((g(c0656c) << 3) | 2);
                i(j4);
                interfaceC0657d.a(obj, this);
            } catch (Throwable th) {
                this.f6186a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c0714b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void h(int i7) {
        while ((i7 & (-128)) != 0) {
            this.f6186a.write((i7 & 127) | 128);
            i7 >>>= 7;
        }
        this.f6186a.write(i7 & 127);
    }

    public final void i(long j4) {
        while (((-128) & j4) != 0) {
            this.f6186a.write((((int) j4) & 127) | 128);
            j4 >>>= 7;
        }
        this.f6186a.write(((int) j4) & 127);
    }
}
