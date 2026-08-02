package defpackage;

import android.os.Build;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fhi implements fhj {
    private Long a;

    @Override // defpackage.fhj
    public final boolean a() {
        Long l = this.a;
        if (l == null) {
            try {
                Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                declaredMethod.setAccessible(true);
                l = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                l.longValue();
                this.a = l;
            } catch (Exception unused) {
                l = -1L;
                this.a = l;
            }
        }
        return l.longValue() >= 40100;
    }
}
