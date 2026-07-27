package c;

import A.a0;
import G.C0192d;
import G.C0216p;
import M2.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import w.M;

/* renamed from: c.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0528h extends p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5715d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5716e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5717i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5718j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0528h(a0 a0Var, boolean z4, int i2) {
        super(2);
        this.f5718j = a0Var;
        this.f5716e = z4;
        this.f5717i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        int i2 = this.f5715d;
        C0216p c0216p = (C0216p) obj;
        ((Number) obj2).intValue();
        switch (i2) {
            case 0:
                u3.d.h(this.f5716e, (Function2) this.f5718j, c0216p, this.f5717i | 1);
                break;
            default:
                M.f((a0) this.f5718j, this.f5716e, c0216p, C0192d.U(this.f5717i | 1));
                break;
        }
        return Unit.f7487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0528h(boolean z4, Function2 function2, int i2) {
        super(2);
        this.f5716e = z4;
        this.f5718j = function2;
        this.f5717i = i2;
    }
}
