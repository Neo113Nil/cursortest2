package com.google.android.gms.internal.gcm;

import java.io.PrintStream;

/* loaded from: classes2.dex */
public final class zzf {
    private static final zzg zzdc;
    private static final int zzdd;

    static final class zzd extends zzg {
        zzd() {
        }

        @Override // com.google.android.gms.internal.gcm.zzg
        public final void zzd(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    static {
        Integer num;
        zzg zzdVar;
        try {
            num = zzy();
        } catch (Throwable th) {
            th = th;
            num = null;
        }
        if (num != null) {
            try {
            } catch (Throwable th2) {
                th = th2;
                PrintStream printStream = System.err;
                String name = zzd.class.getName();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 132);
                sb.append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ");
                sb.append(name);
                sb.append("will be used. The error is: ");
                printStream.println(sb.toString());
                th.printStackTrace(System.err);
                zzdVar = new zzd();
                zzdc = zzdVar;
                zzdd = num != null ? num.intValue() : 1;
            }
            if (num.intValue() >= 19) {
                zzdVar = new zzk();
                zzdc = zzdVar;
                zzdd = num != null ? num.intValue() : 1;
            }
        }
        zzdVar = Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ^ true ? new zzj() : new zzd();
        zzdc = zzdVar;
        zzdd = num != null ? num.intValue() : 1;
    }

    public static void zzd(Throwable th, Throwable th2) {
        zzdc.zzd(th, th2);
    }

    private static Integer zzy() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }
}
