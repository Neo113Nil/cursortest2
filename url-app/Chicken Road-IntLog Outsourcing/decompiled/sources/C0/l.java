package C0;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f341a = s0.s.f("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z) {
        String str = f341a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            s0.s d6 = s0.s.d();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z ? "enabled" : "disabled");
            d6.a(str, sb.toString());
        } catch (Exception e3) {
            s0.s d7 = s0.s.d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z ? "enabled" : "disabled");
            String sb3 = sb2.toString();
            if (d7.f11793a <= 3) {
                Log.d(str, sb3, e3);
            }
        }
    }
}
