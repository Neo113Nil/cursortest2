package com.baidu.platform.comapi.resource;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import com.baidu.mapapi.OpenLogUtil;
import com.baidu.platform.comapi.JNIInitializer;
import com.baidu.platform.comapi.util.MD5;
import com.baidu.platform.comapi.util.SysOSUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f9807a = new b();

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f9808b = JNIInitializer.getCachedContext().getSharedPreferences("engine_resource_sp", 0);

    private b() {
    }

    private boolean b(File file, byte[] bArr) {
        if (file != null && file.exists() && bArr != null) {
            FileInputStream fileInputStream = null;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    byte[] bArr2 = new byte[fileInputStream2.available()];
                    fileInputStream2.read(bArr2);
                    if (Arrays.equals(bArr2, bArr)) {
                        a.a(fileInputStream2);
                        return false;
                    }
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    a.a(fileInputStream);
                    throw th;
                }
                fileInputStream = fileInputStream2;
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
            a.a(fileInputStream);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0068 A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #3 {all -> 0x004a, blocks: (B:3:0x0001, B:6:0x0008, B:9:0x0013, B:28:0x001d, B:30:0x002d, B:11:0x004e, B:15:0x005e, B:16:0x0062, B:18:0x0068), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void a(ResourceList resourceList) {
        File file;
        boolean z7;
        try {
            Context cachedContext = JNIInitializer.getCachedContext();
            boolean z8 = false;
            byte[] bArr = null;
            boolean z9 = true;
            try {
                String a8 = a();
                file = new File(a8, "/ver.dat");
                try {
                    bArr = resourceList.resVer();
                    z7 = b(file, bArr);
                    if (z7) {
                        try {
                            AssetManager assets = cachedContext.getAssets();
                            byte[] bArr2 = new byte[65536];
                            for (String str : resourceList.resList()) {
                                z9 = a(assets, bArr2, str, a8 + "/" + str);
                            }
                        } catch (RuntimeException | Exception unused) {
                            z9 = z7;
                            z7 = z9;
                            if (z7) {
                                z8 = a(file, bArr);
                            }
                            if (OpenLogUtil.isMapLogEnable()) {
                            }
                        }
                    }
                    a(a8);
                    z8 = z9;
                } catch (RuntimeException | Exception unused2) {
                }
            } catch (RuntimeException | Exception unused3) {
                file = null;
            }
            if (z7 && z8) {
                z8 = a(file, bArr);
            }
            if (OpenLogUtil.isMapLogEnable()) {
                com.baidu.mapsdkplatform.comapi.commonutils.b.a().a("initEngineRes firstInit = " + z7 + "; isInitSucceed = " + z8);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private String a() {
        String outputDirPath = SysOSUtil.getInstance().getOutputDirPath();
        File file = new File(outputDirPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        return outputDirPath;
    }

    private boolean a(AssetManager assetManager, byte[] bArr, String str, String str2) {
        InputStream inputStream = null;
        try {
            if (!TextUtils.isEmpty(str) && str.endsWith(".dir")) {
                String substring = str.substring(0, str.indexOf(".dir"));
                String substring2 = str2.substring(0, str2.indexOf(".dir"));
                String[] list = assetManager.list(substring);
                if (list != null && list.length > 0) {
                    File file = new File(substring2);
                    if (file.exists()) {
                        file.delete();
                    }
                    file.mkdirs();
                    for (String str3 : list) {
                        if (!TextUtils.isEmpty(str3)) {
                            a(assetManager, bArr, substring + "/" + str3, substring2 + "/" + str3);
                        }
                    }
                }
            } else {
                inputStream = assetManager.open(str);
                File file2 = new File(str2);
                File parentFile = file2.getParentFile();
                if (parentFile != null && !parentFile.isDirectory()) {
                    parentFile.mkdirs();
                }
                if (file2.exists()) {
                    file2.delete();
                }
                file2.createNewFile();
                a.a(inputStream, new FileOutputStream(file2), bArr);
            }
            a.a(inputStream);
            return true;
        } catch (Exception unused) {
            a.a(null);
            return false;
        } catch (Throwable th) {
            a.a(null);
            throw th;
        }
    }

    private boolean a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream;
        if (file != null && bArr != null) {
            FileOutputStream fileOutputStream2 = null;
            try {
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                fileOutputStream.write(bArr);
                a.a(fileOutputStream);
                return true;
            } catch (Exception unused2) {
                fileOutputStream2 = fileOutputStream;
                a.a(fileOutputStream2);
                return false;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                a.a(fileOutputStream2);
                throw th;
            }
        }
        return false;
    }

    private void a(String str) {
        if (this.f9808b == null) {
            return;
        }
        File file = new File(str, "shader/");
        String mD5String = MD5.getMD5String(Build.FINGERPRINT);
        if (!file.exists()) {
            this.f9808b.edit().putString("fingerprint", mD5String).commit();
            return;
        }
        String string = this.f9808b.getString("fingerprint", "");
        if (TextUtils.isEmpty(string) || !(string.equals(mD5String) || MD5.getMD5String(string).equals(mD5String))) {
            a(file);
            if (file.exists()) {
                return;
            }
            this.f9808b.edit().putString("fingerprint", mD5String).commit();
        }
    }

    private static void a(File file) {
        if (file == null) {
            return;
        }
        if (!file.isFile() && (!file.exists() || file.list() == null || file.list().length != 0)) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (int i8 = 0; i8 < listFiles.length; i8++) {
                    a(listFiles[i8]);
                    listFiles[i8].delete();
                }
            }
            if (file.exists()) {
                file.delete();
                return;
            }
            return;
        }
        file.delete();
    }
}
