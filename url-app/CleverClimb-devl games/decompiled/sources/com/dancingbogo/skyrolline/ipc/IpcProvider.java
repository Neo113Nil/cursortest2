package com.dancingbogo.skyrolline.ipc;

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

/* loaded from: classes2.dex */
public class IpcProvider extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    private static Uri f4579a = Uri.parse("content://com.dancingbogo.skyrolline.ipc_provider");

    /* renamed from: b, reason: collision with root package name */
    private static int f4580b = f4579a.toString().length() + 1;

    /* renamed from: c, reason: collision with root package name */
    private static Object f4581c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static boolean f4582d = false;
    private static ContentProviderClient e = null;

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

    public static void a() {
        synchronized (f4581c) {
            if (f4582d) {
                return;
            }
            f4582d = true;
            if ((Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT <= 18) || (Build.VERSION.SDK_INT >= 9 && Build.VERSION.SDK_INT <= 10)) {
                e = b().acquireContentProviderClient(f4579a);
            }
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        com.dancingbogo.skyrolline.util.b.b("IpcProvider", "onCreate");
        com.dancingbogo.skyrolline.c.a.a(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        com.dancingbogo.skyrolline.c.a.d();
        String str = "";
        if (contentValues != null && (str = a(contentValues.getAsInteger(IWebIpcProviderInvoker.IPC_ID).intValue(), contentValues)) == null) {
            str = "";
        }
        return Uri.parse(uri.toString() + "/" + str);
    }

    private String a(int i, ContentValues contentValues) {
        b a2 = d.a(i);
        a2.a(getContext());
        return a2 != null ? a2.a(contentValues) : "";
    }

    public static String a(ContentValues contentValues, c cVar) {
        Uri uri;
        if (cVar == null) {
            return "";
        }
        if (contentValues == null) {
            contentValues = new ContentValues();
        }
        contentValues.put(IWebIpcProviderInvoker.IPC_ID, Integer.valueOf(cVar.a()));
        a();
        try {
            uri = b().insert(f4579a, contentValues);
        } catch (IllegalArgumentException | IllegalStateException unused) {
            uri = null;
        }
        if (uri == null) {
            return "";
        }
        String uri2 = uri.toString();
        return (TextUtils.isEmpty(uri2) || uri2.length() <= f4580b) ? "" : uri2.substring(f4580b);
    }
}
