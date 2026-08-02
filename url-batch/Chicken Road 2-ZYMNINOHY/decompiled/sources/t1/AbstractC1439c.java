package t1;

import android.os.Build;
import java.util.HashSet;

/* renamed from: t1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1439c implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f15391c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f15392a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15393b;

    public AbstractC1439c(String str, String str2) {
        this.f15392a = str;
        this.f15393b = str2;
        f15391c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = AbstractC1437a.f15389a;
        String str = this.f15393b;
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
