package com.crrepa.band.my.health.ecg.share;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StrictMode;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import cn.hutool.core.util.g1;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.yanzhenjie.kalle.i;
import java.io.File;

/* loaded from: classes2.dex */
public class a {
    private static final String FILE_PROVIDER_AUTHORITY = "com.crrepa.band.dafit.fileProvider";
    private static final String TAG = "Share";

    private static Uri forceGetFileUri(File file) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                StrictMode.class.getDeclaredMethod("disableDeathOnFileUriExposure", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e8) {
                Log.e(TAG, Log.getStackTraceString(e8));
            }
        }
        return Uri.parse("file://" + file.getAbsolutePath());
    }

    private static Uri getAudioContentUri(Context context, File file) {
        String absolutePath = file.getAbsolutePath();
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        Cursor query = contentResolver.query(uri, new String[]{FileDownloadModel.ID}, "_data=? ", new String[]{absolutePath}, null);
        Uri uri2 = null;
        if (query != null) {
            if (query.moveToFirst()) {
                int i8 = query.getInt(query.getColumnIndex(FileDownloadModel.ID));
                uri2 = Uri.withAppendedPath(Uri.parse("content://media/external/audio/media"), "" + i8);
            }
            query.close();
        }
        if (uri2 != null) {
            return uri2;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_data", absolutePath);
        return context.getContentResolver().insert(uri, contentValues);
    }

    private static String getDataColumn(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndex("_data"));
                        query.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static Uri getFileContentUri(Context context, File file) {
        return FileProvider.getUriForFile(context, FILE_PROVIDER_AUTHORITY, file);
    }

    public static String getFileRealPath(Context context, Uri uri) {
        if (context == null) {
            Log.e(TAG, "getFileRealPath current activity is null.");
            return null;
        }
        if (uri == null) {
            Log.e(TAG, "getFileRealPath uri is null.");
            return null;
        }
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (isExternalStorageDocument(uri)) {
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(split[0])) {
                    return Environment.getExternalStorageDirectory() + "/" + split[1];
                }
            } else {
                if (isDownloadsDocument(uri)) {
                    return getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                }
                if (isMediaDocument(uri)) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str = split2[0];
                    return getDataColumn(context, "image".equals(str) ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : "video".equals(str) ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : "audio".equals(str) ? MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : MediaStore.Files.getContentUri("external"), "_id=?", new String[]{split2[1]});
                }
            }
        } else if (g1.URL_PROTOCOL_FILE.equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath();
        }
        return null;
    }

    public static Uri getFileUri(Context context, String str, File file) {
        Uri uri = null;
        if (context == null) {
            Log.e(TAG, "getFileUri current activity is null.");
            return null;
        }
        if (file == null || !file.exists()) {
            Log.e(TAG, "getFileUri file is null or not exists.");
            return null;
        }
        if (ContextCompat.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Log.e(TAG, "getFileUri miss WRITE_EXTERNAL_STORAGE permission.");
            return null;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            if (TextUtils.isEmpty(str)) {
                str = i.VALUE_ACCEPT_ALL;
            }
            str.hashCode();
            switch (str) {
                case "application/pdf":
                    uri = getFileContentUri(context, file);
                    break;
                case "audio/*":
                    uri = getAudioContentUri(context, file);
                    break;
                case "video/*":
                    uri = getVideoContentUri(context, file);
                    break;
                case "image/*":
                    uri = getImageContentUri(context, file);
                    break;
            }
        } else {
            uri = Uri.fromFile(file);
        }
        return uri == null ? forceGetFileUri(file) : uri;
    }

    private static Uri getImageContentUri(Context context, File file) {
        String absolutePath = file.getAbsolutePath();
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Cursor query = contentResolver.query(uri, new String[]{FileDownloadModel.ID}, "_data=? ", new String[]{absolutePath}, null);
        Uri uri2 = null;
        if (query != null) {
            if (query.moveToFirst()) {
                int i8 = query.getInt(query.getColumnIndex(FileDownloadModel.ID));
                uri2 = Uri.withAppendedPath(Uri.parse("content://media/external/images/media"), "" + i8);
            }
            query.close();
        }
        if (uri2 != null) {
            return uri2;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_data", absolutePath);
        return context.getContentResolver().insert(uri, contentValues);
    }

    private static Uri getVideoContentUri(Context context, File file) {
        String absolutePath = file.getAbsolutePath();
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        Cursor query = contentResolver.query(uri, new String[]{FileDownloadModel.ID}, "_data=? ", new String[]{absolutePath}, null);
        Uri uri2 = null;
        if (query != null) {
            if (query.moveToFirst()) {
                int i8 = query.getInt(query.getColumnIndex(FileDownloadModel.ID));
                uri2 = Uri.withAppendedPath(Uri.parse("content://media/external/video/media"), "" + i8);
            }
            query.close();
        }
        if (uri2 != null) {
            return uri2;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_data", absolutePath);
        return context.getContentResolver().insert(uri, contentValues);
    }

    private static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    private static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    private static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
