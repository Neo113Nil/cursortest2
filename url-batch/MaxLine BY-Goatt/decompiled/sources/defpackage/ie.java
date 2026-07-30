package defpackage;

import java.util.function.IntConsumer;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ie implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ ie(int i, int i2, Object obj) {
        this.m = i2;
        this.o = obj;
        this.n = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        int i2 = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                ((IntConsumer) obj).accept(i2);
                break;
            default:
                ((sg) obj).l(i2);
                break;
        }
    }
}
