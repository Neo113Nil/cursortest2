package p0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: p0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0945F {
    default int a(InterfaceC0977m interfaceC0977m, List list, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = 1;
            arrayList.add(new C0974j((InterfaceC0944E) list.get(i4), i5, i5, 0));
        }
        return f(new C0979o(interfaceC0977m, interfaceC0977m.getLayoutDirection()), arrayList, u3.d.b(0, i2, 7)).g();
    }

    default int e(InterfaceC0977m interfaceC0977m, List list, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(new C0974j((InterfaceC0944E) list.get(i4), 1, 2, 0));
        }
        return f(new C0979o(interfaceC0977m, interfaceC0977m.getLayoutDirection()), arrayList, u3.d.b(i2, 0, 13)).j();
    }

    InterfaceC0946G f(InterfaceC0947H interfaceC0947H, List list, long j4);

    default int g(InterfaceC0977m interfaceC0977m, List list, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = 2;
            arrayList.add(new C0974j((InterfaceC0944E) list.get(i4), i5, i5, 0));
        }
        return f(new C0979o(interfaceC0977m, interfaceC0977m.getLayoutDirection()), arrayList, u3.d.b(i2, 0, 13)).j();
    }

    default int h(InterfaceC0977m interfaceC0977m, List list, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(new C0974j((InterfaceC0944E) list.get(i4), 2, 1, 0));
        }
        return f(new C0979o(interfaceC0977m, interfaceC0977m.getLayoutDirection()), arrayList, u3.d.b(0, i2, 7)).g();
    }
}
