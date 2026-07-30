package v0;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class D extends AbstractC0959c {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f8135d;

    public D() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f8135d = Pattern.compile("\\A\\d+");
    }

    @Override // v0.AbstractC0959c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // v0.AbstractC0959c
    public final boolean b() {
        int i2;
        PackageInfo packageInfo;
        boolean b7 = super.b();
        if (!b7 || (i2 = Build.VERSION.SDK_INT) >= 29) {
            return b7;
        }
        Uri uri = u0.y.f8069a;
        if (i2 >= 26) {
            packageInfo = AbstractC0964h.a();
        } else {
            try {
                packageInfo = u0.y.c();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfo = null;
            }
        }
        if (packageInfo != null) {
            Matcher matcher = this.f8135d.matcher(packageInfo.versionName);
            if (matcher.find() && Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) >= 105) {
                return true;
            }
        }
        return false;
    }
}
