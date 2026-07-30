package com.baidu.platform.comapi.map;

import com.baidu.platform.comapi.basestruct.GeoPoint;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class r extends g {

    /* renamed from: x, reason: collision with root package name */
    private List<GeoPoint> f9786x;

    public r(a0 a0Var) {
        super(a0Var);
        this.f9786x = new ArrayList();
        this.f9742v = 0;
        this.f9743w = 2;
    }

    private boolean b() {
        synchronized (this.f9786x) {
            try {
                if (this.f9786x.size() < 2) {
                    return false;
                }
                int size = this.f9786x.size();
                this.f9736p = new double[this.f9786x.size() * 3];
                this.f9735o = new double[(this.f9786x.size() * 2) + 5];
                if (c()) {
                    this.f9735o[0] = this.f9738r.getLongitude();
                    this.f9735o[1] = this.f9738r.getLatitude();
                    this.f9735o[2] = this.f9739s.getLongitude();
                    this.f9735o[3] = this.f9739s.getLatitude();
                }
                this.f9735o[4] = 2.0d;
                for (int i8 = 0; i8 < size; i8++) {
                    if (i8 == 0) {
                        this.f9735o[5] = this.f9786x.get(0).getLongitude();
                        this.f9735o[6] = this.f9786x.get(0).getLatitude();
                    } else {
                        int i9 = i8 * 2;
                        int i10 = i8 - 1;
                        this.f9735o[i9 + 5] = this.f9786x.get(i8).getLongitude() - this.f9786x.get(i10).getLongitude();
                        this.f9735o[i9 + 6] = this.f9786x.get(i8).getLatitude() - this.f9786x.get(i10).getLatitude();
                    }
                    int i11 = i8 * 3;
                    this.f9736p[i11] = this.f9786x.get(i8).getLongitude();
                    this.f9736p[i11 + 1] = this.f9786x.get(i8).getLatitude();
                    this.f9736p[i11 + 2] = 0.0d;
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean c() {
        synchronized (this.f9786x) {
            try {
                if (this.f9786x.size() < 2) {
                    return false;
                }
                this.f9738r.setLatitude(this.f9786x.get(0).getLatitude());
                this.f9738r.setLongitude(this.f9786x.get(0).getLongitude());
                this.f9739s.setLatitude(this.f9786x.get(0).getLatitude());
                this.f9739s.setLongitude(this.f9786x.get(0).getLongitude());
                for (GeoPoint geoPoint : this.f9786x) {
                    if (this.f9738r.getLatitude() >= geoPoint.getLatitude()) {
                        this.f9738r.setLatitude(geoPoint.getLatitude());
                    }
                    if (this.f9738r.getLongitude() >= geoPoint.getLongitude()) {
                        this.f9738r.setLongitude(geoPoint.getLongitude());
                    }
                    if (this.f9739s.getLatitude() <= geoPoint.getLatitude()) {
                        this.f9739s.setLatitude(geoPoint.getLatitude());
                    }
                    if (this.f9739s.getLongitude() <= geoPoint.getLongitude()) {
                        this.f9739s.setLongitude(geoPoint.getLongitude());
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(a0 a0Var) {
        this.f9721a = a0Var;
    }

    public void a(boolean z7) {
        this.f9727g = z7;
    }

    public void a(List<GeoPoint> list) {
        if (list != null) {
            if (list.size() >= 2) {
                synchronized (this.f9786x) {
                    this.f9786x.clear();
                    this.f9786x.addAll(list);
                    this.f9740t = true;
                }
                return;
            }
            throw new IllegalArgumentException("points count can not be less than two!");
        }
        throw new IllegalArgumentException("points list can not be null!");
    }

    public void a(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        this.f9737q = iArr;
    }

    @Override // com.baidu.platform.comapi.map.g
    public String a() {
        String a8;
        synchronized (this.f9786x) {
            try {
                if (this.f9740t) {
                    this.f9740t = !b();
                }
                a8 = a(this.f9742v);
            } catch (Throwable th) {
                throw th;
            }
        }
        return a8;
    }
}
