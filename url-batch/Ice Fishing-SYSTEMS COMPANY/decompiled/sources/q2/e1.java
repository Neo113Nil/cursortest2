package q2;

import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements Comparator {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ e1 f40038n = new e1();

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        List list = k2.r.f38726d;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}
