package android.support.v4.media;

import H.h;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new h(24);

    /* renamed from: a, reason: collision with root package name */
    public final String f1930a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f1931b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f1932c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f1933d;

    /* renamed from: e, reason: collision with root package name */
    public final Bitmap f1934e;
    public final Uri f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f1935g;

    /* renamed from: h, reason: collision with root package name */
    public final Uri f1936h;

    /* renamed from: i, reason: collision with root package name */
    public Object f1937i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f1930a = str;
        this.f1931b = charSequence;
        this.f1932c = charSequence2;
        this.f1933d = charSequence3;
        this.f1934e = bitmap;
        this.f = uri;
        this.f1935g = bundle;
        this.f1936h = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f1931b) + ", " + ((Object) this.f1932c) + ", " + ((Object) this.f1933d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        Object obj = this.f1937i;
        if (obj == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f1930a);
            builder.setTitle(this.f1931b);
            builder.setSubtitle(this.f1932c);
            builder.setDescription(this.f1933d);
            builder.setIconBitmap(this.f1934e);
            builder.setIconUri(this.f);
            builder.setExtras(this.f1935g);
            builder.setMediaUri(this.f1936h);
            obj = builder.build();
            this.f1937i = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i3);
    }
}
