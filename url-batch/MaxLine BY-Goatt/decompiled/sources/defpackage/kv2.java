package defpackage;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kv2 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ ca0 n;
    public final /* synthetic */ zn1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kv2(ca0 ca0Var, zn1 zn1Var, int i) {
        super(1);
        this.m = i;
        this.n = ca0Var;
        this.o = zn1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        zn1 zn1Var = this.o;
        ca0 ca0Var = this.n;
        switch (i) {
            case 0:
                long j = ((sc0) obj).a;
                zn1Var.setValue(new x31(zm3.d(ca0Var.R(Float.intBitsToFloat((int) (j >> 32))), ca0Var.R(Float.intBitsToFloat((int) (j & 4294967295L))))));
                return Unit.a;
            default:
                s72 s72Var = new s72(14, (Function0) obj);
                kv2 kv2Var = new kv2(ca0Var, zn1Var, 0);
                if (ch1.a()) {
                    return ch1.a() ? new MagnifierElement(s72Var, kv2Var, Build.VERSION.SDK_INT == 28 ? x12.n : x12.o) : sl1.a;
                }
                ch2.h("Magnifier is only supported on API level 28 and higher.");
                return null;
        }
    }
}
