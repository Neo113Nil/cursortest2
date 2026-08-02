package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dwh extends kra implements kry {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ eau c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwh(kqj kqjVar, eau eauVar) {
        super(3, kqjVar);
        this.c = eauVar;
    }

    @Override // defpackage.kry
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dwh dwhVar = new dwh((kqj) obj3, this.c);
        dwhVar.d = (kzr) obj;
        dwhVar.b = (Object[]) obj2;
        return dwhVar.b(kow.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008b A[RETURN] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kzr] */
    @Override // defpackage.kqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        jia jiaVar;
        Integer num;
        int intValue;
        kqp kqpVar = kqp.a;
        int i = this.a;
        ixc.Y(obj);
        if (i == 0) {
            ?? r10 = this.d;
            eba[] ebaVarArr = (eba[]) this.b;
            if (ebaVarArr.length != 0) {
                for (eba ebaVar : ebaVarArr) {
                    if (ebaVar != null) {
                        Object obj2 = this.c.a;
                        if (obj2 != null) {
                            intValue = ((Integer) obj2).intValue();
                        } else {
                            int length = ebaVarArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    num = null;
                                    break;
                                }
                                eba ebaVar2 = ebaVarArr[i2];
                                num = ebaVar2 != null ? new Integer(ebaVar2.a.b) : null;
                                if (num != null) {
                                    break;
                                }
                                i2++;
                            }
                            if (num == null) {
                                throw new NoSuchElementException("No element of the array was transformed to a non-null value.");
                            }
                            intValue = num.intValue();
                        }
                        ArrayList arrayList = new ArrayList();
                        int length2 = ebaVarArr.length;
                        for (int i3 = 0; i3 < length2; i3++) {
                            eba ebaVar3 = ebaVarArr[i3];
                            jic jicVar = ebaVar3 != null ? new jic(ebaVar3.a) : null;
                            if (jicVar != null) {
                                arrayList.add(jicVar);
                            }
                        }
                        jiaVar = new jia(arrayList, intValue);
                        this.a = 1;
                        if (r10.cg(jiaVar, this) == kqpVar) {
                            return kqpVar;
                        }
                    }
                }
            }
            jiaVar = new jia(View.generateViewId());
            this.a = 1;
            if (r10.cg(jiaVar, this) == kqpVar) {
            }
        }
        return kow.a;
    }
}
