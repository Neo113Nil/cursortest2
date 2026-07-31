package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: i, reason: collision with root package name */
    static final h.a<String, Integer> f329i;

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f330j;

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f331k;

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f332l;

    /* renamed from: f, reason: collision with root package name */
    final Bundle f333f;

    /* renamed from: g, reason: collision with root package name */
    private MediaMetadata f334g;

    /* renamed from: h, reason: collision with root package name */
    private MediaDescriptionCompat f335h;

    class a implements Parcelable.Creator<MediaMetadataCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat[] newArray(int i7) {
            return new MediaMetadataCompat[i7];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Bundle f336a;

        public b() {
            this.f336a = new Bundle();
        }

        public b(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.f333f);
            this.f336a = bundle;
            MediaSessionCompat.a(bundle);
        }

        public b(MediaMetadataCompat mediaMetadataCompat, int i7) {
            this(mediaMetadataCompat);
            for (String str : this.f336a.keySet()) {
                Object obj = this.f336a.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i7 || bitmap.getWidth() > i7) {
                        b(str, f(bitmap, i7));
                    }
                }
            }
        }

        private Bitmap f(Bitmap bitmap, int i7) {
            float f7 = i7;
            float min = Math.min(f7 / bitmap.getWidth(), f7 / bitmap.getHeight());
            return Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
        }

        public MediaMetadataCompat a() {
            return new MediaMetadataCompat(this.f336a);
        }

        public b b(String str, Bitmap bitmap) {
            h.a<String, Integer> aVar = MediaMetadataCompat.f329i;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 2) {
                this.f336a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        public b c(String str, long j7) {
            h.a<String, Integer> aVar = MediaMetadataCompat.f329i;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 0) {
                this.f336a.putLong(str, j7);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v3, types: [android.os.Parcelable] */
        public b d(String str, RatingCompat ratingCompat) {
            RatingCompat ratingCompat2;
            Bundle bundle;
            h.a<String, Integer> aVar = MediaMetadataCompat.f329i;
            if (aVar.containsKey(str) && aVar.get(str).intValue() != 3) {
                throw new IllegalArgumentException("The " + str + " key cannot be used to put a Rating");
            }
            if (Build.VERSION.SDK_INT >= 19) {
                bundle = this.f336a;
                ratingCompat2 = (Parcelable) ratingCompat.g();
            } else {
                bundle = this.f336a;
                ratingCompat2 = ratingCompat;
            }
            bundle.putParcelable(str, ratingCompat2);
            return this;
        }

        public b e(String str, String str2) {
            h.a<String, Integer> aVar = MediaMetadataCompat.f329i;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 1) {
                this.f336a.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
        }
    }

    static {
        h.a<String, Integer> aVar = new h.a<>();
        f329i = aVar;
        aVar.put("android.media.metadata.TITLE", 1);
        aVar.put("android.media.metadata.ARTIST", 1);
        aVar.put("android.media.metadata.DURATION", 0);
        aVar.put("android.media.metadata.ALBUM", 1);
        aVar.put("android.media.metadata.AUTHOR", 1);
        aVar.put("android.media.metadata.WRITER", 1);
        aVar.put("android.media.metadata.COMPOSER", 1);
        aVar.put("android.media.metadata.COMPILATION", 1);
        aVar.put("android.media.metadata.DATE", 1);
        aVar.put("android.media.metadata.YEAR", 0);
        aVar.put("android.media.metadata.GENRE", 1);
        aVar.put("android.media.metadata.TRACK_NUMBER", 0);
        aVar.put("android.media.metadata.NUM_TRACKS", 0);
        aVar.put("android.media.metadata.DISC_NUMBER", 0);
        aVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        aVar.put("android.media.metadata.ART", 2);
        aVar.put("android.media.metadata.ART_URI", 1);
        aVar.put("android.media.metadata.ALBUM_ART", 2);
        aVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        aVar.put("android.media.metadata.USER_RATING", 3);
        aVar.put("android.media.metadata.RATING", 3);
        aVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        aVar.put("android.media.metadata.DISPLAY_ICON", 2);
        aVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        aVar.put("android.media.metadata.MEDIA_ID", 1);
        aVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        aVar.put("android.media.metadata.MEDIA_URI", 1);
        aVar.put("android.media.metadata.ADVERTISEMENT", 0);
        aVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f330j = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f331k = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f332l = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new a();
    }

    MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f333f = bundle2;
        MediaSessionCompat.a(bundle2);
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f333f = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public static MediaMetadataCompat c(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f334g = mediaMetadata;
        return createFromParcel;
    }

    public boolean a(String str) {
        return this.f333f.containsKey(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bitmap g(String str) {
        try {
            return (Bitmap) this.f333f.getParcelable(str);
        } catch (Exception e7) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e7);
            return null;
        }
    }

    public Bundle h() {
        return new Bundle(this.f333f);
    }

    public MediaDescriptionCompat i() {
        Bitmap bitmap;
        Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.f335h;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String m7 = m("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence n7 = n("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(n7)) {
            int i7 = 0;
            int i8 = 0;
            while (i7 < 3) {
                String[] strArr = f330j;
                if (i8 >= strArr.length) {
                    break;
                }
                int i9 = i8 + 1;
                CharSequence n8 = n(strArr[i8]);
                if (!TextUtils.isEmpty(n8)) {
                    charSequenceArr[i7] = n8;
                    i7++;
                }
                i8 = i9;
            }
        } else {
            charSequenceArr[0] = n7;
            charSequenceArr[1] = n("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = n("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i10 = 0;
        while (true) {
            String[] strArr2 = f331k;
            if (i10 >= strArr2.length) {
                bitmap = null;
                break;
            }
            bitmap = g(strArr2[i10]);
            if (bitmap != null) {
                break;
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            String[] strArr3 = f332l;
            if (i11 >= strArr3.length) {
                uri = null;
                break;
            }
            String m8 = m(strArr3[i11]);
            if (!TextUtils.isEmpty(m8)) {
                uri = Uri.parse(m8);
                break;
            }
            i11++;
        }
        String m9 = m("android.media.metadata.MEDIA_URI");
        Uri parse = TextUtils.isEmpty(m9) ? null : Uri.parse(m9);
        MediaDescriptionCompat.d dVar = new MediaDescriptionCompat.d();
        dVar.f(m7);
        dVar.i(charSequenceArr[0]);
        dVar.h(charSequenceArr[1]);
        dVar.b(charSequenceArr[2]);
        dVar.d(bitmap);
        dVar.e(uri);
        dVar.g(parse);
        Bundle bundle = new Bundle();
        if (this.f333f.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", j("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (this.f333f.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", j("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (!bundle.isEmpty()) {
            dVar.c(bundle);
        }
        MediaDescriptionCompat a7 = dVar.a();
        this.f335h = a7;
        return a7;
    }

    public long j(String str) {
        return this.f333f.getLong(str, 0L);
    }

    public Object k() {
        if (this.f334g == null && Build.VERSION.SDK_INT >= 21) {
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.f334g = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        return this.f334g;
    }

    public RatingCompat l(String str) {
        try {
            return Build.VERSION.SDK_INT >= 19 ? RatingCompat.a(this.f333f.getParcelable(str)) : (RatingCompat) this.f333f.getParcelable(str);
        } catch (Exception e7) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", e7);
            return null;
        }
    }

    public String m(String str) {
        CharSequence charSequence = this.f333f.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public CharSequence n(String str) {
        return this.f333f.getCharSequence(str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeBundle(this.f333f);
    }
}
