package q0;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import f0.d;
import java.util.HashMap;
import java.util.List;
import m0.k;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final PackageManager f1085a;

    /* renamed from: b, reason: collision with root package name */
    public d f1086b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f1087c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1088d = new HashMap();

    public a(c0.a aVar) {
        this.f1085a = (PackageManager) aVar.f66c;
        aVar.f67d = this;
    }

    public final void a(String str, String str2, boolean z2, k kVar) {
        if (this.f1086b == null) {
            kVar.a("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap hashMap = this.f1087c;
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
        this.f1088d.put(Integer.valueOf(hashCode), kVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z2);
        this.f1086b.f289a.startActivityForResult(intent, hashCode);
    }

    public final HashMap b() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.f1087c;
        PackageManager packageManager = this.f1085a;
        if (hashMap == null) {
            this.f1087c = new HashMap();
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
                this.f1087c.put(str, resolveInfo);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f1087c.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f1087c.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }
}
