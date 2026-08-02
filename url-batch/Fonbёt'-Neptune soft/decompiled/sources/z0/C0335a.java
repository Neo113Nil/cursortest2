package z0;

import I.C0079n;
import P.O;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import j.C0239o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import m0.AbstractActivityC0264d;
import s0.InterfaceC0304a;
import t0.InterfaceC0308a;
import v0.i;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0335a implements InterfaceC0304a, InterfaceC0308a {

    /* renamed from: e, reason: collision with root package name */
    public final PackageManager f3595e;

    /* renamed from: f, reason: collision with root package name */
    public C0239o f3596f;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f3597g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f3598h = new HashMap();

    public C0335a(O o2) {
        this.f3595e = (PackageManager) o2.f875f;
        o2.f876g = this;
    }

    @Override // t0.InterfaceC0308a
    public final void a(C0239o c0239o) {
        this.f3596f = c0239o;
        ((HashSet) c0239o.f3017c).add(this);
    }

    @Override // t0.InterfaceC0308a
    public final void b(C0239o c0239o) {
        this.f3596f = c0239o;
        ((HashSet) c0239o.f3017c).add(this);
    }

    @Override // t0.InterfaceC0308a
    public final void c() {
        ((HashSet) this.f3596f.f3017c).remove(this);
        this.f3596f = null;
    }

    @Override // t0.InterfaceC0308a
    public final void d() {
        ((HashSet) this.f3596f.f3017c).remove(this);
        this.f3596f = null;
    }

    public final void e(String str, String str2, boolean z2, i iVar) {
        if (this.f3596f == null) {
            iVar.a("error", "Plugin not bound to an Activity", null);
            return;
        }
        if (Build.VERSION.SDK_INT < 23) {
            iVar.a("error", "Android version not supported", null);
            return;
        }
        HashMap hashMap = this.f3597g;
        if (hashMap == null) {
            iVar.a("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) hashMap.get(str);
        if (resolveInfo == null) {
            iVar.a("error", "Text processing activity not found", null);
            return;
        }
        int hashCode = iVar.hashCode();
        this.f3598h.put(Integer.valueOf(hashCode), iVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z2);
        ((AbstractActivityC0264d) this.f3596f.f3015a).startActivityForResult(intent, hashCode);
    }

    public final HashMap f() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.f3597g;
        PackageManager packageManager = this.f3595e;
        if (hashMap == null) {
            this.f3597g = new HashMap();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
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
                    this.f3597g.put(str, resolveInfo);
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f3597g.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f3597g.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    @Override // s0.InterfaceC0304a
    public final void j(C0079n c0079n) {
    }

    @Override // s0.InterfaceC0304a
    public final void k(C0079n c0079n) {
    }
}
