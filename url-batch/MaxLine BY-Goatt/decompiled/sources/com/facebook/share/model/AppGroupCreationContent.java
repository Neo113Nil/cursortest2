package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AppGroupCreationContent implements ShareModel {
    private final AppGroupPrivacy appGroupPrivacy;
    private final String description;
    private final String name;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AppGroupCreationContent> CREATOR = new Parcelable.Creator<AppGroupCreationContent>() { // from class: com.facebook.share.model.AppGroupCreationContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AppGroupCreationContent createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new AppGroupCreationContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AppGroupCreationContent[] newArray(int i) {
            return new AppGroupCreationContent[i];
        }
    };

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum AppGroupPrivacy {
        Open,
        Closed
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Builder implements ShareModelBuilder<AppGroupCreationContent, Builder> {
        private AppGroupPrivacy appGroupPrivacy;
        private String description;
        private String name;

        @Override // com.facebook.share.ShareBuilder
        public AppGroupCreationContent build() {
            return new AppGroupCreationContent(this, null);
        }

        public final AppGroupPrivacy getAppGroupPrivacy$facebook_common_release() {
            return this.appGroupPrivacy;
        }

        public final String getDescription$facebook_common_release() {
            return this.description;
        }

        public final String getName$facebook_common_release() {
            return this.name;
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(AppGroupCreationContent appGroupCreationContent) {
            return appGroupCreationContent == null ? this : setName(appGroupCreationContent.getName()).setDescription(appGroupCreationContent.getDescription()).setAppGroupPrivacy(appGroupCreationContent.getAppGroupPrivacy());
        }

        public final Builder setAppGroupPrivacy(AppGroupPrivacy appGroupPrivacy) {
            this.appGroupPrivacy = appGroupPrivacy;
            return this;
        }

        public final void setAppGroupPrivacy$facebook_common_release(AppGroupPrivacy appGroupPrivacy) {
            this.appGroupPrivacy = appGroupPrivacy;
        }

        public final Builder setDescription(String str) {
            this.description = str;
            return this;
        }

        public final void setDescription$facebook_common_release(String str) {
            this.description = str;
        }

        public final Builder setName(String str) {
            this.name = str;
            return this;
        }

        public final void setName$facebook_common_release(String str) {
            this.name = str;
        }
    }

    public AppGroupCreationContent(Parcel parcel) {
        parcel.getClass();
        this.name = parcel.readString();
        this.description = parcel.readString();
        this.appGroupPrivacy = (AppGroupPrivacy) parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final AppGroupPrivacy getAppGroupPrivacy() {
        return this.appGroupPrivacy;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeSerializable(this.appGroupPrivacy);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private AppGroupCreationContent(Builder builder) {
        this.name = builder.getName$facebook_common_release();
        this.description = builder.getDescription$facebook_common_release();
        this.appGroupPrivacy = builder.getAppGroupPrivacy$facebook_common_release();
    }

    public /* synthetic */ AppGroupCreationContent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
