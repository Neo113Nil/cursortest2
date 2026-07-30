package defpackage;

import android.graphics.Typeface;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import com.ice.fishing.grenza.data.remote.AnatoliaRequestFrame;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class e0 implements hb, g82, vp2 {
    public Object OPXfSBeufaJ8;
    public Object dgRBjINgWbAK;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public Object wdg6QnbFHrFF;
    public Object x50lh2ztY7Y5;

    public e0(Typeface typeface, a61 a61Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.rtx2ld2ELZv4 = 5;
        this.x50lh2ztY7Y5 = typeface;
        this.OPXfSBeufaJ8 = a61Var;
        this.dgRBjINgWbAK = new b61(1024);
        int PxuCJdSBwIXG = a61Var.PxuCJdSBwIXG(6);
        if (PxuCJdSBwIXG != 0) {
            int i5 = PxuCJdSBwIXG + a61Var.rtx2ld2ELZv4;
            i = ((ByteBuffer) a61Var.dgRBjINgWbAK).getInt(((ByteBuffer) a61Var.dgRBjINgWbAK).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.wdg6QnbFHrFF = new char[i * 2];
        int PxuCJdSBwIXG2 = a61Var.PxuCJdSBwIXG(6);
        if (PxuCJdSBwIXG2 != 0) {
            int i6 = PxuCJdSBwIXG2 + a61Var.rtx2ld2ELZv4;
            i2 = ((ByteBuffer) a61Var.dgRBjINgWbAK).getInt(((ByteBuffer) a61Var.dgRBjINgWbAK).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            xm2 xm2Var = new xm2(this, i7);
            z51 lS5Rgt96tfkO = xm2Var.lS5Rgt96tfkO();
            int PxuCJdSBwIXG3 = lS5Rgt96tfkO.PxuCJdSBwIXG(4);
            Character.toChars(PxuCJdSBwIXG3 != 0 ? ((ByteBuffer) lS5Rgt96tfkO.dgRBjINgWbAK).getInt(PxuCJdSBwIXG3 + lS5Rgt96tfkO.rtx2ld2ELZv4) : 0, (char[]) this.wdg6QnbFHrFF, i7 * 2);
            z51 lS5Rgt96tfkO2 = xm2Var.lS5Rgt96tfkO();
            int PxuCJdSBwIXG4 = lS5Rgt96tfkO2.PxuCJdSBwIXG(16);
            if (PxuCJdSBwIXG4 != 0) {
                int i8 = PxuCJdSBwIXG4 + lS5Rgt96tfkO2.rtx2ld2ELZv4;
                i3 = ((ByteBuffer) lS5Rgt96tfkO2.dgRBjINgWbAK).getInt(((ByteBuffer) lS5Rgt96tfkO2.dgRBjINgWbAK).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (!(i3 > 0)) {
                u9.XL4ISE6Oc65B("invalid metadata codepoint length");
                throw null;
            }
            b61 b61Var = (b61) this.dgRBjINgWbAK;
            z51 lS5Rgt96tfkO3 = xm2Var.lS5Rgt96tfkO();
            int PxuCJdSBwIXG5 = lS5Rgt96tfkO3.PxuCJdSBwIXG(16);
            if (PxuCJdSBwIXG5 != 0) {
                int i9 = PxuCJdSBwIXG5 + lS5Rgt96tfkO3.rtx2ld2ELZv4;
                i4 = ((ByteBuffer) lS5Rgt96tfkO3.dgRBjINgWbAK).getInt(((ByteBuffer) lS5Rgt96tfkO3.dgRBjINgWbAK).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            b61Var.PxuCJdSBwIXG(xm2Var, 0, i4 - 1);
        }
    }

    public static void VhhvGxCb8gfr(e0 e0Var, fs1 fs1Var, fs1 fs1Var2, int i) {
        i2 i2Var;
        if ((i & 1) != 0) {
            fs1Var = null;
        }
        if ((i & 4) != 0) {
            fs1Var2 = null;
        }
        e0Var.getClass();
        TimeZone timeZone = mv2.PxuCJdSBwIXG;
        boolean isShutdown = ((ThreadPoolExecutor) e0Var.a92UlCVFR9N8()).isShutdown();
        synchronized (e0Var) {
            if (fs1Var2 != null) {
                try {
                    fs1Var2.OPXfSBeufaJ8.decrementAndGet();
                    if (!((ArrayDeque) e0Var.dgRBjINgWbAK).remove(fs1Var2)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (fs1Var != null) {
                ((ArrayDeque) e0Var.wdg6QnbFHrFF).add(fs1Var);
            }
            if (fs1Var2 != null && (isShutdown || ((ArrayDeque) e0Var.dgRBjINgWbAK).isEmpty())) {
                ((ArrayDeque) e0Var.x50lh2ztY7Y5).isEmpty();
            }
            int i2 = 9;
            if (isShutdown) {
                List i3 = zk.i((ArrayDeque) e0Var.wdg6QnbFHrFF);
                ((ArrayDeque) e0Var.wdg6QnbFHrFF).clear();
                i2Var = new i2(i2, i3);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) e0Var.wdg6QnbFHrFF).iterator();
                it.getClass();
                while (it.hasNext()) {
                    fs1 fs1Var3 = (fs1) it.next();
                    if (((ArrayDeque) e0Var.dgRBjINgWbAK).size() >= 64) {
                        break;
                    }
                    if (fs1Var3.OPXfSBeufaJ8.get() < 5) {
                        it.remove();
                        fs1Var3.OPXfSBeufaJ8.incrementAndGet();
                        arrayList.add(fs1Var3);
                        ((ArrayDeque) e0Var.dgRBjINgWbAK).add(fs1Var3);
                    }
                }
                i2Var = new i2(i2, arrayList);
            }
        }
        int size = ((List) i2Var.OPXfSBeufaJ8).size();
        boolean z = true;
        for (int i4 = 0; i4 < size; i4++) {
            fs1 fs1Var4 = (fs1) ((List) i2Var.OPXfSBeufaJ8).get(i4);
            if (fs1Var4 == fs1Var) {
                z = false;
            } else {
                fs1Var4.wdg6QnbFHrFF.dgRBjINgWbAK.getClass();
            }
            if (isShutdown) {
                fs1Var4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                fs1Var4.wdg6QnbFHrFF.rtx2ld2ELZv4(interruptedIOException);
                vs1.TSizfFm2Yiuu((vs1) fs1Var4.rtx2ld2ELZv4.OPXfSBeufaJ8, interruptedIOException, 6);
            } else {
                ExecutorService a92UlCVFR9N8 = e0Var.a92UlCVFR9N8();
                fs1Var4.getClass();
                js1 js1Var = fs1Var4.wdg6QnbFHrFF;
                js1Var.rtx2ld2ELZv4.PxuCJdSBwIXG.getClass();
                try {
                    try {
                        ((ThreadPoolExecutor) a92UlCVFR9N8).execute(fs1Var4);
                    } catch (Throwable th2) {
                        e0 e0Var2 = js1Var.rtx2ld2ELZv4.PxuCJdSBwIXG;
                        e0Var2.getClass();
                        VhhvGxCb8gfr(e0Var2, null, fs1Var4, 3);
                        throw th2;
                    }
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                    interruptedIOException2.initCause(e);
                    fs1Var4.wdg6QnbFHrFF.rtx2ld2ELZv4(interruptedIOException2);
                    vs1.TSizfFm2Yiuu((vs1) fs1Var4.rtx2ld2ELZv4.OPXfSBeufaJ8, interruptedIOException2, 6);
                    e0 e0Var3 = js1Var.rtx2ld2ELZv4.PxuCJdSBwIXG;
                    e0Var3.getClass();
                    VhhvGxCb8gfr(e0Var3, null, fs1Var4, 3);
                }
            }
        }
        if (!z || fs1Var == null) {
            return;
        }
        fs1Var.wdg6QnbFHrFF.dgRBjINgWbAK.getClass();
    }

    @Override // defpackage.g82
    public y52 BRwzKIf41E4i() {
        return (bx) this.x50lh2ztY7Y5;
    }

    public e0 EcgxDIVH5in8() {
        CharSequence charSequence = (CharSequence) this.wdg6QnbFHrFF;
        Matcher matcher = (Matcher) this.OPXfSBeufaJ8;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return kj0.TSizfFm2Yiuu(matcher2, end, charSequence);
    }

    public o8 OPXfSBeufaJ8(long j, o8 o8Var, o8 o8Var2) {
        if (((o8) this.dgRBjINgWbAK) == null) {
            this.dgRBjINgWbAK = o8Var.TSizfFm2Yiuu();
        }
        o8 o8Var3 = (o8) this.dgRBjINgWbAK;
        if (o8Var3 == null) {
            cs0.tmVwIGCQF4zR("velocityVector");
            throw null;
        }
        int lS5Rgt96tfkO = o8Var3.lS5Rgt96tfkO();
        int i = 0;
        while (true) {
            o8 o8Var4 = (o8) this.dgRBjINgWbAK;
            if (i >= lS5Rgt96tfkO) {
                if (o8Var4 != null) {
                    return o8Var4;
                }
                cs0.tmVwIGCQF4zR("velocityVector");
                throw null;
            }
            if (o8Var4 == null) {
                cs0.tmVwIGCQF4zR("velocityVector");
                throw null;
            }
            b42 b42Var = (b42) this.OPXfSBeufaJ8;
            o8Var.getClass();
            long j2 = j / 1000000;
            h80 PxuCJdSBwIXG = ((i80) b42Var.OPXfSBeufaJ8).PxuCJdSBwIXG(o8Var2.PxuCJdSBwIXG(i));
            long j3 = PxuCJdSBwIXG.TSizfFm2Yiuu;
            o8Var4.e9gEMXR7LXtO((((Math.signum(PxuCJdSBwIXG.PxuCJdSBwIXG) * p3.PxuCJdSBwIXG(j3 > 0 ? j2 / j3 : 1.0f).lS5Rgt96tfkO) * PxuCJdSBwIXG.lS5Rgt96tfkO) / j3) * 1000.0f, i);
            i++;
        }
    }

    @Override // defpackage.sp2
    public o8 QrzZRwfaDlRX(long j, o8 o8Var, o8 o8Var2, o8 o8Var3) {
        if (((o8) this.wdg6QnbFHrFF) == null) {
            this.wdg6QnbFHrFF = o8Var.TSizfFm2Yiuu();
        }
        o8 o8Var4 = (o8) this.wdg6QnbFHrFF;
        if (o8Var4 == null) {
            cs0.tmVwIGCQF4zR("valueVector");
            throw null;
        }
        int lS5Rgt96tfkO = o8Var4.lS5Rgt96tfkO();
        int i = 0;
        while (true) {
            o8 o8Var5 = (o8) this.wdg6QnbFHrFF;
            if (i >= lS5Rgt96tfkO) {
                if (o8Var5 != null) {
                    return o8Var5;
                }
                cs0.tmVwIGCQF4zR("valueVector");
                throw null;
            }
            if (o8Var5 == null) {
                cs0.tmVwIGCQF4zR("valueVector");
                throw null;
            }
            o8Var5.e9gEMXR7LXtO(((b42) this.OPXfSBeufaJ8).rtx2ld2ELZv4(i).lS5Rgt96tfkO(j, o8Var.PxuCJdSBwIXG(i), o8Var2.PxuCJdSBwIXG(i), o8Var3.PxuCJdSBwIXG(i)), i);
            i++;
        }
    }

    public ru RAsUl2FVSrh6() {
        ru ruVar = (ru) ((ae0) this.dgRBjINgWbAK).PxuCJdSBwIXG();
        if (ruVar != null) {
            return ruVar;
        }
        u9.rtx2ld2ELZv4("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public void RfyTYNmI9Srp(String str, av1 av1Var) {
        str.getClass();
        if (str.length() <= 0) {
            u9.XL4ISE6Oc65B("method.isEmpty() == true");
            return;
        }
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
            u9.e9gEMXR7LXtO(o0.x50lh2ztY7Y5("method ", str, " must have a request body."));
        } else {
            this.wdg6QnbFHrFF = str;
        }
    }

    public void S9EYkSpbGuxq(vs1 vs1Var, nv1 nv1Var) {
        char[] cArr;
        tt0 tt0Var = ((g0) this.OPXfSBeufaJ8).TSizfFm2Yiuu;
        AnatoliaRequestFrame anatoliaRequestFrame = (AnatoliaRequestFrame) this.wdg6QnbFHrFF;
        tt0Var.getClass();
        KSerializer serializer = AnatoliaRequestFrame.Companion.serializer();
        serializer.getClass();
        um umVar = new um(2);
        jj jjVar = jj.TSizfFm2Yiuu;
        synchronized (jjVar) {
            da daVar = jjVar.PxuCJdSBwIXG;
            cArr = (char[]) (daVar.isEmpty() ? null : daVar.removeLast());
            if (cArr != null) {
                jjVar.lS5Rgt96tfkO -= cArr.length;
            } else {
                cArr = null;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        umVar.TSizfFm2Yiuu = cArr;
        try {
            new ca2(new gp(umVar), tt0Var, fv2.wdg6QnbFHrFF, new ca2[fv2.QrzZRwfaDlRX.PxuCJdSBwIXG()]).dgRBjINgWbAK(serializer, anatoliaRequestFrame);
            String umVar2 = umVar.toString();
            umVar.wdg6QnbFHrFF();
            ah.Companion.getClass();
            ah lS5Rgt96tfkO = zg.lS5Rgt96tfkO(umVar2);
            synchronized (vs1Var) {
                if (!vs1Var.S9EYkSpbGuxq && !vs1Var.XL4ISE6Oc65B) {
                    long j = vs1Var.BRwzKIf41E4i;
                    byte[] bArr = lS5Rgt96tfkO.rtx2ld2ELZv4;
                    if (bArr.length + j > 16777216) {
                        vs1Var.lS5Rgt96tfkO(null, 1001);
                        g0.lS5Rgt96tfkO((g0) this.OPXfSBeufaJ8, (bi) this.dgRBjINgWbAK, (AtomicBoolean) this.x50lh2ztY7Y5, new IOException("Failed to send request frame"));
                    } else {
                        vs1Var.BRwzKIf41E4i = j + bArr.length;
                        vs1Var.gPXPFXrUH4XX.add(new us1(lS5Rgt96tfkO));
                        vs1Var.e9gEMXR7LXtO();
                        return;
                    }
                }
                g0.lS5Rgt96tfkO((g0) this.OPXfSBeufaJ8, (bi) this.dgRBjINgWbAK, (AtomicBoolean) this.x50lh2ztY7Y5, new IOException("Failed to send request frame"));
            }
        } catch (Throwable th) {
            umVar.wdg6QnbFHrFF();
            throw th;
        }
    }

    public void TSizfFm2Yiuu(String str, String str2) {
        this.x50lh2ztY7Y5 = ((String) this.x50lh2ztY7Y5) + (((String) this.x50lh2ztY7Y5).length() == 0 ? "?" : "&") + str + '=' + str2;
    }

    @Override // defpackage.g82
    public o82 XL4ISE6Oc65B() {
        return (cx) this.dgRBjINgWbAK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r0 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
    
        if (r0 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Y1f8riQaR6yg(long j, long j2, ct ctVar) {
        zc1 zc1Var;
        int i;
        long j3;
        if (ctVar instanceof zc1) {
            zc1Var = (zc1) ctVar;
            int i2 = zc1Var.cpQdD2nAriOS;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zc1Var.cpQdD2nAriOS = i2 - Integer.MIN_VALUE;
                zc1 zc1Var2 = zc1Var;
                Object obj = zc1Var2.dgRBjINgWbAK;
                i = zc1Var2.cpQdD2nAriOS;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    dd1 dd1Var = (dd1) this.OPXfSBeufaJ8;
                    dd1 X1HMmH2Ks65g = dd1Var != null ? dd1Var.X1HMmH2Ks65g() : null;
                    j3 = 0;
                    su suVar = su.rtx2ld2ELZv4;
                    if (X1HMmH2Ks65g == null) {
                        dd1 dd1Var2 = (dd1) this.wdg6QnbFHrFF;
                        if (dd1Var2 != null) {
                            zc1Var2.cpQdD2nAriOS = 1;
                            obj = dd1Var2.fkblLSN2bAgv(j, j2, zc1Var2);
                        } else {
                            yp2.Companion.getClass();
                        }
                    } else {
                        dd1 dd1Var3 = (dd1) this.OPXfSBeufaJ8;
                        dd1 X1HMmH2Ks65g2 = dd1Var3 != null ? dd1Var3.X1HMmH2Ks65g() : null;
                        if (X1HMmH2Ks65g2 != null) {
                            zc1Var2.cpQdD2nAriOS = 2;
                            obj = X1HMmH2Ks65g2.fkblLSN2bAgv(j, j2, zc1Var2);
                        } else {
                            yp2.Companion.getClass();
                        }
                    }
                } else if (i == 1) {
                    ng0.tmVwIGCQF4zR(obj);
                    j3 = ((yp2) obj).PxuCJdSBwIXG;
                } else {
                    if (i != 2) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                    j3 = ((yp2) obj).PxuCJdSBwIXG;
                }
                return new yp2(j3);
            }
        }
        zc1Var = new zc1(this, ctVar);
        zc1 zc1Var22 = zc1Var;
        Object obj2 = zc1Var22.dgRBjINgWbAK;
        i = zc1Var22.cpQdD2nAriOS;
        if (i != 0) {
        }
        return new yp2(j3);
    }

    public synchronized ExecutorService a92UlCVFR9N8() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.OPXfSBeufaJ8) == null) {
                this.OPXfSBeufaJ8 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new lv2(mv2.lS5Rgt96tfkO + " Dispatcher", false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.OPXfSBeufaJ8;
            threadPoolExecutor.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    @Override // defpackage.g82
    public void cancel() {
        ((Socket) this.OPXfSBeufaJ8).close();
    }

    public void cpQdD2nAriOS(String str, String str2) {
        str2.getClass();
        jd0 jd0Var = (jd0) this.dgRBjINgWbAK;
        jd0Var.getClass();
        kj0.kpCQ9veP6n3I(str);
        kj0.rZjpSjn4zoMv(str2, str);
        jd0Var.TSizfFm2Yiuu(str);
        kj0.r3s1LDPKFs1S(jd0Var, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e9gEMXR7LXtO(long j, ct ctVar) {
        ad1 ad1Var;
        int i;
        long j2;
        if (ctVar instanceof ad1) {
            ad1Var = (ad1) ctVar;
            int i2 = ad1Var.cpQdD2nAriOS;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ad1Var.cpQdD2nAriOS = i2 - Integer.MIN_VALUE;
                Object obj = ad1Var.dgRBjINgWbAK;
                i = ad1Var.cpQdD2nAriOS;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    dd1 dd1Var = (dd1) this.OPXfSBeufaJ8;
                    dd1 X1HMmH2Ks65g = dd1Var != null ? dd1Var.X1HMmH2Ks65g() : null;
                    if (X1HMmH2Ks65g == null) {
                        yp2.Companion.getClass();
                        j2 = 0;
                        return new yp2(j2);
                    }
                    ad1Var.cpQdD2nAriOS = 1;
                    obj = X1HMmH2Ks65g.MDTGUQSX7PXD(j, ad1Var);
                    su suVar = su.rtx2ld2ELZv4;
                    if (obj == suVar) {
                        return suVar;
                    }
                } else {
                    if (i != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                }
                j2 = ((yp2) obj).PxuCJdSBwIXG;
                return new yp2(j2);
            }
        }
        ad1Var = new ad1(this, ctVar);
        Object obj2 = ad1Var.dgRBjINgWbAK;
        i = ad1Var.cpQdD2nAriOS;
        if (i != 0) {
        }
        j2 = ((yp2) obj2).PxuCJdSBwIXG;
        return new yp2(j2);
    }

    @Override // defpackage.sp2
    public o8 gPXPFXrUH4XX(o8 o8Var, o8 o8Var2, o8 o8Var3) {
        if (((o8) this.x50lh2ztY7Y5) == null) {
            this.x50lh2ztY7Y5 = o8Var3.TSizfFm2Yiuu();
        }
        o8 o8Var4 = (o8) this.x50lh2ztY7Y5;
        if (o8Var4 == null) {
            cs0.tmVwIGCQF4zR("endVelocityVector");
            throw null;
        }
        int lS5Rgt96tfkO = o8Var4.lS5Rgt96tfkO();
        int i = 0;
        while (true) {
            o8 o8Var5 = (o8) this.x50lh2ztY7Y5;
            if (i >= lS5Rgt96tfkO) {
                if (o8Var5 != null) {
                    return o8Var5;
                }
                cs0.tmVwIGCQF4zR("endVelocityVector");
                throw null;
            }
            if (o8Var5 == null) {
                cs0.tmVwIGCQF4zR("endVelocityVector");
                throw null;
            }
            o8Var5.e9gEMXR7LXtO(((b42) this.OPXfSBeufaJ8).rtx2ld2ELZv4(i).e9gEMXR7LXtO(o8Var.PxuCJdSBwIXG(i), o8Var2.PxuCJdSBwIXG(i), o8Var3.PxuCJdSBwIXG(i)), i);
            i++;
        }
    }

    @Override // defpackage.sp2
    public long lS5Rgt96tfkO(o8 o8Var, o8 o8Var2, o8 o8Var3) {
        int lS5Rgt96tfkO = o8Var.lS5Rgt96tfkO();
        long j = 0;
        for (int i = 0; i < lS5Rgt96tfkO; i++) {
            j = Math.max(j, ((b42) this.OPXfSBeufaJ8).rtx2ld2ELZv4(i).Y1f8riQaR6yg(o8Var.PxuCJdSBwIXG(i), o8Var2.PxuCJdSBwIXG(i), o8Var3.PxuCJdSBwIXG(i)));
        }
        return j;
    }

    public br0 rtx2ld2ELZv4() {
        Matcher matcher = (Matcher) this.OPXfSBeufaJ8;
        return ng0.nLZGh9p8gVSu(matcher.start(), matcher.end());
    }

    public String toString() {
        switch (this.rtx2ld2ELZv4) {
            case 2:
                String socket = ((Socket) this.OPXfSBeufaJ8).toString();
                socket.getClass();
                return socket;
            default:
                return super.toString();
        }
    }

    public dr2 wdg6QnbFHrFF(ck ckVar, String str) {
        dr2 dr2Var;
        dr2 PxuCJdSBwIXG;
        synchronized (((fb0) this.x50lh2ztY7Y5)) {
            try {
                dr2Var = (dr2) ((or2) this.OPXfSBeufaJ8).PxuCJdSBwIXG.get(str);
                if (ckVar.Y1f8riQaR6yg(dr2Var)) {
                    kr2 kr2Var = (kr2) this.wdg6QnbFHrFF;
                    if (kr2Var instanceof rz1) {
                        rz1 rz1Var = (rz1) kr2Var;
                        dr2Var.getClass();
                        s01 s01Var = rz1Var.Y1f8riQaR6yg;
                        if (s01Var != null) {
                            cr1 cr1Var = rz1Var.e9gEMXR7LXtO;
                            cr1Var.getClass();
                            ni0.rtx2ld2ELZv4(dr2Var, cr1Var, s01Var);
                        }
                    }
                    dr2Var.getClass();
                } else {
                    z71 z71Var = new z71((zu) this.dgRBjINgWbAK);
                    z71Var.PxuCJdSBwIXG.put(nr2.lS5Rgt96tfkO, str);
                    kr2 kr2Var2 = (kr2) this.wdg6QnbFHrFF;
                    kr2Var2.getClass();
                    try {
                        try {
                            PxuCJdSBwIXG = kr2Var2.TSizfFm2Yiuu(ckVar, z71Var);
                        } catch (AbstractMethodError unused) {
                            PxuCJdSBwIXG = kr2Var2.PxuCJdSBwIXG(kj0.e6tOsSdd2EFb(ckVar));
                        }
                    } catch (AbstractMethodError unused2) {
                        PxuCJdSBwIXG = kr2Var2.lS5Rgt96tfkO(kj0.e6tOsSdd2EFb(ckVar), z71Var);
                    }
                    dr2Var = PxuCJdSBwIXG;
                    or2 or2Var = (or2) this.OPXfSBeufaJ8;
                    or2Var.getClass();
                    dr2Var.getClass();
                    dr2 dr2Var2 = (dr2) or2Var.PxuCJdSBwIXG.put(str, dr2Var);
                    if (dr2Var2 != null) {
                        dr2Var2.lS5Rgt96tfkO();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dr2Var;
    }

    @Override // defpackage.sp2
    public o8 x50lh2ztY7Y5(long j, o8 o8Var, o8 o8Var2, o8 o8Var3) {
        if (((o8) this.dgRBjINgWbAK) == null) {
            this.dgRBjINgWbAK = o8Var3.TSizfFm2Yiuu();
        }
        o8 o8Var4 = (o8) this.dgRBjINgWbAK;
        if (o8Var4 == null) {
            cs0.tmVwIGCQF4zR("velocityVector");
            throw null;
        }
        int lS5Rgt96tfkO = o8Var4.lS5Rgt96tfkO();
        int i = 0;
        while (true) {
            o8 o8Var5 = (o8) this.dgRBjINgWbAK;
            if (i >= lS5Rgt96tfkO) {
                if (o8Var5 != null) {
                    return o8Var5;
                }
                cs0.tmVwIGCQF4zR("velocityVector");
                throw null;
            }
            if (o8Var5 == null) {
                cs0.tmVwIGCQF4zR("velocityVector");
                throw null;
            }
            o8Var5.e9gEMXR7LXtO(((b42) this.OPXfSBeufaJ8).rtx2ld2ELZv4(i).TSizfFm2Yiuu(j, o8Var.PxuCJdSBwIXG(i), o8Var2.PxuCJdSBwIXG(i), o8Var3.PxuCJdSBwIXG(i)), i);
            i++;
        }
    }

    public /* synthetic */ e0(boolean z) {
        this.rtx2ld2ELZv4 = 7;
    }

    public e0(g0 g0Var, AnatoliaRequestFrame anatoliaRequestFrame, bi biVar, AtomicBoolean atomicBoolean) {
        this.rtx2ld2ELZv4 = 0;
        this.OPXfSBeufaJ8 = g0Var;
        this.wdg6QnbFHrFF = anatoliaRequestFrame;
        this.dgRBjINgWbAK = biVar;
        this.x50lh2ztY7Y5 = atomicBoolean;
    }

    public e0(or2 or2Var, kr2 kr2Var, zu zuVar) {
        this.rtx2ld2ELZv4 = 11;
        or2Var.getClass();
        kr2Var.getClass();
        zuVar.getClass();
        this.OPXfSBeufaJ8 = or2Var;
        this.wdg6QnbFHrFF = kr2Var;
        this.dgRBjINgWbAK = zuVar;
        this.x50lh2ztY7Y5 = new fb0(17);
    }

    public e0(int i) {
        this.rtx2ld2ELZv4 = i;
        switch (i) {
            case 6:
                this.dgRBjINgWbAK = new y4(9, this);
                break;
            case 7:
                this.x50lh2ztY7Y5 = ih0.QrzZRwfaDlRX;
                this.wdg6QnbFHrFF = "GET";
                this.dgRBjINgWbAK = new jd0(1);
                break;
            default:
                this.wdg6QnbFHrFF = new ArrayDeque();
                this.dgRBjINgWbAK = new ArrayDeque();
                this.x50lh2ztY7Y5 = new ArrayDeque();
                break;
        }
    }

    public e0(Socket socket) {
        this.rtx2ld2ELZv4 = 2;
        this.OPXfSBeufaJ8 = socket;
        this.wdg6QnbFHrFF = new AtomicInteger();
        this.dgRBjINgWbAK = new cx(this);
        this.x50lh2ztY7Y5 = new bx(this);
    }

    public e0(r1 r1Var, ob obVar) {
        this.rtx2ld2ELZv4 = 1;
        this.OPXfSBeufaJ8 = r1Var;
        this.wdg6QnbFHrFF = obVar;
        AutofillManager RAsUl2FVSrh6 = Nlhe969cAGO8.RAsUl2FVSrh6(r1Var.getContext().getSystemService(Nlhe969cAGO8.x50lh2ztY7Y5()));
        if (RAsUl2FVSrh6 != null) {
            this.dgRBjINgWbAK = RAsUl2FVSrh6;
            r1Var.setImportantForAutofill(1);
            HqMwxkFaipxD RfyTYNmI9Srp = ng0.RfyTYNmI9Srp(r1Var);
            AutofillId e9gEMXR7LXtO = RfyTYNmI9Srp != null ? Nlhe969cAGO8.e9gEMXR7LXtO(RfyTYNmI9Srp.PxuCJdSBwIXG) : null;
            if (e9gEMXR7LXtO != null) {
                this.x50lh2ztY7Y5 = e9gEMXR7LXtO;
                return;
            }
            throw o0.a92UlCVFR9N8("Required value was null.");
        }
        u9.rtx2ld2ELZv4("Autofill service could not be located.");
        throw null;
    }

    public e0(KSerializer kSerializer) {
        this.rtx2ld2ELZv4 = 8;
        this.dgRBjINgWbAK = "";
        this.x50lh2ztY7Y5 = "";
        this.OPXfSBeufaJ8 = kSerializer;
        this.wdg6QnbFHrFF = kSerializer.getDescriptor().lS5Rgt96tfkO();
    }

    public /* synthetic */ e0(int i, Object obj) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
    }

    public e0(Matcher matcher, CharSequence charSequence) {
        this.rtx2ld2ELZv4 = 4;
        charSequence.getClass();
        this.OPXfSBeufaJ8 = matcher;
        this.wdg6QnbFHrFF = charSequence;
        this.dgRBjINgWbAK = new z41(0, this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e0(m80 m80Var) {
        this(9, new b42(14, m80Var));
        this.rtx2ld2ELZv4 = 9;
    }
}
