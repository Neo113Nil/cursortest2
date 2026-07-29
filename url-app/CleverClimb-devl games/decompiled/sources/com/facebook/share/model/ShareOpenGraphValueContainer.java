package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.ShareOpenGraphValueContainer.a;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class ShareOpenGraphValueContainer<P extends ShareOpenGraphValueContainer, E extends a> implements ShareModel {
    private final Bundle bundle;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected ShareOpenGraphValueContainer(a<P, E> aVar) {
        this.bundle = (Bundle) ((a) aVar).f6406a.clone();
    }

    ShareOpenGraphValueContainer(Parcel parcel) {
        this.bundle = parcel.readBundle(a.class.getClassLoader());
    }

    public Object get(String str) {
        return this.bundle.get(str);
    }

    public String getString(String str) {
        return this.bundle.getString(str);
    }

    public Bundle getBundle() {
        return (Bundle) this.bundle.clone();
    }

    public Set<String> keySet() {
        return this.bundle.keySet();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.bundle);
    }

    public static abstract class a<P extends ShareOpenGraphValueContainer, E extends a> {

        /* renamed from: a, reason: collision with root package name */
        private Bundle f6406a = new Bundle();

        public E a(String str, String str2) {
            this.f6406a.putString(str, str2);
            return this;
        }

        public E a(P p) {
            if (p != null) {
                this.f6406a.putAll(p.getBundle());
            }
            return this;
        }
    }
}
