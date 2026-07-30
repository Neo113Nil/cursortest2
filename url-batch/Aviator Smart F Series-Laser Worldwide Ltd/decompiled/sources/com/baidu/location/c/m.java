package com.baidu.location.c;

import android.net.wifi.ScanResult;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public List<ScanResult> f5138a;

    /* renamed from: b, reason: collision with root package name */
    public long f5139b;

    /* renamed from: c, reason: collision with root package name */
    public long f5140c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5142e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5141d = false;

    /* renamed from: f, reason: collision with root package name */
    public String f5143f = null;

    /* renamed from: g, reason: collision with root package name */
    public String f5144g = null;

    public m(List<ScanResult> list, long j8) {
        this.f5140c = 0L;
        this.f5139b = j8;
        this.f5138a = list;
        this.f5140c = System.currentTimeMillis();
        try {
            d();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private void d() {
        /*
            r7 = this;
            int r0 = r7.a()
            r1 = 1
            if (r0 >= r1) goto L8
            return
        L8:
            java.util.List<android.net.wifi.ScanResult> r0 = r7.f5138a
            int r0 = r0.size()
            int r0 = r0 - r1
            r2 = 1
        L10:
            if (r0 < r1) goto L60
            if (r2 == 0) goto L60
            r2 = 0
            r3 = 0
        L16:
            if (r2 >= r0) goto L5c
            java.util.List<android.net.wifi.ScanResult> r4 = r7.f5138a
            java.lang.Object r4 = r4.get(r2)
            if (r4 == 0) goto L59
            java.util.List<android.net.wifi.ScanResult> r4 = r7.f5138a
            int r5 = r2 + 1
            java.lang.Object r4 = r4.get(r5)
            if (r4 == 0) goto L59
            java.util.List<android.net.wifi.ScanResult> r4 = r7.f5138a
            java.lang.Object r4 = r4.get(r2)
            android.net.wifi.ScanResult r4 = (android.net.wifi.ScanResult) r4
            int r4 = r4.level
            java.util.List<android.net.wifi.ScanResult> r6 = r7.f5138a
            java.lang.Object r6 = r6.get(r5)
            android.net.wifi.ScanResult r6 = (android.net.wifi.ScanResult) r6
            int r6 = r6.level
            if (r4 >= r6) goto L59
            java.util.List<android.net.wifi.ScanResult> r3 = r7.f5138a
            java.lang.Object r3 = r3.get(r5)
            android.net.wifi.ScanResult r3 = (android.net.wifi.ScanResult) r3
            java.util.List<android.net.wifi.ScanResult> r4 = r7.f5138a
            java.lang.Object r6 = r4.get(r2)
            android.net.wifi.ScanResult r6 = (android.net.wifi.ScanResult) r6
            r4.set(r5, r6)
            java.util.List<android.net.wifi.ScanResult> r4 = r7.f5138a
            r4.set(r2, r3)
            r3 = 1
        L59:
            int r2 = r2 + 1
            goto L16
        L5c:
            int r0 = r0 + (-1)
            r2 = r3
            goto L10
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.c.m.d():void");
    }

    public int a() {
        List<ScanResult> list = this.f5138a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public boolean b() {
        return System.currentTimeMillis() - this.f5140c > 0 && System.currentTimeMillis() - this.f5140c < 5000;
    }

    public boolean c() {
        return System.currentTimeMillis() - this.f5139b > 0 && System.currentTimeMillis() - this.f5139b < 5000;
    }

    public boolean a(m mVar) {
        List<ScanResult> list = this.f5138a;
        if (list == null || mVar == null || mVar.f5138a == null) {
            return false;
        }
        int min = Math.min(list.size(), mVar.f5138a.size());
        for (int i8 = 0; i8 < min; i8++) {
            if (this.f5138a.get(i8) != null) {
                String str = this.f5138a.get(i8).BSSID;
                int i9 = this.f5138a.get(i8).level;
                String str2 = mVar.f5138a.get(i8).BSSID;
                int i10 = mVar.f5138a.get(i8).level;
                if ((!TextUtils.isEmpty(str) && !str.equals(str2)) || i9 != i10) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean a(m mVar, float f8) {
        return com.baidu.location.c.a.b.a(mVar, this, f8);
    }
}
