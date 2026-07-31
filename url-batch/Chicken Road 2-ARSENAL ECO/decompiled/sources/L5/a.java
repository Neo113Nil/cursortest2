package L5;

import J5.q;
import M5.s;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ArrayList;
import k5.v;
import l5.AbstractC0506j;
import o5.C0570j;
import o5.InterfaceC0564d;
import o5.InterfaceC0569i;
import p5.EnumC0580a;

/* loaded from: classes.dex */
public abstract class a implements K5.c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1483f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f1484g;

    /* renamed from: h, reason: collision with root package name */
    public int f1485h;

    /* renamed from: i, reason: collision with root package name */
    public Object f1486i;

    public /* synthetic */ a() {
    }

    public abstract Object b(q qVar, InterfaceC0564d interfaceC0564d);

    @Override // K5.c
    public Object c(K5.d dVar, InterfaceC0564d interfaceC0564d) {
        c cVar = new c(dVar, this, null);
        s sVar = new s(interfaceC0564d.getContext(), interfaceC0564d);
        Object i02 = A3.c.i0(sVar, sVar, cVar);
        return i02 == EnumC0580a.f5697f ? i02 : v.f5219a;
    }

    public abstract a d(InterfaceC0569i interfaceC0569i, int i7, int i8);

    public String toString() {
        switch (this.f1483f) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                int i7 = this.f1485h;
                int i8 = this.f1484g;
                ArrayList arrayList = new ArrayList(4);
                InterfaceC0569i interfaceC0569i = (InterfaceC0569i) this.f1486i;
                if (interfaceC0569i != C0570j.f5620f) {
                    arrayList.add("context=" + interfaceC0569i);
                }
                if (i8 != -3) {
                    arrayList.add("capacity=" + i8);
                }
                if (i7 != 1) {
                    arrayList.add("onBufferOverflow=".concat(i7 != 1 ? i7 != 2 ? i7 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND"));
                }
                return getClass().getSimpleName() + '[' + AbstractC0506j.I(arrayList, ", ", null, null, null, 62) + ']';
            default:
                return super.toString();
        }
    }

    public a(InterfaceC0569i interfaceC0569i, int i7, int i8) {
        this.f1486i = interfaceC0569i;
        this.f1484g = i7;
        this.f1485h = i8;
    }
}
