package defpackage;

import com.facebook.gamingservices.Tournament;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class uw0 {
    public final ThreadLocal a = new ThreadLocal();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final t21 c;
    public final ov d;
    public final List e;

    static {
        new v03(Object.class);
    }

    public uw0(cj0 cj0Var, int i, HashMap hashMap, int i2, ArrayList arrayList) {
        t21 t21Var = new t21(hashMap);
        this.c = t21Var;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(r03.A);
        arrayList2.add(rt1.b);
        arrayList2.add(cj0Var);
        arrayList2.addAll(arrayList);
        arrayList2.add(r03.p);
        arrayList2.add(r03.g);
        arrayList2.add(r03.d);
        arrayList2.add(r03.e);
        arrayList2.add(r03.f);
        int i3 = 1;
        rt1 rt1Var = i2 == 1 ? r03.k : new rt1(3);
        arrayList2.add(new o03(Long.TYPE, Long.class, rt1Var));
        arrayList2.add(new o03(Double.TYPE, Double.class, new rt1(i3)));
        int i4 = 2;
        arrayList2.add(new o03(Float.TYPE, Float.class, new rt1(i4)));
        arrayList2.add(r03.l);
        arrayList2.add(r03.h);
        arrayList2.add(r03.i);
        int i5 = 0;
        arrayList2.add(new n03(AtomicLong.class, new sw0(new sw0(rt1Var, 0), 2), i5));
        arrayList2.add(new n03(AtomicLongArray.class, new sw0(new sw0(rt1Var, 1), 2), i5));
        arrayList2.add(r03.j);
        arrayList2.add(r03.m);
        arrayList2.add(r03.q);
        arrayList2.add(r03.r);
        arrayList2.add(new n03(BigDecimal.class, r03.n, i5));
        arrayList2.add(new n03(BigInteger.class, r03.o, i5));
        arrayList2.add(r03.s);
        arrayList2.add(r03.t);
        arrayList2.add(r03.v);
        arrayList2.add(r03.w);
        arrayList2.add(r03.z);
        arrayList2.add(r03.u);
        arrayList2.add(r03.b);
        arrayList2.add(fo2.e);
        arrayList2.add(r03.y);
        arrayList2.add(fo2.d);
        arrayList2.add(fo2.c);
        arrayList2.add(r03.x);
        arrayList2.add(ki.d);
        arrayList2.add(r03.a);
        arrayList2.add(new ov(i5, t21Var));
        arrayList2.add(new ov(i4, t21Var));
        ov ovVar = new ov(i3, t21Var);
        this.d = ovVar;
        arrayList2.add(ovVar);
        arrayList2.add(r03.B);
        arrayList2.add(new h82(t21Var, i, cj0Var, ovVar));
        this.e = Collections.unmodifiableList(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str) {
        Class cls = Tournament[].class;
        Object obj = null;
        if (str != null) {
            z61 z61Var = new z61(new StringReader(str));
            boolean z = true;
            z61Var.n = true;
            try {
                try {
                    try {
                        z61Var.R();
                        try {
                            obj = b(new v03(cls)).a(z61Var);
                        } catch (EOFException e) {
                            e = e;
                            z = false;
                            if (!z) {
                                throw new a71(e);
                            }
                            if (obj != null) {
                            }
                            if (cls != Integer.TYPE) {
                            }
                            return cls.cast(obj);
                        }
                    } catch (EOFException e2) {
                        e = e2;
                    }
                    if (obj != null) {
                        try {
                            if (z61Var.R() != 10) {
                                throw new u61("JSON document was not fully consumed.");
                            }
                        } catch (rh1 e3) {
                            throw new a71(e3);
                        } catch (IOException e4) {
                            throw new u61(e4);
                        }
                    }
                } catch (IOException e5) {
                    throw new a71(e5);
                } catch (AssertionError e6) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.8): " + e6.getMessage());
                    assertionError.initCause(e6);
                    throw assertionError;
                } catch (IllegalStateException e7) {
                    throw new a71(e7);
                }
            } finally {
                z61Var.n = false;
            }
        }
        if (cls != Integer.TYPE) {
            cls = Integer.class;
        } else if (cls == Float.TYPE) {
            cls = Float.class;
        } else if (cls == Byte.TYPE) {
            cls = Byte.class;
        } else if (cls == Double.TYPE) {
            cls = Double.class;
        } else if (cls == Long.TYPE) {
            cls = Long.class;
        } else if (cls == Character.TYPE) {
            cls = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = Short.class;
        } else if (cls == Void.TYPE) {
            cls = Void.class;
        }
        return cls.cast(obj);
    }

    public final l03 b(v03 v03Var) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.b;
        l03 l03Var = (l03) concurrentHashMap.get(v03Var);
        if (l03Var != null) {
            return l03Var;
        }
        ThreadLocal threadLocal = this.a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            z = false;
        }
        tw0 tw0Var = (tw0) map.get(v03Var);
        if (tw0Var != null) {
            return tw0Var;
        }
        try {
            tw0 tw0Var2 = new tw0();
            map.put(v03Var, tw0Var2);
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                l03 a = ((m03) it.next()).a(this, v03Var);
                if (a != null) {
                    if (tw0Var2.a != null) {
                        throw new AssertionError();
                    }
                    tw0Var2.a = a;
                    concurrentHashMap.put(v03Var, a);
                    return a;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.8) cannot handle " + v03Var);
        } finally {
            map.remove(v03Var);
            if (z) {
                threadLocal.remove();
            }
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }
}
