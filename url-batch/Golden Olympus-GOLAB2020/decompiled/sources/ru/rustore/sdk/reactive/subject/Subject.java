package ru.rustore.sdk.reactive.subject;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.backpressure.BackpressureStrategy;
import ru.rustore.sdk.reactive.observable.Observable;

@Metadata
/* loaded from: classes3.dex */
public interface Subject<T> {

    @Metadata
    public static final class DefaultImpls {
        public static /* synthetic */ Observable observe$default(Subject subject, BackpressureStrategy backpressureStrategy, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observe");
            }
            if ((i4 & 1) != 0) {
                backpressureStrategy = new BackpressureStrategy.BufferDropLast(UserVerificationMethods.USER_VERIFY_PATTERN);
            }
            return subject.observe(backpressureStrategy);
        }
    }

    @NotNull
    Observable<T> observe(@NotNull BackpressureStrategy backpressureStrategy);
}
