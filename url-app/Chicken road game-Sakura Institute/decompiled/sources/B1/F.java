package B1;

import Z2.InterfaceC0331g;
import j1.C0708b;
import j1.C0710d;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class F implements InterfaceC0331g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0331g f955e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ I f956i;

    public /* synthetic */ F(InterfaceC0331g interfaceC0331g, I i2, int i4) {
        this.f954d = i4;
        this.f955e = interfaceC0331g;
        this.f956i = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    @Override // Z2.InterfaceC0331g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, C2.a aVar) {
        E e4;
        int i2;
        H h4;
        int i4;
        switch (this.f954d) {
            case 0:
                if (aVar instanceof E) {
                    e4 = (E) aVar;
                    int i5 = e4.f952k;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        e4.f952k = i5 - Integer.MIN_VALUE;
                        Object obj2 = e4.f951j;
                        D2.a aVar2 = D2.a.f2163d;
                        i2 = e4.f952k;
                        if (i2 != 0) {
                            AbstractC1343r.b(obj2);
                            C0708b c0708b = (C0708b) obj;
                            C0710d key = this.f956i.f964b;
                            c0708b.getClass();
                            Intrinsics.checkNotNullParameter(key, "key");
                            Object obj3 = c0708b.f7144a.get(key);
                            if (obj3 instanceof byte[]) {
                                byte[] bArr = (byte[]) obj3;
                                obj3 = Arrays.copyOf(bArr, bArr.length);
                                Intrinsics.checkNotNullExpressionValue(obj3, "copyOf(this, size)");
                            }
                            e4.f952k = 1;
                            if (this.f955e.d(obj3, e4) == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC1343r.b(obj2);
                        }
                        return Unit.f7487a;
                    }
                }
                e4 = new E(this, aVar);
                Object obj22 = e4.f951j;
                D2.a aVar22 = D2.a.f2163d;
                i2 = e4.f952k;
                if (i2 != 0) {
                }
                return Unit.f7487a;
            default:
                if (aVar instanceof H) {
                    h4 = (H) aVar;
                    int i6 = h4.f961k;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        h4.f961k = i6 - Integer.MIN_VALUE;
                        Object obj4 = h4.f960j;
                        D2.a aVar3 = D2.a.f2163d;
                        i4 = h4.f961k;
                        if (i4 != 0) {
                            AbstractC1343r.b(obj4);
                            C0708b c0708b2 = (C0708b) obj;
                            C0710d key2 = this.f956i.f966d;
                            c0708b2.getClass();
                            Intrinsics.checkNotNullParameter(key2, "key");
                            Object obj5 = c0708b2.f7144a.get(key2);
                            if (obj5 instanceof byte[]) {
                                byte[] bArr2 = (byte[]) obj5;
                                obj5 = Arrays.copyOf(bArr2, bArr2.length);
                                Intrinsics.checkNotNullExpressionValue(obj5, "copyOf(this, size)");
                            }
                            Boolean bool = (Boolean) obj5;
                            Boolean valueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                            h4.f961k = 1;
                            if (this.f955e.d(valueOf, h4) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC1343r.b(obj4);
                        }
                        return Unit.f7487a;
                    }
                }
                h4 = new H(this, aVar);
                Object obj42 = h4.f960j;
                D2.a aVar32 = D2.a.f2163d;
                i4 = h4.f961k;
                if (i4 != 0) {
                }
                return Unit.f7487a;
        }
    }
}
