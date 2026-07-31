package androidx.media2.common;

import androidx.versionedparcelable.CustomVersionedParcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import q.e;

/* loaded from: classes.dex */
public class MediaItem extends CustomVersionedParcelable {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1110a;

    /* renamed from: b, reason: collision with root package name */
    MediaMetadata f1111b;

    /* renamed from: c, reason: collision with root package name */
    long f1112c;

    /* renamed from: d, reason: collision with root package name */
    long f1113d;

    /* renamed from: e, reason: collision with root package name */
    private final List<e<Object, Executor>> f1114e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        MediaMetadata f1115a;

        /* renamed from: b, reason: collision with root package name */
        long f1116b = 0;

        /* renamed from: c, reason: collision with root package name */
        long f1117c = 576460752303423487L;

        public MediaItem a() {
            return new MediaItem(this);
        }

        public a b(long j7) {
            if (j7 < 0) {
                j7 = 576460752303423487L;
            }
            this.f1117c = j7;
            return this;
        }

        public a c(MediaMetadata mediaMetadata) {
            this.f1115a = mediaMetadata;
            return this;
        }

        public a d(long j7) {
            if (j7 < 0) {
                j7 = 0;
            }
            this.f1116b = j7;
            return this;
        }
    }

    MediaItem() {
        this.f1110a = new Object();
        this.f1112c = 0L;
        this.f1113d = 576460752303423487L;
        this.f1114e = new ArrayList();
    }

    MediaItem(a aVar) {
        this(aVar.f1115a, aVar.f1116b, aVar.f1117c);
    }

    MediaItem(MediaItem mediaItem) {
        this(mediaItem.f1111b, mediaItem.f1112c, mediaItem.f1113d);
    }

    MediaItem(MediaMetadata mediaMetadata, long j7, long j8) {
        this.f1110a = new Object();
        this.f1112c = 0L;
        this.f1113d = 576460752303423487L;
        this.f1114e = new ArrayList();
        if (j7 > j8) {
            throw new IllegalStateException("Illegal start/end position: " + j7 + " : " + j8);
        }
        if (mediaMetadata != null && mediaMetadata.e("android.media.metadata.DURATION")) {
            long f7 = mediaMetadata.f("android.media.metadata.DURATION");
            if (f7 != Long.MIN_VALUE && j8 != 576460752303423487L && j8 > f7) {
                throw new IllegalStateException("endPositionMs shouldn't be greater than duration in the metdata, endPositionMs=" + j8 + ", durationMs=" + f7);
            }
        }
        this.f1111b = mediaMetadata;
        this.f1112c = j7;
        this.f1113d = j8;
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void d(boolean z6) {
        if (getClass() != MediaItem.class) {
            throw new RuntimeException("MediaItem's subclasses shouldn't be parcelized.");
        }
        super.d(z6);
    }

    public long e() {
        return this.f1113d;
    }

    public String f() {
        String g7;
        synchronized (this.f1110a) {
            MediaMetadata mediaMetadata = this.f1111b;
            g7 = mediaMetadata != null ? mediaMetadata.g("android.media.metadata.MEDIA_ID") : null;
        }
        return g7;
    }

    public MediaMetadata g() {
        MediaMetadata mediaMetadata;
        synchronized (this.f1110a) {
            mediaMetadata = this.f1111b;
        }
        return mediaMetadata;
    }

    public long h() {
        return this.f1112c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        synchronized (this.f1110a) {
            sb.append("{Media Id=");
            sb.append(f());
            sb.append(", mMetadata=");
            sb.append(this.f1111b);
            sb.append(", mStartPositionMs=");
            sb.append(this.f1112c);
            sb.append(", mEndPositionMs=");
            sb.append(this.f1113d);
            sb.append('}');
        }
        return sb.toString();
    }
}
