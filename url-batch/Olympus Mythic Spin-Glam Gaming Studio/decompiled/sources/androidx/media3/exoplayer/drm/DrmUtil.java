package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
/* loaded from: classes11.dex */
public final class DrmUtil {
    public static final int ERROR_SOURCE_EXO_MEDIA_DRM = 1;
    public static final int ERROR_SOURCE_LICENSE_ACQUISITION = 2;
    public static final int ERROR_SOURCE_PROVISIONING = 3;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorSource {
    }

    public static int getErrorCodeForMediaDrmException(Throwable th, int i) {
        int i2 = Util.SDK_INT;
        if (i2 >= 21 && Api21.isMediaDrmStateException(th)) {
            return Api21.mediaDrmStateExceptionToErrorCode(th);
        }
        if (i2 >= 23 && Api23.isMediaDrmResetException(th)) {
            return 6006;
        }
        if ((th instanceof NotProvisionedException) || isFailureToConstructNotProvisionedException(th)) {
            return 6002;
        }
        if (th instanceof DeniedByServerException) {
            return 6007;
        }
        if (th instanceof UnsupportedDrmException) {
            return 6001;
        }
        if (th instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
            return 6003;
        }
        if (th instanceof KeysExpiredException) {
            return 6008;
        }
        if (i == 1) {
            return 6006;
        }
        if (i == 2) {
            return 6004;
        }
        if (i == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    public static boolean isFailureToConstructNotProvisionedException(@Nullable Throwable th) {
        return Util.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean isFailureToConstructResourceBusyException(@Nullable Throwable th) {
        return Util.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    @RequiresApi
    private static final class Api21 {
        private Api21() {
        }

        @DoNotInline
        public static boolean isMediaDrmStateException(@Nullable Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        @DoNotInline
        public static int mediaDrmStateExceptionToErrorCode(Throwable th) {
            return Util.getErrorCodeForMediaDrmErrorCode(Util.getErrorCodeFromPlatformDiagnosticsInfo(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    @RequiresApi
    private static final class Api23 {
        private Api23() {
        }

        @DoNotInline
        public static boolean isMediaDrmResetException(@Nullable Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    private DrmUtil() {
    }
}
