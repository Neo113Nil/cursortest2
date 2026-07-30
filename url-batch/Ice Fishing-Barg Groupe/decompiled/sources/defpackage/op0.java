package defpackage;

import android.content.ClipDescription;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputMethodManager;
import com.ice.fishing.grenza.R;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.SoftReference;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class op0 implements gy1, d50, kq0, jb2, di, oh1 {
    public Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public Object wdg6QnbFHrFF;

    public op0(int i) {
        this.rtx2ld2ELZv4 = i;
        switch (i) {
            case 13:
                this.OPXfSBeufaJ8 = new aq2(0);
                this.wdg6QnbFHrFF = new aq2(0);
                break;
            case 24:
                this.OPXfSBeufaJ8 = new v81();
                this.wdg6QnbFHrFF = new v81();
                break;
            default:
                if (Build.VERSION.SDK_INT < 26) {
                    this.OPXfSBeufaJ8 = new OYiFbU3x63rc(this);
                    break;
                } else {
                    this.OPXfSBeufaJ8 = new IxJ9cAW40yOk(this);
                    break;
                }
        }
    }

    public j51 BRwzKIf41E4i() {
        return (j51) ((mj1) this.wdg6QnbFHrFF).getValue();
    }

    public void EcgxDIVH5in8(int i) {
        Object uv1Var;
        bi biVar = (bi) this.wdg6QnbFHrFF;
        eq0 eq0Var = (eq0) this.OPXfSBeufaJ8;
        String str = "";
        if (i == 0) {
            try {
                uv1Var = ((Bundle) eq0Var.PxuCJdSBwIXG().OPXfSBeufaJ8).getString("install_referrer");
                if (uv1Var == null) {
                    uv1Var = "";
                }
            } catch (Throwable th) {
                uv1Var = new uv1(th);
            }
            Throwable PxuCJdSBwIXG = vv1.PxuCJdSBwIXG(uv1Var);
            if (PxuCJdSBwIXG != null) {
                if (PxuCJdSBwIXG instanceof CancellationException) {
                    biVar.QrzZRwfaDlRX(PxuCJdSBwIXG);
                    return;
                }
                bs0.gPXPFXrUH4XX(eq0Var);
                if (biVar.S2OOm9zPNm0h() instanceof be1) {
                    biVar.RAsUl2FVSrh6("");
                    return;
                }
                return;
            }
            str = (String) uv1Var;
        }
        bs0.gPXPFXrUH4XX(eq0Var);
        if (biVar.S2OOm9zPNm0h() instanceof be1) {
            biVar.RAsUl2FVSrh6(str);
        }
    }

    @Override // defpackage.jb2
    public boolean OPXfSBeufaJ8(Object obj, Object obj2) {
        cy0 cy0Var = (cy0) this.OPXfSBeufaJ8;
        return cs0.wdg6QnbFHrFF(cy0Var.lS5Rgt96tfkO(obj), cy0Var.lS5Rgt96tfkO(obj2));
    }

    @Override // defpackage.d50
    public Object PxuCJdSBwIXG() {
        return (so2) this.OPXfSBeufaJ8;
    }

    public Object QrzZRwfaDlRX(eu0 eu0Var, ArrayList arrayList) {
        Object obj;
        Object uv1Var;
        Object uv1Var2;
        Object putIfAbsent;
        int i = 0;
        switch (this.rtx2ld2ELZv4) {
            case 7:
                obj = ((ek) this.wdg6QnbFHrFF).get(kj0.e6tOsSdd2EFb(eu0Var));
                obj.getClass();
                c91 c91Var = (c91) obj;
                Object obj2 = c91Var.PxuCJdSBwIXG.get();
                if (obj2 == null) {
                    synchronized (c91Var) {
                        obj2 = c91Var.PxuCJdSBwIXG.get();
                        if (obj2 == null) {
                            obj2 = new dj1();
                            c91Var.PxuCJdSBwIXG = new SoftReference(obj2);
                        }
                    }
                }
                dj1 dj1Var = (dj1) obj2;
                ArrayList arrayList2 = new ArrayList(al.KZw9XyiywG4x(arrayList, 10));
                int size = arrayList.size();
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    arrayList2.add(new mu0((ju0) obj3));
                }
                ConcurrentHashMap concurrentHashMap = dj1Var.PxuCJdSBwIXG;
                Object obj4 = concurrentHashMap.get(arrayList2);
                if (obj4 == null) {
                    try {
                        uv1Var = (KSerializer) ((pe0) this.OPXfSBeufaJ8).rtx2ld2ELZv4(eu0Var, arrayList);
                    } catch (Throwable th) {
                        uv1Var = new uv1(th);
                    }
                    vv1 vv1Var = new vv1(uv1Var);
                    Object putIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList2, vv1Var);
                    obj4 = putIfAbsent2 == null ? vv1Var : putIfAbsent2;
                }
                return ((vv1) obj4).rtx2ld2ELZv4;
            default:
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.wdg6QnbFHrFF;
                Class e6tOsSdd2EFb = kj0.e6tOsSdd2EFb(eu0Var);
                Object obj5 = concurrentHashMap2.get(e6tOsSdd2EFb);
                if (obj5 == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(e6tOsSdd2EFb, (obj5 = new dj1()))) != null) {
                    obj5 = putIfAbsent;
                }
                dj1 dj1Var2 = (dj1) obj5;
                ArrayList arrayList3 = new ArrayList(al.KZw9XyiywG4x(arrayList, 10));
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj6 = arrayList.get(i);
                    i++;
                    arrayList3.add(new mu0((ju0) obj6));
                }
                ConcurrentHashMap concurrentHashMap3 = dj1Var2.PxuCJdSBwIXG;
                Object obj7 = concurrentHashMap3.get(arrayList3);
                if (obj7 == null) {
                    try {
                        uv1Var2 = (KSerializer) ((pe0) this.OPXfSBeufaJ8).rtx2ld2ELZv4(eu0Var, arrayList);
                    } catch (Throwable th2) {
                        uv1Var2 = new uv1(th2);
                    }
                    vv1 vv1Var2 = new vv1(uv1Var2);
                    Object putIfAbsent3 = concurrentHashMap3.putIfAbsent(arrayList3, vv1Var2);
                    obj7 = putIfAbsent3 == null ? vv1Var2 : putIfAbsent3;
                }
                return ((vv1) obj7).rtx2ld2ELZv4;
        }
    }

    @Override // defpackage.oh1
    public boolean RAsUl2FVSrh6() {
        return ((oh1) this.OPXfSBeufaJ8).RAsUl2FVSrh6();
    }

    public AutofillId RfyTYNmI9Srp(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession e9gEMXR7LXtO = s0.e9gEMXR7LXtO(this.wdg6QnbFHrFF);
        HqMwxkFaipxD RfyTYNmI9Srp = ng0.RfyTYNmI9Srp((View) this.OPXfSBeufaJ8);
        Objects.requireNonNull(RfyTYNmI9Srp);
        return yr.lS5Rgt96tfkO(e9gEMXR7LXtO, Nlhe969cAGO8.e9gEMXR7LXtO(RfyTYNmI9Srp.PxuCJdSBwIXG), j);
    }

    public void S9EYkSpbGuxq(gc0 gc0Var) {
        dv1 dv1Var = (dv1) this.wdg6QnbFHrFF;
        ib0 ib0Var = (ib0) this.OPXfSBeufaJ8;
        int i = gc0Var.lS5Rgt96tfkO;
        int i2 = 0;
        if (i == 0) {
            dv1Var.execute(new sh(i2, ib0Var, gc0Var.PxuCJdSBwIXG));
        } else {
            dv1Var.execute(new th(i, i2, ib0Var));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #3 {all -> 0x00b7, blocks: (B:49:0x00b6, B:50:0x00b9, B:51:0x00d1), top: B:47:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9 A[Catch: all -> 0x00b7, TryCatch #3 {all -> 0x00b7, blocks: (B:49:0x00b6, B:50:0x00b9, B:51:0x00d1), top: B:47:0x00b4 }] */
    @Override // defpackage.gy1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fy1 TSizfFm2Yiuu(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        str.getClass();
        bx1 bx1Var = (bx1) this.wdg6QnbFHrFF;
        if (!str.equals(":memory:")) {
            str = bx1Var.TSizfFm2Yiuu.PxuCJdSBwIXG.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z = true;
        g70 g70Var = new g70(str, (bx1Var.PxuCJdSBwIXG || bx1Var.lS5Rgt96tfkO || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = g70Var.PxuCJdSBwIXG;
        reentrantLock.lock();
        op0 op0Var = g70Var.lS5Rgt96tfkO;
        if (op0Var != null) {
            try {
                op0Var.XL4ISE6Oc65B();
            } catch (Throwable th) {
                th = th;
                z = false;
                try {
                    if (!z) {
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        try {
            try {
                if (bx1Var.lS5Rgt96tfkO) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                fy1 TSizfFm2Yiuu = ((gy1) this.OPXfSBeufaJ8).TSizfFm2Yiuu(str);
                if (bx1Var.PxuCJdSBwIXG) {
                    qc.lS5Rgt96tfkO(TSizfFm2Yiuu);
                    if (bx1Var.TSizfFm2Yiuu.a92UlCVFR9N8 == dx1.OPXfSBeufaJ8) {
                        sj0.S9EYkSpbGuxq(TSizfFm2Yiuu, "PRAGMA synchronous = NORMAL");
                    } else {
                        sj0.S9EYkSpbGuxq(TSizfFm2Yiuu, "PRAGMA synchronous = FULL");
                    }
                    bx1Var.Y1f8riQaR6yg.Y1f8riQaR6yg(TSizfFm2Yiuu);
                } else {
                    try {
                        bx1Var.lS5Rgt96tfkO = true;
                        qc.PxuCJdSBwIXG(bx1Var, TSizfFm2Yiuu);
                        bx1Var.lS5Rgt96tfkO = false;
                    } catch (Throwable th2) {
                        bx1Var.lS5Rgt96tfkO = false;
                        throw th2;
                    }
                }
                if (op0Var != null && (fileChannel2 = (FileChannel) op0Var.wdg6QnbFHrFF) != null) {
                    try {
                        fileChannel2.close();
                        op0Var.wdg6QnbFHrFF = null;
                    } finally {
                    }
                }
                return TSizfFm2Yiuu;
            } catch (Throwable th3) {
                th = th3;
                if (!z) {
                    throw th;
                }
                throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
            }
        } catch (Throwable th4) {
            if (op0Var != null && (fileChannel = (FileChannel) op0Var.wdg6QnbFHrFF) != null) {
                try {
                    fileChannel.close();
                    op0Var.wdg6QnbFHrFF = null;
                } finally {
                }
            }
            throw th4;
        }
    }

    public void VhhvGxCb8gfr() {
        synchronized (this) {
            ((AtomicInteger) this.OPXfSBeufaJ8).decrementAndGet();
            if (((AtomicInteger) this.OPXfSBeufaJ8).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public void XL4ISE6Oc65B() {
        String str = (String) this.OPXfSBeufaJ8;
        if (((FileChannel) this.wdg6QnbFHrFF) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.wdg6QnbFHrFF = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.wdg6QnbFHrFF;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.wdg6QnbFHrFF = null;
            throw new IllegalStateException(o0.x50lh2ztY7Y5("Unable to lock file: '", str, "'."), th);
        }
    }

    @Override // defpackage.oh1
    public List Y1f8riQaR6yg(Integer num) {
        List Y1f8riQaR6yg = ((oh1) this.OPXfSBeufaJ8).Y1f8riQaR6yg(null);
        e72 e72Var = (e72) this.wdg6QnbFHrFF;
        int i = e72Var.VhhvGxCb8gfr;
        return i < 0 ? Y1f8riQaR6yg : zk.wcHq2YQJmeHg(b51.Pf0ThKz3j5YS(e72Var, num, i, Integer.valueOf(e72Var.rZjpSjn4zoMv(e72Var.lS5Rgt96tfkO, i))), Y1f8riQaR6yg);
    }

    @Override // defpackage.gy1
    public boolean a92UlCVFR9N8() {
        return ((gy1) this.OPXfSBeufaJ8).a92UlCVFR9N8();
    }

    @Override // defpackage.di
    public void cancel() {
        if (((bb) this.wdg6QnbFHrFF).compareAndSet(1, 1)) {
            return;
        }
        ((vb) this.OPXfSBeufaJ8).PxuCJdSBwIXG();
    }

    /* JADX WARN: Code restructure failed: missing block: B:395:0x0884, code lost:
    
        if (r5 == false) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012a, code lost:
    
        if (defpackage.d32.wdg6QnbFHrFF(4, r5).isEmpty() != false) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0866 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x09a0  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0a31 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0a41  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0a45  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0a6d  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0a77  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0aba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0aca  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0ace  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0af6  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0b00  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0b26  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0b39  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0b4c  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0c91  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0ca2  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0cc0  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0cd5  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0cb6  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0c95  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0b3d  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0cdc  */
    /* JADX WARN: Type inference failed for: r2v103, types: [p50] */
    /* JADX WARN: Type inference failed for: r2v104, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v105, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public twy4zb2fCtqq cpQdD2nAriOS(int i) {
        AccessibilityManager accessibilityManager;
        s82 s82Var;
        int size;
        int i2;
        int i3;
        v8 gGoUzNp9JO5I;
        x1 x1Var;
        r1 r1Var;
        a81 a81Var;
        d32 d32Var;
        z22 z22Var;
        ww1 ww1Var;
        vw0 vw0Var;
        AccessibilityNodeInfo accessibilityNodeInfo;
        twy4zb2fCtqq twy4zb2fctqq;
        v81 v81Var;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        k32 k32Var;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        d32 d32Var2;
        Object RAsUl2FVSrh6;
        ek2 ek2Var;
        Object RAsUl2FVSrh62;
        Boolean bool;
        ww1 ww1Var2;
        int i4;
        z22 z22Var2;
        Object RAsUl2FVSrh63;
        Object RAsUl2FVSrh64;
        String str;
        Object RAsUl2FVSrh65;
        twy4zb2fCtqq twy4zb2fctqq2;
        Object RAsUl2FVSrh66;
        int i5;
        Object RAsUl2FVSrh67;
        Object RAsUl2FVSrh68;
        x1 x1Var2;
        boolean z;
        d32 d32Var3;
        boolean z2;
        Object RAsUl2FVSrh69;
        nxJAScVArhE9 nxjascvarhe9;
        nxJAScVArhE9 nxjascvarhe92;
        nxJAScVArhE9 nxjascvarhe93;
        String x50lh2ztY7Y5;
        xq1 xq1Var;
        Object RAsUl2FVSrh610;
        wk wkVar;
        h02 h02Var;
        h02 h02Var2;
        int i6;
        int Y1f8riQaR6yg;
        r1 r1Var2;
        int Y1f8riQaR6yg2;
        String str2;
        Object RAsUl2FVSrh611;
        Object RAsUl2FVSrh612;
        vw0 vw0Var2;
        List list;
        vw0 S9EYkSpbGuxq;
        boolean z3;
        boolean z4;
        ArrayList arrayList;
        ArrayList arrayList2;
        xc0 xc0Var;
        int i7;
        int i8;
        boolean z5;
        d32 d32Var4;
        int i9;
        x1 x1Var3 = (x1) this.wdg6QnbFHrFF;
        AccessibilityManager accessibilityManager2 = x1Var3.r3s1LDPKFs1S;
        r1 r1Var3 = x1Var3.dgRBjINgWbAK;
        if (r1Var3.getComposeViewContext().TSizfFm2Yiuu.rtx2ld2ELZv4().rtx2ld2ELZv4 == f01.rtx2ld2ELZv4) {
            if (!accessibilityManager2.isEnabled()) {
                twy4zb2fctqq2 = new twy4zb2fCtqq(AccessibilityNodeInfo.obtain());
                x1Var2 = x1Var3;
                i5 = i;
                if (x1Var2.VhhvGxCb8gfr) {
                    if (i5 == x1Var2.XL4ISE6Oc65B) {
                        x1Var2.EcgxDIVH5in8 = twy4zb2fctqq2;
                    }
                    if (i5 == x1Var2.RfyTYNmI9Srp) {
                        x1Var2.S9EYkSpbGuxq = twy4zb2fctqq2;
                    }
                }
                return twy4zb2fctqq2;
            }
            twy4zb2fctqq2 = null;
            x1Var2 = x1Var3;
            i5 = i;
            if (x1Var2.VhhvGxCb8gfr) {
            }
            return twy4zb2fctqq2;
        }
        f32 f32Var = (f32) x1Var3.dgRBjINgWbAK().lS5Rgt96tfkO(i);
        if (f32Var == null) {
            if (!accessibilityManager2.isEnabled()) {
                twy4zb2fctqq2 = new twy4zb2fCtqq(AccessibilityNodeInfo.obtain());
                x1Var2 = x1Var3;
                i5 = i;
                if (x1Var2.VhhvGxCb8gfr) {
                }
                return twy4zb2fctqq2;
            }
            twy4zb2fctqq2 = null;
            x1Var2 = x1Var3;
            i5 = i;
            if (x1Var2.VhhvGxCb8gfr) {
            }
            return twy4zb2fctqq2;
        }
        d32 d32Var5 = f32Var.PxuCJdSBwIXG;
        z22 dgRBjINgWbAK = d32Var5.dgRBjINgWbAK();
        vw0 vw0Var3 = d32Var5.TSizfFm2Yiuu;
        Object RAsUl2FVSrh613 = dgRBjINgWbAK.rtx2ld2ELZv4.RAsUl2FVSrh6(h32.QrzZRwfaDlRX);
        if (RAsUl2FVSrh613 == null) {
            RAsUl2FVSrh613 = null;
        }
        boolean wdg6QnbFHrFF = cs0.wdg6QnbFHrFF(RAsUl2FVSrh613, Boolean.TRUE);
        if (wdg6QnbFHrFF) {
            if (!(Build.VERSION.SDK_INT >= 34 ? ngxnMNrpiKat.e9gEMXR7LXtO(accessibilityManager2) : true)) {
                x1Var2 = x1Var3;
                i5 = i;
                twy4zb2fctqq2 = null;
                if (x1Var2.VhhvGxCb8gfr) {
                }
                return twy4zb2fctqq2;
            }
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        twy4zb2fCtqq twy4zb2fctqq3 = new twy4zb2fCtqq(obtain);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            ngxnMNrpiKat.RAsUl2FVSrh6(obtain, wdg6QnbFHrFF);
        } else {
            twy4zb2fctqq3.a92UlCVFR9N8(64, wdg6QnbFHrFF);
        }
        if (i == -1) {
            Object parentForAccessibility = r1Var3.getParentForAccessibility();
            View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
            twy4zb2fctqq3.lS5Rgt96tfkO = -1;
            obtain.setParent(view);
        } else {
            d32 x50lh2ztY7Y52 = d32Var5.x50lh2ztY7Y5();
            Integer valueOf = x50lh2ztY7Y52 != null ? Integer.valueOf(x50lh2ztY7Y52.a92UlCVFR9N8) : null;
            if (valueOf == null) {
                ep0.TSizfFm2Yiuu("semanticsNode " + i + " has null parent");
                u9.Y1f8riQaR6yg();
                return null;
            }
            int intValue = valueOf.intValue();
            if (intValue == r1Var3.getSemanticsOwner().PxuCJdSBwIXG().a92UlCVFR9N8) {
                intValue = -1;
            }
            twy4zb2fctqq3.lS5Rgt96tfkO = intValue;
            obtain.setParent(r1Var3, intValue);
        }
        twy4zb2fctqq3.TSizfFm2Yiuu = i;
        obtain.setSource(r1Var3, i);
        obtain.setBoundsInScreen(x1Var3.TSizfFm2Yiuu(f32Var));
        a81 a81Var2 = x1Var3.POWyO8hTM6YC;
        s82 s82Var2 = x1Var3.IAToe7bXGz4N;
        Resources resources = r1Var3.getContext().getResources();
        twy4zb2fctqq3.RAsUl2FVSrh6("android.view.View");
        z22 z22Var3 = d32Var5.Y1f8riQaR6yg;
        v81 v81Var2 = z22Var3.rtx2ld2ELZv4;
        if (v81Var2.TSizfFm2Yiuu(h32.ozEBbv0hFTAB)) {
            twy4zb2fctqq3.RAsUl2FVSrh6("android.widget.EditText");
        }
        if (v81Var2.TSizfFm2Yiuu(h32.aF05bpZJlKEP)) {
            twy4zb2fctqq3.RAsUl2FVSrh6("android.widget.TextView");
        }
        Object RAsUl2FVSrh614 = v81Var2.RAsUl2FVSrh6(h32.IAToe7bXGz4N);
        if (RAsUl2FVSrh614 == null) {
            RAsUl2FVSrh614 = null;
        }
        ww1 ww1Var3 = (ww1) RAsUl2FVSrh614;
        if (ww1Var3 != null) {
            int i11 = ww1Var3.PxuCJdSBwIXG;
            if (d32Var5.QrzZRwfaDlRX()) {
                accessibilityManager = accessibilityManager2;
                i9 = 4;
            } else {
                accessibilityManager = accessibilityManager2;
                i9 = 4;
            }
            ww1.Companion.getClass();
            s82Var = s82Var2;
            if (i11 == i9) {
                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
            } else if (i11 == 2) {
                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
            } else {
                String xbgXKYA2cIfu = ni0.xbgXKYA2cIfu(i11);
                if (i11 != 5 || d32Var5.BRwzKIf41E4i() || z22Var3.wdg6QnbFHrFF) {
                    twy4zb2fctqq3.RAsUl2FVSrh6(xbgXKYA2cIfu);
                }
            }
            obtain.setPackageName(r1Var3.getContext().getPackageName());
            obtain.setImportantForAccessibility(bs0.pnx5pC0XzaCw(d32Var5));
            boolean e9gEMXR7LXtO = i10 < 34 ? ngxnMNrpiKat.e9gEMXR7LXtO(accessibilityManager) : true;
            List wdg6QnbFHrFF2 = d32.wdg6QnbFHrFF(4, d32Var5);
            size = wdg6QnbFHrFF2.size();
            boolean z6 = e9gEMXR7LXtO;
            int i12 = 0;
            i2 = 0;
            while (i2 < size) {
                int i13 = size;
                d32 d32Var6 = (d32) wdg6QnbFHrFF2.get(i2);
                List list2 = wdg6QnbFHrFF2;
                tq0 dgRBjINgWbAK2 = x1Var3.dgRBjINgWbAK();
                int i14 = i2;
                int i15 = d32Var6.a92UlCVFR9N8;
                if (dgRBjINgWbAK2.PxuCJdSBwIXG(i15)) {
                    if (r1Var3.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(d32Var6.TSizfFm2Yiuu) != null) {
                        u9.VhhvGxCb8gfr();
                        return null;
                    }
                    if (i15 != -1) {
                        f32 f32Var2 = (f32) x1Var3.dgRBjINgWbAK().lS5Rgt96tfkO(i15);
                        if (f32Var2 == null || (d32Var4 = f32Var2.PxuCJdSBwIXG) == null) {
                            z5 = false;
                        } else {
                            Object RAsUl2FVSrh615 = d32Var4.dgRBjINgWbAK().rtx2ld2ELZv4.RAsUl2FVSrh6(h32.QrzZRwfaDlRX);
                            if (RAsUl2FVSrh615 == null) {
                                RAsUl2FVSrh615 = null;
                            }
                            z5 = cs0.wdg6QnbFHrFF(RAsUl2FVSrh615, Boolean.TRUE);
                        }
                        if (z6 || !z5) {
                            obtain.addChild(r1Var3, i15);
                        }
                        a81Var2.a92UlCVFR9N8(i15, i12);
                        i12++;
                    }
                }
                i2 = i14 + 1;
                wdg6QnbFHrFF2 = list2;
                size = i13;
            }
            i3 = x1Var3.XL4ISE6Oc65B;
            AccessibilityNodeInfo accessibilityNodeInfo4 = twy4zb2fctqq3.PxuCJdSBwIXG;
            if (i != i3) {
                accessibilityNodeInfo4.setAccessibilityFocused(true);
                twy4zb2fctqq3.PxuCJdSBwIXG(cJeY36nTk9tz.Y1f8riQaR6yg);
            } else {
                accessibilityNodeInfo4.setAccessibilityFocused(false);
                twy4zb2fctqq3.PxuCJdSBwIXG(cJeY36nTk9tz.TSizfFm2Yiuu);
            }
            gGoUzNp9JO5I = mm2.gGoUzNp9JO5I(d32Var5);
            if (gGoUzNp9JO5I == null) {
                r1Var3.getFontFamilyResolver();
                hy density = r1Var3.getDensity();
                m9 m9Var = x1Var3.ryVscX7ZL4Ux;
                r1Var = r1Var3;
                String str3 = gGoUzNp9JO5I.OPXfSBeufaJ8;
                vw0Var = vw0Var3;
                List list3 = gGoUzNp9JO5I.rtx2ld2ELZv4;
                SpannableString spannableString2 = new SpannableString(str3);
                ArrayList arrayList3 = gGoUzNp9JO5I.wdg6QnbFHrFF;
                if (arrayList3 != null) {
                    int size2 = arrayList3.size();
                    x1Var = x1Var3;
                    int i16 = 0;
                    while (i16 < size2) {
                        int i17 = i16;
                        u8 u8Var = (u8) arrayList3.get(i16);
                        ArrayList arrayList4 = arrayList3;
                        q82 q82Var = (q82) u8Var.PxuCJdSBwIXG;
                        int i18 = size2;
                        int i19 = u8Var.lS5Rgt96tfkO;
                        int i20 = u8Var.TSizfFm2Yiuu;
                        a81 a81Var3 = a81Var2;
                        z22 z22Var4 = z22Var3;
                        ww1 ww1Var4 = ww1Var3;
                        long lS5Rgt96tfkO = q82Var.PxuCJdSBwIXG.lS5Rgt96tfkO();
                        d32 d32Var7 = d32Var5;
                        long j = q82Var.lS5Rgt96tfkO;
                        xc0 xc0Var2 = q82Var.TSizfFm2Yiuu;
                        rc0 rc0Var = q82Var.Y1f8riQaR6yg;
                        th2 th2Var = q82Var.wdg6QnbFHrFF;
                        p21 p21Var = q82Var.dgRBjINgWbAK;
                        AccessibilityNodeInfo accessibilityNodeInfo5 = obtain;
                        twy4zb2fCtqq twy4zb2fctqq4 = twy4zb2fctqq3;
                        long j2 = q82Var.x50lh2ztY7Y5;
                        if2 if2Var = q82Var.cpQdD2nAriOS;
                        rh2 rh2Var = q82Var.PxuCJdSBwIXG;
                        AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfo4;
                        v81 v81Var3 = v81Var2;
                        if (!hl.TSizfFm2Yiuu(lS5Rgt96tfkO, rh2Var.lS5Rgt96tfkO())) {
                            rh2.Companion.getClass();
                            rh2Var = ph2.lS5Rgt96tfkO(lS5Rgt96tfkO);
                        }
                        ni0.Pf0ThKz3j5YS(spannableString2, rh2Var.lS5Rgt96tfkO(), i19, i20);
                        SpannableString spannableString3 = spannableString2;
                        ni0.gGoUzNp9JO5I(spannableString3, j, density, i19, i20);
                        if (xc0Var2 == null && rc0Var == null) {
                            i8 = 33;
                        } else {
                            if (xc0Var2 == null) {
                                xc0.Companion.getClass();
                                xc0Var = xc0.x50lh2ztY7Y5;
                            } else {
                                xc0Var = xc0Var2;
                            }
                            if (rc0Var != null) {
                                i7 = rc0Var.PxuCJdSBwIXG;
                            } else {
                                rc0.Companion.getClass();
                                i7 = 0;
                            }
                            StyleSpan styleSpan = new StyleSpan(cs0.RfyTYNmI9Srp(xc0Var, i7));
                            i8 = 33;
                            spannableString3.setSpan(styleSpan, i19, i20, 33);
                        }
                        if (if2Var != null) {
                            int i21 = if2Var.PxuCJdSBwIXG;
                            if2.Companion.getClass();
                            if ((i21 | 1) == i21) {
                                spannableString3.setSpan(new UnderlineSpan(), i19, i20, i8);
                            }
                            if ((i21 | 2) == i21) {
                                spannableString3.setSpan(new StrikethroughSpan(), i19, i20, i8);
                            }
                        }
                        if (th2Var != null) {
                            spannableString3.setSpan(new ScaleXSpan(th2Var.PxuCJdSBwIXG), i19, i20, i8);
                        }
                        ni0.POWyO8hTM6YC(spannableString3, p21Var, i19, i20);
                        if (j2 != 16) {
                            spannableString3.setSpan(new BackgroundColorSpan(mm2.ngxnMNrpiKat(j2)), i19, i20, i8);
                        }
                        spannableString2 = spannableString3;
                        i16 = i17 + 1;
                        v81Var2 = v81Var3;
                        arrayList3 = arrayList4;
                        size2 = i18;
                        a81Var2 = a81Var3;
                        z22Var3 = z22Var4;
                        ww1Var3 = ww1Var4;
                        d32Var5 = d32Var7;
                        obtain = accessibilityNodeInfo5;
                        twy4zb2fctqq3 = twy4zb2fctqq4;
                        accessibilityNodeInfo4 = accessibilityNodeInfo6;
                    }
                } else {
                    x1Var = x1Var3;
                }
                a81Var = a81Var2;
                d32Var = d32Var5;
                z22Var = z22Var3;
                ww1Var = ww1Var3;
                AccessibilityNodeInfo accessibilityNodeInfo7 = accessibilityNodeInfo4;
                accessibilityNodeInfo = obtain;
                twy4zb2fctqq = twy4zb2fctqq3;
                SpannableString spannableString4 = spannableString2;
                v81Var = v81Var2;
                int length = str3.length();
                ?? r2 = p50.rtx2ld2ELZv4;
                if (list3 != null) {
                    arrayList = new ArrayList(list3.size());
                    int size3 = list3.size();
                    for (int i22 = 0; i22 < size3; i22++) {
                        Object obj = list3.get(i22);
                        u8 u8Var2 = (u8) obj;
                        if ((u8Var2.PxuCJdSBwIXG instanceof bq2) && w8.lS5Rgt96tfkO(0, length, u8Var2.lS5Rgt96tfkO, u8Var2.TSizfFm2Yiuu)) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    arrayList = r2;
                }
                int size4 = arrayList.size();
                for (int i23 = 0; i23 < size4; i23++) {
                    u8 u8Var3 = (u8) arrayList.get(i23);
                    bq2 bq2Var = (bq2) u8Var3.PxuCJdSBwIXG;
                    int i24 = u8Var3.lS5Rgt96tfkO;
                    int i25 = u8Var3.TSizfFm2Yiuu;
                    if (!(bq2Var instanceof bq2)) {
                        u9.gPXPFXrUH4XX();
                        return null;
                    }
                    spannableString4.setSpan(new TtsSpan.VerbatimBuilder(bq2Var.PxuCJdSBwIXG).build(), i24, i25, 33);
                }
                int length2 = str3.length();
                if (list3 != null) {
                    arrayList2 = new ArrayList(list3.size());
                    int size5 = list3.size();
                    for (int i26 = 0; i26 < size5; i26++) {
                        Object obj2 = list3.get(i26);
                        u8 u8Var4 = (u8) obj2;
                        if ((u8Var4.PxuCJdSBwIXG instanceof cp2) && w8.lS5Rgt96tfkO(0, length2, u8Var4.lS5Rgt96tfkO, u8Var4.TSizfFm2Yiuu)) {
                            arrayList2.add(obj2);
                        }
                    }
                } else {
                    arrayList2 = r2;
                }
                int size6 = arrayList2.size();
                for (int i27 = 0; i27 < size6; i27++) {
                    u8 u8Var5 = (u8) arrayList2.get(i27);
                    cp2 cp2Var = (cp2) u8Var5.PxuCJdSBwIXG;
                    int i28 = u8Var5.lS5Rgt96tfkO;
                    int i29 = u8Var5.TSizfFm2Yiuu;
                    WeakHashMap weakHashMap = (WeakHashMap) m9Var.OPXfSBeufaJ8;
                    Object obj3 = weakHashMap.get(cp2Var);
                    if (obj3 == null) {
                        obj3 = new URLSpan(cp2Var.PxuCJdSBwIXG);
                        weakHashMap.put(cp2Var, obj3);
                    }
                    spannableString4.setSpan((URLSpan) obj3, i28, i29, 33);
                }
                int length3 = str3.length();
                if (list3 != null) {
                    r2 = new ArrayList(list3.size());
                    int size7 = list3.size();
                    for (int i30 = 0; i30 < size7; i30++) {
                        Object obj4 = list3.get(i30);
                        u8 u8Var6 = (u8) obj4;
                        if ((u8Var6.PxuCJdSBwIXG instanceof v11) && w8.lS5Rgt96tfkO(0, length3, u8Var6.lS5Rgt96tfkO, u8Var6.TSizfFm2Yiuu)) {
                            r2.add(obj4);
                        }
                    }
                }
                int size8 = r2.size();
                for (int i31 = 0; i31 < size8; i31++) {
                    u8 u8Var7 = (u8) r2.get(i31);
                    int i32 = u8Var7.lS5Rgt96tfkO;
                    Object obj5 = u8Var7.PxuCJdSBwIXG;
                    int i33 = u8Var7.TSizfFm2Yiuu;
                    if (i32 != i33) {
                        v11 v11Var = (v11) obj5;
                        if (v11Var instanceof u11) {
                            obj5.getClass();
                            u11 u11Var = (u11) obj5;
                            u8 u8Var8 = new u8(i32, i33, u11Var);
                            WeakHashMap weakHashMap2 = (WeakHashMap) m9Var.wdg6QnbFHrFF;
                            Object obj6 = weakHashMap2.get(u8Var8);
                            if (obj6 == null) {
                                obj6 = new URLSpan(u11Var.PxuCJdSBwIXG);
                                weakHashMap2.put(u8Var8, obj6);
                            }
                            spannableString4.setSpan((URLSpan) obj6, i32, i33, 33);
                        } else {
                            WeakHashMap weakHashMap3 = (WeakHashMap) m9Var.dgRBjINgWbAK;
                            Object obj7 = weakHashMap3.get(u8Var7);
                            if (obj7 == null) {
                                obj7 = new ao(v11Var);
                                weakHashMap3.put(u8Var7, obj7);
                            }
                            spannableString4.setSpan((ClickableSpan) obj7, i32, i33, 33);
                        }
                    }
                }
                spannableString = (SpannableString) x1.tmVwIGCQF4zR(spannableString4);
                accessibilityNodeInfo2 = accessibilityNodeInfo7;
            } else {
                x1Var = x1Var3;
                r1Var = r1Var3;
                a81Var = a81Var2;
                d32Var = d32Var5;
                z22Var = z22Var3;
                ww1Var = ww1Var3;
                vw0Var = vw0Var3;
                accessibilityNodeInfo = obtain;
                twy4zb2fctqq = twy4zb2fctqq3;
                v81Var = v81Var2;
                spannableString = null;
                accessibilityNodeInfo2 = accessibilityNodeInfo4;
            }
            accessibilityNodeInfo2.setText(spannableString);
            k32Var = h32.ryVscX7ZL4Ux;
            if (v81Var.TSizfFm2Yiuu(k32Var)) {
                accessibilityNodeInfo3 = accessibilityNodeInfo;
            } else {
                accessibilityNodeInfo3 = accessibilityNodeInfo;
                accessibilityNodeInfo3.setContentInvalid(true);
                Object RAsUl2FVSrh616 = v81Var.RAsUl2FVSrh6(k32Var);
                if (RAsUl2FVSrh616 == null) {
                    RAsUl2FVSrh616 = null;
                }
                accessibilityNodeInfo3.setError((CharSequence) RAsUl2FVSrh616);
            }
            d32Var2 = d32Var;
            String Pf0ThKz3j5YS = mm2.Pf0ThKz3j5YS(d32Var2, resources);
            if (Build.VERSION.SDK_INT < 30) {
                hnJvRxDXo0hm.OPXfSBeufaJ8(accessibilityNodeInfo2, Pf0ThKz3j5YS);
            } else {
                accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", Pf0ThKz3j5YS);
            }
            accessibilityNodeInfo3.setCheckable(mm2.amuv7NJvPxHu(d32Var2));
            RAsUl2FVSrh6 = v81Var.RAsUl2FVSrh6(h32.xfACYKDMU6Dj);
            if (RAsUl2FVSrh6 == null) {
                RAsUl2FVSrh6 = null;
            }
            ek2Var = (ek2) RAsUl2FVSrh6;
            if (ek2Var != null) {
                if (ek2Var == ek2.rtx2ld2ELZv4) {
                    accessibilityNodeInfo2.setChecked(true);
                } else if (ek2Var == ek2.OPXfSBeufaJ8) {
                    accessibilityNodeInfo2.setChecked(false);
                }
            }
            RAsUl2FVSrh62 = v81Var.RAsUl2FVSrh6(h32.EpkonXwzFgDB);
            if (RAsUl2FVSrh62 == null) {
                RAsUl2FVSrh62 = null;
            }
            bool = (Boolean) RAsUl2FVSrh62;
            if (bool == null) {
                boolean booleanValue = bool.booleanValue();
                ww1.Companion.getClass();
                if (ww1Var == null) {
                    ww1Var2 = ww1Var;
                    i4 = 4;
                } else {
                    ww1Var2 = ww1Var;
                    i4 = 4;
                    if (ww1Var2.PxuCJdSBwIXG == 4) {
                        accessibilityNodeInfo3.setSelected(booleanValue);
                    }
                }
                accessibilityNodeInfo2.setChecked(booleanValue);
            } else {
                ww1Var2 = ww1Var;
                i4 = 4;
            }
            z22Var2 = z22Var;
            if (z22Var2.wdg6QnbFHrFF || d32.wdg6QnbFHrFF(i4, d32Var2).isEmpty()) {
                RAsUl2FVSrh63 = v81Var.RAsUl2FVSrh6(h32.PxuCJdSBwIXG);
                if (RAsUl2FVSrh63 == null) {
                    RAsUl2FVSrh63 = null;
                }
                List list4 = (List) RAsUl2FVSrh63;
                accessibilityNodeInfo3.setContentDescription(list4 == null ? (String) zk.FT2GK7JK5Ma2(list4) : null);
            }
            RAsUl2FVSrh64 = v81Var.RAsUl2FVSrh6(h32.e6tOsSdd2EFb);
            if (RAsUl2FVSrh64 == null) {
                RAsUl2FVSrh64 = null;
            }
            str = (String) RAsUl2FVSrh64;
            if (str != null) {
                d32 d32Var8 = d32Var2;
                while (true) {
                    if (d32Var8 == null) {
                        z4 = false;
                        break;
                    }
                    z22 z22Var5 = d32Var8.Y1f8riQaR6yg;
                    k32 k32Var2 = i32.PxuCJdSBwIXG;
                    if (z22Var5.rtx2ld2ELZv4.TSizfFm2Yiuu(k32Var2)) {
                        z4 = ((Boolean) z22Var5.TSizfFm2Yiuu(k32Var2)).booleanValue();
                        break;
                    }
                    d32Var8 = d32Var8.x50lh2ztY7Y5();
                }
                if (z4) {
                    accessibilityNodeInfo3.setViewIdResourceName(str);
                }
            }
            RAsUl2FVSrh65 = v81Var.RAsUl2FVSrh6(h32.rtx2ld2ELZv4);
            if (RAsUl2FVSrh65 == null) {
                RAsUl2FVSrh65 = null;
            }
            if (((no2) RAsUl2FVSrh65) != null) {
                if (Build.VERSION.SDK_INT < 28) {
                    twy4zb2fctqq2 = twy4zb2fctqq;
                    twy4zb2fctqq2.a92UlCVFR9N8(2, true);
                    RAsUl2FVSrh66 = v81Var.RAsUl2FVSrh6(h32.OPXfSBeufaJ8);
                    if (RAsUl2FVSrh66 == null) {
                        RAsUl2FVSrh66 = null;
                    }
                    if (((no2) RAsUl2FVSrh66) != null) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            accessibilityNodeInfo3.setTextEntryKey(true);
                        } else {
                            twy4zb2fctqq2.a92UlCVFR9N8(8, true);
                        }
                    }
                    i5 = i;
                    if (i5 != -1) {
                        int Y1f8riQaR6yg3 = a81Var.Y1f8riQaR6yg(d32Var2.a92UlCVFR9N8);
                        if (Y1f8riQaR6yg3 != -1) {
                            accessibilityNodeInfo3.setDrawingOrder(Y1f8riQaR6yg3);
                        } else {
                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        }
                    }
                    accessibilityNodeInfo3.setPassword(v81Var.TSizfFm2Yiuu(h32.nLZGh9p8gVSu));
                    RAsUl2FVSrh67 = v81Var.RAsUl2FVSrh6(h32.Pf0ThKz3j5YS);
                    if (RAsUl2FVSrh67 == null) {
                        RAsUl2FVSrh67 = null;
                    }
                    Boolean bool2 = Boolean.TRUE;
                    accessibilityNodeInfo3.setEditable(cs0.wdg6QnbFHrFF(RAsUl2FVSrh67, bool2));
                    RAsUl2FVSrh68 = v81Var.RAsUl2FVSrh6(h32.gGoUzNp9JO5I);
                    if (RAsUl2FVSrh68 == null) {
                        RAsUl2FVSrh68 = null;
                    }
                    Integer num = (Integer) RAsUl2FVSrh68;
                    accessibilityNodeInfo3.setMaxTextLength(num != null ? num.intValue() : -1);
                    accessibilityNodeInfo3.setEnabled(mm2.gPXPFXrUH4XX(d32Var2));
                    k32 k32Var3 = h32.x50lh2ztY7Y5;
                    accessibilityNodeInfo3.setFocusable(v81Var.TSizfFm2Yiuu(k32Var3));
                    if (accessibilityNodeInfo3.isFocusable()) {
                        accessibilityNodeInfo3.setFocused(((Boolean) z22Var2.TSizfFm2Yiuu(k32Var3)).booleanValue());
                        if (!accessibilityNodeInfo3.isFocused()) {
                            x1Var2 = x1Var;
                            z = true;
                            accessibilityNodeInfo2.addAction(1);
                            accessibilityNodeInfo2.setVisibleToUser(bs0.ZbWwgt3aGe7A(d32Var2) ^ z);
                            if (d32Var2.QrzZRwfaDlRX()) {
                                d32Var3 = d32Var2;
                            } else {
                                d32Var3 = d32Var2.x50lh2ztY7Y5();
                                d32Var3.getClass();
                            }
                            if (d32Var3.cpQdD2nAriOS().a92UlCVFR9N8()) {
                                z2 = false;
                            } else {
                                z2 = false;
                                accessibilityNodeInfo2.setVisibleToUser(false);
                            }
                            RAsUl2FVSrh69 = v81Var.RAsUl2FVSrh6(h32.dgRBjINgWbAK);
                            if (RAsUl2FVSrh69 == null) {
                                RAsUl2FVSrh69 = null;
                            }
                            o0.ZbWwgt3aGe7A(RAsUl2FVSrh69);
                            accessibilityNodeInfo2.setClickable(z2);
                            nxjascvarhe9 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(z22Var2, y22.lS5Rgt96tfkO);
                            if (nxjascvarhe9 != null) {
                                boolean wdg6QnbFHrFF3 = cs0.wdg6QnbFHrFF(jh0.RfyTYNmI9Srp(z22Var2, h32.EpkonXwzFgDB), bool2);
                                ww1.Companion.getClass();
                                boolean z7 = (ww1Var2 != null && ww1Var2.PxuCJdSBwIXG == 4) || (ww1Var2 != null && ww1Var2.PxuCJdSBwIXG == 3);
                                accessibilityNodeInfo2.setClickable(!z7 || (z7 && !wdg6QnbFHrFF3));
                                if (mm2.gPXPFXrUH4XX(d32Var2) && accessibilityNodeInfo3.isClickable()) {
                                    twy4zb2fctqq2.PxuCJdSBwIXG(new cJeY36nTk9tz(nxjascvarhe9.PxuCJdSBwIXG, 16));
                                }
                            }
                            accessibilityNodeInfo2.setLongClickable(false);
                            nxjascvarhe92 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(z22Var2, y22.TSizfFm2Yiuu);
                            if (nxjascvarhe92 != null) {
                                accessibilityNodeInfo2.setLongClickable(true);
                                if (mm2.gPXPFXrUH4XX(d32Var2)) {
                                    twy4zb2fctqq2.PxuCJdSBwIXG(new cJeY36nTk9tz(nxjascvarhe92.PxuCJdSBwIXG, 32));
                                }
                            }
                            nxjascvarhe93 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(z22Var2, y22.BRwzKIf41E4i);
                            if (nxjascvarhe93 != null) {
                                twy4zb2fctqq2.PxuCJdSBwIXG(new cJeY36nTk9tz(nxjascvarhe93.PxuCJdSBwIXG, 16384));
                            }
                            if (mm2.gPXPFXrUH4XX(d32Var2)) {
                                nxJAScVArhE9 nxjascvarhe94 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(z22Var2, y22.dgRBjINgWbAK);
                                if (nxjascvarhe94 != null) {
                                    twy4zb2fctqq2.PxuCJdSBwIXG(new cJeY36nTk9tz(nxjascvarhe94.PxuCJdSBwIXG, 2097152));
                                }
                                nxJAScVArhE9 nxjascvarhe95 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(z22Var2, y22.gPXPFXrUH4XX);
                                if (nxjascvarhe95 != null) {
                                    twy4zb2fctqq2.PxuCJdSBwIXG(new cJeY36nTk9tz(nxjascvarhe95.PxuCJdSBwIXG, android.R.id.accessibilityActionImeEnter));
                                }
                                nxJAScVArhE9 nxjascvarhe96 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(z22Var2, y22.XL4ISE6Oc65B);
                                if (nxjascvarhe96 != null) {
                                    twy4zb2fctqq2.PxuCJdSBwIXG(new cJeY36nTk9tz(nxjascvarhe96.PxuCJdSBwIXG, 65536));
                                }
                                nxJAScVArhE9 nxjascvarhe97 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(z22Var2, y22.RfyTYNmI9Srp);
                                if (nxjascvarhe97 != null && accessibilityNodeInfo3.isFocused()) {
                                    ClipDescription primaryClipDescription = r1Var.getClipboardManager().PxuCJdSBwIXG().getPrimaryClipDescription();
                                    if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                        twy4zb2fctqq2.PxuCJdSBwIXG(new cJeY36nTk9tz(nxjascvarhe97.PxuCJdSBwIXG, 32768));
                                    }
                                }
                            }
                            x50lh2ztY7Y5 = x1.x50lh2ztY7Y5(d32Var2);
                            if (x50lh2ztY7Y5 != null && x50lh2ztY7Y5.length() != 0) {
                                accessibilityNodeInfo3.setTextSelection(x1Var2.wdg6QnbFHrFF(d32Var2), x1Var2.OPXfSBeufaJ8(d32Var2));
                                nxJAScVArhE9 nxjascvarhe98 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(z22Var2, y22.wdg6QnbFHrFF);
                                twy4zb2fctqq2.PxuCJdSBwIXG(new cJeY36nTk9tz(nxjascvarhe98 == null ? nxjascvarhe98.PxuCJdSBwIXG : null, 131072));
                                accessibilityNodeInfo2.addAction(256);
                                accessibilityNodeInfo2.addAction(512);
                                accessibilityNodeInfo2.setMovementGranularities(11);
                                list = (List) jh0.RfyTYNmI9Srp(z22Var2, h32.PxuCJdSBwIXG);
                                if ((list != null || list.isEmpty()) && v81Var.TSizfFm2Yiuu(y22.PxuCJdSBwIXG) && (!v81Var.TSizfFm2Yiuu(h32.ozEBbv0hFTAB) || cs0.wdg6QnbFHrFF(jh0.RfyTYNmI9Srp(z22Var2, k32Var3), bool2))) {
                                    S9EYkSpbGuxq = vw0Var.S9EYkSpbGuxq();
                                    while (true) {
                                        if (S9EYkSpbGuxq == null) {
                                            S9EYkSpbGuxq = null;
                                            break;
                                        }
                                        z22 S2OOm9zPNm0h = S9EYkSpbGuxq.S2OOm9zPNm0h();
                                        if (S2OOm9zPNm0h != null && S2OOm9zPNm0h.wdg6QnbFHrFF) {
                                            if (S2OOm9zPNm0h.rtx2ld2ELZv4.TSizfFm2Yiuu(h32.ozEBbv0hFTAB)) {
                                                break;
                                            }
                                        }
                                        S9EYkSpbGuxq = S9EYkSpbGuxq.S9EYkSpbGuxq();
                                    }
                                    if (S9EYkSpbGuxq != null) {
                                        z22 S2OOm9zPNm0h2 = S9EYkSpbGuxq.S2OOm9zPNm0h();
                                        if (S2OOm9zPNm0h2 != null) {
                                            Object RAsUl2FVSrh617 = S2OOm9zPNm0h2.rtx2ld2ELZv4.RAsUl2FVSrh6(h32.x50lh2ztY7Y5);
                                            if (RAsUl2FVSrh617 == null) {
                                                RAsUl2FVSrh617 = null;
                                            }
                                            z3 = cs0.wdg6QnbFHrFF(RAsUl2FVSrh617, Boolean.TRUE);
                                        } else {
                                            z3 = false;
                                        }
                                    }
                                    accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                }
                            }
                            if (Build.VERSION.SDK_INT >= 26) {
                                ArrayList arrayList5 = new ArrayList();
                                arrayList5.add("androidx.compose.ui.semantics.id");
                                CharSequence e9gEMXR7LXtO2 = twy4zb2fctqq2.e9gEMXR7LXtO();
                                if (e9gEMXR7LXtO2 != null && e9gEMXR7LXtO2.length() != 0 && v81Var.TSizfFm2Yiuu(y22.PxuCJdSBwIXG)) {
                                    arrayList5.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                }
                                if (v81Var.TSizfFm2Yiuu(h32.e6tOsSdd2EFb)) {
                                    arrayList5.add("androidx.compose.ui.semantics.testTag");
                                }
                                if (v81Var.TSizfFm2Yiuu(h32.POWyO8hTM6YC)) {
                                    arrayList5.add("androidx.compose.ui.semantics.shapeType");
                                    arrayList5.add("androidx.compose.ui.semantics.shapeRect");
                                    arrayList5.add("androidx.compose.ui.semantics.shapeCorners");
                                    arrayList5.add("androidx.compose.ui.semantics.shapeRegion");
                                }
                                if (Build.VERSION.SDK_INT >= 26) {
                                    accessibilityNodeInfo3.setAvailableExtraData(arrayList5);
                                }
                            }
                            xq1Var = (xq1) jh0.RfyTYNmI9Srp(z22Var2, h32.TSizfFm2Yiuu);
                            if (xq1Var != null) {
                                float f = xq1Var.PxuCJdSBwIXG;
                                tk tkVar = xq1Var.lS5Rgt96tfkO;
                                k32 k32Var4 = y22.OPXfSBeufaJ8;
                                if (v81Var.TSizfFm2Yiuu(k32Var4)) {
                                    twy4zb2fctqq2.RAsUl2FVSrh6("android.widget.SeekBar");
                                } else {
                                    twy4zb2fctqq2.RAsUl2FVSrh6("android.widget.ProgressBar");
                                }
                                xq1.Companion.getClass();
                                if (xq1Var != xq1.TSizfFm2Yiuu) {
                                    accessibilityNodeInfo2.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new HqMwxkFaipxD(AccessibilityNodeInfo.RangeInfo.obtain(1, Float.valueOf(tkVar.PxuCJdSBwIXG).floatValue(), Float.valueOf(tkVar.lS5Rgt96tfkO).floatValue(), f)).PxuCJdSBwIXG);
                                }
                                if (d32Var2.r3s1LDPKFs1S().rtx2ld2ELZv4.TSizfFm2Yiuu(k32Var4) && mm2.gPXPFXrUH4XX(d32Var2)) {
                                    float floatValue = Float.valueOf(tkVar.lS5Rgt96tfkO).floatValue();
                                    float floatValue2 = Float.valueOf(tkVar.PxuCJdSBwIXG).floatValue();
                                    if (floatValue < floatValue2) {
                                        floatValue = floatValue2;
                                    }
                                    if (f < floatValue) {
                                        twy4zb2fctqq2.PxuCJdSBwIXG(cJeY36nTk9tz.e9gEMXR7LXtO);
                                    }
                                    float floatValue3 = Float.valueOf(tkVar.PxuCJdSBwIXG).floatValue();
                                    float floatValue4 = Float.valueOf(tkVar.lS5Rgt96tfkO).floatValue();
                                    if (floatValue3 > floatValue4) {
                                        floatValue3 = floatValue4;
                                    }
                                    if (f > floatValue3) {
                                        twy4zb2fctqq2.PxuCJdSBwIXG(cJeY36nTk9tz.a92UlCVFR9N8);
                                    }
                                }
                            }
                            b51.EpkonXwzFgDB(twy4zb2fctqq2, d32Var2);
                            RAsUl2FVSrh610 = d32Var2.dgRBjINgWbAK().rtx2ld2ELZv4.RAsUl2FVSrh6(h32.a92UlCVFR9N8);
                            if (RAsUl2FVSrh610 == null) {
                                RAsUl2FVSrh610 = null;
                            }
                            wkVar = (wk) RAsUl2FVSrh610;
                            if (wkVar == null) {
                                accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(wkVar.PxuCJdSBwIXG, wkVar.lS5Rgt96tfkO, false, 0));
                            } else {
                                ArrayList arrayList6 = new ArrayList();
                                Object RAsUl2FVSrh618 = d32Var2.dgRBjINgWbAK().rtx2ld2ELZv4.RAsUl2FVSrh6(h32.e9gEMXR7LXtO);
                                if (RAsUl2FVSrh618 == null) {
                                    RAsUl2FVSrh618 = null;
                                }
                                if (RAsUl2FVSrh618 != null) {
                                    List wdg6QnbFHrFF4 = d32.wdg6QnbFHrFF(4, d32Var2);
                                    int size9 = wdg6QnbFHrFF4.size();
                                    for (int i34 = 0; i34 < size9; i34++) {
                                        d32 d32Var9 = (d32) wdg6QnbFHrFF4.get(i34);
                                        if (d32Var9.dgRBjINgWbAK().rtx2ld2ELZv4.TSizfFm2Yiuu(h32.EpkonXwzFgDB)) {
                                            arrayList6.add(d32Var9);
                                        }
                                    }
                                }
                                if (!arrayList6.isEmpty()) {
                                    boolean gGoUzNp9JO5I2 = b51.gGoUzNp9JO5I(arrayList6);
                                    accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(gGoUzNp9JO5I2 ? 1 : arrayList6.size(), gGoUzNp9JO5I2 ? arrayList6.size() : 1, false, 0));
                                }
                            }
                            b51.bEKsvqmvPh2y(twy4zb2fctqq2, d32Var2);
                            h02Var = (h02) jh0.RfyTYNmI9Srp(d32Var2.r3s1LDPKFs1S(), h32.VhhvGxCb8gfr);
                            nxJAScVArhE9 nxjascvarhe99 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(d32Var2.r3s1LDPKFs1S(), y22.Y1f8riQaR6yg);
                            if (h02Var != null && nxjascvarhe99 != null) {
                                RAsUl2FVSrh612 = d32Var2.dgRBjINgWbAK().rtx2ld2ELZv4.RAsUl2FVSrh6(h32.a92UlCVFR9N8);
                                if (RAsUl2FVSrh612 == null) {
                                    RAsUl2FVSrh612 = null;
                                }
                                if (RAsUl2FVSrh612 == null) {
                                    Object RAsUl2FVSrh619 = d32Var2.dgRBjINgWbAK().rtx2ld2ELZv4.RAsUl2FVSrh6(h32.e9gEMXR7LXtO);
                                    if (RAsUl2FVSrh619 == null) {
                                        RAsUl2FVSrh619 = null;
                                    }
                                    if (RAsUl2FVSrh619 == null) {
                                        twy4zb2fctqq2.RAsUl2FVSrh6("android.widget.HorizontalScrollView");
                                    }
                                }
                                if (((Number) h02Var.lS5Rgt96tfkO.PxuCJdSBwIXG()).floatValue() > 0.0f) {
                                    accessibilityNodeInfo2.setScrollable(true);
                                }
                                if (mm2.gPXPFXrUH4XX(d32Var2)) {
                                    boolean XL4ISE6Oc65B = x1.XL4ISE6Oc65B(h02Var);
                                    cw0 cw0Var = cw0.OPXfSBeufaJ8;
                                    if (XL4ISE6Oc65B) {
                                        twy4zb2fctqq2.PxuCJdSBwIXG(cJeY36nTk9tz.e9gEMXR7LXtO);
                                        vw0Var2 = vw0Var;
                                        twy4zb2fctqq2.PxuCJdSBwIXG(vw0Var2.BjEWd04qc7Mw == cw0Var ? cJeY36nTk9tz.rtx2ld2ELZv4 : cJeY36nTk9tz.wdg6QnbFHrFF);
                                    } else {
                                        vw0Var2 = vw0Var;
                                    }
                                    if (x1.BRwzKIf41E4i(h02Var)) {
                                        twy4zb2fctqq2.PxuCJdSBwIXG(cJeY36nTk9tz.a92UlCVFR9N8);
                                        twy4zb2fctqq2.PxuCJdSBwIXG(vw0Var2.BjEWd04qc7Mw == cw0Var ? cJeY36nTk9tz.wdg6QnbFHrFF : cJeY36nTk9tz.rtx2ld2ELZv4);
                                    }
                                }
                            }
                            h02Var2 = (h02) jh0.RfyTYNmI9Srp(d32Var2.r3s1LDPKFs1S(), h32.S2OOm9zPNm0h);
                            if (h02Var2 != null && nxjascvarhe99 != null) {
                                RAsUl2FVSrh611 = d32Var2.dgRBjINgWbAK().rtx2ld2ELZv4.RAsUl2FVSrh6(h32.a92UlCVFR9N8);
                                if (RAsUl2FVSrh611 == null) {
                                    RAsUl2FVSrh611 = null;
                                }
                                if (RAsUl2FVSrh611 == null) {
                                    Object RAsUl2FVSrh620 = d32Var2.dgRBjINgWbAK().rtx2ld2ELZv4.RAsUl2FVSrh6(h32.e9gEMXR7LXtO);
                                    if (RAsUl2FVSrh620 == null) {
                                        RAsUl2FVSrh620 = null;
                                    }
                                    if (RAsUl2FVSrh620 == null) {
                                        twy4zb2fctqq2.RAsUl2FVSrh6("android.widget.ScrollView");
                                    }
                                }
                                if (((Number) h02Var2.lS5Rgt96tfkO.PxuCJdSBwIXG()).floatValue() > 0.0f) {
                                    accessibilityNodeInfo2.setScrollable(true);
                                }
                                if (mm2.gPXPFXrUH4XX(d32Var2)) {
                                    if (x1.XL4ISE6Oc65B(h02Var2)) {
                                        twy4zb2fctqq2.PxuCJdSBwIXG(cJeY36nTk9tz.e9gEMXR7LXtO);
                                        twy4zb2fctqq2.PxuCJdSBwIXG(cJeY36nTk9tz.OPXfSBeufaJ8);
                                    }
                                    if (x1.BRwzKIf41E4i(h02Var2)) {
                                        twy4zb2fctqq2.PxuCJdSBwIXG(cJeY36nTk9tz.a92UlCVFR9N8);
                                        twy4zb2fctqq2.PxuCJdSBwIXG(cJeY36nTk9tz.RAsUl2FVSrh6);
                                    }
                                }
                            }
                            i6 = Build.VERSION.SDK_INT;
                            if (i6 >= 29) {
                                fx1.RfyTYNmI9Srp(twy4zb2fctqq2, d32Var2);
                            }
                            CharSequence charSequence = (CharSequence) jh0.RfyTYNmI9Srp(d32Var2.r3s1LDPKFs1S(), h32.Y1f8riQaR6yg);
                            if (i6 < 28) {
                                accessibilityNodeInfo2.setPaneTitle(charSequence);
                            } else {
                                accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                            }
                            if (mm2.gPXPFXrUH4XX(d32Var2)) {
                                nxJAScVArhE9 nxjascvarhe910 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(d32Var2.r3s1LDPKFs1S(), y22.EcgxDIVH5in8);
                                if (nxjascvarhe910 != null) {
                                    twy4zb2fctqq2.PxuCJdSBwIXG(new cJeY36nTk9tz(nxjascvarhe910.PxuCJdSBwIXG, 262144));
                                }
                                nxJAScVArhE9 nxjascvarhe911 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(d32Var2.r3s1LDPKFs1S(), y22.S9EYkSpbGuxq);
                                if (nxjascvarhe911 != null) {
                                    twy4zb2fctqq2.PxuCJdSBwIXG(new cJeY36nTk9tz(nxjascvarhe911.PxuCJdSBwIXG, 524288));
                                }
                                nxJAScVArhE9 nxjascvarhe912 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(d32Var2.r3s1LDPKFs1S(), y22.VhhvGxCb8gfr);
                                if (nxjascvarhe912 != null) {
                                    twy4zb2fctqq2.PxuCJdSBwIXG(new cJeY36nTk9tz(nxjascvarhe912.PxuCJdSBwIXG, 1048576));
                                }
                                z22 r3s1LDPKFs1S = d32Var2.r3s1LDPKFs1S();
                                k32 k32Var5 = y22.ZbWwgt3aGe7A;
                                if (r3s1LDPKFs1S.rtx2ld2ELZv4.TSizfFm2Yiuu(k32Var5)) {
                                    List list5 = (List) d32Var2.r3s1LDPKFs1S().TSizfFm2Yiuu(k32Var5);
                                    int size10 = list5.size();
                                    b81 b81Var = x1.xbgXKYA2cIfu;
                                    if (size10 >= b81Var.lS5Rgt96tfkO) {
                                        throw new IllegalStateException("Can't have more than " + b81Var.lS5Rgt96tfkO + " custom actions for one widget");
                                    }
                                    s82 s82Var3 = new s82();
                                    l81 PxuCJdSBwIXG = oe1.PxuCJdSBwIXG();
                                    s82 s82Var4 = s82Var;
                                    if (s82Var4.rtx2ld2ELZv4) {
                                        zv.wdg6QnbFHrFF(s82Var4);
                                    }
                                    if (mm2.VhhvGxCb8gfr(s82Var4.OPXfSBeufaJ8, s82Var4.dgRBjINgWbAK, i5) >= 0) {
                                        l81 l81Var = (l81) s82Var4.lS5Rgt96tfkO(i5);
                                        int[] iArr = b81Var.PxuCJdSBwIXG;
                                        int i35 = b81Var.lS5Rgt96tfkO;
                                        int[] iArr2 = new int[16];
                                        int i36 = 0;
                                        int i37 = 0;
                                        while (i36 < i35) {
                                            int i38 = iArr[i36];
                                            int i39 = i35;
                                            int i40 = i37 + 1;
                                            l81 l81Var2 = l81Var;
                                            if (iArr2.length < i40) {
                                                iArr2 = Arrays.copyOf(iArr2, Math.max(i40, (iArr2.length * 3) / 2));
                                            }
                                            iArr2[i37] = i38;
                                            i36++;
                                            i37 = i40;
                                            i35 = i39;
                                            l81Var = l81Var2;
                                        }
                                        l81 l81Var3 = l81Var;
                                        ArrayList arrayList7 = new ArrayList();
                                        if (list5.size() > 0) {
                                            o0.ZbWwgt3aGe7A(list5.get(0));
                                            l81Var3.getClass();
                                            throw null;
                                        }
                                        if (arrayList7.size() > 0) {
                                            o0.ZbWwgt3aGe7A(arrayList7.get(0));
                                            if (i37 <= 0) {
                                                throw new IndexOutOfBoundsException("Index must be between 0 and size");
                                            }
                                            int i41 = iArr2[0];
                                            throw null;
                                        }
                                    } else if (list5.size() > 0) {
                                        o0.ZbWwgt3aGe7A(list5.get(0));
                                        b81Var.lS5Rgt96tfkO(0);
                                        throw null;
                                    }
                                    x1Var2.pnx5pC0XzaCw.Y1f8riQaR6yg(i5, s82Var3);
                                    s82Var4.Y1f8riQaR6yg(i5, PxuCJdSBwIXG);
                                }
                            }
                            boolean BRwzKIf41E4i = mm2.BRwzKIf41E4i(d32Var2, resources);
                            if (Build.VERSION.SDK_INT < 28) {
                                accessibilityNodeInfo2.setScreenReaderFocusable(BRwzKIf41E4i);
                            } else {
                                twy4zb2fctqq2.a92UlCVFR9N8(1, BRwzKIf41E4i);
                            }
                            Y1f8riQaR6yg = x1Var2.J54yh1s3n4Aq.Y1f8riQaR6yg(i5);
                            if (Y1f8riQaR6yg == -1) {
                                ni0.amuv7NJvPxHu(r1Var.getAndroidViewsHandler$ui(), Y1f8riQaR6yg);
                                r1Var2 = r1Var;
                                accessibilityNodeInfo2.setTraversalBefore(r1Var2, Y1f8riQaR6yg);
                                x1Var2.lS5Rgt96tfkO(i5, twy4zb2fctqq2, x1Var2.xfACYKDMU6Dj, null);
                            } else {
                                r1Var2 = r1Var;
                            }
                            Y1f8riQaR6yg2 = x1Var2.EpkonXwzFgDB.Y1f8riQaR6yg(i5);
                            if (Y1f8riQaR6yg2 != -1) {
                                ni0.amuv7NJvPxHu(r1Var2.getAndroidViewsHandler$ui(), Y1f8riQaR6yg2);
                            }
                            str2 = (String) jh0.RfyTYNmI9Srp(d32Var2.r3s1LDPKFs1S(), i32.lS5Rgt96tfkO);
                            if (str2 != null) {
                                twy4zb2fctqq2.RAsUl2FVSrh6(str2);
                            }
                            if (x1Var2.VhhvGxCb8gfr) {
                            }
                            return twy4zb2fctqq2;
                        }
                        accessibilityNodeInfo2.addAction(2);
                        x1Var2 = x1Var;
                        x1Var2.RfyTYNmI9Srp = i5;
                    } else {
                        x1Var2 = x1Var;
                    }
                    z = true;
                    accessibilityNodeInfo2.setVisibleToUser(bs0.ZbWwgt3aGe7A(d32Var2) ^ z);
                    if (d32Var2.QrzZRwfaDlRX()) {
                    }
                    if (d32Var3.cpQdD2nAriOS().a92UlCVFR9N8()) {
                    }
                    RAsUl2FVSrh69 = v81Var.RAsUl2FVSrh6(h32.dgRBjINgWbAK);
                    if (RAsUl2FVSrh69 == null) {
                    }
                    o0.ZbWwgt3aGe7A(RAsUl2FVSrh69);
                    accessibilityNodeInfo2.setClickable(z2);
                    nxjascvarhe9 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(z22Var2, y22.lS5Rgt96tfkO);
                    if (nxjascvarhe9 != null) {
                    }
                    accessibilityNodeInfo2.setLongClickable(false);
                    nxjascvarhe92 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(z22Var2, y22.TSizfFm2Yiuu);
                    if (nxjascvarhe92 != null) {
                    }
                    nxjascvarhe93 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(z22Var2, y22.BRwzKIf41E4i);
                    if (nxjascvarhe93 != null) {
                    }
                    if (mm2.gPXPFXrUH4XX(d32Var2)) {
                    }
                    x50lh2ztY7Y5 = x1.x50lh2ztY7Y5(d32Var2);
                    if (x50lh2ztY7Y5 != null) {
                        accessibilityNodeInfo3.setTextSelection(x1Var2.wdg6QnbFHrFF(d32Var2), x1Var2.OPXfSBeufaJ8(d32Var2));
                        nxJAScVArhE9 nxjascvarhe982 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(z22Var2, y22.wdg6QnbFHrFF);
                        twy4zb2fctqq2.PxuCJdSBwIXG(new cJeY36nTk9tz(nxjascvarhe982 == null ? nxjascvarhe982.PxuCJdSBwIXG : null, 131072));
                        accessibilityNodeInfo2.addAction(256);
                        accessibilityNodeInfo2.addAction(512);
                        accessibilityNodeInfo2.setMovementGranularities(11);
                        list = (List) jh0.RfyTYNmI9Srp(z22Var2, h32.PxuCJdSBwIXG);
                        if (list != null) {
                        }
                        S9EYkSpbGuxq = vw0Var.S9EYkSpbGuxq();
                        while (true) {
                            if (S9EYkSpbGuxq == null) {
                            }
                            S9EYkSpbGuxq = S9EYkSpbGuxq.S9EYkSpbGuxq();
                        }
                        if (S9EYkSpbGuxq != null) {
                        }
                        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                    xq1Var = (xq1) jh0.RfyTYNmI9Srp(z22Var2, h32.TSizfFm2Yiuu);
                    if (xq1Var != null) {
                    }
                    b51.EpkonXwzFgDB(twy4zb2fctqq2, d32Var2);
                    RAsUl2FVSrh610 = d32Var2.dgRBjINgWbAK().rtx2ld2ELZv4.RAsUl2FVSrh6(h32.a92UlCVFR9N8);
                    if (RAsUl2FVSrh610 == null) {
                    }
                    wkVar = (wk) RAsUl2FVSrh610;
                    if (wkVar == null) {
                    }
                    b51.bEKsvqmvPh2y(twy4zb2fctqq2, d32Var2);
                    h02Var = (h02) jh0.RfyTYNmI9Srp(d32Var2.r3s1LDPKFs1S(), h32.VhhvGxCb8gfr);
                    nxJAScVArhE9 nxjascvarhe992 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(d32Var2.r3s1LDPKFs1S(), y22.Y1f8riQaR6yg);
                    if (h02Var != null) {
                        RAsUl2FVSrh612 = d32Var2.dgRBjINgWbAK().rtx2ld2ELZv4.RAsUl2FVSrh6(h32.a92UlCVFR9N8);
                        if (RAsUl2FVSrh612 == null) {
                        }
                        if (RAsUl2FVSrh612 == null) {
                        }
                        if (((Number) h02Var.lS5Rgt96tfkO.PxuCJdSBwIXG()).floatValue() > 0.0f) {
                        }
                        if (mm2.gPXPFXrUH4XX(d32Var2)) {
                        }
                    }
                    h02Var2 = (h02) jh0.RfyTYNmI9Srp(d32Var2.r3s1LDPKFs1S(), h32.S2OOm9zPNm0h);
                    if (h02Var2 != null) {
                        RAsUl2FVSrh611 = d32Var2.dgRBjINgWbAK().rtx2ld2ELZv4.RAsUl2FVSrh6(h32.a92UlCVFR9N8);
                        if (RAsUl2FVSrh611 == null) {
                        }
                        if (RAsUl2FVSrh611 == null) {
                        }
                        if (((Number) h02Var2.lS5Rgt96tfkO.PxuCJdSBwIXG()).floatValue() > 0.0f) {
                        }
                        if (mm2.gPXPFXrUH4XX(d32Var2)) {
                        }
                    }
                    i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 29) {
                    }
                    CharSequence charSequence2 = (CharSequence) jh0.RfyTYNmI9Srp(d32Var2.r3s1LDPKFs1S(), h32.Y1f8riQaR6yg);
                    if (i6 < 28) {
                    }
                    if (mm2.gPXPFXrUH4XX(d32Var2)) {
                    }
                    boolean BRwzKIf41E4i2 = mm2.BRwzKIf41E4i(d32Var2, resources);
                    if (Build.VERSION.SDK_INT < 28) {
                    }
                    Y1f8riQaR6yg = x1Var2.J54yh1s3n4Aq.Y1f8riQaR6yg(i5);
                    if (Y1f8riQaR6yg == -1) {
                    }
                    Y1f8riQaR6yg2 = x1Var2.EpkonXwzFgDB.Y1f8riQaR6yg(i5);
                    if (Y1f8riQaR6yg2 != -1) {
                    }
                    str2 = (String) jh0.RfyTYNmI9Srp(d32Var2.r3s1LDPKFs1S(), i32.lS5Rgt96tfkO);
                    if (str2 != null) {
                    }
                    if (x1Var2.VhhvGxCb8gfr) {
                    }
                    return twy4zb2fctqq2;
                }
                accessibilityNodeInfo2.setHeading(true);
            }
            twy4zb2fctqq2 = twy4zb2fctqq;
            RAsUl2FVSrh66 = v81Var.RAsUl2FVSrh6(h32.OPXfSBeufaJ8);
            if (RAsUl2FVSrh66 == null) {
            }
            if (((no2) RAsUl2FVSrh66) != null) {
            }
            i5 = i;
            if (i5 != -1) {
            }
            accessibilityNodeInfo3.setPassword(v81Var.TSizfFm2Yiuu(h32.nLZGh9p8gVSu));
            RAsUl2FVSrh67 = v81Var.RAsUl2FVSrh6(h32.Pf0ThKz3j5YS);
            if (RAsUl2FVSrh67 == null) {
            }
            Boolean bool22 = Boolean.TRUE;
            accessibilityNodeInfo3.setEditable(cs0.wdg6QnbFHrFF(RAsUl2FVSrh67, bool22));
            RAsUl2FVSrh68 = v81Var.RAsUl2FVSrh6(h32.gGoUzNp9JO5I);
            if (RAsUl2FVSrh68 == null) {
            }
            Integer num2 = (Integer) RAsUl2FVSrh68;
            accessibilityNodeInfo3.setMaxTextLength(num2 != null ? num2.intValue() : -1);
            accessibilityNodeInfo3.setEnabled(mm2.gPXPFXrUH4XX(d32Var2));
            k32 k32Var32 = h32.x50lh2ztY7Y5;
            accessibilityNodeInfo3.setFocusable(v81Var.TSizfFm2Yiuu(k32Var32));
            if (accessibilityNodeInfo3.isFocusable()) {
            }
            z = true;
            accessibilityNodeInfo2.setVisibleToUser(bs0.ZbWwgt3aGe7A(d32Var2) ^ z);
            if (d32Var2.QrzZRwfaDlRX()) {
            }
            if (d32Var3.cpQdD2nAriOS().a92UlCVFR9N8()) {
            }
            RAsUl2FVSrh69 = v81Var.RAsUl2FVSrh6(h32.dgRBjINgWbAK);
            if (RAsUl2FVSrh69 == null) {
            }
            o0.ZbWwgt3aGe7A(RAsUl2FVSrh69);
            accessibilityNodeInfo2.setClickable(z2);
            nxjascvarhe9 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(z22Var2, y22.lS5Rgt96tfkO);
            if (nxjascvarhe9 != null) {
            }
            accessibilityNodeInfo2.setLongClickable(false);
            nxjascvarhe92 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(z22Var2, y22.TSizfFm2Yiuu);
            if (nxjascvarhe92 != null) {
            }
            nxjascvarhe93 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(z22Var2, y22.BRwzKIf41E4i);
            if (nxjascvarhe93 != null) {
            }
            if (mm2.gPXPFXrUH4XX(d32Var2)) {
            }
            x50lh2ztY7Y5 = x1.x50lh2ztY7Y5(d32Var2);
            if (x50lh2ztY7Y5 != null) {
            }
            if (Build.VERSION.SDK_INT >= 26) {
            }
            xq1Var = (xq1) jh0.RfyTYNmI9Srp(z22Var2, h32.TSizfFm2Yiuu);
            if (xq1Var != null) {
            }
            b51.EpkonXwzFgDB(twy4zb2fctqq2, d32Var2);
            RAsUl2FVSrh610 = d32Var2.dgRBjINgWbAK().rtx2ld2ELZv4.RAsUl2FVSrh6(h32.a92UlCVFR9N8);
            if (RAsUl2FVSrh610 == null) {
            }
            wkVar = (wk) RAsUl2FVSrh610;
            if (wkVar == null) {
            }
            b51.bEKsvqmvPh2y(twy4zb2fctqq2, d32Var2);
            h02Var = (h02) jh0.RfyTYNmI9Srp(d32Var2.r3s1LDPKFs1S(), h32.VhhvGxCb8gfr);
            nxJAScVArhE9 nxjascvarhe9922 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(d32Var2.r3s1LDPKFs1S(), y22.Y1f8riQaR6yg);
            if (h02Var != null) {
            }
            h02Var2 = (h02) jh0.RfyTYNmI9Srp(d32Var2.r3s1LDPKFs1S(), h32.S2OOm9zPNm0h);
            if (h02Var2 != null) {
            }
            i6 = Build.VERSION.SDK_INT;
            if (i6 >= 29) {
            }
            CharSequence charSequence22 = (CharSequence) jh0.RfyTYNmI9Srp(d32Var2.r3s1LDPKFs1S(), h32.Y1f8riQaR6yg);
            if (i6 < 28) {
            }
            if (mm2.gPXPFXrUH4XX(d32Var2)) {
            }
            boolean BRwzKIf41E4i22 = mm2.BRwzKIf41E4i(d32Var2, resources);
            if (Build.VERSION.SDK_INT < 28) {
            }
            Y1f8riQaR6yg = x1Var2.J54yh1s3n4Aq.Y1f8riQaR6yg(i5);
            if (Y1f8riQaR6yg == -1) {
            }
            Y1f8riQaR6yg2 = x1Var2.EpkonXwzFgDB.Y1f8riQaR6yg(i5);
            if (Y1f8riQaR6yg2 != -1) {
            }
            str2 = (String) jh0.RfyTYNmI9Srp(d32Var2.r3s1LDPKFs1S(), i32.lS5Rgt96tfkO);
            if (str2 != null) {
            }
            if (x1Var2.VhhvGxCb8gfr) {
            }
            return twy4zb2fctqq2;
        }
        accessibilityManager = accessibilityManager2;
        s82Var = s82Var2;
        obtain.setPackageName(r1Var3.getContext().getPackageName());
        obtain.setImportantForAccessibility(bs0.pnx5pC0XzaCw(d32Var5));
        if (i10 < 34) {
        }
        List wdg6QnbFHrFF22 = d32.wdg6QnbFHrFF(4, d32Var5);
        size = wdg6QnbFHrFF22.size();
        boolean z62 = e9gEMXR7LXtO;
        int i122 = 0;
        i2 = 0;
        while (i2 < size) {
        }
        i3 = x1Var3.XL4ISE6Oc65B;
        AccessibilityNodeInfo accessibilityNodeInfo42 = twy4zb2fctqq3.PxuCJdSBwIXG;
        if (i != i3) {
        }
        gGoUzNp9JO5I = mm2.gGoUzNp9JO5I(d32Var5);
        if (gGoUzNp9JO5I == null) {
        }
        accessibilityNodeInfo2.setText(spannableString);
        k32Var = h32.ryVscX7ZL4Ux;
        if (v81Var.TSizfFm2Yiuu(k32Var)) {
        }
        d32Var2 = d32Var;
        String Pf0ThKz3j5YS2 = mm2.Pf0ThKz3j5YS(d32Var2, resources);
        if (Build.VERSION.SDK_INT < 30) {
        }
        accessibilityNodeInfo3.setCheckable(mm2.amuv7NJvPxHu(d32Var2));
        RAsUl2FVSrh6 = v81Var.RAsUl2FVSrh6(h32.xfACYKDMU6Dj);
        if (RAsUl2FVSrh6 == null) {
        }
        ek2Var = (ek2) RAsUl2FVSrh6;
        if (ek2Var != null) {
        }
        RAsUl2FVSrh62 = v81Var.RAsUl2FVSrh6(h32.EpkonXwzFgDB);
        if (RAsUl2FVSrh62 == null) {
        }
        bool = (Boolean) RAsUl2FVSrh62;
        if (bool == null) {
        }
        z22Var2 = z22Var;
        if (z22Var2.wdg6QnbFHrFF) {
        }
        RAsUl2FVSrh63 = v81Var.RAsUl2FVSrh6(h32.PxuCJdSBwIXG);
        if (RAsUl2FVSrh63 == null) {
        }
        List list42 = (List) RAsUl2FVSrh63;
        accessibilityNodeInfo3.setContentDescription(list42 == null ? (String) zk.FT2GK7JK5Ma2(list42) : null);
        RAsUl2FVSrh64 = v81Var.RAsUl2FVSrh6(h32.e6tOsSdd2EFb);
        if (RAsUl2FVSrh64 == null) {
        }
        str = (String) RAsUl2FVSrh64;
        if (str != null) {
        }
        RAsUl2FVSrh65 = v81Var.RAsUl2FVSrh6(h32.rtx2ld2ELZv4);
        if (RAsUl2FVSrh65 == null) {
        }
        if (((no2) RAsUl2FVSrh65) != null) {
        }
        twy4zb2fctqq2 = twy4zb2fctqq;
        RAsUl2FVSrh66 = v81Var.RAsUl2FVSrh6(h32.OPXfSBeufaJ8);
        if (RAsUl2FVSrh66 == null) {
        }
        if (((no2) RAsUl2FVSrh66) != null) {
        }
        i5 = i;
        if (i5 != -1) {
        }
        accessibilityNodeInfo3.setPassword(v81Var.TSizfFm2Yiuu(h32.nLZGh9p8gVSu));
        RAsUl2FVSrh67 = v81Var.RAsUl2FVSrh6(h32.Pf0ThKz3j5YS);
        if (RAsUl2FVSrh67 == null) {
        }
        Boolean bool222 = Boolean.TRUE;
        accessibilityNodeInfo3.setEditable(cs0.wdg6QnbFHrFF(RAsUl2FVSrh67, bool222));
        RAsUl2FVSrh68 = v81Var.RAsUl2FVSrh6(h32.gGoUzNp9JO5I);
        if (RAsUl2FVSrh68 == null) {
        }
        Integer num22 = (Integer) RAsUl2FVSrh68;
        accessibilityNodeInfo3.setMaxTextLength(num22 != null ? num22.intValue() : -1);
        accessibilityNodeInfo3.setEnabled(mm2.gPXPFXrUH4XX(d32Var2));
        k32 k32Var322 = h32.x50lh2ztY7Y5;
        accessibilityNodeInfo3.setFocusable(v81Var.TSizfFm2Yiuu(k32Var322));
        if (accessibilityNodeInfo3.isFocusable()) {
        }
        z = true;
        accessibilityNodeInfo2.setVisibleToUser(bs0.ZbWwgt3aGe7A(d32Var2) ^ z);
        if (d32Var2.QrzZRwfaDlRX()) {
        }
        if (d32Var3.cpQdD2nAriOS().a92UlCVFR9N8()) {
        }
        RAsUl2FVSrh69 = v81Var.RAsUl2FVSrh6(h32.dgRBjINgWbAK);
        if (RAsUl2FVSrh69 == null) {
        }
        o0.ZbWwgt3aGe7A(RAsUl2FVSrh69);
        accessibilityNodeInfo2.setClickable(z2);
        nxjascvarhe9 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(z22Var2, y22.lS5Rgt96tfkO);
        if (nxjascvarhe9 != null) {
        }
        accessibilityNodeInfo2.setLongClickable(false);
        nxjascvarhe92 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(z22Var2, y22.TSizfFm2Yiuu);
        if (nxjascvarhe92 != null) {
        }
        nxjascvarhe93 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(z22Var2, y22.BRwzKIf41E4i);
        if (nxjascvarhe93 != null) {
        }
        if (mm2.gPXPFXrUH4XX(d32Var2)) {
        }
        x50lh2ztY7Y5 = x1.x50lh2ztY7Y5(d32Var2);
        if (x50lh2ztY7Y5 != null) {
        }
        if (Build.VERSION.SDK_INT >= 26) {
        }
        xq1Var = (xq1) jh0.RfyTYNmI9Srp(z22Var2, h32.TSizfFm2Yiuu);
        if (xq1Var != null) {
        }
        b51.EpkonXwzFgDB(twy4zb2fctqq2, d32Var2);
        RAsUl2FVSrh610 = d32Var2.dgRBjINgWbAK().rtx2ld2ELZv4.RAsUl2FVSrh6(h32.a92UlCVFR9N8);
        if (RAsUl2FVSrh610 == null) {
        }
        wkVar = (wk) RAsUl2FVSrh610;
        if (wkVar == null) {
        }
        b51.bEKsvqmvPh2y(twy4zb2fctqq2, d32Var2);
        h02Var = (h02) jh0.RfyTYNmI9Srp(d32Var2.r3s1LDPKFs1S(), h32.VhhvGxCb8gfr);
        nxJAScVArhE9 nxjascvarhe99222 = (nxJAScVArhE9) jh0.RfyTYNmI9Srp(d32Var2.r3s1LDPKFs1S(), y22.Y1f8riQaR6yg);
        if (h02Var != null) {
        }
        h02Var2 = (h02) jh0.RfyTYNmI9Srp(d32Var2.r3s1LDPKFs1S(), h32.S2OOm9zPNm0h);
        if (h02Var2 != null) {
        }
        i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
        }
        CharSequence charSequence222 = (CharSequence) jh0.RfyTYNmI9Srp(d32Var2.r3s1LDPKFs1S(), h32.Y1f8riQaR6yg);
        if (i6 < 28) {
        }
        if (mm2.gPXPFXrUH4XX(d32Var2)) {
        }
        boolean BRwzKIf41E4i222 = mm2.BRwzKIf41E4i(d32Var2, resources);
        if (Build.VERSION.SDK_INT < 28) {
        }
        Y1f8riQaR6yg = x1Var2.J54yh1s3n4Aq.Y1f8riQaR6yg(i5);
        if (Y1f8riQaR6yg == -1) {
        }
        Y1f8riQaR6yg2 = x1Var2.EpkonXwzFgDB.Y1f8riQaR6yg(i5);
        if (Y1f8riQaR6yg2 != -1) {
        }
        str2 = (String) jh0.RfyTYNmI9Srp(d32Var2.r3s1LDPKFs1S(), i32.lS5Rgt96tfkO);
        if (str2 != null) {
        }
        if (x1Var2.VhhvGxCb8gfr) {
        }
        return twy4zb2fctqq2;
    }

    public oh2 dgRBjINgWbAK(List list) {
        m40 m40Var;
        Exception e;
        m40 m40Var2;
        try {
            int size = list.size();
            int i = 0;
            m40Var = null;
            while (i < size) {
                try {
                    m40Var2 = (m40) list.get(i);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    m40Var2.PxuCJdSBwIXG((o40) this.wdg6QnbFHrFF);
                    i++;
                    m40Var = m40Var2;
                } catch (Exception e3) {
                    e = e3;
                    m40Var = m40Var2;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((o40) this.wdg6QnbFHrFF).PxuCJdSBwIXG.PxuCJdSBwIXG());
                    sb2.append(", composition=");
                    sb2.append(((o40) this.wdg6QnbFHrFF).TSizfFm2Yiuu());
                    sb2.append(", selection=");
                    o40 o40Var = (o40) this.wdg6QnbFHrFF;
                    sb2.append((Object) vi2.rtx2ld2ELZv4(jh0.rtx2ld2ELZv4(o40Var.lS5Rgt96tfkO, o40Var.TSizfFm2Yiuu)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    zk.vfcx0XMziUg4(list, sb, new r3s1LDPKFs1S(9, m40Var, this), 60);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            o40 o40Var2 = (o40) this.wdg6QnbFHrFF;
            o40Var2.getClass();
            v8 v8Var = new v8(o40Var2.PxuCJdSBwIXG.toString());
            o40 o40Var3 = (o40) this.wdg6QnbFHrFF;
            long rtx2ld2ELZv4 = jh0.rtx2ld2ELZv4(o40Var3.lS5Rgt96tfkO, o40Var3.TSizfFm2Yiuu);
            vi2 vi2Var = vi2.RAsUl2FVSrh6(((oh2) this.OPXfSBeufaJ8).lS5Rgt96tfkO) ? null : new vi2(rtx2ld2ELZv4);
            oh2 oh2Var = new oh2(v8Var, vi2Var != null ? vi2Var.PxuCJdSBwIXG : jh0.rtx2ld2ELZv4(vi2.e9gEMXR7LXtO(rtx2ld2ELZv4), vi2.a92UlCVFR9N8(rtx2ld2ELZv4)), ((o40) this.wdg6QnbFHrFF).TSizfFm2Yiuu());
            this.OPXfSBeufaJ8 = oh2Var;
            return oh2Var;
        } catch (Exception e4) {
            m40Var = null;
            e = e4;
        }
    }

    @Override // defpackage.jb2
    public void e9gEMXR7LXtO(ib2 ib2Var) {
        l81 l81Var = (l81) this.wdg6QnbFHrFF;
        l81Var.PxuCJdSBwIXG();
        q81 q81Var = (q81) ib2Var.OPXfSBeufaJ8;
        Object[] objArr = q81Var.lS5Rgt96tfkO;
        long[] jArr = q81Var.TSizfFm2Yiuu;
        int i = q81Var.e9gEMXR7LXtO;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object lS5Rgt96tfkO = ((cy0) this.OPXfSBeufaJ8).lS5Rgt96tfkO(obj);
            int Y1f8riQaR6yg = l81Var.Y1f8riQaR6yg(lS5Rgt96tfkO);
            int i3 = Y1f8riQaR6yg >= 0 ? l81Var.TSizfFm2Yiuu[Y1f8riQaR6yg] : 0;
            if (i3 == 7) {
                ib2Var.remove(obj);
            } else {
                l81Var.RAsUl2FVSrh6(i3 + 1, lS5Rgt96tfkO);
            }
            i = i2;
        }
    }

    public InputMethodManager gPXPFXrUH4XX() {
        return (InputMethodManager) ((nx0) this.wdg6QnbFHrFF).getValue();
    }

    @Override // defpackage.d50
    public boolean lS5Rgt96tfkO(CharSequence charSequence, int i, int i2, xm2 xm2Var) {
        if ((xm2Var.TSizfFm2Yiuu & 4) > 0) {
            return true;
        }
        if (((so2) this.OPXfSBeufaJ8) == null) {
            this.OPXfSBeufaJ8 = new so2(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((jx1) this.wdg6QnbFHrFF).getClass();
        ((so2) this.OPXfSBeufaJ8).setSpan(new ym2(xm2Var), i, i2, 33);
        return true;
    }

    public KSerializer r3s1LDPKFs1S(eu0 eu0Var) {
        Object obj;
        Object putIfAbsent;
        switch (this.rtx2ld2ELZv4) {
            case 6:
                obj = ((ek) this.wdg6QnbFHrFF).get(kj0.e6tOsSdd2EFb(eu0Var));
                obj.getClass();
                c91 c91Var = (c91) obj;
                Object obj2 = c91Var.PxuCJdSBwIXG.get();
                if (obj2 == null) {
                    synchronized (c91Var) {
                        obj2 = c91Var.PxuCJdSBwIXG.get();
                        if (obj2 == null) {
                            obj2 = new fh((KSerializer) ((le0) this.OPXfSBeufaJ8).OPXfSBeufaJ8(eu0Var));
                            c91Var.PxuCJdSBwIXG = new SoftReference(obj2);
                        }
                    }
                }
                return ((fh) obj2).PxuCJdSBwIXG;
            default:
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.wdg6QnbFHrFF;
                Class e6tOsSdd2EFb = kj0.e6tOsSdd2EFb(eu0Var);
                Object obj3 = concurrentHashMap.get(e6tOsSdd2EFb);
                if (obj3 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(e6tOsSdd2EFb, (obj3 = new fh((KSerializer) ((le0) this.OPXfSBeufaJ8).OPXfSBeufaJ8(eu0Var))))) != null) {
                    obj3 = putIfAbsent;
                }
                return ((fh) obj3).PxuCJdSBwIXG;
        }
    }

    public boolean rtx2ld2ELZv4(long j) {
        Object obj;
        List list = (List) ((op0) this.wdg6QnbFHrFF).OPXfSBeufaJ8;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (vi0.gPXPFXrUH4XX(((co1) obj).PxuCJdSBwIXG, j)) {
                break;
            }
            i++;
        }
        co1 co1Var = (co1) obj;
        if (co1Var != null) {
            return co1Var.rtx2ld2ELZv4;
        }
        return false;
    }

    @Override // defpackage.kq0
    public gq0 toInstant() {
        throw new iq0(((String) this.OPXfSBeufaJ8) + " when parsing an Instant from \"" + fx1.HqMwxkFaipxD((String) this.wdg6QnbFHrFF, 64) + '\"');
    }

    public String toString() {
        switch (this.rtx2ld2ELZv4) {
            case 26:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.wdg6QnbFHrFF.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.OPXfSBeufaJ8;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void wdg6QnbFHrFF(Object obj, String str) {
        ((ArrayList) this.OPXfSBeufaJ8).add(str + "=" + String.valueOf(obj));
    }

    public boolean x50lh2ztY7Y5() {
        synchronized (this) {
            if (((AtomicBoolean) this.wdg6QnbFHrFF).get()) {
                return false;
            }
            ((AtomicInteger) this.OPXfSBeufaJ8).incrementAndGet();
            return true;
        }
    }

    public /* synthetic */ op0(int i, boolean z) {
        this.rtx2ld2ELZv4 = i;
    }

    public /* synthetic */ op0(Object obj) {
        this.rtx2ld2ELZv4 = 26;
        this.wdg6QnbFHrFF = obj;
        this.OPXfSBeufaJ8 = new ArrayList();
    }

    public op0(ov2 ov2Var, jx1 jx1Var) {
        this.rtx2ld2ELZv4 = 3;
        this.wdg6QnbFHrFF = "ClientTelemetry.API";
        this.OPXfSBeufaJ8 = ov2Var;
    }

    public op0(vw0 vw0Var, j51 j51Var) {
        this.rtx2ld2ELZv4 = 19;
        this.OPXfSBeufaJ8 = vw0Var;
        this.wdg6QnbFHrFF = sj0.tmVwIGCQF4zR(j51Var);
    }

    public op0(String str) {
        this.rtx2ld2ELZv4 = 16;
        this.OPXfSBeufaJ8 = str.concat(".lck");
    }

    public op0(g1 g1Var) {
        this.rtx2ld2ELZv4 = 8;
        this.OPXfSBeufaJ8 = new AtomicInteger(0);
        this.wdg6QnbFHrFF = new AtomicBoolean(false);
    }

    public op0(vb vbVar) {
        this.rtx2ld2ELZv4 = 27;
        this.OPXfSBeufaJ8 = vbVar;
        this.wdg6QnbFHrFF = new bb(0);
    }

    public op0(le0 le0Var, int i) {
        this.rtx2ld2ELZv4 = i;
        switch (i) {
            case 9:
                this.OPXfSBeufaJ8 = le0Var;
                this.wdg6QnbFHrFF = new ConcurrentHashMap();
                break;
            default:
                this.OPXfSBeufaJ8 = le0Var;
                this.wdg6QnbFHrFF = new ek();
                break;
        }
    }

    public op0(View view) {
        this.rtx2ld2ELZv4 = 0;
        this.OPXfSBeufaJ8 = view;
        this.wdg6QnbFHrFF = vi0.ryVscX7ZL4Ux(pz0.OPXfSBeufaJ8, new o5(15, this));
    }

    public op0(bx1 bx1Var, gy1 gy1Var) {
        this.rtx2ld2ELZv4 = 4;
        gy1Var.getClass();
        this.wdg6QnbFHrFF = bx1Var;
        this.OPXfSBeufaJ8 = gy1Var;
    }

    public op0(wy0 wy0Var, xy0 xy0Var, on onVar) {
        this.rtx2ld2ELZv4 = 22;
        this.OPXfSBeufaJ8 = wy0Var;
        this.wdg6QnbFHrFF = onVar;
    }

    public op0(ContentCaptureSession contentCaptureSession, View view) {
        this.rtx2ld2ELZv4 = 11;
        this.wdg6QnbFHrFF = contentCaptureSession;
        this.OPXfSBeufaJ8 = view;
    }

    public /* synthetic */ op0(int i, Object obj, Object obj2) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
        this.wdg6QnbFHrFF = obj2;
    }

    public op0(int i, pe0 pe0Var) {
        this.rtx2ld2ELZv4 = i;
        switch (i) {
            case 10:
                this.OPXfSBeufaJ8 = pe0Var;
                this.wdg6QnbFHrFF = new ConcurrentHashMap();
                break;
            default:
                this.OPXfSBeufaJ8 = pe0Var;
                this.wdg6QnbFHrFF = new ek();
                break;
        }
    }

    public op0(cy0 cy0Var) {
        this.rtx2ld2ELZv4 = 20;
        this.OPXfSBeufaJ8 = cy0Var;
        l81 l81Var = oe1.PxuCJdSBwIXG;
        this.wdg6QnbFHrFF = new l81();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public op0(x1 x1Var) {
        this(2);
        this.rtx2ld2ELZv4 = 2;
        this.wdg6QnbFHrFF = x1Var;
    }
}
