package com.yandex.div.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ComparisonFailure extends AssertionError {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String actual;

    @NotNull
    private final String expected;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    private static final class ComparisonCompactor {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @Nullable
        private final String actual;
        private final int contextLength;

        @Nullable
        private final String expected;
        private int prefix;
        private int suffix;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public ComparisonCompactor(int i4, @Nullable String str, @Nullable String str2) {
            this.contextLength = i4;
            this.expected = str;
            this.actual = str2;
        }

        private final boolean areStringsEqual() {
            return Intrinsics.areEqual(this.expected, this.actual);
        }

        private final String compactString(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            String substring = str.substring(this.prefix, (str.length() - this.suffix) + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append(']');
            String sb2 = sb.toString();
            if (this.prefix > 0) {
                sb2 = computeCommonPrefix() + sb2;
            }
            if (this.suffix <= 0) {
                return sb2;
            }
            return sb2 + computeCommonSuffix();
        }

        private final String computeCommonPrefix() {
            String str = this.prefix > this.contextLength ? "..." : "";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str2 = this.expected;
            Intrinsics.checkNotNull(str2);
            String substring = str2.substring(Math.max(0, this.prefix - this.contextLength), this.prefix);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(substring);
            return sb.toString();
        }

        private final String computeCommonSuffix() {
            String str = this.expected;
            Intrinsics.checkNotNull(str);
            int min = Math.min((str.length() - this.suffix) + 1 + this.contextLength, this.expected.length());
            String str2 = (this.expected.length() - this.suffix) + 1 < this.expected.length() - this.contextLength ? "..." : "";
            StringBuilder sb = new StringBuilder();
            String str3 = this.expected;
            String substring = str3.substring((str3.length() - this.suffix) + 1, min);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append(str2);
            return sb.toString();
        }

        private final void findCommonPrefix() {
            this.prefix = 0;
            String str = this.expected;
            Intrinsics.checkNotNull(str);
            int length = str.length();
            String str2 = this.actual;
            Intrinsics.checkNotNull(str2);
            int min = Math.min(length, str2.length());
            while (true) {
                int i4 = this.prefix;
                if (i4 >= min || this.expected.charAt(i4) != this.actual.charAt(this.prefix)) {
                    return;
                } else {
                    this.prefix++;
                }
            }
        }

        private final void findCommonSuffix() {
            String str = this.expected;
            Intrinsics.checkNotNull(str);
            int length = str.length() - 1;
            String str2 = this.actual;
            Intrinsics.checkNotNull(str2);
            int length2 = str2.length() - 1;
            while (true) {
                int i4 = this.prefix;
                if (length2 < i4 || length < i4 || this.expected.charAt(length) != this.actual.charAt(length2)) {
                    break;
                }
                length2--;
                length--;
            }
            this.suffix = this.expected.length() - length;
        }

        @NotNull
        public final String compact(@Nullable String str) {
            if (this.expected == null || this.actual == null || areStringsEqual()) {
                String format = Assert.format(str, this.expected, this.actual);
                Intrinsics.checkNotNullExpressionValue(format, "format(message, expected, actual)");
                return format;
            }
            findCommonPrefix();
            findCommonSuffix();
            String format2 = Assert.format(str, compactString(this.expected), compactString(this.actual));
            Intrinsics.checkNotNullExpressionValue(format2, "format(message, expected, actual)");
            return format2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComparisonFailure(@Nullable String str, @NotNull String expected, @NotNull String actual) {
        super(str);
        Intrinsics.checkNotNullParameter(expected, "expected");
        Intrinsics.checkNotNullParameter(actual, "actual");
        this.expected = expected;
        this.actual = actual;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return new ComparisonCompactor(20, this.expected, this.actual).compact(super.getMessage());
    }
}
