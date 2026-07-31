package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.support.v4.media.b;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final String f9776b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence f9777c;

    /* renamed from: d, reason: collision with root package name */
    private final CharSequence f9778d;

    /* renamed from: e, reason: collision with root package name */
    private final CharSequence f9779e;

    /* renamed from: f, reason: collision with root package name */
    private final Bitmap f9780f;

    /* renamed from: g, reason: collision with root package name */
    private final Uri f9781g;

    /* renamed from: h, reason: collision with root package name */
    private final Bundle f9782h;

    /* renamed from: i, reason: collision with root package name */
    private final Uri f9783i;

    /* renamed from: j, reason: collision with root package name */
    private Object f9784j;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(android.support.v4.media.a.a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i4) {
            return new MediaDescriptionCompat[i4];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f9785a;

        /* renamed from: b, reason: collision with root package name */
        private CharSequence f9786b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f9787c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f9788d;

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f9789e;

        /* renamed from: f, reason: collision with root package name */
        private Uri f9790f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f9791g;

        /* renamed from: h, reason: collision with root package name */
        private Uri f9792h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f9785a, this.f9786b, this.f9787c, this.f9788d, this.f9789e, this.f9790f, this.f9791g, this.f9792h);
        }

        public b b(CharSequence charSequence) {
            this.f9788d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f9791g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f9789e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f9790f = uri;
            return this;
        }

        public b f(String str) {
            this.f9785a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f9792h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f9787c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f9786b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f9776b = str;
        this.f9777c = charSequence;
        this.f9778d = charSequence2;
        this.f9779e = charSequence3;
        this.f9780f = bitmap;
        this.f9781g = uri;
        this.f9782h = bundle;
        this.f9783i = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MediaDescriptionCompat a(Object obj) {
        Uri uri;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        b bVar = new b();
        bVar.f(android.support.v4.media.a.f(obj));
        bVar.i(android.support.v4.media.a.h(obj));
        bVar.h(android.support.v4.media.a.g(obj));
        bVar.b(android.support.v4.media.a.b(obj));
        bVar.d(android.support.v4.media.a.d(obj));
        bVar.e(android.support.v4.media.a.e(obj));
        Bundle c4 = android.support.v4.media.a.c(obj);
        if (c4 != null) {
            MediaSessionCompat.a(c4);
            uri = (Uri) c4.getParcelable("android.support.v4.media.description.MEDIA_URI");
        } else {
            uri = null;
        }
        if (uri != null) {
            if (!c4.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || c4.size() != 2) {
                c4.remove("android.support.v4.media.description.MEDIA_URI");
                c4.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            }
            bVar.c(bundle);
            if (uri == null) {
                bVar.g(uri);
            } else {
                bVar.g(android.support.v4.media.b.a(obj));
            }
            MediaDescriptionCompat a4 = bVar.a();
            a4.f9784j = obj;
            return a4;
        }
        bundle = c4;
        bVar.c(bundle);
        if (uri == null) {
        }
        MediaDescriptionCompat a42 = bVar.a();
        a42.f9784j = obj;
        return a42;
    }

    public Object c() {
        Object obj = this.f9784j;
        if (obj != null) {
            return obj;
        }
        Object b4 = a.C0072a.b();
        a.C0072a.g(b4, this.f9776b);
        a.C0072a.i(b4, this.f9777c);
        a.C0072a.h(b4, this.f9778d);
        a.C0072a.c(b4, this.f9779e);
        a.C0072a.e(b4, this.f9780f);
        a.C0072a.f(b4, this.f9781g);
        a.C0072a.d(b4, this.f9782h);
        b.a.a(b4, this.f9783i);
        Object a4 = a.C0072a.a(b4);
        this.f9784j = a4;
        return a4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f9777c) + ", " + ((Object) this.f9778d) + ", " + ((Object) this.f9779e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        android.support.v4.media.a.i(c(), parcel, i4);
    }
}
