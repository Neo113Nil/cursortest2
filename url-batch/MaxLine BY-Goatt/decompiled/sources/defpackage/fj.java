package defpackage;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fj extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public int n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(va1 va1Var, int i, o30 o30Var) {
        super(2, o30Var);
        this.m = 4;
        this.o = va1Var;
        this.n = i;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                return new fj(0, o30Var, (kj) obj2);
            case 1:
                return new fj(1, o30Var, (v70) obj2);
            case 2:
                return new fj(2, o30Var, (cp0) obj2);
            case 3:
                return new fj(3, o30Var, (ui) obj2);
            case 4:
                return new fj((va1) obj2, this.n, o30Var);
            case 5:
                return new fj(5, o30Var, (bh1) obj2);
            case 6:
                return new fj(6, o30Var, (uj1) obj2);
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return new fj(7, o30Var, (tg2) obj2);
            case 8:
                return new fj(8, o30Var, (ij1) obj2);
            case 9:
                return new fj(9, o30Var, (jc) obj2);
            case 10:
                return new fj(10, o30Var, (vr2) obj2);
            case 11:
                return new fj(11, o30Var, (q50) obj2);
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                return new fj(12, o30Var, (mx2) obj2);
            default:
                return new fj(13, o30Var, (f03) obj2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
            case 5:
                ((fj) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((fj) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0191  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x018f -> B:97:0x0180). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x01a6 -> B:95:0x01aa). Please report as a decompilation issue!!! */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fj(int i, o30 o30Var, Object obj) {
        super(2, o30Var);
        this.m = i;
        this.o = obj;
    }
}
