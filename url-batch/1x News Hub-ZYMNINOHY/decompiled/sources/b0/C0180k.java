package b0;

import a0.AbstractC0131b;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: b0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180k extends AbstractC0172c {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f2533d;

    public C0180k() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f2533d = Pattern.compile("\\A\\d+");
    }

    @Override // b0.AbstractC0172c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // b0.AbstractC0172c
    public final boolean b() {
        int i3;
        PackageInfo packageInfo;
        boolean b3 = super.b();
        if (!b3 || (i3 = Build.VERSION.SDK_INT) >= 29) {
            return b3;
        }
        WeakHashMap weakHashMap = AbstractC0131b.f1921a;
        if (i3 >= 26) {
            packageInfo = WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfo = AbstractC0131b.a();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfo = null;
            }
        }
        if (packageInfo != null) {
            Matcher matcher = this.f2533d.matcher(packageInfo.versionName);
            if (matcher.find() && Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) >= 105) {
                return true;
            }
        }
        return false;
    }
}
