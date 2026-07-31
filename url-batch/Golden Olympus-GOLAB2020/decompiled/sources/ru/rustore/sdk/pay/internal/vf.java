package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.model.PurchaseStatus;

/* loaded from: classes3.dex */
public final class vf extends kotlin.jvm.internal.s implements Function1<uf, PurchaseStatus> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf f45134a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf(wf wfVar) {
        super(1);
        this.f45134a = wfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r0 = r3.f45134a.f45167b;
        r4 = r4.f45098c;
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        return ru.rustore.sdk.pay.internal.cc.a(r4);
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        uf statusDto = (uf) obj;
        Intrinsics.checkNotNullParameter(statusDto, "statusDto");
        String str = statusDto.f45097b;
        int hashCode = str.hashCode();
        if (hashCode != -1636482787) {
            if (hashCode != -587753168) {
                if (hashCode != 318720611) {
                }
            } else if (str.equals("APPLICATION")) {
                p0 p0Var = this.f45134a.f45168c;
                String str2 = statusDto.f45098c;
                p0Var.getClass();
                return p0.a(str2);
            }
        } else if (str.equals("SUBSCRIPTION")) {
            return this.f45134a.f45169d.a(statusDto.f45098c);
        }
        IllegalStateException throwable = new IllegalStateException("Unknown product type: " + statusDto.f45097b);
        y7 y7Var = this.f45134a.f45170e;
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u3.e.i(y7Var.f45263a, throwable, null, 2, null);
        throw throwable;
    }
}
