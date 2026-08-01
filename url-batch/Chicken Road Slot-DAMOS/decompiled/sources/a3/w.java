package a3;

import android.graphics.Rect;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f271e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, int i3) {
        super(1);
        this.f270d = i3;
        this.f271e = xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f270d) {
            case 0:
                i1.a aVar = (i1.a) obj;
                x xVar = this.f271e;
                View c10 = o.c(xVar);
                if (!c10.isFocused() && !c10.hasFocus()) {
                    i1.h focusOwner = c2.k.v(xVar).getFocusOwner();
                    View w6 = c2.k.w(xVar);
                    Integer c11 = i1.d.c(aVar.f4583a);
                    int[] iArr = new int[2];
                    w6.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    c10.getLocationOnScreen(iArr2);
                    i1.t n10 = z4.w.n(((i1.k) focusOwner).f4603c);
                    Rect rect = null;
                    j1.c o6 = n10 != null ? z4.w.o(n10) : null;
                    if (o6 != null) {
                        int i3 = (int) o6.f4916a;
                        int i10 = iArr[0];
                        int i11 = iArr2[0];
                        int i12 = (int) o6.f4917b;
                        int i13 = iArr[1];
                        int i14 = iArr2[1];
                        rect = new Rect((i3 + i10) - i11, (i12 + i13) - i14, (((int) o6.f4918c) + i10) - i11, (((int) o6.f4919d) + i13) - i14);
                    }
                    if (!i1.d.b(c10, c11, rect)) {
                        aVar.f4584b = true;
                    }
                }
                break;
            default:
                o.c(this.f271e);
                break;
        }
        return Unit.f5554a;
    }
}
