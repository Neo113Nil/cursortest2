package n4;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f7089e;

    public /* synthetic */ o(Bundle bundle, int i3) {
        this.f7088d = i3;
        this.f7089e = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean containsKey;
        String str = (String) obj;
        switch (this.f7088d) {
            case 0:
                str.getClass();
                containsKey = this.f7089e.containsKey(str);
                break;
            default:
                str.getClass();
                containsKey = this.f7089e.containsKey(str);
                break;
        }
        return Boolean.valueOf(!containsKey);
    }
}
