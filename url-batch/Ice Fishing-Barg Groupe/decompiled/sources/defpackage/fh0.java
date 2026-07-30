package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fh0 implements Handler.Callback {
    public static fh0 XL4ISE6Oc65B;
    public final AtomicInteger OPXfSBeufaJ8;
    public long PxuCJdSBwIXG;
    public final cr1 RAsUl2FVSrh6;
    public ee2 TSizfFm2Yiuu;
    public ow2 Y1f8riQaR6yg;
    public final bh0 a92UlCVFR9N8;
    public final sw2 cpQdD2nAriOS;
    public final ma dgRBjINgWbAK;
    public final Context e9gEMXR7LXtO;
    public boolean lS5Rgt96tfkO;
    public volatile boolean r3s1LDPKFs1S;
    public final AtomicInteger rtx2ld2ELZv4;
    public final ConcurrentHashMap wdg6QnbFHrFF;
    public final ma x50lh2ztY7Y5;
    public static final Status QrzZRwfaDlRX = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status gPXPFXrUH4XX = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object BRwzKIf41E4i = new Object();

    public fh0(Context context, Looper looper) {
        bh0 bh0Var = bh0.Y1f8riQaR6yg;
        this.PxuCJdSBwIXG = 10000L;
        this.lS5Rgt96tfkO = false;
        this.rtx2ld2ELZv4 = new AtomicInteger(1);
        this.OPXfSBeufaJ8 = new AtomicInteger(0);
        this.wdg6QnbFHrFF = new ConcurrentHashMap(5, 0.75f, 1);
        this.dgRBjINgWbAK = new ma(0);
        this.x50lh2ztY7Y5 = new ma(0);
        this.r3s1LDPKFs1S = true;
        this.e9gEMXR7LXtO = context;
        sw2 sw2Var = new sw2(looper, this);
        Looper.getMainLooper();
        this.cpQdD2nAriOS = sw2Var;
        this.a92UlCVFR9N8 = bh0Var;
        this.RAsUl2FVSrh6 = new cr1(15);
        PackageManager packageManager = context.getPackageManager();
        if (fx1.BRwzKIf41E4i == null) {
            fx1.BRwzKIf41E4i = Boolean.valueOf(Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (fx1.BRwzKIf41E4i.booleanValue()) {
            this.r3s1LDPKFs1S = false;
        }
        sw2Var.sendMessage(sw2Var.obtainMessage(6));
    }

    public static fh0 Y1f8riQaR6yg(Context context) {
        fh0 fh0Var;
        HandlerThread handlerThread;
        synchronized (BRwzKIf41E4i) {
            if (XL4ISE6Oc65B == null) {
                synchronized (vx2.RAsUl2FVSrh6) {
                    try {
                        handlerThread = vx2.OPXfSBeufaJ8;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            vx2.OPXfSBeufaJ8 = handlerThread2;
                            handlerThread2.start();
                            handlerThread = vx2.OPXfSBeufaJ8;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = bh0.TSizfFm2Yiuu;
                XL4ISE6Oc65B = new fh0(applicationContext, looper);
            }
            fh0Var = XL4ISE6Oc65B;
        }
        return fh0Var;
    }

    public static Status lS5Rgt96tfkO(j9 j9Var, xq xqVar) {
        return new Status(17, "API: " + ((String) j9Var.lS5Rgt96tfkO.wdg6QnbFHrFF) + " is not available on this device. Connection failed with: " + String.valueOf(xqVar), xqVar.wdg6QnbFHrFF, xqVar);
    }

    public final boolean PxuCJdSBwIXG(xq xqVar, int i) {
        boolean booleanValue;
        boolean isInstantApp;
        PendingIntent activity;
        Boolean bool;
        bh0 bh0Var = this.a92UlCVFR9N8;
        Context context = this.e9gEMXR7LXtO;
        bh0Var.getClass();
        synchronized (hq0.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = hq0.PxuCJdSBwIXG;
            if (context2 != null && (bool = hq0.lS5Rgt96tfkO) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            }
            hq0.lS5Rgt96tfkO = null;
            if (Build.VERSION.SDK_INT >= 26) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                hq0.lS5Rgt96tfkO = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    hq0.lS5Rgt96tfkO = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    hq0.lS5Rgt96tfkO = Boolean.FALSE;
                }
            }
            hq0.PxuCJdSBwIXG = applicationContext;
            booleanValue = hq0.lS5Rgt96tfkO.booleanValue();
        }
        if (!booleanValue) {
            int i2 = xqVar.OPXfSBeufaJ8;
            if (i2 == 0 || (activity = xqVar.wdg6QnbFHrFF) == null) {
                Intent PxuCJdSBwIXG = bh0Var.PxuCJdSBwIXG(context, i2, null);
                activity = PxuCJdSBwIXG != null ? PendingIntent.getActivity(context, 0, PxuCJdSBwIXG, 201326592) : null;
            }
            if (activity != null) {
                int i3 = xqVar.OPXfSBeufaJ8;
                int i4 = GoogleApiActivity.OPXfSBeufaJ8;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                bh0Var.a92UlCVFR9N8(context, i3, PendingIntent.getActivity(context, 0, intent, pw2.PxuCJdSBwIXG | 134217728));
                return true;
            }
        }
        return false;
    }

    public final uv2 TSizfFm2Yiuu(ow2 ow2Var) {
        j9 j9Var = ow2Var.e9gEMXR7LXtO;
        ConcurrentHashMap concurrentHashMap = this.wdg6QnbFHrFF;
        uv2 uv2Var = (uv2) concurrentHashMap.get(j9Var);
        if (uv2Var == null) {
            uv2Var = new uv2(this, ow2Var);
            concurrentHashMap.put(j9Var, uv2Var);
        }
        if (uv2Var.Y1f8riQaR6yg.wdg6QnbFHrFF()) {
            this.x50lh2ztY7Y5.add(j9Var);
        }
        uv2Var.cpQdD2nAriOS();
        return uv2Var;
    }

    public final void e9gEMXR7LXtO(xq xqVar, int i) {
        if (PxuCJdSBwIXG(xqVar, i)) {
            return;
        }
        sw2 sw2Var = this.cpQdD2nAriOS;
        sw2Var.sendMessage(sw2Var.obtainMessage(5, i, 0, xqVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b2, code lost:
    
        if (r0 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x011a, code lost:
    
        if (r0 != 0) goto L84;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        uv2 uv2Var;
        t70[] lS5Rgt96tfkO;
        jx1 jx1Var;
        jx1 jx1Var2;
        int i = message.what;
        int i2 = 0;
        switch (i) {
            case 1:
                this.PxuCJdSBwIXG = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.cpQdD2nAriOS.removeMessages(12);
                for (j9 j9Var : this.wdg6QnbFHrFF.keySet()) {
                    sw2 sw2Var = this.cpQdD2nAriOS;
                    sw2Var.sendMessageDelayed(sw2Var.obtainMessage(12, j9Var), this.PxuCJdSBwIXG);
                }
                return true;
            case 2:
                throw o0.RAsUl2FVSrh6(message.obj);
            case 3:
                for (uv2 uv2Var2 : this.wdg6QnbFHrFF.values()) {
                    jh0.wdg6QnbFHrFF(uv2Var2.r3s1LDPKFs1S.cpQdD2nAriOS);
                    uv2Var2.cpQdD2nAriOS = null;
                    uv2Var2.cpQdD2nAriOS();
                }
                return true;
            case 4:
            case 8:
            case 13:
                dw2 dw2Var = (dw2) message.obj;
                uv2 uv2Var3 = (uv2) this.wdg6QnbFHrFF.get(dw2Var.TSizfFm2Yiuu.e9gEMXR7LXtO);
                if (uv2Var3 == null) {
                    uv2Var3 = TSizfFm2Yiuu(dw2Var.TSizfFm2Yiuu);
                }
                if (!uv2Var3.Y1f8riQaR6yg.wdg6QnbFHrFF() || this.OPXfSBeufaJ8.get() == dw2Var.lS5Rgt96tfkO) {
                    uv2Var3.r3s1LDPKFs1S(dw2Var.PxuCJdSBwIXG);
                    return true;
                }
                dw2Var.PxuCJdSBwIXG.TSizfFm2Yiuu(QrzZRwfaDlRX);
                uv2Var3.BRwzKIf41E4i();
                return true;
            case 5:
                int i3 = message.arg1;
                xq xqVar = (xq) message.obj;
                Iterator it = this.wdg6QnbFHrFF.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        uv2Var = (uv2) it.next();
                        if (uv2Var.OPXfSBeufaJ8 == i3) {
                        }
                    } else {
                        uv2Var = null;
                    }
                }
                if (uv2Var == null) {
                    Log.wtf("GoogleApiManager", o0.OPXfSBeufaJ8(i3, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                    return true;
                }
                int i4 = xqVar.OPXfSBeufaJ8;
                if (i4 != 13) {
                    uv2Var.e9gEMXR7LXtO(lS5Rgt96tfkO(uv2Var.e9gEMXR7LXtO, xqVar));
                    return true;
                }
                this.a92UlCVFR9N8.getClass();
                int i5 = hh0.TSizfFm2Yiuu;
                uv2Var.e9gEMXR7LXtO(new Status(17, "Error resolution was canceled by the user, original error message: " + xq.PxuCJdSBwIXG(i4) + ": " + xqVar.dgRBjINgWbAK, null, null));
                return true;
            case 6:
                if (this.e9gEMXR7LXtO.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.e9gEMXR7LXtO.getApplicationContext();
                    jc jcVar = jc.x50lh2ztY7Y5;
                    synchronized (jcVar) {
                        try {
                            if (!jcVar.dgRBjINgWbAK) {
                                application.registerActivityLifecycleCallbacks(jcVar);
                                application.registerComponentCallbacks(jcVar);
                                jcVar.dgRBjINgWbAK = true;
                            }
                        } finally {
                        }
                    }
                    tv2 tv2Var = new tv2(this);
                    synchronized (jcVar) {
                        jcVar.wdg6QnbFHrFF.add(tv2Var);
                    }
                    AtomicBoolean atomicBoolean = jcVar.rtx2ld2ELZv4;
                    AtomicBoolean atomicBoolean2 = jcVar.OPXfSBeufaJ8;
                    if (!atomicBoolean2.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean.set(true);
                        }
                    }
                    if (!atomicBoolean.get()) {
                        this.PxuCJdSBwIXG = 300000L;
                        return true;
                    }
                }
                return true;
            case 7:
                TSizfFm2Yiuu((ow2) message.obj);
                return true;
            case 9:
                if (this.wdg6QnbFHrFF.containsKey(message.obj)) {
                    uv2 uv2Var4 = (uv2) this.wdg6QnbFHrFF.get(message.obj);
                    jh0.wdg6QnbFHrFF(uv2Var4.r3s1LDPKFs1S.cpQdD2nAriOS);
                    if (uv2Var4.dgRBjINgWbAK) {
                        uv2Var4.cpQdD2nAriOS();
                        return true;
                    }
                }
                return true;
            case 10:
                ma maVar = this.x50lh2ztY7Y5;
                maVar.getClass();
                ga gaVar = new ga(maVar);
                while (gaVar.hasNext()) {
                    uv2 uv2Var5 = (uv2) this.wdg6QnbFHrFF.remove((j9) gaVar.next());
                    if (uv2Var5 != null) {
                        uv2Var5.BRwzKIf41E4i();
                    }
                }
                this.x50lh2ztY7Y5.clear();
                return true;
            case 11:
                if (this.wdg6QnbFHrFF.containsKey(message.obj)) {
                    uv2 uv2Var6 = (uv2) this.wdg6QnbFHrFF.get(message.obj);
                    fh0 fh0Var = uv2Var6.r3s1LDPKFs1S;
                    jh0.wdg6QnbFHrFF(fh0Var.cpQdD2nAriOS);
                    boolean z = uv2Var6.dgRBjINgWbAK;
                    if (z) {
                        j9 j9Var2 = uv2Var6.e9gEMXR7LXtO;
                        sw2 sw2Var2 = uv2Var6.r3s1LDPKFs1S.cpQdD2nAriOS;
                        if (z) {
                            sw2Var2.removeMessages(11, j9Var2);
                            sw2Var2.removeMessages(9, j9Var2);
                            uv2Var6.dgRBjINgWbAK = false;
                        }
                        uv2Var6.e9gEMXR7LXtO(fh0Var.a92UlCVFR9N8.lS5Rgt96tfkO(fh0Var.e9gEMXR7LXtO, ch0.PxuCJdSBwIXG) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        uv2Var6.Y1f8riQaR6yg.TSizfFm2Yiuu("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (this.wdg6QnbFHrFF.containsKey(message.obj)) {
                    uv2 uv2Var7 = (uv2) this.wdg6QnbFHrFF.get(message.obj);
                    jh0.wdg6QnbFHrFF(uv2Var7.r3s1LDPKFs1S.cpQdD2nAriOS);
                    y8 y8Var = uv2Var7.Y1f8riQaR6yg;
                    if (y8Var.PxuCJdSBwIXG() && uv2Var7.rtx2ld2ELZv4.isEmpty()) {
                        cr1 cr1Var = uv2Var7.a92UlCVFR9N8;
                        if (((Map) cr1Var.OPXfSBeufaJ8).isEmpty() && ((Map) cr1Var.wdg6QnbFHrFF).isEmpty()) {
                            y8Var.TSizfFm2Yiuu("Timing out service connection.");
                            return true;
                        }
                        uv2Var7.wdg6QnbFHrFF();
                    }
                    return true;
                }
                return true;
            case 14:
                throw o0.RAsUl2FVSrh6(message.obj);
            case 15:
                vv2 vv2Var = (vv2) message.obj;
                if (this.wdg6QnbFHrFF.containsKey(vv2Var.PxuCJdSBwIXG)) {
                    uv2 uv2Var8 = (uv2) this.wdg6QnbFHrFF.get(vv2Var.PxuCJdSBwIXG);
                    if (uv2Var8.x50lh2ztY7Y5.contains(vv2Var) && !uv2Var8.dgRBjINgWbAK) {
                        if (uv2Var8.Y1f8riQaR6yg.PxuCJdSBwIXG()) {
                            uv2Var8.RAsUl2FVSrh6();
                            return true;
                        }
                        uv2Var8.cpQdD2nAriOS();
                        return true;
                    }
                }
                return true;
            case 16:
                vv2 vv2Var2 = (vv2) message.obj;
                if (this.wdg6QnbFHrFF.containsKey(vv2Var2.PxuCJdSBwIXG)) {
                    uv2 uv2Var9 = (uv2) this.wdg6QnbFHrFF.get(vv2Var2.PxuCJdSBwIXG);
                    ArrayList arrayList = uv2Var9.x50lh2ztY7Y5;
                    fh0 fh0Var2 = uv2Var9.r3s1LDPKFs1S;
                    LinkedList<bw2> linkedList = uv2Var9.TSizfFm2Yiuu;
                    if (arrayList.remove(vv2Var2)) {
                        fh0Var2.cpQdD2nAriOS.removeMessages(15, vv2Var2);
                        fh0Var2.cpQdD2nAriOS.removeMessages(16, vv2Var2);
                        t70 t70Var = vv2Var2.lS5Rgt96tfkO;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (bw2 bw2Var : linkedList) {
                            if (bw2Var != null && (lS5Rgt96tfkO = bw2Var.lS5Rgt96tfkO(uv2Var9)) != null) {
                                int length = lS5Rgt96tfkO.length;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= length) {
                                        break;
                                    }
                                    if (!ni0.BRwzKIf41E4i(lS5Rgt96tfkO[i6], t70Var)) {
                                        i6++;
                                    } else if (i6 >= 0) {
                                        arrayList2.add(bw2Var);
                                    }
                                }
                            }
                        }
                        int size = arrayList2.size();
                        while (i2 < size) {
                            bw2 bw2Var2 = (bw2) arrayList2.get(i2);
                            linkedList.remove(bw2Var2);
                            bw2Var2.Y1f8riQaR6yg(new yo2(t70Var));
                            i2++;
                        }
                    }
                }
                return true;
            case 17:
                ee2 ee2Var = this.TSizfFm2Yiuu;
                if (ee2Var != null) {
                    if (ee2Var.rtx2ld2ELZv4 <= 0) {
                        if (!this.lS5Rgt96tfkO) {
                            synchronized (jx1.class) {
                                try {
                                    if (jx1.OPXfSBeufaJ8 == null) {
                                        jx1.OPXfSBeufaJ8 = new jx1(i2);
                                    }
                                    jx1Var = jx1.OPXfSBeufaJ8;
                                } finally {
                                }
                            }
                            jx1Var.getClass();
                            int i7 = ((SparseIntArray) this.RAsUl2FVSrh6.OPXfSBeufaJ8).get(203400000, -1);
                            if (i7 != -1) {
                            }
                        }
                        this.TSizfFm2Yiuu = null;
                        return true;
                    }
                    if (this.Y1f8riQaR6yg == null) {
                        this.Y1f8riQaR6yg = new ow2(this.e9gEMXR7LXtO, fe2.lS5Rgt96tfkO);
                    }
                    this.Y1f8riQaR6yg.lS5Rgt96tfkO(ee2Var);
                    this.TSizfFm2Yiuu = null;
                    return true;
                }
                return true;
            case 18:
                ((cw2) message.obj).getClass();
                if (0 == 0) {
                    ee2 ee2Var2 = new ee2(0, Arrays.asList(null));
                    if (this.Y1f8riQaR6yg == null) {
                        this.Y1f8riQaR6yg = new ow2(this.e9gEMXR7LXtO, fe2.lS5Rgt96tfkO);
                    }
                    this.Y1f8riQaR6yg.lS5Rgt96tfkO(ee2Var2);
                    return true;
                }
                ee2 ee2Var3 = this.TSizfFm2Yiuu;
                if (ee2Var3 != null) {
                    List list = ee2Var3.OPXfSBeufaJ8;
                    if (ee2Var3.rtx2ld2ELZv4 != 0 || (list != null && list.size() >= 0)) {
                        this.cpQdD2nAriOS.removeMessages(17);
                        ee2 ee2Var4 = this.TSizfFm2Yiuu;
                        if (ee2Var4 != null) {
                            if (ee2Var4.rtx2ld2ELZv4 <= 0) {
                                if (!this.lS5Rgt96tfkO) {
                                    synchronized (jx1.class) {
                                        try {
                                            if (jx1.OPXfSBeufaJ8 == null) {
                                                jx1.OPXfSBeufaJ8 = new jx1(i2);
                                            }
                                            jx1Var2 = jx1.OPXfSBeufaJ8;
                                        } finally {
                                        }
                                    }
                                    jx1Var2.getClass();
                                    int i8 = ((SparseIntArray) this.RAsUl2FVSrh6.OPXfSBeufaJ8).get(203400000, -1);
                                    if (i8 != -1) {
                                    }
                                }
                                this.TSizfFm2Yiuu = null;
                            }
                            if (this.Y1f8riQaR6yg == null) {
                                this.Y1f8riQaR6yg = new ow2(this.e9gEMXR7LXtO, fe2.lS5Rgt96tfkO);
                            }
                            this.Y1f8riQaR6yg.lS5Rgt96tfkO(ee2Var4);
                            this.TSizfFm2Yiuu = null;
                        }
                    } else {
                        ee2 ee2Var5 = this.TSizfFm2Yiuu;
                        if (ee2Var5.OPXfSBeufaJ8 == null) {
                            ee2Var5.OPXfSBeufaJ8 = new ArrayList();
                        }
                        ee2Var5.OPXfSBeufaJ8.add(null);
                    }
                }
                if (this.TSizfFm2Yiuu == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(null);
                    this.TSizfFm2Yiuu = new ee2(0, arrayList3);
                    sw2 sw2Var3 = this.cpQdD2nAriOS;
                    sw2Var3.sendMessageDelayed(sw2Var3.obtainMessage(17), 0L);
                    return true;
                }
                return true;
            case 19:
                this.lS5Rgt96tfkO = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i);
                return false;
        }
    }
}
