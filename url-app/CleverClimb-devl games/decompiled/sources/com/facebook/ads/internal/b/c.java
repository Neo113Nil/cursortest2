package com.facebook.ads.internal.b;

import java.io.Serializable;

/* loaded from: classes.dex */
public class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private a f5029a;

    /* renamed from: b, reason: collision with root package name */
    private a f5030b;

    public static class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private double f5031a;

        /* renamed from: b, reason: collision with root package name */
        private double f5032b;

        /* renamed from: c, reason: collision with root package name */
        private double f5033c;

        /* renamed from: d, reason: collision with root package name */
        private double f5034d;
        private double e;
        private double f;
        private double g;
        private int h;
        private double i;
        private double j;
        private double k;

        public a(double d2) {
            this.e = d2;
        }

        public void a() {
            this.f5031a = 0.0d;
            this.f5033c = 0.0d;
            this.f5034d = 0.0d;
            this.f = 0.0d;
            this.h = 0;
            this.i = 0.0d;
            this.j = 1.0d;
            this.k = 0.0d;
        }

        public void a(double d2, double d3) {
            this.h++;
            this.i += d2;
            this.f5033c = d3;
            this.k += d3 * d2;
            this.f5031a = this.k / this.i;
            this.j = Math.min(this.j, d3);
            this.f = Math.max(this.f, d3);
            if (d3 < this.e) {
                this.f5032b = 0.0d;
                return;
            }
            this.f5034d += d2;
            this.f5032b += d2;
            this.g = Math.max(this.g, this.f5032b);
        }

        public double b() {
            if (this.h == 0) {
                return 0.0d;
            }
            return this.j;
        }

        public double c() {
            return this.f5031a;
        }

        public double d() {
            return this.f;
        }

        public double e() {
            return this.i;
        }

        public double f() {
            return this.f5034d;
        }

        public double g() {
            return this.g;
        }
    }

    public c() {
        this(0.5d, 0.05d);
    }

    public c(double d2) {
        this(d2, 0.05d);
    }

    public c(double d2, double d3) {
        this.f5029a = new a(d2);
        this.f5030b = new a(d3);
        a();
    }

    void a() {
        this.f5029a.a();
        this.f5030b.a();
    }

    void a(double d2, double d3) {
        this.f5029a.a(d2, d3);
    }

    public a b() {
        return this.f5029a;
    }

    void b(double d2, double d3) {
        this.f5030b.a(d2, d3);
    }

    public a c() {
        return this.f5030b;
    }
}
