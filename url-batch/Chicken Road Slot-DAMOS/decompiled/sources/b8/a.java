package b8;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f1410a;

    /* renamed from: b, reason: collision with root package name */
    public int f1411b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1412c;

    public a(int i3) {
        c6.f.n(i3, "initialCapacity");
        this.f1410a = new Object[i3];
        this.f1411b = 0;
    }

    public static int b(int i3, int i10) {
        if (i10 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i11 = i3 + (i3 >> 1) + 1;
        if (i11 < i10) {
            i11 = Integer.highestOneBit(i10 - 1) << 1;
        }
        if (i11 < 0) {
            return Integer.MAX_VALUE;
        }
        return i11;
    }

    public final void a(Object obj) {
        obj.getClass();
        int i3 = this.f1411b + 1;
        Object[] objArr = this.f1410a;
        if (objArr.length < i3) {
            this.f1410a = Arrays.copyOf(objArr, b(objArr.length, i3));
            this.f1412c = false;
        } else if (this.f1412c) {
            this.f1410a = (Object[]) objArr.clone();
            this.f1412c = false;
        }
        Object[] objArr2 = this.f1410a;
        int i10 = this.f1411b;
        this.f1411b = i10 + 1;
        objArr2[i10] = obj;
    }
}
