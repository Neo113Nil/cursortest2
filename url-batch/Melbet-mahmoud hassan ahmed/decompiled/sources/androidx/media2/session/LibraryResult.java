package androidx.media2.session;

import androidx.media2.common.MediaItem;
import androidx.media2.common.ParcelImplListSlice;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.util.List;

/* loaded from: classes.dex */
public class LibraryResult extends CustomVersionedParcelable {

    /* renamed from: a, reason: collision with root package name */
    int f1171a;

    /* renamed from: b, reason: collision with root package name */
    long f1172b;

    /* renamed from: c, reason: collision with root package name */
    MediaItem f1173c;

    /* renamed from: d, reason: collision with root package name */
    MediaItem f1174d;

    /* renamed from: e, reason: collision with root package name */
    MediaLibraryService$LibraryParams f1175e;

    /* renamed from: f, reason: collision with root package name */
    List<MediaItem> f1176f;

    /* renamed from: g, reason: collision with root package name */
    ParcelImplListSlice f1177g;

    LibraryResult() {
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void c() {
        this.f1173c = this.f1174d;
        this.f1176f = b.b(this.f1177g);
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void d(boolean z6) {
        MediaItem mediaItem = this.f1173c;
        if (mediaItem != null) {
            synchronized (mediaItem) {
                if (this.f1174d == null) {
                    this.f1174d = b.c(this.f1173c);
                }
            }
        }
        List<MediaItem> list = this.f1176f;
        if (list != null) {
            synchronized (list) {
                if (this.f1177g == null) {
                    this.f1177g = b.a(this.f1176f);
                }
            }
        }
    }
}
