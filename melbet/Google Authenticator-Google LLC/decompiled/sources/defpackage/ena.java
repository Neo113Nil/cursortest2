package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ena {
    public final File a;
    public int b = 0;
    public boolean c = false;
    private final String d;
    private File e;

    public ena(File file, String str) {
        this.a = file;
        this.d = str;
    }

    public final int a() {
        if (c()) {
            return this.b;
        }
        return 0;
    }

    public final File b() {
        File file = this.e;
        if (file != null) {
            return file;
        }
        File file2 = new File(this.a, this.d.concat("_crash_counter_storage.pb"));
        this.e = file2;
        return file2;
    }

    public final boolean c() {
        if (this.c) {
            return true;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(b());
            try {
                this.b = ((eng) jkp.t(eng.a, fileInputStream, jkd.a())).c;
                fileInputStream.close();
            } finally {
            }
        } catch (FileNotFoundException unused) {
            this.b = 0;
        } catch (IOException e) {
            ((hkf) ((hkf) ((hkf) eiu.a.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/crash/CrashCounter", "maybeLoad", 'f', "CrashCounter.java")).s("failed to read counter from disk.");
            return false;
        }
        this.c = true;
        return true;
    }
}
