package a1;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o2.a0;
import w0.k;

/* loaded from: classes.dex */
final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    private long f23b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f24c;

    /* renamed from: d, reason: collision with root package name */
    private long[] f25d;

    public d() {
        super(new k());
        this.f23b = -9223372036854775807L;
        this.f24c = new long[0];
        this.f25d = new long[0];
    }

    private static Boolean g(a0 a0Var) {
        return Boolean.valueOf(a0Var.C() == 1);
    }

    private static Object h(a0 a0Var, int i7) {
        if (i7 == 0) {
            return j(a0Var);
        }
        if (i7 == 1) {
            return g(a0Var);
        }
        if (i7 == 2) {
            return n(a0Var);
        }
        if (i7 == 3) {
            return l(a0Var);
        }
        if (i7 == 8) {
            return k(a0Var);
        }
        if (i7 == 10) {
            return m(a0Var);
        }
        if (i7 != 11) {
            return null;
        }
        return i(a0Var);
    }

    private static Date i(a0 a0Var) {
        Date date = new Date((long) j(a0Var).doubleValue());
        a0Var.P(2);
        return date;
    }

    private static Double j(a0 a0Var) {
        return Double.valueOf(Double.longBitsToDouble(a0Var.v()));
    }

    private static HashMap<String, Object> k(a0 a0Var) {
        int G = a0Var.G();
        HashMap<String, Object> hashMap = new HashMap<>(G);
        for (int i7 = 0; i7 < G; i7++) {
            String n7 = n(a0Var);
            Object h7 = h(a0Var, o(a0Var));
            if (h7 != null) {
                hashMap.put(n7, h7);
            }
        }
        return hashMap;
    }

    private static HashMap<String, Object> l(a0 a0Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String n7 = n(a0Var);
            int o7 = o(a0Var);
            if (o7 == 9) {
                return hashMap;
            }
            Object h7 = h(a0Var, o7);
            if (h7 != null) {
                hashMap.put(n7, h7);
            }
        }
    }

    private static ArrayList<Object> m(a0 a0Var) {
        int G = a0Var.G();
        ArrayList<Object> arrayList = new ArrayList<>(G);
        for (int i7 = 0; i7 < G; i7++) {
            Object h7 = h(a0Var, o(a0Var));
            if (h7 != null) {
                arrayList.add(h7);
            }
        }
        return arrayList;
    }

    private static String n(a0 a0Var) {
        int I = a0Var.I();
        int e7 = a0Var.e();
        a0Var.P(I);
        return new String(a0Var.d(), e7, I);
    }

    private static int o(a0 a0Var) {
        return a0Var.C();
    }

    @Override // a1.e
    protected boolean b(a0 a0Var) {
        return true;
    }

    @Override // a1.e
    protected boolean c(a0 a0Var, long j7) {
        if (o(a0Var) != 2 || !"onMetaData".equals(n(a0Var)) || a0Var.a() == 0 || o(a0Var) != 8) {
            return false;
        }
        HashMap<String, Object> k7 = k(a0Var);
        Object obj = k7.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f23b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = k7.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f24c = new long[size];
                this.f25d = new long[size];
                for (int i7 = 0; i7 < size; i7++) {
                    Object obj5 = list.get(i7);
                    Object obj6 = list2.get(i7);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f24c = new long[0];
                        this.f25d = new long[0];
                        break;
                    }
                    this.f24c[i7] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f25d[i7] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long d() {
        return this.f23b;
    }

    public long[] e() {
        return this.f25d;
    }

    public long[] f() {
        return this.f24c;
    }
}
