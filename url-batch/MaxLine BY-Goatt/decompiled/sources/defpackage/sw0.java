package defpackage;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sw0 extends l03 {
    public final /* synthetic */ int a;
    public final l03 b;

    public sw0(uw0 uw0Var, l03 l03Var, Type type) {
        this.a = 3;
        this.b = l03Var;
    }

    @Override // defpackage.l03
    public final Object a(z61 z61Var) {
        int i = this.a;
        l03 l03Var = this.b;
        switch (i) {
            case 0:
                return new AtomicLong(((Number) l03Var.a(z61Var)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                z61Var.b();
                while (z61Var.s()) {
                    arrayList.add(Long.valueOf(((Number) l03Var.a(z61Var)).longValue()));
                }
                z61Var.o();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            case 2:
                if (z61Var.R() != 9) {
                    return l03Var.a(z61Var);
                }
                z61Var.N();
                return null;
            case 3:
                return l03Var.a(z61Var);
            default:
                Date date = (Date) l03Var.a(z61Var);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
        }
    }

    public /* synthetic */ sw0(l03 l03Var, int i) {
        this.a = i;
        this.b = l03Var;
    }
}
