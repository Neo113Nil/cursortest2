package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b.C0518b;
import b.InterfaceC0520d;
import f4.p;
import java.util.ArrayList;

/* renamed from: p.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4846f {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0520d f39754a;

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f39755b;

    public AbstractC4846f(InterfaceC0520d interfaceC0520d, ComponentName componentName) {
        this.f39754a = interfaceC0520d;
        this.f39755b = componentName;
    }

    public static boolean a(Context context, String str, AbstractServiceConnectionC4851k abstractServiceConnectionC4851k) {
        abstractServiceConnectionC4851k.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, abstractServiceConnectionC4851k, 33);
    }

    public static String b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList<String> arrayList = new ArrayList();
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveActivity != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public final p c(AbstractC4841a abstractC4841a) {
        BinderC4845e binderC4845e = new BinderC4845e(abstractC4841a);
        InterfaceC0520d interfaceC0520d = this.f39754a;
        try {
            if (((C0518b) interfaceC0520d).u0(binderC4845e)) {
                return new p(interfaceC0520d, binderC4845e, this.f39755b);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }
}
