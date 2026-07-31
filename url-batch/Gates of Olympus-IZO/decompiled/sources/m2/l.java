package m2;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final k f5973a = new k();

    public static e a(int i3, int i4, EnumC0626a enumC0626a) {
        e pVar;
        if ((i4 & 1) != 0) {
            i3 = 0;
        }
        if ((i4 & 2) != 0) {
            enumC0626a = EnumC0626a.f5929d;
        }
        if (i3 != -2) {
            if (i3 == -1) {
                if (enumC0626a == EnumC0626a.f5929d) {
                    return new p(1, EnumC0626a.f5930e, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i3 == 0) {
                pVar = enumC0626a == EnumC0626a.f5929d ? new e(0, null) : new p(1, enumC0626a, null);
            } else {
                if (i3 != Integer.MAX_VALUE) {
                    return enumC0626a == EnumC0626a.f5929d ? new e(i3, null) : new p(i3, enumC0626a, null);
                }
                pVar = new e(Integer.MAX_VALUE, null);
            }
        } else if (enumC0626a == EnumC0626a.f5929d) {
            i.f5971b.getClass();
            pVar = new e(h.f5970b, null);
        } else {
            pVar = new p(1, enumC0626a, null);
        }
        return pVar;
    }
}
