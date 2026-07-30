package T0;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3051a = J0.s.f("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z8) {
        String str = f3051a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z8 ? 1 : 2, 1);
            J0.s d2 = J0.s.d();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z8 ? "enabled" : "disabled");
            d2.a(str, sb.toString());
        } catch (Exception e6) {
            J0.s d3 = J0.s.d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z8 ? "enabled" : "disabled");
            String sb3 = sb2.toString();
            if (d3.f1330a <= 3) {
                Log.d(str, sb3, e6);
            }
        }
    }
}
