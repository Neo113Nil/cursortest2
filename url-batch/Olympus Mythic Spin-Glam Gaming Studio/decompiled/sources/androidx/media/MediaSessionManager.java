package androidx.media;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.MediaSessionManagerImplApi28;
import androidx.media.MediaSessionManagerImplBase;

/* loaded from: classes4.dex */
public final class MediaSessionManager {
    static final boolean DEBUG = Log.isLoggable("MediaSessionManager", 3);
    private static final Object sLock = new Object();

    interface MediaSessionManagerImpl {
    }

    interface RemoteUserInfoImpl {
    }

    public static final class RemoteUserInfo {
        RemoteUserInfoImpl mImpl;

        public RemoteUserInfo(String str, int i, int i2) {
            if (str == null) {
                throw new NullPointerException("package shouldn't be null");
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            if (Build.VERSION.SDK_INT >= 28) {
                this.mImpl = new MediaSessionManagerImplApi28.RemoteUserInfoImplApi28(str, i, i2);
            } else {
                this.mImpl = new MediaSessionManagerImplBase.RemoteUserInfoImplBase(str, i, i2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RemoteUserInfo) {
                return this.mImpl.equals(((RemoteUserInfo) obj).mImpl);
            }
            return false;
        }

        public int hashCode() {
            return this.mImpl.hashCode();
        }
    }
}
