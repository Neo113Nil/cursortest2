package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class hbv implements Supplier {
    private final /* synthetic */ int a;

    public /* synthetic */ hbv(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.a;
        if (i == 0) {
            int i2 = hel.d;
            return new heg(4);
        }
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return new hfk();
        }
        if (i == 3) {
            hfj hfjVar = hfj.a;
            return new brn((int[]) null);
        }
        if (i != 4) {
            Object obj = hht.a;
            return new hhs();
        }
        Object obj2 = hht.a;
        return new hhs();
    }
}
