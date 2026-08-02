package V;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class j extends c {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f1104d;

    public j() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f1104d = Pattern.compile("\\A\\d+");
    }

    @Override // V.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // V.c
    public final boolean b() {
        int i2;
        PackageInfo packageInfo;
        boolean b2 = super.b();
        if (!b2 || (i2 = Build.VERSION.SDK_INT) >= 29) {
            return b2;
        }
        int i3 = U.a.f1086a;
        if (i2 >= 26) {
            packageInfo = WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfo = U.a.a();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfo = null;
            }
        }
        if (packageInfo == null) {
            return false;
        }
        Matcher matcher = this.f1104d.matcher(packageInfo.versionName);
        return matcher.find() && Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
