package androidx.media2.session;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.ParcelImplListSlice;
import androidx.media2.common.SessionPlayer$TrackInfo;
import androidx.media2.common.VideoSize;
import androidx.media2.session.a;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.util.List;

/* loaded from: classes.dex */
class ConnectionResult extends CustomVersionedParcelable {
    MediaMetadata A;
    int B;

    /* renamed from: a, reason: collision with root package name */
    int f1143a;

    /* renamed from: b, reason: collision with root package name */
    a f1144b;

    /* renamed from: c, reason: collision with root package name */
    IBinder f1145c;

    /* renamed from: d, reason: collision with root package name */
    PendingIntent f1146d;

    /* renamed from: e, reason: collision with root package name */
    int f1147e;

    /* renamed from: f, reason: collision with root package name */
    MediaItem f1148f;

    /* renamed from: g, reason: collision with root package name */
    MediaItem f1149g;

    /* renamed from: h, reason: collision with root package name */
    long f1150h;

    /* renamed from: i, reason: collision with root package name */
    long f1151i;

    /* renamed from: j, reason: collision with root package name */
    float f1152j;

    /* renamed from: k, reason: collision with root package name */
    long f1153k;

    /* renamed from: l, reason: collision with root package name */
    MediaController$PlaybackInfo f1154l;

    /* renamed from: m, reason: collision with root package name */
    int f1155m;

    /* renamed from: n, reason: collision with root package name */
    int f1156n;

    /* renamed from: o, reason: collision with root package name */
    ParcelImplListSlice f1157o;

    /* renamed from: p, reason: collision with root package name */
    SessionCommandGroup f1158p;

    /* renamed from: q, reason: collision with root package name */
    int f1159q;

    /* renamed from: r, reason: collision with root package name */
    int f1160r;

    /* renamed from: s, reason: collision with root package name */
    int f1161s;

    /* renamed from: t, reason: collision with root package name */
    Bundle f1162t;

    /* renamed from: u, reason: collision with root package name */
    VideoSize f1163u;

    /* renamed from: v, reason: collision with root package name */
    List<SessionPlayer$TrackInfo> f1164v;

    /* renamed from: w, reason: collision with root package name */
    SessionPlayer$TrackInfo f1165w;

    /* renamed from: x, reason: collision with root package name */
    SessionPlayer$TrackInfo f1166x;

    /* renamed from: y, reason: collision with root package name */
    SessionPlayer$TrackInfo f1167y;

    /* renamed from: z, reason: collision with root package name */
    SessionPlayer$TrackInfo f1168z;

    ConnectionResult() {
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void c() {
        this.f1144b = a.AbstractBinderC0021a.E(this.f1145c);
        this.f1148f = this.f1149g;
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void d(boolean z6) {
        synchronized (this.f1144b) {
            if (this.f1145c == null) {
                this.f1145c = (IBinder) this.f1144b;
                this.f1149g = b.c(this.f1148f);
            }
        }
    }
}
