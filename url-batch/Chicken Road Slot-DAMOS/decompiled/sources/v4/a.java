package v4;

import a4.j;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import ba.c;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.internal.measurement.b1;
import com.google.android.gms.internal.measurement.t1;
import hd.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import k1.p;
import kotlin.collections.i0;
import m2.h0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ int a(Object obj) {
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (obj instanceof Double) {
            return 4;
        }
        throw new AssertionError("invalid tag type: ".concat(String.valueOf(obj.getClass())));
    }

    public static int b(int i3) {
        switch (i3) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                return 4;
            case j.LONG_FIELD_NUMBER /* 4 */:
                return 5;
            case j.STRING_FIELD_NUMBER /* 5 */:
                return 6;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return 8;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                return 9;
            default:
                switch (i3) {
                    case 20:
                        return 10;
                    case 21:
                        return 11;
                    case 22:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    public static /* synthetic */ int c(int i3) {
        switch (i3) {
            case 1:
                return 0;
            case 2:
                return 1;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                return 2;
            case j.LONG_FIELD_NUMBER /* 4 */:
                return 3;
            case j.STRING_FIELD_NUMBER /* 5 */:
                return 4;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                return 5;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return 6;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                return 7;
            case 9:
                return 8;
            case 10:
                return 20;
            case RequestError.STOP_TRACKING /* 11 */:
                return 21;
            case 12:
                return 22;
            default:
                throw null;
        }
    }

    public static int d(int i3, int i10, int i11) {
        return b1.a(i3) + i10 + i11;
    }

    public static int e(int i3, int i10, int i11, int i12) {
        return b1.a(i3) + i10 + i11 + i12;
    }

    public static int f(h0 h0Var, int i3, int i10) {
        return (h0Var.hashCode() + i3) * i10;
    }

    public static t1 g(t1 t1Var) {
        int size = t1Var.size();
        return t1Var.j(size + size);
    }

    public static d h(String str) {
        z1.a.c(str);
        return new d();
    }

    public static ClassCastException i(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String j(int i3, String str) {
        return str + i3;
    }

    public static String k(String str, String str2) {
        return str + str2;
    }

    public static String l(StringBuilder sb2, float f3, char c10) {
        sb2.append(f3);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String m(StringBuilder sb2, int i3, char c10) {
        sb2.append(i3);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String n(StringBuilder sb2, String str, int i3) {
        sb2.append(str);
        sb2.append(i3);
        return sb2.toString();
    }

    public static String o(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String p(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static StringBuilder q(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static HashMap r(Class cls, s8.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static Map s(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void t(long j, StringBuilder sb2, String str) {
        sb2.append((Object) p.h(j));
        sb2.append(str);
    }

    public static void u(c cVar, Class cls, Class cls2, Class cls3, Class cls4) {
        cVar.register(cls).provides(cls2);
        cVar.register(cls3).provides(cls4);
    }

    public static /* synthetic */ void v(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z10 = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z10) {
                    executorService.shutdownNow();
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void w(Object obj) {
        if (obj == null) {
            return;
        }
        i0.j();
    }

    public static int x(int i3, int i10, int i11) {
        return (Integer.hashCode(i3) + i10) * i11;
    }

    public static /* synthetic */ String y(int i3) {
        switch (i3) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case 2:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case j.LONG_FIELD_NUMBER /* 4 */:
                return "ANDROID_TOO_OLD";
            case j.STRING_FIELD_NUMBER /* 5 */:
                return "NON_PLAY_MODE";
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "SDK_TOO_OLD";
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "MISSING_JOB_SCHEDULER";
            case j.BYTES_FIELD_NUMBER /* 8 */:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case 10:
                return "SERVICE_FLAG_OFF";
            case RequestError.STOP_TRACKING /* 11 */:
                return "PINNED_TO_SERVICE_UPLOAD";
            case 12:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }
}
