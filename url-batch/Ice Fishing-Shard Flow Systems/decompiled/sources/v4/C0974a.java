package v4;

import D6.z;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import o4.c;
import p4.InterfaceC0828a;
import p4.b;
import r4.l;
import s4.p;
import s4.s;

/* renamed from: v4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0974a implements c, InterfaceC0828a, s {

    /* renamed from: d, reason: collision with root package name */
    public final PackageManager f8215d;

    /* renamed from: e, reason: collision with root package name */
    public b f8216e;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f8217i;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f8218l = new HashMap();

    public C0974a(P0.c cVar) {
        this.f8215d = (PackageManager) cVar.f2189e;
        cVar.f2190i = this;
    }

    public final void a(String str, String str2, boolean z7, l lVar) {
        if (this.f8216e == null) {
            lVar.error("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap hashMap = this.f8217i;
        if (hashMap == null) {
            lVar.error("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) hashMap.get(str);
        if (resolveInfo == null) {
            lVar.error("error", "Text processing activity not found", null);
            return;
        }
        int hashCode = lVar.hashCode();
        this.f8218l.put(Integer.valueOf(hashCode), lVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z7);
        ((Activity) ((z) this.f8216e).f640c).startActivityForResult(intent, hashCode);
    }

    public final HashMap b() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.f8217i;
        PackageManager packageManager = this.f8215d;
        if (hashMap == null) {
            this.f8217i = new HashMap();
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
                this.f8217i.put(str, resolveInfo);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f8217i.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f8217i.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    @Override // s4.s, com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.ActivityResultListener
    public final boolean onActivityResult(int i2, int i5, Intent intent) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.f8218l;
        if (!hashMap.containsKey(valueOf)) {
            return false;
        }
        ((p) hashMap.remove(Integer.valueOf(i2))).success(i5 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    @Override // p4.InterfaceC0828a
    public final void onAttachedToActivity(b bVar) {
        this.f8216e = bVar;
        ((HashSet) ((z) bVar).f641d).add(this);
    }

    @Override // p4.InterfaceC0828a
    public final void onDetachedFromActivity() {
        ((HashSet) ((z) this.f8216e).f641d).remove(this);
        this.f8216e = null;
    }

    @Override // p4.InterfaceC0828a
    public final void onDetachedFromActivityForConfigChanges() {
        ((HashSet) ((z) this.f8216e).f641d).remove(this);
        this.f8216e = null;
    }

    @Override // p4.InterfaceC0828a
    public final void onReattachedToActivityForConfigChanges(b bVar) {
        this.f8216e = bVar;
        ((HashSet) ((z) bVar).f641d).add(this);
    }

    @Override // o4.c
    public final void onAttachedToEngine(o4.b bVar) {
    }

    @Override // o4.c
    public final void onDetachedFromEngine(o4.b bVar) {
    }
}
