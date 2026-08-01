package z4;

import ge.f1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f10796k = {"INSERT", "UPDATE", "DELETE"};

    /* renamed from: a, reason: collision with root package name */
    public final u f10797a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f10798b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10799c;

    /* renamed from: d, reason: collision with root package name */
    public final f1 f10800d;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f10802f;
    public final j g;

    /* renamed from: h, reason: collision with root package name */
    public final x3.a0 f10803h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f10804i = new AtomicBoolean(false);
    public Function0 j = new n0.u(15);

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f10801e = new LinkedHashMap();

    public n0(u uVar, HashMap hashMap, HashMap hashMap2, String[] strArr, boolean z10, f1 f1Var) {
        String str;
        this.f10797a = uVar;
        this.f10798b = hashMap;
        this.f10799c = z10;
        this.f10800d = f1Var;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i3 = 0; i3 < length; i3++) {
            String str2 = strArr[i3];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            this.f10801e.put(lowerCase, Integer.valueOf(i3));
            String str3 = (String) this.f10798b.get(strArr[i3]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                str.getClass();
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i3] = lowerCase;
        }
        this.f10802f = strArr2;
        for (Map.Entry entry : this.f10798b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = str4.toLowerCase(locale2);
            lowerCase2.getClass();
            if (this.f10801e.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase3.getClass();
                LinkedHashMap linkedHashMap = this.f10801e;
                linkedHashMap.put(lowerCase3, p0.c(lowerCase2, linkedHashMap));
            }
        }
        this.g = new j(this.f10802f.length);
        this.f10803h = new x3.a0(this.f10802f.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r4 == r6) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(n0 n0Var, l lVar, nd.c cVar) {
        g0 g0Var;
        int i3;
        Set set;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i10 = g0Var.f10746r;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                g0Var.f10746r = i10 - Integer.MIN_VALUE;
                Object obj = g0Var.f10744e;
                md.a aVar = md.a.f6622d;
                i3 = g0Var.f10746r;
                if (i3 != 0) {
                    cf.c.M(obj);
                    q4.f fVar = new q4.f(26);
                    g0Var.f10743d = lVar;
                    g0Var.f10746r = 1;
                    obj = lVar.c("SELECT * FROM room_table_modification_log WHERE invalidated = 1", fVar, g0Var);
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Set set2 = (Set) g0Var.f10743d;
                        cf.c.M(obj);
                        return set2;
                    }
                    lVar = (l) g0Var.f10743d;
                    cf.c.M(obj);
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    g0Var.f10743d = set;
                    g0Var.f10746r = 2;
                    if (f0.b(lVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", g0Var) == aVar) {
                        return aVar;
                    }
                }
                return set;
            }
        }
        g0Var = new g0(n0Var, cVar);
        Object obj2 = g0Var.f10744e;
        md.a aVar2 = md.a.f6622d;
        i3 = g0Var.f10746r;
        if (i3 != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        return set;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0087 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x007c, B:14:0x0087, B:17:0x00c0, B:19:0x0096, B:20:0x0098, B:22:0x00a5, B:24:0x00af, B:26:0x00b5, B:27:0x00b3, B:30:0x00ba), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(n0 n0Var, nd.c cVar) {
        h0 h0Var;
        int i3;
        c6.e eVar;
        Set set;
        Object value;
        int[] iArr;
        u uVar = n0Var.f10797a;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i10 = h0Var.f10751r;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                h0Var.f10751r = i10 - Integer.MIN_VALUE;
                Object obj = h0Var.f10749e;
                md.a aVar = md.a.f6622d;
                i3 = h0Var.f10751r;
                if (i3 != 0) {
                    cf.c.M(obj);
                    c6.e eVar2 = uVar.g;
                    if (!eVar2.f()) {
                        return kotlin.collections.l0.f5576d;
                    }
                    try {
                        if (!n0Var.f10804i.compareAndSet(true, false)) {
                            kotlin.collections.l0 l0Var = kotlin.collections.l0.f5576d;
                            eVar2.s();
                            return l0Var;
                        }
                        if (!((Boolean) n0Var.j.invoke()).booleanValue()) {
                            kotlin.collections.l0 l0Var2 = kotlin.collections.l0.f5576d;
                            eVar2.s();
                            return l0Var2;
                        }
                        i0 i0Var = new i0(n0Var, null, 1);
                        h0Var.f10748d = eVar2;
                        h0Var.f10751r = 1;
                        Object v10 = uVar.v(false, i0Var, h0Var);
                        if (v10 == aVar) {
                            return aVar;
                        }
                        eVar = eVar2;
                        obj = v10;
                    } catch (Throwable th) {
                        th = th;
                        eVar = eVar2;
                        eVar.s();
                        throw th;
                    }
                } else {
                    if (i3 != 1) {
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eVar = h0Var.f10748d;
                    try {
                        cf.c.M(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        eVar.s();
                        throw th;
                    }
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    x3.a0 a0Var = n0Var.f10803h;
                    a0Var.getClass();
                    set.getClass();
                    if (!set.isEmpty()) {
                        je.l0 l0Var3 = a0Var.f10339a;
                        do {
                            value = l0Var3.getValue();
                            int[] iArr2 = (int[]) value;
                            int length = iArr2.length;
                            iArr = new int[length];
                            for (int i11 = 0; i11 < length; i11++) {
                                iArr[i11] = set.contains(Integer.valueOf(i11)) ? iArr2[i11] + 1 : iArr2[i11];
                            }
                        } while (!l0Var3.i(value, iArr));
                    }
                    n0Var.f10800d.invoke(set);
                }
                eVar.s();
                return set;
            }
        }
        h0Var = new h0(n0Var, cVar);
        Object obj2 = h0Var.f10749e;
        md.a aVar2 = md.a.f6622d;
        i3 = h0Var.f10751r;
        if (i3 != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        eVar.s();
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00db, code lost:
    
        if (z4.f0.b(r7, r15, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00dd, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r15 == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r13v5, types: [z4.l] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00db -> B:11:0x00de). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(n0 n0Var, e0 e0Var, int i3, nd.c cVar) {
        j0 j0Var;
        int i10;
        e0 e0Var2;
        int i11;
        int i12;
        String[] strArr;
        l lVar;
        int i13;
        String str;
        n0Var.getClass();
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i14 = j0Var.f10773w;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                j0Var.f10773w = i14 - Integer.MIN_VALUE;
                Object obj = j0Var.f10771u;
                md.a aVar = md.a.f6622d;
                i10 = j0Var.f10773w;
                if (i10 != 0) {
                    cf.c.M(obj);
                    j0Var.f10765d = e0Var;
                    j0Var.f10768r = i3;
                    j0Var.f10773w = 1;
                    Object b10 = f0.b(e0Var, "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i3 + ", 0)", j0Var);
                    e0Var2 = e0Var;
                } else if (i10 == 1) {
                    i3 = j0Var.f10768r;
                    ?? r13 = j0Var.f10765d;
                    cf.c.M(obj);
                    e0Var2 = r13;
                } else {
                    if (i10 != 2) {
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i13 = j0Var.f10770t;
                    i12 = j0Var.f10769s;
                    i11 = j0Var.f10768r;
                    strArr = j0Var.f10767i;
                    str = j0Var.f10766e;
                    lVar = j0Var.f10765d;
                    cf.c.M(obj);
                    i12++;
                    if (i12 >= i13) {
                        return Unit.f5554a;
                    }
                    String str2 = strArr[i12];
                    String str3 = n0Var.f10799c ? "TEMP" : "";
                    StringBuilder sb2 = new StringBuilder("CREATE ");
                    sb2.append(str3);
                    sb2.append(" TRIGGER IF NOT EXISTS `");
                    sb2.append("room_table_modification_trigger_" + str + '_' + str2);
                    sb2.append("` AFTER ");
                    n0.l.l(sb2, str2, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
                    sb2.append(i11);
                    sb2.append(" AND invalidated = 0; END");
                    String sb3 = sb2.toString();
                    j0Var.f10765d = lVar;
                    j0Var.f10766e = str;
                    j0Var.f10767i = strArr;
                    j0Var.f10768r = i11;
                    j0Var.f10769s = i12;
                    j0Var.f10770t = i13;
                    j0Var.f10773w = 2;
                }
                String str4 = n0Var.f10802f[i3];
                i11 = i3;
                i12 = 0;
                strArr = f10796k;
                lVar = e0Var2;
                i13 = 3;
                str = str4;
                if (i12 >= i13) {
                }
            }
        }
        j0Var = new j0(n0Var, cVar);
        Object obj2 = j0Var.f10771u;
        md.a aVar2 = md.a.f6622d;
        i10 = j0Var.f10773w;
        if (i10 != 0) {
        }
        String str42 = n0Var.f10802f[i3];
        i11 = i3;
        i12 = 0;
        strArr = f10796k;
        lVar = e0Var2;
        i13 = 3;
        str = str42;
        if (i12 >= i13) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r4v5, types: [z4.l] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x008c -> B:10:0x008f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(n0 n0Var, e0 e0Var, int i3, nd.c cVar) {
        k0 k0Var;
        int i10;
        String str;
        int i11;
        e0 e0Var2;
        int i12;
        String[] strArr;
        n0Var.getClass();
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i13 = k0Var.f10781v;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                k0Var.f10781v = i13 - Integer.MIN_VALUE;
                Object obj = k0Var.f10779t;
                md.a aVar = md.a.f6622d;
                i10 = k0Var.f10781v;
                if (i10 != 0) {
                    cf.c.M(obj);
                    str = n0Var.f10802f[i3];
                    i11 = 3;
                    e0Var2 = e0Var;
                    i12 = 0;
                    strArr = f10796k;
                    if (i12 < i11) {
                    }
                } else {
                    if (i10 != 1) {
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i11 = k0Var.f10778s;
                    i12 = k0Var.f10777r;
                    String[] strArr2 = k0Var.f10776i;
                    str = k0Var.f10775e;
                    ?? r42 = k0Var.f10774d;
                    cf.c.M(obj);
                    strArr = strArr2;
                    e0Var2 = r42;
                    i12++;
                    if (i12 < i11) {
                        String str2 = "DROP TRIGGER IF EXISTS `" + ("room_table_modification_trigger_" + str + '_' + strArr[i12]) + '`';
                        k0Var.f10774d = e0Var2;
                        k0Var.f10775e = str;
                        k0Var.f10776i = strArr;
                        k0Var.f10777r = i12;
                        k0Var.f10778s = i11;
                        k0Var.f10781v = 1;
                        if (f0.b(e0Var2, str2, k0Var) == aVar) {
                            return aVar;
                        }
                        i12++;
                        if (i12 < i11) {
                            return Unit.f5554a;
                        }
                    }
                }
            }
        }
        k0Var = new k0(n0Var, cVar);
        Object obj2 = k0Var.f10779t;
        md.a aVar2 = md.a.f6622d;
        i10 = k0Var.f10781v;
        if (i10 != 0) {
        }
    }

    public final void e(Function0 function0, Function0 function02) {
        function0.getClass();
        function02.getClass();
        if (this.f10804i.compareAndSet(false, true)) {
            function0.invoke();
            le.d dVar = this.f10797a.f10834a;
            ld.a aVar = null;
            if (dVar != null) {
                ge.a0.s(dVar, new ge.w(), new a3.t(this, function02, aVar, 28), 2);
            } else {
                Intrinsics.f("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(nd.c cVar) {
        l0 l0Var;
        int i3;
        c6.e eVar;
        if (cVar instanceof l0) {
            l0Var = (l0) cVar;
            int i10 = l0Var.f10785r;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                l0Var.f10785r = i10 - Integer.MIN_VALUE;
                Object obj = l0Var.f10783e;
                md.a aVar = md.a.f6622d;
                i3 = l0Var.f10785r;
                if (i3 != 0) {
                    cf.c.M(obj);
                    u uVar = this.f10797a;
                    c6.e eVar2 = uVar.g;
                    if (eVar2.f()) {
                        try {
                            b5.t tVar = new b5.t(this, (ld.a) null, 18);
                            l0Var.f10782d = eVar2;
                            l0Var.f10785r = 1;
                            if (uVar.v(false, tVar, l0Var) == aVar) {
                                return aVar;
                            }
                            eVar = eVar2;
                        } catch (Throwable th) {
                            th = th;
                            eVar = eVar2;
                            eVar.s();
                            throw th;
                        }
                    }
                    return Unit.f5554a;
                }
                if (i3 != 1) {
                    kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                eVar = l0Var.f10782d;
                try {
                    cf.c.M(obj);
                } catch (Throwable th2) {
                    th = th2;
                    eVar.s();
                    throw th;
                }
                eVar.s();
                return Unit.f5554a;
            }
        }
        l0Var = new l0(this, cVar);
        Object obj2 = l0Var.f10783e;
        md.a aVar2 = md.a.f6622d;
        i3 = l0Var.f10785r;
        if (i3 != 0) {
        }
        eVar.s();
        return Unit.f5554a;
    }
}
