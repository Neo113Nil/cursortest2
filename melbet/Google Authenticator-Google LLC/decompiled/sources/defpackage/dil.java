package defpackage;

import android.os.StrictMode;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dil {
    private static final hkh a = hkh.l("com/google/android/libraries/concurrent/threadpool/ProcSchedStatUtils");

    /* JADX WARN: Code restructure failed: missing block: B:45:0x003f, code lost:
    
        if (r10 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0041, code lost:
    
        if (r11 != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0043, code lost:
    
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0046, code lost:
    
        if (r11 != 1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0048, code lost:
    
        r15 = r17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static dim a(File file) {
        File file2;
        dim dimVar;
        FileInputStream fileInputStream;
        long j;
        long j2;
        int i;
        long j3;
        int i2;
        if (file.isDirectory()) {
            return dim.a;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        byte[] bArr = new byte[62];
        try {
            try {
                file2 = file;
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (IOException | ParseException e) {
            e = e;
            file2 = file;
        }
        try {
            fileInputStream = new FileInputStream(file2);
            try {
                int i3 = hpz.a;
                int i4 = 0;
                while (i4 < 62) {
                    int read = fileInputStream.read(bArr, i4, 62 - i4);
                    if (read == -1) {
                        break;
                    }
                    i4 += read;
                }
                j = -1;
                j2 = -1;
                int i5 = 0;
                boolean z = false;
                i = 0;
                loop1: while (true) {
                    j3 = 0;
                    while (true) {
                        if (i5 >= i4) {
                            break loop1;
                        }
                        i2 = i5 + 1;
                        byte b = bArr[i5];
                        if (b != 32) {
                            if (b < 48 || b > 57 || j3 > 922337203685477580L) {
                                break loop1;
                            }
                            j3 = (j3 * 10) + (b - 48);
                            z = true;
                            i5 = i2;
                        } else {
                            break;
                        }
                    }
                    i++;
                    i5 = i2;
                    z = false;
                }
            } finally {
            }
        } catch (IOException e2) {
            e = e2;
            ((hkf) ((hkf) ((hkf) a.g()).h(e)).i("com/google/android/libraries/concurrent/threadpool/ProcSchedStatUtils", "getThreadSchedStat", 87, "ProcSchedStatUtils.java")).u("Failed to read SchedStat for thread %s", file2.getName());
            dimVar = dim.a;
            return dimVar;
        } catch (ParseException e3) {
            e = e3;
            ((hkf) ((hkf) ((hkf) a.g()).h(e)).i("com/google/android/libraries/concurrent/threadpool/ProcSchedStatUtils", "getThreadSchedStat", 87, "ProcSchedStatUtils.java")).u("Failed to read SchedStat for thread %s", file2.getName());
            dimVar = dim.a;
            return dimVar;
        }
        if (i != 2) {
            throw new ParseException("Failed to parse SchedStat", i);
        }
        dimVar = new dim(j, j2, j3);
        fileInputStream.close();
        return dimVar;
    }
}
