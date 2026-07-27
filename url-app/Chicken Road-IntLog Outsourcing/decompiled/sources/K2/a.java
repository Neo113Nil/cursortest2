package K2;

import B0.l;
import D2.b;
import G2.i;
import M0.e;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import w2.AbstractActivityC1515c;

/* loaded from: classes.dex */
public class a implements b, E2.a {

    /* renamed from: a, reason: collision with root package name */
    public final PackageManager f1408a;

    /* renamed from: b, reason: collision with root package name */
    public E2.b f1409b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f1410c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1411d = new HashMap();

    public a(l lVar) {
        this.f1408a = (PackageManager) lVar.f163b;
        lVar.f164c = this;
    }

    public final void a(String str, String str2, boolean z, i iVar) {
        if (this.f1409b == null) {
            iVar.b("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap hashMap = this.f1410c;
        if (hashMap == null) {
            iVar.b("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) hashMap.get(str);
        if (resolveInfo == null) {
            iVar.b("error", "Text processing activity not found", null);
            return;
        }
        int hashCode = iVar.hashCode();
        this.f1411d.put(Integer.valueOf(hashCode), iVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z);
        ((AbstractActivityC1515c) ((e) this.f1409b).f1788h).startActivityForResult(intent, hashCode);
    }

    public final HashMap b() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.f1410c;
        PackageManager packageManager = this.f1408a;
        if (hashMap == null) {
            this.f1410c = new HashMap();
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
                this.f1410c.put(str, resolveInfo);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f1410c.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f1410c.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    @Override // E2.a
    public final void onAttachedToActivity(E2.b bVar) {
        this.f1409b = bVar;
        ((HashSet) ((e) bVar).f1784d).add(this);
    }

    @Override // E2.a
    public final void onDetachedFromActivity() {
        ((HashSet) ((e) this.f1409b).f1784d).remove(this);
        this.f1409b = null;
    }

    @Override // E2.a
    public final void onDetachedFromActivityForConfigChanges() {
        ((HashSet) ((e) this.f1409b).f1784d).remove(this);
        this.f1409b = null;
    }

    @Override // E2.a
    public final void onReattachedToActivityForConfigChanges(E2.b bVar) {
        this.f1409b = bVar;
        ((HashSet) ((e) bVar).f1784d).add(this);
    }

    @Override // D2.b
    public final void onAttachedToEngine(D2.a aVar) {
    }

    @Override // D2.b
    public final void onDetachedFromEngine(D2.a aVar) {
    }
}
