package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import com.majelw.libystne.data.MaxLineDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class f03 {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public final MaxLineDatabase_Impl a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final boolean d;
    public final rk e;
    public final String[] g;
    public final w50 h;
    public final j70 i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public Function0 k = new e4(19);
    public final LinkedHashMap f = new LinkedHashMap();

    public f03(MaxLineDatabase_Impl maxLineDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, rk rkVar) {
        String str;
        this.a = maxLineDatabase_Impl;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = z;
        this.e = rkVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            this.f.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.b.get(strArr[i]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                str.getClass();
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = str4.toLowerCase(locale2);
            lowerCase2.getClass();
            if (this.f.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase3.getClass();
                LinkedHashMap linkedHashMap3 = this.f;
                linkedHashMap3.put(lowerCase3, mi1.d(linkedHashMap3, lowerCase2));
            }
        }
        this.h = new w50(this.g.length);
        this.i = new j70(this.g.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r4 == r6) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f03 f03Var, b32 b32Var, r30 r30Var) {
        yz2 yz2Var;
        int i;
        Set set;
        f03Var.getClass();
        if (r30Var instanceof yz2) {
            yz2Var = (yz2) r30Var;
            int i2 = yz2Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yz2Var.p = i2 - Integer.MIN_VALUE;
                Object obj = yz2Var.n;
                b50 b50Var = b50.m;
                i = yz2Var.p;
                if (i != 0) {
                    ca2.b(obj);
                    de2 de2Var = new de2(27);
                    yz2Var.m = b32Var;
                    yz2Var.p = 1;
                    obj = b32Var.b("SELECT * FROM room_table_modification_log WHERE invalidated = 1", de2Var, yz2Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Set set2 = (Set) yz2Var.m;
                        ca2.b(obj);
                        return set2;
                    }
                    b32Var = (b32) yz2Var.m;
                    ca2.b(obj);
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    yz2Var.m = set;
                    yz2Var.p = 2;
                    if (gk2.c(b32Var, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", yz2Var) == b50Var) {
                        return b50Var;
                    }
                }
                return set;
            }
        }
        yz2Var = new yz2(f03Var, r30Var);
        Object obj2 = yz2Var.n;
        b50 b50Var2 = b50.m;
        i = yz2Var.p;
        if (i != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        return set;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008c A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:13:0x0081, B:15:0x008c, B:18:0x00ca, B:19:0x009b, B:20:0x009d, B:22:0x00aa, B:24:0x00b4, B:26:0x00ba, B:27:0x00b8, B:30:0x00bf, B:33:0x00c4, B:51:0x0047, B:53:0x004f, B:56:0x005b, B:58:0x0069, B:61:0x006f), top: B:50:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(f03 f03Var, r30 r30Var) {
        a03 a03Var;
        int i;
        t21 t21Var;
        Throwable th;
        t21 t21Var2;
        Object i2;
        Set set;
        Object value;
        int[] iArr;
        MaxLineDatabase_Impl maxLineDatabase_Impl = f03Var.a;
        if (r30Var instanceof a03) {
            a03Var = (a03) r30Var;
            int i3 = a03Var.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a03Var.q = i3 - Integer.MIN_VALUE;
                Object obj = a03Var.o;
                b50 b50Var = b50.m;
                i = a03Var.q;
                o30 o30Var = null;
                int i4 = 1;
                if (i != 0) {
                    ca2.b(obj);
                    t21Var = maxLineDatabase_Impl.g;
                    if (!t21Var.g()) {
                        return fh0.m;
                    }
                    try {
                        if (!f03Var.j.compareAndSet(true, false)) {
                            fh0 fh0Var = fh0.m;
                            t21Var.K();
                            return fh0Var;
                        }
                        if (!((Boolean) f03Var.k.invoke()).booleanValue()) {
                            fh0 fh0Var2 = fh0.m;
                            t21Var.K();
                            return fh0Var2;
                        }
                        b03 b03Var = new b03(f03Var, o30Var, i4);
                        a03Var.m = f03Var;
                        a03Var.n = t21Var;
                        a03Var.q = 1;
                        i2 = maxLineDatabase_Impl.i(false, b03Var, a03Var);
                        if (i2 == b50Var) {
                            return b50Var;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        t21Var2 = t21Var;
                        t21Var2.K();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t21Var2 = a03Var.n;
                    f03 f03Var2 = a03Var.m;
                    try {
                        ca2.b(obj);
                        t21Var = t21Var2;
                        f03Var = f03Var2;
                        i2 = obj;
                    } catch (Throwable th3) {
                        th = th3;
                        t21Var2.K();
                        throw th;
                    }
                }
                set = (Set) i2;
                if (!set.isEmpty()) {
                    j70 j70Var = f03Var.i;
                    j70Var.getClass();
                    set.getClass();
                    if (!set.isEmpty()) {
                        vo2 vo2Var = j70Var.a;
                        do {
                            value = vo2Var.getValue();
                            int[] iArr2 = (int[]) value;
                            int length = iArr2.length;
                            iArr = new int[length];
                            for (int i5 = 0; i5 < length; i5++) {
                                iArr[i5] = set.contains(Integer.valueOf(i5)) ? iArr2[i5] + 1 : iArr2[i5];
                            }
                            ng0 ng0Var = yj1.k;
                            if (value == null) {
                                value = ng0Var;
                            }
                        } while (!vo2Var.j(value, iArr));
                    }
                    f03Var.e.invoke(set);
                }
                t21Var.K();
                return set;
            }
        }
        a03Var = new a03(f03Var, r30Var);
        Object obj2 = a03Var.o;
        b50 b50Var2 = b50.m;
        i = a03Var.q;
        o30 o30Var2 = null;
        int i42 = 1;
        if (i != 0) {
        }
        set = (Set) i2;
        if (!set.isEmpty()) {
        }
        t21Var.K();
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ea, code lost:
    
        if (defpackage.gk2.c(r6, r15, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ec, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r15 == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r13v6, types: [b32] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00ea -> B:11:0x00ed). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(f03 f03Var, uy2 uy2Var, int i, r30 r30Var) {
        c03 c03Var;
        int i2;
        uy2 uy2Var2;
        String[] strArr;
        f03 f03Var2;
        int i3;
        b32 b32Var;
        int i4;
        String str;
        f03Var.getClass();
        if (r30Var instanceof c03) {
            c03Var = (c03) r30Var;
            int i5 = c03Var.v;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c03Var.v = i5 - Integer.MIN_VALUE;
                Object obj = c03Var.t;
                b50 b50Var = b50.m;
                i2 = c03Var.v;
                if (i2 != 0) {
                    ca2.b(obj);
                    c03Var.m = f03Var;
                    c03Var.n = uy2Var;
                    c03Var.q = i;
                    c03Var.v = 1;
                    Object c = gk2.c(uy2Var, "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)", c03Var);
                    uy2Var2 = uy2Var;
                } else if (i2 == 1) {
                    i = c03Var.q;
                    ?? r13 = c03Var.n;
                    f03Var = c03Var.m;
                    ca2.b(obj);
                    uy2Var2 = r13;
                } else {
                    if (i2 != 2) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = c03Var.s;
                    i4 = c03Var.r;
                    i = c03Var.q;
                    strArr = c03Var.p;
                    str = c03Var.o;
                    b32Var = c03Var.n;
                    f03Var2 = c03Var.m;
                    ca2.b(obj);
                    i4++;
                    if (i4 >= i3) {
                        return Unit.a;
                    }
                    String str2 = strArr[i4];
                    String str3 = "CREATE " + (f03Var2.d ? "TEMP" : BuildConfig.FLAVOR) + " TRIGGER IF NOT EXISTS `" + ("room_table_modification_trigger_" + str + '_' + str2) + "` AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
                    c03Var.m = f03Var2;
                    c03Var.n = b32Var;
                    c03Var.o = str;
                    c03Var.p = strArr;
                    c03Var.q = i;
                    c03Var.r = i4;
                    c03Var.s = i3;
                    c03Var.v = 2;
                }
                String str4 = f03Var.g[i];
                strArr = l;
                f03Var2 = f03Var;
                i3 = 3;
                b32Var = uy2Var2;
                i4 = 0;
                str = str4;
                if (i4 >= i3) {
                }
            }
        }
        c03Var = new c03(f03Var, r30Var);
        Object obj2 = c03Var.t;
        b50 b50Var2 = b50.m;
        i2 = c03Var.v;
        if (i2 != 0) {
        }
        String str42 = f03Var.g[i];
        strArr = l;
        f03Var2 = f03Var;
        i3 = 3;
        b32Var = uy2Var2;
        i4 = 0;
        str = str42;
        if (i4 >= i3) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r4v5, types: [b32] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x008c -> B:10:0x008f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(f03 f03Var, uy2 uy2Var, int i, r30 r30Var) {
        d03 d03Var;
        int i2;
        String str;
        int i3;
        uy2 uy2Var2;
        int i4;
        String[] strArr;
        f03Var.getClass();
        if (r30Var instanceof d03) {
            d03Var = (d03) r30Var;
            int i5 = d03Var.t;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                d03Var.t = i5 - Integer.MIN_VALUE;
                Object obj = d03Var.r;
                b50 b50Var = b50.m;
                i2 = d03Var.t;
                if (i2 != 0) {
                    ca2.b(obj);
                    str = f03Var.g[i];
                    i3 = 3;
                    uy2Var2 = uy2Var;
                    i4 = 0;
                    strArr = l;
                    if (i4 < i3) {
                    }
                } else {
                    if (i2 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = d03Var.q;
                    i4 = d03Var.p;
                    String[] strArr2 = d03Var.o;
                    str = d03Var.n;
                    ?? r4 = d03Var.m;
                    ca2.b(obj);
                    strArr = strArr2;
                    uy2Var2 = r4;
                    i4++;
                    if (i4 < i3) {
                        String str2 = "DROP TRIGGER IF EXISTS `" + ("room_table_modification_trigger_" + str + '_' + strArr[i4]) + '`';
                        d03Var.m = uy2Var2;
                        d03Var.n = str;
                        d03Var.o = strArr;
                        d03Var.p = i4;
                        d03Var.q = i3;
                        d03Var.t = 1;
                        if (gk2.c(uy2Var2, str2, d03Var) == b50Var) {
                            return b50Var;
                        }
                        i4++;
                        if (i4 < i3) {
                            return Unit.a;
                        }
                    }
                }
            }
        }
        d03Var = new d03(f03Var, r30Var);
        Object obj2 = d03Var.r;
        b50 b50Var2 = b50.m;
        i2 = d03Var.t;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(r30 r30Var) {
        e03 e03Var;
        int i;
        t21 t21Var;
        if (r30Var instanceof e03) {
            e03Var = (e03) r30Var;
            int i2 = e03Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e03Var.p = i2 - Integer.MIN_VALUE;
                Object obj = e03Var.n;
                b50 b50Var = b50.m;
                i = e03Var.p;
                o30 o30Var = null;
                if (i != 0) {
                    ca2.b(obj);
                    MaxLineDatabase_Impl maxLineDatabase_Impl = this.a;
                    t21 t21Var2 = maxLineDatabase_Impl.g;
                    if (t21Var2.g()) {
                        try {
                            b03 b03Var = new b03(this, o30Var, 2);
                            e03Var.m = t21Var2;
                            e03Var.p = 1;
                            if (maxLineDatabase_Impl.i(false, b03Var, e03Var) == b50Var) {
                                return b50Var;
                            }
                            t21Var = t21Var2;
                        } catch (Throwable th) {
                            th = th;
                            t21Var = t21Var2;
                            t21Var.K();
                            throw th;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                t21Var = e03Var.m;
                try {
                    ca2.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    t21Var.K();
                    throw th;
                }
                t21Var.K();
                return Unit.a;
            }
        }
        e03Var = new e03(this, r30Var);
        Object obj2 = e03Var.n;
        b50 b50Var2 = b50.m;
        i = e03Var.p;
        o30 o30Var2 = null;
        if (i != 0) {
        }
        t21Var.K();
        return Unit.a;
    }
}
