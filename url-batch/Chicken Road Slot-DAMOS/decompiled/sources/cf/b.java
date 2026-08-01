package cf;

import b1.j;
import com.google.firebase.messaging.v;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.collections.x;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final af.a f2037a;

    public b(af.a aVar) {
        this.f2037a = aVar;
    }

    public Object a(v vVar) {
        u8.d dVar = (u8.d) vVar.f3175d;
        af.a aVar = this.f2037a;
        aVar.toString();
        dVar.getClass();
        df.a.f3732s.compareTo(df.a.f3728d);
        try {
            gf.a aVar2 = (gf.a) vVar.f3178r;
            if (aVar2 == null) {
                aVar2 = new gf.a(3, null);
            }
            return aVar.f370c.invoke((lf.a) vVar.f3176e, aVar2);
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e2);
            sb2.append("\n\t");
            StackTraceElement[] stackTrace = e2.getStackTrace();
            stackTrace.getClass();
            int i3 = 0;
            while (i3 < stackTrace.length) {
                String className = stackTrace[i3].getClassName();
                className.getClass();
                if (StringsKt.n(className, "sun.reflect")) {
                    break;
                }
                i3++;
            }
            sb2.append(CollectionsKt.B(i3 != 0 ? i3 != 1 ? kotlin.collections.v.b(kotlin.collections.v.h(stackTrace, 0, i3)) : x.c(stackTrace[0]) : j0.f5574d, "\n\t", null, null, null, 62));
            aVar.toString();
            dVar.getClass();
            df.a.f3732s.compareTo(df.a.f3731r);
            throw new j("Could not create instance for '" + aVar + '\'', e2, 2);
        }
    }

    public abstract Object b(v vVar);
}
