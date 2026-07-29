package com.cmplay.base.util.webview.ipc;

import android.content.ContentProvider;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.cmplay.base.util.h;
import com.cmplay.base.util.webview.ui.WebViewActivity;
import com.cmplay.base.util.x;

/* loaded from: classes.dex */
public class WebIpcProvider extends ContentProvider {
    private static String IPC_PROVIDER_AUTH;
    private static int LENGTH_CONTENT_URI;
    private static Uri sContentUri;
    private static Object s_LockFixedBug = new Object();
    private static boolean s_bFixedSysBug = false;
    public static ContentProviderClient s_cpClientFixer = null;

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

    private static ContentResolver getCr() {
        return WebViewActivity.mContext.getContentResolver();
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        x.a(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        x.f();
        String str = "";
        if (contentValues != null && (str = ipcHandle(3, contentValues)) == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder(uri.toString());
        sb.append("/");
        sb.append(str);
        h.c("ly", "webipc provider insert = " + sb.toString());
        return Uri.parse(sb.toString());
    }

    private String ipcHandle(int i, ContentValues contentValues) {
        IIpcProviderHandler createHandler = IpcProviderHandlerFactory.createHandler(i);
        if (createHandler == null) {
            return "";
        }
        createHandler.setContext(getContext());
        return createHandler.handleRequest(contentValues);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String invoke(ContentValues contentValues, IWebIpcProviderInvoker iWebIpcProviderInvoker) {
        Uri uri;
        if (iWebIpcProviderInvoker == null) {
            return "";
        }
        if (contentValues == null) {
            contentValues = new ContentValues();
        }
        contentValues.put(IWebIpcProviderInvoker.IPC_ID, Integer.valueOf(iWebIpcProviderInvoker.getIPDId()));
        FixProviderSystemBug();
        try {
            uri = getCr().insert(sContentUri, contentValues);
        } catch (IllegalArgumentException unused) {
            uri = null;
            h.c("ly", "web ipc invoke = " + uri);
            if (uri == null) {
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
            uri = null;
            h.c("ly", "web ipc invoke = " + uri);
            if (uri == null) {
            }
        }
        h.c("ly", "web ipc invoke = " + uri);
        if (uri == null) {
            return "";
        }
        String uri2 = uri.toString();
        return (TextUtils.isEmpty(uri2) || uri2.length() <= LENGTH_CONTENT_URI) ? "" : uri2.substring(LENGTH_CONTENT_URI);
    }

    public static void FixProviderSystemBug() {
        synchronized (s_LockFixedBug) {
            IPC_PROVIDER_AUTH = WebViewActivity.mContext.getPackageName() + ".ipc.web";
            if (s_bFixedSysBug) {
                return;
            }
            s_bFixedSysBug = true;
            if (sContentUri == null) {
                sContentUri = Uri.parse("content://" + IPC_PROVIDER_AUTH);
                LENGTH_CONTENT_URI = sContentUri.toString().length() + 1;
            }
            if ((Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT <= 18) || (Build.VERSION.SDK_INT >= 9 && Build.VERSION.SDK_INT <= 10)) {
                s_cpClientFixer = getCr().acquireContentProviderClient(sContentUri);
                h.c("ly", "sContentUri = " + sContentUri + " s_cpClientFixer = " + s_cpClientFixer);
            }
        }
    }

    public static void release() {
        try {
            if (s_cpClientFixer != null) {
                s_cpClientFixer.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        s_cpClientFixer = null;
        sContentUri = null;
        s_bFixedSysBug = false;
    }
}
