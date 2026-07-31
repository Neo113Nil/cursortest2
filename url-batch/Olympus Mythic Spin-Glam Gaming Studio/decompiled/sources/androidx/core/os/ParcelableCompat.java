package androidx.core.os;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* loaded from: classes10.dex */
public final class ParcelableCompat {

    static class ParcelableCompatCreatorHoneycombMR2<T> implements Parcelable.ClassLoaderCreator<T> {
        private final ParcelableCompatCreatorCallbacks mCallbacks;

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return this.mCallbacks.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.mCallbacks.createFromParcel(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return this.mCallbacks.newArray(i);
        }
    }
}
