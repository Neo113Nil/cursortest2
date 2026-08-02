package defpackage;

import android.content.Context;
import android.os.Debug;
import android.os.StrictMode;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class epx {
    public static final /* synthetic */ int h = 0;
    public final koe a;
    public final Context b;
    public final koe c;
    public final koe d;
    public final koe e;
    public final koe f;
    public final fwm g;

    static {
        hoq.v(new csm(16));
    }

    public epx(final koe koeVar, Context context, koe koeVar2, final koe koeVar3, koe koeVar4, koe koeVar5, koe koeVar6, fwm fwmVar) {
        this.g = fwmVar;
        koeVar.getClass();
        final hac v = hoq.v(new eks(koeVar, 9));
        this.a = new koe() { // from class: epu
            @Override // defpackage.koe, defpackage.kod
            public final Object b() {
                int i = epx.h;
                return ((Boolean) koe.this.b()).booleanValue() ? (epk) v.bB() : koeVar.b();
            }
        };
        this.b = context;
        this.c = koeVar2;
        this.d = koeVar4;
        this.e = koeVar5;
        this.f = koeVar6;
    }

    public static /* synthetic */ gzp a() {
        try {
            return gzp.h(Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", Integer.TYPE));
        } catch (Error e) {
            e = e;
            ((hkf) ((hkf) ((hkf) eiu.a.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", (char) 143, "MemoryUsageCapture.java")).s("MemoryInfo.getOtherPss(which) failure");
            return gyf.a;
        } catch (NoSuchMethodException e2) {
            ((hkf) ((hkf) ((hkf) eiu.a.b()).h(e2)).i("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", (char) 141, "MemoryUsageCapture.java")).s("MemoryInfo.getOtherPss(which) not found");
            return gyf.a;
        } catch (Exception e3) {
            e = e3;
            ((hkf) ((hkf) ((hkf) eiu.a.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", (char) 143, "MemoryUsageCapture.java")).s("MemoryInfo.getOtherPss(which) failure");
            return gyf.a;
        }
    }

    public static Long b(String str) {
        if (hoq.S(str)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(str.trim()));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Long c(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        try {
            if (matcher.find()) {
                String group = matcher.group(1);
                hoq.u(group);
                return Long.valueOf(Long.parseLong(group));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public final String d(String str, String str2, boolean z) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                File file = new File(String.format("/proc/%s/%s", str, str2));
                Charset defaultCharset = Charset.defaultCharset();
                defaultCharset.getClass();
                hqb hqbVar = new hqb();
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    hqbVar.a.addFirst(fileInputStream);
                    long size = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel()).size();
                    int i = hpz.a;
                    hoq.B(size >= 0, "expectedSize (%s) must be non-negative", size);
                    if (size > 2147483639) {
                        throw new OutOfMemoryError(size + " bytes is too large to fit in a byte array");
                    }
                    int i2 = (int) size;
                    byte[] bArr = new byte[i2];
                    int i3 = i2;
                    while (true) {
                        if (i3 > 0) {
                            int i4 = i2 - i3;
                            int read = fileInputStream.read(bArr, i4, i3);
                            if (read == -1) {
                                bArr = Arrays.copyOf(bArr, i4);
                                break;
                            }
                            i3 -= read;
                        } else {
                            int read2 = fileInputStream.read();
                            if (read2 != -1) {
                                ArrayDeque arrayDeque = new ArrayDeque(22);
                                arrayDeque.add(bArr);
                                arrayDeque.add(new byte[]{(byte) read2});
                                bArr = hpz.a(fileInputStream, arrayDeque, i2 + 1);
                            }
                        }
                    }
                    hqbVar.close();
                    return new String(bArr, defaultCharset);
                } finally {
                }
            } catch (IOException e) {
                if (z) {
                    ((hkf) ((hkf) ((hkf) ((hkf) eiu.a.g()).C(TimeUnit.MINUTES)).h(e)).i("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "readProcFileToString", 354, "MemoryUsageCapture.java")).u("Error reading dmabuf proc %s", new ekn(str2));
                } else {
                    ((hkf) ((hkf) ((hkf) eiu.a.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "readProcFileToString", 358, "MemoryUsageCapture.java")).u("Error reading proc %s", new ekn(str2));
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return null;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
