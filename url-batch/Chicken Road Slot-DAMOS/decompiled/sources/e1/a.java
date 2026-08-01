package e1;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;
import kotlin.Unit;
import vd.o;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends p implements o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f3769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3770e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, int i3) {
        super(4);
        this.f3769d = bVar;
        this.f3770e = i3;
    }

    @Override // vd.o
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        b bVar = this.f3769d;
        d9.c cVar = bVar.f3771d;
        ((AutofillManager) cVar.f3701e).notifyViewEntered(bVar.f3773i, this.f3770e, new Rect(intValue, intValue2, intValue3, intValue4));
        return Unit.f5554a;
    }
}
