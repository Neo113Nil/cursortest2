package com.google.android.gms.internal.stable;

import java.io.PrintStream;

/* loaded from: classes2.dex */
public final class zzk {
    private static final zzl zzahg;
    private static final int zzahh;

    static final class zza extends zzl {
        zza() {
        }

        @Override // com.google.android.gms.internal.stable.zzl
        public final void zza(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    static {
        Integer num;
        zzl zzaVar;
        try {
            num = zzdw();
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
                zzahg = zzaVar;
                zzahh = num != null ? num.intValue() : 1;
            }
            if (num.intValue() >= 19) {
                zzaVar = new zzp();
                zzahg = zzaVar;
                zzahh = num != null ? num.intValue() : 1;
            }
        }
        zzaVar = Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ^ true ? new zzo() : new zza();
        zzahg = zzaVar;
        zzahh = num != null ? num.intValue() : 1;
    }

    public static void zza(Throwable th, Throwable th2) {
        zzahg.zza(th, th2);
    }

    private static Integer zzdw() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }
}
