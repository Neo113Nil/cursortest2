package X4;

import b5.C0278a;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.time.Clock;
import java.time.Instant;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final File f2864d;

    /* renamed from: e, reason: collision with root package name */
    public final C0278a f2865e;

    /* renamed from: i, reason: collision with root package name */
    public Y4.a f2866i;

    /* renamed from: l, reason: collision with root package name */
    public Y4.b f2867l;

    public b(File file, C0278a c0278a) {
        this.f2864d = file;
        this.f2865e = c0278a;
    }

    public final File a() {
        Clock systemUTC;
        Instant instant;
        long epochSecond;
        int nano;
        Y4.b bVar;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        systemUTC = Clock.systemUTC();
        instant = systemUTC.instant();
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        epochSecond = instant.getEpochSecond();
        long nanos = timeUnit2.toNanos(epochSecond);
        nano = instant.getNano();
        long millis = timeUnit.toMillis(nanos + nano);
        File[] listFiles = this.f2864d.listFiles();
        File file = null;
        if (listFiles != null) {
            long j = 0;
            for (File file2 : listFiles) {
                long parseLong = Long.parseLong(file2.getName());
                C0278a c0278a = this.f2865e;
                if (millis >= c0278a.f4158b + parseLong && millis <= c0278a.f4159c + parseLong && (file == null || parseLong < j)) {
                    file = file2;
                    j = parseLong;
                }
            }
        }
        if (file != null && (bVar = this.f2867l) != null && file.equals(bVar.f2917d)) {
            this.f2867l.close();
        }
        return file;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                Y4.a aVar = this.f2866i;
                if (aVar != null) {
                    aVar.close();
                }
                Y4.b bVar = this.f2867l;
                if (bVar != null) {
                    bVar.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(File[] fileArr) {
        if (fileArr.length > 0) {
            int i2 = 0;
            for (File file : fileArr) {
                i2 += (int) file.length();
            }
            if (i2 + 1048576 > 10485760) {
                File file2 = null;
                for (File file3 : fileArr) {
                    if (file2 == null || file3.getName().compareTo(file2.getName()) < 0) {
                        file2 = file3;
                    }
                }
                Objects.requireNonNull(file2);
                Y4.a aVar = this.f2866i;
                if (aVar != null && file2.equals(aVar.f2911d)) {
                    this.f2866i.close();
                }
                if (file2.delete()) {
                    return;
                }
                throw new IOException("Could not delete the file: " + file2);
            }
        }
    }
}
