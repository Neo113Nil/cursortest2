package androidx.room;

import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1093a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1094b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1095c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1096d;

    public m() {
        this.f1094b = new Object();
        this.f1095c = new ArrayList();
        this.f1096d = new ArrayList();
        this.f1093a = true;
    }

    public int[] a() {
        synchronized (this) {
            try {
                if (!this.f1093a) {
                    return null;
                }
                long[] jArr = (long[]) this.f1094b;
                int length = jArr.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length) {
                    int i9 = i8 + 1;
                    int i10 = 1;
                    boolean z8 = jArr[i7] > 0;
                    boolean[] zArr = (boolean[]) this.f1095c;
                    if (z8 != zArr[i8]) {
                        int[] iArr = (int[]) this.f1096d;
                        if (!z8) {
                            i10 = 2;
                        }
                        iArr[i8] = i10;
                    } else {
                        ((int[]) this.f1096d)[i8] = 0;
                    }
                    zArr[i8] = z8;
                    i7++;
                    i8 = i9;
                }
                this.f1093a = false;
                return (int[]) ((int[]) this.f1096d).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public m(int i7) {
        this.f1094b = new long[i7];
        this.f1095c = new boolean[i7];
        this.f1096d = new int[i7];
    }
}
