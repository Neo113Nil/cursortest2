package P0;

import O0.i;
import T0.b;
import V0.c;
import V0.d;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f698a = new d(new i(1));

    public static c a(int i, int i2) {
        return new c(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static b b(int i) {
        for (b bVar : (List) f698a.a()) {
            if (bVar.f846a == i) {
                return bVar;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static T0.a c(int i, int i2, int i3, boolean z2) {
        return new T0.a(z2, i, i2, i3, 3);
    }

    public static T0.a d(int i, int i2, int i3, int i4) {
        return new T0.a(false, i, i2, i3, i4);
    }
}
