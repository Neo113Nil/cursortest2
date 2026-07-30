package a1;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import k1.C4628a;

/* loaded from: classes.dex */
public final class o extends AbstractC0421e {
    public final PointF i;

    /* renamed from: j, reason: collision with root package name */
    public final PointF f4330j;

    /* renamed from: k, reason: collision with root package name */
    public final i f4331k;

    /* renamed from: l, reason: collision with root package name */
    public final i f4332l;

    /* renamed from: m, reason: collision with root package name */
    public S0.s f4333m;

    /* renamed from: n, reason: collision with root package name */
    public S0.s f4334n;

    public o(i iVar, i iVar2) {
        super(Collections.EMPTY_LIST);
        this.i = new PointF();
        this.f4330j = new PointF();
        this.f4331k = iVar;
        this.f4332l = iVar2;
        i(this.f4305d);
    }

    @Override // a1.AbstractC0421e
    public final Object e() {
        return l();
    }

    @Override // a1.AbstractC0421e
    public final /* bridge */ /* synthetic */ Object f(C4628a c4628a, float f6) {
        return l();
    }

    @Override // a1.AbstractC0421e
    public final void i(float f6) {
        i iVar = this.f4331k;
        iVar.i(f6);
        i iVar2 = this.f4332l;
        iVar2.i(f6);
        this.i.set(((Float) iVar.e()).floatValue(), ((Float) iVar2.e()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4302a;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC0417a) arrayList.get(i)).a();
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF l() {
        Float f6;
        Float f9 = null;
        if (this.f4333m != null) {
            i iVar = this.f4331k;
            C4628a h9 = iVar.f4304c.h();
            if (h9 != null) {
                Float f10 = h9.f38678h;
                S0.s sVar = this.f4333m;
                float f11 = h9.f38677g;
                f6 = (Float) sVar.h(f11, f10 == null ? f11 : f10.floatValue(), (Float) h9.f38672b, (Float) h9.f38673c, iVar.c(), iVar.d(), iVar.f4305d);
                if (this.f4334n != null) {
                    i iVar2 = this.f4332l;
                    C4628a h10 = iVar2.f4304c.h();
                    if (h10 != null) {
                        Float f12 = h10.f38678h;
                        S0.s sVar2 = this.f4334n;
                        float f13 = h10.f38677g;
                        f9 = (Float) sVar2.h(f13, f12 == null ? f13 : f12.floatValue(), (Float) h10.f38672b, (Float) h10.f38673c, iVar2.c(), iVar2.d(), iVar2.f4305d);
                    }
                }
                PointF pointF = this.i;
                PointF pointF2 = this.f4330j;
                if (f6 != null) {
                    pointF2.set(pointF.x, 0.0f);
                } else {
                    pointF2.set(f6.floatValue(), 0.0f);
                }
                if (f9 != null) {
                    pointF2.set(pointF2.x, pointF.y);
                    return pointF2;
                }
                pointF2.set(pointF2.x, f9.floatValue());
                return pointF2;
            }
        }
        f6 = null;
        if (this.f4334n != null) {
        }
        PointF pointF3 = this.i;
        PointF pointF22 = this.f4330j;
        if (f6 != null) {
        }
        if (f9 != null) {
        }
    }
}
