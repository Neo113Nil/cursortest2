package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class SharePhoto extends ShareMedia {
    public static final Parcelable.Creator<SharePhoto> CREATOR = new Parcelable.Creator<SharePhoto>() { // from class: com.facebook.share.model.SharePhoto.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SharePhoto createFromParcel(Parcel parcel) {
            return new SharePhoto(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SharePhoto[] newArray(int i) {
            return new SharePhoto[i];
        }
    };
    private final Bitmap bitmap;
    private final String caption;
    private final Uri imageUrl;
    private final boolean userGenerated;

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SharePhoto(a aVar) {
        super(aVar);
        this.bitmap = aVar.f6407a;
        this.imageUrl = aVar.f6408b;
        this.userGenerated = aVar.f6409c;
        this.caption = aVar.f6410d;
    }

    SharePhoto(Parcel parcel) {
        super(parcel);
        this.bitmap = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.imageUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.userGenerated = parcel.readByte() != 0;
        this.caption = parcel.readString();
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public Uri getImageUrl() {
        return this.imageUrl;
    }

    public boolean getUserGenerated() {
        return this.userGenerated;
    }

    public String getCaption() {
        return this.caption;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.bitmap, 0);
        parcel.writeParcelable(this.imageUrl, 0);
        parcel.writeByte(this.userGenerated ? (byte) 1 : (byte) 0);
        parcel.writeString(this.caption);
    }

    @Override // com.facebook.share.model.ShareMedia
    public ShareMedia.b getMediaType() {
        return ShareMedia.b.PHOTO;
    }

    public static final class a extends ShareMedia.a<SharePhoto, a> {

        /* renamed from: a, reason: collision with root package name */
        private Bitmap f6407a;

        /* renamed from: b, reason: collision with root package name */
        private Uri f6408b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f6409c;

        /* renamed from: d, reason: collision with root package name */
        private String f6410d;

        public a a(Bitmap bitmap) {
            this.f6407a = bitmap;
            return this;
        }

        public a a(Uri uri) {
            this.f6408b = uri;
            return this;
        }

        public a a(boolean z) {
            this.f6409c = z;
            return this;
        }

        public a a(String str) {
            this.f6410d = str;
            return this;
        }

        Uri a() {
            return this.f6408b;
        }

        Bitmap b() {
            return this.f6407a;
        }

        public SharePhoto c() {
            return new SharePhoto(this);
        }

        @Override // com.facebook.share.model.ShareMedia.a
        public a a(SharePhoto sharePhoto) {
            return sharePhoto == null ? this : ((a) super.a((a) sharePhoto)).a(sharePhoto.getBitmap()).a(sharePhoto.getImageUrl()).a(sharePhoto.getUserGenerated()).a(sharePhoto.getCaption());
        }

        a b(Parcel parcel) {
            return a((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
        }

        static void a(Parcel parcel, int i, List<SharePhoto> list) {
            ShareMedia[] shareMediaArr = new ShareMedia[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                shareMediaArr[i2] = list.get(i2);
            }
            parcel.writeParcelableArray(shareMediaArr, i);
        }

        static List<SharePhoto> c(Parcel parcel) {
            List<ShareMedia> a2 = a(parcel);
            ArrayList arrayList = new ArrayList();
            for (ShareMedia shareMedia : a2) {
                if (shareMedia instanceof SharePhoto) {
                    arrayList.add((SharePhoto) shareMedia);
                }
            }
            return arrayList;
        }
    }
}
