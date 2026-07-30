package com.facebook.gamingservices.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ContextChooseContent implements ShareModel {
    public static final CREATOR CREATOR = new CREATOR(null);
    private final List<String> filters;
    private final Integer maxSize;
    private final Integer minSize;

    public ContextChooseContent(Parcel parcel) {
        parcel.getClass();
        this.filters = parcel.createStringArrayList();
        this.maxSize = Integer.valueOf(parcel.readInt());
        this.minSize = Integer.valueOf(parcel.readInt());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<String> getFilters() {
        List<String> list = this.filters;
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        return null;
    }

    public final Integer getMaxSize() {
        return this.maxSize;
    }

    public final Integer getMinSize() {
        return this.minSize;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeStringList(this.filters);
        Integer num = this.maxSize;
        parcel.writeInt(num != null ? num.intValue() : 0);
        Integer num2 = this.minSize;
        parcel.writeInt(num2 != null ? num2.intValue() : 0);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class CREATOR implements Parcelable.Creator<ContextChooseContent> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ContextChooseContent createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ContextChooseContent(parcel);
        }

        private CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ContextChooseContent[] newArray(int i) {
            return new ContextChooseContent[i];
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Builder implements ShareModelBuilder<ContextChooseContent, Builder> {
        private List<String> filters;
        private Integer maxSize;
        private Integer minSize;

        @Override // com.facebook.share.ShareBuilder
        public ContextChooseContent build() {
            return new ContextChooseContent(this, null);
        }

        public final List<String> getFilters$facebook_gamingservices_release() {
            return this.filters;
        }

        public final Integer getMaxSize$facebook_gamingservices_release() {
            return this.maxSize;
        }

        public final Integer getMinSize$facebook_gamingservices_release() {
            return this.minSize;
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ContextChooseContent contextChooseContent) {
            Builder minSize;
            return (contextChooseContent == null || (minSize = setFilters(contextChooseContent.getFilters()).setMaxSize(contextChooseContent.getMaxSize()).setMinSize(contextChooseContent.getMinSize())) == null) ? this : minSize;
        }

        public final Builder setFilters(List<String> list) {
            this.filters = list;
            return this;
        }

        public final void setFilters$facebook_gamingservices_release(List<String> list) {
            this.filters = list;
        }

        public final Builder setMaxSize(Integer num) {
            this.maxSize = num;
            return this;
        }

        public final void setMaxSize$facebook_gamingservices_release(Integer num) {
            this.maxSize = num;
        }

        public final Builder setMinSize(Integer num) {
            this.minSize = num;
            return this;
        }

        public final void setMinSize$facebook_gamingservices_release(Integer num) {
            this.minSize = num;
        }

        public final Builder readFrom(Parcel parcel) {
            parcel.getClass();
            return readFrom((ContextChooseContent) parcel.readParcelable(ContextChooseContent.class.getClassLoader()));
        }
    }

    private ContextChooseContent(Builder builder) {
        this.filters = builder.getFilters$facebook_gamingservices_release();
        this.maxSize = builder.getMaxSize$facebook_gamingservices_release();
        this.minSize = builder.getMinSize$facebook_gamingservices_release();
    }

    public /* synthetic */ ContextChooseContent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
