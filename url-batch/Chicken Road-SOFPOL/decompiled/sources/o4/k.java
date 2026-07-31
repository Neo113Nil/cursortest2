package o4;

import android.os.Bundle;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f5644e;

    public /* synthetic */ k(Bundle bundle, int i) {
        this.f5643d = i;
        this.f5644e = bundle;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        boolean containsKey;
        String str = (String) obj;
        switch (this.f5643d) {
            case 0:
                q6.i.e(str, "argName");
                Bundle bundle = this.f5644e;
                q6.i.e(bundle, "source");
                containsKey = bundle.containsKey(str);
                break;
            default:
                q6.i.e(str, "key");
                Bundle bundle2 = this.f5644e;
                q6.i.e(bundle2, "source");
                containsKey = bundle2.containsKey(str);
                break;
        }
        return Boolean.valueOf(!containsKey);
    }
}
