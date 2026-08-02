package defpackage;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayi {
    private static final String a = asq.b("EnqueueRunnable");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0192 A[Catch: all -> 0x0285, TryCatch #1 {all -> 0x0285, blocks: (B:14:0x0043, B:15:0x0053, B:17:0x0059, B:21:0x0096, B:22:0x006c, B:23:0x0071, B:25:0x0077, B:28:0x0089, B:34:0x008e, B:35:0x0095, B:41:0x00a9, B:47:0x00e1, B:64:0x00ef, B:49:0x0107, B:52:0x0111, B:56:0x011f, B:57:0x0119, B:74:0x0130, B:77:0x0138, B:81:0x014c, B:82:0x0150, B:84:0x0156, B:86:0x0162, B:93:0x0167, B:94:0x0172, B:96:0x0178, B:99:0x0188, B:100:0x018c, B:102:0x0192, B:106:0x01a0, B:136:0x009b), top: B:13:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.util.Set] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(auj aujVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        WorkDatabase workDatabase;
        boolean z6;
        WorkDatabase workDatabase2;
        int i;
        HashSet hashSet = new HashSet();
        List list = aujVar.d;
        hashSet.addAll(list);
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (hashSet2.contains((String) it.next())) {
                throw new IllegalStateException(a.ab(aujVar, "WorkContinuation has cycles (", ")"));
            }
        }
        hashSet.removeAll(list);
        auy auyVar = aujVar.a;
        WorkDatabase workDatabase3 = auyVar.d;
        workDatabase3.getClass();
        workDatabase3.m();
        try {
            auyVar.c.getClass();
            boolean z7 = true;
            List c = ixc.c(aujVar);
            int i2 = 0;
            while (!c.isEmpty()) {
                List list2 = ((auj) ixc.e(c)).c;
                list2.getClass();
                if (list2.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it2 = list2.iterator();
                    i = 0;
                    while (it2.hasNext()) {
                        if (((axt) ((bvw) it2.next()).b).k.b() && (i = i + 1) < 0) {
                            throw new ArithmeticException("Count overflow has happened.");
                        }
                    }
                }
                i2 += i;
            }
            try {
                if (i2 != 0) {
                    int a2 = workDatabase3.C().a();
                    if (a2 + i2 > 8) {
                        throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: 8;\nalready enqueued count: " + a2 + ";\ncurrent enqueue operation count: " + i2 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
                    }
                }
                HashSet hashSet3 = new HashSet();
                List<bvw> list3 = aujVar.c;
                list3.getClass();
                String[] strArr = (String[]) hashSet3.toArray(new String[0]);
                String str = aujVar.b;
                int i3 = aujVar.f;
                auyVar.k.getClass();
                yp ypVar = auyVar.c.n;
                long currentTimeMillis = System.currentTimeMillis();
                WorkDatabase workDatabase4 = auyVar.d;
                workDatabase4.getClass();
                int length = strArr.length;
                boolean z8 = length != 0;
                if (length != 0) {
                    z2 = true;
                    int i4 = 0;
                    z3 = false;
                    z4 = false;
                    while (i4 < length) {
                        String str2 = strArr[i4];
                        z = z7;
                        axt c2 = workDatabase4.C().c(str2);
                        if (c2 == null) {
                            asq.a().c(a, a.Z(str2, "Prerequisite ", " doesn't exist; not enqueuing"));
                            break;
                        }
                        atb atbVar = c2.c;
                        z2 &= atbVar == atb.c ? z : false;
                        if (atbVar == atb.d) {
                            z3 = z;
                        } else if (atbVar == atb.f) {
                            z4 = z;
                        }
                        i4++;
                        z7 = z;
                    }
                    z = z7;
                } else {
                    z = true;
                    z2 = true;
                    z3 = false;
                    z4 = false;
                }
                boolean isEmpty = TextUtils.isEmpty(str);
                if (!isEmpty && !z8) {
                    axu C = workDatabase4.C();
                    str.getClass();
                    List k = C.k(str);
                    if (!k.isEmpty()) {
                        if (i3 == 2) {
                            Iterator it3 = k.iterator();
                            while (it3.hasNext()) {
                                atb atbVar2 = ((axr) it3.next()).b;
                                if (atbVar2 != atb.a && atbVar2 != atb.b) {
                                }
                                workDatabase = workDatabase3;
                                z6 = z;
                                z5 = false;
                            }
                        }
                        aei.i(str, auyVar);
                        axu C2 = workDatabase4.C();
                        Iterator it4 = k.iterator();
                        while (it4.hasNext()) {
                            C2.m(((axr) it4.next()).a);
                        }
                        z5 = z;
                        for (bvw bvwVar : list3) {
                            Object obj = bvwVar.b;
                            if (!z8 || z2) {
                                workDatabase2 = workDatabase3;
                                ((axt) obj).o = currentTimeMillis;
                            } else if (z3) {
                                workDatabase2 = workDatabase3;
                                ((axt) obj).c = atb.d;
                            } else {
                                workDatabase2 = workDatabase3;
                                ((axt) obj).c = z4 ? atb.f : atb.e;
                            }
                            boolean z9 = z5 | (!(((axt) obj).c == atb.a ? false : z));
                            axu C3 = workDatabase4.C();
                            auyVar.e.getClass();
                            C3.o(aei.f((axt) obj));
                            if (z8) {
                                int length2 = strArr.length;
                                int i5 = 0;
                                while (i5 < length2) {
                                    workDatabase4.w().c(new brr(bvwVar.j(), strArr[i5], (char[]) null));
                                    i5++;
                                    isEmpty = isEmpty;
                                    strArr = strArr;
                                    z9 = z9;
                                }
                            }
                            boolean z10 = isEmpty;
                            String[] strArr2 = strArr;
                            boolean z11 = z9;
                            workDatabase4.D().c(bvwVar.j(), bvwVar.c);
                            if (!z10) {
                                axm A = workDatabase4.A();
                                str.getClass();
                                A.b(new brr(str, bvwVar.j(), (byte[]) null));
                            }
                            workDatabase3 = workDatabase2;
                            isEmpty = z10;
                            strArr = strArr2;
                            z5 = z11;
                        }
                        workDatabase = workDatabase3;
                        z6 = z;
                        aujVar.e = z6;
                        workDatabase.p();
                        workDatabase.n();
                        if (z5) {
                            return;
                        }
                        aub.a(auyVar.c, auyVar.d, auyVar.e);
                        return;
                    }
                }
                z5 = false;
                while (r6.hasNext()) {
                }
                workDatabase = workDatabase3;
                z6 = z;
                aujVar.e = z6;
                workDatabase.p();
                workDatabase.n();
                if (z5) {
                }
            } catch (Throwable th) {
                th = th;
                workDatabase3.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
