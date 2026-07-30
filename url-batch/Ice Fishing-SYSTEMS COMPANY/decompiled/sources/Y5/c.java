package Y5;

import a.AbstractC0415a;
import com.google.android.gms.internal.ads.CL;
import g1.C4523c;
import java.io.EOFException;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.s;
import q7.v;

/* loaded from: classes2.dex */
public final class c extends i {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f3982t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, K7.c cVar, n nVar, Object obj, int i, int i4) {
        super(dVar, cVar, nVar, obj, i);
        this.f3982t = i4;
    }

    public static int h(Duration duration) {
        long seconds;
        int nano;
        int nano2;
        int nano3;
        seconds = duration.getSeconds();
        if (seconds < 0) {
            nano2 = duration.getNano();
            if (nano2 != 0) {
                nano3 = duration.getNano();
                return nano3 - 1000000000;
            }
        }
        nano = duration.getNano();
        return nano;
    }

    public static long i(Duration duration) {
        long seconds;
        long seconds2;
        int nano;
        long seconds3;
        seconds = duration.getSeconds();
        if (seconds < 0) {
            nano = duration.getNano();
            if (nano != 0) {
                seconds3 = duration.getSeconds();
                return seconds3 + 1;
            }
        }
        seconds2 = duration.getSeconds();
        return seconds2;
    }

    @Override // Y5.i
    public final Object b(I0.j reader) {
        Duration ofSeconds;
        Instant ofEpochSecond;
        c cVar = i.f3998j;
        c cVar2 = i.f3996g;
        long j9 = 0;
        c cVar3 = i.f4007s;
        c cVar4 = i.f4003o;
        int i = 0;
        int i4 = 0;
        Object obj = null;
        switch (this.f3982t) {
            case 0:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Double.valueOf(Double.longBitsToDouble(((a) reader.f1233u).i()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(((a) reader.f1233u).h()));
            case 2:
                throw new IllegalStateException("Operation not supported.");
            case 3:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Boolean.valueOf(((a) reader.f1233u).l() != 0);
            case 4:
                kotlin.jvm.internal.h.e(reader, "reader");
                a aVar = (a) reader.f1233u;
                int b9 = aVar.b();
                int i9 = aVar.f3972b;
                int i10 = i9 + b9;
                if (i10 > aVar.f3973c) {
                    throw new EOFException();
                }
                u8.h hVar = u8.h.f41278w;
                u8.h w9 = L2.i.w(aVar.f3971a, i9, b9);
                aVar.f3972b = i10;
                return w9;
            case 5:
                long a9 = reader.a();
                while (true) {
                    int f6 = ((a) reader.f1233u).f();
                    if (f6 == -1) {
                        reader.l(a9);
                        ofSeconds = Duration.ofSeconds(j9, i4);
                        kotlin.jvm.internal.h.d(ofSeconds, "ofSeconds(...)");
                        return ofSeconds;
                    }
                    if (f6 == 1) {
                        j9 = ((Number) cVar.b(reader)).longValue();
                    } else if (f6 != 2) {
                        reader.w(f6);
                    } else {
                        i4 = ((Number) cVar2.b(reader)).intValue();
                    }
                }
            case 6:
                long a10 = reader.a();
                while (true) {
                    int f9 = ((a) reader.f1233u).f();
                    if (f9 == -1) {
                        reader.l(a10);
                        return v.f40183a;
                    }
                    reader.w(f9);
                }
            case 7:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Integer.valueOf(((a) reader.f1233u).h());
            case 8:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Long.valueOf(((a) reader.f1233u).i());
            case 9:
                long a11 = reader.a();
                while (true) {
                    int f10 = ((a) reader.f1233u).f();
                    if (f10 == -1) {
                        reader.l(a11);
                        ofEpochSecond = Instant.ofEpochSecond(j9, i);
                        kotlin.jvm.internal.h.d(ofEpochSecond, "ofEpochSecond(...)");
                        return ofEpochSecond;
                    }
                    if (f10 == 1) {
                        j9 = ((Number) cVar.b(reader)).longValue();
                    } else if (f10 != 2) {
                        reader.w(f10);
                    } else {
                        i = ((Number) cVar2.b(reader)).intValue();
                    }
                }
            case 10:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Integer.valueOf(((a) reader.f1233u).l());
            case 11:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Long.valueOf(((a) reader.f1233u).m());
            case 12:
                int l9 = ((a) reader.f1233u).l();
                return Integer.valueOf((-(l9 & 1)) ^ (l9 >>> 1));
            case 13:
                long m8 = ((a) reader.f1233u).m();
                return Long.valueOf((-(m8 & 1)) ^ (m8 >>> 1));
            case 14:
                kotlin.jvm.internal.h.e(reader, "reader");
                return ((a) reader.f1233u).j();
            case 15:
                kotlin.jvm.internal.h.e(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long a12 = reader.a();
                while (true) {
                    a aVar2 = (a) reader.f1233u;
                    int f11 = aVar2.f();
                    if (f11 == -1) {
                        reader.l(a12);
                        return arrayList;
                    }
                    if (f11 != 1) {
                        aVar2.n();
                    } else {
                        arrayList.add(cVar3.b(reader));
                    }
                }
            case 16:
                kotlin.jvm.internal.h.e(reader, "reader");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                long a13 = reader.a();
                while (true) {
                    a aVar3 = (a) reader.f1233u;
                    int f12 = aVar3.f();
                    if (f12 == -1) {
                        reader.l(a13);
                        return linkedHashMap;
                    }
                    if (f12 != 1) {
                        aVar3.n();
                    } else {
                        long a14 = reader.a();
                        Object obj2 = obj;
                        Object obj3 = obj2;
                        while (true) {
                            int f13 = aVar3.f();
                            if (f13 == -1) {
                                reader.l(a14);
                                if (obj2 != null) {
                                    linkedHashMap.put(obj2, obj3);
                                }
                            } else if (f13 == 1) {
                                obj2 = cVar4.b(reader);
                            } else if (f13 != 2) {
                                reader.w(f13);
                            } else {
                                obj3 = cVar3.b(reader);
                            }
                        }
                    }
                    obj = null;
                }
            case 17:
                kotlin.jvm.internal.h.e(reader, "reader");
                int l10 = ((a) reader.f1233u).l();
                if (l10 == 0) {
                    return null;
                }
                throw new IOException(CL.i(l10, "expected 0 but was "));
            case 18:
                kotlin.jvm.internal.h.e(reader, "reader");
                long a15 = reader.a();
                while (true) {
                    Object obj4 = null;
                    while (true) {
                        a aVar4 = (a) reader.f1233u;
                        int f14 = aVar4.f();
                        if (f14 == -1) {
                            reader.l(a15);
                            return obj4;
                        }
                        switch (f14) {
                            case 1:
                                break;
                            case 2:
                                obj4 = i.f4001m.b(reader);
                                break;
                            case 3:
                                obj4 = cVar4.b(reader);
                                break;
                            case 4:
                                obj4 = i.f3995f.b(reader);
                                break;
                            case 5:
                                obj4 = i.f4004p.b(reader);
                                break;
                            case 6:
                                obj4 = i.f4005q.b(reader);
                                break;
                            default:
                                aVar4.n();
                                break;
                        }
                    }
                    i.f4006r.b(reader);
                }
                break;
            case 19:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Integer.valueOf(((a) reader.f1233u).l());
            default:
                return Long.valueOf(((a) reader.f1233u).m());
        }
    }

    @Override // Y5.i
    public final Object c(a reader) {
        Duration ofSeconds;
        Instant ofEpochSecond;
        c cVar = i.f3998j;
        c cVar2 = i.f3996g;
        long j9 = 0;
        c cVar3 = i.f4007s;
        c cVar4 = i.f4003o;
        int i = 0;
        int i4 = 0;
        switch (this.f3982t) {
            case 0:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Double.valueOf(Double.longBitsToDouble(reader.i()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(reader.h()));
            case 2:
                throw new IllegalStateException("Operation not supported.");
            case 3:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Boolean.valueOf(reader.l() != 0);
            case 4:
                int b9 = reader.b();
                int i9 = reader.f3972b;
                int i10 = i9 + b9;
                if (i10 > reader.f3973c) {
                    throw new EOFException();
                }
                u8.h hVar = u8.h.f41278w;
                u8.h w9 = L2.i.w(reader.f3971a, i9, b9);
                reader.f3972b = i10;
                return w9;
            case 5:
                int c4 = reader.c();
                while (true) {
                    int f6 = reader.f();
                    if (f6 == -1) {
                        reader.d(c4);
                        ofSeconds = Duration.ofSeconds(j9, i4);
                        kotlin.jvm.internal.h.d(ofSeconds, "ofSeconds(...)");
                        return ofSeconds;
                    }
                    if (f6 == 1) {
                        j9 = ((Number) cVar.c(reader)).longValue();
                    } else if (f6 != 2) {
                        reader.k(f6);
                    } else {
                        i4 = ((Number) cVar2.c(reader)).intValue();
                    }
                }
            case 6:
                int c9 = reader.c();
                while (true) {
                    int f9 = reader.f();
                    if (f9 == -1) {
                        reader.d(c9);
                        return v.f40183a;
                    }
                    reader.k(f9);
                }
            case 7:
                return Integer.valueOf(reader.h());
            case 8:
                return Long.valueOf(reader.i());
            case 9:
                int c10 = reader.c();
                while (true) {
                    int f10 = reader.f();
                    if (f10 == -1) {
                        reader.d(c10);
                        ofEpochSecond = Instant.ofEpochSecond(j9, i);
                        kotlin.jvm.internal.h.d(ofEpochSecond, "ofEpochSecond(...)");
                        return ofEpochSecond;
                    }
                    if (f10 == 1) {
                        j9 = ((Number) cVar.c(reader)).longValue();
                    } else if (f10 != 2) {
                        reader.k(f10);
                    } else {
                        i = ((Number) cVar2.c(reader)).intValue();
                    }
                }
            case 10:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Integer.valueOf(reader.l());
            case 11:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Long.valueOf(reader.m());
            case 12:
                int l9 = reader.l();
                return Integer.valueOf((-(l9 & 1)) ^ (l9 >>> 1));
            case 13:
                long m8 = reader.m();
                return Long.valueOf((-(m8 & 1)) ^ (m8 >>> 1));
            case 14:
                return reader.j();
            case 15:
                kotlin.jvm.internal.h.e(reader, "reader");
                ArrayList arrayList = new ArrayList();
                int c11 = reader.c();
                while (true) {
                    int f11 = reader.f();
                    if (f11 == -1) {
                        reader.d(c11);
                        return arrayList;
                    }
                    if (f11 != 1) {
                        reader.n();
                    } else {
                        arrayList.add(cVar3.c(reader));
                    }
                }
            case 16:
                kotlin.jvm.internal.h.e(reader, "reader");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int c12 = reader.c();
                while (true) {
                    int f12 = reader.f();
                    if (f12 == -1) {
                        reader.d(c12);
                        return linkedHashMap;
                    }
                    if (f12 != 1) {
                        reader.n();
                    } else {
                        int c13 = reader.c();
                        String str = null;
                        Object obj = null;
                        while (true) {
                            int f13 = reader.f();
                            if (f13 == -1) {
                                reader.d(c13);
                                if (str != null) {
                                    linkedHashMap.put(str, obj);
                                }
                            } else if (f13 == 1) {
                                cVar4.getClass();
                                str = reader.j();
                            } else if (f13 != 2) {
                                reader.k(f13);
                            } else {
                                obj = cVar3.c(reader);
                            }
                        }
                    }
                }
            case 17:
                kotlin.jvm.internal.h.e(reader, "reader");
                int l10 = reader.l();
                if (l10 == 0) {
                    return null;
                }
                throw new IOException(CL.i(l10, "expected 0 but was "));
            case 18:
                kotlin.jvm.internal.h.e(reader, "reader");
                int c14 = reader.c();
                while (true) {
                    Object obj2 = null;
                    while (true) {
                        int f14 = reader.f();
                        if (f14 == -1) {
                            reader.d(c14);
                            return obj2;
                        }
                        switch (f14) {
                            case 1:
                                break;
                            case 2:
                                obj2 = i.f4001m.c(reader);
                                break;
                            case 3:
                                cVar4.getClass();
                                obj2 = reader.j();
                                break;
                            case 4:
                                obj2 = i.f3995f.c(reader);
                                break;
                            case 5:
                                obj2 = i.f4004p.c(reader);
                                break;
                            case 6:
                                obj2 = i.f4005q.c(reader);
                                break;
                            default:
                                reader.n();
                                break;
                        }
                    }
                    i.f4006r.c(reader);
                }
                break;
            case 19:
                return Integer.valueOf(reader.l());
            default:
                return Long.valueOf(reader.m());
        }
    }

    @Override // Y5.i
    public final void d(C4523c writer, Object obj) {
        long epochSecond;
        int nano;
        switch (this.f3982t) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                ((u8.f) writer.f37856u).r(Double.doubleToLongBits(doubleValue));
                return;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                ((u8.f) writer.f37856u).s(Float.floatToIntBits(floatValue));
                return;
            case 2:
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e((Void) obj, "value");
                throw new IllegalStateException("Operation not supported.");
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.F(booleanValue ? 1 : 0);
                return;
            case 4:
                u8.h value = (u8.h) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value, "value");
                writer.C(value);
                return;
            case 5:
                Duration value2 = P.c.n(obj);
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value2, "value");
                long i = i(value2);
                if (i != 0) {
                    i.f3998j.e(writer, 1, Long.valueOf(i));
                }
                int h9 = h(value2);
                if (h9 != 0) {
                    i.f3996g.e(writer, 2, Integer.valueOf(h9));
                    return;
                }
                return;
            case 6:
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e((v) obj, "value");
                return;
            case 7:
                int intValue = ((Number) obj).intValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                ((u8.f) writer.f37856u).s(intValue);
                return;
            case 8:
                long longValue = ((Number) obj).longValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                ((u8.f) writer.f37856u).r(longValue);
                return;
            case 9:
                Instant value3 = P.c.p(obj);
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value3, "value");
                epochSecond = value3.getEpochSecond();
                if (epochSecond != 0) {
                    i.f3998j.e(writer, 1, Long.valueOf(epochSecond));
                }
                nano = value3.getNano();
                if (nano != 0) {
                    i.f3996g.e(writer, 2, Integer.valueOf(nano));
                    return;
                }
                return;
            case 10:
                int intValue2 = ((Number) obj).intValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                if (intValue2 >= 0) {
                    writer.F(intValue2);
                    return;
                } else {
                    writer.G(intValue2);
                    return;
                }
            case 11:
                long longValue2 = ((Number) obj).longValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.G(longValue2);
                return;
            case 12:
                int intValue3 = ((Number) obj).intValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.F((intValue3 >> 31) ^ (intValue3 << 1));
                return;
            case 13:
                long longValue3 = ((Number) obj).longValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.G((longValue3 >> 63) ^ (longValue3 << 1));
                return;
            case 14:
                String value4 = (String) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value4, "value");
                ((u8.f) writer.f37856u).u(value4);
                return;
            case 15:
                List list = (List) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                if (list == null) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i.f4007s.e(writer, 1, it.next());
                }
                return;
            case 16:
                Map map = (Map) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                if (map == null) {
                    return;
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value5 = entry.getValue();
                    c cVar = i.f4003o;
                    int g9 = cVar.g(1, str);
                    c cVar2 = i.f4007s;
                    int g10 = cVar2.g(2, value5) + g9;
                    writer.D(1, d.f3985w);
                    writer.F(g10);
                    cVar.e(writer, 1, str);
                    cVar2.e(writer, 2, value5);
                }
                return;
            case 17:
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.F(0);
                return;
            case 18:
                kotlin.jvm.internal.h.e(writer, "writer");
                if (obj == null) {
                    i.f4006r.e(writer, 1, obj);
                    return;
                }
                if (obj instanceof Number) {
                    i.f4001m.e(writer, 2, Double.valueOf(((Number) obj).doubleValue()));
                    return;
                }
                if (obj instanceof String) {
                    i.f4003o.e(writer, 3, obj);
                    return;
                }
                if (obj instanceof Boolean) {
                    i.f3995f.e(writer, 4, obj);
                    return;
                }
                if (obj instanceof Map) {
                    i.f4004p.e(writer, 5, (Map) obj);
                    return;
                } else {
                    if (!(obj instanceof List)) {
                        throw new IllegalArgumentException("unexpected struct value: " + obj);
                    }
                    i.f4005q.e(writer, 6, obj);
                    return;
                }
            case 19:
                int intValue4 = ((Number) obj).intValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.F(intValue4);
                return;
            default:
                long longValue4 = ((Number) obj).longValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.G(longValue4);
                return;
        }
    }

    @Override // Y5.i
    public void e(C4523c writer, int i, Object obj) {
        switch (this.f3982t) {
            case 17:
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.D(i, this.f4008a);
                writer.F(0);
                break;
            case 18:
                kotlin.jvm.internal.h.e(writer, "writer");
                if (obj != null) {
                    super.e(writer, i, obj);
                    break;
                } else {
                    writer.D(i, this.f4008a);
                    writer.F(f(obj));
                    d(writer, obj);
                    break;
                }
            default:
                super.e(writer, i, obj);
                break;
        }
    }

    @Override // Y5.i
    public final int f(Object obj) {
        long epochSecond;
        int nano;
        c cVar = i.f3996g;
        c cVar2 = i.f3998j;
        c cVar3 = i.f4007s;
        c cVar4 = i.f4003o;
        switch (this.f3982t) {
            case 0:
                ((Number) obj).doubleValue();
                return 8;
            case 1:
                ((Number) obj).floatValue();
                return 4;
            case 2:
                kotlin.jvm.internal.h.e((Void) obj, "value");
                throw new IllegalStateException("Operation not supported.");
            case 3:
                ((Boolean) obj).getClass();
                return 1;
            case 4:
                u8.h value = (u8.h) obj;
                kotlin.jvm.internal.h.e(value, "value");
                return value.a();
            case 5:
                Duration value2 = P.c.n(obj);
                kotlin.jvm.internal.h.e(value2, "value");
                long i = i(value2);
                r12 = i != 0 ? cVar2.g(1, Long.valueOf(i)) : 0;
                int h9 = h(value2);
                return h9 != 0 ? r12 + cVar.g(2, Integer.valueOf(h9)) : r12;
            case 6:
                kotlin.jvm.internal.h.e((v) obj, "value");
                return 0;
            case 7:
                ((Number) obj).intValue();
                return 4;
            case 8:
                ((Number) obj).longValue();
                return 8;
            case 9:
                Instant value3 = P.c.p(obj);
                kotlin.jvm.internal.h.e(value3, "value");
                epochSecond = value3.getEpochSecond();
                r12 = epochSecond != 0 ? cVar2.g(1, Long.valueOf(epochSecond)) : 0;
                nano = value3.getNano();
                return nano != 0 ? r12 + cVar.g(2, Integer.valueOf(nano)) : r12;
            case 10:
                int intValue = ((Number) obj).intValue();
                if (intValue < 0) {
                    return 10;
                }
                if ((intValue & (-128)) == 0) {
                    return 1;
                }
                if ((intValue & (-16384)) == 0) {
                    return 2;
                }
                if ((intValue & (-2097152)) == 0) {
                    return 3;
                }
                return (intValue & (-268435456)) == 0 ? 4 : 5;
            case 11:
                return AbstractC0415a.G(((Number) obj).longValue());
            case 12:
                int intValue2 = ((Number) obj).intValue();
                int i4 = (intValue2 >> 31) ^ (intValue2 << 1);
                if ((i4 & (-128)) == 0) {
                    return 1;
                }
                if ((i4 & (-16384)) == 0) {
                    return 2;
                }
                if ((i4 & (-2097152)) == 0) {
                    return 3;
                }
                return (i4 & (-268435456)) == 0 ? 4 : 5;
            case 13:
                long longValue = ((Number) obj).longValue();
                return AbstractC0415a.G((longValue >> 63) ^ (longValue << 1));
            case 14:
                String value4 = (String) obj;
                kotlin.jvm.internal.h.e(value4, "value");
                return (int) u8.b.g(value4);
            case 15:
                List list = (List) obj;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        r12 += cVar3.g(1, it.next());
                    }
                }
                return r12;
            case 16:
                Map map = (Map) obj;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        int g9 = cVar3.g(2, entry.getValue()) + cVar4.g(1, (String) entry.getKey());
                        d dVar = d.f3983u;
                        r12 += AbstractC0415a.F(g9) + AbstractC0415a.F(8) + g9;
                    }
                }
                return r12;
            case 17:
                return 1;
            case 18:
                if (obj == null) {
                    return i.f4006r.g(1, obj);
                }
                if (obj instanceof Number) {
                    return i.f4001m.g(2, Double.valueOf(((Number) obj).doubleValue()));
                }
                if (obj instanceof String) {
                    return cVar4.g(3, obj);
                }
                if (obj instanceof Boolean) {
                    return i.f3995f.g(4, obj);
                }
                if (obj instanceof Map) {
                    return i.f4004p.g(5, (Map) obj);
                }
                if (obj instanceof List) {
                    return i.f4005q.g(6, obj);
                }
                throw new IllegalArgumentException("unexpected struct value: " + obj);
            case 19:
                int intValue3 = ((Number) obj).intValue();
                if ((intValue3 & (-128)) == 0) {
                    return 1;
                }
                if ((intValue3 & (-16384)) == 0) {
                    return 2;
                }
                if ((intValue3 & (-2097152)) == 0) {
                    return 3;
                }
                return (intValue3 & (-268435456)) == 0 ? 4 : 5;
            default:
                return AbstractC0415a.G(((Number) obj).longValue());
        }
    }

    @Override // Y5.i
    public int g(int i, Object obj) {
        switch (this.f3982t) {
            case 17:
                d dVar = d.f3983u;
                break;
            case 18:
                if (obj != null) {
                    break;
                } else {
                    int f6 = f(obj);
                    d dVar2 = d.f3983u;
                    break;
                }
        }
        return super.g(i, obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c() {
        super(d.f3985w, s.a(Void.class), n.f4023u, null);
        this.f3982t = 2;
    }
}
