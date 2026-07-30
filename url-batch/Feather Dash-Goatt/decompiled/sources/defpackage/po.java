package defpackage;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class po extends sf1 implements Function2 {
    public final /* synthetic */ int i = 0;
    public Object j;
    public int k;
    public /* synthetic */ Object l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po(z11 z11Var, o11 o11Var, vg0 vg0Var, tp1 tp1Var, View view, dn dnVar) {
        super(2, dnVar);
        this.m = z11Var;
        this.n = o11Var;
        this.l = vg0Var;
        this.o = tp1Var;
        this.p = view;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((po) h((dn) obj2, obj)).k(Unit.a);
            case 1:
                return ((po) h((dn) obj2, (sn) obj)).k(Unit.a);
            default:
                return ((po) h((dn) obj2, (sn) obj)).k(Unit.a);
        }
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        int i = this.i;
        Object obj2 = this.p;
        Object obj3 = this.o;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                po poVar = new po((List) obj3, (ArrayList) obj2, dnVar);
                poVar.l = obj;
                return poVar;
            case 1:
                ho0 ho0Var = ho0.d;
                po poVar2 = new po((mo0) obj3, (Function1) obj2, dnVar);
                poVar2.l = obj;
                return poVar2;
            default:
                po poVar3 = new po((z11) this.m, (o11) this.n, (vg0) this.l, (tp1) obj3, (View) obj2, dnVar);
                poVar3.j = obj;
                return poVar3;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x023f -> B:110:0x0241). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x0246 -> B:111:0x01eb). Please report as a decompilation issue!!! */
    @Override // defpackage.yc
    public final java.lang.Object k(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po.k(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po(mo0 mo0Var, Function1 function1, dn dnVar) {
        super(2, dnVar);
        ho0 ho0Var = ho0.d;
        this.o = mo0Var;
        this.p = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po(List list, ArrayList arrayList, dn dnVar) {
        super(2, dnVar);
        this.o = list;
        this.p = arrayList;
    }
}
