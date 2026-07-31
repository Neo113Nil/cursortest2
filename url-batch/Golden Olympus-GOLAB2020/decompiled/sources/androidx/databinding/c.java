package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    private List f12095b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private long f12096c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long[] f12097d;

    /* renamed from: e, reason: collision with root package name */
    private int f12098e;

    /* renamed from: f, reason: collision with root package name */
    private final a f12099f;

    public static abstract class a {
        public abstract void a(Object obj, Object obj2, int i4, Object obj3);
    }

    public c(a aVar) {
        this.f12099f = aVar;
    }

    private boolean f(int i4) {
        int i5;
        if (i4 < 64) {
            return ((1 << i4) & this.f12096c) != 0;
        }
        long[] jArr = this.f12097d;
        if (jArr != null && (i5 = (i4 / 64) - 1) < jArr.length) {
            return ((1 << (i4 % 64)) & jArr[i5]) != 0;
        }
        return false;
    }

    private void h(Object obj, int i4, Object obj2, int i5, int i6, long j4) {
        long j5 = 1;
        while (i5 < i6) {
            if ((j4 & j5) == 0) {
                this.f12099f.a(this.f12095b.get(i5), obj, i4, obj2);
            }
            j5 <<= 1;
            i5++;
        }
    }

    private void i(Object obj, int i4, Object obj2) {
        h(obj, i4, obj2, 0, Math.min(64, this.f12095b.size()), this.f12096c);
    }

    private void j(Object obj, int i4, Object obj2) {
        int size = this.f12095b.size();
        int length = this.f12097d == null ? -1 : r0.length - 1;
        k(obj, i4, obj2, length);
        h(obj, i4, obj2, (length + 2) * 64, size, 0L);
    }

    private void k(Object obj, int i4, Object obj2, int i5) {
        if (i5 < 0) {
            i(obj, i4, obj2);
            return;
        }
        long j4 = this.f12097d[i5];
        int i6 = (i5 + 1) * 64;
        int min = Math.min(this.f12095b.size(), i6 + 64);
        k(obj, i4, obj2, i5 - 1);
        h(obj, i4, obj2, i6, min, j4);
    }

    private void m(int i4, long j4) {
        long j5 = Long.MIN_VALUE;
        for (int i5 = i4 + 63; i5 >= i4; i5--) {
            if ((j4 & j5) != 0) {
                this.f12095b.remove(i5);
            }
            j5 >>>= 1;
        }
    }

    private void n(int i4) {
        if (i4 < 64) {
            this.f12096c = (1 << i4) | this.f12096c;
            return;
        }
        int i5 = (i4 / 64) - 1;
        long[] jArr = this.f12097d;
        if (jArr == null) {
            this.f12097d = new long[this.f12095b.size() / 64];
        } else if (jArr.length <= i5) {
            long[] jArr2 = new long[this.f12095b.size() / 64];
            long[] jArr3 = this.f12097d;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f12097d = jArr2;
        }
        long j4 = 1 << (i4 % 64);
        long[] jArr4 = this.f12097d;
        jArr4[i5] = j4 | jArr4[i5];
    }

    public synchronized void a(Object obj) {
        try {
            if (obj == null) {
                throw new IllegalArgumentException("callback cannot be null");
            }
            int lastIndexOf = this.f12095b.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                if (f(lastIndexOf)) {
                }
            }
            this.f12095b.add(obj);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized c clone() {
        c cVar;
        CloneNotSupportedException e4;
        try {
            cVar = (c) super.clone();
        } catch (CloneNotSupportedException e5) {
            cVar = null;
            e4 = e5;
        }
        try {
            cVar.f12096c = 0L;
            cVar.f12097d = null;
            cVar.f12098e = 0;
            cVar.f12095b = new ArrayList();
            int size = this.f12095b.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!f(i4)) {
                    cVar.f12095b.add(this.f12095b.get(i4));
                }
            }
        } catch (CloneNotSupportedException e6) {
            e4 = e6;
            e4.printStackTrace();
            return cVar;
        }
        return cVar;
    }

    public synchronized void g(Object obj, int i4, Object obj2) {
        try {
            this.f12098e++;
            j(obj, i4, obj2);
            int i5 = this.f12098e - 1;
            this.f12098e = i5;
            if (i5 == 0) {
                long[] jArr = this.f12097d;
                if (jArr != null) {
                    for (int length = jArr.length - 1; length >= 0; length--) {
                        long j4 = this.f12097d[length];
                        if (j4 != 0) {
                            m((length + 1) * 64, j4);
                            this.f12097d[length] = 0;
                        }
                    }
                }
                long j5 = this.f12096c;
                if (j5 != 0) {
                    m(0, j5);
                    this.f12096c = 0L;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void l(Object obj) {
        try {
            if (this.f12098e == 0) {
                this.f12095b.remove(obj);
            } else {
                int lastIndexOf = this.f12095b.lastIndexOf(obj);
                if (lastIndexOf >= 0) {
                    n(lastIndexOf);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
