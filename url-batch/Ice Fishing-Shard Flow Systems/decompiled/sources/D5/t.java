package D5;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f385a;

    public t(ArrayList arrayList) {
        this.f385a = arrayList;
    }

    public final void a(double d7, C4.f fVar, M4.a aVar) {
        ArrayList arrayList = this.f385a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((t) obj).a(d7, fVar, aVar);
        }
    }

    public final void b(long j, C4.f fVar, M4.a aVar) {
        ArrayList arrayList = this.f385a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((t) obj).b(j, fVar, aVar);
        }
    }
}
