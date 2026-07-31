package d4;

import f4.C0374a;

/* renamed from: d4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0325g {
    static InterfaceC0325g a(C0374a c0374a) {
        Object obj;
        int i7 = 0;
        while (true) {
            Object[] objArr = c0374a.f4223a;
            if (i7 >= objArr.length) {
                obj = null;
                break;
            }
            if (objArr[i7] == AbstractC0327i.f3958a) {
                obj = objArr[i7 + 1];
                break;
            }
            i7 += 2;
        }
        InterfaceC0325g interfaceC0325g = (InterfaceC0325g) obj;
        return interfaceC0325g == null ? C0324f.f3956b : interfaceC0325g;
    }
}
