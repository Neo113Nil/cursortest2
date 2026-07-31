package androidx.activity;

import android.util.Log;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ListIterator;
import k5.v;
import l5.C0504h;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.j implements InterfaceC0732a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3207f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f3208g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(s sVar, int i7) {
        super(0);
        this.f3207f = i7;
        this.f3208g = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    @Override // x5.InterfaceC0732a
    public final Object invoke() {
        N.h hVar;
        switch (this.f3207f) {
            case 0:
                this.f3208g.a();
                return v.f5219a;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                s sVar = this.f3208g;
                N.h hVar2 = sVar.f3217c;
                if (hVar2 == null) {
                    C0504h c0504h = sVar.f3216b;
                    ListIterator listIterator = c0504h.listIterator(c0504h.a());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            hVar = listIterator.previous();
                            if (((N.h) hVar).f1664a) {
                            }
                        } else {
                            hVar = 0;
                        }
                    }
                    hVar2 = hVar;
                }
                sVar.f3217c = null;
                if (hVar2 != null) {
                    F3.g gVar = hVar2.f1665b;
                    if (F3.g.o(3)) {
                        Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + gVar);
                    }
                    N.a aVar = (N.a) gVar.f737k;
                    if (aVar != null) {
                        aVar.f1637c = false;
                        aVar.a(false);
                        gVar.n();
                        throw null;
                    }
                    gVar.f737k = null;
                }
                return v.f5219a;
            default:
                this.f3208g.a();
                return v.f5219a;
        }
    }
}
