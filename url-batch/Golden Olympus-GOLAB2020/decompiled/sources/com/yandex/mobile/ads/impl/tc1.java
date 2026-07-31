package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import com.ironsource.b9;
import com.yandex.mobile.ads.impl.InterfaceC1861cm;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes3.dex */
final class tc1 {

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f32292a;

        /* renamed from: b, reason: collision with root package name */
        private final hi2 f32293b;

        private a(String str, hi2 hi2Var) {
            this.f32292a = str;
            this.f32293b = hi2Var;
        }
    }

    static void a(op1<?> op1Var, a aVar) {
        gr1 h4 = op1Var.h();
        int j4 = op1Var.j();
        try {
            h4.a(aVar.f32293b);
            op1Var.a(aVar.f32292a + "-retry [timeout=" + j4 + b9.i.f15552e);
        } catch (hi2 e4) {
            op1Var.a(aVar.f32292a + "-timeout-giveup [timeout=" + j4 + b9.i.f15552e);
            throw e4;
        }
    }

    static lc1 a(op1<?> op1Var, long j4, List<ze0> list) {
        InterfaceC1861cm.a c4 = op1Var.c();
        if (c4 == null) {
            return new lc1(304, (byte[]) null, true, j4, list);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<ze0> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<ze0> list2 = c4.f24253h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (ze0 ze0Var : c4.f24253h) {
                    if (!treeSet.contains(ze0Var.a())) {
                        arrayList.add(ze0Var);
                    }
                }
            }
        } else if (!c4.f24252g.isEmpty()) {
            for (Map.Entry<String, String> entry : c4.f24252g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new ze0(entry.getKey(), entry.getValue()));
                }
            }
        }
        return new lc1(304, c4.f24246a, true, j4, (List<ze0>) arrayList);
    }

    static byte[] a(InputStream inputStream, int i4, C2374yl c2374yl) {
        byte[] bArr;
        cj1 cj1Var = new cj1(c2374yl, i4);
        try {
            bArr = c2374yl.a(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    cj1Var.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        boolean z4 = ii2.f27214a;
                        ap0.e(new Object[0]);
                    }
                    c2374yl.a(bArr);
                    cj1Var.close();
                    throw th;
                }
            }
            byte[] byteArray = cj1Var.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                boolean z5 = ii2.f27214a;
                ap0.e(new Object[0]);
            }
            c2374yl.a(bArr);
            cj1Var.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
    }

    static a a(op1<?> op1Var, IOException iOException, long j4, hh0 hh0Var, byte[] bArr) {
        if (iOException instanceof SocketTimeoutException) {
            return new a("socket", new a52());
        }
        if (iOException instanceof MalformedURLException) {
            throw new RuntimeException("Bad URL " + op1Var.l(), iOException);
        }
        if (hh0Var != null) {
            int e4 = hh0Var.e();
            Object[] objArr = {Integer.valueOf(e4), op1Var.l()};
            boolean z4 = ii2.f27214a;
            ap0.b(objArr);
            if (bArr != null) {
                lc1 lc1Var = new lc1(e4, bArr, false, SystemClock.elapsedRealtime() - j4, hh0Var.d());
                if (e4 == 401 || e4 == 403) {
                    return new a("auth", new C2118nh(lc1Var));
                }
                if (e4 >= 400 && e4 <= 499) {
                    throw new so(lc1Var);
                }
                if (e4 >= 500 && e4 <= 599 && op1Var.v()) {
                    return new a(com.ironsource.im.f16720a, new cx1(lc1Var));
                }
                throw new cx1(lc1Var);
            }
            return new a("network", new ic1());
        }
        if (op1Var.u()) {
            return new a("connection", new bd1());
        }
        throw new bd1(iOException);
    }

    static void a(long j4, op1<?> op1Var, byte[] bArr, int i4) {
        if (ii2.f27214a || j4 > 3000) {
            ap0.a(op1Var, Long.valueOf(j4), bArr != null ? Integer.valueOf(bArr.length) : "null", Integer.valueOf(i4), Integer.valueOf(op1Var.h().b()));
        }
    }
}
