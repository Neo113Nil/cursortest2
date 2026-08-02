package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new b(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f1950a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1951b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1952c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1953d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1954e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f1955g;

    /* renamed from: h, reason: collision with root package name */
    public final long f1956h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f1957i;

    /* renamed from: j, reason: collision with root package name */
    public final long f1958j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f1959k;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new c();

        /* renamed from: a, reason: collision with root package name */
        public final String f1960a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f1961b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1962c;

        /* renamed from: d, reason: collision with root package name */
        public final Bundle f1963d;

        public CustomAction(Parcel parcel) {
            this.f1960a = parcel.readString();
            this.f1961b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1962c = parcel.readInt();
            this.f1963d = parcel.readBundle(a.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f1961b) + ", mIcon=" + this.f1962c + ", mExtras=" + this.f1963d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i3) {
            parcel.writeString(this.f1960a);
            TextUtils.writeToParcel(this.f1961b, parcel, i3);
            parcel.writeInt(this.f1962c);
            parcel.writeBundle(this.f1963d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f1950a = parcel.readInt();
        this.f1951b = parcel.readLong();
        this.f1953d = parcel.readFloat();
        this.f1956h = parcel.readLong();
        this.f1952c = parcel.readLong();
        this.f1954e = parcel.readLong();
        this.f1955g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1957i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f1958j = parcel.readLong();
        this.f1959k = parcel.readBundle(a.class.getClassLoader());
        this.f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f1950a + ", position=" + this.f1951b + ", buffered position=" + this.f1952c + ", speed=" + this.f1953d + ", updated=" + this.f1956h + ", actions=" + this.f1954e + ", error code=" + this.f + ", error message=" + this.f1955g + ", custom actions=" + this.f1957i + ", active item id=" + this.f1958j + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f1950a);
        parcel.writeLong(this.f1951b);
        parcel.writeFloat(this.f1953d);
        parcel.writeLong(this.f1956h);
        parcel.writeLong(this.f1952c);
        parcel.writeLong(this.f1954e);
        TextUtils.writeToParcel(this.f1955g, parcel, i3);
        parcel.writeTypedList(this.f1957i);
        parcel.writeLong(this.f1958j);
        parcel.writeBundle(this.f1959k);
        parcel.writeInt(this.f);
    }
}
