package androidx.webkit.internal;

import androidx.webkit.Profile;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;

/* loaded from: classes10.dex */
public class ProfileImpl implements Profile {
    private final ProfileBoundaryInterface mProfileImpl;

    ProfileImpl(ProfileBoundaryInterface profileBoundaryInterface) {
        this.mProfileImpl = profileBoundaryInterface;
    }
}
