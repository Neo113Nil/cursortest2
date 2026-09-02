package R3;

import D0.h;
import K3.b;
import N3.j;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import u0.C0689s;

/* loaded from: classes.dex */
public class a implements b, L3.a {

    /* renamed from: f, reason: collision with root package name */
    public final PackageManager f2080f;

    /* renamed from: g, reason: collision with root package name */
    public L3.b f2081g;

    /* renamed from: h, reason: collision with root package name */
    public HashMap f2082h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f2083i = new HashMap();

    public a(C0689s c0689s) {
        this.f2080f = (PackageManager) c0689s.f6034f;
        c0689s.f6035g = this;
    }

    public final void a(String str, String str2, boolean z5, j jVar) {
        if (this.f2081g == null) {
            jVar.a("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap hashMap = this.f2082h;
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
        this.f2083i.put(Integer.valueOf(hashCode), jVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z5);
        ((Activity) ((h) this.f2081g).f330b).startActivityForResult(intent, hashCode);
    }

    public final HashMap b() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.f2082h;
        PackageManager packageManager = this.f2080f;
        if (hashMap == null) {
            this.f2082h = new HashMap();
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
                this.f2082h.put(str, resolveInfo);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f2082h.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f2082h.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    @Override // L3.a
    public final void onAttachedToActivity(L3.b bVar) {
        this.f2081g = bVar;
        ((HashSet) ((h) bVar).f332d).add(this);
    }

    @Override // L3.a
    public final void onDetachedFromActivity() {
        ((HashSet) ((h) this.f2081g).f332d).remove(this);
        this.f2081g = null;
    }

    @Override // L3.a
    public final void onDetachedFromActivityForConfigChanges() {
        ((HashSet) ((h) this.f2081g).f332d).remove(this);
        this.f2081g = null;
    }

    @Override // L3.a
    public final void onReattachedToActivityForConfigChanges(L3.b bVar) {
        this.f2081g = bVar;
        ((HashSet) ((h) bVar).f332d).add(this);
    }

    @Override // K3.b
    public final void onAttachedToEngine(K3.a aVar) {
    }

    @Override // K3.b
    public final void onDetachedFromEngine(K3.a aVar) {
    }
}
