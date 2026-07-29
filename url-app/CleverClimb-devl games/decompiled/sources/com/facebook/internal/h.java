package com.facebook.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookActivity;
import com.facebook.internal.ab;

/* compiled from: DialogPresenter.java */
/* loaded from: classes.dex */
public class h {

    /* compiled from: DialogPresenter.java */
    public interface a {
        Bundle a();

        Bundle b();
    }

    public static void a(com.facebook.internal.a aVar) {
        a(aVar, new com.facebook.j("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
    }

    public static void a(com.facebook.internal.a aVar, com.facebook.j jVar) {
        b(aVar, jVar);
    }

    public static void a(com.facebook.internal.a aVar, Activity activity) {
        activity.startActivityForResult(aVar.b(), aVar.d());
        aVar.e();
    }

    public static void a(com.facebook.internal.a aVar, m mVar) {
        mVar.a(aVar.b(), aVar.d());
        aVar.e();
    }

    public static boolean a(g gVar) {
        return c(gVar) != -1;
    }

    public static boolean b(g gVar) {
        return d(gVar) != null;
    }

    public static void b(com.facebook.internal.a aVar, com.facebook.j jVar) {
        if (jVar == null) {
            return;
        }
        ac.b(com.facebook.l.f());
        Intent intent = new Intent();
        intent.setClass(com.facebook.l.f(), FacebookActivity.class);
        intent.setAction(FacebookActivity.f4688a);
        w.a(intent, aVar.c().toString(), (String) null, w.a(), w.a(jVar));
        aVar.a(intent);
    }

    public static void a(com.facebook.internal.a aVar, String str, Bundle bundle) {
        ac.b(com.facebook.l.f());
        ac.a(com.facebook.l.f());
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        w.a(intent, aVar.c().toString(), str, w.a(), bundle2);
        intent.setClass(com.facebook.l.f(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        aVar.a(intent);
    }

    public static void a(com.facebook.internal.a aVar, Bundle bundle, g gVar) {
        Uri a2;
        ac.b(com.facebook.l.f());
        ac.a(com.facebook.l.f());
        String name = gVar.name();
        Uri d2 = d(gVar);
        if (d2 == null) {
            throw new com.facebook.j("Unable to fetch the Url for the DialogFeature : '" + name + "'");
        }
        Bundle a3 = z.a(aVar.c().toString(), w.a(), bundle);
        if (a3 == null) {
            throw new com.facebook.j("Unable to fetch the app's key-hash");
        }
        if (d2.isRelative()) {
            a2 = ab.a(z.a(), d2.toString(), a3);
        } else {
            a2 = ab.a(d2.getAuthority(), d2.getPath(), a3);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("url", a2.toString());
        bundle2.putBoolean("is_fallback", true);
        Intent intent = new Intent();
        w.a(intent, aVar.c().toString(), gVar.a(), w.a(), bundle2);
        intent.setClass(com.facebook.l.f(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        aVar.a(intent);
    }

    public static void a(com.facebook.internal.a aVar, a aVar2, g gVar) {
        Bundle b2;
        Context f = com.facebook.l.f();
        String a2 = gVar.a();
        int c2 = c(gVar);
        if (c2 == -1) {
            throw new com.facebook.j("Cannot present this dialog. This likely means that the Facebook app is not installed.");
        }
        if (w.a(c2)) {
            b2 = aVar2.a();
        } else {
            b2 = aVar2.b();
        }
        if (b2 == null) {
            b2 = new Bundle();
        }
        Intent a3 = w.a(f, aVar.c().toString(), a2, c2, b2);
        if (a3 == null) {
            throw new com.facebook.j("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        aVar.a(a3);
    }

    private static Uri d(g gVar) {
        String name = gVar.name();
        ab.a a2 = ab.a(com.facebook.l.i(), gVar.a(), name);
        if (a2 != null) {
            return a2.c();
        }
        return null;
    }

    public static int c(g gVar) {
        String i = com.facebook.l.i();
        String a2 = gVar.a();
        return w.a(a2, a(i, a2, gVar));
    }

    private static int[] a(String str, String str2, g gVar) {
        ab.a a2 = ab.a(str, str2, gVar.name());
        if (a2 != null) {
            return a2.d();
        }
        return new int[]{gVar.b()};
    }
}
