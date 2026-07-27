package A;

import java.util.ArrayList;
import java.util.List;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0945F;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import z2.C1412P;

/* loaded from: classes.dex */
public final class T implements InterfaceC0945F {

    /* renamed from: a, reason: collision with root package name */
    public static final T f55a = new T();

    @Override // p0.InterfaceC0945F
    public final InterfaceC0946G f(InterfaceC0947H interfaceC0947H, List list, long j4) {
        InterfaceC0946G t4;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        Integer num = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((InterfaceC0944E) list.get(i2)).a(j4));
        }
        int size2 = arrayList.size();
        Integer num2 = num;
        for (int i4 = 0; i4 < size2; i4++) {
            num2 = Integer.valueOf(Math.max(num2.intValue(), ((AbstractC0954O) arrayList.get(i4)).f9005d));
        }
        int intValue = num2.intValue();
        int size3 = arrayList.size();
        for (int i5 = 0; i5 < size3; i5++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((AbstractC0954O) arrayList.get(i5)).f9006e));
        }
        t4 = interfaceC0947H.t(intValue, num.intValue(), C1412P.c(), new S(0, arrayList));
        return t4;
    }
}
