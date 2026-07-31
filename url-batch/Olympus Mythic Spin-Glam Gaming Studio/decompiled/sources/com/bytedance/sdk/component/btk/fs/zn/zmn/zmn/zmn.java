package com.bytedance.sdk.component.btk.fs.zn.zmn.zmn;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.iv;
import com.bytedance.sdk.component.utils.nps;
import com.safedk.android.internal.partials.PangleFilesBridge;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes10.dex */
public class zmn {
    private File fs;
    private int zmn;

    private zmn(int i, File file) {
        this.zmn = i;
        this.fs = file;
    }

    public static zmn zmn(int i, File file) {
        try {
            zmn zmnVar = new zmn(i, file);
            if (file != null) {
                file.mkdirs();
            }
            return zmnVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public synchronized InputStream zmn(String str) {
        FileInputStream fileInputStream;
        if (this.zmn <= 0) {
            return null;
        }
        File fs = fs(str);
        try {
            try {
                fileInputStream = new FileInputStream(fs);
            } catch (Throwable unused) {
                return null;
            }
        } catch (FileNotFoundException unused2) {
            fileInputStream = null;
        }
        try {
            zn(fs);
            return fileInputStream;
        } catch (FileNotFoundException unused3) {
            iv.zmn(fileInputStream);
            return null;
        }
    }

    public synchronized boolean zmn(String str, byte[] bArr) {
        FileOutputStream fileOutputStreamCtor;
        if (this.zmn > 0 && str != null && bArr != null) {
            File zn = zn(str);
            FileOutputStream fileOutputStream = null;
            try {
                fileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(zn);
            } catch (FileNotFoundException unused) {
            } catch (Throwable unused2) {
            }
            try {
                fileOutputStreamCtor.write(bArr);
                if (zn.exists()) {
                    zmn(zn, fs(str), true);
                }
                iv.zmn(fileOutputStreamCtor);
                List<File> zmn = zmn(this.fs);
                if (zmn != null) {
                    int size = zmn.size();
                    int i = this.zmn;
                    if (size > i) {
                        zmn((int) (i * 0.7d));
                    }
                }
                return true;
            } catch (FileNotFoundException unused3) {
                fileOutputStream = fileOutputStreamCtor;
                try {
                    File file = this.fs;
                    if (file != null) {
                        file.mkdirs();
                    }
                    iv.zmn(fileOutputStream);
                    List<File> zmn2 = zmn(this.fs);
                    if (zmn2 != null) {
                        int size2 = zmn2.size();
                        int i2 = this.zmn;
                        if (size2 > i2) {
                            zmn((int) (i2 * 0.7d));
                        }
                    }
                    return false;
                } finally {
                    iv.zmn(fileOutputStream);
                    List<File> zmn3 = zmn(this.fs);
                    if (zmn3 != null) {
                        int size3 = zmn3.size();
                        int i3 = this.zmn;
                        if (size3 > i3) {
                            zmn((int) (i3 * 0.7d));
                        }
                    }
                }
            } catch (Throwable unused4) {
                fileOutputStream = fileOutputStreamCtor;
                return false;
            }
        }
        return false;
    }

    private List<File> zmn(File file) {
        File[] listFiles;
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
                    List<File> asList = Arrays.asList(listFiles);
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : asList) {
                        if (file2 != null && file2.isFile() && !TextUtils.isEmpty(file2.getName()) && !file2.getName().endsWith(".temp")) {
                            arrayList.add(file2);
                        }
                    }
                    return arrayList;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public synchronized void zmn(int i) {
        try {
            if (i > this.zmn) {
                return;
            }
            List<File> fs = fs(this.fs);
            if (fs != null && fs.size() > i) {
                while (i < fs.size()) {
                    File file = fs.get(i);
                    if (file != null && file.exists()) {
                        file.delete();
                    }
                    i++;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private List<File> fs(File file) {
        List<File> zmn = zmn(file);
        if (zmn == null || zmn.isEmpty()) {
            return null;
        }
        final HashMap hashMap = new HashMap();
        for (File file2 : zmn) {
            hashMap.put(file2, Long.valueOf(file2.lastModified()));
        }
        Collections.sort(zmn, new Comparator<File>() { // from class: com.bytedance.sdk.component.btk.fs.zn.zmn.zmn.zmn.1
            @Override // java.util.Comparator
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public int compare(File file3, File file4) {
                if (file3 == null && file4 == null) {
                    return 0;
                }
                if (file3 == null) {
                    return 1;
                }
                if (file4 == null) {
                    return -1;
                }
                return Long.compare(((Long) hashMap.get(file4)).longValue(), ((Long) hashMap.get(file3)).longValue());
            }
        });
        return zmn;
    }

    private void zn(File file) {
        if (file == null) {
            return;
        }
        try {
            nps.fs(file);
        } catch (Throwable unused) {
        }
    }

    private void zmn(File file, File file2, boolean z) throws IOException {
        if (z) {
            fb(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private static void fb(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private File fs(String str) {
        return new File(this.fs, str);
    }

    private File zn(String str) {
        return new File(this.fs, str + ".temp");
    }
}
