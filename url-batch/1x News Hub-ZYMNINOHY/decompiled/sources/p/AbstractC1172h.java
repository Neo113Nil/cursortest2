package p;

import java.util.ConcurrentModificationException;
import q.AbstractC1178a;

/* renamed from: p.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1172h {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f10197a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f10198b = new Object();

    public static final void a(C1170f c1170f, int i3) {
        kotlin.jvm.internal.j.e(c1170f, "<this>");
        c1170f.f10190a = new int[i3];
        c1170f.f10191b = new Object[i3];
    }

    public static final int b(C1170f c1170f, Object obj, int i3) {
        kotlin.jvm.internal.j.e(c1170f, "<this>");
        int i4 = c1170f.f10192c;
        if (i4 == 0) {
            return -1;
        }
        try {
            int a3 = AbstractC1178a.a(c1170f.f10192c, i3, c1170f.f10190a);
            if (a3 < 0 || kotlin.jvm.internal.j.a(obj, c1170f.f10191b[a3])) {
                return a3;
            }
            int i5 = a3 + 1;
            while (i5 < i4 && c1170f.f10190a[i5] == i3) {
                if (kotlin.jvm.internal.j.a(obj, c1170f.f10191b[i5])) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = a3 - 1; i6 >= 0 && c1170f.f10190a[i6] == i3; i6--) {
                if (kotlin.jvm.internal.j.a(obj, c1170f.f10191b[i6])) {
                    return i6;
                }
            }
            return ~i5;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
