package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class h9 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(0);
        this.m = i;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
        this.q = obj4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        xn1 i;
        int i2 = this.m;
        Object obj = this.q;
        Object obj2 = this.p;
        Object obj3 = this.o;
        Object obj4 = this.n;
        switch (i2) {
            case 0:
                ((eb0) obj4).e((Function0) obj3, (cb0) obj2, (u81) obj);
                return Unit.a;
            default:
                if (!((sc1) obj4).b()) {
                    to0 to0Var = (to0) obj3;
                    to0Var.getClass();
                    to0Var.a(new cv2(1, 26));
                }
                int i3 = ((c11) obj2).d;
                if (i3 != 7 && i3 != 8 && (i = ((ea) obj).i()) != null) {
                    ((sk2) i).q(Unit.a);
                }
                return Boolean.TRUE;
        }
    }
}
