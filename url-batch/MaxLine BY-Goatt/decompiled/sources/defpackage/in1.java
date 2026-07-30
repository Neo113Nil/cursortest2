package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract /* synthetic */ class in1 {
    public static final void a(View view, int i) {
        int u = q40.u(i);
        if (u == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (as0.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (u == 1) {
            if (as0.G(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (u == 2) {
            if (as0.G(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (u != 3) {
            return;
        }
        if (as0.G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static int b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        lh.e(k(i, "Unknown visibility "));
        return 0;
    }

    public static int c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public static int d(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return 8;
            case 8:
                return 9;
            default:
                switch (i) {
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

    public static /* synthetic */ int e(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 20;
            case 11:
                return 21;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                return 22;
            default:
                throw null;
        }
    }

    public static int f(int i, int i2, int i3) {
        return lm3.r(i) + i2 + i3;
    }

    public static int g(int i, int i2, int i3, int i4) {
        return lm3.r(i) + i2 + i3 + i4;
    }

    public static int h(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int i(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static int j(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    public static String k(int i, String str) {
        return str + i;
    }

    public static String l(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String m(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder n(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static void o(long j, StringBuilder sb, String str) {
        sb.append((Object) aw.i(j));
        sb.append(str);
    }

    public static /* synthetic */ void p(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                b71.t();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ String q(int i) {
        switch (i) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case 2:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case 3:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case 4:
                return "ANDROID_TOO_OLD";
            case 5:
                return "NON_PLAY_MODE";
            case 6:
                return "SDK_TOO_OLD";
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return "MISSING_JOB_SCHEDULER";
            case 8:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case 10:
                return "SERVICE_FLAG_OFF";
            case 11:
                return "PINNED_TO_SERVICE_UPLOAD";
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String r(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String s(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }
}
