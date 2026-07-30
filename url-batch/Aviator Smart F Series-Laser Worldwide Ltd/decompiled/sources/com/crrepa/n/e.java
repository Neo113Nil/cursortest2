package com.crrepa.n;

import com.crrepa.ble.conn.bean.CRPTrainingAdvancedInfo;
import com.crrepa.ble.conn.bean.CRPTrainingInfo;
import com.crrepa.ble.conn.listener.CRPTrainingChangeListener;
import h4.l0;
import java.util.List;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    private static final int f13376d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final int f13377e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f13378f = 2;

    /* renamed from: g, reason: collision with root package name */
    private static final int f13379g = 3;

    /* renamed from: a, reason: collision with root package name */
    private int f13380a;

    /* renamed from: b, reason: collision with root package name */
    private CRPTrainingChangeListener f13381b;

    /* renamed from: c, reason: collision with root package name */
    private CRPTrainingInfo f13382c;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final e f13383a = new e();

        private b() {
        }
    }

    private e() {
        this.f13380a = 0;
    }

    public static e a() {
        return b.f13383a;
    }

    private boolean d() {
        return 1 <= this.f13380a;
    }

    private void e() {
        CRPTrainingChangeListener cRPTrainingChangeListener = this.f13381b;
        if (cRPTrainingChangeListener != null) {
            cRPTrainingChangeListener.onTrainingChange(this.f13382c);
        }
    }

    public void b(List<Integer> list) {
        CRPTrainingInfo cRPTrainingInfo = this.f13382c;
        if (cRPTrainingInfo == null) {
            return;
        }
        cRPTrainingInfo.setDistanceList(list);
        if (!b()) {
            e();
        } else {
            l0.a(this.f13382c.getId(), 0);
            l0.b(this.f13382c.getId(), 0);
        }
    }

    public void c(List<Integer> list) {
        CRPTrainingInfo cRPTrainingInfo = this.f13382c;
        if (cRPTrainingInfo == null) {
            return;
        }
        cRPTrainingInfo.setStepsList(list);
        if (c()) {
            l0.c(this.f13382c.getId(), 0);
        } else {
            e();
        }
    }

    public void f() {
        this.f13380a = 0;
    }

    private boolean b() {
        return 3 <= this.f13380a;
    }

    private boolean c() {
        return 2 <= this.f13380a;
    }

    public void a(CRPTrainingAdvancedInfo cRPTrainingAdvancedInfo) {
        CRPTrainingInfo cRPTrainingInfo = this.f13382c;
        if (cRPTrainingInfo == null) {
            return;
        }
        cRPTrainingInfo.setAdvancedInfo(cRPTrainingAdvancedInfo);
    }

    public void a(CRPTrainingInfo cRPTrainingInfo) {
        this.f13382c = cRPTrainingInfo;
        if (d()) {
            l0.e(cRPTrainingInfo.getId(), 0);
        } else {
            e();
        }
    }

    public void a(CRPTrainingChangeListener cRPTrainingChangeListener) {
        this.f13381b = cRPTrainingChangeListener;
    }

    public void a(List<Integer> list) {
        CRPTrainingInfo cRPTrainingInfo = this.f13382c;
        if (cRPTrainingInfo == null) {
            return;
        }
        cRPTrainingInfo.setAltitudeList(list);
        e();
    }

    public void a(byte[] bArr) {
        if (1 < bArr.length) {
            this.f13380a = com.crrepa.g1.c.a(bArr[1]);
        }
    }
}
