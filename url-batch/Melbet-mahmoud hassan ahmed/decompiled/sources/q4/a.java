package q4;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.widget.Toast;
import e5.a;
import java.util.Iterator;
import m5.c;
import m5.j;
import m5.k;

/* loaded from: classes.dex */
public class a implements k.c, e5.a, f5.a {

    /* renamed from: f, reason: collision with root package name */
    Activity f20348f;

    private static a d(a aVar, c cVar, Activity activity) {
        k kVar = new k(cVar, "launch_review");
        aVar.f20348f = activity;
        kVar.e(aVar);
        return aVar;
    }

    @Override // m5.k.c
    public void C(j jVar, k.d dVar) {
        if (!jVar.f19247a.equals("launch")) {
            dVar.c();
            return;
        }
        String str = (String) jVar.a("android_id");
        if (str == null) {
            str = this.f20348f.getPackageName();
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str));
        boolean z6 = false;
        Iterator<ResolveInfo> it = this.f20348f.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ResolveInfo next = it.next();
            if (next.activityInfo.applicationInfo.packageName.equals("com.android.vending")) {
                ActivityInfo activityInfo = next.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent.addFlags(268435456);
                intent.addFlags(2097152);
                intent.addFlags(67108864);
                intent.setComponent(componentName);
                Toast.makeText(this.f20348f, "Please Rate Application", 0).show();
                this.f20348f.startActivity(intent);
                z6 = true;
                break;
            }
        }
        if (!z6) {
            try {
                this.f20348f.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
            } catch (ActivityNotFoundException unused) {
                this.f20348f.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str)));
            }
        }
        dVar.a(null);
    }

    @Override // f5.a
    public void a(f5.c cVar) {
    }

    @Override // f5.a
    public void b(f5.c cVar) {
        this.f20348f = cVar.d();
    }

    @Override // f5.a
    public void c() {
    }

    @Override // f5.a
    public void e() {
    }

    @Override // e5.a
    public void f(a.b bVar) {
        d(this, bVar.b(), null);
    }

    @Override // e5.a
    public void i(a.b bVar) {
    }
}
