package com.facebook.ads.internal.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class d {

    public interface a {
        c a();

        Collection<String> b();

        String c();
    }

    public static Collection<String> a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.optString(i));
        }
        return hashSet;
    }

    public static boolean a(Context context, a aVar, com.facebook.ads.internal.m.c cVar) {
        Collection<String> b2;
        boolean z;
        c a2 = aVar.a();
        if (a2 != null && a2 != c.NONE && (b2 = aVar.b()) != null && !b2.isEmpty()) {
            Iterator<String> it = b2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (a(context, it.next())) {
                    z = true;
                    break;
                }
            }
            if (z == (a2 == c.INSTALLED)) {
                String c2 = aVar.c();
                if (!TextUtils.isEmpty(c2)) {
                    cVar.b(c2, null);
                }
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            return false;
        }
    }
}
