package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xr implements Runnable {
    public final /* synthetic */ int m;
    public final int n;
    public final Object o;

    public xr(List list, int i, Throwable th) {
        this.m = 1;
        j8.o(list, "initCallbacks cannot be null");
        this.o = new ArrayList(list);
        this.n = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        int i2 = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                sg sgVar = (sg) ((ot2) obj).n;
                if (sgVar != null) {
                    sgVar.l(i2);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 == 1) {
                    while (i3 < size) {
                        ((yf0) arrayList.get(i3)).b();
                        i3++;
                    }
                    break;
                } else {
                    while (i3 < size) {
                        ((yf0) arrayList.get(i3)).a();
                        i3++;
                    }
                    break;
                }
            default:
                ((aa3) obj).i(i2);
                break;
        }
    }

    public /* synthetic */ xr(int i, int i2, Object obj) {
        this.m = i2;
        this.o = obj;
        this.n = i;
    }
}
