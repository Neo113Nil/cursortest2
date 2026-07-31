package com.chartboost.sdk.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class r8 {
    public static final List a(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        IntRange until = RangesKt.until(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        Iterator it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((IntIterator) it).nextInt()));
        }
        return arrayList;
    }

    public static final List b(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        IntRange until = RangesKt.until(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator it = until.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((IntIterator) it).nextInt());
            if (obj == null) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final PackageInfo a(PackageManager packageManager, String packageName, int i) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.PackageInfoFlags.of(i);
            packageInfo = packageManager.getPackageInfo(packageName, of);
            Intrinsics.checkNotNull(packageInfo);
            return packageInfo;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(packageName, i);
        Intrinsics.checkNotNull(packageInfo2);
        return packageInfo2;
    }

    public static final String a(PackageManager packageManager, String packageName) {
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            String str = q8.getPackageInfoCompat(packageManager, packageName, 128).versionName;
            return str == null ? "" : str;
        } catch (Exception e) {
            xb.b("Exception raised getting package manager object", e);
            return "";
        }
    }

    public static final wh a(vh vhVar) {
        Intrinsics.checkNotNullParameter(vhVar, "<this>");
        return new wh(vhVar.a(), vhVar.b(), vhVar.c());
    }

    public static final pf a(j3 j3Var) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        return new pf(Integer.valueOf(j3Var.a()), Integer.valueOf(j3Var.c().b()), j3Var.b(), j3Var.f());
    }
}
