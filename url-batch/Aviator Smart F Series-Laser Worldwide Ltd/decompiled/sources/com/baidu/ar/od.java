package com.baidu.ar;

import com.baidu.ar.slam.TrackModel;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.StatisticConstants;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class od {

    /* renamed from: a, reason: collision with root package name */
    public c7 f2920a;

    /* renamed from: b, reason: collision with root package name */
    public s6 f2921b;

    /* renamed from: c, reason: collision with root package name */
    public md f2922c;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f2924e;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f2923d = false;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f2925f = false;

    public od(c7 c7Var, nd ndVar, d7 d7Var, md mdVar) {
        this.f2924e = true;
        this.f2920a = c7Var;
        this.f2922c = mdVar;
        if (ndVar != null) {
            this.f2924e = ndVar.f();
        }
        this.f2921b = a(ndVar, d7Var);
    }

    public final s6 a(nd ndVar, d7 d7Var) {
        if (ndVar == null) {
            c7 c7Var = this.f2920a;
            md mdVar = this.f2922c;
            return new y2(c7Var, mdVar.f2831a, mdVar.f2832b);
        }
        if (ndVar.d() == 1) {
            c7 c7Var2 = this.f2920a;
            md mdVar2 = this.f2922c;
            zb zbVar = new zb(c7Var2, ndVar, mdVar2.f2831a, mdVar2.f2832b);
            zbVar.a(d7Var);
            return zbVar;
        }
        if (ndVar.d() != 0) {
            return null;
        }
        c7 c7Var3 = this.f2920a;
        md mdVar3 = this.f2922c;
        return new nb(c7Var3, ndVar, mdVar3.f2831a, mdVar3.f2832b);
    }

    public void b() {
        this.f2924e = true;
    }

    public void a() {
        c7 c7Var = this.f2920a;
        if (c7Var != null) {
            c7Var.release();
            this.f2920a = null;
        }
        this.f2921b = null;
    }

    public void a(float f8, float f9, float f10) {
        v4 v4Var = new v4();
        v4Var.f3451a = f8;
        v4Var.f3452b = f9;
        v4Var.f3454d = f10;
        v4Var.f3453c = 2;
        a(v4Var);
    }

    public void a(qd qdVar, float[] fArr) {
        float[] a8;
        if (!this.f2924e || this.f2925f) {
            return;
        }
        rd d8 = qdVar.d();
        if (this.f2923d) {
            if (d8 == null || (a8 = a(d8)) == null || a8.length <= 0) {
                return;
            }
            this.f2920a.a(a8);
            return;
        }
        s6 s6Var = this.f2921b;
        if (s6Var != null) {
            this.f2923d = s6Var.a(fArr);
            if (this.f2923d) {
                this.f2920a.a();
                StatisticApi.onEvent(StatisticConstants.SLAM_TRACK_ON);
            }
        }
    }

    public void a(v4 v4Var) {
        this.f2920a.a(v4Var);
    }

    public void a(boolean z7) {
        this.f2925f = z7;
    }

    public final float[] a(rd rdVar) {
        ArrayList<TrackModel> b8 = rdVar.b();
        return (b8 == null || b8.isEmpty()) ? new float[0] : b8.get(0).getPose();
    }
}
