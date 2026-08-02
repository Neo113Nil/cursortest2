package p;

import java.util.ConcurrentModificationException;
import q.AbstractC1350a;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f14657a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f14658b = new Object();

    public static final void a(f fVar, int i4) {
        fVar.f14650a = new int[i4];
        fVar.f14651b = new Object[i4];
    }

    public static final int b(f fVar, Object obj, int i4) {
        int i5 = fVar.f14652c;
        if (i5 == 0) {
            return -1;
        }
        try {
            int a3 = AbstractC1350a.a(i5, i4, fVar.f14650a);
            if (a3 < 0 || kotlin.jvm.internal.i.a(obj, fVar.f14651b[a3])) {
                return a3;
            }
            int i6 = a3 + 1;
            while (i6 < i5 && fVar.f14650a[i6] == i4) {
                if (kotlin.jvm.internal.i.a(obj, fVar.f14651b[i6])) {
                    return i6;
                }
                i6++;
            }
            for (int i7 = a3 - 1; i7 >= 0 && fVar.f14650a[i7] == i4; i7--) {
                if (kotlin.jvm.internal.i.a(obj, fVar.f14651b[i7])) {
                    return i7;
                }
            }
            return ~i6;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
