package defpackage;

import android.content.Context;
import java.io.File;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eqm {
    public final Object a;
    public final Object b;
    public final Object c;

    public eqm(Context context, koe koeVar) {
        this.c = new HashSet();
        this.a = context;
        this.b = koeVar;
    }

    public static void a(File file, long j) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        long j2 = j - 172800;
        for (File file2 : listFiles) {
            String name = file2.getName();
            int indexOf = name.indexOf(95);
            if (indexOf == -1) {
                b(file2);
            } else {
                try {
                    if (Long.parseLong(name.substring(indexOf + 1)) < j2) {
                        if (file2.delete()) {
                            ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "cleanupOldFlightRecords", 119, "FlightRecordWriterImpl.java")).u("Deleted old flight record: %s", file2.getName());
                        } else {
                            ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "cleanupOldFlightRecords", 121, "FlightRecordWriterImpl.java")).u("Failed to delete old flight record: %s", file2.getName());
                        }
                    }
                } catch (NumberFormatException unused) {
                    b(file2);
                }
            }
        }
    }

    private static void b(File file) {
        if (file.delete()) {
            ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "deleteMalformedFile", 133, "FlightRecordWriterImpl.java")).u("Deleted malformed flight record: %s", file.getName());
        } else {
            ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "deleteMalformedFile", 135, "FlightRecordWriterImpl.java")).u("Failed to delete malformed flight record: %s", file.getName());
        }
    }

    public eqm(Context context, koe koeVar, koe koeVar2) {
        this.a = context;
        this.c = koeVar;
        this.b = koeVar2;
    }

    public eqm(ldt ldtVar, hvm hvmVar, Executor executor, jpt jptVar, koe koeVar) {
        this.b = jptVar;
        this.c = hvmVar;
        this.a = ldtVar.n(executor, jptVar, koeVar);
    }
}
