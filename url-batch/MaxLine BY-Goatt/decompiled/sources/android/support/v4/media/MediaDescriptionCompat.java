package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s3;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new s3(10);
    public final String m;
    public final CharSequence n;
    public final CharSequence o;
    public final CharSequence p;
    public final Bitmap q;
    public final Uri r;
    public final Bundle s;
    public final Uri t;
    public Object u;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.m = str;
        this.n = charSequence;
        this.o = charSequence2;
        this.p = charSequence3;
        this.q = bitmap;
        this.r = uri;
        this.s = bundle;
        this.t = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.n) + ", " + ((Object) this.o) + ", " + ((Object) this.p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Object obj = this.u;
        if (obj == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.m);
            builder.setTitle(this.n);
            builder.setSubtitle(this.o);
            builder.setDescription(this.p);
            builder.setIconBitmap(this.q);
            builder.setIconUri(this.r);
            builder.setExtras(this.s);
            builder.setMediaUri(this.t);
            obj = builder.build();
            this.u = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }
}
