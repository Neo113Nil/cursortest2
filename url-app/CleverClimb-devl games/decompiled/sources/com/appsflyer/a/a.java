package com.appsflyer.a;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f3412a = new a();

    public static a a() {
        return f3412a;
    }

    private a() {
    }

    public List<b> b(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(context.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            } else {
                for (File file2 : file.listFiles()) {
                    StringBuilder sb = new StringBuilder("Found cached request");
                    sb.append(file2.getName());
                    Log.i("AppsFlyer_4.8.10", sb.toString());
                    arrayList.add(a(file2));
                }
            }
        } catch (Exception unused) {
            Log.i("AppsFlyer_4.8.10", "Could not cache request");
        }
        return arrayList;
    }

    private static b a(File file) {
        FileReader fileReader;
        try {
            fileReader = new FileReader(file);
            try {
                char[] cArr = new char[(int) file.length()];
                fileReader.read(cArr);
                b bVar = new b(cArr);
                bVar.a(file.getName());
                try {
                    fileReader.close();
                } catch (IOException unused) {
                }
                return bVar;
            } catch (Exception unused2) {
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            fileReader = null;
        } catch (Throwable th2) {
            th = th2;
            fileReader = null;
        }
    }

    public void a(Context context) {
        try {
            if (new File(context.getFilesDir(), "AFRequestCache").exists()) {
                return;
            }
            new File(context.getFilesDir(), "AFRequestCache").mkdir();
        } catch (Exception unused) {
            Log.i("AppsFlyer_4.8.10", "Could not create cache directory");
        }
    }

    public void a(b bVar, Context context) {
        OutputStreamWriter outputStreamWriter = null;
        try {
            try {
                File file = new File(context.getFilesDir(), "AFRequestCache");
                if (!file.exists()) {
                    file.mkdir();
                    return;
                }
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > 40) {
                    Log.i("AppsFlyer_4.8.10", "reached cache limit, not caching request");
                    return;
                }
                Log.i("AppsFlyer_4.8.10", "caching request...");
                File file2 = new File(new File(context.getFilesDir(), "AFRequestCache"), Long.toString(System.currentTimeMillis()));
                file2.createNewFile();
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(file2.getPath(), true));
                try {
                    outputStreamWriter2.write("version=");
                    outputStreamWriter2.write(bVar.a());
                    outputStreamWriter2.write(10);
                    outputStreamWriter2.write("url=");
                    outputStreamWriter2.write(bVar.c());
                    outputStreamWriter2.write(10);
                    outputStreamWriter2.write("data=");
                    outputStreamWriter2.write(bVar.b());
                    outputStreamWriter2.write(10);
                    outputStreamWriter2.flush();
                    try {
                        outputStreamWriter2.close();
                    } catch (IOException unused) {
                    }
                } catch (Exception unused2) {
                    outputStreamWriter = outputStreamWriter2;
                    Log.i("AppsFlyer_4.8.10", "Could not cache request");
                    if (outputStreamWriter != null) {
                        try {
                            outputStreamWriter.close();
                        } catch (IOException unused3) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    if (outputStreamWriter != null) {
                        try {
                            outputStreamWriter.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused5) {
        }
    }

    public void a(String str, Context context) {
        File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
        StringBuilder sb = new StringBuilder("Deleting ");
        sb.append(str);
        sb.append(" from cache");
        Log.i("AppsFlyer_4.8.10", sb.toString());
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("Could not delete ");
                sb2.append(str);
                sb2.append(" from cache");
                Log.i("AppsFlyer_4.8.10", sb2.toString(), e);
            }
        }
    }
}
