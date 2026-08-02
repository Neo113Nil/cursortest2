package t1;

import E.AbstractC0003d;
import a.AbstractC0124a;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import s1.AbstractC1410a;

/* loaded from: classes.dex */
public final class j extends C1438b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15400e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, String str2, int i4) {
        super(str, str2, 2);
        this.f15400e = i4;
    }

    @Override // t1.AbstractC1439c
    public final boolean b() {
        PackageInfo packageInfo;
        switch (this.f15400e) {
            case 0:
                if (!super.b()) {
                    return false;
                }
                WeakHashMap weakHashMap = AbstractC1410a.f15227a;
                if (Build.VERSION.SDK_INT >= 26) {
                    packageInfo = WebView.getCurrentWebViewPackage();
                } else {
                    try {
                        packageInfo = AbstractC1410a.a();
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        packageInfo = null;
                    }
                }
                if (packageInfo == null) {
                    return false;
                }
                return (Build.VERSION.SDK_INT >= 28 ? AbstractC0003d.b(packageInfo) : (long) packageInfo.versionCode) >= 636700000;
            case 1:
                if (!super.b() || !AbstractC0124a.G("MULTI_PROCESS")) {
                    return false;
                }
                WeakHashMap weakHashMap2 = AbstractC1410a.f15227a;
                if (k.f15402b.b()) {
                    return l.f15405a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (AbstractC0124a.G("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
