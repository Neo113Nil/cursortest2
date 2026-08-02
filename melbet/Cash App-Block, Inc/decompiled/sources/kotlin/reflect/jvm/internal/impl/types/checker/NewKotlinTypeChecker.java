package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes9.dex */
public interface NewKotlinTypeChecker extends KotlinTypeChecker {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final NewKotlinTypeCheckerImpl Default = new NewKotlinTypeCheckerImpl(KotlinTypeRefiner.Default.INSTANCE, null, 2, 0 == true ? 1 : 0);

        public final NewKotlinTypeCheckerImpl getDefault() {
            return Default;
        }
    }

    KotlinTypeRefiner getKotlinTypeRefiner();

    OverridingUtil getOverridingUtil();
}
