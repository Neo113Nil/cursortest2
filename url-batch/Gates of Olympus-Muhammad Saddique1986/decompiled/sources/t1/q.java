package t1;

import android.os.Bundle;
import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class q extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f8908f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Bundle bundle, int i3) {
        super(1);
        this.f8907e = i3;
        this.f8908f = bundle;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f8907e) {
            case 0:
                f2.j.f((String) obj, "argName");
                return Boolean.valueOf(!this.f8908f.containsKey(r2));
            default:
                f2.j.f((String) obj, "key");
                return Boolean.valueOf(!this.f8908f.containsKey(r2));
        }
    }
}
