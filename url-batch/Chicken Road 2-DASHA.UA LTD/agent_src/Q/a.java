package Q;

import E.d;
import M.k;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class a implements K.a {

    /* renamed from: a, reason: collision with root package name */
    public final PackageManager f358a;

    /* renamed from: b, reason: collision with root package name */
    public d f359b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f360c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f361d = new HashMap();

    public a(B.a aVar) {
        this.f358a = (PackageManager) aVar.f3c;
        aVar.f4d = this;
    }

    public final void c(String str, String str2, boolean z2, k kVar) {
        if (this.f359b == null) {
            kVar.a("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap hashMap = this.f360c;
        if (hashMap == null) {
            kVar.a("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) hashMap.get(str);
        if (resolveInfo == null) {
            kVar.a("error", "Text processing activity not found", null);
            return;
        }
        int hashCode = kVar.hashCode();
        this.f361d.put(Integer.valueOf(hashCode), kVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z2);
        this.f359b.f171a.startActivityForResult(intent, hashCode);
    }

    public final HashMap d() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.f360c;
        PackageManager packageManager = this.f358a;
        if (hashMap == null) {
            this.f360c = new HashMap();
            Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
            if (Build.VERSION.SDK_INT >= 33) {
                of = PackageManager.ResolveInfoFlags.of(0L);
                queryIntentActivities = packageManager.queryIntentActivities(type, of);
            } else {
                queryIntentActivities = packageManager.queryIntentActivities(type, 0);
            }
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                String str = resolveInfo.activityInfo.name;
                resolveInfo.loadLabel(packageManager).toString();
                this.f360c.put(str, resolveInfo);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f360c.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f360c.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    @Override // K.a
    public final void a(B.a aVar) {
    }

    @Override // K.a
    public final void b(B.a aVar) {
    }
}
