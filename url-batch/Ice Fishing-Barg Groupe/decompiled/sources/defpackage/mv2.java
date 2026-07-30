package defpackage;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class mv2 {
    public static final TimeZone PxuCJdSBwIXG;
    public static final String lS5Rgt96tfkO;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        PxuCJdSBwIXG = timeZone;
        String name = if1.class.getName();
        if (pa2.yQRudnv4La6p(name, "okhttp3.", false)) {
            name = name.substring("okhttp3.".length());
        }
        if (ia2.PsecLrZVVK61(name, "Client")) {
            name = name.substring(0, name.length() - "Client".length());
        }
        lS5Rgt96tfkO = name;
    }

    public static final List OPXfSBeufaJ8(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return p50.rtx2ld2ELZv4;
        }
        if (list.size() == 1) {
            List singletonList = Collections.singletonList(list.get(0));
            singletonList.getClass();
            return singletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List asList = Arrays.asList(array);
        asList.getClass();
        List unmodifiableList = Collections.unmodifiableList(asList);
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final boolean PxuCJdSBwIXG(gm0 gm0Var, gm0 gm0Var2) {
        gm0Var.getClass();
        gm0Var2.getClass();
        return cs0.wdg6QnbFHrFF(gm0Var.Y1f8riQaR6yg, gm0Var2.Y1f8riQaR6yg) && gm0Var.e9gEMXR7LXtO == gm0Var2.e9gEMXR7LXtO && cs0.wdg6QnbFHrFF(gm0Var.PxuCJdSBwIXG, gm0Var2.PxuCJdSBwIXG);
    }

    public static final hj0 RAsUl2FVSrh6(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fj0 fj0Var = (fj0) it.next();
            ah ahVar = fj0Var.PxuCJdSBwIXG;
            ah ahVar2 = fj0Var.lS5Rgt96tfkO;
            String x50lh2ztY7Y5 = ahVar.x50lh2ztY7Y5();
            String x50lh2ztY7Y52 = ahVar2.x50lh2ztY7Y5();
            arrayList.add(x50lh2ztY7Y5);
            arrayList.add(ia2.GlTbNTgfSMqy(x50lh2ztY7Y52).toString());
        }
        return new hj0((String[]) arrayList.toArray(new String[0]));
    }

    public static final void TSizfFm2Yiuu(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!cs0.wdg6QnbFHrFF(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final String Y1f8riQaR6yg(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final boolean a92UlCVFR9N8(o82 o82Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long nanoTime = System.nanoTime();
        long TSizfFm2Yiuu = o82Var.TSizfFm2Yiuu().e9gEMXR7LXtO() ? o82Var.TSizfFm2Yiuu().TSizfFm2Yiuu() - nanoTime : Long.MAX_VALUE;
        o82Var.TSizfFm2Yiuu().Y1f8riQaR6yg(Math.min(TSizfFm2Yiuu, timeUnit.toNanos(i)) + nanoTime);
        try {
            yf yfVar = new yf();
            while (o82Var.RAsUl2FVSrh6(8192L, yfVar) != -1) {
                yfVar.skip(yfVar.OPXfSBeufaJ8);
            }
            if (TSizfFm2Yiuu == Long.MAX_VALUE) {
                o82Var.TSizfFm2Yiuu().PxuCJdSBwIXG();
                return true;
            }
            o82Var.TSizfFm2Yiuu().Y1f8riQaR6yg(nanoTime + TSizfFm2Yiuu);
            return true;
        } catch (InterruptedIOException unused) {
            if (TSizfFm2Yiuu == Long.MAX_VALUE) {
                o82Var.TSizfFm2Yiuu().PxuCJdSBwIXG();
                return false;
            }
            o82Var.TSizfFm2Yiuu().Y1f8riQaR6yg(nanoTime + TSizfFm2Yiuu);
            return false;
        } catch (Throwable th) {
            if (TSizfFm2Yiuu == Long.MAX_VALUE) {
                o82Var.TSizfFm2Yiuu().PxuCJdSBwIXG();
            } else {
                o82Var.TSizfFm2Yiuu().Y1f8riQaR6yg(nanoTime + TSizfFm2Yiuu);
            }
            throw th;
        }
    }

    public static final long e9gEMXR7LXtO(nv1 nv1Var) {
        String PxuCJdSBwIXG2 = nv1Var.cpQdD2nAriOS.PxuCJdSBwIXG("Content-Length");
        if (PxuCJdSBwIXG2 == null) {
            return -1L;
        }
        byte[] bArr = kv2.PxuCJdSBwIXG;
        try {
            return Long.parseLong(PxuCJdSBwIXG2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final int lS5Rgt96tfkO(String str, long j) {
        TimeUnit.MILLISECONDS.getClass();
        if (j < 0) {
            rc1.e9gEMXR7LXtO(str.concat(" < 0"));
            return 0;
        }
        if (j > 2147483647L) {
            u9.e9gEMXR7LXtO(str.concat(" too large"));
            return 0;
        }
        if (j != 0 || j <= 0) {
            return (int) j;
        }
        u9.e9gEMXR7LXtO(str.concat(" too small"));
        return 0;
    }

    public static final String rtx2ld2ELZv4(gm0 gm0Var, boolean z) {
        gm0Var.getClass();
        int i = gm0Var.e9gEMXR7LXtO;
        String str = gm0Var.Y1f8riQaR6yg;
        if (ia2.jJwa0q7P5wHq(str, ":", false)) {
            str = o0.dgRBjINgWbAK("[", str, ']');
        }
        if (!z) {
            fm0 fm0Var = gm0.Companion;
            String str2 = gm0Var.PxuCJdSBwIXG;
            fm0Var.getClass();
            if (i == fm0.PxuCJdSBwIXG(str2)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List wdg6QnbFHrFF(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return p50.rtx2ld2ELZv4;
        }
        if (objArr.length == 1) {
            List singletonList = Collections.singletonList(objArr[0]);
            singletonList.getClass();
            return singletonList;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        objArr2.getClass();
        List asList = Arrays.asList(objArr2);
        asList.getClass();
        List unmodifiableList = Collections.unmodifiableList(asList);
        unmodifiableList.getClass();
        return unmodifiableList;
    }
}
