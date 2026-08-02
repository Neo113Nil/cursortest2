package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gdg extends kso implements krt {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdg(Object obj, int i, byte[] bArr) {
        super(1, obj, ajk.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0);
        this.a = i;
    }

    @Override // defpackage.krt
    public final /* synthetic */ Object a(Object obj) {
        switch (this.a) {
            case 0:
                Callable callable = (Callable) obj;
                callable.getClass();
                return ((gdh) this.c).a(callable);
            case 1:
                ((Set) obj).getClass();
                ajk ajkVar = (ajk) this.c;
                ReentrantLock reentrantLock = ajkVar.d;
                reentrantLock.lock();
                try {
                    List p = ixc.p(ajkVar.c.values());
                    reentrantLock.unlock();
                    Iterator it = p.iterator();
                    if (!it.hasNext()) {
                        return kow.a;
                    }
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 2:
                Callable callable2 = (Callable) obj;
                callable2.getClass();
                return ((gdh) this.c).a(callable2);
            case 3:
                Callable callable3 = (Callable) obj;
                callable3.getClass();
                return ((gdh) this.c).a(callable3);
            case 4:
                String str = (String) obj;
                str.getClass();
                return ((ghc) this.c).a(str);
            case 5:
                ggj ggjVar = (ggj) obj;
                ggjVar.getClass();
                ghn ghnVar = (ghn) this.c;
                jkj k = ggj.a.k();
                k.getClass();
                if (!ksp.b(ggjVar, hnu.bG(k))) {
                    return hnu.aJ(ggjVar);
                }
                hvi d = ((fcu) ghnVar.l.bB()).d();
                d.getClass();
                return d;
            case 6:
                List<iae> list = (List) obj;
                list.getClass();
                gid gidVar = (gid) this.c;
                ArrayList arrayList = new ArrayList(ixc.w(list));
                for (iae iaeVar : list) {
                    gty aB = hoq.aB(176, "Setting runtime properties", gub.a, true);
                    try {
                        ldt ldtVar = gidVar.h;
                        String str2 = iaeVar.g;
                        str2.getClass();
                        hvi i = ldtVar.i(str2);
                        aB.b(i);
                        ixf.j(aB, null);
                        arrayList.add(hoq.au(i, new giu(new fvv(gidVar, iaeVar, 4), 1), huf.a));
                    } finally {
                    }
                }
                return hnu.aG(arrayList);
            case 7:
                String str3 = (String) obj;
                str3.getClass();
                return ((ghc) this.c).a(str3);
            case 8:
                String str4 = (String) obj;
                str4.getClass();
                return ((giw) this.c).a(str4);
            case 9:
                String str5 = (String) obj;
                str5.getClass();
                return ((giw) this.c).a(str5);
            default:
                ((kwx) this.c).a((Throwable) obj);
                return kow.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdg(Object obj, int i) {
        super(1, obj, gdh.class, "asErrorPropagatingCallable", "asErrorPropagatingCallable(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Callable;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdg(Object obj, int i, int[] iArr) {
        super(1, obj, ghc.class, "create", "create(Ljava/lang/String;)Lcom/google/apps/tiktok/experiments/phenotype/DeviceConfigurationCommitter;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdg(Object obj, int i, boolean[] zArr) {
        super(1, obj, ghn.class, "getFromFallbackCacheOrImmediate", "getFromFallbackCacheOrImmediate(Lcom/google/apps/tiktok/experiments/FlagSnapshot;)Lcom/google/common/util/concurrent/ListenableFuture;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdg(Object obj, int i, float[] fArr) {
        super(1, obj, gid.class, "setRuntimePropertiesAndUpdateConfigs", "setRuntimePropertiesAndUpdateConfigs(Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdg(Object obj, int i, char[][] cArr) {
        super(1, obj, giw.class, "create", "create(Ljava/lang/String;)Lcom/google/apps/tiktok/experiments/phenotype/UserConfigurationCommitter;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdg(Object obj, int i, int[][] iArr) {
        super(1, obj, kwx.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        this.a = i;
    }
}
