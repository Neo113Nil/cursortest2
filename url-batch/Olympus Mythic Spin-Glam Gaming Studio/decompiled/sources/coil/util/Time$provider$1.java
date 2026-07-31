package coil.util;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* compiled from: Time.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class Time$provider$1 extends FunctionReferenceImpl implements Function0 {
    public static final Time$provider$1 INSTANCE = new Time$provider$1();

    Time$provider$1() {
        super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: invoke */
    public final Long mo4828invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
