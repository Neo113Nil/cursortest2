package D1;

import i1.C0465b;
import i1.C0467d;
import java.util.Arrays;
import n2.InterfaceC0701g;

/* loaded from: classes.dex */
public final class z implements InterfaceC0701g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0701g f584e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C f585f;

    public /* synthetic */ z(InterfaceC0701g interfaceC0701g, C c3, int i3) {
        this.f583d = i3;
        this.f584e = interfaceC0701g;
        this.f585f = c3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    @Override // n2.InterfaceC0701g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, P1.d dVar) {
        y yVar;
        int i3;
        B b2;
        int i4;
        switch (this.f583d) {
            case 0:
                if (dVar instanceof y) {
                    yVar = (y) dVar;
                    int i5 = yVar.f581e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        yVar.f581e = i5 - Integer.MIN_VALUE;
                        Object obj2 = yVar.f580d;
                        Q1.a aVar = Q1.a.f3113d;
                        i3 = yVar.f581e;
                        if (i3 != 0) {
                            I2.l.Q(obj2);
                            C0465b c0465b = (C0465b) obj;
                            C0467d c0467d = this.f585f.f521b;
                            c0465b.getClass();
                            Z1.i.f(c0467d, "key");
                            Object obj3 = c0465b.f5105a.get(c0467d);
                            if (obj3 instanceof byte[]) {
                                byte[] bArr = (byte[]) obj3;
                                obj3 = Arrays.copyOf(bArr, bArr.length);
                                Z1.i.e(obj3, "copyOf(this, size)");
                            }
                            yVar.f581e = 1;
                            if (this.f584e.emit(obj3, yVar) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            I2.l.Q(obj2);
                        }
                        return L1.z.f2729a;
                    }
                }
                yVar = new y(this, dVar);
                Object obj22 = yVar.f580d;
                Q1.a aVar2 = Q1.a.f3113d;
                i3 = yVar.f581e;
                if (i3 != 0) {
                }
                return L1.z.f2729a;
            default:
                if (dVar instanceof B) {
                    b2 = (B) dVar;
                    int i6 = b2.f518e;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        b2.f518e = i6 - Integer.MIN_VALUE;
                        Object obj4 = b2.f517d;
                        Q1.a aVar3 = Q1.a.f3113d;
                        i4 = b2.f518e;
                        if (i4 != 0) {
                            I2.l.Q(obj4);
                            C0465b c0465b2 = (C0465b) obj;
                            C0467d c0467d2 = this.f585f.f523d;
                            c0465b2.getClass();
                            Z1.i.f(c0467d2, "key");
                            Object obj5 = c0465b2.f5105a.get(c0467d2);
                            if (obj5 instanceof byte[]) {
                                byte[] bArr2 = (byte[]) obj5;
                                obj5 = Arrays.copyOf(bArr2, bArr2.length);
                                Z1.i.e(obj5, "copyOf(this, size)");
                            }
                            Boolean bool = (Boolean) obj5;
                            Boolean valueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                            b2.f518e = 1;
                            if (this.f584e.emit(valueOf, b2) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            I2.l.Q(obj4);
                        }
                        return L1.z.f2729a;
                    }
                }
                b2 = new B(this, dVar);
                Object obj42 = b2.f517d;
                Q1.a aVar32 = Q1.a.f3113d;
                i4 = b2.f518e;
                if (i4 != 0) {
                }
                return L1.z.f2729a;
        }
    }
}
