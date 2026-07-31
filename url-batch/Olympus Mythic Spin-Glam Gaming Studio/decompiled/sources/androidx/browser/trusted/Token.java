package androidx.browser.trusted;

import android.content.pm.PackageManager;

/* loaded from: classes3.dex */
public final class Token {
    private final TokenContents mContents;

    public boolean matches(String str, PackageManager packageManager) {
        return PackageIdentityUtils.packageMatchesToken(str, packageManager, this.mContents);
    }
}
