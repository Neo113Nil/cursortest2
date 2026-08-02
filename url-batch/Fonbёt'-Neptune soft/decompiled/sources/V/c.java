package V;

import android.os.Build;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class c implements e {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f1097c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f1098a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1099b;

    public c(String str, String str2) {
        this.f1098a = str;
        this.f1099b = str2;
        f1097c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f1095a;
        String str = this.f1099b;
        if (!hashSet.contains(str)) {
            String str2 = Build.TYPE;
            if ("eng".equals(str2) || "userdebug".equals(str2)) {
                if (hashSet.contains(str + ":dev")) {
                }
            }
            return false;
        }
        return true;
    }
}
