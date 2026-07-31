package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public class ParcelUtils {
    public static VersionedParcelable fromParcelable(Parcelable parcelable) {
        if (!(parcelable instanceof ParcelImpl)) {
            throw new IllegalArgumentException("Invalid parcel");
        }
        return ((ParcelImpl) parcelable).getVersionedParcel();
    }

    public static VersionedParcelable getVersionedParcelable(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(ParcelUtils.class.getClassLoader());
            return fromParcelable(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
