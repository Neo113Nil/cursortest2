package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class e7 {
    public static boolean a(int i3) {
        try {
            AnalyticsConfig h3 = MetaData.E().h();
            if (h3 != null) {
                if ((h3.c() & i3) == i3) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static ArrayList c(Context context, String str) {
        File cacheDir;
        String[] list;
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            cacheDir = context.getCacheDir();
            if (str != null) {
                cacheDir = new File(cacheDir, str);
            }
        } catch (Throwable th) {
            if (a(2)) {
                d9.a(th);
            }
        }
        if (!cacheDir.exists() || !cacheDir.isDirectory() || (list = cacheDir.list()) == null) {
            return null;
        }
        for (String str2 : list) {
            FileInputStream fileInputStream = new FileInputStream(new File(cacheDir, str2));
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object readObject = objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            arrayList.add(readObject);
        }
        return arrayList;
    }

    public static void d(Context context, String str, Serializable serializable) {
        try {
            ((Executor) com.startapp.sdk.components.a.a(context).f3445C.a()).execute(new A0.a(context, str, serializable, 4));
        } catch (Throwable th) {
            if (a(1)) {
                d9.a(th);
            }
        }
    }

    public static Object b(Context context, String str) {
        if (context != null) {
            try {
                File noBackupFilesDir = context.getNoBackupFilesDir();
                if (noBackupFilesDir.exists() && noBackupFilesDir.isDirectory()) {
                    File file = new File(noBackupFilesDir, str);
                    if (file.exists()) {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                        Object readObject = objectInputStream.readObject();
                        objectInputStream.close();
                        fileInputStream.close();
                        return readObject;
                    }
                }
                return null;
            } catch (Throwable th) {
                if (a(2)) {
                    d9.a(th);
                }
            }
        }
        return null;
    }

    public static void a(Context context, Serializable serializable) {
        try {
            ((Executor) com.startapp.sdk.components.a.a(context).f3445C.a()).execute(new A1.a(context, 9, serializable));
        } catch (Throwable th) {
            if (a(1)) {
                d9.a(th);
            }
        }
    }

    public static void a(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        a(new File(context.getNoBackupFilesDir(), str));
        a(new File(context.getCacheDir(), str));
    }

    public static Object a(Context context, String str, String str2) {
        if (context != null && str2 != null) {
            try {
                File cacheDir = context.getCacheDir();
                if (str != null) {
                    cacheDir = new File(cacheDir, str);
                }
                if (cacheDir.exists() && cacheDir.isDirectory()) {
                    File file = new File(cacheDir, str2);
                    if (file.exists()) {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                        Object readObject = objectInputStream.readObject();
                        objectInputStream.close();
                        fileInputStream.close();
                        return readObject;
                    }
                }
                return null;
            } catch (Throwable th) {
                if (a(2)) {
                    d9.a(th);
                }
            }
        }
        return null;
    }

    public static void c(Context context, String str, Serializable serializable) {
        if (context == null || str == null || serializable == null) {
            return;
        }
        try {
            File noBackupFilesDir = context.getNoBackupFilesDir();
            if (noBackupFilesDir.exists() || noBackupFilesDir.mkdirs()) {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(noBackupFilesDir, str));
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(serializable);
                objectOutputStream.close();
                fileOutputStream.close();
            }
        } catch (Throwable th) {
            if (a(4)) {
                d9.a(th);
            }
        }
    }

    public static void a(Context context, String str, String str2, Serializable serializable) {
        if (context == null || str2 == null || serializable == null) {
            return;
        }
        try {
            File cacheDir = context.getCacheDir();
            if (str != null) {
                cacheDir = new File(cacheDir, str);
            }
            if (cacheDir.exists() || cacheDir.mkdirs()) {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDir, str2));
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(serializable);
                objectOutputStream.close();
                fileOutputStream.close();
            }
        } catch (Throwable th) {
            if (a(4)) {
                d9.a(th);
            }
        }
    }

    public static void a(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                a(file2);
            }
        }
        file.delete();
    }
}
