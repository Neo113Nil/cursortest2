package A5;

import java.util.Random;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: g, reason: collision with root package name */
    public final b f56g = new b(0);

    @Override // A5.a
    public final Random a() {
        Object obj = this.f56g.get();
        i.d(obj, "get(...)");
        return (Random) obj;
    }
}
