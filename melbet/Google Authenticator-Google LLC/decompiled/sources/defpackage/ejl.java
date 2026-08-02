package defpackage;

import android.content.Context;
import android.os.Process;
import j$.time.Instant;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ejl {
    public final Executor a;
    public final Set b;
    public final koe c;
    public jkj d;
    public final eqm e;
    private final Executor f;

    public ejl(Executor executor, Set set, eqm eqmVar, koe koeVar) {
        this.a = executor;
        this.e = eqmVar;
        this.f = new hvv(executor);
        this.b = set;
        this.c = koeVar;
    }

    public final hvi a(final ejj ejjVar) {
        return hnu.aL(new Runnable() { // from class: ejk
            /* JADX WARN: Removed duplicated region for block: B:37:0x01e6  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x01fa  */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Set] */
            /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, koe] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                ejl ejlVar = ejl.this;
                boolean z = true;
                if (ejlVar.d == null) {
                    boolean booleanValue = ((Boolean) ejlVar.c.b()).booleanValue();
                    jkj k = ejf.a.k();
                    if (booleanValue) {
                        long myPid = Process.myPid();
                        if (!k.b.M()) {
                            k.t();
                        }
                        ejf ejfVar = (ejf) k.b;
                        ejfVar.b |= 1;
                        ejfVar.c = myPid;
                        jmh b = jmx.b(Instant.now().toEpochMilli());
                        if (!k.b.M()) {
                            k.t();
                        }
                        ejf ejfVar2 = (ejf) k.b;
                        b.getClass();
                        ejfVar2.d = b;
                        ejfVar2.b |= 2;
                    }
                    ejlVar.d = k;
                }
                if (!ejjVar.a(ejlVar.d)) {
                    return;
                }
                eqm eqmVar = ejlVar.e;
                ejf ejfVar3 = (ejf) ejlVar.d.q();
                int i = ejfVar3.b;
                if ((i & 1) != 0 && (i & 2) != 0 && ejfVar3.c >= 0) {
                    jmh jmhVar = ejfVar3.d;
                    if (jmhVar == null) {
                        jmhVar = jmh.a;
                    }
                    if (jmhVar.b >= 0) {
                        File file = new File(((Context) eqmVar.a).getFilesDir(), "flight_records");
                        long epochSecond = Instant.now().getEpochSecond();
                        if (((Boolean) eqmVar.b.b()).booleanValue()) {
                            eqm.a(file, epochSecond);
                            jmh jmhVar2 = ejfVar3.d;
                            if (jmhVar2 == null) {
                                jmhVar2 = jmh.a;
                            }
                            if (jmhVar2.b < epochSecond - 172800) {
                                ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", 62, "FlightRecordWriterImpl.java")).s("Skipping write for flight record older than 48 hours");
                                z = false;
                                if (z) {
                                    ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/flightrecorder/FlightRecorderImpl", "submitMutation", 95, "FlightRecorderImpl.java")).s("Failed to write flight record to disk");
                                    return;
                                } else {
                                    ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/flightrecorder/FlightRecorderImpl", "submitMutation", 93, "FlightRecorderImpl.java")).s("Successfully wrote flight record to disk");
                                    return;
                                }
                            }
                        }
                        if (file.exists() || file.mkdirs()) {
                            Locale locale = Locale.US;
                            Long valueOf = Long.valueOf(ejfVar3.c);
                            jmh jmhVar3 = ejfVar3.d;
                            if (jmhVar3 == null) {
                                jmhVar3 = jmh.a;
                            }
                            File file2 = new File(file, String.format(locale, "%d_%s", valueOf, Long.valueOf(jmhVar3.b)));
                            try {
                                ?? r0 = eqmVar.c;
                                if (!r0.contains(file2) && file2.exists()) {
                                    hkf hkfVar = (hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", 77, "FlightRecordWriterImpl.java");
                                    eki ekiVar = new eki(ejfVar3.c);
                                    jmh jmhVar4 = ejfVar3.d;
                                    if (jmhVar4 == null) {
                                        jmhVar4 = jmh.a;
                                    }
                                    hkfVar.w("File with pid %s and start time %s already exists, overwriting the previous record", ekiVar, new eki(jmhVar4.b));
                                }
                                if (!file2.exists()) {
                                    file2.createNewFile();
                                    ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", 86, "FlightRecordWriterImpl.java")).s("Created new file successfully");
                                    r0.add(file2);
                                }
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                try {
                                    ejfVar3.e(fileOutputStream);
                                    fileOutputStream.close();
                                    ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", 93, "FlightRecordWriterImpl.java")).s("Write successful");
                                } finally {
                                }
                            } catch (IOException e) {
                                ((hkf) ((hkf) ((hkf) eiu.a.g()).h(e)).i("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", '`', "FlightRecordWriterImpl.java")).s("Failed to write FlightRecord to file");
                            }
                            if (z) {
                            }
                        } else {
                            ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", 68, "FlightRecordWriterImpl.java")).s("Failed to create flight records directory");
                        }
                        z = false;
                        if (z) {
                        }
                    }
                }
                ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", 53, "FlightRecordWriterImpl.java")).s("Invalid FlightRecord");
                z = false;
                if (z) {
                }
            }
        }, this.f);
    }
}
