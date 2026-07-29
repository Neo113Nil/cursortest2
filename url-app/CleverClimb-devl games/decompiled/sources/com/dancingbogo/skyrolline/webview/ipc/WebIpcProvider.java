package com.dancingbogo.skyrolline.webview.ipc;

import android.content.ContentProvider;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.cmplay.base.util.webview.ipc.IWebIpcProviderInvoker;
import com.dancingbogo.skyrolline.GameApp;
import com.dancingbogo.skyrolline.ipc.d;
import com.dancingbogo.skyrolline.util.b;

/* loaded from: classes2.dex */
public class WebIpcProvider extends ContentProvider {

    /* renamed from: b, reason: collision with root package name */
    private static String f4628b;

    /* renamed from: c, reason: collision with root package name */
    private static Uri f4629c;

    /* renamed from: d, reason: collision with root package name */
    private static int f4630d;
    private static Object e = new Object();
    private static boolean f = false;

    /* renamed from: a, reason: collision with root package name */
    public static ContentProviderClient f4627a = null;

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
        return GameApp.f4485a.getContentResolver();
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        com.dancingbogo.skyrolline.c.a.a(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        com.dancingbogo.skyrolline.c.a.e();
        String str = "";
        if (contentValues != null && (str = a(3, contentValues)) == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder(uri.toString());
        sb.append("/");
        sb.append(str);
        b.b("ly", "webipc provider insert = " + sb.toString());
        return Uri.parse(sb.toString());
    }

    private String a(int i, ContentValues contentValues) {
        com.dancingbogo.skyrolline.ipc.b a2 = d.a(i);
        if (a2 == null) {
            return "";
        }
        a2.a(getContext());
        return a2.a(contentValues);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(ContentValues contentValues, a aVar) {
        Uri uri;
        if (aVar == null) {
            return "";
        }
        if (contentValues == null) {
            contentValues = new ContentValues();
        }
        contentValues.put(IWebIpcProviderInvoker.IPC_ID, Integer.valueOf(aVar.a()));
        a();
        try {
            uri = b().insert(f4629c, contentValues);
        } catch (IllegalArgumentException unused) {
            uri = null;
            b.b("ly", "web ipc invoke = " + uri);
            if (uri == null) {
            }
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            uri = null;
            b.b("ly", "web ipc invoke = " + uri);
            if (uri == null) {
            }
        }
        b.b("ly", "web ipc invoke = " + uri);
        if (uri == null) {
            return "";
        }
        String uri2 = uri.toString();
        return (TextUtils.isEmpty(uri2) || uri2.length() <= f4630d) ? "" : uri2.substring(f4630d);
    }

    public static void a() {
        synchronized (e) {
            f4628b = GameApp.f4485a.getPackageName() + ".ipc.web";
            if (f) {
                return;
            }
            f = true;
            if (f4629c == null) {
                f4629c = Uri.parse("content://" + f4628b);
                f4630d = f4629c.toString().length() + 1;
            }
            if ((Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT <= 18) || (Build.VERSION.SDK_INT >= 9 && Build.VERSION.SDK_INT <= 10)) {
                f4627a = b().acquireContentProviderClient(f4629c);
                b.b("ly", "sContentUri = " + f4629c + " s_cpClientFixer = " + f4627a);
            }
        }
    }
}
