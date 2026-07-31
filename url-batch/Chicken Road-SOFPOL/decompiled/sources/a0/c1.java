package a0;

import android.os.Bundle;
import java.util.List;
import w1.w1;
import w1.x1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f34d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q6.s f35e;

    public /* synthetic */ c1(q6.s sVar, int i) {
        this.f34d = i;
        this.f35e = sVar;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f34d) {
            case 0:
                x1 x1Var = (x1) obj;
                q6.i.c(x1Var, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                n0 n0Var = ((m1) x1Var).f116r;
                q6.s sVar = this.f35e;
                List list = (List) sVar.f6205d;
                if (list != null) {
                    list.add(n0Var);
                } else {
                    list = s6.a.z(n0Var);
                }
                sVar.f6205d = list;
                return w1.f7818e;
            default:
                String str = (String) obj;
                q6.i.e(str, "key");
                Object obj2 = this.f35e.f6205d;
                return Boolean.valueOf(obj2 == null || !((Bundle) obj2).containsKey(str));
        }
    }
}
