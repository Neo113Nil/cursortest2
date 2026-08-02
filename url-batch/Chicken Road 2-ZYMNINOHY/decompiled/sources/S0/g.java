package S0;

import a.AbstractC0124a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f2414a;

    /* renamed from: b, reason: collision with root package name */
    public int f2415b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2416c = new long[10];

    /* renamed from: d, reason: collision with root package name */
    public Object f2417d = new Object[10];

    public synchronized void a(long j4, Object obj) {
        if (this.f2415b > 0) {
            if (j4 <= ((long[]) this.f2416c)[((this.f2414a + r0) - 1) % ((Object[]) this.f2417d).length]) {
                synchronized (this) {
                    this.f2414a = 0;
                    this.f2415b = 0;
                    Arrays.fill((Object[]) this.f2417d, (Object) null);
                }
            }
        }
        b();
        int i4 = this.f2414a;
        int i5 = this.f2415b;
        Object[] objArr = (Object[]) this.f2417d;
        int length = (i4 + i5) % objArr.length;
        ((long[]) this.f2416c)[length] = j4;
        objArr[length] = obj;
        this.f2415b = i5 + 1;
    }

    public void b() {
        int length = ((Object[]) this.f2417d).length;
        if (this.f2415b < length) {
            return;
        }
        int i4 = length * 2;
        long[] jArr = new long[i4];
        Object[] objArr = new Object[i4];
        int i5 = this.f2414a;
        int i6 = length - i5;
        System.arraycopy((long[]) this.f2416c, i5, jArr, 0, i6);
        System.arraycopy((Object[]) this.f2417d, this.f2414a, objArr, 0, i6);
        int i7 = this.f2414a;
        if (i7 > 0) {
            System.arraycopy((long[]) this.f2416c, 0, jArr, i6, i7);
            System.arraycopy((Object[]) this.f2417d, 0, objArr, i6, this.f2414a);
        }
        this.f2416c = jArr;
        this.f2417d = objArr;
        this.f2414a = 0;
    }

    public synchronized Object c() {
        return this.f2415b == 0 ? null : e();
    }

    public synchronized Object d(long j4) {
        Object obj;
        obj = null;
        while (this.f2415b > 0 && j4 - ((long[]) this.f2416c)[this.f2414a] >= 0) {
            obj = e();
        }
        return obj;
    }

    public Object e() {
        AbstractC0124a.t(this.f2415b > 0);
        Object[] objArr = (Object[]) this.f2417d;
        int i4 = this.f2414a;
        Object obj = objArr[i4];
        objArr[i4] = null;
        this.f2414a = (i4 + 1) % objArr.length;
        this.f2415b--;
        return obj;
    }

    public synchronized int f() {
        return this.f2415b;
    }
}
