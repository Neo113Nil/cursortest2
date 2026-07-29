package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ShareMedia implements ShareModel {
    private final Bundle params;

    public enum b {
        PHOTO,
        VIDEO
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract b getMediaType();

    protected ShareMedia(a aVar) {
        this.params = new Bundle(aVar.f6402a);
    }

    ShareMedia(Parcel parcel) {
        this.params = parcel.readBundle();
    }

    @Deprecated
    public Bundle getParameters() {
        return new Bundle(this.params);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.params);
    }

    public static abstract class a<M extends ShareMedia, B extends a> {

        /* renamed from: a, reason: collision with root package name */
        private Bundle f6402a = new Bundle();

        @Deprecated
        public B a(Bundle bundle) {
            this.f6402a.putAll(bundle);
            return this;
        }

        public B a(M m) {
            return m == null ? this : a(m.getParameters());
        }

        static List<ShareMedia> a(Parcel parcel) {
            Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
            ArrayList arrayList = new ArrayList(readParcelableArray.length);
            for (Parcelable parcelable : readParcelableArray) {
                arrayList.add((ShareMedia) parcelable);
            }
            return arrayList;
        }
    }
}
