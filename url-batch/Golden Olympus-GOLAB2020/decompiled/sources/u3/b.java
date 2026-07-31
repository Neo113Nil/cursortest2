package u3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class b {
    public static final boolean a() {
        try {
            Class.forName("ru.ok.tracer.Tracer");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final boolean b() {
        try {
            String str = "ru.ok.tracer.lite.crash.report" + ((char) ((kotlin.random.e.f41170b.j() * Integer.parseInt("0")) + 46)) + "SeemsUnused";
            return true ^ Intrinsics.areEqual(Class.forName(str).getName(), str);
        } catch (Throwable unused) {
            return true;
        }
    }
}
