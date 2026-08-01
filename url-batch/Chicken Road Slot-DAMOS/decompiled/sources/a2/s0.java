package a2;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s0 extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f149e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(int i3, ArrayList arrayList) {
        super(1);
        this.f148d = i3;
        this.f149e = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f148d) {
            case 0:
                n0 n0Var = (n0) obj;
                ArrayList arrayList = this.f149e;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    n0.q(n0Var, (o0) arrayList.get(i3));
                }
                break;
            case 1:
                n0 n0Var2 = (n0) obj;
                ArrayList arrayList2 = this.f149e;
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    n0.p(n0Var2, (o0) arrayList2.get(i10), 0, 0);
                }
                break;
            default:
                n0 n0Var3 = (n0) obj;
                ArrayList arrayList3 = this.f149e;
                int size3 = arrayList3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    n0Var3.h((o0) arrayList3.get(i11), 0, 0, 0.0f);
                }
                break;
        }
        return Unit.f5554a;
    }
}
