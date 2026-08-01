package x1;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f10310e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i3) {
        super(1);
        this.f10309d = i3;
        this.f10310e = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10309d) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                a3.g gVar = this.f10310e.f10311a;
                if (gVar != null) {
                    gVar.invoke(motionEvent);
                    return Unit.f5554a;
                }
                Intrinsics.f("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                a3.g gVar2 = this.f10310e.f10311a;
                if (gVar2 != null) {
                    gVar2.invoke(motionEvent2);
                    return Unit.f5554a;
                }
                Intrinsics.f("onTouchEvent");
                throw null;
        }
    }
}
