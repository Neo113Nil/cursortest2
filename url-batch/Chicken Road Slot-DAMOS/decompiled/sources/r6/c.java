package r6;

import a2.r;
import android.content.Context;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements m6.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8190d;

    /* renamed from: e, reason: collision with root package name */
    public final gd.a f8191e;

    public /* synthetic */ c(gd.a aVar, int i3) {
        this.f8190d = i3;
        this.f8191e = aVar;
    }

    @Override // gd.a
    public final Object get() {
        switch (this.f8190d) {
            case 0:
                String packageName = ((Context) this.f8191e.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                r.j("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new i(Integer.valueOf(i.f8204r).intValue(), (Context) this.f8191e.get(), "com.google.android.datatransport.events");
        }
    }
}
