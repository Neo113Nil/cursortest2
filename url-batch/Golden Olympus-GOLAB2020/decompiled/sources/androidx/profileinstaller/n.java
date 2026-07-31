package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static final androidx.concurrent.futures.e f12808a = androidx.concurrent.futures.e.i();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f12809b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static c f12810c = null;

    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final int f12811a;

        /* renamed from: b, reason: collision with root package name */
        final int f12812b;

        /* renamed from: c, reason: collision with root package name */
        final long f12813c;

        /* renamed from: d, reason: collision with root package name */
        final long f12814d;

        b(int i4, int i5, long j4, long j5) {
            this.f12811a = i4;
            this.f12812b = i5;
            this.f12813c = j4;
            this.f12814d = j5;
        }

        static b a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } finally {
            }
        }

        void b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f12811a);
                dataOutputStream.writeInt(this.f12812b);
                dataOutputStream.writeLong(this.f12813c);
                dataOutputStream.writeLong(this.f12814d);
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

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f12812b == bVar.f12812b && this.f12813c == bVar.f12813c && this.f12811a == bVar.f12811a && this.f12814d == bVar.f12814d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f12812b), Long.valueOf(this.f12813c), Integer.valueOf(this.f12811a), Long.valueOf(this.f12814d));
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final int f12815a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f12816b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f12817c;

        c(int i4, boolean z4, boolean z5) {
            this.f12815a = i4;
            this.f12817c = z5;
            this.f12816b = z4;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c b(int i4, boolean z4, boolean z5) {
        c cVar = new c(i4, z4, z5);
        f12810c = cVar;
        f12808a.set(cVar);
        return f12810c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:14|(1:79)(1:18)|19|(1:78)(1:23)|24|25|26|(2:63|64)(1:28)|29|(8:36|(1:40)|(1:47)|48|(2:55|56)|52|53|54)|(1:62)|(1:40)|(3:42|45|47)|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ce, code lost:
    
        r13 = 196608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a0, code lost:
    
        r3 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static c c(Context context, boolean z4) {
        b a4;
        b bVar;
        int i4;
        c cVar;
        if (!z4 && (cVar = f12810c) != null) {
            return cVar;
        }
        synchronized (f12809b) {
            if (!z4) {
                try {
                    c cVar2 = f12810c;
                    if (cVar2 != null) {
                        return cVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i5 = Build.VERSION.SDK_INT;
            int i6 = 0;
            if (i5 >= 28 && i5 != 30) {
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                boolean z5 = file.exists() && length > 0;
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z6 = file2.exists() && length2 > 0;
                try {
                    long a5 = a(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            a4 = b.a(file3);
                        } catch (IOException unused) {
                            return b(131072, z5, z6);
                        }
                    } else {
                        a4 = null;
                    }
                    if (a4 != null && a4.f12813c == a5 && (i4 = a4.f12812b) != 2) {
                        i6 = i4;
                        if (z4 && z6 && i6 != 1) {
                            i6 = 2;
                        }
                        if (a4 != null && a4.f12812b == 2 && i6 == 1 && length < a4.f12814d) {
                            i6 = 3;
                        }
                        int i7 = i6;
                        bVar = new b(1, i7, a5, length2);
                        if (a4 != null || !a4.equals(bVar)) {
                            bVar.b(file3);
                        }
                        return b(i7, z5, z6);
                    }
                    if (z6) {
                        i6 = 2;
                    }
                    if (z4) {
                        i6 = 2;
                    }
                    if (a4 != null) {
                        i6 = 3;
                    }
                    int i72 = i6;
                    bVar = new b(1, i72, a5, length2);
                    if (a4 != null) {
                    }
                    bVar.b(file3);
                    return b(i72, z5, z6);
                } catch (PackageManager.NameNotFoundException unused2) {
                    return b(65536, z5, z6);
                }
            }
            return b(262144, false, false);
        }
    }
}
