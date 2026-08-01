package com.facebook.ads.internal.util.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import com.facebook.ads.redexgen.X.C03207x;
import com.facebook.ads.redexgen.X.C03217y;
import com.facebook.ads.redexgen.X.IP;
import com.facebook.ads.redexgen.X.KM;
import com.facebook.ads.redexgen.X.KO;
import com.facebook.ads.redexgen.X.KP;
import com.facebook.ads.redexgen.X.KT;
import com.facebook.ads.redexgen.X.LP;
import com.facebook.ads.redexgen.X.Y9;
import com.facebook.ads.redexgen.X.YA;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class ActivityUtils implements Application.ActivityLifecycleCallbacks {
    public static Context A01;
    public static Y9 A02;
    public static byte[] A03;
    public static String[] A04 = {"ouMPsLdF8VOzsynXqmRiTnVq9sCULlEK", "RDluICFSUJyOT3sC2lXOFgStPQc7gg7Y", "UmtUlnThENixw5hdz8sG1KFdsGmJDk97", "fTn296Ch3TXxkAVBDyGQxp9TrJ", "IUqXVRs0X8uhoFuXuWrDHC", "AqSoSQ8lTXl56yd6tw1FPxb5AEpw6", "5ylHfIThOZnGyEtaFkstDkkPbeVs18fd", "i0x"};
    public static final KT A05;
    public static final List<KP> A06;
    public static final List<Runnable> A07;
    public static final Map<Activity, Integer> A08;
    public final Class<? extends Activity> A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A04;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "4AKSMNDzmxTAf23dNNcZP8";
            strArr2[7] = "cH1";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 12);
            i4++;
        }
    }

    public static void A02() {
        A03 = new byte[]{54, 58, 91, 121, 110, 115, 108, 115, 110, 99, 32, 58, 92, 80, 2, Ascii.NAK, Ascii.SYN, 74, 80, 115, 81, 70, 91, 68, 91, 70, 75, Ascii.DC2, 86, 91, 65, 81, 64, 87, 66, 83, 92, 81, 91, 87, 65, Ascii.FS, 55, 6, 6, 53, Ascii.EM, Ascii.CAN, 2, 19, Ascii.SO, 2, 86, Ascii.US, 5, 86, Ascii.CAN, Ascii.EM, 2, 86, 55, 6, 6, Ascii.SUB, Ascii.US, Ascii.NAK, Ascii.ETB, 2, Ascii.US, Ascii.EM, Ascii.CAN, 88, 40, 4, 5, 8, Ascii.RS, Ascii.EM, Ascii.EM, Ascii.SO, 5, Ascii.US, 75, 6, 4, Ascii.SI, 2, Ascii.CR, 2, 8, 10, Ascii.US, 2, 4, 5, 75, Ascii.SO, 19, 8, Ascii.SO, Ascii.ESC, Ascii.US, 2, 4, 5, 75, Ascii.US, 3, Ascii.EM, 4, Ascii.FS, 5, Ascii.SI, Ascii.RS, Ascii.EM, 2, 5, Ascii.FF, 75, Ascii.EM, Ascii.SO, Ascii.FF, 2, Ascii.CAN, Ascii.US, Ascii.SO, Ascii.EM, 42, 8, Ascii.US, 2, Ascii.GS, 2, Ascii.US, Ascii.DC2, 40, 10, 7, 7, 9, 10, 8, 0, Ascii.CAN, 39, 2, Ascii.CAN, Ascii.US, Ascii.SO, 5, Ascii.SO, Ascii.EM, 10, 41, 33, 101, 36, 38, 49, 44, 51, 44, 49, 60, 101, 54, 49, 36, 49, 32, Byte.MAX_VALUE, 101, 115, 66, 86, 80, 70, 71, 3, 66, 64, 87, 74, 85, 74, 87, 90, 3, 74, 80, 3, 77, 76, 87, 3, 81, 70, 80, 86, 78, 70, 71, Ascii.CR, 74, 125, 107, 34, 56, Ascii.US, Ascii.GS, 10, 33, Ascii.VT, 10, Ascii.ETB, Ascii.DC2, 4, Ascii.NAK, Ascii.FF, 81, 80, Byte.MAX_VALUE, 93, 74, 87, 72, 87, 74, 71, 125, 76, 91, 95, 74, 91, 90};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static synchronized void A04(Y9 y9, Class<? extends Activity> cls) {
        synchronized (ActivityUtils.class) {
            A02 = y9;
            Context applicationContext = y9.getApplicationContext();
            A01 = applicationContext;
            if (applicationContext instanceof Application) {
                ANActivityLifecycleCallbacksListener aNActivityLifecycleCallbacksListener = ANActivityLifecycleCallbacksListener.getANActivityLifecycleCallbacksListener();
                if (aNActivityLifecycleCallbacksListener != null) {
                    Map<Activity, Integer> activityStateMap = aNActivityLifecycleCallbacksListener.getActivityStateMap();
                    synchronized (activityStateMap) {
                        try {
                            A08.putAll(activityStateMap);
                        } catch (ConcurrentModificationException unused) {
                            y9.A07().A9M(A01(208, 8, 114), C03207x.A02, new C03217y(A01(72, 80, 103)));
                        }
                    }
                    ANActivityLifecycleCallbacksListener.unregisterActivityCallbacks(y9);
                }
                ((Application) A01).registerActivityLifecycleCallbacks(new ActivityUtils(cls));
            } else {
                y9.A07().A9M(A01(216, 3, 105), C03207x.A0d, new C03217y(A01(42, 30, 122)));
            }
        }
    }

    static {
        A02();
        A08 = Collections.synchronizedMap(new WeakHashMap());
        A06 = Collections.synchronizedList(new ArrayList());
        A07 = new ArrayList();
        A05 = KT.A00();
    }

    public ActivityUtils(Class<? extends Activity> adsActivityClass) {
        this.A00 = adsActivityClass;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[Catch: all -> 0x00a1, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x000e, B:8:0x0014, B:11:0x0027, B:14:0x0031, B:19:0x003d, B:20:0x0041, B:24:0x0049), top: B:4:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized Activity A00() {
        boolean z;
        synchronized (ActivityUtils.class) {
            Activity activity = null;
            Iterator<Map.Entry<Activity, Integer>> it = A08.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Activity, Integer> next = it.next();
                if (next.getValue().intValue() == 3) {
                    activity = next.getKey();
                    break;
                }
            }
            Activity activity2 = null;
            if (activity != null && Build.VERSION.SDK_INT >= 28) {
                z = false;
                if (z) {
                    activity2 = KM.A00();
                }
                if (A02 != null && z && activity != activity2) {
                    C03217y c03217y = new C03217y(A01(19, 23, 62), A01(203, 5, 20) + activity + A01(12, 7, 124) + activity2);
                    c03217y.A03(1);
                    A02.A07().A9M(A01(208, 8, 114), C03207x.A03, c03217y);
                }
                return activity == null ? activity : activity2;
            }
            z = true;
            if (z) {
            }
            if (A02 != null) {
                C03217y c03217y2 = new C03217y(A01(19, 23, 62), A01(203, 5, 20) + activity + A01(12, 7, 124) + activity2);
                c03217y2.A03(1);
                A02.A07().A9M(A01(208, 8, 114), C03207x.A03, c03217y2);
            }
            if (activity == null) {
            }
        }
    }

    public static void A03(YA ya) {
        if (!IP.A1O(ya) || Build.VERSION.SDK_INT >= 29) {
            return;
        }
        KO ko = new KO(ya);
        List<Runnable> list = A07;
        synchronized (list) {
            list.add(ko);
        }
        LP.A01.A01().postDelayed(ko, 2000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        A08.put(activity, 1);
        Iterator<KP> it = A06.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A01(219, 17, 50));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        A08.put(activity, 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ArrayList arrayList;
        Map<Activity, Integer> map = A08;
        Integer num = map.get(activity);
        if (num == null || num.intValue() != 3) {
            C03217y c03217y = new C03217y(A01(Opcodes.IRETURN, 31, 47), A01(Opcodes.DCMPG, 20, 73) + num + A01(0, 12, 22) + activity);
            c03217y.A03(0);
            A02.A07().A9M(A01(208, 8, 114), C03207x.A03, c03217y);
        }
        map.put(activity, 4);
        if (activity.getClass() != this.A00) {
            List<Runnable> list = A07;
            synchronized (list) {
                arrayList = new ArrayList(list);
                list.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                LP.A01.A01().removeCallbacks((Runnable) it.next());
            }
        }
        A05.A01();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        A08.put(activity, 3);
        A05.A02();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        A08.put(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        A08.put(activity, 5);
    }
}
