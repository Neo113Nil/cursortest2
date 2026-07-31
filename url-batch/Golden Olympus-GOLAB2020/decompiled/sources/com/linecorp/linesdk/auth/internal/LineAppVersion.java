package com.linecorp.linesdk.auth.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.linecorp.linesdk.Constants;
import java.util.StringTokenizer;

/* loaded from: classes2.dex */
public class LineAppVersion {
    private final int major;
    private final int minor;
    private final int revision;

    public LineAppVersion(int i4, int i5, int i6) {
        this.major = i4;
        this.minor = i5;
        this.revision = i6;
    }

    public static LineAppVersion getLineAppVersion(@NonNull Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(Constants.LINE_APP_PACKAGE_NAME, UserVerificationMethods.USER_VERIFY_PATTERN).versionName;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            return new LineAppVersion(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
        } catch (PackageManager.NameNotFoundException | NullPointerException | NumberFormatException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineAppVersion lineAppVersion = (LineAppVersion) obj;
        return this.major == lineAppVersion.major && this.minor == lineAppVersion.minor && this.revision == lineAppVersion.revision;
    }

    public int getMajor() {
        return this.major;
    }

    public int getMinor() {
        return this.minor;
    }

    public int getRevision() {
        return this.revision;
    }

    public int hashCode() {
        return (((this.major * 31) + this.minor) * 31) + this.revision;
    }

    public boolean isEqualOrGreaterThan(LineAppVersion lineAppVersion) {
        if (lineAppVersion == null) {
            return false;
        }
        int i4 = this.major;
        int i5 = lineAppVersion.major;
        if (i4 != i5) {
            return i4 >= i5;
        }
        int i6 = this.minor;
        int i7 = lineAppVersion.minor;
        return i6 != i7 ? i6 >= i7 : this.revision >= lineAppVersion.revision;
    }
}
