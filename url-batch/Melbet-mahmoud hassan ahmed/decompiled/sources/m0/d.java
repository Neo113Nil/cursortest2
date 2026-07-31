package m0;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18840a = d0.j.f("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z6) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z6 ? 1 : 2, 1);
            d0.j c7 = d0.j.c();
            String str = f18840a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z6 ? "enabled" : "disabled";
            c7.a(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e7) {
            d0.j c8 = d0.j.c();
            String str2 = f18840a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z6 ? "enabled" : "disabled";
            c8.a(str2, String.format("%s could not be %s", objArr2), e7);
        }
    }
}
