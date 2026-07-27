package S;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public static final h f3972d = new h(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        String str = (String) obj;
        m mVar = (m) obj2;
        if (str.length() == 0) {
            return mVar.toString();
        }
        return str + ", " + mVar;
    }
}
