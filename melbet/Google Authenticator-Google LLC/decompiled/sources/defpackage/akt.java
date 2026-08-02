package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akt {
    public static final /* synthetic */ int h = 0;
    private static final String[] i = {"INSERT", "UPDATE", "DELETE"};
    public final ajw a;
    public final Map b;
    public final boolean c;
    public final ajn e;
    public final brn g;
    private final Map j;
    private final krt k;
    private final String[] l;
    private final AtomicBoolean m = new AtomicBoolean(false);
    public kri f = new aji(3);
    public final Map d = new LinkedHashMap();

    public akt(ajw ajwVar, Map map, Map map2, String[] strArr, boolean z, krt krtVar) {
        String str;
        this.a = ajwVar;
        this.j = map;
        this.b = map2;
        this.c = z;
        this.k = krtVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String lowerCase = strArr[i2].toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            this.d.put(lowerCase, Integer.valueOf(i2));
            String str2 = (String) this.j.get(strArr[i2]);
            if (str2 != null) {
                str = str2.toLowerCase(Locale.ROOT);
                str.getClass();
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i2] = lowerCase;
        }
        this.l = strArr2;
        for (Map.Entry entry : this.j.entrySet()) {
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            if (this.d.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
                lowerCase3.getClass();
                Map map3 = this.d;
                map3.put(lowerCase3, ixd.p(map3, lowerCase2));
            }
        }
        this.e = new ajn(this.l.length);
        this.g = new brn(this.l.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r4 != r6) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ajp ajpVar, kqj kqjVar) {
        akh akhVar;
        int i2;
        Set set;
        if (kqjVar instanceof akh) {
            akhVar = (akh) kqjVar;
            int i3 = akhVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                akhVar.d = i3 - Integer.MIN_VALUE;
                Object obj = akhVar.b;
                kqp kqpVar = kqp.a;
                i2 = akhVar.d;
                if (i2 != 0) {
                    ixc.Y(obj);
                    ajt ajtVar = new ajt(3);
                    akhVar.a = ajpVar;
                    akhVar.d = 1;
                    obj = ajpVar.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1", ajtVar, akhVar);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Set set2 = (Set) akhVar.a;
                        ixc.Y(obj);
                        return set2;
                    }
                    ajpVar = (ajp) akhVar.a;
                    ixc.Y(obj);
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    akhVar.a = set;
                    akhVar.d = 2;
                    if (zx.d(ajpVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", akhVar) == kqpVar) {
                        return kqpVar;
                    }
                }
                return set;
            }
        }
        akhVar = new akh(this, kqjVar);
        Object obj2 = akhVar.b;
        kqp kqpVar2 = kqp.a;
        i2 = akhVar.d;
        if (i2 != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        return set;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x0075, B:14:0x007d, B:17:0x00bd, B:19:0x0089, B:20:0x008b, B:22:0x009b, B:24:0x00a5, B:26:0x00ab, B:27:0x00a9, B:31:0x00b2, B:32:0x00b4), top: B:10:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(kqj kqjVar) {
        akm akmVar;
        int i2;
        brr brrVar;
        Set set;
        Object b;
        int[] iArr;
        if (kqjVar instanceof akm) {
            akmVar = (akm) kqjVar;
            int i3 = akmVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                akmVar.c = i3 - Integer.MIN_VALUE;
                Object obj = akmVar.a;
                kqp kqpVar = kqp.a;
                i2 = akmVar.c;
                if (i2 != 0) {
                    ixc.Y(obj);
                    ajw ajwVar = this.a;
                    brr brrVar2 = ajwVar.j;
                    if (!brrVar2.l()) {
                        return kpm.a;
                    }
                    try {
                        if (!this.m.compareAndSet(true, false)) {
                            kpm kpmVar = kpm.a;
                            brrVar2.k();
                            return kpmVar;
                        }
                        if (!((Boolean) this.f.a()).booleanValue()) {
                            kpm kpmVar2 = kpm.a;
                            brrVar2.k();
                            return kpmVar2;
                        }
                        akn aknVar = new akn(this, (kqj) null, 0);
                        akmVar.d = brrVar2;
                        akmVar.c = 1;
                        obj = ajwVar.v(aknVar, akmVar);
                        if (obj == kqpVar) {
                            return kqpVar;
                        }
                        brrVar = brrVar2;
                    } catch (Throwable th) {
                        th = th;
                        brrVar = brrVar2;
                        brrVar.k();
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    brrVar = akmVar.d;
                    try {
                        ixc.Y(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        brrVar.k();
                        throw th;
                    }
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    brn brnVar = this.g;
                    set.getClass();
                    if (!set.isEmpty()) {
                        Object obj2 = brnVar.a;
                        do {
                            b = ((lao) obj2).b();
                            int[] iArr2 = (int[]) b;
                            int length = iArr2.length;
                            iArr = new int[length];
                            for (int i4 = 0; i4 < length; i4++) {
                                iArr[i4] = set.contains(Integer.valueOf(i4)) ? iArr2[i4] + 1 : iArr2[i4];
                            }
                            if (b == null) {
                                b = lbd.a;
                            }
                        } while (!((lao) obj2).e(b, iArr));
                    }
                    this.k.a(set);
                }
                brrVar.k();
                return set;
            }
        }
        akmVar = new akm(this, kqjVar);
        Object obj3 = akmVar.a;
        kqp kqpVar2 = kqp.a;
        i2 = akmVar.c;
        if (i2 != 0) {
        }
        set = (Set) obj3;
        if (!set.isEmpty()) {
        }
        brrVar.k();
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c8, code lost:
    
        if (defpackage.zx.d(r7, r15, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (defpackage.zx.d(r13, r15, r0) != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00c8 -> B:11:0x00cb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ajp ajpVar, int i2, kqj kqjVar) {
        ako akoVar;
        int i3;
        ajp ajpVar2;
        int i4;
        String[] strArr;
        int i5;
        int i6;
        String str;
        if (kqjVar instanceof ako) {
            akoVar = (ako) kqjVar;
            int i7 = akoVar.f;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                akoVar.f = i7 - Integer.MIN_VALUE;
                Object obj = akoVar.d;
                kqp kqpVar = kqp.a;
                i3 = akoVar.f;
                if (i3 != 0) {
                    ixc.Y(obj);
                    String ai = a.ai(i2, "INSERT OR IGNORE INTO room_table_modification_log VALUES(", ", 0)");
                    akoVar.i = (ald) ajpVar;
                    akoVar.a = i2;
                    akoVar.f = 1;
                } else if (i3 == 1) {
                    i2 = akoVar.a;
                    ajpVar = akoVar.i;
                    ixc.Y(obj);
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i4 = akoVar.c;
                    i6 = akoVar.b;
                    i5 = akoVar.a;
                    strArr = akoVar.h;
                    str = akoVar.g;
                    ajpVar2 = akoVar.i;
                    ixc.Y(obj);
                    i6++;
                    if (i6 >= i4) {
                        return kow.a;
                    }
                    String str2 = strArr[i6];
                    boolean z = this.c;
                    String c = zx.c(str, str2);
                    StringBuilder sb = new StringBuilder("CREATE ");
                    sb.append(true != z ? "" : "TEMP");
                    sb.append(" TRIGGER IF NOT EXISTS `");
                    sb.append(c);
                    sb.append("` AFTER ");
                    sb.append(str2);
                    sb.append(" ON `");
                    sb.append(str);
                    sb.append("` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
                    sb.append(i5);
                    sb.append(" AND invalidated = 0; END");
                    String sb2 = sb.toString();
                    akoVar.i = (ald) ajpVar2;
                    akoVar.g = str;
                    akoVar.h = strArr;
                    akoVar.a = i5;
                    akoVar.b = i6;
                    akoVar.c = i4;
                    akoVar.f = 2;
                }
                String str3 = this.l[i2];
                ajpVar2 = ajpVar;
                i4 = 3;
                strArr = i;
                i5 = i2;
                i6 = 0;
                str = str3;
                if (i6 >= i4) {
                }
            }
        }
        akoVar = new ako(this, kqjVar);
        Object obj2 = akoVar.d;
        kqp kqpVar2 = kqp.a;
        i3 = akoVar.f;
        if (i3 != 0) {
        }
        String str32 = this.l[i2];
        ajpVar2 = ajpVar;
        i4 = 3;
        strArr = i;
        i5 = i2;
        i6 = 0;
        str = str32;
        if (i6 >= i4) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x007a -> B:10:0x007d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ajp ajpVar, int i2, kqj kqjVar) {
        akp akpVar;
        int i3;
        String str;
        int i4;
        String[] strArr;
        ajp ajpVar2;
        int i5;
        if (kqjVar instanceof akp) {
            akpVar = (akp) kqjVar;
            int i6 = akpVar.e;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                akpVar.e = i6 - Integer.MIN_VALUE;
                Object obj = akpVar.c;
                kqp kqpVar = kqp.a;
                i3 = akpVar.e;
                if (i3 != 0) {
                    ixc.Y(obj);
                    str = this.l[i2];
                    i4 = 3;
                    strArr = i;
                    ajpVar2 = ajpVar;
                    i5 = 0;
                    if (i5 < i4) {
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i4 = akpVar.b;
                    i5 = akpVar.a;
                    String[] strArr2 = akpVar.g;
                    str = akpVar.f;
                    ald aldVar = akpVar.h;
                    ixc.Y(obj);
                    strArr = strArr2;
                    ajpVar2 = aldVar;
                    i5++;
                    if (i5 < i4) {
                        String str2 = "DROP TRIGGER IF EXISTS `" + zx.c(str, strArr[i5]) + '`';
                        akpVar.h = (ald) ajpVar2;
                        akpVar.f = str;
                        akpVar.g = strArr;
                        akpVar.a = i5;
                        akpVar.b = i4;
                        akpVar.e = 1;
                        if (zx.d(ajpVar2, str2, akpVar) == kqpVar) {
                            return kqpVar;
                        }
                        i5++;
                        if (i5 < i4) {
                            return kow.a;
                        }
                    }
                }
            }
        }
        akpVar = new akp(this, kqjVar);
        Object obj2 = akpVar.c;
        kqp kqpVar2 = kqp.a;
        i3 = akpVar.e;
        if (i3 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(kqj kqjVar) {
        akq akqVar;
        int i2;
        Throwable th;
        brr brrVar;
        if (kqjVar instanceof akq) {
            akqVar = (akq) kqjVar;
            int i3 = akqVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                akqVar.c = i3 - Integer.MIN_VALUE;
                Object obj = akqVar.a;
                kqp kqpVar = kqp.a;
                i2 = akqVar.c;
                if (i2 != 0) {
                    ixc.Y(obj);
                    ajw ajwVar = this.a;
                    brr brrVar2 = ajwVar.j;
                    if (brrVar2.l()) {
                        try {
                            aks aksVar = new aks(this, null);
                            akqVar.d = brrVar2;
                            akqVar.c = 1;
                            if (ajwVar.v(aksVar, akqVar) == kqpVar) {
                                return kqpVar;
                            }
                            brrVar = brrVar2;
                        } catch (Throwable th2) {
                            th = th2;
                            brrVar = brrVar2;
                            brrVar.k();
                            throw th;
                        }
                    }
                    return kow.a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                brrVar = akqVar.d;
                try {
                    ixc.Y(obj);
                } catch (Throwable th3) {
                    th = th3;
                    brrVar.k();
                    throw th;
                }
                brrVar.k();
                return kow.a;
            }
        }
        akqVar = new akq(this, kqjVar);
        Object obj2 = akqVar.a;
        kqp kqpVar2 = kqp.a;
        i2 = akqVar.c;
        if (i2 != 0) {
        }
        brrVar.k();
        return kow.a;
    }

    public final void f(kri kriVar, kri kriVar2) {
        kriVar.getClass();
        kriVar2.getClass();
        if (this.m.compareAndSet(false, true)) {
            kvm kvmVar = this.a.a;
            if (kvmVar == null) {
                ksp.a("coroutineScope");
                kvmVar = null;
            }
            ixg.i(kvmVar, new kvl(), 0, new alg(this, kriVar2, (kqj) null, 1), 2);
        }
    }
}
