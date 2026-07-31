package r0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: r0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0885G {
    default int a(InterfaceC0916m interfaceC0916m, List list, int i3) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = 2;
            arrayList.add(new C0913j((InterfaceC0884F) list.get(i4), i5, i5, 0));
        }
        return f(new C0918o(interfaceC0916m, interfaceC0916m.getLayoutDirection()), arrayList, O2.d.b(i3, 0, 13)).h();
    }

    default int b(InterfaceC0916m interfaceC0916m, List list, int i3) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(new C0913j((InterfaceC0884F) list.get(i4), 1, 2, 0));
        }
        return f(new C0918o(interfaceC0916m, interfaceC0916m.getLayoutDirection()), arrayList, O2.d.b(i3, 0, 13)).h();
    }

    default int e(InterfaceC0916m interfaceC0916m, List list, int i3) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = 1;
            arrayList.add(new C0913j((InterfaceC0884F) list.get(i4), i5, i5, 0));
        }
        return f(new C0918o(interfaceC0916m, interfaceC0916m.getLayoutDirection()), arrayList, O2.d.b(0, i3, 7)).f();
    }

    InterfaceC0886H f(InterfaceC0887I interfaceC0887I, List list, long j3);

    default int h(InterfaceC0916m interfaceC0916m, List list, int i3) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(new C0913j((InterfaceC0884F) list.get(i4), 2, 1, 0));
        }
        return f(new C0918o(interfaceC0916m, interfaceC0916m.getLayoutDirection()), arrayList, O2.d.b(0, i3, 7)).f();
    }
}
