package androidx.media2.session;

import androidx.media.AudioAttributesCompat;
import q.d;

/* loaded from: classes.dex */
public final class MediaController$PlaybackInfo implements a0.b {

    /* renamed from: a, reason: collision with root package name */
    int f1178a;

    /* renamed from: b, reason: collision with root package name */
    int f1179b;

    /* renamed from: c, reason: collision with root package name */
    int f1180c;

    /* renamed from: d, reason: collision with root package name */
    int f1181d;

    /* renamed from: e, reason: collision with root package name */
    AudioAttributesCompat f1182e;

    MediaController$PlaybackInfo() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MediaController$PlaybackInfo)) {
            return false;
        }
        MediaController$PlaybackInfo mediaController$PlaybackInfo = (MediaController$PlaybackInfo) obj;
        return this.f1178a == mediaController$PlaybackInfo.f1178a && this.f1179b == mediaController$PlaybackInfo.f1179b && this.f1180c == mediaController$PlaybackInfo.f1180c && this.f1181d == mediaController$PlaybackInfo.f1181d && d.a(this.f1182e, mediaController$PlaybackInfo.f1182e);
    }

    public int hashCode() {
        return d.b(Integer.valueOf(this.f1178a), Integer.valueOf(this.f1179b), Integer.valueOf(this.f1180c), Integer.valueOf(this.f1181d), this.f1182e);
    }
}
