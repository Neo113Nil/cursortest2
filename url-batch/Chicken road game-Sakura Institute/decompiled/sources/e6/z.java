package e6;

import androidx.lifecycle.r0;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z implements Iterable, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2831f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2832g;

    public /* synthetic */ z(int i7, Object obj) {
        this.f2831f = i7;
        this.f2832g = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2831f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new a0(r6.k.h((Object[]) ((r0) this.f2832g).f1026h));
            default:
                return new z6.b((y6.e) this.f2832g);
        }
    }
}
