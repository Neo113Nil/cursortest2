package i1;

import kotlin.jvm.functions.Function1;
import wd.b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f4599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4600e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b0 b0Var, int i3) {
        super(1);
        this.f4599d = b0Var;
        this.f4600e = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean valueOf = Boolean.valueOf(((t) obj).O(this.f4600e));
        this.f4599d.f10141d = valueOf;
        return valueOf;
    }
}
