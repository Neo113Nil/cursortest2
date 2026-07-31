package J1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final List f2601a;

    /* renamed from: b, reason: collision with root package name */
    public final com.gates.olympus.miruv.data.a f2602b;

    /* renamed from: c, reason: collision with root package name */
    public final com.gates.olympus.miruv.data.a f2603c;

    public f(List list, com.gates.olympus.miruv.data.a aVar, com.gates.olympus.miruv.data.a aVar2) {
        Z1.i.f(list, "saved");
        this.f2601a = list;
        this.f2602b = aVar;
        this.f2603c = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    public static f a(f fVar, ArrayList arrayList, com.gates.olympus.miruv.data.a aVar, com.gates.olympus.miruv.data.a aVar2, int i3) {
        ArrayList arrayList2 = arrayList;
        if ((i3 & 1) != 0) {
            arrayList2 = fVar.f2601a;
        }
        if ((i3 & 2) != 0) {
            aVar = fVar.f2602b;
        }
        if ((i3 & 4) != 0) {
            aVar2 = fVar.f2603c;
        }
        fVar.getClass();
        Z1.i.f(arrayList2, "saved");
        return new f(arrayList2, aVar, aVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Z1.i.a(this.f2601a, fVar.f2601a) && Z1.i.a(this.f2602b, fVar.f2602b) && Z1.i.a(this.f2603c, fVar.f2603c);
    }

    public final int hashCode() {
        int hashCode = this.f2601a.hashCode() * 31;
        com.gates.olympus.miruv.data.a aVar = this.f2602b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        com.gates.olympus.miruv.data.a aVar2 = this.f2603c;
        return hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public final String toString() {
        return "SavedState(saved=" + this.f2601a + ", guess=" + this.f2602b + ", match=" + this.f2603c + ")";
    }
}
