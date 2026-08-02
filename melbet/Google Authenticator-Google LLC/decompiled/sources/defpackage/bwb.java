package defpackage;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bwb {
    public final Object a;
    private final Object b;

    public bwb(fcu fcuVar, bpx bpxVar) {
        fcuVar.getClass();
        bpxVar.getClass();
        this.b = fcuVar;
        this.a = bpxVar;
    }

    public final DialogInterface.OnClickListener a(int i) {
        return new guv((gva) this.b, 35, "StagedImportConfirmDiscardDialogClick", new bwe(i, this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, kqj kqjVar) {
        cag cagVar;
        int i;
        if (kqjVar instanceof cag) {
            cagVar = (cag) kqjVar;
            int i2 = cagVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cagVar.b = i2 - Integer.MIN_VALUE;
                Object obj = cagVar.a;
                kqp kqpVar = kqp.a;
                i = cagVar.b;
                if (i != 0) {
                    ixc.Y(obj);
                    ArrayList arrayList = new ArrayList(ixc.w(list));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((bpx) this.a).b((String) it.next()));
                    }
                    hvi a = ((fcu) this.b).a(new bpf(new ajq(arrayList, 15), 18), huf.a);
                    cagVar.b = 1;
                    if (ixl.c(a, cagVar) == kqpVar) {
                        return kqpVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ixc.Y(obj);
                }
                return kow.a;
            }
        }
        cagVar = new cag(this, kqjVar);
        Object obj2 = cagVar.a;
        kqp kqpVar2 = kqp.a;
        i = cagVar.b;
        if (i != 0) {
        }
        return kow.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(kqj kqjVar) {
        cah cahVar;
        int i;
        if (kqjVar instanceof cah) {
            cahVar = (cah) kqjVar;
            int i2 = cahVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cahVar.b = i2 - Integer.MIN_VALUE;
                Object obj = cahVar.a;
                kqp kqpVar = kqp.a;
                i = cahVar.b;
                if (i != 0) {
                    ixc.Y(obj);
                    hvi a = ((fcu) this.b).a(new bpf(new ajt(9), 19), huf.a);
                    cahVar.b = 1;
                    if (ixl.c(a, cahVar) == kqpVar) {
                        return kqpVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ixc.Y(obj);
                }
                return kow.a;
            }
        }
        cahVar = new cah(this, kqjVar);
        Object obj2 = cahVar.a;
        kqp kqpVar2 = kqp.a;
        i = cahVar.b;
        if (i != 0) {
        }
        return kow.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(kqj kqjVar) {
        cai caiVar;
        int i;
        jkx jkxVar;
        if (kqjVar instanceof cai) {
            caiVar = (cai) kqjVar;
            int i2 = caiVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                caiVar.b = i2 - Integer.MIN_VALUE;
                Object obj = caiVar.a;
                kqp kqpVar = kqp.a;
                i = caiVar.b;
                if (i != 0) {
                    ixc.Y(obj);
                    hvi d = ((fcu) this.b).d();
                    d.getClass();
                    caiVar.b = 1;
                    obj = ixl.c(d, caiVar);
                    if (obj == kqpVar) {
                        return kqpVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ixc.Y(obj);
                }
                caf cafVar = (caf) obj;
                return (cafVar != null || (jkxVar = cafVar.b) == null) ? kpk.a : jkxVar;
            }
        }
        caiVar = new cai(this, kqjVar);
        Object obj2 = caiVar.a;
        kqp kqpVar2 = kqp.a;
        i = caiVar.b;
        if (i != 0) {
        }
        caf cafVar2 = (caf) obj2;
        if (cafVar2 != null) {
        }
    }

    public bwb(bvz bvzVar, gva gvaVar) {
        gvaVar.getClass();
        this.a = bvzVar;
        this.b = gvaVar;
    }
}
