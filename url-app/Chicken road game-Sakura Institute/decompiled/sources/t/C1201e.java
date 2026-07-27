package t;

import M2.m;
import M2.o;
import M2.p;
import kotlin.jvm.functions.Function0;
import r0.a0;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1201e extends m implements Function0 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i f10618o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ a0 f10619p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p f10620q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1201e(i iVar, a0 a0Var, Function0 function0) {
        super(0, o.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
        this.f10618o = iVar;
        this.f10619p = a0Var;
        this.f10620q = (p) function0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [M2.p, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ?? r02 = this.f10620q;
        return i.B0(this.f10618o, this.f10619p, r02);
    }
}
