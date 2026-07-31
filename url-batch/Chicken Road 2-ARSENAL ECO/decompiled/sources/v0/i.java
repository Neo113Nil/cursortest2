package v0;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6068a = l0.q.f("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z5) {
        String str = f6068a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z5 ? 1 : 2, 1);
            l0.q d7 = l0.q.d();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z5 ? "enabled" : "disabled");
            d7.a(str, sb.toString());
        } catch (Exception e4) {
            l0.q d8 = l0.q.d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z5 ? "enabled" : "disabled");
            String sb3 = sb2.toString();
            if (d8.f5283a <= 3) {
                Log.d(str, sb3, e4);
            }
        }
    }
}
