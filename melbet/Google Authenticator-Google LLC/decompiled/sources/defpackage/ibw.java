package defpackage;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ibw implements ibh {
    public static final ibf a;
    public static final ibf b;
    private static final Charset d = Charset.forName("UTF-8");
    private static final ibg e;
    public final Map c;
    private OutputStream f;
    private final Map g;
    private final ibg h;
    private final iby i = new iby(this);

    static {
        jed jedVar = new jed("key");
        jxh jxhVar = new jxh((byte[]) null);
        jxhVar.a = 1;
        jedVar.b(jxhVar.d());
        a = jedVar.a();
        jed jedVar2 = new jed("value");
        jxh jxhVar2 = new jxh((byte[]) null);
        jxhVar2.a = 2;
        jedVar2.b(jxhVar2.d());
        b = jedVar2.a();
        e = new ibv(0);
    }

    public ibw(OutputStream outputStream, Map map, Map map2, ibg ibgVar) {
        this.f = outputStream;
        this.c = map;
        this.g = map2;
        this.h = ibgVar;
    }

    private static int f(ibf ibfVar) {
        ibu ibuVar = (ibu) ibfVar.b(ibu.class);
        if (ibuVar != null) {
            return ibuVar.a();
        }
        throw new ibe("Field has no @Protobuf config");
    }

    private static ibu g(ibf ibfVar) {
        ibu ibuVar = (ibu) ibfVar.b(ibu.class);
        if (ibuVar != null) {
            return ibuVar;
        }
        throw new ibe("Field has no @Protobuf config");
    }

    private static ByteBuffer h(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void i(int i) {
        while (true) {
            long j = i & (-128);
            int i2 = i & 127;
            OutputStream outputStream = this.f;
            if (j == 0) {
                outputStream.write(i2);
                return;
            } else {
                outputStream.write(i2 | 128);
                i >>>= 7;
            }
        }
    }

    private final void j(long j) {
        while (true) {
            long j2 = (-128) & j;
            int i = ((int) j) & 127;
            OutputStream outputStream = this.f;
            if (j2 == 0) {
                outputStream.write(i);
                return;
            } else {
                outputStream.write(i | 128);
                j >>>= 7;
            }
        }
    }

    private final void k(ibg ibgVar, ibf ibfVar, Object obj, boolean z) {
        ibr ibrVar = new ibr();
        try {
            OutputStream outputStream = this.f;
            this.f = ibrVar;
            try {
                ibgVar.a(obj, this);
                this.f = outputStream;
                long j = ibrVar.a;
                ibrVar.close();
                if (z && j == 0) {
                    return;
                }
                i((f(ibfVar) << 3) | 2);
                j(j);
                ibgVar.a(obj, this);
            } catch (Throwable th) {
                this.f = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                ibrVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // defpackage.ibh
    public final /* synthetic */ void a(ibf ibfVar, long j) {
        d(ibfVar, j, true);
    }

    @Override // defpackage.ibh
    public final void b(ibf ibfVar, Object obj) {
        e(ibfVar, obj, true);
    }

    final void c(ibf ibfVar, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        ibu g = g(ibfVar);
        int ordinal = g.b().ordinal();
        if (ordinal == 0) {
            i(g.a() << 3);
            i(i);
        } else if (ordinal == 1) {
            i(g.a() << 3);
            i((i + i) ^ (i >> 31));
        } else {
            if (ordinal != 2) {
                return;
            }
            i((g.a() << 3) | 5);
            this.f.write(h(4).putInt(i).array());
        }
    }

    final void d(ibf ibfVar, long j, boolean z) {
        if (z && j == 0) {
            return;
        }
        ibu g = g(ibfVar);
        int ordinal = g.b().ordinal();
        if (ordinal == 0) {
            i(g.a() << 3);
            j(j);
        } else if (ordinal == 1) {
            i(g.a() << 3);
            j((j >> 63) ^ (j + j));
        } else {
            if (ordinal != 2) {
                return;
            }
            i((g.a() << 3) | 1);
            this.f.write(h(8).putLong(j).array());
        }
    }

    final void e(ibf ibfVar, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            i((f(ibfVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(d);
            i(bytes.length);
            this.f.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                e(ibfVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                k(e, ibfVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z && doubleValue == 0.0d) {
                return;
            }
            i((f(ibfVar) << 3) | 1);
            this.f.write(h(8).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z && floatValue == 0.0f) {
                return;
            }
            i((f(ibfVar) << 3) | 5);
            this.f.write(h(4).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            d(ibfVar, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            c(ibfVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            i((f(ibfVar) << 3) | 2);
            i(bArr.length);
            this.f.write(bArr);
            return;
        }
        ibg ibgVar = (ibg) this.c.get(obj.getClass());
        if (ibgVar != null) {
            k(ibgVar, ibfVar, obj, z);
            return;
        }
        ibi ibiVar = (ibi) this.g.get(obj.getClass());
        if (ibiVar != null) {
            iby ibyVar = this.i;
            ibyVar.a = false;
            ibyVar.c = ibfVar;
            ibyVar.b = z;
            ibiVar.a(obj, ibyVar);
            return;
        }
        if (obj instanceof ibs) {
            c(ibfVar, ((ibs) obj).a(), true);
        } else if (obj instanceof Enum) {
            c(ibfVar, ((Enum) obj).ordinal(), true);
        } else {
            k(this.h, ibfVar, obj, z);
        }
    }
}
