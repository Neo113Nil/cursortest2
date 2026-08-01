package j2;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5024e;

    public /* synthetic */ v(int i3, Object obj) {
        this.f5023d = i3;
        this.f5024e = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5023d) {
            case 0:
                return ((Number) ((Function2) this.f5024e).invoke(obj, obj2)).intValue();
            default:
                for (Function1 function1 : (Function1[]) this.f5024e) {
                    int a9 = jd.a.a((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                    if (a9 != 0) {
                        return a9;
                    }
                }
                return 0;
        }
    }
}
