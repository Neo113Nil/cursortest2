package v0;

import android.os.Build;
import java.util.HashSet;

/* renamed from: v0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0959c implements n {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f8187c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f8188a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8189b;

    public AbstractC0959c(String str, String str2) {
        this.f8188a = str;
        this.f8189b = str2;
        f8187c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = AbstractC0957a.f8185a;
        String str = this.f8189b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        return ("eng".equals(str2) || "userdebug".equals(str2)) && hashSet.contains(str.concat(":dev"));
    }
}
