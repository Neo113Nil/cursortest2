package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dwb {
    private static final String e;
    public final egc a;
    public final ExecutorService b;
    public final hac c;
    public final kzq d;

    static {
        int i = ksx.a;
        e = new ksj(dwb.class).c();
    }

    public dwb(egc egcVar, ExecutorService executorService) {
        egcVar.getClass();
        executorService.getClass();
        this.a = egcVar;
        this.b = executorService;
        this.c = hoq.v(new cud(this, 6));
        this.d = new kzl(new akn(this, (kqj) null, 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c A[Catch: Exception -> 0x008d, LOOP:0: B:12:0x0056->B:14:0x005c, LOOP_END, TRY_LEAVE, TryCatch #0 {Exception -> 0x008d, blocks: (B:10:0x0023, B:11:0x0044, B:12:0x0056, B:14:0x005c, B:22:0x0032), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kqj kqjVar) {
        dwa dwaVar;
        int i;
        try {
            if (kqjVar instanceof dwa) {
                dwaVar = (dwa) kqjVar;
                int i2 = dwaVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dwaVar.c = i2 - Integer.MIN_VALUE;
                    Object obj = dwaVar.a;
                    kqp kqpVar = kqp.a;
                    i = dwaVar.c;
                    if (i != 0) {
                        ixc.Y(obj);
                        hvi a = this.a.a();
                        a.getClass();
                        dwaVar.c = 1;
                        obj = ixl.c(a, dwaVar);
                        if (obj == kqpVar) {
                            return kqpVar;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ixc.Y(obj);
                    }
                    obj.getClass();
                    Iterable<ega> iterable = (Iterable) obj;
                    ArrayList arrayList = new ArrayList(ixc.w(iterable));
                    for (ega egaVar : iterable) {
                        jkj k = jit.a.k();
                        k.getClass();
                        String str = egaVar.a;
                        str.getClass();
                        ilo.b(str, k);
                        jit a2 = ilo.a(k);
                        String str2 = egaVar.b;
                        str.getClass();
                        arrayList.add(new ehr(a2, true, str2, str, egaVar.c, egaVar.d, egaVar.f));
                    }
                    return arrayList;
                }
            }
            if (i != 0) {
            }
            obj.getClass();
            Iterable<ega> iterable2 = (Iterable) obj;
            ArrayList arrayList2 = new ArrayList(ixc.w(iterable2));
            while (r11.hasNext()) {
            }
            return arrayList2;
        } catch (Exception e2) {
            Log.e(e, "Failed to load GoogleOwners.", e2);
            return kpk.a;
        }
        dwaVar = new dwa(this, kqjVar);
        Object obj2 = dwaVar.a;
        kqp kqpVar2 = kqp.a;
        i = dwaVar.c;
    }
}
