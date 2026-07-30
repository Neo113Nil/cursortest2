package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.ShareVideo;
import defpackage.ah0;
import defpackage.lh;
import defpackage.zv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ShareMediaContent extends ShareContent<ShareMediaContent, Builder> {
    private final List<ShareMedia<?, ?>> media;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ShareMediaContent> CREATOR = new Parcelable.Creator<ShareMediaContent>() { // from class: com.facebook.share.model.ShareMediaContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareMediaContent createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ShareMediaContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareMediaContent[] newArray(int i) {
            return new ShareMediaContent[i];
        }
    };

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Builder extends ShareContent.Builder<ShareMediaContent, Builder> {
        private final List<ShareMedia<?, ?>> media = new ArrayList();

        public final Builder addMedia(List<? extends ShareMedia<?, ?>> list) {
            if (list != null) {
                Iterator<? extends ShareMedia<?, ?>> it = list.iterator();
                while (it.hasNext()) {
                    addMedium(it.next());
                }
            }
            return this;
        }

        public final Builder addMedium(ShareMedia<?, ?> shareMedia) {
            ShareMedia<?, ?> build;
            if (shareMedia == null) {
                return this;
            }
            if (shareMedia instanceof SharePhoto) {
                build = new SharePhoto.Builder().readFrom((SharePhoto) shareMedia).build();
            } else {
                if (!(shareMedia instanceof ShareVideo)) {
                    lh.e("medium must be either a SharePhoto or ShareVideo");
                    return null;
                }
                build = new ShareVideo.Builder().readFrom((ShareVideo) shareMedia).build();
            }
            this.media.add(build);
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public ShareMediaContent build() {
            return new ShareMediaContent(this, null);
        }

        public final List<ShareMedia<?, ?>> getMedia$facebook_common_release() {
            return this.media;
        }

        @Override // com.facebook.share.model.ShareContent.Builder, com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ShareMediaContent shareMediaContent) {
            return shareMediaContent == null ? this : ((Builder) super.readFrom((Builder) shareMediaContent)).addMedia(shareMediaContent.getMedia());
        }

        public final Builder setMedia(List<? extends ShareMedia<?, ?>> list) {
            this.media.clear();
            addMedia(list);
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareMediaContent(Parcel parcel) {
        super(parcel);
        List<ShareMedia<?, ?>> list;
        parcel.getClass();
        Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
        if (readParcelableArray != null) {
            list = new ArrayList<>();
            for (Parcelable parcelable : readParcelableArray) {
                ShareMedia<?, ?> shareMedia = (ShareMedia) parcelable;
                if (shareMedia != null) {
                    list.add(shareMedia);
                }
            }
        } else {
            list = ah0.m;
        }
        this.media = list;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<ShareMedia<?, ?>> getMedia() {
        return this.media;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
        parcel.writeParcelableArray((Parcelable[]) this.media.toArray(new ShareMedia[0]), i);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private ShareMediaContent(Builder builder) {
        super(builder);
        this.media = zv.M(builder.getMedia$facebook_common_release());
    }

    public /* synthetic */ ShareMediaContent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
