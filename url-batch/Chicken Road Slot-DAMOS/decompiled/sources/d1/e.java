package d1;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends wd.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public static final e f3298d = new e(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        j jVar = (j) obj2;
        if (str.length() == 0) {
            return jVar.toString();
        }
        return str + ", " + jVar;
    }
}
