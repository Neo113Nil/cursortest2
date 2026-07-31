package g0;

import B0.E;
import E0.m;
import E0.q;
import F.L;
import P0.h;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import c0.C0118b;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0131a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1928a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final String f1929b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1930c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1931d;

    /* renamed from: e, reason: collision with root package name */
    public final Collection f1932e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1933f;

    public C0131a(Boolean bool, Boolean bool2, Set set, Map map, String str) {
        this.f1930c = bool;
        this.f1931d = bool2;
        this.f1932e = set;
        this.f1933f = map;
        this.f1929b = str;
    }

    public E a(Context context) {
        List<ResolveInfo> queryIntentActivities;
        Set set;
        PackageManager.ResolveInfoFlags of;
        h.e(context, "context");
        Set set2 = (Set) this.f1932e;
        if (set2 != null) {
            return new E(set2);
        }
        Set set3 = c0.c.f1786a;
        Intent addCategory = new Intent("android.intent.action.VIEW", Uri.parse("http://")).addCategory("android.intent.category.BROWSABLE");
        h.d(addCategory, "Intent(ACTION_VIEW, Uri.…ntent.CATEGORY_BROWSABLE)");
        PackageManager packageManager = context.getPackageManager();
        h.d(packageManager, "pm");
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.ResolveInfoFlags.of(131072);
            queryIntentActivities = packageManager.queryIntentActivities(addCategory, of);
            h.d(queryIntentActivities, "{\n            pm.queryIn…)\n            )\n        }");
        } else {
            queryIntentActivities = packageManager.queryIntentActivities(addCategory, 131072);
            h.d(queryIntentActivities, "{\n            pm.queryIn…s(intent, flag)\n        }");
        }
        U0.b bVar = new U0.b(new U0.c(new U0.c(new m(2, new m(0, queryIntentActivities)), C0118b.f1785f), new L(2, packageManager)));
        if (bVar.hasNext()) {
            Object next = bVar.next();
            if (bVar.hasNext()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(next);
                while (bVar.hasNext()) {
                    linkedHashSet.add(bVar.next());
                }
                set = linkedHashSet;
            } else {
                set = Collections.singleton(next);
                h.d(set, "singleton(...)");
            }
        } else {
            set = q.f221e;
        }
        return new E(set);
    }

    public String toString() {
        switch (this.f1928a) {
            case 1:
                List list = (List) this.f1932e;
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + this.f1929b + ", mProviderPackage: " + ((String) this.f1930c) + ", mQuery: " + ((String) this.f1931d) + ", mCertificates:");
                for (int i2 = 0; i2 < list.size(); i2++) {
                    sb.append(" [");
                    List list2 = (List) list.get(i2);
                    for (int i3 = 0; i3 < list2.size(); i3++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i3), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C0131a(String str, String str2, String str3, List list) {
        this.f1929b = str;
        this.f1930c = str2;
        this.f1931d = str3;
        list.getClass();
        this.f1932e = list;
        this.f1933f = str + "-" + str2 + "-" + str3;
    }
}
