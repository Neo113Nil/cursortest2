package d;

import android.util.Log;
import androidx.fragment.app.C0222m;
import androidx.fragment.app.H;
import androidx.fragment.app.P;
import androidx.fragment.app.Q;
import androidx.fragment.app.c0;
import androidx.fragment.app.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.C0633l;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0349A f4598e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(C0349A c0349a, int i2) {
        super(1);
        this.f4597d = i2;
        this.f4598e = c0349a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f4597d) {
            case 0:
                Intrinsics.checkNotNullParameter((C0351b) obj, "backEvent");
                C0349A c0349a = this.f4598e;
                C0633l c0633l = c0349a.f4560b;
                ListIterator listIterator = c0633l.listIterator(c0633l.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((H) obj2).f3584a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                H h7 = (H) obj2;
                if (c0349a.f4561c != null) {
                    c0349a.a();
                }
                c0349a.f4561c = h7;
                if (h7 != null) {
                    Q q4 = h7.f3587d;
                    if (Q.J(3)) {
                        Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + q4);
                    }
                    q4.x();
                    q4.y(new P(q4), false);
                }
                return Unit.f6114a;
            default:
                C0351b backEvent = (C0351b) obj;
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                C0349A c0349a2 = this.f4598e;
                H h8 = c0349a2.f4561c;
                if (h8 == null) {
                    C0633l c0633l2 = c0349a2.f4560b;
                    ListIterator listIterator2 = c0633l2.listIterator(c0633l2.a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((H) obj3).f3584a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    h8 = (H) obj3;
                }
                if (h8 != null) {
                    Q q7 = h8.f3587d;
                    if (Q.J(2)) {
                        Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + q7);
                    }
                    if (q7.f3620h != null) {
                        Iterator it = q7.f(new ArrayList(Collections.singletonList(q7.f3620h)), 0, 1).iterator();
                        while (it.hasNext()) {
                            C0222m c0222m = (C0222m) it.next();
                            c0222m.getClass();
                            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                            if (Q.J(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.f4569c);
                            }
                            ArrayList arrayList = c0222m.f3743c;
                            ArrayList arrayList2 = new ArrayList();
                            int size = arrayList.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj4 = arrayList.get(i2);
                                i2++;
                                ((d0) obj4).getClass();
                                kotlin.collections.w.h(null, arrayList2);
                            }
                            List z7 = CollectionsKt.z(CollectionsKt.C(arrayList2));
                            int size2 = z7.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                ((c0) z7.get(i5)).b(backEvent, c0222m.f3741a);
                            }
                        }
                        Iterator it2 = q7.f3624m.iterator();
                        if (it2.hasNext()) {
                            it2.next().getClass();
                            throw new ClassCastException();
                        }
                    }
                }
                return Unit.f6114a;
        }
    }
}
