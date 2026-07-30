package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMedia.Builder;
import defpackage.ah0;
import defpackage.fa0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ShareMedia<M extends ShareMedia<M, B>, B extends Builder<M, B>> implements ShareModel {
    private final Bundle params;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum Type {
        PHOTO,
        VIDEO
    }

    public ShareMedia(Parcel parcel) {
        parcel.getClass();
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.params = readBundle == null ? new Bundle() : readBundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract Type getMediaType();

    @fa0
    public final Bundle getParameters() {
        return new Bundle(this.params);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeBundle(this.params);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static abstract class Builder<M extends ShareMedia<M, B>, B extends Builder<M, B>> implements ShareModelBuilder<M, B> {
        public static final Companion Companion = new Companion(null);
        private Bundle params = new Bundle();

        public final Bundle getParams$facebook_common_release() {
            return this.params;
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public B readFrom(M m) {
            return m == null ? this : setParameters(((ShareMedia) m).params);
        }

        @fa0
        public final B setParameter(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.params.putString(str, str2);
            return this;
        }

        @fa0
        public final B setParameters(Bundle bundle) {
            bundle.getClass();
            this.params.putAll(bundle);
            return this;
        }

        public final void setParams$facebook_common_release(Bundle bundle) {
            bundle.getClass();
            this.params = bundle;
        }

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final List<ShareMedia<?, ?>> readListFrom$facebook_common_release(Parcel parcel) {
                parcel.getClass();
                Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
                if (readParcelableArray == null) {
                    return ah0.m;
                }
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : readParcelableArray) {
                    if (parcelable instanceof ShareMedia) {
                        arrayList.add(parcelable);
                    }
                }
                return arrayList;
            }

            public final void writeListTo$facebook_common_release(Parcel parcel, int i, List<? extends ShareMedia<?, ?>> list) {
                parcel.getClass();
                list.getClass();
                parcel.writeParcelableArray((Parcelable[]) list.toArray(new ShareMedia[0]), i);
            }

            private Companion() {
            }
        }
    }

    public ShareMedia(Builder<M, B> builder) {
        builder.getClass();
        this.params = new Bundle(builder.getParams$facebook_common_release());
    }
}
