package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    private final String f312f;

    /* renamed from: g, reason: collision with root package name */
    private final CharSequence f313g;

    /* renamed from: h, reason: collision with root package name */
    private final CharSequence f314h;

    /* renamed from: i, reason: collision with root package name */
    private final CharSequence f315i;

    /* renamed from: j, reason: collision with root package name */
    private final Bitmap f316j;

    /* renamed from: k, reason: collision with root package name */
    private final Uri f317k;

    /* renamed from: l, reason: collision with root package name */
    private final Bundle f318l;

    /* renamed from: m, reason: collision with root package name */
    private final Uri f319m;

    /* renamed from: n, reason: collision with root package name */
    private MediaDescription f320n;

    class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i7) {
            return new MediaDescriptionCompat[i7];
        }
    }

    private static class b {
        static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    private static class c {
        static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private String f321a;

        /* renamed from: b, reason: collision with root package name */
        private CharSequence f322b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f323c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f324d;

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f325e;

        /* renamed from: f, reason: collision with root package name */
        private Uri f326f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f327g;

        /* renamed from: h, reason: collision with root package name */
        private Uri f328h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f321a, this.f322b, this.f323c, this.f324d, this.f325e, this.f326f, this.f327g, this.f328h);
        }

        public d b(CharSequence charSequence) {
            this.f324d = charSequence;
            return this;
        }

        public d c(Bundle bundle) {
            this.f327g = bundle;
            return this;
        }

        public d d(Bitmap bitmap) {
            this.f325e = bitmap;
            return this;
        }

        public d e(Uri uri) {
            this.f326f = uri;
            return this;
        }

        public d f(String str) {
            this.f321a = str;
            return this;
        }

        public d g(Uri uri) {
            this.f328h = uri;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f323c = charSequence;
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f322b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f312f = parcel.readString();
        this.f313g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f314h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f315i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f316j = (Bitmap) parcel.readParcelable(classLoader);
        this.f317k = (Uri) parcel.readParcelable(classLoader);
        this.f318l = parcel.readBundle(classLoader);
        this.f319m = (Uri) parcel.readParcelable(classLoader);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f312f = str;
        this.f313g = charSequence;
        this.f314h = charSequence2;
        this.f315i = charSequence3;
        this.f316j = bitmap;
        this.f317k = uri;
        this.f318l = bundle;
        this.f319m = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MediaDescriptionCompat a(Object obj) {
        int i7;
        Bundle bundle = null;
        if (obj == null || (i7 = Build.VERSION.SDK_INT) < 21) {
            return null;
        }
        d dVar = new d();
        MediaDescription mediaDescription = (MediaDescription) obj;
        dVar.f(b.g(mediaDescription));
        dVar.i(b.i(mediaDescription));
        dVar.h(b.h(mediaDescription));
        dVar.b(b.c(mediaDescription));
        dVar.d(b.e(mediaDescription));
        dVar.e(b.f(mediaDescription));
        Bundle d7 = b.d(mediaDescription);
        if (d7 != null) {
            d7 = MediaSessionCompat.u(d7);
        }
        Uri uri = d7 != null ? (Uri) d7.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri != null) {
            if (!d7.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || d7.size() != 2) {
                d7.remove("android.support.v4.media.description.MEDIA_URI");
                d7.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            }
            dVar.c(bundle);
            if (uri == null) {
                dVar.g(uri);
            } else if (i7 >= 23) {
                dVar.g(c.a(mediaDescription));
            }
            MediaDescriptionCompat a7 = dVar.a();
            a7.f320n = mediaDescription;
            return a7;
        }
        bundle = d7;
        dVar.c(bundle);
        if (uri == null) {
        }
        MediaDescriptionCompat a72 = dVar.a();
        a72.f320n = mediaDescription;
        return a72;
    }

    public CharSequence c() {
        return this.f315i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle g() {
        return this.f318l;
    }

    public Bitmap h() {
        return this.f316j;
    }

    public Uri i() {
        return this.f317k;
    }

    public Object j() {
        int i7;
        Bundle bundle;
        MediaDescription mediaDescription = this.f320n;
        if (mediaDescription != null || (i7 = Build.VERSION.SDK_INT) < 21) {
            return mediaDescription;
        }
        MediaDescription.Builder b7 = b.b();
        b.n(b7, this.f312f);
        b.p(b7, this.f313g);
        b.o(b7, this.f314h);
        b.j(b7, this.f315i);
        b.l(b7, this.f316j);
        b.m(b7, this.f317k);
        if (i7 >= 23 || this.f319m == null) {
            bundle = this.f318l;
        } else {
            if (this.f318l == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            } else {
                bundle = new Bundle(this.f318l);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f319m);
        }
        b.k(b7, bundle);
        if (i7 >= 23) {
            c.b(b7, this.f319m);
        }
        MediaDescription a7 = b.a(b7);
        this.f320n = a7;
        return a7;
    }

    public String k() {
        return this.f312f;
    }

    public Uri l() {
        return this.f319m;
    }

    public CharSequence m() {
        return this.f314h;
    }

    public CharSequence n() {
        return this.f313g;
    }

    public String toString() {
        return ((Object) this.f313g) + ", " + ((Object) this.f314h) + ", " + ((Object) this.f315i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        if (Build.VERSION.SDK_INT >= 21) {
            ((MediaDescription) j()).writeToParcel(parcel, i7);
            return;
        }
        parcel.writeString(this.f312f);
        TextUtils.writeToParcel(this.f313g, parcel, i7);
        TextUtils.writeToParcel(this.f314h, parcel, i7);
        TextUtils.writeToParcel(this.f315i, parcel, i7);
        parcel.writeParcelable(this.f316j, i7);
        parcel.writeParcelable(this.f317k, i7);
        parcel.writeBundle(this.f318l);
        parcel.writeParcelable(this.f319m, i7);
    }
}
