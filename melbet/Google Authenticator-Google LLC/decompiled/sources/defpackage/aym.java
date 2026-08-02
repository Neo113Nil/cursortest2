package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aym {
    static {
        asq.b("PackageManagerHelper");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        defpackage.asq.a();
        r5.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, Class cls, boolean z) {
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z2 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z2 = true;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), true != z ? 2 : 1, 1);
            asq.a();
            cls.getName();
        } catch (Exception unused) {
            asq.a();
            cls.getName();
        }
    }
}
