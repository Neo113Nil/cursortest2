package b0;

import android.os.Build;
import java.util.HashSet;

/* renamed from: b0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0172c implements InterfaceC0173d {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f2523c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f2524a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2525b;

    public AbstractC0172c(String str, String str2) {
        this.f2524a = str;
        this.f2525b = str2;
        f2523c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = AbstractC0170a.f2521a;
        String str = this.f2525b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":dev");
        return hashSet.contains(sb.toString());
    }
}
