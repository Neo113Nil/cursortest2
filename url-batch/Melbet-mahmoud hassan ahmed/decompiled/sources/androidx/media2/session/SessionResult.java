package androidx.media2.session;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.media2.common.MediaItem;
import androidx.versionedparcelable.CustomVersionedParcelable;

/* loaded from: classes.dex */
public class SessionResult extends CustomVersionedParcelable {

    /* renamed from: a, reason: collision with root package name */
    int f1202a;

    /* renamed from: b, reason: collision with root package name */
    long f1203b;

    /* renamed from: c, reason: collision with root package name */
    Bundle f1204c;

    /* renamed from: d, reason: collision with root package name */
    MediaItem f1205d;

    /* renamed from: e, reason: collision with root package name */
    MediaItem f1206e;

    SessionResult() {
    }

    public SessionResult(int i7, Bundle bundle) {
        this(i7, bundle, null, SystemClock.elapsedRealtime());
    }

    SessionResult(int i7, Bundle bundle, MediaItem mediaItem, long j7) {
        this.f1202a = i7;
        this.f1204c = bundle;
        this.f1205d = mediaItem;
        this.f1203b = j7;
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void c() {
        this.f1205d = this.f1206e;
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void d(boolean z6) {
        MediaItem mediaItem = this.f1205d;
        if (mediaItem != null) {
            synchronized (mediaItem) {
                if (this.f1206e == null) {
                    this.f1206e = b.c(this.f1205d);
                }
            }
        }
    }
}
