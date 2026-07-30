package defpackage;

import android.os.Bundle;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.EnumMap;
import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xk3 {
    public static final xk3 c = new xk3(100);
    public final EnumMap a;
    public final int b;

    public xk3(int i) {
        EnumMap enumMap = new EnumMap(vk3.class);
        this.a = enumMap;
        vk3 vk3Var = vk3.AD_STORAGE;
        sk3 sk3Var = sk3.UNINITIALIZED;
        enumMap.put((EnumMap) vk3Var, (vk3) sk3Var);
        enumMap.put((EnumMap) vk3.ANALYTICS_STORAGE, (vk3) sk3Var);
        this.b = i;
    }

    public static String a(int i) {
        return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static xk3 b(int i, Bundle bundle) {
        if (bundle == null) {
            return new xk3(i);
        }
        EnumMap enumMap = new EnumMap(vk3.class);
        for (vk3 vk3Var : uk3.STORAGE.m) {
            enumMap.put((EnumMap) vk3Var, (vk3) d(bundle.getString(vk3Var.m)));
        }
        return new xk3(enumMap, i);
    }

    public static xk3 c(int i, String str) {
        EnumMap enumMap = new EnumMap(vk3.class);
        vk3[] vk3VarArr = uk3.STORAGE.m;
        for (int i2 = 0; i2 < vk3VarArr.length; i2++) {
            String str2 = str == null ? BuildConfig.FLAVOR : str;
            vk3 vk3Var = vk3VarArr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put((EnumMap) vk3Var, (vk3) e(str2.charAt(i3)));
            } else {
                enumMap.put((EnumMap) vk3Var, (vk3) sk3.UNINITIALIZED);
            }
        }
        return new xk3(enumMap, i);
    }

    public static sk3 d(String str) {
        sk3 sk3Var = sk3.UNINITIALIZED;
        return str == null ? sk3Var : str.equals("granted") ? sk3.GRANTED : str.equals("denied") ? sk3.DENIED : sk3Var;
    }

    public static sk3 e(char c2) {
        return c2 != '+' ? c2 != '0' ? c2 != '1' ? sk3.UNINITIALIZED : sk3.GRANTED : sk3.DENIED : sk3.POLICY;
    }

    public static char h(sk3 sk3Var) {
        if (sk3Var == null) {
            return '-';
        }
        int ordinal = sk3Var.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xk3) {
            xk3 xk3Var = (xk3) obj;
            vk3[] vk3VarArr = uk3.STORAGE.m;
            int length = vk3VarArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    vk3 vk3Var = vk3VarArr[i];
                    if (this.a.get(vk3Var) != xk3Var.a.get(vk3Var)) {
                        break;
                    }
                    i++;
                } else if (this.b == xk3Var.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String f() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (vk3 vk3Var : uk3.STORAGE.m) {
            sk3 sk3Var = (sk3) this.a.get(vk3Var);
            char c2 = '-';
            if (sk3Var != null && (ordinal = sk3Var.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c2 = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c2 = '1';
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final String g() {
        StringBuilder sb = new StringBuilder("G1");
        for (vk3 vk3Var : uk3.STORAGE.m) {
            sb.append(h((sk3) this.a.get(vk3Var)));
        }
        return sb.toString();
    }

    public final int hashCode() {
        Iterator it = this.a.values().iterator();
        int i = this.b * 17;
        while (it.hasNext()) {
            i = (i * 31) + ((sk3) it.next()).hashCode();
        }
        return i;
    }

    public final boolean i(vk3 vk3Var) {
        return ((sk3) this.a.get(vk3Var)) != sk3.DENIED;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xk3 j(xk3 xk3Var) {
        EnumMap enumMap = new EnumMap(vk3.class);
        for (vk3 vk3Var : uk3.STORAGE.m) {
            sk3 sk3Var = (sk3) this.a.get(vk3Var);
            sk3 sk3Var2 = (sk3) xk3Var.a.get(vk3Var);
            if (sk3Var != null) {
                if (sk3Var2 != null) {
                    sk3 sk3Var3 = sk3.UNINITIALIZED;
                    if (sk3Var != sk3Var3) {
                        if (sk3Var2 != sk3Var3) {
                            sk3 sk3Var4 = sk3.POLICY;
                            if (sk3Var != sk3Var4) {
                                if (sk3Var2 != sk3Var4) {
                                    sk3 sk3Var5 = sk3.DENIED;
                                    sk3Var = (sk3Var == sk3Var5 || sk3Var2 == sk3Var5) ? sk3Var5 : sk3.GRANTED;
                                }
                            }
                        }
                    }
                }
                if (sk3Var == null) {
                    enumMap.put((EnumMap) vk3Var, (vk3) sk3Var);
                }
            }
            sk3Var = sk3Var2;
            if (sk3Var == null) {
            }
        }
        return new xk3(enumMap, 100);
    }

    public final xk3 k(xk3 xk3Var) {
        EnumMap enumMap = new EnumMap(vk3.class);
        for (vk3 vk3Var : uk3.STORAGE.m) {
            sk3 sk3Var = (sk3) this.a.get(vk3Var);
            if (sk3Var == sk3.UNINITIALIZED) {
                sk3Var = (sk3) xk3Var.a.get(vk3Var);
            }
            if (sk3Var != null) {
                enumMap.put((EnumMap) vk3Var, (vk3) sk3Var);
            }
        }
        return new xk3(enumMap, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(a(this.b));
        for (vk3 vk3Var : uk3.STORAGE.m) {
            sb.append(",");
            sb.append(vk3Var.m);
            sb.append("=");
            sk3 sk3Var = (sk3) this.a.get(vk3Var);
            if (sk3Var == null) {
                sk3Var = sk3.UNINITIALIZED;
            }
            sb.append(sk3Var);
        }
        return sb.toString();
    }

    public xk3(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(vk3.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }
}
