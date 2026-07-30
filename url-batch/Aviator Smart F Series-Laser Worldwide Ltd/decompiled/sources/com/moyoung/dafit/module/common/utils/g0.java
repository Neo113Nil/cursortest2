package com.moyoung.dafit.module.common.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class g0 {
    @Nullable
    public static String createAndGetAbsolutePath(Context context, Uri uri, String str) {
        File file = new File(str.replaceAll(cn.hutool.core.text.l.SPACE, ""));
        if (file.exists() && file.length() > 0) {
            return file.getAbsolutePath();
        }
        file.createNewFile();
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                if (openInputStream == null) {
                    fileOutputStream.close();
                    if (openInputStream == null) {
                        return null;
                    }
                    openInputStream.close();
                    return null;
                }
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read <= 0) {
                            String absolutePath = file.getAbsolutePath();
                            fileOutputStream.close();
                            openInputStream.close();
                            return absolutePath;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static List<File> getAllFiles(String str) {
        ArrayList arrayList = new ArrayList();
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            Log.d("getAllFiles", "指定的路径不是一个有效的目录");
            return arrayList;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            Log.d("getAllFiles", "无法读取目录内容");
            return arrayList;
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                Log.d("getAllFiles", "文件: " + file2.getName());
                arrayList.add(file2);
            } else if (file2.isDirectory()) {
                Log.d("getAllFiles", "目录: " + file2.getName());
            }
        }
        return arrayList;
    }

    public static File getDirFileByDieName(Context context, String str, String str2) {
        File file = new File(getRootDirFile(context, str), str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static String getDirPathByDirName(Context context, String str, String str2) {
        return getDirFileByDieName(context, str, str2).getPath();
    }

    public static String getDownloadFilePath(Context context, String str) {
        return getFilePath(context, Environment.DIRECTORY_DOWNLOADS, str);
    }

    public static String getDownloadsFileDir(Context context) {
        return getRootDirFile(context, Environment.DIRECTORY_DOWNLOADS).getPath();
    }

    public static String getFileDirFromPath(String str) {
        return str.substring(0, str.lastIndexOf("/"));
    }

    public static String getFileMD5(String str) {
        return getFileMD5(new File(str));
    }

    public static String getFileNameFromUri(Uri uri) {
        String path = uri.getPath();
        return path.substring(path.lastIndexOf("/") + 1);
    }

    public static String getFileNameFromUrl(String str) {
        return TextUtils.isEmpty(str) ? "" : str.substring(str.lastIndexOf("/") + 1);
    }

    public static String getFileNameSuffixlessFromPath(String str) {
        return getFileNameSuffixlessFromUrl(str);
    }

    public static String getFileNameSuffixlessFromUrl(String str) {
        return str.substring(str.lastIndexOf("/") + 1, str.lastIndexOf("."));
    }

    public static String getFilePath(Context context, String str, String str2) {
        return getRootDirFile(context, str).getAbsolutePath() + File.separator + str2;
    }

    public static String getFileSuffixFromPath(String str) {
        return str.substring(str.lastIndexOf("."));
    }

    public static String getMovieFilePath(Context context, String str) {
        return getFilePath(context, Environment.DIRECTORY_MOVIES, str);
    }

    public static Uri getMovieFileUri(Context context, String str) {
        return Uri.parse(getFilePath(context, Environment.DIRECTORY_MOVIES, str));
    }

    public static String getMusicFileDir(Context context) {
        return getRootDirFile(context, Environment.DIRECTORY_MUSIC).getPath();
    }

    public static String getMusicFilePath(Context context, String str) {
        return getFilePath(context, Environment.DIRECTORY_MUSIC, str);
    }

    public static Uri getMusicFileUri(Context context, String str) {
        return Uri.parse(getFilePath(context, Environment.DIRECTORY_MUSIC, str));
    }

    public static String getPicturesFileDir(Context context) {
        return getRootDirFile(context, Environment.DIRECTORY_PICTURES).getPath();
    }

    public static String getPicturesFilePath(Context context, String str) {
        return getFilePath(context, Environment.DIRECTORY_PICTURES, str);
    }

    public static File getRootDirFile(Context context, String str) {
        return Environment.DIRECTORY_MOVIES.equals(str) ? context.getExternalFilesDir(Environment.DIRECTORY_MOVIES) : Environment.DIRECTORY_MUSIC.equals(str) ? context.getExternalFilesDir(Environment.DIRECTORY_MUSIC) : Environment.DIRECTORY_DOWNLOADS.equals(str) ? context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS) : context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
    }

    public static boolean isFileExisted(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        String fileMD5 = getFileMD5(file);
        Log.d("isFileExisted", "isFileExisted==\n" + str2 + "\n" + fileMD5);
        return str2.equals(fileMD5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$queryAndCreateUriAbsolutePath$0(Context context, Uri uri, String str, ObservableEmitter observableEmitter) {
        String createAndGetAbsolutePath = createAndGetAbsolutePath(context, uri, str);
        if (x0.isEmpty(createAndGetAbsolutePath)) {
            observableEmitter.onError(new Throwable("filePath is empty"));
        } else {
            observableEmitter.onNext(createAndGetAbsolutePath);
            observableEmitter.onComplete();
        }
    }

    public static Observable<String> queryAndCreateUriAbsolutePath(final Context context, final Uri uri, final String str) {
        return Observable.create(new ObservableOnSubscribe() { // from class: com.moyoung.dafit.module.common.utils.f0
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                g0.lambda$queryAndCreateUriAbsolutePath$0(context, uri, str, observableEmitter);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getFileMD5(File file) {
        BigInteger bigInteger;
        String absolutePath = file.getAbsolutePath();
        try {
            byte[] bArr = new byte[8192];
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(new File(absolutePath));
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            fileInputStream.close();
            bigInteger = new BigInteger(1, messageDigest.digest());
        } catch (IOException e8) {
            e = e8;
            e.printStackTrace();
            bigInteger = null;
            if (bigInteger == null) {
            }
        } catch (NoSuchAlgorithmException e9) {
            e = e9;
            e.printStackTrace();
            bigInteger = null;
            if (bigInteger == null) {
            }
        }
        return bigInteger == null ? "" : bigInteger.toString(16);
    }
}
