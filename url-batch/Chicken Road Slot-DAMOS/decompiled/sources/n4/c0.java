package n4;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c0 extends e0 {

    /* renamed from: r, reason: collision with root package name */
    public final Class f7038r;

    public c0(Class cls) {
        super(cls, 0);
        if (cls.isEnum()) {
            this.f7038r = cls;
        } else {
            kotlin.collections.i0.e(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // n4.e0, n4.f0
    public final String b() {
        return this.f7038r.getName();
    }

    @Override // n4.e0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Enum d(String str) {
        Object obj;
        Class cls = this.f7038r;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i3];
            if (kotlin.text.o.f(((Enum) obj).name(), str, true)) {
                break;
            }
            i3++;
        }
        Enum r42 = (Enum) obj;
        if (r42 != null) {
            return r42;
        }
        StringBuilder q3 = v4.a.q("Enum value ", str, " not found for type ");
        q3.append(cls.getName());
        q3.append('.');
        throw new IllegalArgumentException(q3.toString());
    }
}
