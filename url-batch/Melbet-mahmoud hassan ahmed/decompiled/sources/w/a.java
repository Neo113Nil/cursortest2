package w;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: f, reason: collision with root package name */
    private final String f22839f;

    /* renamed from: g, reason: collision with root package name */
    private final Object[] f22840g;

    public a(String str) {
        this(str, null);
    }

    public a(String str, Object[] objArr) {
        this.f22839f = str;
        this.f22840g = objArr;
    }

    private static void a(d dVar, int i7, Object obj) {
        long j7;
        int byteValue;
        double doubleValue;
        if (obj == null) {
            dVar.o(i7);
            return;
        }
        if (obj instanceof byte[]) {
            dVar.F(i7, (byte[]) obj);
            return;
        }
        if (obj instanceof Float) {
            doubleValue = ((Float) obj).floatValue();
        } else {
            if (!(obj instanceof Double)) {
                if (obj instanceof Long) {
                    j7 = ((Long) obj).longValue();
                } else {
                    if (obj instanceof Integer) {
                        byteValue = ((Integer) obj).intValue();
                    } else if (obj instanceof Short) {
                        byteValue = ((Short) obj).shortValue();
                    } else if (obj instanceof Byte) {
                        byteValue = ((Byte) obj).byteValue();
                    } else {
                        if (obj instanceof String) {
                            dVar.l(i7, (String) obj);
                            return;
                        }
                        if (!(obj instanceof Boolean)) {
                            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i7 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                        }
                        j7 = ((Boolean) obj).booleanValue() ? 1L : 0L;
                    }
                    j7 = byteValue;
                }
                dVar.z(i7, j7);
                return;
            }
            doubleValue = ((Double) obj).doubleValue();
        }
        dVar.p(i7, doubleValue);
    }

    public static void c(d dVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i7 = 0;
        while (i7 < length) {
            Object obj = objArr[i7];
            i7++;
            a(dVar, i7, obj);
        }
    }

    @Override // w.e
    public String b() {
        return this.f22839f;
    }

    @Override // w.e
    public void f(d dVar) {
        c(dVar, this.f22840g);
    }
}
