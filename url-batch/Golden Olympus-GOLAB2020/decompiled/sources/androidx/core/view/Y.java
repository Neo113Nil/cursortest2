package androidx.core.view;

import android.view.MotionEvent;

/* loaded from: classes.dex */
class Y {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f11912a = new float[20];

    /* renamed from: b, reason: collision with root package name */
    private final long[] f11913b = new long[20];

    /* renamed from: c, reason: collision with root package name */
    private float f11914c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    private int f11915d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f11916e = 0;

    Y() {
    }

    private void b() {
        this.f11915d = 0;
        this.f11914c = 0.0f;
    }

    private float e() {
        long[] jArr;
        long j4;
        int i4 = this.f11915d;
        if (i4 < 2) {
            return 0.0f;
        }
        int i5 = this.f11916e;
        int i6 = ((i5 + 20) - (i4 - 1)) % 20;
        long j5 = this.f11913b[i5];
        while (true) {
            jArr = this.f11913b;
            j4 = jArr[i6];
            if (j5 - j4 <= 100) {
                break;
            }
            this.f11915d--;
            i6 = (i6 + 1) % 20;
        }
        int i7 = this.f11915d;
        if (i7 < 2) {
            return 0.0f;
        }
        if (i7 == 2) {
            int i8 = (i6 + 1) % 20;
            if (j4 == jArr[i8]) {
                return 0.0f;
            }
            return this.f11912a[i8] / (r2 - j4);
        }
        float f4 = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < this.f11915d - 1; i10++) {
            int i11 = i10 + i6;
            long[] jArr2 = this.f11913b;
            long j6 = jArr2[i11 % 20];
            int i12 = (i11 + 1) % 20;
            if (jArr2[i12] != j6) {
                i9++;
                float f5 = f(f4);
                float f6 = this.f11912a[i12] / (this.f11913b[i12] - j6);
                f4 += (f6 - f5) * Math.abs(f6);
                if (i9 == 1) {
                    f4 *= 0.5f;
                }
            }
        }
        return f(f4);
    }

    private static float f(float f4) {
        return (f4 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f4) * 2.0f));
    }

    void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f11915d != 0 && eventTime - this.f11913b[this.f11916e] > 40) {
            b();
        }
        int i4 = (this.f11916e + 1) % 20;
        this.f11916e = i4;
        int i5 = this.f11915d;
        if (i5 != 20) {
            this.f11915d = i5 + 1;
        }
        this.f11912a[i4] = motionEvent.getAxisValue(26);
        this.f11913b[this.f11916e] = eventTime;
    }

    void c(int i4, float f4) {
        float e4 = e() * i4;
        this.f11914c = e4;
        if (e4 < (-Math.abs(f4))) {
            this.f11914c = -Math.abs(f4);
        } else if (this.f11914c > Math.abs(f4)) {
            this.f11914c = Math.abs(f4);
        }
    }

    float d(int i4) {
        if (i4 != 26) {
            return 0.0f;
        }
        return this.f11914c;
    }
}
