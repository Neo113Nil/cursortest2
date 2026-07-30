package com.baidu.platform.comapi.wnplatform.model.datastruct;

/* loaded from: classes2.dex */
public class a implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public double f10495a;

    /* renamed from: b, reason: collision with root package name */
    public double f10496b;

    /* renamed from: c, reason: collision with root package name */
    public double f10497c;

    /* renamed from: d, reason: collision with root package name */
    public double f10498d;

    /* renamed from: e, reason: collision with root package name */
    public double f10499e;

    /* renamed from: f, reason: collision with root package name */
    public double f10500f;

    /* renamed from: g, reason: collision with root package name */
    public double f10501g;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a clone() {
        a aVar = new a();
        synchronized (this) {
            aVar.f10495a = this.f10495a;
            aVar.f10496b = this.f10496b;
            aVar.f10497c = this.f10497c;
            aVar.f10498d = this.f10498d;
            aVar.f10499e = this.f10499e;
            aVar.f10500f = this.f10500f;
            aVar.f10501g = this.f10501g;
        }
        return aVar;
    }

    public String toString() {
        return String.format("SensorData {accx:%1$f accy:%2$f accz:%3$f heading:%4$f pitch:%5$f roll:%6$f}", Double.valueOf(this.f10495a), Double.valueOf(this.f10496b), Double.valueOf(this.f10497c), Double.valueOf(this.f10498d), Double.valueOf(this.f10499e), Double.valueOf(this.f10500f));
    }
}
