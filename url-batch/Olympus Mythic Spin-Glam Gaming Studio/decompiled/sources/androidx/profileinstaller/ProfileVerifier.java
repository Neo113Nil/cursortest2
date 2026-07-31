package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.ResolvableFuture;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class ProfileVerifier {
    private static final ResolvableFuture sFuture = ResolvableFuture.create();
    private static final Object SYNC_OBJ = new Object();
    private static CompilationStatus sCompilationStatus = null;

    /* JADX WARN: Can't wrap try/catch for region: R(20:23|(1:89)(1:27)|28|(1:88)(1:32)|33|34|35|(2:74|75)(1:37)|38|(8:45|(1:49)|(1:56)|57|(2:64|65)|61|62|63)|(1:71)(1:(1:73))|(1:49)|(3:51|54|56)|57|(1:59)|64|65|61|62|63) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fc, code lost:
    
        r5 = 196608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c8, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static CompilationStatus writeProfileVerification(Context context, boolean z) {
        boolean z2;
        Cache readFromFile;
        Cache cache;
        int i;
        CompilationStatus compilationStatus;
        if (!z && (compilationStatus = sCompilationStatus) != null) {
            return compilationStatus;
        }
        synchronized (SYNC_OBJ) {
            if (!z) {
                CompilationStatus compilationStatus2 = sCompilationStatus;
                if (compilationStatus2 != null) {
                    return compilationStatus2;
                }
            }
            int i2 = 0;
            try {
                AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                try {
                    z2 = openFd.getLength() > 0;
                    openFd.close();
                } finally {
                }
            } catch (IOException unused) {
                z2 = false;
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28 && i3 != 30) {
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                boolean z3 = file.exists() && length > 0;
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z4 = file2.exists() && length2 > 0;
                try {
                    long packageLastUpdateTime = getPackageLastUpdateTime(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            readFromFile = Cache.readFromFile(file3);
                        } catch (IOException unused2) {
                            return setCompilationStatus(131072, z3, z4, z2);
                        }
                    } else {
                        readFromFile = null;
                    }
                    if (readFromFile != null && readFromFile.mPackageLastUpdateTime == packageLastUpdateTime && (i = readFromFile.mResultCode) != 2) {
                        i2 = i;
                        if (z && z4 && i2 != 1) {
                            i2 = 2;
                        }
                        if (readFromFile != null && readFromFile.mResultCode == 2 && i2 == 1 && length < readFromFile.mInstalledCurrentProfileSize) {
                            i2 = 3;
                        }
                        cache = new Cache(1, i2, packageLastUpdateTime, length2);
                        if (readFromFile != null || !readFromFile.equals(cache)) {
                            cache.writeOnFile(file3);
                        }
                        return setCompilationStatus(i2, z3, z4, z2);
                    }
                    if (z3) {
                        i2 = 1;
                    } else if (z4) {
                        i2 = 2;
                    }
                    if (z) {
                        i2 = 2;
                    }
                    if (readFromFile != null) {
                        i2 = 3;
                    }
                    cache = new Cache(1, i2, packageLastUpdateTime, length2);
                    if (readFromFile != null) {
                    }
                    cache.writeOnFile(file3);
                    return setCompilationStatus(i2, z3, z4, z2);
                } catch (PackageManager.NameNotFoundException unused3) {
                    return setCompilationStatus(65536, z3, z4, z2);
                }
            }
            return setCompilationStatus(262144, false, false, z2);
        }
    }

    private static CompilationStatus setCompilationStatus(int i, boolean z, boolean z2, boolean z3) {
        CompilationStatus compilationStatus = new CompilationStatus(i, z, z2, z3);
        sCompilationStatus = compilationStatus;
        sFuture.set(compilationStatus);
        return sCompilationStatus;
    }

    private static long getPackageLastUpdateTime(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.getPackageInfo(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    @RestrictTo
    static class Cache {
        final long mInstalledCurrentProfileSize;
        final long mPackageLastUpdateTime;
        final int mResultCode;
        final int mSchema;

        Cache(int i, int i2, long j, long j2) {
            this.mSchema = i;
            this.mResultCode = i2;
            this.mPackageLastUpdateTime = j;
            this.mInstalledCurrentProfileSize = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Cache)) {
                return false;
            }
            Cache cache = (Cache) obj;
            return this.mResultCode == cache.mResultCode && this.mPackageLastUpdateTime == cache.mPackageLastUpdateTime && this.mSchema == cache.mSchema && this.mInstalledCurrentProfileSize == cache.mInstalledCurrentProfileSize;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.mResultCode), Long.valueOf(this.mPackageLastUpdateTime), Integer.valueOf(this.mSchema), Long.valueOf(this.mInstalledCurrentProfileSize));
        }

        void writeOnFile(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.mSchema);
                dataOutputStream.writeInt(this.mResultCode);
                dataOutputStream.writeLong(this.mPackageLastUpdateTime);
                dataOutputStream.writeLong(this.mInstalledCurrentProfileSize);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        static Cache readFromFile(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                Cache cache = new Cache(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return cache;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static class CompilationStatus {
        private final boolean mHasCurrentProfile;
        private final boolean mHasEmbeddedProfile;
        private final boolean mHasReferenceProfile;
        final int mResultCode;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface ResultCode {
        }

        CompilationStatus(int i, boolean z, boolean z2, boolean z3) {
            this.mResultCode = i;
            this.mHasCurrentProfile = z2;
            this.mHasReferenceProfile = z;
            this.mHasEmbeddedProfile = z3;
        }
    }

    @RequiresApi
    private static class Api33Impl {
        static PackageInfo getPackageInfo(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }
}
