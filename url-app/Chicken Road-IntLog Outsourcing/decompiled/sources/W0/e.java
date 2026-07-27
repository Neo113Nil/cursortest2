package W0;

import V0.j;
import android.content.Context;

/* loaded from: classes.dex */
public final class e implements X0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3387a;

    /* renamed from: b, reason: collision with root package name */
    public final j f3388b;

    public /* synthetic */ e(j jVar, int i2) {
        this.f3387a = i2;
        this.f3388b = jVar;
    }

    @Override // e4.InterfaceC0412a
    public final Object get() {
        switch (this.f3387a) {
            case 0:
                return new d((Context) this.f3388b.f3212b, new W1.e(), new l1.j(22));
            default:
                String packageName = ((Context) this.f3388b.f3212b).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
