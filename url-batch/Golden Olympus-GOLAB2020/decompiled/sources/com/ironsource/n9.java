package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class n9 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Throwable f18330a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f18331b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f18332c;

    public n9(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f18330a = throwable;
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "throwable.stackTrace");
        sb.append(throwable.toString());
        sb.append(System.lineSeparator());
        boolean z4 = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString());
            sb.append(';' + System.lineSeparator());
            String stackTraceElement2 = stackTraceElement.toString();
            Intrinsics.checkNotNullExpressionValue(stackTraceElement2, "elem.toString()");
            String e4 = o9.d().e();
            Intrinsics.checkNotNullExpressionValue(e4, "getInstance().keyword");
            if (StringsKt.P(stackTraceElement2, e4, false, 2, null)) {
                z4 = true;
            }
        }
        Throwable cause = this.f18330a.getCause();
        if (cause != null) {
            sb.append("--CAUSE");
            sb.append(System.lineSeparator());
            sb.append(cause.toString());
            sb.append(System.lineSeparator());
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace2, "cause.stackTrace");
            for (StackTraceElement stackTraceElement3 : stackTrace2) {
                sb.append(stackTraceElement3.toString());
                sb.append(';' + System.lineSeparator());
                String stackTraceElement4 = stackTraceElement3.toString();
                Intrinsics.checkNotNullExpressionValue(stackTraceElement4, "elem.toString()");
                String e5 = o9.d().e();
                Intrinsics.checkNotNullExpressionValue(e5, "getInstance().keyword");
                if (StringsKt.P(stackTraceElement4, e5, false, 2, null)) {
                    z4 = true;
                }
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
        this.f18331b = sb2;
        this.f18332c = z4;
    }

    public static /* synthetic */ n9 a(n9 n9Var, Throwable th, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            th = n9Var.f18330a;
        }
        return n9Var.a(th);
    }

    @NotNull
    public final String b() {
        return this.f18331b;
    }

    @NotNull
    public final Throwable c() {
        return this.f18330a;
    }

    public final boolean d() {
        return this.f18332c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n9) && Intrinsics.areEqual(this.f18330a, ((n9) obj).f18330a);
    }

    public int hashCode() {
        return this.f18330a.hashCode();
    }

    @NotNull
    public String toString() {
        return "CrashReportWrapper(throwable=" + this.f18330a + ')';
    }

    @NotNull
    public final n9 a(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return new n9(throwable);
    }

    @NotNull
    public final Throwable a() {
        return this.f18330a;
    }
}
