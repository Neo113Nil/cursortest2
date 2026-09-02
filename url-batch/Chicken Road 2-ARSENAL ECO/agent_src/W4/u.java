package W4;

import f4.C0374a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2831a;

    public u(ArrayList arrayList) {
        this.f2831a = arrayList;
    }

    public final void a(double d7, V3.c cVar, C0374a c0374a) {
        ArrayList arrayList = this.f2831a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((u) obj).a(d7, cVar, c0374a);
        }
    }

    public final void b(long j4, V3.c cVar, C0374a c0374a) {
        ArrayList arrayList = this.f2831a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((u) obj).b(j4, cVar, c0374a);
        }
    }
}
