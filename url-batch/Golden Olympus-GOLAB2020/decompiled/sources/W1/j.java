package W1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class j {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9605a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.f9606b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.f9607c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.f9608d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9605a = iArr;
        }
    }

    public static h a(l mode, Function0 initializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        int i4 = a.f9605a[mode.ordinal()];
        int i5 = 2;
        if (i4 == 1) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new p(initializer, defaultConstructorMarker, i5, defaultConstructorMarker);
        }
        if (i4 == 2) {
            return new o(initializer);
        }
        if (i4 == 3) {
            return new B(initializer);
        }
        throw new m();
    }

    public static h b(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        DefaultConstructorMarker defaultConstructorMarker = null;
        return new p(initializer, defaultConstructorMarker, 2, defaultConstructorMarker);
    }
}
