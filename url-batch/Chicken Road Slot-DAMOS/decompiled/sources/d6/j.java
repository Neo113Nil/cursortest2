package d6;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3636a = t5.o.f("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z10) {
        String str = f3636a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            t5.o d10 = t5.o.d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z10 ? "enabled" : "disabled");
            d10.a(str, sb2.toString());
        } catch (Exception e2) {
            t5.o d11 = t5.o.d();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z10 ? "enabled" : "disabled");
            String sb4 = sb3.toString();
            if (d11.f9314a <= 3) {
                Log.d(str, sb4, e2);
            }
        }
    }
}
