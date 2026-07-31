package y0;

import N.P;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import e0.C0125d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import r0.InterfaceC0225a;
import s0.InterfaceC0227a;
import u0.k;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0278a implements InterfaceC0225a, InterfaceC0227a {

    /* renamed from: e, reason: collision with root package name */
    public final PackageManager f3162e;

    /* renamed from: f, reason: collision with root package name */
    public C0125d f3163f;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f3164g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f3165h = new HashMap();

    public C0278a(P p2) {
        this.f3162e = (PackageManager) p2.f698f;
        p2.f699g = this;
    }

    @Override // s0.InterfaceC0227a
    public final void a() {
        ((HashSet) this.f3163f.f1859c).remove(this);
        this.f3163f = null;
    }

    @Override // s0.InterfaceC0227a
    public final void b(C0125d c0125d) {
        this.f3163f = c0125d;
        ((HashSet) c0125d.f1859c).add(this);
    }

    @Override // s0.InterfaceC0227a
    public final void d(C0125d c0125d) {
        this.f3163f = c0125d;
        ((HashSet) c0125d.f1859c).add(this);
    }

    @Override // s0.InterfaceC0227a
    public final void e() {
        ((HashSet) this.f3163f.f1859c).remove(this);
        this.f3163f = null;
    }

    public final void f(String str, String str2, boolean z2, k kVar) {
        if (this.f3163f == null) {
            kVar.a("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap hashMap = this.f3164g;
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
        this.f3165h.put(Integer.valueOf(hashCode), kVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z2);
        ((Activity) this.f3163f.f1863g).startActivityForResult(intent, hashCode);
    }

    public final HashMap g() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.f3164g;
        PackageManager packageManager = this.f3162e;
        if (hashMap == null) {
            this.f3164g = new HashMap();
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
                this.f3164g.put(str, resolveInfo);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f3164g.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f3164g.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    @Override // r0.InterfaceC0225a
    public final void c(P p2) {
    }

    @Override // r0.InterfaceC0225a
    public final void i(P p2) {
    }
}
