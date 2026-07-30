package v0;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final HashSet f8205d = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f8206a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8207b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8208c;

    public x(int i2, String str, String str2) {
        this.f8208c = i2;
        this.f8206a = str;
        this.f8207b = str2;
        f8205d.add(this);
    }

    public final boolean a(Context context) {
        if (!b()) {
            PackageInfo b7 = u0.y.b(context);
            Bundle bundle = null;
            if (b7 != null) {
                ComponentName componentName = new ComponentName(b7.packageName, "org.chromium.android_webview.services.StartupFeatureMetadataHolder");
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        bundle = m.a(context.getPackageManager(), componentName, m.b(640L)).metaData;
                    } else {
                        bundle = context.getPackageManager().getServiceInfo(componentName, 640).metaData;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            if (!(bundle == null ? false : bundle.containsKey(this.f8207b))) {
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        switch (this.f8208c) {
            case 0:
                break;
            default:
                if (Build.VERSION.SDK_INT >= 28) {
                }
                break;
        }
        return false;
    }
}
