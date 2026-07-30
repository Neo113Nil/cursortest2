package com.facebook.gamingservices.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ContextCreateContent implements ShareModel {
    public static final CREATOR CREATOR = new CREATOR(null);
    private final String suggestedPlayerID;

    public ContextCreateContent(Parcel parcel) {
        parcel.getClass();
        this.suggestedPlayerID = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getSuggestedPlayerID() {
        return this.suggestedPlayerID;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.suggestedPlayerID);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class CREATOR implements Parcelable.Creator<ContextCreateContent> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ContextCreateContent createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ContextCreateContent(parcel);
        }

        private CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ContextCreateContent[] newArray(int i) {
            return new ContextCreateContent[i];
        }
    }

    private ContextCreateContent(Builder builder) {
        this.suggestedPlayerID = builder.getSuggestedPlayerID$facebook_gamingservices_release();
    }

    public /* synthetic */ ContextCreateContent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Builder implements ShareModelBuilder<ContextCreateContent, Builder> {
        private String suggestedPlayerID;

        @Override // com.facebook.share.ShareBuilder
        public ContextCreateContent build() {
            return new ContextCreateContent(this, null);
        }

        public final String getSuggestedPlayerID$facebook_gamingservices_release() {
            return this.suggestedPlayerID;
        }

        public final Builder readFrom(Parcel parcel) {
            parcel.getClass();
            return readFrom((ContextCreateContent) parcel.readParcelable(ContextCreateContent.class.getClassLoader()));
        }

        public final Builder setSuggestedPlayerID(String str) {
            this.suggestedPlayerID = str;
            return this;
        }

        public final void setSuggestedPlayerID$facebook_gamingservices_release(String str) {
            this.suggestedPlayerID = str;
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ContextCreateContent contextCreateContent) {
            Builder suggestedPlayerID;
            return (contextCreateContent == null || (suggestedPlayerID = setSuggestedPlayerID(contextCreateContent.getSuggestedPlayerID())) == null) ? this : suggestedPlayerID;
        }
    }
}
