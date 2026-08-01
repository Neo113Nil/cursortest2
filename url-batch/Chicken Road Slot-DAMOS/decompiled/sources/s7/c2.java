package s7;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: c, reason: collision with root package name */
    public static final c2 f8555c = new c2(100);

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f8556a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8557b;

    public c2(int i3) {
        EnumMap enumMap = new EnumMap(b2.class);
        this.f8556a = enumMap;
        b2 b2Var = b2.AD_STORAGE;
        z1 z1Var = z1.UNINITIALIZED;
        enumMap.put((EnumMap) b2Var, (b2) z1Var);
        enumMap.put((EnumMap) b2.ANALYTICS_STORAGE, (b2) z1Var);
        this.f8557b = i3;
    }

    public static String a(int i3) {
        return i3 != -30 ? i3 != -20 ? i3 != -10 ? i3 != 0 ? i3 != 30 ? i3 != 90 ? i3 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static c2 b(Bundle bundle, int i3) {
        if (bundle == null) {
            return new c2(i3);
        }
        EnumMap enumMap = new EnumMap(b2.class);
        for (b2 b2Var : a2.STORAGE.f8501d) {
            enumMap.put((EnumMap) b2Var, (b2) d(bundle.getString(b2Var.f8521d)));
        }
        return new c2(enumMap, i3);
    }

    public static c2 c(int i3, String str) {
        EnumMap enumMap = new EnumMap(b2.class);
        b2[] b2VarArr = a2.STORAGE.f8501d;
        for (int i10 = 0; i10 < b2VarArr.length; i10++) {
            String str2 = str == null ? "" : str;
            b2 b2Var = b2VarArr[i10];
            int i11 = i10 + 2;
            if (i11 < str2.length()) {
                enumMap.put((EnumMap) b2Var, (b2) e(str2.charAt(i11)));
            } else {
                enumMap.put((EnumMap) b2Var, (b2) z1.UNINITIALIZED);
            }
        }
        return new c2(enumMap, i3);
    }

    public static z1 d(String str) {
        z1 z1Var = z1.UNINITIALIZED;
        return str == null ? z1Var : str.equals("granted") ? z1.GRANTED : str.equals("denied") ? z1.DENIED : z1Var;
    }

    public static z1 e(char c10) {
        return c10 != '+' ? c10 != '0' ? c10 != '1' ? z1.UNINITIALIZED : z1.GRANTED : z1.DENIED : z1.POLICY;
    }

    public static char h(z1 z1Var) {
        if (z1Var == null) {
            return '-';
        }
        int ordinal = z1Var.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i3, int i10) {
        int i11 = -30;
        if (i3 == -20) {
            if (i10 == -30) {
                return true;
            }
            i3 = -20;
        }
        if (i3 != -30) {
            i11 = i3;
        } else if (i10 == -20) {
            return true;
        }
        return i11 == i10 || i3 < i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c2) {
            c2 c2Var = (c2) obj;
            b2[] b2VarArr = a2.STORAGE.f8501d;
            int length = b2VarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    b2 b2Var = b2VarArr[i3];
                    if (this.f8556a.get(b2Var) != c2Var.f8556a.get(b2Var)) {
                        break;
                    }
                    i3++;
                } else if (this.f8557b == c2Var.f8557b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String f() {
        int ordinal;
        StringBuilder sb2 = new StringBuilder("G1");
        for (b2 b2Var : a2.STORAGE.f8501d) {
            z1 z1Var = (z1) this.f8556a.get(b2Var);
            char c10 = '-';
            if (z1Var != null && (ordinal = z1Var.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c10 = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c10 = '1';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (b2 b2Var : a2.STORAGE.f8501d) {
            sb2.append(h((z1) this.f8556a.get(b2Var)));
        }
        return sb2.toString();
    }

    public final int hashCode() {
        Iterator it = this.f8556a.values().iterator();
        int i3 = this.f8557b * 17;
        while (it.hasNext()) {
            i3 = (i3 * 31) + ((z1) it.next()).hashCode();
        }
        return i3;
    }

    public final boolean i(b2 b2Var) {
        return ((z1) this.f8556a.get(b2Var)) != z1.DENIED;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c2 j(c2 c2Var) {
        EnumMap enumMap = new EnumMap(b2.class);
        for (b2 b2Var : a2.STORAGE.f8501d) {
            z1 z1Var = (z1) this.f8556a.get(b2Var);
            z1 z1Var2 = (z1) c2Var.f8556a.get(b2Var);
            if (z1Var != null) {
                if (z1Var2 != null) {
                    z1 z1Var3 = z1.UNINITIALIZED;
                    if (z1Var != z1Var3) {
                        if (z1Var2 != z1Var3) {
                            z1 z1Var4 = z1.POLICY;
                            if (z1Var != z1Var4) {
                                if (z1Var2 != z1Var4) {
                                    z1 z1Var5 = z1.DENIED;
                                    z1Var = (z1Var == z1Var5 || z1Var2 == z1Var5) ? z1Var5 : z1.GRANTED;
                                }
                            }
                        }
                    }
                }
                if (z1Var == null) {
                    enumMap.put((EnumMap) b2Var, (b2) z1Var);
                }
            }
            z1Var = z1Var2;
            if (z1Var == null) {
            }
        }
        return new c2(enumMap, 100);
    }

    public final c2 k(c2 c2Var) {
        EnumMap enumMap = new EnumMap(b2.class);
        for (b2 b2Var : a2.STORAGE.f8501d) {
            z1 z1Var = (z1) this.f8556a.get(b2Var);
            if (z1Var == z1.UNINITIALIZED) {
                z1Var = (z1) c2Var.f8556a.get(b2Var);
            }
            if (z1Var != null) {
                enumMap.put((EnumMap) b2Var, (b2) z1Var);
            }
        }
        return new c2(enumMap, this.f8557b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(a(this.f8557b));
        for (b2 b2Var : a2.STORAGE.f8501d) {
            sb2.append(",");
            sb2.append(b2Var.f8521d);
            sb2.append("=");
            z1 z1Var = (z1) this.f8556a.get(b2Var);
            if (z1Var == null) {
                z1Var = z1.UNINITIALIZED;
            }
            sb2.append(z1Var);
        }
        return sb2.toString();
    }

    public c2(EnumMap enumMap, int i3) {
        EnumMap enumMap2 = new EnumMap(b2.class);
        this.f8556a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f8557b = i3;
    }
}
