package defpackage;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ws0 implements Runnable {
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Serializable p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ ws0(zh3 zh3Var, int i, Exception exc, byte[] bArr, Map map) {
        this.o = zh3Var;
        this.n = i;
        this.p = exc;
        this.q = bArr;
        this.r = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        Object obj = this.r;
        Object obj2 = this.q;
        Serializable serializable = this.p;
        Object obj3 = this.o;
        switch (i) {
            case 0:
                for (int i2 = 0; i2 < this.n; i2++) {
                    View view = (View) ((ArrayList) obj3).get(i2);
                    String str = (String) ((ArrayList) serializable).get(i2);
                    WeakHashMap weakHashMap = e53.a;
                    view.setTransitionName(str);
                    ((View) ((ArrayList) obj2).get(i2)).setTransitionName((String) ((ArrayList) obj).get(i2));
                }
                break;
            default:
                zh3 zh3Var = (zh3) obj3;
                ((mm3) zh3Var.r).a(zh3Var.p, this.n, (Exception) serializable, (byte[]) obj2, (Map) obj);
                break;
        }
    }

    public ws0(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.n = i;
        this.o = arrayList;
        this.p = arrayList2;
        this.q = arrayList3;
        this.r = arrayList4;
    }
}
