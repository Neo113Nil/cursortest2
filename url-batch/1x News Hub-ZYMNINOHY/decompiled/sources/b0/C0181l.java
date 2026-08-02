package b0;

import E.AbstractC0003d;
import a0.AbstractC0131b;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;

/* renamed from: b0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181l extends C0171b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2534e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0181l(String str, String str2, int i3) {
        super(str, str2, 2);
        this.f2534e = i3;
    }

    @Override // b0.AbstractC0172c
    public final boolean b() {
        PackageInfo packageInfo;
        switch (this.f2534e) {
            case 0:
                if (!super.b()) {
                    return false;
                }
                WeakHashMap weakHashMap = AbstractC0131b.f1921a;
                if (Build.VERSION.SDK_INT >= 26) {
                    packageInfo = WebView.getCurrentWebViewPackage();
                } else {
                    try {
                        packageInfo = AbstractC0131b.a();
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        packageInfo = null;
                    }
                }
                if (packageInfo == null) {
                    return false;
                }
                return (Build.VERSION.SDK_INT >= 28 ? AbstractC0003d.b(packageInfo) : (long) packageInfo.versionCode) >= 636700000;
            case 1:
                if (!super.b() || !C2.b.y("MULTI_PROCESS")) {
                    return false;
                }
                WeakHashMap weakHashMap2 = AbstractC0131b.f1921a;
                if (AbstractC0182m.f2536b.b()) {
                    return AbstractC0184o.f2541a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (C2.b.y("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
