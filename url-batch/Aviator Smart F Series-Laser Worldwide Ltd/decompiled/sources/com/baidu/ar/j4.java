package com.baidu.ar;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j4 {

    /* renamed from: a, reason: collision with root package name */
    public static String f2524a;

    public class a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f2525a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f2526b;

        public a(File file, File file2) {
            this.f2525a = file;
            this.f2526b = file2;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            j4.a(this.f2525a, this.f2526b, false);
            return null;
        }
    }

    public static File a(Bitmap bitmap, File file, int i8) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Exception e8) {
                    e = e8;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e9) {
            e9.printStackTrace();
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, i8, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e10) {
            e = e10;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 != null) {
                fileOutputStream2.flush();
                fileOutputStream2.close();
            }
            return file;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            }
            throw th;
        }
        return file;
    }

    public static boolean b(File file) {
        try {
            return new File(file, "succeed.txt").createNewFile();
        } catch (IOException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public static void c(File file) {
        a(file, true);
    }

    public static boolean d(File file) {
        if (file != null && file.exists()) {
            return file.delete();
        }
        return false;
    }

    public static void e(File file) {
        if (file.exists()) {
            if (!file.isFile()) {
                return;
            } else {
                file.delete();
            }
        }
        file.mkdirs();
    }

    public static void f(File file) {
        File parentFile;
        if (file == null || (parentFile = file.getParentFile()) == null || parentFile.exists()) {
            return;
        }
        parentFile.mkdirs();
    }

    public static boolean g(File file) {
        return file != null && file.exists() && file.isFile();
    }

    public static boolean h(File file) {
        File[] listFiles;
        if (file == null || (listFiles = file.listFiles()) == null) {
            return false;
        }
        boolean z7 = false;
        for (File file2 : listFiles) {
            if (file2.getName().endsWith("succeed.txt")) {
                z7 = true;
            }
        }
        return z7;
    }

    public static ArrayList<File> i(File file) {
        File[] listFiles = file.listFiles();
        ArrayList<File> arrayList = new ArrayList<>();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    arrayList.add(file2);
                } else {
                    i(file2);
                }
            }
        }
        return arrayList;
    }

    public static FileOutputStream j(File file) {
        d(file);
        f(file);
        file.createNewFile();
        return new FileOutputStream(file);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String k(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        if (g(file)) {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        String a8 = x7.a((InputStream) fileInputStream);
                        x7.a((Closeable) fileInputStream);
                        try {
                            fileInputStream.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                        return a8;
                    } catch (IOException e9) {
                        e = e9;
                        e.printStackTrace();
                        x7.a((Closeable) fileInputStream);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    x7.a((Closeable) fileInputStream2);
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                x7.a((Closeable) fileInputStream2);
                if (fileInputStream2 != null) {
                }
                throw th;
            }
        }
        return null;
    }

    public static boolean l(File file) {
        File file2 = new File(file, "succeed.txt");
        if (file2.exists()) {
            return file2.delete();
        }
        return false;
    }

    public static String a(Context context) {
        String str = f2524a;
        if (str != null) {
            return str;
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        f2524a = externalFilesDir == null ? context.getFilesDir().getAbsolutePath() : externalFilesDir.getAbsolutePath();
        return f2524a;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return k(new File(str));
    }

    public static String a(String str, Bitmap bitmap, int i8) {
        if (TextUtils.isEmpty(str) || bitmap == null) {
            return str;
        }
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdir();
        }
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            a(bitmap, file, i8);
            return file.getPath();
        } catch (IOException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static void a(File file, File file2, boolean z7) {
        if (file.exists()) {
            if (z7) {
                new a(file, file2).execute(new Void[0]);
                return;
            }
            e(file2);
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length <= 0) {
                return;
            }
            for (File file3 : listFiles) {
                if (file3.isFile()) {
                    a(file3, new File(file2, file3.getName()), Boolean.TRUE);
                } else {
                    a(file3, new File(file2, file3.getName()), false);
                }
            }
        }
    }

    public static void a(File file, boolean z7) {
        if (file == null || !file.isDirectory()) {
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2, z7);
                } else {
                    file2.delete();
                }
            }
        }
        if (z7) {
            file.delete();
        }
    }

    public static boolean a(File file) {
        return new File(file, "succeed.txt").exists();
    }

    public static boolean a(File file, File file2, Boolean bool) {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e8;
        FileOutputStream fileOutputStream;
        if (file == null || !file.exists() || !file.isFile() || !file.canRead()) {
            return false;
        }
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        if (file2.exists() && bool.booleanValue()) {
            file2.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    x7.a(fileInputStream, fileOutputStream);
                    fileOutputStream.flush();
                } catch (Exception e9) {
                    e8 = e9;
                    fileOutputStream2 = fileOutputStream;
                    try {
                        e8.printStackTrace();
                        fileOutputStream = fileOutputStream2;
                        x7.a((Closeable) fileInputStream);
                        x7.a(fileOutputStream);
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                        x7.a((Closeable) fileInputStream);
                        x7.a(fileOutputStream2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream2 = fileOutputStream;
                    x7.a((Closeable) fileInputStream);
                    x7.a(fileOutputStream2);
                    throw th;
                }
            } catch (Exception e10) {
                e8 = e10;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e11) {
            e8 = e11;
            fileInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
        }
        x7.a((Closeable) fileInputStream);
        x7.a(fileOutputStream);
        return true;
    }

    public static boolean a(File file, String str) {
        return new File(file, str).exists();
    }

    public static String[] a(ArrayList<File> arrayList) {
        String[] strArr = new String[arrayList.size()];
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            strArr[i8] = arrayList.get(i8).getPath();
        }
        return strArr;
    }
}
