package com.blankj.utilcode.util;

import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.text.format.Formatter;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class p0 {

    public static class a {
        private long availableSize;
        private boolean isRemovable;
        private String path;
        private String state;
        private long totalSize;

        a(String str, String str2, boolean z7) {
            this.path = str;
            this.state = str2;
            this.isRemovable = z7;
            this.totalSize = c1.getFsTotalSize(str);
            this.availableSize = c1.getFsAvailableSize(str);
        }

        public long getAvailableSize() {
            return this.availableSize;
        }

        public String getPath() {
            return this.path;
        }

        public String getState() {
            return this.state;
        }

        public long getTotalSize() {
            return this.totalSize;
        }

        public boolean isRemovable() {
            return this.isRemovable;
        }

        public String toString() {
            return "SDCardInfo {path = " + this.path + ", state = " + this.state + ", isRemovable = " + this.isRemovable + ", totalSize = " + Formatter.formatFileSize(z0.getApp(), this.totalSize) + ", availableSize = " + Formatter.formatFileSize(z0.getApp(), this.availableSize) + '}';
        }
    }

    private p0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static long getExternalAvailableSize() {
        return c1.getFsAvailableSize(getSDCardPathByEnvironment());
    }

    public static long getExternalTotalSize() {
        return c1.getFsTotalSize(getSDCardPathByEnvironment());
    }

    public static long getInternalAvailableSize() {
        return c1.getFsAvailableSize(Environment.getDataDirectory().getAbsolutePath());
    }

    public static long getInternalTotalSize() {
        return c1.getFsTotalSize(Environment.getDataDirectory().getAbsolutePath());
    }

    public static List<String> getMountedSDCardPath() {
        ArrayList arrayList = new ArrayList();
        List<a> sDCardInfo = getSDCardInfo();
        if (sDCardInfo != null && !sDCardInfo.isEmpty()) {
            for (a aVar : sDCardInfo) {
                String str = aVar.state;
                if (str != null && "mounted".equals(str.toLowerCase())) {
                    arrayList.add(aVar.path);
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
        StorageManager storageManager = (StorageManager) z0.getApp().getSystemService("storage");
        if (storageManager == null) {
            return arrayList;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            storageVolumes = storageManager.getStorageVolumes();
            try {
                Method method = a0.c.a().getMethod("getPath", new Class[0]);
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
