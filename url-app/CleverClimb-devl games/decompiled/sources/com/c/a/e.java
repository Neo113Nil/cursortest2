package com.c.a;

import android.view.animation.Interpolator;

/* compiled from: Keyframe.java */
/* loaded from: classes.dex */
public abstract class e implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    float f3525a;

    /* renamed from: b, reason: collision with root package name */
    Class f3526b;

    /* renamed from: d, reason: collision with root package name */
    private Interpolator f3528d = null;

    /* renamed from: c, reason: collision with root package name */
    boolean f3527c = false;

    public abstract void a(Object obj);

    public abstract Object b();

    @Override // 
    public abstract e e();

    public static e a(float f, float f2) {
        return new a(f, f2);
    }

    public static e a(float f) {
        return new a(f);
    }

    public boolean a() {
        return this.f3527c;
    }

    public float c() {
        return this.f3525a;
    }

    public Interpolator d() {
        return this.f3528d;
    }

    public void a(Interpolator interpolator) {
        this.f3528d = interpolator;
    }

    /* compiled from: Keyframe.java */
    static class a extends e {

        /* renamed from: d, reason: collision with root package name */
        float f3529d;

        a(float f, float f2) {
            this.f3525a = f;
            this.f3529d = f2;
            this.f3526b = Float.TYPE;
            this.f3527c = true;
        }

        a(float f) {
            this.f3525a = f;
            this.f3526b = Float.TYPE;
        }

        public float f() {
            return this.f3529d;
        }

        @Override // com.c.a.e
        public Object b() {
            return Float.valueOf(this.f3529d);
        }

        @Override // com.c.a.e
        public void a(Object obj) {
            if (obj == null || obj.getClass() != Float.class) {
                return;
            }
            this.f3529d = ((Float) obj).floatValue();
            this.f3527c = true;
        }

        @Override // com.c.a.e
        /* renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a e() {
            a aVar = new a(c(), this.f3529d);
            aVar.a(d());
            return aVar;
        }
    }
}
