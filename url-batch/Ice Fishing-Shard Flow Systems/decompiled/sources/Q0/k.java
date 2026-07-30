package Q0;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2308a = G0.s.f("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z7) {
        String str = f2308a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z7 ? 1 : 2, 1);
            G0.s d7 = G0.s.d();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z7 ? "enabled" : "disabled");
            d7.a(str, sb.toString());
        } catch (Exception e7) {
            G0.s d8 = G0.s.d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z7 ? "enabled" : "disabled");
            String sb3 = sb2.toString();
            if (d8.f824a <= 3) {
                Log.d(str, sb3, e7);
            }
        }
    }
}
