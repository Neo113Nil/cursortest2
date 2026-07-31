package L1;

import java.util.Arrays;
import l1.C0593b;
import l1.C0595d;
import t2.InterfaceC1054g;

/* loaded from: classes.dex */
public final class x implements InterfaceC1054g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1054g f3400e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A f3401f;

    public /* synthetic */ x(InterfaceC1054g interfaceC1054g, A a3, int i3) {
        this.f3399d = i3;
        this.f3400e = interfaceC1054g;
        this.f3401f = a3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    @Override // t2.InterfaceC1054g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, V1.d dVar) {
        w wVar;
        int i3;
        z zVar;
        int i4;
        switch (this.f3399d) {
            case 0:
                if (dVar instanceof w) {
                    wVar = (w) dVar;
                    int i5 = wVar.f3397h;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        wVar.f3397h = i5 - Integer.MIN_VALUE;
                        Object obj2 = wVar.f3396g;
                        W1.a aVar = W1.a.f4608d;
                        i3 = wVar.f3397h;
                        if (i3 != 0) {
                            R1.a.e(obj2);
                            C0593b c0593b = (C0593b) obj;
                            C0595d c0595d = this.f3401f.f3344b;
                            c0593b.getClass();
                            f2.j.f(c0595d, "key");
                            Object obj3 = c0593b.f6584a.get(c0595d);
                            if (obj3 instanceof byte[]) {
                                byte[] bArr = (byte[]) obj3;
                                obj3 = Arrays.copyOf(bArr, bArr.length);
                                f2.j.e(obj3, "copyOf(this, size)");
                            }
                            wVar.f3397h = 1;
                            if (this.f3400e.e(obj3, wVar) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            R1.a.e(obj2);
                        }
                        return R1.y.f4171a;
                    }
                }
                wVar = new w(this, dVar);
                Object obj22 = wVar.f3396g;
                W1.a aVar2 = W1.a.f4608d;
                i3 = wVar.f3397h;
                if (i3 != 0) {
                }
                return R1.y.f4171a;
            default:
                if (dVar instanceof z) {
                    zVar = (z) dVar;
                    int i6 = zVar.f3406h;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        zVar.f3406h = i6 - Integer.MIN_VALUE;
                        Object obj4 = zVar.f3405g;
                        W1.a aVar3 = W1.a.f4608d;
                        i4 = zVar.f3406h;
                        if (i4 != 0) {
                            R1.a.e(obj4);
                            C0593b c0593b2 = (C0593b) obj;
                            C0595d c0595d2 = this.f3401f.f3346d;
                            c0593b2.getClass();
                            f2.j.f(c0595d2, "key");
                            Object obj5 = c0593b2.f6584a.get(c0595d2);
                            if (obj5 instanceof byte[]) {
                                byte[] bArr2 = (byte[]) obj5;
                                obj5 = Arrays.copyOf(bArr2, bArr2.length);
                                f2.j.e(obj5, "copyOf(this, size)");
                            }
                            Boolean bool = (Boolean) obj5;
                            Boolean valueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                            zVar.f3406h = 1;
                            if (this.f3400e.e(valueOf, zVar) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            R1.a.e(obj4);
                        }
                        return R1.y.f4171a;
                    }
                }
                zVar = new z(this, dVar);
                Object obj42 = zVar.f3405g;
                W1.a aVar32 = W1.a.f4608d;
                i4 = zVar.f3406h;
                if (i4 != 0) {
                }
                return R1.y.f4171a;
        }
    }
}
