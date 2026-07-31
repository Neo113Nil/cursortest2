package w3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.RecentlyNonNull;
import q.e;
import v3.l;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    @RecentlyNonNull
    protected final Context f23016a;

    public b(@RecentlyNonNull Context context) {
        this.f23016a = context;
    }

    public int a(@RecentlyNonNull String str) {
        return this.f23016a.checkCallingOrSelfPermission(str);
    }

    public int b(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        return this.f23016a.getPackageManager().checkPermission(str, str2);
    }

    @RecentlyNonNull
    public ApplicationInfo c(@RecentlyNonNull String str, int i7) {
        return this.f23016a.getPackageManager().getApplicationInfo(str, i7);
    }

    @RecentlyNonNull
    public CharSequence d(@RecentlyNonNull String str) {
        return this.f23016a.getPackageManager().getApplicationLabel(this.f23016a.getPackageManager().getApplicationInfo(str, 0));
    }

    @RecentlyNonNull
    public e<CharSequence, Drawable> e(@RecentlyNonNull String str) {
        ApplicationInfo applicationInfo = this.f23016a.getPackageManager().getApplicationInfo(str, 0);
        return e.a(this.f23016a.getPackageManager().getApplicationLabel(applicationInfo), this.f23016a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @RecentlyNonNull
    public PackageInfo f(@RecentlyNonNull String str, int i7) {
        return this.f23016a.getPackageManager().getPackageInfo(str, i7);
    }

    public boolean g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.a(this.f23016a);
        }
        if (!l.j() || (nameForUid = this.f23016a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f23016a.getPackageManager().isInstantApp(nameForUid);
    }
}
