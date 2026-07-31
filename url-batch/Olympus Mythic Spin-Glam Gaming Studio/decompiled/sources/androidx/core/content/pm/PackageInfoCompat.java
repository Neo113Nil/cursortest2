package androidx.core.content.pm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes15.dex */
public final class PackageInfoCompat {

    @RequiresApi
    private static class Api28Impl {
        @DoNotInline
        static boolean hasSigningCertificate(@NonNull PackageManager packageManager, @NonNull String str, @NonNull byte[] bArr, int i) {
            return packageManager.hasSigningCertificate(str, bArr, i);
        }

        @DoNotInline
        static boolean hasMultipleSigners(@NonNull SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        @Nullable
        @DoNotInline
        static Signature[] getApkContentsSigners(@NonNull SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        @Nullable
        @DoNotInline
        static Signature[] getSigningCertificateHistory(@NonNull SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        @DoNotInline
        static long getLongVersionCode(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }
    }
}
