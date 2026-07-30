package kotlinx.coroutines;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes3.dex */
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            try {
                iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoroutineStart.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void isLazy$annotations() {
    }

    public final <T> void invoke(f6.l lVar, kotlin.coroutines.c cVar) {
        int i8 = a.$EnumSwitchMapping$0[ordinal()];
        if (i8 == 1) {
            l6.a.startCoroutineCancellable(lVar, cVar);
            return;
        }
        if (i8 == 2) {
            kotlin.coroutines.e.startCoroutine(lVar, cVar);
        } else if (i8 == 3) {
            l6.b.startCoroutineUndispatched(lVar, cVar);
        } else if (i8 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    public final <R, T> void invoke(f6.p pVar, R r8, kotlin.coroutines.c cVar) {
        int i8 = a.$EnumSwitchMapping$0[ordinal()];
        if (i8 == 1) {
            l6.a.startCoroutineCancellable$default(pVar, r8, cVar, null, 4, null);
            return;
        }
        if (i8 == 2) {
            kotlin.coroutines.e.startCoroutine(pVar, r8, cVar);
        } else if (i8 == 3) {
            l6.b.startCoroutineUndispatched(pVar, r8, cVar);
        } else if (i8 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
