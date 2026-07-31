package q2;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class g {
    public static final d a(int i4, EnumC3383a enumC3383a, Function1 function1) {
        if (i4 == -2) {
            return enumC3383a == EnumC3383a.f43420b ? new b(d.f43474O2.a(), function1) : new o(1, enumC3383a, function1);
        }
        if (i4 != -1) {
            return i4 != 0 ? i4 != Integer.MAX_VALUE ? enumC3383a == EnumC3383a.f43420b ? new b(i4, function1) : new o(i4, enumC3383a, function1) : new b(Integer.MAX_VALUE, function1) : enumC3383a == EnumC3383a.f43420b ? new b(0, function1) : new o(1, enumC3383a, function1);
        }
        if (enumC3383a == EnumC3383a.f43420b) {
            return new o(1, EnumC3383a.f43421c, function1);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static /* synthetic */ d b(int i4, EnumC3383a enumC3383a, Function1 function1, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        if ((i5 & 2) != 0) {
            enumC3383a = EnumC3383a.f43420b;
        }
        if ((i5 & 4) != 0) {
            function1 = null;
        }
        return a(i4, enumC3383a, function1);
    }
}
