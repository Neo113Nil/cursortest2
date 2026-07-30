package I0;

import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* loaded from: classes.dex */
public final class h implements ProfileStore {

    /* renamed from: b, reason: collision with root package name */
    public static h f1229b;

    /* renamed from: a, reason: collision with root package name */
    public final ProfileStoreBoundaryInterface f1230a;

    public h(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.f1230a = profileStoreBoundaryInterface;
    }

    @Override // androidx.webkit.ProfileStore
    public final boolean deleteProfile(String str) {
        if (m.f1241g.b()) {
            return this.f1230a.deleteProfile(str);
        }
        throw m.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final List getAllProfileNames() {
        if (m.f1241g.b()) {
            return this.f1230a.getAllProfileNames();
        }
        throw m.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final H0.b getOrCreateProfile(String str) {
        if (!m.f1241g.b()) {
            throw m.a();
        }
        return new j(5, (ProfileBoundaryInterface) w8.a.b(ProfileBoundaryInterface.class, this.f1230a.getOrCreateProfile(str)));
    }

    @Override // androidx.webkit.ProfileStore
    public final H0.b getProfile(String str) {
        if (!m.f1241g.b()) {
            throw m.a();
        }
        InvocationHandler profile = this.f1230a.getProfile(str);
        if (profile == null) {
            return null;
        }
        return new j(5, (ProfileBoundaryInterface) w8.a.b(ProfileBoundaryInterface.class, profile));
    }
}
