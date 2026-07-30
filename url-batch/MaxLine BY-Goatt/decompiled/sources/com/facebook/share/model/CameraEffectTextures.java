package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.fh0;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class CameraEffectTextures implements ShareModel {
    private final Bundle textures;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CameraEffectTextures> CREATOR = new Parcelable.Creator<CameraEffectTextures>() { // from class: com.facebook.share.model.CameraEffectTextures$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CameraEffectTextures createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new CameraEffectTextures(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CameraEffectTextures[] newArray(int i) {
            return new CameraEffectTextures[i];
        }
    };

    public CameraEffectTextures(Parcel parcel) {
        parcel.getClass();
        this.textures = parcel.readBundle(CameraEffectTextures.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Object get(String str) {
        Bundle bundle = this.textures;
        if (bundle != null) {
            return bundle.get(str);
        }
        return null;
    }

    public final Bitmap getTextureBitmap(String str) {
        Bundle bundle = this.textures;
        Object obj = bundle != null ? bundle.get(str) : null;
        if (obj instanceof Bitmap) {
            return (Bitmap) obj;
        }
        return null;
    }

    public final Uri getTextureUri(String str) {
        Bundle bundle = this.textures;
        Object obj = bundle != null ? bundle.get(str) : null;
        if (obj instanceof Uri) {
            return (Uri) obj;
        }
        return null;
    }

    public final Set<String> keySet() {
        Bundle bundle = this.textures;
        Set<String> keySet = bundle != null ? bundle.keySet() : null;
        return keySet == null ? fh0.m : keySet;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeBundle(this.textures);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Builder implements ShareModelBuilder<CameraEffectTextures, Builder> {
        private final Bundle textures = new Bundle();

        private final Builder putParcelableTexture(String str, Parcelable parcelable) {
            if (str.length() > 0 && parcelable != null) {
                this.textures.putParcelable(str, parcelable);
            }
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public CameraEffectTextures build() {
            return new CameraEffectTextures(this, null);
        }

        public final Bundle getTextures$facebook_common_release() {
            return this.textures;
        }

        public final Builder putTexture(String str, Bitmap bitmap) {
            str.getClass();
            return putParcelableTexture(str, bitmap);
        }

        public final Builder readFrom(Parcel parcel) {
            parcel.getClass();
            return readFrom((CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader()));
        }

        public final Builder putTexture(String str, Uri uri) {
            str.getClass();
            return putParcelableTexture(str, uri);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(CameraEffectTextures cameraEffectTextures) {
            if (cameraEffectTextures != null) {
                this.textures.putAll(cameraEffectTextures.textures);
            }
            return this;
        }
    }

    private CameraEffectTextures(Builder builder) {
        this.textures = builder.getTextures$facebook_common_release();
    }

    public /* synthetic */ CameraEffectTextures(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
