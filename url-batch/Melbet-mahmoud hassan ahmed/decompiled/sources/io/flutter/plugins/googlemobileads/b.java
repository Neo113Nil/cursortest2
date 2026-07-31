package io.flutter.plugins.googlemobileads;

import android.content.Context;
import io.flutter.plugins.googlemobileads.c0;
import io.flutter.plugins.googlemobileads.e;
import io.flutter.plugins.googlemobileads.i;
import io.flutter.plugins.googlemobileads.l;
import io.flutter.plugins.googlemobileads.m;
import io.flutter.plugins.googlemobileads.o;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import r2.u;

/* loaded from: classes.dex */
class b extends m5.q {

    /* renamed from: d, reason: collision with root package name */
    Context f17440d;

    /* renamed from: e, reason: collision with root package name */
    final m.a f17441e = new m.a();

    /* renamed from: f, reason: collision with root package name */
    private i0 f17442f;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17443a;

        static {
            int[] iArr = new int[o.b.values().length];
            f17443a = iArr;
            try {
                iArr[o.b.NOT_READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17443a[o.b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    b(Context context) {
        this.f17440d = context;
    }

    private static Boolean q(Object obj) {
        if (obj == null) {
            return null;
        }
        return (Boolean) obj;
    }

    @Override // m5.q
    protected Object g(byte b7, ByteBuffer byteBuffer) {
        switch (b7) {
            case Byte.MIN_VALUE:
                return new m(((Integer) g(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) g(byteBuffer.get(), byteBuffer)).intValue());
            case -127:
                return new l.a().m((List) g(byteBuffer.get(), byteBuffer)).k((String) g(byteBuffer.get(), byteBuffer)).q(q(g(byteBuffer.get(), byteBuffer))).p((List) g(byteBuffer.get(), byteBuffer)).l((Integer) g(byteBuffer.get(), byteBuffer)).n((String) g(byteBuffer.get(), byteBuffer)).o(this.f17442f).j((Map) g(byteBuffer.get(), byteBuffer)).a();
            case -126:
                return new m.c();
            case -125:
            case -109:
            default:
                return super.g(b7, byteBuffer);
            case -124:
                return new c0.b((Integer) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer));
            case -123:
                return new e.c(((Integer) g(byteBuffer.get(), byteBuffer)).intValue(), (String) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer), (e.C0076e) g(byteBuffer.get(), byteBuffer));
            case -122:
                i.b bVar = new i.b();
                bVar.m((List) g(byteBuffer.get(), byteBuffer));
                bVar.k((String) g(byteBuffer.get(), byteBuffer));
                bVar.s((Map) g(byteBuffer.get(), byteBuffer));
                bVar.t((Map) g(byteBuffer.get(), byteBuffer));
                bVar.q((Boolean) g(byteBuffer.get(), byteBuffer));
                bVar.p((List) g(byteBuffer.get(), byteBuffer));
                bVar.l((Integer) g(byteBuffer.get(), byteBuffer));
                bVar.u((String) g(byteBuffer.get(), byteBuffer));
                bVar.n((String) g(byteBuffer.get(), byteBuffer));
                bVar.o(this.f17442f);
                bVar.j((Map) g(byteBuffer.get(), byteBuffer));
                return bVar.a();
            case -121:
                String str = (String) g(byteBuffer.get(), byteBuffer);
                str.hashCode();
                if (str.equals("ready")) {
                    return o.b.READY;
                }
                if (str.equals("notReady")) {
                    return o.b.NOT_READY;
                }
                throw new IllegalArgumentException(String.format("Unable to handle state: %s", str));
            case -120:
                return new o((o.b) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer), (Number) g(byteBuffer.get(), byteBuffer));
            case -119:
                return new t((Map<String, o>) g(byteBuffer.get(), byteBuffer));
            case -118:
                return new e0((String) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer));
            case -117:
                return new e.a(((Integer) g(byteBuffer.get(), byteBuffer)).intValue(), (String) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer));
            case -116:
                return new e.C0076e((String) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer), (List) g(byteBuffer.get(), byteBuffer));
            case -115:
                return new e.b((String) g(byteBuffer.get(), byteBuffer), ((Long) g(byteBuffer.get(), byteBuffer)).longValue(), (String) g(byteBuffer.get(), byteBuffer), (String) g(byteBuffer.get(), byteBuffer), (Map) g(byteBuffer.get(), byteBuffer), (e.a) g(byteBuffer.get(), byteBuffer));
            case -114:
                return new m.b(this.f17440d, this.f17441e, (String) g(byteBuffer.get(), byteBuffer), ((Integer) g(byteBuffer.get(), byteBuffer)).intValue());
            case -113:
                return new m.e();
            case -112:
                return new z((Integer) g(byteBuffer.get(), byteBuffer), (Integer) g(byteBuffer.get(), byteBuffer), (f0) g(byteBuffer.get(), byteBuffer), (Boolean) g(byteBuffer.get(), byteBuffer), (Boolean) g(byteBuffer.get(), byteBuffer), (Boolean) g(byteBuffer.get(), byteBuffer));
            case -111:
                return new f0((Boolean) g(byteBuffer.get(), byteBuffer), (Boolean) g(byteBuffer.get(), byteBuffer), (Boolean) g(byteBuffer.get(), byteBuffer));
            case -110:
                Integer num = (Integer) g(byteBuffer.get(), byteBuffer);
                return new m.d(this.f17441e, this.f17440d, num.intValue(), (Integer) g(byteBuffer.get(), byteBuffer), (Integer) g(byteBuffer.get(), byteBuffer));
            case -108:
                u.a aVar = new u.a();
                aVar.b((String) g(byteBuffer.get(), byteBuffer));
                aVar.c(((Integer) g(byteBuffer.get(), byteBuffer)).intValue());
                aVar.d(((Integer) g(byteBuffer.get(), byteBuffer)).intValue());
                aVar.e((List) g(byteBuffer.get(), byteBuffer));
                return aVar.a();
        }
    }

    @Override // m5.q
    protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        Object d7;
        String str;
        Object e7;
        l lVar;
        if (obj instanceof m) {
            t(byteArrayOutputStream, (m) obj);
            return;
        }
        if (obj instanceof i) {
            byteArrayOutputStream.write(-122);
            i iVar = (i) obj;
            p(byteArrayOutputStream, iVar.f());
            p(byteArrayOutputStream, iVar.d());
            p(byteArrayOutputStream, iVar.l());
            p(byteArrayOutputStream, iVar.m());
            p(byteArrayOutputStream, iVar.i());
            p(byteArrayOutputStream, iVar.h());
            p(byteArrayOutputStream, iVar.e());
            e7 = iVar.n();
            lVar = iVar;
        } else {
            if (!(obj instanceof l)) {
                if (obj instanceof c0.b) {
                    byteArrayOutputStream.write(-124);
                    c0.b bVar = (c0.b) obj;
                    p(byteArrayOutputStream, bVar.f17454a);
                    d7 = bVar.f17455b;
                } else if (obj instanceof e.b) {
                    byteArrayOutputStream.write(-115);
                    e.b bVar2 = (e.b) obj;
                    p(byteArrayOutputStream, bVar2.b());
                    p(byteArrayOutputStream, Long.valueOf(bVar2.f()));
                    p(byteArrayOutputStream, bVar2.d());
                    p(byteArrayOutputStream, bVar2.c());
                    p(byteArrayOutputStream, bVar2.a());
                    d7 = bVar2.e();
                } else if (obj instanceof e.C0076e) {
                    byteArrayOutputStream.write(-116);
                    e.C0076e c0076e = (e.C0076e) obj;
                    p(byteArrayOutputStream, c0076e.c());
                    p(byteArrayOutputStream, c0076e.b());
                    d7 = c0076e.a();
                } else if (obj instanceof e.c) {
                    byteArrayOutputStream.write(-123);
                    e.c cVar = (e.c) obj;
                    p(byteArrayOutputStream, Integer.valueOf(cVar.f17477a));
                    p(byteArrayOutputStream, cVar.f17478b);
                    p(byteArrayOutputStream, cVar.f17479c);
                    d7 = cVar.f17480d;
                } else if (obj instanceof e.a) {
                    byteArrayOutputStream.write(-117);
                    e.a aVar = (e.a) obj;
                    p(byteArrayOutputStream, Integer.valueOf(aVar.f17468a));
                    p(byteArrayOutputStream, aVar.f17469b);
                    d7 = aVar.f17470c;
                } else {
                    if (obj instanceof o.b) {
                        byteArrayOutputStream.write(-121);
                        o.b bVar3 = (o.b) obj;
                        int i7 = a.f17443a[bVar3.ordinal()];
                        if (i7 == 1) {
                            str = "notReady";
                        } else {
                            if (i7 != 2) {
                                throw new IllegalArgumentException(String.format("Unable to handle state: %s", bVar3));
                            }
                            str = "ready";
                        }
                        p(byteArrayOutputStream, str);
                        return;
                    }
                    if (obj instanceof o) {
                        byteArrayOutputStream.write(-120);
                        o oVar = (o) obj;
                        p(byteArrayOutputStream, oVar.f17550a);
                        p(byteArrayOutputStream, oVar.f17551b);
                        d7 = oVar.f17552c;
                    } else if (obj instanceof t) {
                        byteArrayOutputStream.write(-119);
                        d7 = ((t) obj).f17574a;
                    } else if (obj instanceof e0) {
                        byteArrayOutputStream.write(-118);
                        e0 e0Var = (e0) obj;
                        p(byteArrayOutputStream, e0Var.c());
                        d7 = e0Var.b();
                    } else if (obj instanceof z) {
                        byteArrayOutputStream.write(-112);
                        z zVar = (z) obj;
                        p(byteArrayOutputStream, zVar.f17600a);
                        p(byteArrayOutputStream, zVar.f17601b);
                        p(byteArrayOutputStream, zVar.f17602c);
                        p(byteArrayOutputStream, zVar.f17603d);
                        p(byteArrayOutputStream, zVar.f17604e);
                        d7 = zVar.f17605f;
                    } else {
                        if (!(obj instanceof r2.u)) {
                            if (!(obj instanceof f0)) {
                                super.p(byteArrayOutputStream, obj);
                                return;
                            }
                            byteArrayOutputStream.write(-111);
                            f0 f0Var = (f0) obj;
                            p(byteArrayOutputStream, f0Var.f17488a);
                            p(byteArrayOutputStream, f0Var.f17489b);
                            p(byteArrayOutputStream, f0Var.f17490c);
                            return;
                        }
                        byteArrayOutputStream.write(-108);
                        r2.u uVar = (r2.u) obj;
                        p(byteArrayOutputStream, uVar.a());
                        p(byteArrayOutputStream, Integer.valueOf(uVar.b()));
                        p(byteArrayOutputStream, Integer.valueOf(uVar.c()));
                        d7 = uVar.d();
                    }
                }
                p(byteArrayOutputStream, d7);
            }
            byteArrayOutputStream.write(-127);
            l lVar2 = (l) obj;
            p(byteArrayOutputStream, lVar2.f());
            p(byteArrayOutputStream, lVar2.d());
            p(byteArrayOutputStream, lVar2.i());
            p(byteArrayOutputStream, lVar2.h());
            e7 = lVar2.e();
            lVar = lVar2;
        }
        p(byteArrayOutputStream, e7);
        p(byteArrayOutputStream, lVar.g());
        d7 = lVar.c();
        p(byteArrayOutputStream, d7);
    }

    void r(Context context) {
        this.f17440d = context;
    }

    void s(i0 i0Var) {
        this.f17442f = i0Var;
    }

    protected void t(ByteArrayOutputStream byteArrayOutputStream, m mVar) {
        int i7;
        int i8;
        Integer valueOf;
        if (mVar instanceof m.d) {
            m.d dVar = (m.d) mVar;
            byteArrayOutputStream.write(-110);
            p(byteArrayOutputStream, Integer.valueOf(dVar.f17542b));
            p(byteArrayOutputStream, dVar.f17546e);
            valueOf = dVar.f17545d;
        } else {
            if (!(mVar instanceof m.b)) {
                if (mVar instanceof m.e) {
                    i8 = -113;
                } else if (mVar instanceof m.c) {
                    i8 = -126;
                } else {
                    byteArrayOutputStream.write(-128);
                    p(byteArrayOutputStream, Integer.valueOf(mVar.f17542b));
                    i7 = mVar.f17543c;
                }
                byteArrayOutputStream.write(i8);
                return;
            }
            byteArrayOutputStream.write(-114);
            m.b bVar = (m.b) mVar;
            p(byteArrayOutputStream, bVar.f17544d);
            i7 = bVar.f17542b;
            valueOf = Integer.valueOf(i7);
        }
        p(byteArrayOutputStream, valueOf);
    }
}
