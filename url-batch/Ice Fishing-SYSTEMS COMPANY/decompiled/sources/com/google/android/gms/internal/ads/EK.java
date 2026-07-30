package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Set;

/* loaded from: classes2.dex */
public final class EK extends AbstractMap implements Serializable {

    /* renamed from: A, reason: collision with root package name */
    public static final C2959b f24700A = new C2959b(18);

    /* renamed from: n, reason: collision with root package name */
    public final C2959b f24701n;

    /* renamed from: u, reason: collision with root package name */
    public DK f24702u;

    /* renamed from: v, reason: collision with root package name */
    public int f24703v;

    /* renamed from: w, reason: collision with root package name */
    public int f24704w;

    /* renamed from: x, reason: collision with root package name */
    public final DK f24705x;

    /* renamed from: y, reason: collision with root package name */
    public CK f24706y;

    /* renamed from: z, reason: collision with root package name */
    public CK f24707z;

    public EK() {
        C2959b c2959b = f24700A;
        this.f24703v = 0;
        this.f24704w = 0;
        this.f24701n = c2959b;
        this.f24705x = new DK();
    }

    public final DK a(Object obj, boolean z8) {
        int i;
        DK dk;
        DK dk2 = this.f24702u;
        C2959b c2959b = f24700A;
        C2959b c2959b2 = this.f24701n;
        if (dk2 != null) {
            Comparable comparable = c2959b2 == c2959b ? (Comparable) obj : null;
            while (true) {
                Object obj2 = dk2.f24423y;
                i = comparable != null ? comparable.compareTo(obj2) : c2959b2.compare(obj, obj2);
                if (i == 0) {
                    return dk2;
                }
                DK dk3 = i < 0 ? dk2.f24419u : dk2.f24420v;
                if (dk3 == null) {
                    break;
                }
                dk2 = dk3;
            }
        } else {
            i = 0;
        }
        if (!z8) {
            return null;
        }
        DK dk4 = this.f24705x;
        if (dk2 != null) {
            DK dk5 = new DK(dk2, obj, dk4, dk4.f24422x);
            if (i < 0) {
                dk2.f24419u = dk5;
            } else {
                dk2.f24420v = dk5;
            }
            d(dk2, true);
            dk = dk5;
        } else {
            if (c2959b2 == c2959b && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            dk = new DK(null, obj, dk4, dk4.f24422x);
            this.f24702u = dk;
        }
        this.f24703v++;
        this.f24704w++;
        return dk;
    }

    public final void b(DK dk, boolean z8) {
        DK dk2;
        DK dk3;
        int i;
        if (z8) {
            DK dk4 = dk.f24422x;
            dk4.f24421w = dk.f24421w;
            dk.f24421w.f24422x = dk4;
        }
        DK dk5 = dk.f24419u;
        DK dk6 = dk.f24420v;
        DK dk7 = dk.f24418n;
        int i4 = 0;
        if (dk5 == null || dk6 == null) {
            if (dk5 != null) {
                c(dk, dk5);
                dk.f24419u = null;
            } else if (dk6 != null) {
                c(dk, dk6);
                dk.f24420v = null;
            } else {
                c(dk, null);
            }
            d(dk7, false);
            this.f24703v--;
            this.f24704w++;
            return;
        }
        if (dk5.f24417A > dk6.f24417A) {
            do {
                dk3 = dk5;
                dk5 = dk5.f24420v;
            } while (dk5 != null);
        } else {
            do {
                dk2 = dk6;
                dk6 = dk6.f24419u;
            } while (dk6 != null);
            dk3 = dk2;
        }
        b(dk3, false);
        DK dk8 = dk.f24419u;
        if (dk8 != null) {
            i = dk8.f24417A;
            dk3.f24419u = dk8;
            dk8.f24418n = dk3;
            dk.f24419u = null;
        } else {
            i = 0;
        }
        DK dk9 = dk.f24420v;
        if (dk9 != null) {
            i4 = dk9.f24417A;
            dk3.f24420v = dk9;
            dk9.f24418n = dk3;
            dk.f24420v = null;
        }
        dk3.f24417A = Math.max(i, i4) + 1;
        c(dk, dk3);
    }

    public final void c(DK dk, DK dk2) {
        DK dk3 = dk.f24418n;
        dk.f24418n = null;
        if (dk2 != null) {
            dk2.f24418n = dk3;
        }
        if (dk3 == null) {
            this.f24702u = dk2;
        } else if (dk3.f24419u == dk) {
            dk3.f24419u = dk2;
        } else {
            dk3.f24420v = dk2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f24702u = null;
        this.f24703v = 0;
        this.f24704w++;
        DK dk = this.f24705x;
        dk.f24422x = dk;
        dk.f24421w = dk;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        DK dk = null;
        if (obj != null) {
            try {
                dk = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return dk != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r10 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005a, code lost:
    
        if (r10 == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(DK dk, boolean z8) {
        while (dk != null) {
            DK dk2 = dk.f24419u;
            DK dk3 = dk.f24420v;
            boolean z9 = false;
            int i = dk2 != null ? dk2.f24417A : 0;
            int i4 = dk3 != null ? dk3.f24417A : 0;
            int i9 = i - i4;
            boolean z10 = true;
            if (i9 == -2) {
                DK dk4 = dk3.f24419u;
                DK dk5 = dk3.f24420v;
                int i10 = (dk4 != null ? dk4.f24417A : 0) - (dk5 != null ? dk5.f24417A : 0);
                if (i10 != -1) {
                    if (i10 != 0) {
                        z10 = z8;
                    }
                    f(dk3);
                    e(dk);
                    if (!z10) {
                        return;
                    }
                } else {
                    z9 = z8;
                }
                e(dk);
                z10 = z9;
                if (!z10) {
                }
            } else if (i9 == 2) {
                DK dk6 = dk2.f24419u;
                DK dk7 = dk2.f24420v;
                int i11 = (dk6 != null ? dk6.f24417A : 0) - (dk7 != null ? dk7.f24417A : 0);
                if (i11 != 1) {
                    if (i11 != 0) {
                        z10 = z8;
                    }
                    e(dk2);
                    f(dk);
                    if (!z10) {
                        return;
                    }
                } else {
                    z9 = z8;
                }
                f(dk);
                z10 = z9;
                if (!z10) {
                }
            } else if (i9 == 0) {
                dk.f24417A = i + 1;
                if (z8) {
                    return;
                }
            } else {
                dk.f24417A = Math.max(i, i4) + 1;
                if (!z8) {
                    return;
                }
            }
            dk = dk.f24418n;
        }
    }

    public final void e(DK dk) {
        DK dk2 = dk.f24419u;
        DK dk3 = dk.f24420v;
        DK dk4 = dk3.f24419u;
        DK dk5 = dk3.f24420v;
        dk.f24420v = dk4;
        if (dk4 != null) {
            dk4.f24418n = dk;
        }
        c(dk, dk3);
        dk3.f24419u = dk;
        dk.f24418n = dk3;
        int max = Math.max(dk2 != null ? dk2.f24417A : 0, dk4 != null ? dk4.f24417A : 0) + 1;
        dk.f24417A = max;
        dk3.f24417A = Math.max(max, dk5 != null ? dk5.f24417A : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        CK ck = this.f24706y;
        if (ck != null) {
            return ck;
        }
        CK ck2 = new CK(this, 0);
        this.f24706y = ck2;
        return ck2;
    }

    public final void f(DK dk) {
        DK dk2 = dk.f24419u;
        DK dk3 = dk.f24420v;
        DK dk4 = dk2.f24419u;
        DK dk5 = dk2.f24420v;
        dk.f24419u = dk5;
        if (dk5 != null) {
            dk5.f24418n = dk;
        }
        c(dk, dk2);
        dk2.f24420v = dk;
        dk.f24418n = dk2;
        int max = Math.max(dk3 != null ? dk3.f24417A : 0, dk5 != null ? dk5.f24417A : 0) + 1;
        dk.f24417A = max;
        dk2.f24417A = Math.max(max, dk4 != null ? dk4.f24417A : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        DK dk;
        if (obj != null) {
            try {
                dk = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (dk == null) {
                return dk.f24424z;
            }
            return null;
        }
        dk = null;
        if (dk == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        CK ck = this.f24707z;
        if (ck != null) {
            return ck;
        }
        CK ck2 = new CK(this, 1);
        this.f24707z = ck2;
        return ck2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null) {
            throw new NullPointerException("value == null");
        }
        DK a9 = a(obj, true);
        Object obj3 = a9.f24424z;
        a9.f24424z = obj2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(Object obj) {
        DK dk;
        if (obj != null) {
            try {
                dk = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (dk != null) {
                b(dk, true);
            }
            if (dk == null) {
                return dk.f24424z;
            }
            return null;
        }
        dk = null;
        if (dk != null) {
        }
        if (dk == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f24703v;
    }
}
