package O0;

import android.content.Context;
import android.os.UserManager;

/* loaded from: classes.dex */
public class Z {

    /* renamed from: c, reason: collision with root package name */
    private static Z f1158c = new Z();

    /* renamed from: a, reason: collision with root package name */
    private boolean f1159a = false;

    /* renamed from: b, reason: collision with root package name */
    private Context f1160b = Y.q();

    private Z() {
    }

    public static Z b() {
        return f1158c;
    }

    public boolean a() {
        if (!this.f1159a) {
            Context context = this.f1160b;
            if (context == null) {
                return false;
            }
            UserManager userManager = (UserManager) context.getSystemService("user");
            if (userManager != null) {
                this.f1159a = userManager.isUserUnlocked();
            } else {
                this.f1159a = false;
            }
        }
        return this.f1159a;
    }
}
