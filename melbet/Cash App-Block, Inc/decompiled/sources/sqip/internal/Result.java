package sqip.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u000e*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u000eB\u001b\b\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u00028\u0001¢\u0006\u0002\u0010\fJ\u000b\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\fR\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0012\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000f"}, d2 = {"Lsqip/internal/Result;", "S", "E", "", "successValue", BreadcrumbHelper.Category.ERROR, "(Ljava/lang/Object;Ljava/lang/Object;)V", "Ljava/lang/Object;", "isSuccess", "", "()Z", "getError", "()Ljava/lang/Object;", "getSuccessValue", "Companion", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Result<S, E> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final E error;
    private final S successValue;

    private Result(S s, E e) {
        this.successValue = s;
        this.error = e;
    }

    public final E getError() {
        if (isSuccess()) {
            a$$ExternalSyntheticBUOutline0.m$1("Cannot call getError() when isSuccess() returns true");
            return null;
        }
        E e = this.error;
        e.getClass();
        return e;
    }

    public final S getSuccessValue() {
        if (!isSuccess()) {
            a$$ExternalSyntheticBUOutline0.m$1("Cannot call getSuccessValue() when isSuccess() returns false");
            return null;
        }
        S s = this.successValue;
        s.getClass();
        return s;
    }

    public final boolean isSuccess() {
        return this.error == null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\u00062\u0006\u0010\u0007\u001a\u0002H\u0006¢\u0006\u0002\u0010\bJ+\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\u00062\u0006\u0010\n\u001a\u0002H\u0005¢\u0006\u0002\u0010\b¨\u0006\u000b"}, d2 = {"Lsqip/internal/Result$Companion;", "", "()V", "newError", "Lsqip/internal/Result;", "S", "E", BreadcrumbHelper.Category.ERROR, "(Ljava/lang/Object;)Lsqip/internal/Result;", "newSuccess", "successValue", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <S, E> Result<S, E> newError(E error) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new Result<>(defaultConstructorMarker, error, defaultConstructorMarker);
        }

        public final <S, E> Result<S, E> newSuccess(S successValue) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new Result<>(successValue, defaultConstructorMarker, defaultConstructorMarker);
        }

        private Companion() {
        }
    }

    public /* synthetic */ Result(Object obj, Object obj2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2);
    }
}
