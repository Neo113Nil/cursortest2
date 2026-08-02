package S1;

import android.content.Context;
import b3.InterfaceC0264a;

/* loaded from: classes.dex */
public final class e implements N1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2578a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0264a f2579b;

    public /* synthetic */ e(InterfaceC0264a interfaceC0264a, int i4) {
        this.f2578a = i4;
        this.f2579b = interfaceC0264a;
    }

    @Override // b3.InterfaceC0264a
    public final Object get() {
        switch (this.f2578a) {
            case 0:
                String packageName = ((Context) this.f2579b.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new l((Context) this.f2579b.get(), "com.google.android.datatransport.events", Integer.valueOf(l.f2593d).intValue());
        }
    }
}
