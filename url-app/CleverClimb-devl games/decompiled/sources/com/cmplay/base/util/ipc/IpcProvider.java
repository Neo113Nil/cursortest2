package com.cmplay.base.util.ipc;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.text.TextUtils;
import com.cmplay.base.util.h;
import com.cmplay.base.util.x;
import com.cmplay.internalpush.ipc.IpcCloudHelper;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes.dex */
public class IpcProvider extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    private static Uri f4019a;

    /* renamed from: b, reason: collision with root package name */
    private static int f4020b;

    /* renamed from: d, reason: collision with root package name */
    private static ContentProviderClient f4022d;
    private static Context e;

    /* renamed from: c, reason: collision with root package name */
    private static Object f4021c = new Object();
    private static HashMap<String, Method> f = new HashMap<>();

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    private static ContentResolver b() {
        return x.f4063a.getContentResolver();
    }

    @SuppressLint({"NewApi"})
    public static void a() {
        synchronized (f4021c) {
            if (f4019a == null && x.f4063a != null) {
                f4019a = Uri.parse("content://" + (x.f4063a.getPackageName() + ".innerpush_provider"));
                f4020b = f4019a.toString().length() + 1;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                f4022d = b().acquireUnstableContentProviderClient(f4019a);
            } else {
                f4022d = b().acquireContentProviderClient(f4019a);
            }
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        e = getContext();
        x.a(e);
        h.a(IpcCloudHelper.TAG, "new provider 启动");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(ContentValues contentValues) {
        Uri uri;
        if (contentValues == null) {
            contentValues = new ContentValues();
        }
        a();
        try {
            uri = f4022d.insert(f4019a, contentValues);
        } catch (DeadObjectException e2) {
            e2.printStackTrace();
            uri = null;
            if (uri != null) {
            }
        } catch (RemoteException e3) {
            e3.printStackTrace();
            uri = null;
            if (uri != null) {
            }
        } catch (IllegalArgumentException e4) {
            e4.printStackTrace();
            uri = null;
            if (uri != null) {
            }
        } catch (IllegalStateException e5) {
            e5.printStackTrace();
            uri = null;
            if (uri != null) {
            }
        } catch (Exception e6) {
            e6.printStackTrace();
            uri = null;
            if (uri != null) {
            }
        }
        if (uri != null) {
            return "";
        }
        String uri2 = uri.toString();
        return (TextUtils.isEmpty(uri2) || uri2.length() <= f4020b) ? "" : uri2.substring(f4020b);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        x.e();
        String str = "";
        if (contentValues != null && (str = b(contentValues)) == null) {
            str = "";
        }
        return Uri.parse(uri.toString() + "/" + str);
    }

    public String b(ContentValues contentValues) {
        a aVar;
        Method method;
        String asString = contentValues.getAsString(a.CLASS_TAG);
        if (TextUtils.isEmpty(asString)) {
            return "";
        }
        if (f == null) {
            f = new HashMap<>();
        }
        try {
            if (!f.containsKey(asString)) {
                h.a("new_zzb", "className =" + asString);
                method = Class.forName(asString).getMethod(a.FORCE_STATIC_METHOD, new Class[0]);
                f.put(asString, method);
            } else {
                method = f.get(asString);
            }
            aVar = (a) method.invoke(null, new Object[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
            aVar = null;
        }
        return aVar == null ? "" : aVar.handler(contentValues);
    }
}
