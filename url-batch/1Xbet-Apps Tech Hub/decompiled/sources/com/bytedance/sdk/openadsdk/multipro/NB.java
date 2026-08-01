package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: TTProviderManager.java */
/* loaded from: classes2.dex */
public class NB implements pvs {
    private static WeakReference<Context> icD;
    private static volatile NB pvs;
    private static final List<pvs> vG;

    private boolean vG(Uri uri) {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public String pvs() {
        return "";
    }

    static {
        List<pvs> synchronizedList = Collections.synchronizedList(new ArrayList());
        vG = synchronizedList;
        synchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.Jd.vG());
        synchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.pvs.icD());
        synchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.vG.pvs());
        synchronizedList.add(new com.bytedance.sdk.openadsdk.icD.pvs.NB(new com.bytedance.sdk.component.sUS.pvs.icD.icD.icD()));
        Iterator<pvs> it = synchronizedList.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public static NB pvs(Context context) {
        if (context != null) {
            icD = new WeakReference<>(context.getApplicationContext());
        }
        if (pvs == null) {
            synchronized (NB.class) {
                if (pvs == null) {
                    pvs = new NB();
                }
            }
        }
        return pvs;
    }

    private NB() {
    }

    private pvs icD(Uri uri) {
        if (uri == null || !vG(uri)) {
            return null;
        }
        String[] split = uri.getPath().split("/");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (pvs pvsVar : vG) {
            if (str.equals(pvsVar.pvs())) {
                return pvsVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public Cursor pvs(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            pvs icD2 = icD(uri);
            if (icD2 != null) {
                return icD2.pvs(uri, strArr, str, strArr2, str2);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public String pvs(Uri uri) {
        try {
            pvs icD2 = icD(uri);
            if (icD2 != null) {
                return icD2.pvs(uri);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public Uri pvs(Uri uri, ContentValues contentValues) {
        try {
            pvs icD2 = icD(uri);
            if (icD2 != null) {
                return icD2.pvs(uri, contentValues);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public int pvs(Uri uri, String str, String[] strArr) {
        try {
            pvs icD2 = icD(uri);
            if (icD2 != null) {
                return icD2.pvs(uri, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public int pvs(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            pvs icD2 = icD(uri);
            if (icD2 != null) {
                return icD2.pvs(uri, contentValues, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
