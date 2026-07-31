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

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class z6 {
    public static boolean a(int i) {
        try {
            AnalyticsConfig g = MetaData.A().g();
            if (g != null) {
                if ((g.c() & i) == i) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
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
                    n8.a(th);
                }
            }
        }
        return null;
    }

    public static void c(final Context context, final String str, final Serializable serializable) {
        try {
            ((Executor) com.startapp.sdk.components.a.a(context).C.a()).execute(new Runnable() { // from class: com.startapp.sdk.internal.z6$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    z6.b(context, str, serializable);
                }
            });
        } catch (Throwable th) {
            if (a(1)) {
                n8.a(th);
            }
        }
    }

    public static void a(Context context, String str) {
        if (context != null) {
            a(new File(context.getNoBackupFilesDir(), str));
            a(new File(context.getCacheDir(), str));
        }
    }

    public static ArrayList c(Context context, String str) {
        File file;
        String[] list;
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            file = new File(context.getCacheDir(), str);
        } catch (Throwable th) {
            if (a(2)) {
                n8.a(th);
            }
        }
        if (!file.exists() || !file.isDirectory() || (list = file.list()) == null) {
            return null;
        }
        for (String str2 : list) {
            FileInputStream fileInputStream = new FileInputStream(new File(file, str2));
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object readObject = objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            arrayList.add(readObject);
        }
        return arrayList;
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
                    n8.a(th);
                }
            }
        }
        return null;
    }

    public static void b(Context context, String str, Serializable serializable) {
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
                n8.a(th);
            }
        }
    }

    public static void a(Context context, String str, String str2, Serializable serializable) {
        if (context == null || str2 == null) {
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
                n8.a(th);
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
