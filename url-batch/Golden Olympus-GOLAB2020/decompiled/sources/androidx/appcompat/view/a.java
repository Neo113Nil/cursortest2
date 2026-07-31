package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import e.AbstractC2406b;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f10229a;

    private a(Context context) {
        this.f10229a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f10229a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f10229a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f10229a.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i4 > 600) {
            return 5;
        }
        if (i4 > 960 && i5 > 720) {
            return 5;
        }
        if (i4 > 720 && i5 > 960) {
            return 5;
        }
        if (i4 >= 500) {
            return 4;
        }
        if (i4 > 640 && i5 > 480) {
            return 4;
        }
        if (i4 <= 480 || i5 <= 640) {
            return i4 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public boolean e() {
        return this.f10229a.getResources().getBoolean(AbstractC2406b.f36213a);
    }

    public boolean f() {
        return true;
    }
}
