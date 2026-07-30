package com.baidu.bbalbscesium;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    private static final String f3869c = "CuidBuddyInfoManager";

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f3870d = false;

    /* renamed from: e, reason: collision with root package name */
    private static final String f3871e = "com.baidu.intent.action.GALAXY";

    /* renamed from: f, reason: collision with root package name */
    private static final String f3872f = "galaxy_data";

    /* renamed from: g, reason: collision with root package name */
    private static final String f3873g = "galaxy_sf";

    /* renamed from: a, reason: collision with root package name */
    private com.baidu.bbalbscesium.k.d.d f3874a;

    /* renamed from: b, reason: collision with root package name */
    private List<c> f3875b;

    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            int i8 = cVar2.f3866b - cVar.f3866b;
            if (i8 == 0) {
                boolean z7 = cVar.f3868d;
                if (z7 && cVar2.f3868d) {
                    return 0;
                }
                if (z7) {
                    return -1;
                }
                if (cVar2.f3868d) {
                    return 1;
                }
            }
            return i8;
        }
    }

    public d() {
        a();
    }

    private static String a(byte[] bArr) {
        StringBuilder sb;
        if (bArr == null) {
            throw new IllegalArgumentException("Argument b ( byte array ) is null! ");
        }
        String str = "";
        for (byte b8 : bArr) {
            String hexString = Integer.toHexString(b8 & 255);
            if (hexString.length() == 1) {
                sb = new StringBuilder();
                sb.append(str);
                str = "0";
            } else {
                sb = new StringBuilder();
            }
            sb.append(str);
            sb.append(hexString);
            str = sb.toString();
        }
        return str.toLowerCase();
    }

    List<c> b(Context context) {
        List<c> list = this.f3875b;
        if (list != null) {
            return list;
        }
        a(context);
        List<c> a8 = a(context, new Intent(f3871e), true);
        this.f3875b = a8;
        return a8;
    }

    List<c> a(Context context, Intent intent, boolean z7) {
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers != null) {
            for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && activityInfo.applicationInfo != null) {
                    try {
                        ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                        Bundle bundle = packageManager.getReceiverInfo(new ComponentName(activityInfo2.packageName, activityInfo2.name), 128).metaData;
                        if (bundle != null) {
                            String string = bundle.getString(f3872f);
                            if (!TextUtils.isEmpty(string)) {
                                byte[] a8 = com.baidu.bbalbscesium.m.b.a(string.getBytes("utf-8"));
                                JSONObject jSONObject = new JSONObject(new String(a8));
                                c cVar = new c();
                                cVar.f3866b = jSONObject.getInt("priority");
                                cVar.f3865a = resolveInfo.activityInfo.applicationInfo;
                                if (context.getPackageName().equals(resolveInfo.activityInfo.applicationInfo.packageName)) {
                                    cVar.f3868d = true;
                                }
                                if (z7) {
                                    String string2 = bundle.getString(f3873g);
                                    if (!TextUtils.isEmpty(string2)) {
                                        PackageInfo packageInfo = packageManager.getPackageInfo(resolveInfo.activityInfo.applicationInfo.packageName, 64);
                                        JSONArray jSONArray = jSONObject.getJSONArray("sigs");
                                        int length = jSONArray.length();
                                        String[] strArr = new String[length];
                                        for (int i8 = 0; i8 < length; i8++) {
                                            strArr[i8] = jSONArray.getString(i8);
                                        }
                                        if (a(strArr, a(packageInfo.signatures))) {
                                            byte[] a9 = a(com.baidu.bbalbscesium.m.b.a(string2.getBytes()), this.f3874a);
                                            byte[] a10 = com.baidu.bbalbscesium.m.d.a(a8);
                                            if (a9 != null && Arrays.equals(a9, a10)) {
                                                cVar.f3867c = true;
                                            }
                                        }
                                    }
                                }
                                arrayList.add(cVar);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        Collections.sort(arrayList, new a());
        return arrayList;
    }

    private void a() {
        this.f3874a = new com.baidu.bbalbscesium.k.d.e(e.a(), e.b());
    }

    public boolean a(Context context) {
        List<c> a8 = a(context, new Intent(f3871e).setPackage(context.getPackageName()), true);
        if (a8 == null || a8.size() == 0) {
            for (int i8 = 0; i8 < 3; i8++) {
                Log.w(f3869c, "galaxy lib host missing meta-data,make sure you know the right way to integrate galaxy");
            }
            return false;
        }
        boolean z7 = a8.get(0).f3867c;
        if (!z7) {
            for (int i9 = 0; i9 < 3; i9++) {
                Log.w(f3869c, "galaxy config err, In the release version of the signature should be matched");
            }
        }
        return z7;
    }

    private boolean a(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            hashSet.add(str);
        }
        HashSet hashSet2 = new HashSet();
        for (String str2 : strArr2) {
            hashSet2.add(str2);
        }
        return hashSet.equals(hashSet2);
    }

    private static byte[] a(byte[] bArr, com.baidu.bbalbscesium.k.d.d dVar) {
        com.baidu.bbalbscesium.k.d.a a8 = com.baidu.bbalbscesium.k.d.a.a();
        a8.a(2, dVar);
        return a8.a(bArr);
    }

    private String[] a(Signature[] signatureArr) {
        int length = signatureArr.length;
        String[] strArr = new String[length];
        for (int i8 = 0; i8 < length; i8++) {
            strArr[i8] = a(com.baidu.bbalbscesium.m.d.a(signatureArr[i8].toByteArray()));
        }
        return strArr;
    }
}
