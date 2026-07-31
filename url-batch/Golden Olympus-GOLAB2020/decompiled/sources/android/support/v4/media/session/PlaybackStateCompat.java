package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    final int f9812b;

    /* renamed from: c, reason: collision with root package name */
    final long f9813c;

    /* renamed from: d, reason: collision with root package name */
    final long f9814d;

    /* renamed from: e, reason: collision with root package name */
    final float f9815e;

    /* renamed from: f, reason: collision with root package name */
    final long f9816f;

    /* renamed from: g, reason: collision with root package name */
    final int f9817g;

    /* renamed from: h, reason: collision with root package name */
    final CharSequence f9818h;

    /* renamed from: i, reason: collision with root package name */
    final long f9819i;

    /* renamed from: j, reason: collision with root package name */
    List f9820j;

    /* renamed from: k, reason: collision with root package name */
    final long f9821k;

    /* renamed from: l, reason: collision with root package name */
    final Bundle f9822l;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final String f9823b;

        /* renamed from: c, reason: collision with root package name */
        private final CharSequence f9824c;

        /* renamed from: d, reason: collision with root package name */
        private final int f9825d;

        /* renamed from: e, reason: collision with root package name */
        private final Bundle f9826e;

        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i4) {
                return new CustomAction[i4];
            }
        }

        CustomAction(Parcel parcel) {
            this.f9823b = parcel.readString();
            this.f9824c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f9825d = parcel.readInt();
            this.f9826e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f9824c) + ", mIcon=" + this.f9825d + ", mExtras=" + this.f9826e;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeString(this.f9823b);
            TextUtils.writeToParcel(this.f9824c, parcel, i4);
            parcel.writeInt(this.f9825d);
            parcel.writeBundle(this.f9826e);
        }
    }

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i4) {
            return new PlaybackStateCompat[i4];
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f9812b = parcel.readInt();
        this.f9813c = parcel.readLong();
        this.f9815e = parcel.readFloat();
        this.f9819i = parcel.readLong();
        this.f9814d = parcel.readLong();
        this.f9816f = parcel.readLong();
        this.f9818h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f9820j = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f9821k = parcel.readLong();
        this.f9822l = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f9817g = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f9812b + ", position=" + this.f9813c + ", buffered position=" + this.f9814d + ", speed=" + this.f9815e + ", updated=" + this.f9819i + ", actions=" + this.f9816f + ", error code=" + this.f9817g + ", error message=" + this.f9818h + ", custom actions=" + this.f9820j + ", active item id=" + this.f9821k + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f9812b);
        parcel.writeLong(this.f9813c);
        parcel.writeFloat(this.f9815e);
        parcel.writeLong(this.f9819i);
        parcel.writeLong(this.f9814d);
        parcel.writeLong(this.f9816f);
        TextUtils.writeToParcel(this.f9818h, parcel, i4);
        parcel.writeTypedList(this.f9820j);
        parcel.writeLong(this.f9821k);
        parcel.writeBundle(this.f9822l);
        parcel.writeInt(this.f9817g);
    }
}
