package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareContent.a;
import com.facebook.share.model.ShareHashtag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ShareContent<P extends ShareContent, E extends a> implements ShareModel {
    private final Uri contentUrl;
    private final ShareHashtag hashtag;
    private final List<String> peopleIds;
    private final String placeId;
    private final String ref;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected ShareContent(a aVar) {
        this.contentUrl = aVar.f6393a;
        this.peopleIds = aVar.f6394b;
        this.placeId = aVar.f6395c;
        this.ref = aVar.f6396d;
        this.hashtag = aVar.e;
    }

    protected ShareContent(Parcel parcel) {
        this.contentUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.peopleIds = readUnmodifiableStringList(parcel);
        this.placeId = parcel.readString();
        this.ref = parcel.readString();
        this.hashtag = new ShareHashtag.a().a(parcel).a();
    }

    public Uri getContentUrl() {
        return this.contentUrl;
    }

    public List<String> getPeopleIds() {
        return this.peopleIds;
    }

    public String getPlaceId() {
        return this.placeId;
    }

    public String getRef() {
        return this.ref;
    }

    public ShareHashtag getShareHashtag() {
        return this.hashtag;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.contentUrl, 0);
        parcel.writeStringList(this.peopleIds);
        parcel.writeString(this.placeId);
        parcel.writeString(this.ref);
        parcel.writeParcelable(this.hashtag, 0);
    }

    private List<String> readUnmodifiableStringList(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.size() == 0) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static abstract class a<P extends ShareContent, E extends a> {

        /* renamed from: a, reason: collision with root package name */
        private Uri f6393a;

        /* renamed from: b, reason: collision with root package name */
        private List<String> f6394b;

        /* renamed from: c, reason: collision with root package name */
        private String f6395c;

        /* renamed from: d, reason: collision with root package name */
        private String f6396d;
        private ShareHashtag e;

        public E a(Uri uri) {
            this.f6393a = uri;
            return this;
        }
    }
}
