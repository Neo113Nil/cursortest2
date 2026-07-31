package q4;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.time.Clock;
import java.time.Instant;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import r4.C0618a;
import r4.C0619b;
import u4.C0693a;

/* renamed from: q4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0601b implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public final File f5791f;

    /* renamed from: g, reason: collision with root package name */
    public final C0693a f5792g;

    /* renamed from: h, reason: collision with root package name */
    public C0618a f5793h;

    /* renamed from: i, reason: collision with root package name */
    public C0619b f5794i;

    public C0601b(File file, C0693a c0693a) {
        this.f5791f = file;
        this.f5792g = c0693a;
    }

    public final File a() {
        Clock systemUTC;
        Instant instant;
        long epochSecond;
        int nano;
        C0619b c0619b;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        systemUTC = Clock.systemUTC();
        instant = systemUTC.instant();
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        epochSecond = instant.getEpochSecond();
        long nanos = timeUnit2.toNanos(epochSecond);
        nano = instant.getNano();
        long millis = timeUnit.toMillis(nanos + nano);
        File[] listFiles = this.f5791f.listFiles();
        File file = null;
        if (listFiles != null) {
            long j4 = 0;
            for (File file2 : listFiles) {
                long parseLong = Long.parseLong(file2.getName());
                C0693a c0693a = this.f5792g;
                if (millis >= c0693a.f6037b + parseLong && millis <= c0693a.f6038c + parseLong && (file == null || parseLong < j4)) {
                    file = file2;
                    j4 = parseLong;
                }
            }
        }
        if (file != null && (c0619b = this.f5794i) != null && file.equals(c0619b.f5854f)) {
            this.f5794i.close();
        }
        return file;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                C0618a c0618a = this.f5793h;
                if (c0618a != null) {
                    c0618a.close();
                }
                C0619b c0619b = this.f5794i;
                if (c0619b != null) {
                    c0619b.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(File[] fileArr) {
        if (fileArr.length > 0) {
            int i7 = 0;
            for (File file : fileArr) {
                i7 += (int) file.length();
            }
            if (i7 + 1048576 > 10485760) {
                File file2 = null;
                for (File file3 : fileArr) {
                    if (file2 == null || file3.getName().compareTo(file2.getName()) < 0) {
                        file2 = file3;
                    }
                }
                Objects.requireNonNull(file2);
                C0618a c0618a = this.f5793h;
                if (c0618a != null && file2.equals(c0618a.f5848f)) {
                    this.f5793h.close();
                }
                if (file2.delete()) {
                    return;
                }
                throw new IOException("Could not delete the file: " + file2);
            }
        }
    }
}
