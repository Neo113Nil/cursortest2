package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class m13 extends o81 implements Function0 {
    public static final m13 n;
    public static final m13 o;
    public static final m13 p;
    public final /* synthetic */ int m;

    static {
        int i = 0;
        n = new m13(i, 0);
        o = new m13(i, 1);
        p = new m13(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m13(int i, int i2) {
        super(i);
        this.m = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.m) {
            case 0:
                return new l13(null, null, null, null, null, null, null, null, null, null, null, null, null, 32767);
            case 1:
                return Unit.a;
            case 2:
                return new jm0();
            case 3:
                return new va1(0, 0);
            default:
                return new jf2(0);
        }
    }
}
