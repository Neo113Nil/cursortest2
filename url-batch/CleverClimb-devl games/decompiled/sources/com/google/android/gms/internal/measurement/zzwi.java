package com.google.android.gms.internal.measurement;

import java.io.PrintStream;

/* loaded from: classes2.dex */
public final class zzwi {
    private static final zzwj zzbmz;
    private static final int zzbna;

    static final class zza extends zzwj {
        zza() {
        }

        @Override // com.google.android.gms.internal.measurement.zzwj
        public final void zza(Throwable th, PrintStream printStream) {
            th.printStackTrace(printStream);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    static {
        Integer num;
        zzwj zzaVar;
        try {
            num = zzrk();
        } catch (Throwable th) {
            th = th;
            num = null;
        }
        if (num != null) {
            try {
            } catch (Throwable th2) {
                th = th2;
                PrintStream printStream = System.err;
                String name = zza.class.getName();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 132);
                sb.append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ");
                sb.append(name);
                sb.append("will be used. The error is: ");
                printStream.println(sb.toString());
                th.printStackTrace(System.err);
                zzaVar = new zza();
                zzbmz = zzaVar;
                zzbna = num != null ? num.intValue() : 1;
            }
            if (num.intValue() >= 19) {
                zzaVar = new zzwn();
                zzbmz = zzaVar;
                zzbna = num != null ? num.intValue() : 1;
            }
        }
        zzaVar = Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ^ true ? new zzwm() : new zza();
        zzbmz = zzaVar;
        zzbna = num != null ? num.intValue() : 1;
    }

    public static void zza(Throwable th, PrintStream printStream) {
        zzbmz.zza(th, printStream);
    }

    private static Integer zzrk() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }
}
