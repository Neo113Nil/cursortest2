package com.tapjoy.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ek {

    /* renamed from: c, reason: collision with root package name */
    public static final ek f8002c = new ek(eh.VARINT, Boolean.class) { // from class: com.tapjoy.internal.ek.1
        @Override // com.tapjoy.internal.ek
        public final /* bridge */ /* synthetic */ int a(Object obj) {
            return 1;
        }

        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ void a(em emVar, Object obj) {
            emVar.c(((Boolean) obj).booleanValue() ? 1 : 0);
        }

        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ Object a(el elVar) {
            int d2 = elVar.d();
            if (d2 == 0) {
                return Boolean.FALSE;
            }
            if (d2 == 1) {
                return Boolean.TRUE;
            }
            throw new IOException(String.format("Invalid boolean value 0x%02x", Integer.valueOf(d2)));
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final ek f8003d = new ek(eh.VARINT, Integer.class) { // from class: com.tapjoy.internal.ek.7
        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ int a(Object obj) {
            int intValue = ((Integer) obj).intValue();
            if (intValue >= 0) {
                return em.a(intValue);
            }
            return 10;
        }

        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ void a(em emVar, Object obj) {
            int intValue = ((Integer) obj).intValue();
            if (intValue >= 0) {
                emVar.c(intValue);
            } else {
                emVar.c(intValue);
            }
        }

        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ Object a(el elVar) {
            return Integer.valueOf(elVar.d());
        }
    };
    public static final ek e = new ek(eh.VARINT, Integer.class) { // from class: com.tapjoy.internal.ek.8
        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ int a(Object obj) {
            return em.a(((Integer) obj).intValue());
        }

        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ void a(em emVar, Object obj) {
            emVar.c(((Integer) obj).intValue());
        }

        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ Object a(el elVar) {
            return Integer.valueOf(elVar.d());
        }
    };
    public static final ek f = new ek(eh.VARINT, Integer.class) { // from class: com.tapjoy.internal.ek.9
        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ int a(Object obj) {
            return em.a(em.b(((Integer) obj).intValue()));
        }

        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ void a(em emVar, Object obj) {
            emVar.c(em.b(((Integer) obj).intValue()));
        }

        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ Object a(el elVar) {
            int d2 = elVar.d();
            return Integer.valueOf((-(d2 & 1)) ^ (d2 >>> 1));
        }
    };
    public static final ek g;
    public static final ek h;
    public static final ek i;
    public static final ek j;
    public static final ek k;
    public static final ek l;
    public static final ek m;
    public static final ek n;
    public static final ek o;
    public static final ek p;
    public static final ek q;

    /* renamed from: a, reason: collision with root package name */
    final Class f8004a;

    /* renamed from: b, reason: collision with root package name */
    ek f8005b;
    private final eh r;

    public abstract int a(Object obj);

    public abstract Object a(el elVar);

    public abstract void a(em emVar, Object obj);

    public ek(eh ehVar, Class cls) {
        this.r = ehVar;
        this.f8004a = cls;
    }

    public int a(int i2, Object obj) {
        int a2 = a(obj);
        if (this.r == eh.LENGTH_DELIMITED) {
            a2 += em.a(a2);
        }
        return a2 + em.a(em.a(i2, eh.VARINT));
    }

    public void a(em emVar, int i2, Object obj) {
        emVar.c(em.a(i2, this.r));
        if (this.r == eh.LENGTH_DELIMITED) {
            emVar.c(a(obj));
        }
        a(emVar, obj);
    }

    private void a(it itVar, Object obj) {
        ej.a(obj, "value == null");
        ej.a(itVar, "sink == null");
        a(new em(itVar), obj);
    }

    public final byte[] b(Object obj) {
        ej.a(obj, "value == null");
        is isVar = new is();
        try {
            a(isVar, obj);
            return isVar.g();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void a(OutputStream outputStream, Object obj) {
        ej.a(obj, "value == null");
        ej.a(outputStream, "stream == null");
        it a2 = iw.a(iw.a(outputStream));
        a(a2, obj);
        a2.a();
    }

    public final Object a(byte[] bArr) {
        ej.a(bArr, "bytes == null");
        is isVar = new is();
        if (bArr != null) {
            return a((iu) isVar.a(bArr, 0, bArr.length));
        }
        throw new IllegalArgumentException("source == null");
    }

    public final Object a(InputStream inputStream) {
        ej.a(inputStream, "stream == null");
        return a(iw.a(iw.a(inputStream)));
    }

    private Object a(iu iuVar) {
        ej.a(iuVar, "source == null");
        return a(new el(iuVar));
    }

    public static String c(Object obj) {
        return obj.toString();
    }

    static {
        ek ekVar = new ek(eh.FIXED32, Integer.class) { // from class: com.tapjoy.internal.ek.10
            @Override // com.tapjoy.internal.ek
            public final /* bridge */ /* synthetic */ int a(Object obj) {
                return 4;
            }

            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ void a(em emVar, Object obj) {
                emVar.d(((Integer) obj).intValue());
            }

            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ Object a(el elVar) {
                return Integer.valueOf(elVar.f());
            }
        };
        g = ekVar;
        h = ekVar;
        i = new ek(eh.VARINT, Long.class) { // from class: com.tapjoy.internal.ek.11
            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ int a(Object obj) {
                return em.a(((Long) obj).longValue());
            }

            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ void a(em emVar, Object obj) {
                emVar.c(((Long) obj).longValue());
            }

            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ Object a(el elVar) {
                return Long.valueOf(elVar.e());
            }
        };
        j = new ek(eh.VARINT, Long.class) { // from class: com.tapjoy.internal.ek.12
            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ int a(Object obj) {
                return em.a(((Long) obj).longValue());
            }

            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ void a(em emVar, Object obj) {
                emVar.c(((Long) obj).longValue());
            }

            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ Object a(el elVar) {
                return Long.valueOf(elVar.e());
            }
        };
        k = new ek(eh.VARINT, Long.class) { // from class: com.tapjoy.internal.ek.13
            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ int a(Object obj) {
                return em.a(em.b(((Long) obj).longValue()));
            }

            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ void a(em emVar, Object obj) {
                emVar.c(em.b(((Long) obj).longValue()));
            }

            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ Object a(el elVar) {
                long e2 = elVar.e();
                return Long.valueOf((-(e2 & 1)) ^ (e2 >>> 1));
            }
        };
        ek ekVar2 = new ek(eh.FIXED64, Long.class) { // from class: com.tapjoy.internal.ek.14
            @Override // com.tapjoy.internal.ek
            public final /* bridge */ /* synthetic */ int a(Object obj) {
                return 8;
            }

            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ void a(em emVar, Object obj) {
                emVar.d(((Long) obj).longValue());
            }

            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ Object a(el elVar) {
                return Long.valueOf(elVar.g());
            }
        };
        l = ekVar2;
        m = ekVar2;
        n = new ek(eh.FIXED32, Float.class) { // from class: com.tapjoy.internal.ek.2
            @Override // com.tapjoy.internal.ek
            public final /* bridge */ /* synthetic */ int a(Object obj) {
                return 4;
            }

            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ void a(em emVar, Object obj) {
                emVar.d(Float.floatToIntBits(((Float) obj).floatValue()));
            }

            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ Object a(el elVar) {
                return Float.valueOf(Float.intBitsToFloat(elVar.f()));
            }
        };
        o = new ek(eh.FIXED64, Double.class) { // from class: com.tapjoy.internal.ek.3
            @Override // com.tapjoy.internal.ek
            public final /* bridge */ /* synthetic */ int a(Object obj) {
                return 8;
            }

            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ void a(em emVar, Object obj) {
                emVar.d(Double.doubleToLongBits(((Double) obj).doubleValue()));
            }

            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ Object a(el elVar) {
                return Double.valueOf(Double.longBitsToDouble(elVar.g()));
            }
        };
        p = new ek(eh.LENGTH_DELIMITED, String.class) { // from class: com.tapjoy.internal.ek.4
            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ int a(Object obj) {
                int i2;
                String str = (String) obj;
                int length = str.length();
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    char charAt = str.charAt(i3);
                    if (charAt >= 128) {
                        if (charAt < 2048) {
                            i4 += 2;
                        } else if (charAt < 55296 || charAt > 57343) {
                            i4 += 3;
                        } else if (charAt <= 56319 && (i2 = i3 + 1) < length && str.charAt(i2) >= 56320 && str.charAt(i2) <= 57343) {
                            i4 += 4;
                            i3 = i2;
                        }
                        i3++;
                    }
                    i4++;
                    i3++;
                }
                return i4;
            }

            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ void a(em emVar, Object obj) {
                emVar.f8011a.b((String) obj);
            }

            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ Object a(el elVar) {
                return elVar.f8007a.c(elVar.h());
            }
        };
        q = new ek(eh.LENGTH_DELIMITED, iv.class) { // from class: com.tapjoy.internal.ek.5
            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ int a(Object obj) {
                return ((iv) obj).c();
            }

            @Override // com.tapjoy.internal.ek
            public final /* bridge */ /* synthetic */ void a(em emVar, Object obj) {
                emVar.a((iv) obj);
            }

            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ Object a(el elVar) {
                return elVar.f8007a.b(elVar.h());
            }
        };
    }

    public final ek a() {
        ek ekVar = this.f8005b;
        if (ekVar != null) {
            return ekVar;
        }
        ek ekVar2 = new ek(this.r, List.class) { // from class: com.tapjoy.internal.ek.6
            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ int a(int i2, Object obj) {
                List list = (List) obj;
                int size = list.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    i3 += ek.this.a(i2, list.get(i4));
                }
                return i3;
            }

            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ void a(em emVar, int i2, Object obj) {
                List list = (List) obj;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ek.this.a(emVar, i2, list.get(i3));
                }
            }

            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ Object a(el elVar) {
                return Collections.singletonList(ek.this.a(elVar));
            }

            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ void a(em emVar, Object obj) {
                throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
            }

            @Override // com.tapjoy.internal.ek
            public final /* synthetic */ int a(Object obj) {
                throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
            }
        };
        this.f8005b = ekVar2;
        return ekVar2;
    }

    public static final class a extends IllegalArgumentException {

        /* renamed from: a, reason: collision with root package name */
        public final int f8006a;

        a(int i, Class cls) {
            super("Unknown enum tag " + i + " for " + cls.getCanonicalName());
            this.f8006a = i;
        }
    }
}
