package c4;

import C4.p;
import com.appsflyer.attribution.RequestError;
import java.io.EOFException;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k6.InterfaceC0608c;
import kotlin.Unit;
import kotlin.jvm.internal.C0643h;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297c extends AbstractC0303i {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f4211t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0297c(EnumC0298d enumC0298d, InterfaceC0608c interfaceC0608c, EnumC0307m enumC0307m, Object obj, int i2, int i5) {
        super(enumC0298d, interfaceC0608c, enumC0307m, obj, i2);
        this.f4211t = i5;
    }

    public static int i(Duration duration) {
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

    public static long j(Duration duration) {
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

    @Override // c4.AbstractC0303i
    public final Object b(B.f reader) {
        Duration ofSeconds;
        Instant ofEpochSecond;
        int i2 = this.f4211t;
        C0297c c0297c = AbstractC0303i.j;
        C0297c c0297c2 = AbstractC0303i.f4225g;
        long j = 0;
        C0297c c0297c3 = AbstractC0303i.f4236s;
        C0297c c0297c4 = AbstractC0303i.f4232o;
        int i5 = 0;
        int i7 = 0;
        Object obj = null;
        switch (i2) {
            case 0:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Double.valueOf(Double.longBitsToDouble(((C0295a) reader.f152e).i()));
            case 1:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Float.valueOf(Float.intBitsToFloat(((C0295a) reader.f152e).h()));
            case 2:
                Intrinsics.checkNotNullParameter(reader, "reader");
                throw new IllegalStateException("Operation not supported.");
            case 3:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Boolean.valueOf(((C0295a) reader.f152e).l() != 0);
            case 4:
                Intrinsics.checkNotNullParameter(reader, "reader");
                C0295a c0295a = (C0295a) reader.f152e;
                int b7 = c0295a.b();
                int i8 = c0295a.f4201b;
                int i9 = i8 + b7;
                if (i9 > c0295a.f4202c) {
                    throw new EOFException();
                }
                T6.i iVar = T6.i.f2618l;
                T6.i s7 = q1.h.s(c0295a.f4200a, i8, b7);
                c0295a.f4201b = i9;
                return s7;
            case 5:
                Intrinsics.checkNotNullParameter(reader, "reader");
                long e7 = reader.e();
                while (true) {
                    int f7 = ((C0295a) reader.f152e).f();
                    if (f7 == -1) {
                        reader.i(e7);
                        ofSeconds = Duration.ofSeconds(j, i7);
                        Intrinsics.checkNotNullExpressionValue(ofSeconds, "ofSeconds(...)");
                        return ofSeconds;
                    }
                    if (f7 == 1) {
                        j = ((Number) c0297c.b(reader)).longValue();
                    } else if (f7 != 2) {
                        reader.q(f7);
                    } else {
                        i7 = ((Number) c0297c2.b(reader)).intValue();
                    }
                }
            case 6:
                Intrinsics.checkNotNullParameter(reader, "reader");
                long e8 = reader.e();
                while (true) {
                    int f8 = ((C0295a) reader.f152e).f();
                    if (f8 == -1) {
                        reader.i(e8);
                        return Unit.f6114a;
                    }
                    reader.q(f8);
                }
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(((C0295a) reader.f152e).h());
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(((C0295a) reader.f152e).i());
            case 9:
                Intrinsics.checkNotNullParameter(reader, "reader");
                long e9 = reader.e();
                while (true) {
                    int f9 = ((C0295a) reader.f152e).f();
                    if (f9 == -1) {
                        reader.i(e9);
                        ofEpochSecond = Instant.ofEpochSecond(j, i5);
                        Intrinsics.checkNotNullExpressionValue(ofEpochSecond, "ofEpochSecond(...)");
                        return ofEpochSecond;
                    }
                    if (f9 == 1) {
                        j = ((Number) c0297c.b(reader)).longValue();
                    } else if (f9 != 2) {
                        reader.q(f9);
                    } else {
                        i5 = ((Number) c0297c2.b(reader)).intValue();
                    }
                }
            case 10:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(((C0295a) reader.f152e).l());
            case RequestError.STOP_TRACKING /* 11 */:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(((C0295a) reader.f152e).m());
            case 12:
                Intrinsics.checkNotNullParameter(reader, "reader");
                int l7 = ((C0295a) reader.f152e).l();
                return Integer.valueOf((-(l7 & 1)) ^ (l7 >>> 1));
            case 13:
                Intrinsics.checkNotNullParameter(reader, "reader");
                long m2 = ((C0295a) reader.f152e).m();
                return Long.valueOf((-(m2 & 1)) ^ (m2 >>> 1));
            case 14:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return ((C0295a) reader.f152e).j();
            case 15:
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long e10 = reader.e();
                C0295a c0295a2 = (C0295a) reader.f152e;
                while (true) {
                    int f10 = c0295a2.f();
                    if (f10 == -1) {
                        reader.i(e10);
                        return arrayList;
                    }
                    if (f10 != 1) {
                        c0295a2.n();
                    } else {
                        arrayList.add(c0297c3.b(reader));
                    }
                }
            case 16:
                Intrinsics.checkNotNullParameter(reader, "reader");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                long e11 = reader.e();
                C0295a c0295a3 = (C0295a) reader.f152e;
                while (true) {
                    int f11 = c0295a3.f();
                    if (f11 == -1) {
                        reader.i(e11);
                        return linkedHashMap;
                    }
                    if (f11 != 1) {
                        c0295a3.n();
                    } else {
                        long e12 = reader.e();
                        Object obj2 = obj;
                        Object obj3 = obj2;
                        while (true) {
                            int f12 = c0295a3.f();
                            if (f12 == -1) {
                                reader.i(e12);
                                if (obj2 != null) {
                                    linkedHashMap.put(obj2, obj3);
                                }
                            } else if (f12 == 1) {
                                obj2 = c0297c4.b(reader);
                            } else if (f12 != 2) {
                                reader.q(f12);
                            } else {
                                obj3 = c0297c3.b(reader);
                            }
                        }
                    }
                    obj = null;
                }
            case 17:
                Intrinsics.checkNotNullParameter(reader, "reader");
                int l8 = ((C0295a) reader.f152e).l();
                if (l8 == 0) {
                    return null;
                }
                throw new IOException(p.g(l8, "expected 0 but was "));
            case 18:
                Intrinsics.checkNotNullParameter(reader, "reader");
                long e13 = reader.e();
                C0295a c0295a4 = (C0295a) reader.f152e;
                while (true) {
                    Object obj4 = null;
                    while (true) {
                        int f13 = c0295a4.f();
                        if (f13 == -1) {
                            reader.i(e13);
                            return obj4;
                        }
                        switch (f13) {
                            case 1:
                                break;
                            case 2:
                                obj4 = AbstractC0303i.f4230m.b(reader);
                                break;
                            case 3:
                                obj4 = c0297c4.b(reader);
                                break;
                            case 4:
                                obj4 = AbstractC0303i.f4224f.b(reader);
                                break;
                            case 5:
                                obj4 = AbstractC0303i.f4233p.b(reader);
                                break;
                            case 6:
                                obj4 = AbstractC0303i.f4234q.b(reader);
                                break;
                            default:
                                c0295a4.n();
                                break;
                        }
                    }
                    AbstractC0303i.f4235r.b(reader);
                }
                break;
            case 19:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(((C0295a) reader.f152e).l());
            default:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(((C0295a) reader.f152e).m());
        }
    }

    @Override // c4.AbstractC0303i
    public final Object c(C0295a reader) {
        Duration ofSeconds;
        Instant ofEpochSecond;
        int i2 = this.f4211t;
        C0297c c0297c = AbstractC0303i.j;
        C0297c c0297c2 = AbstractC0303i.f4225g;
        long j = 0;
        C0297c c0297c3 = AbstractC0303i.f4236s;
        C0297c c0297c4 = AbstractC0303i.f4232o;
        int i5 = 0;
        int i7 = 0;
        switch (i2) {
            case 0:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Double.valueOf(Double.longBitsToDouble(reader.i()));
            case 1:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Float.valueOf(Float.intBitsToFloat(reader.h()));
            case 2:
                Intrinsics.checkNotNullParameter(reader, "reader");
                throw new IllegalStateException("Operation not supported.");
            case 3:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Boolean.valueOf(reader.l() != 0);
            case 4:
                Intrinsics.checkNotNullParameter(reader, "reader");
                int b7 = reader.b();
                int i8 = reader.f4201b;
                int i9 = i8 + b7;
                if (i9 > reader.f4202c) {
                    throw new EOFException();
                }
                T6.i iVar = T6.i.f2618l;
                T6.i s7 = q1.h.s(reader.f4200a, i8, b7);
                reader.f4201b = i9;
                return s7;
            case 5:
                Intrinsics.checkNotNullParameter(reader, "reader");
                int c7 = reader.c();
                while (true) {
                    int f7 = reader.f();
                    if (f7 == -1) {
                        reader.d(c7);
                        ofSeconds = Duration.ofSeconds(j, i7);
                        Intrinsics.checkNotNullExpressionValue(ofSeconds, "ofSeconds(...)");
                        return ofSeconds;
                    }
                    if (f7 == 1) {
                        j = ((Number) c0297c.c(reader)).longValue();
                    } else if (f7 != 2) {
                        reader.k(f7);
                    } else {
                        i7 = ((Number) c0297c2.c(reader)).intValue();
                    }
                }
            case 6:
                Intrinsics.checkNotNullParameter(reader, "reader");
                int c8 = reader.c();
                while (true) {
                    int f8 = reader.f();
                    if (f8 == -1) {
                        reader.d(c8);
                        return Unit.f6114a;
                    }
                    reader.k(f8);
                }
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(reader.h());
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(reader.i());
            case 9:
                Intrinsics.checkNotNullParameter(reader, "reader");
                int c9 = reader.c();
                while (true) {
                    int f9 = reader.f();
                    if (f9 == -1) {
                        reader.d(c9);
                        ofEpochSecond = Instant.ofEpochSecond(j, i5);
                        Intrinsics.checkNotNullExpressionValue(ofEpochSecond, "ofEpochSecond(...)");
                        return ofEpochSecond;
                    }
                    if (f9 == 1) {
                        j = ((Number) c0297c.c(reader)).longValue();
                    } else if (f9 != 2) {
                        reader.k(f9);
                    } else {
                        i5 = ((Number) c0297c2.c(reader)).intValue();
                    }
                }
            case 10:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(reader.l());
            case RequestError.STOP_TRACKING /* 11 */:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(reader.m());
            case 12:
                Intrinsics.checkNotNullParameter(reader, "reader");
                int l7 = reader.l();
                return Integer.valueOf((-(l7 & 1)) ^ (l7 >>> 1));
            case 13:
                Intrinsics.checkNotNullParameter(reader, "reader");
                long m2 = reader.m();
                return Long.valueOf((-(m2 & 1)) ^ (m2 >>> 1));
            case 14:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return reader.j();
            case 15:
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                int c10 = reader.c();
                while (true) {
                    int f10 = reader.f();
                    if (f10 == -1) {
                        reader.d(c10);
                        return arrayList;
                    }
                    if (f10 != 1) {
                        reader.n();
                    } else {
                        arrayList.add(c0297c3.c(reader));
                    }
                }
            case 16:
                Intrinsics.checkNotNullParameter(reader, "reader");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int c11 = reader.c();
                while (true) {
                    int f11 = reader.f();
                    if (f11 == -1) {
                        reader.d(c11);
                        return linkedHashMap;
                    }
                    if (f11 != 1) {
                        reader.n();
                    } else {
                        int c12 = reader.c();
                        String str = null;
                        Object obj = null;
                        while (true) {
                            int f12 = reader.f();
                            if (f12 == -1) {
                                reader.d(c12);
                                if (str != null) {
                                    linkedHashMap.put(str, obj);
                                }
                            } else if (f12 == 1) {
                                c0297c4.getClass();
                                Intrinsics.checkNotNullParameter(reader, "reader");
                                str = reader.j();
                            } else if (f12 != 2) {
                                reader.k(f12);
                            } else {
                                obj = c0297c3.c(reader);
                            }
                        }
                    }
                }
            case 17:
                Intrinsics.checkNotNullParameter(reader, "reader");
                int l8 = reader.l();
                if (l8 == 0) {
                    return null;
                }
                throw new IOException(p.g(l8, "expected 0 but was "));
            case 18:
                Intrinsics.checkNotNullParameter(reader, "reader");
                int c13 = reader.c();
                while (true) {
                    Object obj2 = null;
                    while (true) {
                        int f13 = reader.f();
                        if (f13 == -1) {
                            reader.d(c13);
                            return obj2;
                        }
                        switch (f13) {
                            case 1:
                                break;
                            case 2:
                                obj2 = AbstractC0303i.f4230m.c(reader);
                                break;
                            case 3:
                                c0297c4.getClass();
                                Intrinsics.checkNotNullParameter(reader, "reader");
                                obj2 = reader.j();
                                break;
                            case 4:
                                obj2 = AbstractC0303i.f4224f.c(reader);
                                break;
                            case 5:
                                obj2 = AbstractC0303i.f4233p.c(reader);
                                break;
                            case 6:
                                obj2 = AbstractC0303i.f4234q.c(reader);
                                break;
                            default:
                                reader.n();
                                break;
                        }
                    }
                    AbstractC0303i.f4235r.c(reader);
                }
                break;
            case 19:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(reader.l());
            default:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(reader.m());
        }
    }

    @Override // c4.AbstractC0303i
    public final void e(l2.c writer, Object obj) {
        long epochSecond;
        int nano;
        switch (this.f4211t) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                ((T6.g) writer.f6269d).k(Double.doubleToLongBits(doubleValue));
                return;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                ((T6.g) writer.f6269d).q(Float.floatToIntBits(floatValue));
                return;
            case 2:
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter((Void) obj, "value");
                throw new IllegalStateException("Operation not supported.");
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.H(booleanValue ? 1 : 0);
                return;
            case 4:
                T6.i value = (T6.i) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.F(value);
                return;
            case 5:
                Duration value2 = C4.l.m(obj);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value2, "value");
                long j = j(value2);
                if (j != 0) {
                    AbstractC0303i.j.f(writer, 1, Long.valueOf(j));
                }
                int i2 = i(value2);
                if (i2 != 0) {
                    AbstractC0303i.f4225g.f(writer, 2, Integer.valueOf(i2));
                    return;
                }
                return;
            case 6:
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter((Unit) obj, "value");
                return;
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                int intValue = ((Number) obj).intValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                ((T6.g) writer.f6269d).q(intValue);
                return;
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                long longValue = ((Number) obj).longValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                ((T6.g) writer.f6269d).k(longValue);
                return;
            case 9:
                Instant value3 = C4.l.p(obj);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value3, "value");
                epochSecond = value3.getEpochSecond();
                if (epochSecond != 0) {
                    AbstractC0303i.j.f(writer, 1, Long.valueOf(epochSecond));
                }
                nano = value3.getNano();
                if (nano != 0) {
                    AbstractC0303i.f4225g.f(writer, 2, Integer.valueOf(nano));
                    return;
                }
                return;
            case 10:
                int intValue2 = ((Number) obj).intValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (intValue2 >= 0) {
                    writer.H(intValue2);
                    return;
                } else {
                    writer.I(intValue2);
                    return;
                }
            case RequestError.STOP_TRACKING /* 11 */:
                long longValue2 = ((Number) obj).longValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.I(longValue2);
                return;
            case 12:
                int intValue3 = ((Number) obj).intValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.H((intValue3 >> 31) ^ (intValue3 << 1));
                return;
            case 13:
                long longValue3 = ((Number) obj).longValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.I((longValue3 >> 63) ^ (longValue3 << 1));
                return;
            case 14:
                String value4 = (String) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value4, "value");
                writer.getClass();
                Intrinsics.checkNotNullParameter(value4, "value");
                ((T6.g) writer.f6269d).A(value4);
                return;
            case 15:
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (list == null) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC0303i.f4236s.f(writer, 1, it.next());
                }
                return;
            case 16:
                Map map = (Map) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (map == null) {
                    return;
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value5 = entry.getValue();
                    C0297c c0297c = AbstractC0303i.f4232o;
                    int h7 = c0297c.h(1, str);
                    C0297c c0297c2 = AbstractC0303i.f4236s;
                    int h8 = c0297c2.h(2, value5) + h7;
                    writer.G(1, EnumC0298d.f4214l);
                    writer.H(h8);
                    c0297c.f(writer, 1, str);
                    c0297c2.f(writer, 2, value5);
                }
                return;
            case 17:
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.H(0);
                return;
            case 18:
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (obj == null) {
                    AbstractC0303i.f4235r.f(writer, 1, obj);
                    return;
                }
                if (obj instanceof Number) {
                    AbstractC0303i.f4230m.f(writer, 2, Double.valueOf(((Number) obj).doubleValue()));
                    return;
                }
                if (obj instanceof String) {
                    AbstractC0303i.f4232o.f(writer, 3, obj);
                    return;
                }
                if (obj instanceof Boolean) {
                    AbstractC0303i.f4224f.f(writer, 4, obj);
                    return;
                }
                if (obj instanceof Map) {
                    AbstractC0303i.f4233p.f(writer, 5, (Map) obj);
                    return;
                } else {
                    if (!(obj instanceof List)) {
                        throw new IllegalArgumentException("unexpected struct value: " + obj);
                    }
                    AbstractC0303i.f4234q.f(writer, 6, obj);
                    return;
                }
            case 19:
                int intValue4 = ((Number) obj).intValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.H(intValue4);
                return;
            default:
                long longValue4 = ((Number) obj).longValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.I(longValue4);
                return;
        }
    }

    @Override // c4.AbstractC0303i
    public void f(l2.c writer, int i2, Object obj) {
        switch (this.f4211t) {
            case 17:
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.G(i2, this.f4237a);
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.H(0);
                break;
            case 18:
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (obj != null) {
                    super.f(writer, i2, obj);
                    break;
                } else {
                    writer.G(i2, this.f4237a);
                    writer.H(g(obj));
                    e(writer, obj);
                    break;
                }
            default:
                super.f(writer, i2, obj);
                break;
        }
    }

    @Override // c4.AbstractC0303i
    public final int g(Object obj) {
        long epochSecond;
        int nano;
        switch (this.f4211t) {
            case 0:
                ((Number) obj).doubleValue();
                return 8;
            case 1:
                ((Number) obj).floatValue();
                return 4;
            case 2:
                Intrinsics.checkNotNullParameter((Void) obj, "value");
                throw new IllegalStateException("Operation not supported.");
            case 3:
                ((Boolean) obj).getClass();
                return 1;
            case 4:
                T6.i value = (T6.i) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                return value.a();
            case 5:
                Duration value2 = C4.l.m(obj);
                Intrinsics.checkNotNullParameter(value2, "value");
                long j = j(value2);
                int h7 = j != 0 ? AbstractC0303i.j.h(1, Long.valueOf(j)) : 0;
                int i2 = i(value2);
                if (i2 != 0) {
                    return h7 + AbstractC0303i.f4225g.h(2, Integer.valueOf(i2));
                }
                return h7;
            case 6:
                Intrinsics.checkNotNullParameter((Unit) obj, "value");
                return 0;
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Number) obj).intValue();
                return 4;
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                ((Number) obj).longValue();
                return 8;
            case 9:
                Instant value3 = C4.l.p(obj);
                Intrinsics.checkNotNullParameter(value3, "value");
                epochSecond = value3.getEpochSecond();
                int h8 = epochSecond != 0 ? AbstractC0303i.j.h(1, Long.valueOf(epochSecond)) : 0;
                nano = value3.getNano();
                if (nano != 0) {
                    return h8 + AbstractC0303i.f4225g.h(2, Integer.valueOf(nano));
                }
                return h8;
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
                if (((-2097152) & intValue) == 0) {
                    return 3;
                }
                return (intValue & (-268435456)) == 0 ? 4 : 5;
            case RequestError.STOP_TRACKING /* 11 */:
                return V6.b.S(((Number) obj).longValue());
            case 12:
                int intValue2 = ((Number) obj).intValue();
                int i5 = (intValue2 >> 31) ^ (intValue2 << 1);
                if ((i5 & (-128)) == 0) {
                    return 1;
                }
                if ((i5 & (-16384)) == 0) {
                    return 2;
                }
                if (((-2097152) & i5) == 0) {
                    return 3;
                }
                return (i5 & (-268435456)) == 0 ? 4 : 5;
            case 13:
                long longValue = ((Number) obj).longValue();
                return V6.b.S((longValue >> 63) ^ (longValue << 1));
            case 14:
                String value4 = (String) obj;
                Intrinsics.checkNotNullParameter(value4, "value");
                return (int) T6.b.f(value4);
            case 15:
                List list = (List) obj;
                int i7 = 0;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        i7 += AbstractC0303i.f4236s.h(1, it.next());
                    }
                }
                return i7;
            case 16:
                Map map = (Map) obj;
                int i8 = 0;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        int h9 = AbstractC0303i.f4236s.h(2, entry.getValue()) + AbstractC0303i.f4232o.h(1, (String) entry.getKey());
                        EnumC0298d fieldEncoding = EnumC0298d.f4212e;
                        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
                        i8 += V6.b.R(h9) + V6.b.R(8) + h9;
                    }
                }
                return i8;
            case 17:
                return 1;
            case 18:
                if (obj == null) {
                    return AbstractC0303i.f4235r.h(1, obj);
                }
                if (obj instanceof Number) {
                    return AbstractC0303i.f4230m.h(2, Double.valueOf(((Number) obj).doubleValue()));
                }
                if (obj instanceof String) {
                    return AbstractC0303i.f4232o.h(3, obj);
                }
                if (obj instanceof Boolean) {
                    return AbstractC0303i.f4224f.h(4, obj);
                }
                if (obj instanceof Map) {
                    return AbstractC0303i.f4233p.h(5, (Map) obj);
                }
                if (obj instanceof List) {
                    return AbstractC0303i.f4234q.h(6, obj);
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
                if (((-2097152) & intValue3) == 0) {
                    return 3;
                }
                return (intValue3 & (-268435456)) == 0 ? 4 : 5;
            default:
                return V6.b.S(((Number) obj).longValue());
        }
    }

    @Override // c4.AbstractC0303i
    public int h(int i2, Object obj) {
        switch (this.f4211t) {
            case 17:
                EnumC0298d fieldEncoding = EnumC0298d.f4212e;
                Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
                break;
            case 18:
                if (obj != null) {
                    break;
                } else {
                    int g7 = g(obj);
                    EnumC0298d fieldEncoding2 = EnumC0298d.f4212e;
                    Intrinsics.checkNotNullParameter(fieldEncoding2, "fieldEncoding");
                    break;
                }
        }
        return super.h(i2, obj);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0297c() {
        super(fieldEncoding, r1, syntax, (f5.h) null);
        this.f4211t = 2;
        EnumC0298d fieldEncoding = EnumC0298d.f4214l;
        C0643h a7 = E.a(Void.class);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        EnumC0307m syntax = EnumC0307m.f4251e;
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }
}
