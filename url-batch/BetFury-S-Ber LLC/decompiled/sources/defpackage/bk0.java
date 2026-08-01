package defpackage;

import com.trembin.nirefon.betfury.data.NoteDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class bk0 {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public final NoteDatabase_Impl a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final boolean d;
    public final tv e;
    public final String[] g;
    public final dq h;
    public final j40 i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public ir k = new z1(5);
    public final LinkedHashMap f = new LinkedHashMap();

    public bk0(NoteDatabase_Impl noteDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, tv tvVar) {
        String str;
        this.a = noteDatabase_Impl;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = z;
        this.e = tvVar;
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
                linkedHashMap3.put(lowerCase3, vz.Y(linkedHashMap3, lowerCase2));
            }
        }
        this.h = new dq(this.g.length);
        this.i = new j40(this.g.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (r4 == r6) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(bk0 bk0Var, v50 v50Var, eg egVar) {
        tj0 tj0Var;
        int i;
        Set set;
        if (egVar instanceof tj0) {
            tj0Var = (tj0) egVar;
            int i2 = tj0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tj0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = tj0Var.j;
                bh bhVar = bh.COROUTINE_SUSPENDED;
                i = tj0Var.l;
                if (i != 0) {
                    mv.O(obj);
                    rg rgVar = new rg(4);
                    tj0Var.i = v50Var;
                    tj0Var.l = 1;
                    obj = v50Var.d("SELECT * FROM room_table_modification_log WHERE invalidated = 1", rgVar, tj0Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            s9.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Set set2 = (Set) tj0Var.i;
                        mv.O(obj);
                        return set2;
                    }
                    v50Var = (v50) tj0Var.i;
                    mv.O(obj);
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    tj0Var.i = set;
                    tj0Var.l = 2;
                    if (mc0.e(v50Var, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", tj0Var) == bhVar) {
                        return bhVar;
                    }
                }
                return set;
            }
        }
        tj0Var = new tj0(bk0Var, egVar);
        Object obj2 = tj0Var.j;
        bh bhVar2 = bh.COROUTINE_SUSPENDED;
        i = tj0Var.l;
        if (i != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        return set;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #1 {all -> 0x008d, blocks: (B:13:0x007a, B:15:0x0082, B:32:0x0049, B:36:0x0056, B:40:0x0068), top: B:31:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(bk0 bk0Var, eg egVar) {
        uj0 uj0Var;
        int i;
        pc closeBarrier$room_runtime_release;
        Object useConnection$room_runtime_release;
        Throwable th;
        pc pcVar;
        Set set;
        NoteDatabase_Impl noteDatabase_Impl = bk0Var.a;
        if (egVar instanceof uj0) {
            uj0Var = (uj0) egVar;
            int i2 = uj0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uj0Var.m = i2 - Integer.MIN_VALUE;
                Object obj = uj0Var.k;
                bh bhVar = bh.COROUTINE_SUSPENDED;
                i = uj0Var.m;
                dg dgVar = null;
                int i3 = 1;
                if (i != 0) {
                    mv.O(obj);
                    closeBarrier$room_runtime_release = noteDatabase_Impl.getCloseBarrier$room_runtime_release();
                    boolean a = closeBarrier$room_runtime_release.a();
                    ym ymVar = ym.f;
                    if (!a) {
                        return ymVar;
                    }
                    try {
                        if (!bk0Var.j.compareAndSet(true, false)) {
                            closeBarrier$room_runtime_release.b();
                            return ymVar;
                        }
                        if (!((Boolean) bk0Var.k.a()).booleanValue()) {
                            closeBarrier$room_runtime_release.b();
                            return ymVar;
                        }
                        vj0 vj0Var = new vj0(bk0Var, dgVar, i3);
                        uj0Var.i = bk0Var;
                        uj0Var.j = closeBarrier$room_runtime_release;
                        uj0Var.m = 1;
                        useConnection$room_runtime_release = noteDatabase_Impl.useConnection$room_runtime_release(false, vj0Var, uj0Var);
                        if (useConnection$room_runtime_release == bhVar) {
                            return bhVar;
                        }
                    } catch (Throwable th2) {
                        pc pcVar2 = closeBarrier$room_runtime_release;
                        th = th2;
                        pcVar = pcVar2;
                        pcVar.b();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        s9.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pcVar = uj0Var.j;
                    bk0 bk0Var2 = uj0Var.i;
                    try {
                        mv.O(obj);
                        closeBarrier$room_runtime_release = pcVar;
                        bk0Var = bk0Var2;
                        useConnection$room_runtime_release = obj;
                    } catch (Throwable th3) {
                        th = th3;
                        pcVar.b();
                        throw th;
                    }
                }
                set = (Set) useConnection$room_runtime_release;
                if (!set.isEmpty()) {
                    bk0Var.i.a(set);
                    bk0Var.e.h(set);
                }
                closeBarrier$room_runtime_release.b();
                return set;
            }
        }
        uj0Var = new uj0(bk0Var, egVar);
        Object obj2 = uj0Var.k;
        bh bhVar2 = bh.COROUTINE_SUSPENDED;
        i = uj0Var.m;
        dg dgVar2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        set = (Set) useConnection$room_runtime_release;
        if (!set.isEmpty()) {
        }
        closeBarrier$room_runtime_release.b();
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ea, code lost:
    
        if (defpackage.mc0.e(r6, r15, r0) == r1) goto L27;
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
    /* JADX WARN: Type inference failed for: r13v6, types: [v50] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00ea -> B:11:0x00ed). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(bk0 bk0Var, ej0 ej0Var, int i, eg egVar) {
        wj0 wj0Var;
        int i2;
        ej0 ej0Var2;
        String[] strArr;
        bk0 bk0Var2;
        int i3;
        v50 v50Var;
        int i4;
        String str;
        bk0Var.getClass();
        if (egVar instanceof wj0) {
            wj0Var = (wj0) egVar;
            int i5 = wj0Var.r;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                wj0Var.r = i5 - Integer.MIN_VALUE;
                Object obj = wj0Var.p;
                bh bhVar = bh.COROUTINE_SUSPENDED;
                i2 = wj0Var.r;
                if (i2 != 0) {
                    mv.O(obj);
                    wj0Var.i = bk0Var;
                    wj0Var.j = ej0Var;
                    wj0Var.m = i;
                    wj0Var.r = 1;
                    Object e = mc0.e(ej0Var, "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)", wj0Var);
                    ej0Var2 = ej0Var;
                } else if (i2 == 1) {
                    i = wj0Var.m;
                    ?? r13 = wj0Var.j;
                    bk0Var = wj0Var.i;
                    mv.O(obj);
                    ej0Var2 = r13;
                } else {
                    if (i2 != 2) {
                        s9.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = wj0Var.o;
                    i4 = wj0Var.n;
                    i = wj0Var.m;
                    strArr = wj0Var.l;
                    str = wj0Var.k;
                    v50Var = wj0Var.j;
                    bk0Var2 = wj0Var.i;
                    mv.O(obj);
                    i4++;
                    if (i4 >= i3) {
                        return sk0.a;
                    }
                    String str2 = strArr[i4];
                    String str3 = "CREATE " + (bk0Var2.d ? "TEMP" : "") + " TRIGGER IF NOT EXISTS `" + ("room_table_modification_trigger_" + str + '_' + str2) + "` AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
                    wj0Var.i = bk0Var2;
                    wj0Var.j = v50Var;
                    wj0Var.k = str;
                    wj0Var.l = strArr;
                    wj0Var.m = i;
                    wj0Var.n = i4;
                    wj0Var.o = i3;
                    wj0Var.r = 2;
                }
                String str4 = bk0Var.g[i];
                strArr = l;
                bk0Var2 = bk0Var;
                i3 = 3;
                v50Var = ej0Var2;
                i4 = 0;
                str = str4;
                if (i4 >= i3) {
                }
            }
        }
        wj0Var = new wj0(bk0Var, egVar);
        Object obj2 = wj0Var.p;
        bh bhVar2 = bh.COROUTINE_SUSPENDED;
        i2 = wj0Var.r;
        if (i2 != 0) {
        }
        String str42 = bk0Var.g[i];
        strArr = l;
        bk0Var2 = bk0Var;
        i3 = 3;
        v50Var = ej0Var2;
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
    /* JADX WARN: Type inference failed for: r4v5, types: [v50] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x008c -> B:10:0x008f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(bk0 bk0Var, ej0 ej0Var, int i, eg egVar) {
        xj0 xj0Var;
        int i2;
        String str;
        int i3;
        ej0 ej0Var2;
        int i4;
        String[] strArr;
        bk0Var.getClass();
        if (egVar instanceof xj0) {
            xj0Var = (xj0) egVar;
            int i5 = xj0Var.p;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                xj0Var.p = i5 - Integer.MIN_VALUE;
                Object obj = xj0Var.n;
                bh bhVar = bh.COROUTINE_SUSPENDED;
                i2 = xj0Var.p;
                if (i2 != 0) {
                    mv.O(obj);
                    str = bk0Var.g[i];
                    i3 = 3;
                    ej0Var2 = ej0Var;
                    i4 = 0;
                    strArr = l;
                    if (i4 < i3) {
                    }
                } else {
                    if (i2 != 1) {
                        s9.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = xj0Var.m;
                    i4 = xj0Var.l;
                    String[] strArr2 = xj0Var.k;
                    str = xj0Var.j;
                    ?? r4 = xj0Var.i;
                    mv.O(obj);
                    strArr = strArr2;
                    ej0Var2 = r4;
                    i4++;
                    if (i4 < i3) {
                        String str2 = "DROP TRIGGER IF EXISTS `" + ("room_table_modification_trigger_" + str + '_' + strArr[i4]) + '`';
                        xj0Var.i = ej0Var2;
                        xj0Var.j = str;
                        xj0Var.k = strArr;
                        xj0Var.l = i4;
                        xj0Var.m = i3;
                        xj0Var.p = 1;
                        if (mc0.e(ej0Var2, str2, xj0Var) == bhVar) {
                            return bhVar;
                        }
                        i4++;
                        if (i4 < i3) {
                            return sk0.a;
                        }
                    }
                }
            }
        }
        xj0Var = new xj0(bk0Var, egVar);
        Object obj2 = xj0Var.n;
        bh bhVar2 = bh.COROUTINE_SUSPENDED;
        i2 = xj0Var.p;
        if (i2 != 0) {
        }
    }

    public final void e(ir irVar, ir irVar2) {
        irVar.getClass();
        irVar2.getClass();
        if (this.j.compareAndSet(false, true)) {
            irVar.a();
            gk0.y(this.a.getCoroutineScope(), new vg(), new je(this, irVar2, null, 3), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(eg egVar) {
        yj0 yj0Var;
        int i;
        pc pcVar;
        if (egVar instanceof yj0) {
            yj0Var = (yj0) egVar;
            int i2 = yj0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yj0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = yj0Var.j;
                bh bhVar = bh.COROUTINE_SUSPENDED;
                i = yj0Var.l;
                dg dgVar = null;
                if (i != 0) {
                    mv.O(obj);
                    NoteDatabase_Impl noteDatabase_Impl = this.a;
                    pc closeBarrier$room_runtime_release = noteDatabase_Impl.getCloseBarrier$room_runtime_release();
                    if (closeBarrier$room_runtime_release.a()) {
                        try {
                            vj0 vj0Var = new vj0(this, dgVar, 2);
                            yj0Var.i = closeBarrier$room_runtime_release;
                            yj0Var.l = 1;
                            if (noteDatabase_Impl.useConnection$room_runtime_release(false, vj0Var, yj0Var) == bhVar) {
                                return bhVar;
                            }
                            pcVar = closeBarrier$room_runtime_release;
                        } catch (Throwable th) {
                            th = th;
                            pcVar = closeBarrier$room_runtime_release;
                            pcVar.b();
                            throw th;
                        }
                    }
                    return sk0.a;
                }
                if (i != 1) {
                    s9.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pcVar = yj0Var.i;
                try {
                    mv.O(obj);
                } catch (Throwable th2) {
                    th = th2;
                    pcVar.b();
                    throw th;
                }
                pcVar.b();
                return sk0.a;
            }
        }
        yj0Var = new yj0(this, egVar);
        Object obj2 = yj0Var.j;
        bh bhVar2 = bh.COROUTINE_SUSPENDED;
        i = yj0Var.l;
        dg dgVar2 = null;
        if (i != 0) {
        }
        pcVar.b();
        return sk0.a;
    }

    public final k50 g(String[] strArr) {
        ad0 ad0Var = new ad0();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) this.c.get(lowerCase);
            if (set != null) {
                ad0Var.addAll(set);
            } else {
                ad0Var.add(str);
            }
        }
        String[] strArr2 = (String[]) bd0.a(ad0Var).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) this.f.get(lowerCase2);
            if (num == null) {
                s9.k("There is no table with name ".concat(str2));
                return null;
            }
            iArr[i] = num.intValue();
        }
        return new k50(strArr2, iArr);
    }
}
