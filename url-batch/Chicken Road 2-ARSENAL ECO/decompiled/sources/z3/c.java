package z3;

import W4.o;
import a.AbstractC0219a;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.io.EOFException;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k5.v;
import kotlin.jvm.internal.t;
import y1.C0760d;

/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f6296t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, D5.c cVar, m mVar, Object obj, int i7, int i8) {
        super(dVar, cVar, mVar, obj, i7);
        this.f6296t = i8;
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

    @Override // z3.i
    public final Object b(V5.g reader) {
        Duration ofSeconds;
        Instant ofEpochSecond;
        int i7 = this.f6296t;
        c cVar = i.f6313j;
        c cVar2 = i.f6310g;
        long j4 = 0;
        c cVar3 = i.f6322s;
        c cVar4 = i.f6318o;
        int i8 = 0;
        int i9 = 0;
        Object obj = null;
        switch (i7) {
            case 0:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Double.valueOf(Double.longBitsToDouble(((a) reader.f2734g).i()));
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return Float.valueOf(Float.intBitsToFloat(((a) reader.f2734g).h()));
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                throw new IllegalStateException("Operation not supported.");
            case 3:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Boolean.valueOf(((a) reader.f2734g).l() != 0);
            case 4:
                kotlin.jvm.internal.i.e(reader, "reader");
                a aVar = (a) reader.f2734g;
                int b7 = aVar.b();
                int i10 = aVar.f6285b;
                int i11 = i10 + b7;
                if (i11 > aVar.f6286c) {
                    throw new EOFException();
                }
                n6.i iVar = n6.i.f5525i;
                n6.i h7 = C0760d.h(aVar.f6284a, i10, b7);
                aVar.f6285b = i11;
                return h7;
            case 5:
                long h8 = reader.h();
                while (true) {
                    int f7 = ((a) reader.f2734g).f();
                    if (f7 == -1) {
                        reader.i(h8);
                        ofSeconds = Duration.ofSeconds(j4, i9);
                        kotlin.jvm.internal.i.d(ofSeconds, "ofSeconds(...)");
                        return ofSeconds;
                    }
                    if (f7 == 1) {
                        j4 = ((Number) cVar.b(reader)).longValue();
                    } else if (f7 != 2) {
                        reader.o(f7);
                    } else {
                        i9 = ((Number) cVar2.b(reader)).intValue();
                    }
                }
            case 6:
                long h9 = reader.h();
                while (true) {
                    int f8 = ((a) reader.f2734g).f();
                    if (f8 == -1) {
                        reader.i(h9);
                        return v.f5219a;
                    }
                    reader.o(f8);
                }
            case 7:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Integer.valueOf(((a) reader.f2734g).h());
            case 8:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Long.valueOf(((a) reader.f2734g).i());
            case 9:
                long h10 = reader.h();
                while (true) {
                    int f9 = ((a) reader.f2734g).f();
                    if (f9 == -1) {
                        reader.i(h10);
                        ofEpochSecond = Instant.ofEpochSecond(j4, i8);
                        kotlin.jvm.internal.i.d(ofEpochSecond, "ofEpochSecond(...)");
                        return ofEpochSecond;
                    }
                    if (f9 == 1) {
                        j4 = ((Number) cVar.b(reader)).longValue();
                    } else if (f9 != 2) {
                        reader.o(f9);
                    } else {
                        i8 = ((Number) cVar2.b(reader)).intValue();
                    }
                }
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Integer.valueOf(((a) reader.f2734g).l());
            case 11:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Long.valueOf(((a) reader.f2734g).m());
            case 12:
                int l7 = ((a) reader.f2734g).l();
                return Integer.valueOf((-(l7 & 1)) ^ (l7 >>> 1));
            case 13:
                long m4 = ((a) reader.f2734g).m();
                return Long.valueOf((-(m4 & 1)) ^ (m4 >>> 1));
            case 14:
                kotlin.jvm.internal.i.e(reader, "reader");
                return ((a) reader.f2734g).j();
            case 15:
                kotlin.jvm.internal.i.e(reader, "reader");
                a aVar2 = (a) reader.f2734g;
                ArrayList arrayList = new ArrayList();
                long h11 = reader.h();
                while (true) {
                    int f10 = aVar2.f();
                    if (f10 == -1) {
                        reader.i(h11);
                        return arrayList;
                    }
                    if (f10 != 1) {
                        aVar2.n();
                    } else {
                        arrayList.add(cVar3.b(reader));
                    }
                }
            case 16:
                kotlin.jvm.internal.i.e(reader, "reader");
                a aVar3 = (a) reader.f2734g;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                long h12 = reader.h();
                while (true) {
                    int f11 = aVar3.f();
                    if (f11 == -1) {
                        reader.i(h12);
                        return linkedHashMap;
                    }
                    if (f11 != 1) {
                        aVar3.n();
                    } else {
                        long h13 = reader.h();
                        Object obj2 = obj;
                        Object obj3 = obj2;
                        while (true) {
                            int f12 = aVar3.f();
                            if (f12 == -1) {
                                reader.i(h13);
                                if (obj2 != null) {
                                    linkedHashMap.put(obj2, obj3);
                                }
                            } else if (f12 == 1) {
                                obj2 = cVar4.b(reader);
                            } else if (f12 != 2) {
                                reader.o(f12);
                            } else {
                                obj3 = cVar3.b(reader);
                            }
                        }
                    }
                    obj = null;
                }
            case 17:
                kotlin.jvm.internal.i.e(reader, "reader");
                int l8 = ((a) reader.f2734g).l();
                if (l8 == 0) {
                    return null;
                }
                throw new IOException(o.c("expected 0 but was ", l8));
            case 18:
                kotlin.jvm.internal.i.e(reader, "reader");
                a aVar4 = (a) reader.f2734g;
                long h14 = reader.h();
                while (true) {
                    Object obj4 = null;
                    while (true) {
                        int f13 = aVar4.f();
                        if (f13 == -1) {
                            reader.i(h14);
                            return obj4;
                        }
                        switch (f13) {
                            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                                break;
                            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                                obj4 = i.f6316m.b(reader);
                                break;
                            case 3:
                                obj4 = cVar4.b(reader);
                                break;
                            case 4:
                                obj4 = i.f6309f.b(reader);
                                break;
                            case 5:
                                obj4 = i.f6319p.b(reader);
                                break;
                            case 6:
                                obj4 = i.f6320q.b(reader);
                                break;
                            default:
                                aVar4.n();
                                break;
                        }
                    }
                    i.f6321r.b(reader);
                }
                break;
            case 19:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Integer.valueOf(((a) reader.f2734g).l());
            default:
                return Long.valueOf(((a) reader.f2734g).m());
        }
    }

    @Override // z3.i
    public final Object c(a reader) {
        Duration ofSeconds;
        Instant ofEpochSecond;
        int i7 = this.f6296t;
        c cVar = i.f6313j;
        c cVar2 = i.f6310g;
        long j4 = 0;
        c cVar3 = i.f6322s;
        c cVar4 = i.f6318o;
        int i8 = 0;
        int i9 = 0;
        switch (i7) {
            case 0:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Double.valueOf(Double.longBitsToDouble(reader.i()));
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return Float.valueOf(Float.intBitsToFloat(reader.h()));
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                throw new IllegalStateException("Operation not supported.");
            case 3:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Boolean.valueOf(reader.l() != 0);
            case 4:
                int b7 = reader.b();
                int i10 = reader.f6285b;
                int i11 = i10 + b7;
                if (i11 > reader.f6286c) {
                    throw new EOFException();
                }
                n6.i iVar = n6.i.f5525i;
                n6.i h7 = C0760d.h(reader.f6284a, i10, b7);
                reader.f6285b = i11;
                return h7;
            case 5:
                int c7 = reader.c();
                while (true) {
                    int f7 = reader.f();
                    if (f7 == -1) {
                        reader.d(c7);
                        ofSeconds = Duration.ofSeconds(j4, i9);
                        kotlin.jvm.internal.i.d(ofSeconds, "ofSeconds(...)");
                        return ofSeconds;
                    }
                    if (f7 == 1) {
                        j4 = ((Number) cVar.c(reader)).longValue();
                    } else if (f7 != 2) {
                        reader.k(f7);
                    } else {
                        i9 = ((Number) cVar2.c(reader)).intValue();
                    }
                }
            case 6:
                int c8 = reader.c();
                while (true) {
                    int f8 = reader.f();
                    if (f8 == -1) {
                        reader.d(c8);
                        return v.f5219a;
                    }
                    reader.k(f8);
                }
            case 7:
                return Integer.valueOf(reader.h());
            case 8:
                return Long.valueOf(reader.i());
            case 9:
                int c9 = reader.c();
                while (true) {
                    int f9 = reader.f();
                    if (f9 == -1) {
                        reader.d(c9);
                        ofEpochSecond = Instant.ofEpochSecond(j4, i8);
                        kotlin.jvm.internal.i.d(ofEpochSecond, "ofEpochSecond(...)");
                        return ofEpochSecond;
                    }
                    if (f9 == 1) {
                        j4 = ((Number) cVar.c(reader)).longValue();
                    } else if (f9 != 2) {
                        reader.k(f9);
                    } else {
                        i8 = ((Number) cVar2.c(reader)).intValue();
                    }
                }
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Integer.valueOf(reader.l());
            case 11:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Long.valueOf(reader.m());
            case 12:
                int l7 = reader.l();
                return Integer.valueOf((-(l7 & 1)) ^ (l7 >>> 1));
            case 13:
                long m4 = reader.m();
                return Long.valueOf((-(m4 & 1)) ^ (m4 >>> 1));
            case 14:
                return reader.j();
            case 15:
                kotlin.jvm.internal.i.e(reader, "reader");
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
                        arrayList.add(cVar3.c(reader));
                    }
                }
            case 16:
                kotlin.jvm.internal.i.e(reader, "reader");
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
                                cVar4.getClass();
                                str = reader.j();
                            } else if (f12 != 2) {
                                reader.k(f12);
                            } else {
                                obj = cVar3.c(reader);
                            }
                        }
                    }
                }
            case 17:
                kotlin.jvm.internal.i.e(reader, "reader");
                int l8 = reader.l();
                if (l8 == 0) {
                    return null;
                }
                throw new IOException(o.c("expected 0 but was ", l8));
            case 18:
                kotlin.jvm.internal.i.e(reader, "reader");
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
                            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                                break;
                            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                                obj2 = i.f6316m.c(reader);
                                break;
                            case 3:
                                cVar4.getClass();
                                obj2 = reader.j();
                                break;
                            case 4:
                                obj2 = i.f6309f.c(reader);
                                break;
                            case 5:
                                obj2 = i.f6319p.c(reader);
                                break;
                            case 6:
                                obj2 = i.f6320q.c(reader);
                                break;
                            default:
                                reader.n();
                                break;
                        }
                    }
                    i.f6321r.c(reader);
                }
                break;
            case 19:
                return Integer.valueOf(reader.l());
            default:
                return Long.valueOf(reader.m());
        }
    }

    @Override // z3.i
    public final void d(a6.d writer, Object obj) {
        long epochSecond;
        int nano;
        switch (this.f6296t) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                kotlin.jvm.internal.i.e(writer, "writer");
                ((n6.g) writer.f3172f).k(Double.doubleToLongBits(doubleValue));
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                float floatValue = ((Number) obj).floatValue();
                kotlin.jvm.internal.i.e(writer, "writer");
                ((n6.g) writer.f3172f).s(Float.floatToIntBits(floatValue));
                return;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                kotlin.jvm.internal.i.e(writer, "writer");
                kotlin.jvm.internal.i.e((Void) obj, "value");
                throw new IllegalStateException("Operation not supported.");
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                kotlin.jvm.internal.i.e(writer, "writer");
                writer.n(booleanValue ? 1 : 0);
                return;
            case 4:
                n6.i value = (n6.i) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                kotlin.jvm.internal.i.e(value, "value");
                writer.l(value);
                return;
            case 5:
                Duration value2 = y1.g.h(obj);
                kotlin.jvm.internal.i.e(writer, "writer");
                kotlin.jvm.internal.i.e(value2, "value");
                long i7 = i(value2);
                if (i7 != 0) {
                    i.f6313j.e(writer, 1, Long.valueOf(i7));
                }
                int h7 = h(value2);
                if (h7 != 0) {
                    i.f6310g.e(writer, 2, Integer.valueOf(h7));
                    return;
                }
                return;
            case 6:
                kotlin.jvm.internal.i.e(writer, "writer");
                kotlin.jvm.internal.i.e((v) obj, "value");
                return;
            case 7:
                int intValue = ((Number) obj).intValue();
                kotlin.jvm.internal.i.e(writer, "writer");
                ((n6.g) writer.f3172f).s(intValue);
                return;
            case 8:
                long longValue = ((Number) obj).longValue();
                kotlin.jvm.internal.i.e(writer, "writer");
                ((n6.g) writer.f3172f).k(longValue);
                return;
            case 9:
                Instant value3 = y1.g.j(obj);
                kotlin.jvm.internal.i.e(writer, "writer");
                kotlin.jvm.internal.i.e(value3, "value");
                epochSecond = value3.getEpochSecond();
                if (epochSecond != 0) {
                    i.f6313j.e(writer, 1, Long.valueOf(epochSecond));
                }
                nano = value3.getNano();
                if (nano != 0) {
                    i.f6310g.e(writer, 2, Integer.valueOf(nano));
                    return;
                }
                return;
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                int intValue2 = ((Number) obj).intValue();
                kotlin.jvm.internal.i.e(writer, "writer");
                if (intValue2 >= 0) {
                    writer.n(intValue2);
                    return;
                } else {
                    writer.o(intValue2);
                    return;
                }
            case 11:
                long longValue2 = ((Number) obj).longValue();
                kotlin.jvm.internal.i.e(writer, "writer");
                writer.o(longValue2);
                return;
            case 12:
                int intValue3 = ((Number) obj).intValue();
                kotlin.jvm.internal.i.e(writer, "writer");
                writer.n((intValue3 >> 31) ^ (intValue3 << 1));
                return;
            case 13:
                long longValue3 = ((Number) obj).longValue();
                kotlin.jvm.internal.i.e(writer, "writer");
                writer.o((longValue3 >> 63) ^ (longValue3 << 1));
                return;
            case 14:
                String value4 = (String) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                kotlin.jvm.internal.i.e(value4, "value");
                ((n6.g) writer.f3172f).D(value4);
                return;
            case 15:
                List list = (List) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                if (list == null) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i.f6322s.e(writer, 1, it.next());
                }
                return;
            case 16:
                Map map = (Map) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                if (map == null) {
                    return;
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value5 = entry.getValue();
                    c cVar = i.f6318o;
                    int g7 = cVar.g(1, str);
                    c cVar2 = i.f6322s;
                    int g8 = cVar2.g(2, value5) + g7;
                    writer.m(1, d.f6299i);
                    writer.n(g8);
                    cVar.e(writer, 1, str);
                    cVar2.e(writer, 2, value5);
                }
                return;
            case 17:
                kotlin.jvm.internal.i.e(writer, "writer");
                writer.n(0);
                return;
            case 18:
                kotlin.jvm.internal.i.e(writer, "writer");
                if (obj == null) {
                    i.f6321r.e(writer, 1, obj);
                    return;
                }
                if (obj instanceof Number) {
                    i.f6316m.e(writer, 2, Double.valueOf(((Number) obj).doubleValue()));
                    return;
                }
                if (obj instanceof String) {
                    i.f6318o.e(writer, 3, obj);
                    return;
                }
                if (obj instanceof Boolean) {
                    i.f6309f.e(writer, 4, obj);
                    return;
                }
                if (obj instanceof Map) {
                    i.f6319p.e(writer, 5, (Map) obj);
                    return;
                } else {
                    if (!(obj instanceof List)) {
                        throw new IllegalArgumentException("unexpected struct value: " + obj);
                    }
                    i.f6320q.e(writer, 6, obj);
                    return;
                }
            case 19:
                int intValue4 = ((Number) obj).intValue();
                kotlin.jvm.internal.i.e(writer, "writer");
                writer.n(intValue4);
                return;
            default:
                long longValue4 = ((Number) obj).longValue();
                kotlin.jvm.internal.i.e(writer, "writer");
                writer.o(longValue4);
                return;
        }
    }

    @Override // z3.i
    public void e(a6.d writer, int i7, Object obj) {
        switch (this.f6296t) {
            case 17:
                kotlin.jvm.internal.i.e(writer, "writer");
                writer.m(i7, this.f6323a);
                writer.n(0);
                break;
            case 18:
                kotlin.jvm.internal.i.e(writer, "writer");
                if (obj != null) {
                    super.e(writer, i7, obj);
                    break;
                } else {
                    writer.m(i7, this.f6323a);
                    writer.n(f(obj));
                    d(writer, obj);
                    break;
                }
            default:
                super.e(writer, i7, obj);
                break;
        }
    }

    @Override // z3.i
    public final int f(Object obj) {
        long epochSecond;
        int nano;
        int i7 = this.f6296t;
        c cVar = i.f6310g;
        c cVar2 = i.f6313j;
        c cVar3 = i.f6322s;
        c cVar4 = i.f6318o;
        switch (i7) {
            case 0:
                ((Number) obj).doubleValue();
                return 8;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((Number) obj).floatValue();
                return 4;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                kotlin.jvm.internal.i.e((Void) obj, "value");
                throw new IllegalStateException("Operation not supported.");
            case 3:
                ((Boolean) obj).getClass();
                return 1;
            case 4:
                n6.i value = (n6.i) obj;
                kotlin.jvm.internal.i.e(value, "value");
                return value.a();
            case 5:
                Duration value2 = y1.g.h(obj);
                kotlin.jvm.internal.i.e(value2, "value");
                long i8 = i(value2);
                r14 = i8 != 0 ? cVar2.g(1, Long.valueOf(i8)) : 0;
                int h7 = h(value2);
                return h7 != 0 ? r14 + cVar.g(2, Integer.valueOf(h7)) : r14;
            case 6:
                kotlin.jvm.internal.i.e((v) obj, "value");
                return 0;
            case 7:
                ((Number) obj).intValue();
                return 4;
            case 8:
                ((Number) obj).longValue();
                return 8;
            case 9:
                Instant value3 = y1.g.j(obj);
                kotlin.jvm.internal.i.e(value3, "value");
                epochSecond = value3.getEpochSecond();
                r14 = epochSecond != 0 ? cVar2.g(1, Long.valueOf(epochSecond)) : 0;
                nano = value3.getNano();
                return nano != 0 ? r14 + cVar.g(2, Integer.valueOf(nano)) : r14;
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
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
                return AbstractC0219a.F(((Number) obj).longValue());
            case 12:
                int intValue2 = ((Number) obj).intValue();
                int i9 = (intValue2 >> 31) ^ (intValue2 << 1);
                if ((i9 & (-128)) == 0) {
                    return 1;
                }
                if ((i9 & (-16384)) == 0) {
                    return 2;
                }
                if ((i9 & (-2097152)) == 0) {
                    return 3;
                }
                return (i9 & (-268435456)) == 0 ? 4 : 5;
            case 13:
                long longValue = ((Number) obj).longValue();
                return AbstractC0219a.F((longValue >> 63) ^ (longValue << 1));
            case 14:
                String value4 = (String) obj;
                kotlin.jvm.internal.i.e(value4, "value");
                return (int) n6.b.f(value4);
            case 15:
                List list = (List) obj;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        r14 += cVar3.g(1, it.next());
                    }
                }
                return r14;
            case 16:
                Map map = (Map) obj;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        int g7 = cVar3.g(2, entry.getValue()) + cVar4.g(1, (String) entry.getKey());
                        d dVar = d.f6297g;
                        r14 += AbstractC0219a.E(g7) + AbstractC0219a.E(8) + g7;
                    }
                }
                return r14;
            case 17:
                return 1;
            case 18:
                if (obj == null) {
                    return i.f6321r.g(1, obj);
                }
                if (obj instanceof Number) {
                    return i.f6316m.g(2, Double.valueOf(((Number) obj).doubleValue()));
                }
                if (obj instanceof String) {
                    return cVar4.g(3, obj);
                }
                if (obj instanceof Boolean) {
                    return i.f6309f.g(4, obj);
                }
                if (obj instanceof Map) {
                    return i.f6319p.g(5, (Map) obj);
                }
                if (obj instanceof List) {
                    return i.f6320q.g(6, obj);
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
                return AbstractC0219a.F(((Number) obj).longValue());
        }
    }

    @Override // z3.i
    public int g(int i7, Object obj) {
        switch (this.f6296t) {
            case 17:
                d dVar = d.f6297g;
                break;
            case 18:
                if (obj != null) {
                    break;
                } else {
                    int f7 = f(obj);
                    d dVar2 = d.f6297g;
                    break;
                }
        }
        return super.g(i7, obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c() {
        super(d.f6299i, t.a(Void.class), m.f6336g, null);
        this.f6296t = 2;
    }
}
