package com.baidu.platform.comapi.map.d0;

import android.view.MotionEvent;
import com.github.mikephil.charting.utils.i;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0115a f9592a = new C0115a(new b(i.DOUBLE_EPSILON, i.DOUBLE_EPSILON), new b(1.0d, i.DOUBLE_EPSILON));

    /* renamed from: b, reason: collision with root package name */
    public static final C0115a f9593b = new C0115a(new b(i.DOUBLE_EPSILON, i.DOUBLE_EPSILON), new b(i.DOUBLE_EPSILON, 1.0d));

    /* renamed from: c, reason: collision with root package name */
    public static final C0115a f9594c = new C0115a(new b(i.DOUBLE_EPSILON, 1.0d), new b(i.DOUBLE_EPSILON, i.DOUBLE_EPSILON));

    /* renamed from: com.baidu.platform.comapi.map.d0.a$a, reason: collision with other inner class name */
    public static class C0115a {

        /* renamed from: a, reason: collision with root package name */
        public b f9595a;

        /* renamed from: b, reason: collision with root package name */
        public b f9596b;

        public C0115a(b bVar, b bVar2) {
            this.f9595a = bVar;
            this.f9596b = bVar2;
        }

        public b a() {
            b bVar = this.f9595a;
            double d8 = bVar.f9597a;
            b bVar2 = this.f9596b;
            return new b((d8 + bVar2.f9597a) / 2.0d, (bVar.f9598b + bVar2.f9598b) / 2.0d);
        }

        public double b() {
            b bVar = this.f9595a;
            double d8 = bVar.f9597a;
            b bVar2 = this.f9596b;
            double d9 = d8 - bVar2.f9597a;
            double d10 = bVar.f9598b - bVar2.f9598b;
            return Math.sqrt((d9 * d9) + (d10 * d10));
        }

        public d c() {
            b bVar = this.f9596b;
            double d8 = bVar.f9597a;
            b bVar2 = this.f9595a;
            return new d(d8 - bVar2.f9597a, bVar.f9598b - bVar2.f9598b);
        }

        public String toString() {
            return C0115a.class.getSimpleName() + "  a : " + this.f9595a.toString() + " b : " + this.f9596b.toString();
        }

        public static C0115a a(MotionEvent motionEvent) {
            return new C0115a(new b(motionEvent.getX(0), motionEvent.getY(0)), new b(motionEvent.getX(1), motionEvent.getY(1)));
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public double f9597a;

        /* renamed from: b, reason: collision with root package name */
        public double f9598b;

        public b(double d8, double d9) {
            this.f9597a = d8;
            this.f9598b = d9;
        }

        public String toString() {
            return b.class.getSimpleName() + " x : " + this.f9597a + " y : " + this.f9598b;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final double f9599a;

        /* renamed from: b, reason: collision with root package name */
        public final double f9600b;

        /* renamed from: c, reason: collision with root package name */
        public final d f9601c;

        public c(C0115a c0115a, C0115a c0115a2) {
            this.f9601c = new d(c0115a.a(), c0115a2.a());
            this.f9600b = c0115a2.b() / c0115a.b();
            this.f9599a = d.a(c0115a.c(), c0115a2.c());
        }

        public String toString() {
            return c.class.getSimpleName() + " rotate : " + this.f9599a + " scale : " + (this.f9600b * 100.0d) + " move : " + this.f9601c.toString();
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public double f9602a;

        /* renamed from: b, reason: collision with root package name */
        public double f9603b;

        public d(double d8, double d9) {
            this.f9602a = d8;
            this.f9603b = d9;
        }

        public static double a(d dVar, d dVar2) {
            double atan2 = Math.atan2(dVar.f9603b, dVar.f9602a) - Math.atan2(dVar2.f9603b, dVar2.f9602a);
            if (atan2 > 3.141592653589793d) {
                atan2 -= 6.283185307179586d;
            } else if (atan2 < -3.141592653589793d) {
                atan2 += 6.283185307179586d;
            }
            return (atan2 * 180.0d) / 3.141592653589793d;
        }

        public String toString() {
            return d.class.getSimpleName() + " x : " + this.f9602a + " y : " + this.f9603b;
        }

        public d(b bVar, b bVar2) {
            this.f9602a = bVar2.f9597a - bVar.f9597a;
            this.f9603b = bVar2.f9598b - bVar.f9598b;
        }
    }
}
