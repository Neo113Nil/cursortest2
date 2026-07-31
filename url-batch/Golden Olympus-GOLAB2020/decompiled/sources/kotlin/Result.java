package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class Result<T> implements Serializable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private final Object f41025b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class a implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f41026b;

        public a(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f41026b = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Intrinsics.areEqual(this.f41026b, ((a) obj).f41026b);
        }

        public int hashCode() {
            return this.f41026b.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f41026b + ')';
        }
    }

    private /* synthetic */ Result(Object obj) {
        this.f41025b = obj;
    }

    public static final /* synthetic */ Result a(Object obj) {
        return new Result(obj);
    }

    public static boolean b(Object obj, Object obj2) {
        return (obj2 instanceof Result) && Intrinsics.areEqual(obj, ((Result) obj2).h());
    }

    public static final boolean c(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m243constructorimpl(@Nullable Object obj) {
        return obj;
    }

    public static final Throwable d(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).f41026b;
        }
        return null;
    }

    public static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean f(Object obj) {
        return !(obj instanceof a);
    }

    public static String g(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    /* renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m244isFailureimpl(Object obj) {
        return obj instanceof a;
    }

    public boolean equals(Object obj) {
        return b(this.f41025b, obj);
    }

    public final /* synthetic */ Object h() {
        return this.f41025b;
    }

    public int hashCode() {
        return e(this.f41025b);
    }

    public String toString() {
        return g(this.f41025b);
    }
}
