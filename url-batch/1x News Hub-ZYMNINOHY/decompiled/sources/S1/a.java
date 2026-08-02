package S1;

import E1.AbstractActivityC0029e;
import F1.c;
import L1.b;
import O1.j;
import P1.n;
import P1.q;
import V0.e;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class a implements b, M1.a, q {

    /* renamed from: a, reason: collision with root package name */
    public final PackageManager f1337a;

    /* renamed from: b, reason: collision with root package name */
    public M1.b f1338b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f1339c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1340d = new HashMap();

    public a(e eVar) {
        this.f1337a = (PackageManager) eVar.f1599b;
        eVar.f1600c = this;
    }

    @Override // P1.q
    public final boolean a(int i3, int i4, Intent intent) {
        HashMap hashMap = this.f1340d;
        if (!hashMap.containsKey(Integer.valueOf(i3))) {
            return false;
        }
        ((n) hashMap.remove(Integer.valueOf(i3))).success(i4 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    public final void b(String str, String str2, boolean z, j jVar) {
        if (this.f1338b == null) {
            jVar.b("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap hashMap = this.f1339c;
        if (hashMap == null) {
            jVar.b("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) hashMap.get(str);
        if (resolveInfo == null) {
            jVar.b("error", "Text processing activity not found", null);
            return;
        }
        int hashCode = jVar.hashCode();
        this.f1340d.put(Integer.valueOf(hashCode), jVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z);
        ((AbstractActivityC0029e) ((c) this.f1338b).f486a).startActivityForResult(intent, hashCode);
    }

    public final HashMap c() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.f1339c;
        PackageManager packageManager = this.f1337a;
        if (hashMap == null) {
            this.f1339c = new HashMap();
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
                this.f1339c.put(str, resolveInfo);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f1339c.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f1339c.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    @Override // M1.a
    public final void onAttachedToActivity(M1.b bVar) {
        this.f1338b = bVar;
        ((HashSet) ((c) bVar).f488c).add(this);
    }

    @Override // M1.a
    public final void onDetachedFromActivity() {
        ((HashSet) ((c) this.f1338b).f488c).remove(this);
        this.f1338b = null;
    }

    @Override // M1.a
    public final void onDetachedFromActivityForConfigChanges() {
        ((HashSet) ((c) this.f1338b).f488c).remove(this);
        this.f1338b = null;
    }

    @Override // M1.a
    public final void onReattachedToActivityForConfigChanges(M1.b bVar) {
        this.f1338b = bVar;
        ((HashSet) ((c) bVar).f488c).add(this);
    }

    @Override // L1.b
    public final void onAttachedToEngine(L1.a aVar) {
    }

    @Override // L1.b
    public final void onDetachedFromEngine(L1.a aVar) {
    }
}
