package f4;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z implements f7.g {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3361f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f7.g f3362g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0 f3363h;

    public /* synthetic */ z(f7.g gVar, c0 c0Var, int i7) {
        this.f3361f = i7;
        this.f3362g = gVar;
        this.f3363h = c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    @Override // f7.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj, h6.d dVar) {
        y yVar;
        int i7;
        b0 b0Var;
        int i8;
        switch (this.f3361f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (dVar instanceof y) {
                    yVar = (y) dVar;
                    int i9 = yVar.f3359g;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        yVar.f3359g = i9 - Integer.MIN_VALUE;
                        Object obj2 = yVar.f3358f;
                        i7 = yVar.f3359g;
                        if (i7 != 0) {
                            d6.a.e(obj2);
                            k3.b bVar = (k3.b) obj;
                            k3.d dVar2 = this.f3363h.f3306b;
                            bVar.getClass();
                            r6.k.f(dVar2, "key");
                            Object obj3 = bVar.f5347a.get(dVar2);
                            if (obj3 instanceof byte[]) {
                                byte[] bArr = (byte[]) obj3;
                                obj3 = Arrays.copyOf(bArr, bArr.length);
                                r6.k.e(obj3, "copyOf(this, size)");
                            }
                            yVar.f3359g = 1;
                            Object k8 = this.f3362g.k(obj3, yVar);
                            i6.a aVar = i6.a.f4956f;
                            if (k8 == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            d6.a.e(obj2);
                        }
                        return d6.z.f2639a;
                    }
                }
                yVar = new y(this, dVar);
                Object obj22 = yVar.f3358f;
                i7 = yVar.f3359g;
                if (i7 != 0) {
                }
                return d6.z.f2639a;
            default:
                if (dVar instanceof b0) {
                    b0Var = (b0) dVar;
                    int i10 = b0Var.f3300g;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        b0Var.f3300g = i10 - Integer.MIN_VALUE;
                        Object obj4 = b0Var.f3299f;
                        i8 = b0Var.f3300g;
                        if (i8 != 0) {
                            d6.a.e(obj4);
                            k3.b bVar2 = (k3.b) obj;
                            k3.d dVar3 = this.f3363h.f3308d;
                            bVar2.getClass();
                            r6.k.f(dVar3, "key");
                            Object obj5 = bVar2.f5347a.get(dVar3);
                            if (obj5 instanceof byte[]) {
                                byte[] bArr2 = (byte[]) obj5;
                                obj5 = Arrays.copyOf(bArr2, bArr2.length);
                                r6.k.e(obj5, "copyOf(this, size)");
                            }
                            Boolean bool = (Boolean) obj5;
                            Boolean valueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                            b0Var.f3300g = 1;
                            Object k9 = this.f3362g.k(valueOf, b0Var);
                            i6.a aVar2 = i6.a.f4956f;
                            if (k9 == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            d6.a.e(obj4);
                        }
                        return d6.z.f2639a;
                    }
                }
                b0Var = new b0(this, dVar);
                Object obj42 = b0Var.f3299f;
                i8 = b0Var.f3300g;
                if (i8 != 0) {
                }
                return d6.z.f2639a;
        }
    }
}
