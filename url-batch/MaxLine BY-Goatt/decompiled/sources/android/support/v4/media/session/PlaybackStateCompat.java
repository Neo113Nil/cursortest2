package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.s3;
import defpackage.yj1;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new s3(23);
    public final int m;
    public final long n;
    public final long o;
    public final float p;
    public final long q;
    public final int r;
    public final CharSequence s;
    public final long t;
    public final ArrayList u;
    public final long v;
    public final Bundle w;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();
        public final String m;
        public final CharSequence n;
        public final int o;
        public final Bundle p;

        public CustomAction(Parcel parcel) {
            this.m = parcel.readString();
            this.n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.o = parcel.readInt();
            this.p = parcel.readBundle(yj1.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.n) + ", mIcon=" + this.o + ", mExtras=" + this.p;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.m);
            TextUtils.writeToParcel(this.n, parcel, i);
            parcel.writeInt(this.o);
            parcel.writeBundle(this.p);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.m = parcel.readInt();
        this.n = parcel.readLong();
        this.p = parcel.readFloat();
        this.t = parcel.readLong();
        this.o = parcel.readLong();
        this.q = parcel.readLong();
        this.s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.u = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.v = parcel.readLong();
        this.w = parcel.readBundle(yj1.class.getClassLoader());
        this.r = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.m + ", position=" + this.n + ", buffered position=" + this.o + ", speed=" + this.p + ", updated=" + this.t + ", actions=" + this.q + ", error code=" + this.r + ", error message=" + this.s + ", custom actions=" + this.u + ", active item id=" + this.v + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.m);
        parcel.writeLong(this.n);
        parcel.writeFloat(this.p);
        parcel.writeLong(this.t);
        parcel.writeLong(this.o);
        parcel.writeLong(this.q);
        TextUtils.writeToParcel(this.s, parcel, i);
        parcel.writeTypedList(this.u);
        parcel.writeLong(this.v);
        parcel.writeBundle(this.w);
        parcel.writeInt(this.r);
    }
}
