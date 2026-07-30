package com.artillery.ctc.uitls;

import a0.c;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.text.format.Formatter;
import androidx.annotation.Keep;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y.d;

@Keep
/* loaded from: classes.dex */
public final class SDCardUtils {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f1258a;

        /* renamed from: b, reason: collision with root package name */
        public String f1259b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1260c;

        /* renamed from: d, reason: collision with root package name */
        public long f1261d;

        /* renamed from: e, reason: collision with root package name */
        public long f1262e;

        public a(String str, String str2, boolean z7) {
            this.f1258a = str;
            this.f1259b = str2;
            this.f1260c = z7;
            this.f1261d = FileUtils.getFsTotalSize(str);
            this.f1262e = FileUtils.getFsAvailableSize(str);
        }

        public String toString() {
            return "SDCardInfo {path = " + this.f1258a + ", state = " + this.f1259b + ", isRemovable = " + this.f1260c + ", totalSize = " + Formatter.formatFileSize(d.a(), this.f1261d) + ", availableSize = " + Formatter.formatFileSize(d.a(), this.f1262e) + '}';
        }
    }

    private SDCardUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static long getExternalAvailableSize() {
        return FileUtils.getFsAvailableSize(getSDCardPathByEnvironment());
    }

    public static long getExternalTotalSize() {
        return FileUtils.getFsTotalSize(getSDCardPathByEnvironment());
    }

    public static long getInternalAvailableSize() {
        return FileUtils.getFsAvailableSize(Environment.getDataDirectory().getAbsolutePath());
    }

    public static long getInternalTotalSize() {
        return FileUtils.getFsTotalSize(Environment.getDataDirectory().getAbsolutePath());
    }

    public static List<String> getMountedSDCardPath() {
        ArrayList arrayList = new ArrayList();
        List<a> sDCardInfo = getSDCardInfo();
        if (sDCardInfo != null && !sDCardInfo.isEmpty()) {
            for (a aVar : sDCardInfo) {
                String str = aVar.f1259b;
                if (str != null && "mounted".equals(str.toLowerCase())) {
                    arrayList.add(aVar.f1258a);
                }
            }
        }
        return arrayList;
    }

    public static List<a> getSDCardInfo() {
        List storageVolumes;
        boolean isRemovable;
        String state;
        ArrayList arrayList = new ArrayList();
        StorageManager storageManager = (StorageManager) d.a().getSystemService("storage");
        if (storageManager == null) {
            return arrayList;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            storageVolumes = storageManager.getStorageVolumes();
            try {
                Method method = c.a().getMethod("getPath", new Class[0]);
                Iterator it = storageVolumes.iterator();
                while (it.hasNext()) {
                    StorageVolume a8 = a0.d.a(it.next());
                    isRemovable = a8.isRemovable();
                    state = a8.getState();
                    arrayList.add(new a((String) method.invoke(a8, new Object[0]), state, isRemovable));
                }
            } catch (IllegalAccessException e8) {
                e8.printStackTrace();
            } catch (NoSuchMethodException e9) {
                e9.printStackTrace();
            } catch (InvocationTargetException e10) {
                e10.printStackTrace();
            }
        } else {
            try {
                Class<?> cls = Class.forName("android.os.storage.StorageVolume");
                Method method2 = cls.getMethod("getPath", new Class[0]);
                Method method3 = cls.getMethod("isRemovable", new Class[0]);
                Method method4 = StorageManager.class.getMethod("getVolumeState", String.class);
                Object invoke = StorageManager.class.getMethod("getVolumeList", new Class[0]).invoke(storageManager, new Object[0]);
                int length = Array.getLength(invoke);
                for (int i8 = 0; i8 < length; i8++) {
                    Object obj = Array.get(invoke, i8);
                    String str = (String) method2.invoke(obj, new Object[0]);
                    arrayList.add(new a(str, (String) method4.invoke(storageManager, str), ((Boolean) method3.invoke(obj, new Object[0])).booleanValue()));
                }
            } catch (ClassNotFoundException e11) {
                e11.printStackTrace();
            } catch (IllegalAccessException e12) {
                e12.printStackTrace();
            } catch (NoSuchMethodException e13) {
                e13.printStackTrace();
            } catch (InvocationTargetException e14) {
                e14.printStackTrace();
            }
        }
        return arrayList;
    }

    public static String getSDCardPathByEnvironment() {
        return isSDCardEnableByEnvironment() ? Environment.getExternalStorageDirectory().getAbsolutePath() : "";
    }

    public static boolean isSDCardEnableByEnvironment() {
        return "mounted".equals(Environment.getExternalStorageState());
    }
}
