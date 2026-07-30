package com.moyoung.lib.videoeditor.editors.bean;

import androidx.annotation.NonNull;
import cn.hutool.core.text.l;
import com.google.android.exoplayer2.C;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public class b {
    public String inputFilePath;
    public boolean isPathContainSpaces;
    public String outputFilePath;
    public long startMs = 0;
    public long endMs = C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
    public int cropX = 0;
    public int cropY = 0;
    public int cropWidth = 466;
    public int cropHeight = 466;
    public float targetWidth = 466.0f;
    public float targetHeight = 466.0f;
    public int quality = 1;
    public int fps = 30;
    public boolean isRemoveAudio = true;
    public String extraCmd = "";

    public b(String str, String str2) {
        this.outputFilePath = str2;
        boolean contains = str.contains(l.SPACE);
        this.isPathContainSpaces = contains;
        if (!contains) {
            this.inputFilePath = str;
            return;
        }
        String tempFilePath = getTempFilePath(str2);
        this.inputFilePath = tempFilePath;
        copyFile(str, tempFilePath);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005a A[Catch: IOException -> 0x0056, TRY_LEAVE, TryCatch #3 {IOException -> 0x0056, blocks: (B:38:0x0052, B:31:0x005a), top: B:37:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void copyFile(String str, String str2) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        try {
            try {
                File file = new File(str);
                File file2 = new File(str2);
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    fileOutputStream = new FileOutputStream(file2);
                } catch (IOException e8) {
                    e = e8;
                    fileOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = null;
                }
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read <= 0) {
                            fileInputStream2.close();
                            fileOutputStream.close();
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                } catch (IOException e9) {
                    e = e9;
                    fileInputStream = fileInputStream2;
                    try {
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                                throw th;
                            }
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                    }
                    if (fileOutputStream != null) {
                    }
                    throw th;
                }
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        } catch (IOException e12) {
            e = e12;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    private void deleteTempFile() {
        new File(this.inputFilePath).delete();
    }

    @NonNull
    private static String getTempFilePath(String str) {
        File file = new File(str);
        String name = file.getName();
        return new File(file.getParent(), name.substring(0, name.lastIndexOf(46)) + "_original" + name.substring(name.lastIndexOf(46))).getAbsolutePath();
    }

    public void clearTempFile() {
        if (this.isPathContainSpaces) {
            deleteTempFile();
        }
    }
}
