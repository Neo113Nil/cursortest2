package com.blankj.utilcode.util;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.FileProvider;
import cn.hutool.core.util.g1;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class y0 {
    private y0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static File copyUri2Cache(Uri uri) {
        Throwable th;
        InputStream inputStream;
        Log.d("UriUtils", "copyUri2Cache() called");
        try {
            try {
                inputStream = z0.getApp().getContentResolver().openInputStream(uri);
                try {
                    File file = new File(z0.getApp().getCacheDir(), "" + System.currentTimeMillis());
                    c1.writeFileFromIS(file.getAbsolutePath(), inputStream);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                    }
                    return file;
                } catch (FileNotFoundException e9) {
                    e = e9;
                    e.printStackTrace();
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                if (uri != 0) {
                    try {
                        uri.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e12) {
            e = e12;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            uri = 0;
            if (uri != 0) {
            }
            throw th;
        }
    }

    public static Uri file2Uri(File file) {
        if (!c1.isFileExists(file)) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 24) {
            return Uri.fromFile(file);
        }
        return FileProvider.getUriForFile(z0.getApp(), z0.getApp().getPackageName() + ".utilcode.fileprovider", file);
    }

    private static File getFileFromUri(Uri uri, String str) {
        return getFileFromUri(uri, null, null, str);
    }

    public static Uri res2Uri(String str) {
        return Uri.parse("android.resource://" + z0.getApp().getPackageName() + "/" + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] uri2Bytes(Uri uri) {
        Throwable th;
        InputStream inputStream;
        if (uri == null) {
            return null;
        }
        try {
            inputStream = z0.getApp().getContentResolver().openInputStream(uri);
            try {
                try {
                    byte[] inputStream2Bytes = c1.inputStream2Bytes(inputStream);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                    }
                    return inputStream2Bytes;
                } catch (FileNotFoundException e9) {
                    e = e9;
                    e.printStackTrace();
                    Log.d("UriUtils", "uri to bytes failed.");
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e12) {
            e = e12;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            if (inputStream != null) {
            }
            throw th;
        }
    }

    public static File uri2File(Uri uri) {
        if (uri == null) {
            return null;
        }
        File uri2FileReal = uri2FileReal(uri);
        return uri2FileReal != null ? uri2FileReal : copyUri2Cache(uri);
    }

    private static File uri2FileReal(Uri uri) {
        Uri uri2;
        File fileFromUri;
        String str;
        File file;
        Log.d("UriUtils", uri.toString());
        String authority = uri.getAuthority();
        String scheme = uri.getScheme();
        String path = uri.getPath();
        if (Build.VERSION.SDK_INT >= 24 && path != null) {
            String[] strArr = {"/external/", "/external_path/"};
            for (int i8 = 0; i8 < 2; i8++) {
                String str2 = strArr[i8];
                if (path.startsWith(str2)) {
                    File file2 = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + path.replace(str2, "/"));
                    if (file2.exists()) {
                        Log.d("UriUtils", uri.toString() + " -> " + str2);
                        return file2;
                    }
                }
            }
            if (path.startsWith("/files_path/")) {
                file = new File(z0.getApp().getFilesDir().getAbsolutePath() + path.replace("/files_path/", "/"));
            } else if (path.startsWith("/cache_path/")) {
                file = new File(z0.getApp().getCacheDir().getAbsolutePath() + path.replace("/cache_path/", "/"));
            } else if (path.startsWith("/external_files_path/")) {
                file = new File(z0.getApp().getExternalFilesDir(null).getAbsolutePath() + path.replace("/external_files_path/", "/"));
            } else if (path.startsWith("/external_cache_path/")) {
                file = new File(z0.getApp().getExternalCacheDir().getAbsolutePath() + path.replace("/external_cache_path/", "/"));
            } else {
                file = null;
            }
            if (file != null && file.exists()) {
                Log.d("UriUtils", uri.toString() + " -> " + path);
                return file;
            }
        }
        if (g1.URL_PROTOCOL_FILE.equals(scheme)) {
            if (path != null) {
                return new File(path);
            }
            Log.d("UriUtils", uri.toString() + " parse failed. -> 0");
            return null;
        }
        if (!DocumentsContract.isDocumentUri(z0.getApp(), uri)) {
            if (FirebaseAnalytics.Param.CONTENT.equals(scheme)) {
                return getFileFromUri(uri, "2");
            }
            Log.d("UriUtils", uri.toString() + " parse failed. -> 3");
            return null;
        }
        if (!"com.android.externalstorage.documents".equals(authority)) {
            if (!"com.android.providers.downloads.documents".equals(authority)) {
                if (!"com.android.providers.media.documents".equals(authority)) {
                    if (FirebaseAnalytics.Param.CONTENT.equals(scheme)) {
                        return getFileFromUri(uri, "1_3");
                    }
                    Log.d("UriUtils", uri.toString() + " parse failed. -> 1_4");
                    return null;
                }
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                String str3 = split[0];
                if ("image".equals(str3)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str3)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else {
                    if (!"audio".equals(str3)) {
                        Log.d("UriUtils", uri.toString() + " parse failed. -> 1_2");
                        return null;
                    }
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return getFileFromUri(uri2, "_id=?", new String[]{split[1]}, "1_2");
            }
            String documentId = DocumentsContract.getDocumentId(uri);
            if (TextUtils.isEmpty(documentId)) {
                Log.d("UriUtils", uri.toString() + " parse failed(id is null). -> 1_1");
                return null;
            }
            if (documentId.startsWith("raw:")) {
                return new File(documentId.substring(4));
            }
            if (documentId.startsWith("msf:")) {
                documentId = documentId.split(":")[1];
            }
            try {
                long parseLong = Long.parseLong(documentId);
                String[] strArr2 = {"content://downloads/public_downloads", "content://downloads/all_downloads", "content://downloads/my_downloads"};
                for (int i9 = 0; i9 < 3; i9++) {
                    try {
                        fileFromUri = getFileFromUri(ContentUris.withAppendedId(Uri.parse(strArr2[i9]), parseLong), "1_1");
                    } catch (Exception unused) {
                    }
                    if (fileFromUri != null) {
                        return fileFromUri;
                    }
                }
                Log.d("UriUtils", uri.toString() + " parse failed. -> 1_1");
                return null;
            } catch (Exception unused2) {
                return null;
            }
        }
        String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
        String str4 = split2[0];
        if ("primary".equalsIgnoreCase(str4)) {
            return new File(Environment.getExternalStorageDirectory() + "/" + split2[1]);
        }
        StorageManager storageManager = (StorageManager) z0.getApp().getSystemService("storage");
        try {
            Class<?> cls = Class.forName("android.os.storage.StorageVolume");
            Method method = storageManager.getClass().getMethod("getVolumeList", new Class[0]);
            Method method2 = cls.getMethod("getUuid", new Class[0]);
            Method method3 = cls.getMethod("getState", new Class[0]);
            Method method4 = cls.getMethod("getPath", new Class[0]);
            Method method5 = cls.getMethod("isPrimary", new Class[0]);
            Method method6 = cls.getMethod("isEmulated", new Class[0]);
            Object invoke = method.invoke(storageManager, new Object[0]);
            int length = Array.getLength(invoke);
            int i10 = 0;
            while (i10 < length) {
                Object obj = Array.get(invoke, i10);
                Object obj2 = invoke;
                if (!"mounted".equals(method3.invoke(obj, new Object[0])) && !"mounted_ro".equals(method3.invoke(obj, new Object[0]))) {
                    i10++;
                    invoke = obj2;
                }
                if ((!((Boolean) method5.invoke(obj, new Object[0])).booleanValue() || !((Boolean) method6.invoke(obj, new Object[0])).booleanValue()) && (str = (String) method2.invoke(obj, new Object[0])) != null && str.equals(str4)) {
                    return new File(method4.invoke(obj, new Object[0]) + "/" + split2[1]);
                }
                i10++;
                invoke = obj2;
            }
        } catch (Exception e8) {
            Log.d("UriUtils", uri.toString() + " parse failed. " + e8.toString() + " -> 1_0");
        }
        Log.d("UriUtils", uri.toString() + " parse failed. -> 1_0");
        return null;
    }

    private static File getFileFromUri(Uri uri, String str, String[] strArr, String str2) {
        if ("com.google.android.apps.photos.content".equals(uri.getAuthority())) {
            if (!TextUtils.isEmpty(uri.getLastPathSegment())) {
                return new File(uri.getLastPathSegment());
            }
        } else if ("com.tencent.mtt.fileprovider".equals(uri.getAuthority())) {
            String path = uri.getPath();
            if (!TextUtils.isEmpty(path)) {
                return new File(Environment.getExternalStorageDirectory(), path.substring(10, path.length()));
            }
        } else if ("com.huawei.hidisk.fileprovider".equals(uri.getAuthority())) {
            String path2 = uri.getPath();
            if (!TextUtils.isEmpty(path2)) {
                return new File(path2.replace("/root", ""));
            }
        }
        Cursor query = z0.getApp().getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
        try {
            if (query == null) {
                Log.d("UriUtils", uri.toString() + " parse failed(cursor is null). -> " + str2);
                return null;
            }
            if (!query.moveToFirst()) {
                Log.d("UriUtils", uri.toString() + " parse failed(moveToFirst return false). -> " + str2);
                return null;
            }
            int columnIndex = query.getColumnIndex("_data");
            if (columnIndex > -1) {
                return new File(query.getString(columnIndex));
            }
            Log.d("UriUtils", uri.toString() + " parse failed(columnIndex: " + columnIndex + " is wrong). -> " + str2);
            return null;
        } catch (Exception unused) {
            Log.d("UriUtils", uri.toString() + " parse failed. -> " + str2);
            return null;
        } finally {
            query.close();
        }
    }
}
