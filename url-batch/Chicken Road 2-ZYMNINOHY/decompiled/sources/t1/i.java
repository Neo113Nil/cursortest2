package t1;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s1.AbstractC1410a;

/* loaded from: classes.dex */
public final class i extends AbstractC1439c {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f15399d;

    public i() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f15399d = Pattern.compile("\\A\\d+");
    }

    @Override // t1.AbstractC1439c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // t1.AbstractC1439c
    public final boolean b() {
        int i4;
        PackageInfo packageInfo;
        boolean b4 = super.b();
        if (!b4 || (i4 = Build.VERSION.SDK_INT) >= 29) {
            return b4;
        }
        WeakHashMap weakHashMap = AbstractC1410a.f15227a;
        if (i4 >= 26) {
            packageInfo = WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfo = AbstractC1410a.a();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfo = null;
            }
        }
        if (packageInfo != null) {
            Matcher matcher = this.f15399d.matcher(packageInfo.versionName);
            if (matcher.find() && Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) >= 105) {
                return true;
            }
        }
        return false;
    }
}
