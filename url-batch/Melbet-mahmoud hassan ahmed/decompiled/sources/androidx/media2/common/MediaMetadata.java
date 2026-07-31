package androidx.media2.common;

import a0.b;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import androidx.versionedparcelable.ParcelImpl;
import h.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class MediaMetadata extends CustomVersionedParcelable {

    /* renamed from: d, reason: collision with root package name */
    static final a<String, Integer> f1118d;

    /* renamed from: a, reason: collision with root package name */
    Bundle f1119a;

    /* renamed from: b, reason: collision with root package name */
    Bundle f1120b;

    /* renamed from: c, reason: collision with root package name */
    ParcelImplListSlice f1121c;

    static final class BitmapEntry implements b {

        /* renamed from: a, reason: collision with root package name */
        String f1122a;

        /* renamed from: b, reason: collision with root package name */
        Bitmap f1123b;

        BitmapEntry() {
        }

        BitmapEntry(String str, Bitmap bitmap) {
            this.f1122a = str;
            this.f1123b = bitmap;
            int d7 = d(bitmap);
            if (d7 > 262144) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                double d8 = d7;
                Double.isNaN(d8);
                double sqrt = Math.sqrt(262144.0d / d8);
                double d9 = width;
                Double.isNaN(d9);
                int i7 = (int) (d9 * sqrt);
                double d10 = height;
                Double.isNaN(d10);
                int i8 = (int) (d10 * sqrt);
                Log.i("MediaMetadata", "Scaling large bitmap of " + width + "x" + height + " into " + i7 + "x" + i8);
                this.f1123b = Bitmap.createScaledBitmap(bitmap, i7, i8, true);
            }
        }

        private int d(Bitmap bitmap) {
            return m.a.a(bitmap);
        }

        Bitmap c() {
            return this.f1123b;
        }

        String e() {
            return this.f1122a;
        }
    }

    static {
        a<String, Integer> aVar = new a<>();
        f1118d = aVar;
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
        aVar.put("android.media.metadata.MEDIA_URI", 1);
        aVar.put("androidx.media2.metadata.RADIO_FREQUENCY", 4);
        aVar.put("androidx.media2.metadata.RADIO_PROGRAM_NAME", 1);
        aVar.put("androidx.media2.metadata.BROWSABLE", 0);
        aVar.put("androidx.media2.metadata.PLAYABLE", 0);
        aVar.put("androidx.media2.metadata.ADVERTISEMENT", 0);
        aVar.put("androidx.media2.metadata.DOWNLOAD_STATUS", 0);
        aVar.put("androidx.media2.metadata.EXTRAS", 5);
    }

    MediaMetadata() {
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void c() {
        Bundle bundle = this.f1120b;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f1119a = bundle;
        ParcelImplListSlice parcelImplListSlice = this.f1121c;
        if (parcelImplListSlice != null) {
            Iterator<ParcelImpl> it = parcelImplListSlice.a().iterator();
            while (it.hasNext()) {
                BitmapEntry bitmapEntry = (BitmapEntry) MediaParcelUtils.a(it.next());
                this.f1119a.putParcelable(bitmapEntry.e(), bitmapEntry.c());
            }
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void d(boolean z6) {
        synchronized (this.f1119a) {
            if (this.f1120b == null) {
                this.f1120b = new Bundle(this.f1119a);
                ArrayList arrayList = new ArrayList();
                for (String str : this.f1119a.keySet()) {
                    Object obj = this.f1119a.get(str);
                    if (obj instanceof Bitmap) {
                        arrayList.add(MediaParcelUtils.b(new BitmapEntry(str, (Bitmap) obj)));
                        this.f1120b.remove(str);
                    }
                }
                this.f1121c = new ParcelImplListSlice(arrayList);
            }
        }
    }

    public boolean e(String str) {
        Objects.requireNonNull(str, "key shouldn't be null");
        return this.f1119a.containsKey(str);
    }

    public long f(String str) {
        Objects.requireNonNull(str, "key shouldn't be null");
        return this.f1119a.getLong(str, 0L);
    }

    public String g(String str) {
        Objects.requireNonNull(str, "key shouldn't be null");
        CharSequence charSequence = this.f1119a.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public String toString() {
        return this.f1119a.toString();
    }
}
