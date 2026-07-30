package com.facebook.gamingservices.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ContextSwitchContent implements ShareModel {
    public static final CREATOR CREATOR = new CREATOR(null);
    private final String contextID;

    public ContextSwitchContent(Parcel parcel) {
        parcel.getClass();
        this.contextID = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getContextID() {
        return this.contextID;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.contextID);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class CREATOR implements Parcelable.Creator<ContextSwitchContent> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ContextSwitchContent createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ContextSwitchContent(parcel);
        }

        private CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ContextSwitchContent[] newArray(int i) {
            return new ContextSwitchContent[i];
        }
    }

    private ContextSwitchContent(Builder builder) {
        this.contextID = builder.getContextID$facebook_gamingservices_release();
    }

    public /* synthetic */ ContextSwitchContent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Builder implements ShareModelBuilder<ContextSwitchContent, Builder> {
        private String contextID;

        @Override // com.facebook.share.ShareBuilder
        public ContextSwitchContent build() {
            return new ContextSwitchContent(this, null);
        }

        public final String getContextID$facebook_gamingservices_release() {
            return this.contextID;
        }

        public final Builder readFrom(Parcel parcel) {
            parcel.getClass();
            return readFrom((ContextSwitchContent) parcel.readParcelable(ContextSwitchContent.class.getClassLoader()));
        }

        public final Builder setContextID(String str) {
            this.contextID = str;
            return this;
        }

        public final void setContextID$facebook_gamingservices_release(String str) {
            this.contextID = str;
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ContextSwitchContent contextSwitchContent) {
            Builder contextID;
            return (contextSwitchContent == null || (contextID = setContextID(contextSwitchContent.getContextID())) == null) ? this : contextID;
        }
    }
}
