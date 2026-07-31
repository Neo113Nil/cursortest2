package androidx.media;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    f f1087a;

    public e(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String a7 = g.a(remoteUserInfo);
        Objects.requireNonNull(a7, "package shouldn't be null");
        if (TextUtils.isEmpty(a7)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.f1087a = new g(remoteUserInfo);
    }

    public e(String str, int i7, int i8) {
        Objects.requireNonNull(str, "package shouldn't be null");
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.f1087a = Build.VERSION.SDK_INT >= 28 ? new g(str, i7, i8) : new h(str, i7, i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f1087a.equals(((e) obj).f1087a);
        }
        return false;
    }

    public int hashCode() {
        return this.f1087a.hashCode();
    }
}
