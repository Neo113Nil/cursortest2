package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aei {
    public static final aej a(aek aekVar) {
        aekVar.getClass();
        int ordinal = aekVar.ordinal();
        if (ordinal == 2) {
            return aej.ON_DESTROY;
        }
        if (ordinal == 3) {
            return aej.ON_STOP;
        }
        if (ordinal != 4) {
            return null;
        }
        return aej.ON_PAUSE;
    }

    public static final aej b(aek aekVar) {
        aekVar.getClass();
        int ordinal = aekVar.ordinal();
        if (ordinal == 1) {
            return aej.ON_CREATE;
        }
        if (ordinal == 2) {
            return aej.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return aej.ON_RESUME;
    }

    public static float c(float[] fArr, float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) (200.0f * f), 199);
        float f2 = f - (min * 0.005f);
        float f3 = fArr[min];
        return f3 + ((f2 / 0.005f) * (fArr[min + 1] - f3));
    }

    public static final void d(qi qiVar, krt krtVar) {
        qi qiVar2 = new qi(999);
        int i = qiVar.d;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            qiVar2.put(qiVar.c(i2), qiVar.f(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                krtVar.a(qiVar2);
                qiVar2.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            krtVar.a(qiVar2);
        }
    }

    public static final Object e(Class cls) {
        String str;
        String str2;
        Package r0 = cls.getPackage();
        if (r0 == null || (str = r0.getName()) == null) {
            str = "";
        }
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        if (str.length() != 0) {
            canonicalName = canonicalName.substring(str.length() + 1);
            canonicalName.getClass();
        }
        String concat = ksp.q(canonicalName, '.', '_').concat("_Impl");
        try {
            if (str.length() == 0) {
                str2 = concat;
            } else {
                str2 = str + '.' + concat;
            }
            Class<?> cls2 = Class.forName(str2, true, cls.getClassLoader());
            cls2.getClass();
            return cls2.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + concat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor ".concat(String.valueOf(cls.getCanonicalName())), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of ".concat(String.valueOf(cls.getCanonicalName())), e3);
        }
    }

    public static final axt f(axt axtVar) {
        boolean b = axtVar.f.b("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean b2 = axtVar.f.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean b3 = axtVar.f.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (b || !b2 || !b3) {
            return axtVar;
        }
        String str = axtVar.d;
        brn brnVar = new brn((char[]) null, (char[]) null);
        brnVar.y(axtVar.f);
        brnVar.A("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
        return axt.e(axtVar, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", brnVar.x(), 0, 0L, 0, 0, 0L, 0, 33554411);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public static final asv g(UUID uuid, auy auyVar) {
        uuid.getClass();
        yn ynVar = auyVar.c.m;
        ?? r1 = auyVar.k.e;
        r1.getClass();
        return yo.f(ynVar, "CancelWorkById", r1, new awb(auyVar, uuid, 3, null));
    }

    public static final void h(auy auyVar, String str) {
        avi a;
        WorkDatabase workDatabase = auyVar.d;
        workDatabase.getClass();
        axu C = workDatabase.C();
        awx w = workDatabase.w();
        List c = ixc.c(str);
        c.addAll(abf.w(w, str));
        ArrayList arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (C.b((String) next) != null ? !r6.a() : false) {
                arrayList.add(next);
            }
        }
        axu C2 = auyVar.d.C();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C2.A((String) it2.next());
        }
        atx atxVar = auyVar.f;
        atxVar.getClass();
        synchronized (atxVar.k) {
            asq.a();
            atxVar.i.add(str);
            a = atxVar.a(str);
        }
        atx.g(a, 1);
        ListIterator listIterator = ((kpt) auyVar.e).listIterator(0);
        while (listIterator.hasNext()) {
            ((atz) listIterator.next()).b(str);
        }
    }

    public static final void i(String str, auy auyVar) {
        WorkDatabase workDatabase = auyVar.d;
        workDatabase.getClass();
        workDatabase.o(new ajx((Object) workDatabase, (Object) str, (Object) auyVar, 7, (char[]) null));
    }

    public static final void j(auy auyVar) {
        aub.a(auyVar.c, auyVar.d, auyVar.e);
    }

    public static /* synthetic */ int k(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final long l(boolean z, int i, art artVar, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
        long j7;
        artVar.getClass();
        if (j6 != Long.MAX_VALUE && z2) {
            return i2 == 0 ? j6 : ksl.h(j6, j2 + 900000);
        }
        if (z) {
            j7 = ksl.i(artVar == art.b ? j * i : (long) Math.scalb(j, i - 1), 18000000L);
        } else {
            if (!z2) {
                if (j2 == -1) {
                    return Long.MAX_VALUE;
                }
                return j2 + j3;
            }
            if (i2 == 0) {
                j2 += j3;
                i2 = 0;
            } else {
                j2 += j5;
            }
            if (j4 == j5 || i2 != 0) {
                return j2;
            }
            j7 = j5 - j4;
        }
        return j2 + j7;
    }
}
