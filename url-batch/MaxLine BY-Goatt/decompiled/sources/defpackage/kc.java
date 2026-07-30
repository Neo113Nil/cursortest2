package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kc extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public Object n;
    public int o;
    public Object p;
    public Object q;
    public /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(c82 c82Var, r72 r72Var, id1 id1Var, q83 q83Var, View view, o30 o30Var) {
        super(2, o30Var);
        this.m = 3;
        this.p = c82Var;
        this.q = r72Var;
        this.r = id1Var;
        this.s = q83Var;
        this.t = view;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        Object obj2 = this.t;
        Object obj3 = this.s;
        switch (i) {
            case 0:
                kc kcVar = new kc((gt) this.q, (jc) this.r, (zn1) obj3, (zn1) obj2, o30Var);
                kcVar.n = obj;
                return kcVar;
            case 1:
                kc kcVar2 = new kc((List) obj3, (ArrayList) obj2, o30Var, 1);
                kcVar2.r = obj;
                return kcVar2;
            case 2:
                kc kcVar3 = new kc((no1) obj3, (Function1) obj2, o30Var, 2);
                kcVar3.r = obj;
                return kcVar3;
            default:
                kc kcVar4 = new kc((c82) this.p, (r72) this.q, (id1) this.r, (q83) obj3, (View) obj2, o30Var);
                kcVar4.n = obj;
                return kcVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
        }
        return ((kc) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0206 -> B:104:0x01e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x0230 -> B:104:0x01e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x026e -> B:122:0x0272). Please report as a decompilation issue!!! */
    @Override // defpackage.hn
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(gt gtVar, jc jcVar, zn1 zn1Var, zn1 zn1Var2, o30 o30Var) {
        super(2, o30Var);
        this.m = 0;
        this.q = gtVar;
        this.r = jcVar;
        this.s = zn1Var;
        this.t = zn1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kc(Object obj, Object obj2, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.s = obj;
        this.t = obj2;
    }
}
