package b;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z2.C1433q;

/* loaded from: classes.dex */
public final class w extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D f5590e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(D d4, int i2) {
        super(1);
        this.f5589d = i2;
        this.f5590e = d4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f5589d) {
            case 0:
                C0487b backEvent = (C0487b) obj;
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                D d4 = this.f5590e;
                C1433q c1433q = d4.f5515b;
                ListIterator listIterator = c1433q.listIterator(c1433q.e());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((v) obj2).f5586a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                v vVar = (v) obj2;
                if (d4.f5516c != null) {
                    d4.b();
                }
                d4.f5516c = vVar;
                if (vVar != null) {
                    vVar.d(backEvent);
                }
                break;
            default:
                C0487b backEvent2 = (C0487b) obj;
                Intrinsics.checkNotNullParameter(backEvent2, "backEvent");
                D d5 = this.f5590e;
                v vVar2 = d5.f5516c;
                if (vVar2 == null) {
                    C1433q c1433q2 = d5.f5515b;
                    ListIterator listIterator2 = c1433q2.listIterator(c1433q2.e());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((v) obj3).f5586a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    vVar2 = (v) obj3;
                }
                if (vVar2 != null) {
                    vVar2.c(backEvent2);
                }
                break;
        }
        return Unit.f7487a;
    }
}
