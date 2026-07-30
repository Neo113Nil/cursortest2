package com.moyoung.dafit.module.common.utils;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.annotation.ArrayRes;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

/* loaded from: classes4.dex */
public class r {
    public static final Uri IMAGE_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    public static final String CAMERA_PATH = Environment.getExternalStorageDirectory().getPath() + "/DCIM/Camera/";

    private static String getImageName() {
        return "IMG_" + m.format(new Date(), "yyyy-MM-dd kk.mm.ss") + ".jpg";
    }

    public static int[] getXmlResourcesId(Context context, @ArrayRes int i8) {
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(i8);
        int length = obtainTypedArray.length();
        int[] iArr = new int[length];
        for (int i9 = 0; i9 < length; i9++) {
            iArr[i9] = obtainTypedArray.getResourceId(i9, 0);
        }
        obtainTypedArray.recycle();
        return iArr;
    }

    public static Uri save2Gallery(Context context, Bitmap bitmap) {
        return 29 <= Build.VERSION.SDK_INT ? saveImageToGalleryOf29(context, bitmap) : saveImageToGalleryOf28(context.getContentResolver(), bitmap);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0044: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:52:0x0044 */
    private static Uri saveImageToGalleryOf28(ContentResolver contentResolver, Bitmap bitmap, String str) {
        OutputStream outputStream;
        File file;
        FileOutputStream fileOutputStream;
        StringBuilder sb = new StringBuilder();
        String str2 = CAMERA_PATH;
        sb.append(str2);
        sb.append(str);
        String sb2 = sb.toString();
        OutputStream outputStream2 = null;
        FileOutputStream fileOutputStream2 = null;
        r2 = null;
        r2 = null;
        String str3 = null;
        try {
            try {
                try {
                    File file2 = new File(str2);
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    file = new File(sb2);
                    try {
                        if (file.createNewFile()) {
                            fileOutputStream = new FileOutputStream(file);
                            if (bitmap != null) {
                                try {
                                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                } catch (IOException e8) {
                                    e = e8;
                                    e.printStackTrace();
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (Throwable th) {
                                            th.printStackTrace();
                                        }
                                    }
                                    ContentValues contentValues = new ContentValues(7);
                                    contentValues.put("title", str);
                                    contentValues.put("_display_name", str);
                                    contentValues.put("mime_type", MimeTypes.IMAGE_JPEG);
                                    contentValues.put("_data", str3);
                                    contentResolver.insert(IMAGE_URI, contentValues);
                                    return Uri.fromFile(file);
                                }
                            } else {
                                sb2 = null;
                            }
                            fileOutputStream2 = fileOutputStream;
                        }
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                            }
                        }
                        str3 = sb2;
                    } catch (IOException e9) {
                        e = e9;
                        fileOutputStream = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                        } catch (Throwable th4) {
                            th4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e10) {
                e = e10;
                file = null;
                fileOutputStream = null;
            }
            ContentValues contentValues2 = new ContentValues(7);
            contentValues2.put("title", str);
            contentValues2.put("_display_name", str);
            contentValues2.put("mime_type", MimeTypes.IMAGE_JPEG);
            contentValues2.put("_data", str3);
            contentResolver.insert(IMAGE_URI, contentValues2);
            return Uri.fromFile(file);
        } catch (Throwable th5) {
            th = th5;
            outputStream2 = outputStream;
        }
    }

    private static Uri saveImageToGalleryOf29(Context context, Bitmap bitmap) {
        return saveImageToGalleryOf29(context, bitmap, getImageName());
    }

    public static Uri save2Gallery(Context context, Bitmap bitmap, String str) {
        if (29 <= Build.VERSION.SDK_INT) {
            return saveImageToGalleryOf29(context, bitmap, str);
        }
        return saveImageToGalleryOf28(context.getContentResolver(), bitmap, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Uri saveImageToGalleryOf29(Context context, Bitmap bitmap, String str) {
        OutputStream outputStream;
        OutputStream openOutputStream;
        ContentValues contentValues = new ContentValues();
        contentValues.put("description", "");
        contentValues.put("description", "");
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", MimeTypes.IMAGE_JPEG);
        contentValues.put("title", str);
        contentValues.put("relative_path", "Pictures");
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        ContentResolver contentResolver = context.getContentResolver();
        Uri insert = contentResolver.insert(uri, contentValues);
        com.orhanobut.logger.f.d("insertUri: " + insert);
        OutputStream outputStream2 = null;
        if (insert != null) {
            try {
                openOutputStream = contentResolver.openOutputStream(insert);
            } catch (IOException e8) {
                e = e8;
                outputStream = null;
                try {
                    com.orhanobut.logger.f.d("fail: " + e.getCause());
                    if (outputStream != null) {
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    outputStream2 = outputStream;
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                        } catch (IOException e9) {
                            com.orhanobut.logger.f.d("fail in close: " + e9.getCause());
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (outputStream2 != null) {
                }
                throw th;
            }
        } else {
            openOutputStream = null;
        }
        if (openOutputStream != null) {
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, openOutputStream);
            } catch (IOException e10) {
                outputStream = openOutputStream;
                e = e10;
                com.orhanobut.logger.f.d("fail: " + e.getCause());
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e11) {
                        com.orhanobut.logger.f.d("fail in close: " + e11.getCause());
                    }
                }
                return null;
            } catch (Throwable th3) {
                outputStream2 = openOutputStream;
                th = th3;
                if (outputStream2 != null) {
                }
                throw th;
            }
        }
        if (openOutputStream == null) {
            return insert;
        }
        try {
            openOutputStream.close();
            return insert;
        } catch (IOException e12) {
            com.orhanobut.logger.f.d("fail in close: " + e12.getCause());
            return insert;
        }
    }

    private static Uri saveImageToGalleryOf28(ContentResolver contentResolver, Bitmap bitmap) {
        return saveImageToGalleryOf28(contentResolver, bitmap, getImageName());
    }
}
