package q0;

import L.Q;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import c0.AbstractActivityC0104f;
import d0.d;
import j0.C0177a;
import j0.InterfaceC0178b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import k0.InterfaceC0180a;
import k0.InterfaceC0181b;
import m0.C0201k;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0219a implements InterfaceC0178b, InterfaceC0180a {

    /* renamed from: e, reason: collision with root package name */
    public final PackageManager f2830e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0181b f2831f;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f2832g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f2833h = new HashMap();

    public C0219a(Q q2) {
        this.f2830e = (PackageManager) q2.f515f;
        q2.f516g = this;
    }

    public final void a(String str, String str2, boolean z2, C0201k c0201k) {
        if (this.f2831f == null) {
            c0201k.a("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap hashMap = this.f2832g;
        if (hashMap == null) {
            c0201k.a("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) hashMap.get(str);
        if (resolveInfo == null) {
            c0201k.a("error", "Text processing activity not found", null);
            return;
        }
        int hashCode = c0201k.hashCode();
        this.f2833h.put(Integer.valueOf(hashCode), c0201k);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z2);
        ((AbstractActivityC0104f) ((d) this.f2831f).f1811a).startActivityForResult(intent, hashCode);
    }

    public final HashMap b() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.f2832g;
        PackageManager packageManager = this.f2830e;
        if (hashMap == null) {
            this.f2832g = new HashMap();
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
                this.f2832g.put(str, resolveInfo);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f2832g.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f2832g.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    @Override // k0.InterfaceC0180a
    public final void onAttachedToActivity(InterfaceC0181b interfaceC0181b) {
        this.f2831f = interfaceC0181b;
        ((HashSet) ((d) interfaceC0181b).f1813c).add(this);
    }

    @Override // k0.InterfaceC0180a
    public final void onDetachedFromActivity() {
        ((HashSet) ((d) this.f2831f).f1813c).remove(this);
        this.f2831f = null;
    }

    @Override // k0.InterfaceC0180a
    public final void onDetachedFromActivityForConfigChanges() {
        ((HashSet) ((d) this.f2831f).f1813c).remove(this);
        this.f2831f = null;
    }

    @Override // k0.InterfaceC0180a
    public final void onReattachedToActivityForConfigChanges(InterfaceC0181b interfaceC0181b) {
        this.f2831f = interfaceC0181b;
        ((HashSet) ((d) interfaceC0181b).f1813c).add(this);
    }

    @Override // j0.InterfaceC0178b
    public final void onAttachedToEngine(C0177a c0177a) {
    }

    @Override // j0.InterfaceC0178b
    public final void onDetachedFromEngine(C0177a c0177a) {
    }
}
