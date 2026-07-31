package androidx.media2.common;

import android.media.MediaFormat;
import android.os.Bundle;
import androidx.versionedparcelable.CustomVersionedParcelable;

/* loaded from: classes.dex */
public class SessionPlayer$TrackInfo extends CustomVersionedParcelable {

    /* renamed from: a, reason: collision with root package name */
    int f1128a;

    /* renamed from: b, reason: collision with root package name */
    int f1129b;

    /* renamed from: c, reason: collision with root package name */
    MediaFormat f1130c;

    /* renamed from: d, reason: collision with root package name */
    boolean f1131d;

    /* renamed from: e, reason: collision with root package name */
    Bundle f1132e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f1133f = new Object();

    SessionPlayer$TrackInfo() {
    }

    private static void e(String str, MediaFormat mediaFormat, Bundle bundle) {
        if (mediaFormat.containsKey(str)) {
            bundle.putInt(str, mediaFormat.getInteger(str));
        }
    }

    private static void f(String str, MediaFormat mediaFormat, Bundle bundle) {
        if (mediaFormat.containsKey(str)) {
            bundle.putString(str, mediaFormat.getString(str));
        }
    }

    private static void g(String str, MediaFormat mediaFormat, Bundle bundle) {
        if (bundle.containsKey(str)) {
            mediaFormat.setInteger(str, bundle.getInt(str));
        }
    }

    private static void h(String str, MediaFormat mediaFormat, Bundle bundle) {
        if (bundle.containsKey(str)) {
            mediaFormat.setString(str, bundle.getString(str));
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void c() {
        Bundle bundle = this.f1132e;
        if (bundle != null && !bundle.getBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_FORMAT_NULL")) {
            MediaFormat mediaFormat = new MediaFormat();
            this.f1130c = mediaFormat;
            h("language", mediaFormat, this.f1132e);
            h("mime", this.f1130c, this.f1132e);
            g("is-forced-subtitle", this.f1130c, this.f1132e);
            g("is-autoselect", this.f1130c, this.f1132e);
            g("is-default", this.f1130c, this.f1132e);
        }
        Bundle bundle2 = this.f1132e;
        if (bundle2 == null || !bundle2.containsKey("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_SELECTABLE")) {
            this.f1131d = this.f1129b != 1;
        } else {
            this.f1131d = this.f1132e.getBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_SELECTABLE");
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void d(boolean z6) {
        synchronized (this.f1133f) {
            Bundle bundle = new Bundle();
            this.f1132e = bundle;
            bundle.putBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_FORMAT_NULL", this.f1130c == null);
            MediaFormat mediaFormat = this.f1130c;
            if (mediaFormat != null) {
                f("language", mediaFormat, this.f1132e);
                f("mime", this.f1130c, this.f1132e);
                e("is-forced-subtitle", this.f1130c, this.f1132e);
                e("is-autoselect", this.f1130c, this.f1132e);
                e("is-default", this.f1130c, this.f1132e);
            }
            this.f1132e.putBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_SELECTABLE", this.f1131d);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SessionPlayer$TrackInfo) && this.f1128a == ((SessionPlayer$TrackInfo) obj).f1128a;
    }

    public int hashCode() {
        return this.f1128a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getName());
        sb.append('#');
        sb.append(this.f1128a);
        sb.append('{');
        int i7 = this.f1129b;
        sb.append(i7 != 1 ? i7 != 2 ? i7 != 4 ? i7 != 5 ? "UNKNOWN" : "METADATA" : "SUBTITLE" : "AUDIO" : "VIDEO");
        sb.append(", ");
        sb.append(this.f1130c);
        sb.append(", isSelectable=");
        sb.append(this.f1131d);
        sb.append("}");
        return sb.toString();
    }
}
