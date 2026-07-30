package defpackage;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ax implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ax(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                for (Function1 function1 : (Function1[]) obj3) {
                    int a = bx.a((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                    if (a != 0) {
                        return a;
                    }
                }
                return 0;
            default:
                return ((Number) ((Function2) obj3).invoke(obj, obj2)).intValue();
        }
    }
}
