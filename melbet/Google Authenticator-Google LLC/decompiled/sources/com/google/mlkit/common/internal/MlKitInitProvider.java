package com.google.mlkit.common.internal;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import defpackage.a;
import defpackage.ddl;
import defpackage.iah;
import defpackage.ial;
import defpackage.iks;
import defpackage.jee;
import defpackage.oy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MlKitInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        oy.aq(!providerInfo.authority.equals("com.google.mlkit.common.mlkitinitprovider"), "Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        List arrayList;
        HashMap hashMap;
        Context context = getContext();
        if (context != null) {
            Object obj = iks.a;
            synchronized (obj) {
                Executor executor = ddl.a;
                synchronized (obj) {
                    oy.aq(iks.b == null, "MlKitContext is already initialized");
                    iks.b = new iks();
                    iks iksVar = iks.b;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Bundle bundle = null;
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager == null) {
                            Log.w("ComponentDiscovery", "Context has no PackageManager.");
                        } else {
                            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) MlKitComponentDiscoveryService.class), 128);
                            if (serviceInfo == null) {
                                Log.w("ComponentDiscovery", MlKitComponentDiscoveryService.class.toString() + " has no service info.");
                            } else {
                                bundle = serviceInfo.metaData;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.w("ComponentDiscovery", "Application info not found.");
                    }
                    if (bundle == null) {
                        Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                        arrayList = Collections.EMPTY_LIST;
                    } else {
                        arrayList = new ArrayList();
                        for (String str : bundle.keySet()) {
                            if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                                arrayList.add(str.substring(31));
                            }
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new jee((String) it.next(), 1));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    arrayList3.addAll(arrayList2);
                    arrayList4.add(iah.b(context, Context.class, new Class[0]));
                    arrayList4.add(iah.b(iksVar, iks.class, new Class[0]));
                    iksVar.c = new ial(arrayList3, arrayList4);
                    ial ialVar = iksVar.c;
                    if (a.j(ialVar.b, true)) {
                        synchronized (ialVar) {
                            hashMap = new HashMap(ialVar.a);
                        }
                        ialVar.e(hashMap);
                    }
                }
            }
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
