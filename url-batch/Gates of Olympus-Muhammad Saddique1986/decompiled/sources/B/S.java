package B;

import java.util.ArrayList;
import java.util.List;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0885G;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;

/* loaded from: classes.dex */
public final class S implements InterfaceC0885G {

    /* renamed from: a, reason: collision with root package name */
    public static final S f312a = new S();

    @Override // r0.InterfaceC0885G
    public final InterfaceC0886H f(InterfaceC0887I interfaceC0887I, List list, long j3) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        Integer num = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((InterfaceC0884F) list.get(i3)).b(j3));
        }
        int size2 = arrayList.size();
        Integer num2 = num;
        for (int i4 = 0; i4 < size2; i4++) {
            num2 = Integer.valueOf(Math.max(num2.intValue(), ((AbstractC0893O) arrayList.get(i4)).f8126d));
        }
        int intValue = num2.intValue();
        int size3 = arrayList.size();
        for (int i5 = 0; i5 < size3; i5++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((AbstractC0893O) arrayList.get(i5)).f8127e));
        }
        return interfaceC0887I.i0(intValue, num.intValue(), S1.v.f4321d, new Q(0, arrayList));
    }
}
