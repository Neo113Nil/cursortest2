package Q;

import F.d;
import M.j;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class a implements K.a {

    /* renamed from: b, reason: collision with root package name */
    public final PackageManager f416b;

    /* renamed from: c, reason: collision with root package name */
    public d f417c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f418d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f419e = new HashMap();

    public a(A.a aVar) {
        this.f416b = (PackageManager) aVar.f3c;
        aVar.f4d = this;
    }

    public final void c(String str, String str2, boolean z, j jVar) {
        if (this.f417c == null) {
            jVar.a("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap hashMap = this.f418d;
        if (hashMap == null) {
            jVar.a("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) hashMap.get(str);
        if (resolveInfo == null) {
            jVar.a("error", "Text processing activity not found", null);
            return;
        }
        int hashCode = jVar.hashCode();
        this.f419e.put(Integer.valueOf(hashCode), jVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z);
        this.f417c.f246a.startActivityForResult(intent, hashCode);
    }

    public final HashMap d() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.f418d;
        PackageManager packageManager = this.f416b;
        if (hashMap == null) {
            this.f418d = new HashMap();
            int i2 = Build.VERSION.SDK_INT;
            Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
            if (i2 >= 33) {
                of = PackageManager.ResolveInfoFlags.of(0L);
                queryIntentActivities = packageManager.queryIntentActivities(type, of);
            } else {
                queryIntentActivities = packageManager.queryIntentActivities(type, 0);
            }
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                String str = resolveInfo.activityInfo.name;
                resolveInfo.loadLabel(packageManager).toString();
                this.f418d.put(str, resolveInfo);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f418d.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f418d.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    @Override // K.a
    public final void a(A.a aVar) {
    }

    @Override // K.a
    public final void b(A.a aVar) {
    }
}
