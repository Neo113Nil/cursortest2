package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class nk extends h31 implements Function2 {
    public int g;
    public int h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ok l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(ok okVar, dn dnVar) {
        super(dnVar);
        this.l = okVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((nk) h((dn) obj2, (g91) obj)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        nk nkVar = new nk(this.l, dnVar);
        nkVar.k = obj;
        return nkVar;
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        g91 g91Var;
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        String str2;
        ok okVar = this.l;
        mn0 mn0Var = okVar.d;
        dn0 dn0Var = okVar.g;
        tn tnVar = tn.d;
        int i6 = this.j;
        if (i6 == 0) {
            ca0.v(obj);
            g91Var = (g91) this.k;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                dd0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.i;
            i2 = this.h;
            i3 = this.g;
            g91Var = (g91) this.k;
            ca0.v(obj);
        }
        if (i3 >= Math.min(okVar.h + 10, dn0Var.b)) {
            return Unit.a;
        }
        int i7 = i3 + 1;
        int c = dn0Var.c(i3);
        switch (c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                str = "up";
                break;
            case 1:
                Object f = mn0Var.f(i2);
                i2++;
                str = "down " + f;
                break;
            case 2:
                str = "remove " + dn0Var.c(i7) + ' ' + dn0Var.c(i3 + 2);
                i7 = i3 + 3;
                break;
            case 3:
                str = "move " + dn0Var.c(i7) + ' ' + dn0Var.c(i3 + 2) + ' ' + dn0Var.c(i3 + 3);
                i7 = i3 + 4;
                break;
            case 4:
                str = "clear";
                break;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                i4 = i3 + 2;
                int c2 = dn0Var.c(i7);
                i5 = i2 + 1;
                str2 = "insertBottomUp " + c2 + ' ' + mn0Var.f(i2);
                int i8 = i4;
                str = str2;
                i7 = i8;
                i2 = i5;
                break;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                i4 = i3 + 2;
                int c3 = dn0Var.c(i7);
                i5 = i2 + 1;
                str2 = "insertTopDown " + c3 + ' ' + mn0Var.f(i2);
                int i82 = i4;
                str = str2;
                i7 = i82;
                i2 = i5;
                break;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                Object f2 = mn0Var.f(i2);
                f2.getClass();
                tj1.b(2, f2);
                i2 += 2;
                str = "apply " + ((Function2) f2);
                break;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                str = "reuse " + okVar.e.f(i);
                i++;
                break;
            case 9:
                str = "recompose pending";
                break;
            default:
                str = qy0.i(c, "unknown op: ");
                break;
        }
        this.k = g91Var;
        this.g = i7;
        this.h = i2;
        this.i = i;
        this.j = 1;
        g91Var.a(i3 + ": " + str, this);
        return tnVar;
    }
}
