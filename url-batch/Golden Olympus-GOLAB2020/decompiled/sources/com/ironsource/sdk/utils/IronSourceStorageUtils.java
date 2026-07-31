package com.ironsource.sdk.utils;

import android.content.Context;
import android.os.Build;
import com.ironsource.b9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.nm;
import com.ironsource.o9;
import com.ironsource.of;
import com.ironsource.oh;
import com.ironsource.st;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class IronSourceStorageUtils {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19550a = "supersonicads";

    /* renamed from: b, reason: collision with root package name */
    private static st f19551b = null;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f19552c = false;

    private static void a(Context context) {
        st stVar = f19551b;
        if (stVar != null && stVar.b()) {
            deleteCacheDirectories(context);
        }
        st stVar2 = f19551b;
        if (stVar2 == null || !stVar2.c()) {
            return;
        }
        deleteFilesDirectories(context);
    }

    private static File b(Context context) {
        of f4 = nm.S().f();
        st stVar = f19551b;
        return (stVar == null || !stVar.d()) ? f4.u(context) : f4.e(context);
    }

    public static String buildAbsolutePathToDirInCache(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + File.separator + str2;
    }

    public static JSONObject buildFilesMap(String str, String str2) {
        Object c4;
        String name;
        File file = new File(str, str2);
        JSONObject jSONObject = new JSONObject();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                try {
                    c4 = c(file2);
                } catch (JSONException e4) {
                    o9.d().a(e4);
                    IronLog.INTERNAL.error(e4.toString());
                }
                if (c4 instanceof JSONArray) {
                    name = "files";
                } else if (c4 instanceof JSONObject) {
                    name = file2.getName();
                }
                jSONObject.put(name, c(file2));
            }
        }
        return jSONObject;
    }

    public static JSONObject buildFilesMapOfDirectory(oh ohVar, JSONObject jSONObject) {
        String name;
        JSONObject buildFilesMapOfDirectory;
        if (ohVar == null || !ohVar.isDirectory()) {
            return new JSONObject();
        }
        File[] listFiles = ohVar.listFiles();
        if (listFiles == null) {
            return new JSONObject();
        }
        JSONObject jSONObject2 = new JSONObject();
        for (File file : listFiles) {
            oh ohVar2 = new oh(file.getPath());
            if (ohVar2.isFile()) {
                name = ohVar2.getName();
                buildFilesMapOfDirectory = ohVar2.a();
                if (jSONObject.has(name)) {
                    buildFilesMapOfDirectory = SDKUtils.mergeJSONObjects(buildFilesMapOfDirectory, jSONObject.getJSONObject(name));
                }
            } else if (ohVar2.isDirectory()) {
                name = ohVar2.getName();
                buildFilesMapOfDirectory = buildFilesMapOfDirectory(ohVar2, jSONObject);
            }
            jSONObject2.put(name, buildFilesMapOfDirectory);
        }
        return jSONObject2;
    }

    private static File c(Context context) {
        of f4 = nm.S().f();
        st stVar = f19551b;
        return (stVar == null || !stVar.d()) ? f4.x(context) : f4.k(context);
    }

    public static void deleteCacheDirectories(Context context) {
        of f4 = nm.S().f();
        a(f4.e(context));
        a(f4.k(context));
    }

    public static synchronized boolean deleteFile(oh ohVar) {
        synchronized (IronSourceStorageUtils.class) {
            if (!ohVar.exists()) {
                return false;
            }
            return ohVar.delete();
        }
    }

    public static void deleteFilesDirectories(Context context) {
        of f4 = nm.S().f();
        a(f4.u(context));
        a(f4.x(context));
    }

    public static synchronized boolean deleteFolder(String str) {
        boolean z4;
        synchronized (IronSourceStorageUtils.class) {
            File file = new File(str);
            if (deleteFolderContentRecursive(file)) {
                z4 = file.delete();
            }
        }
        return z4;
    }

    public static boolean deleteFolderContentRecursive(File file) {
        File[] listFiles = file.listFiles();
        boolean z4 = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z4 &= deleteFolderContentRecursive(file2);
                }
                if (!file2.delete()) {
                    z4 = false;
                }
            }
        }
        return z4;
    }

    public static void ensurePathSafety(File file, String str) {
        st stVar = f19551b;
        if (stVar == null || !stVar.e()) {
            String canonicalPath = new File(str).getCanonicalPath();
            String canonicalPath2 = file.getCanonicalPath();
            if (canonicalPath2.startsWith(canonicalPath)) {
                return;
            }
            throw new Exception(b9.c.f15340u + canonicalPath2);
        }
    }

    public static String getCachedFilesMap(String str, String str2) {
        JSONObject buildFilesMap = buildFilesMap(str, str2);
        try {
            buildFilesMap.put("path", str2);
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
        return buildFilesMap.toString();
    }

    public static String getDiskCacheDirPath(Context context) {
        File b4;
        if (!a() || !SDKUtils.isExternalStorageAvailable() || (b4 = b(context)) == null || !b4.canWrite()) {
            return c(context).getPath();
        }
        f19552c = true;
        return b4.getPath();
    }

    public static ArrayList<oh> getFilesInFolderRecursive(oh ohVar) {
        if (ohVar == null || !ohVar.isDirectory()) {
            return new ArrayList<>();
        }
        ArrayList<oh> arrayList = new ArrayList<>();
        File[] listFiles = ohVar.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                oh ohVar2 = new oh(file.getPath());
                if (ohVar2.isDirectory()) {
                    arrayList.addAll(getFilesInFolderRecursive(ohVar2));
                }
                if (ohVar2.isFile()) {
                    arrayList.add(ohVar2);
                }
            }
        }
        return arrayList;
    }

    public static String getNetworkStorageDir(Context context) {
        File b4 = b(new File(getDiskCacheDirPath(context)));
        if (!b4.exists()) {
            b4.mkdir();
        }
        return b4.getPath();
    }

    public static long getTotalSizeOfDir(oh ohVar) {
        long totalSizeOfDir;
        long j4 = 0;
        if (ohVar != null && ohVar.isDirectory()) {
            File[] listFiles = ohVar.listFiles();
            if (listFiles == null) {
                return 0L;
            }
            for (File file : listFiles) {
                oh ohVar2 = new oh(file.getPath());
                if (ohVar2.isFile()) {
                    totalSizeOfDir = ohVar2.length();
                } else if (ohVar2.isDirectory()) {
                    totalSizeOfDir = getTotalSizeOfDir(ohVar2);
                }
                j4 += totalSizeOfDir;
            }
        }
        return j4;
    }

    public static void initializeCacheDirectory(@NotNull Context context, @NotNull st stVar) {
        f19551b = stVar;
        a(context);
    }

    public static boolean isPathExist(String str, String str2) {
        return new File(str, str2).exists();
    }

    public static boolean isUxt() {
        return f19552c;
    }

    public static String makeDir(String str) {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }

    public static String readFile(oh ohVar) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(ohVar));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(readLine);
            sb.append('\n');
        }
    }

    public static boolean renameFile(String str, String str2) {
        return new File(str).renameTo(new File(str2));
    }

    public static int saveFile(byte[] bArr, String str) {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[102400];
            int i4 = 0;
            while (true) {
                int read = byteArrayInputStream.read(bArr2);
                if (read == -1) {
                    return i4;
                }
                fileOutputStream.write(bArr2, 0, read);
                i4 += read;
            }
        } finally {
            fileOutputStream.close();
            byteArrayInputStream.close();
        }
    }

    private static void a(File file) {
        if (file != null) {
            deleteFolder(b(file).getPath());
        }
    }

    private static File b(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append(f19550a);
        sb.append(str);
        return new File(sb.toString());
    }

    private static Object c(File file) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
        if (file.isFile()) {
            jSONArray.put(file.getName());
            return jSONArray;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                jSONObject.put(file2.getName(), c(file2));
            } else {
                jSONArray.put(file2.getName());
                jSONObject.put("files", jSONArray);
            }
        }
        return jSONObject;
    }

    private static boolean a() {
        st stVar;
        return Build.VERSION.SDK_INT > 29 && (stVar = f19551b) != null && stVar.a();
    }
}
