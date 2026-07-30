package kotlin;

import kotlin.jvm.internal.s;
import y5.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class b {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LazyThreadSafetyMode.values().length];
            try {
                iArr[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LazyThreadSafetyMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static <T> f lazy(f6.a initializer) {
        s.checkNotNullParameter(initializer, "initializer");
        return new SynchronizedLazyImpl(initializer, null, 2, null);
    }

    public static <T> f lazy(LazyThreadSafetyMode mode, f6.a initializer) {
        s.checkNotNullParameter(mode, "mode");
        s.checkNotNullParameter(initializer, "initializer");
        int i8 = a.$EnumSwitchMapping$0[mode.ordinal()];
        if (i8 == 1) {
            return new SynchronizedLazyImpl(initializer, null, 2, null);
        }
        if (i8 == 2) {
            return new SafePublicationLazyImpl(initializer);
        }
        if (i8 == 3) {
            return new UnsafeLazyImpl(initializer);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <T> f lazy(Object obj, f6.a initializer) {
        s.checkNotNullParameter(initializer, "initializer");
        return new SynchronizedLazyImpl(initializer, obj);
    }
}
