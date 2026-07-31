package com.yandex.div.evaluable.internal;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface Token {

    @Metadata
    public static final class Function implements Token {

        @NotNull
        private final String name;

        @Metadata
        public static final class ArgumentDelimiter implements Token {

            @NotNull
            public static final ArgumentDelimiter INSTANCE = new ArgumentDelimiter();

            private ArgumentDelimiter() {
            }

            @NotNull
            public String toString() {
                return StringUtils.COMMA;
            }
        }

        public Function(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Function) && Intrinsics.areEqual(this.name, ((Function) obj).name);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @NotNull
        public String toString() {
            return "Function(name=" + this.name + ')';
        }
    }

    @Metadata
    public interface Operand extends Token {

        @Metadata
        public interface Literal extends Operand {

            @Metadata
            public static final class Bool implements Literal {
                private final boolean value;

                private /* synthetic */ Bool(boolean z4) {
                    this.value = z4;
                }

                /* renamed from: box-impl, reason: not valid java name */
                public static final /* synthetic */ Bool m182boximpl(boolean z4) {
                    return new Bool(z4);
                }

                /* renamed from: constructor-impl, reason: not valid java name */
                public static boolean m183constructorimpl(boolean z4) {
                    return z4;
                }

                /* renamed from: equals-impl, reason: not valid java name */
                public static boolean m184equalsimpl(boolean z4, Object obj) {
                    return (obj instanceof Bool) && z4 == ((Bool) obj).m187unboximpl();
                }

                /* renamed from: hashCode-impl, reason: not valid java name */
                public static int m185hashCodeimpl(boolean z4) {
                    if (z4) {
                        return 1;
                    }
                    return z4 ? 1 : 0;
                }

                /* renamed from: toString-impl, reason: not valid java name */
                public static String m186toStringimpl(boolean z4) {
                    return "Bool(value=" + z4 + ')';
                }

                public boolean equals(Object obj) {
                    return m184equalsimpl(this.value, obj);
                }

                public int hashCode() {
                    return m185hashCodeimpl(this.value);
                }

                public String toString() {
                    return m186toStringimpl(this.value);
                }

                /* renamed from: unbox-impl, reason: not valid java name */
                public final /* synthetic */ boolean m187unboximpl() {
                    return this.value;
                }
            }

            @Metadata
            public static final class Num implements Literal {

                @NotNull
                private final Number value;

                private /* synthetic */ Num(Number number) {
                    this.value = number;
                }

                /* renamed from: box-impl, reason: not valid java name */
                public static final /* synthetic */ Num m188boximpl(Number number) {
                    return new Num(number);
                }

                @NotNull
                /* renamed from: constructor-impl, reason: not valid java name */
                public static Number m189constructorimpl(@NotNull Number value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value;
                }

                /* renamed from: equals-impl, reason: not valid java name */
                public static boolean m190equalsimpl(Number number, Object obj) {
                    return (obj instanceof Num) && Intrinsics.areEqual(number, ((Num) obj).m193unboximpl());
                }

                /* renamed from: hashCode-impl, reason: not valid java name */
                public static int m191hashCodeimpl(Number number) {
                    return number.hashCode();
                }

                /* renamed from: toString-impl, reason: not valid java name */
                public static String m192toStringimpl(Number number) {
                    return "Num(value=" + number + ')';
                }

                public boolean equals(Object obj) {
                    return m190equalsimpl(this.value, obj);
                }

                public int hashCode() {
                    return m191hashCodeimpl(this.value);
                }

                public String toString() {
                    return m192toStringimpl(this.value);
                }

                /* renamed from: unbox-impl, reason: not valid java name */
                public final /* synthetic */ Number m193unboximpl() {
                    return this.value;
                }
            }

            @Metadata
            public static final class Str implements Literal {

                @NotNull
                private final String value;

                private /* synthetic */ Str(String str) {
                    this.value = str;
                }

                /* renamed from: box-impl, reason: not valid java name */
                public static final /* synthetic */ Str m194boximpl(String str) {
                    return new Str(str);
                }

                @NotNull
                /* renamed from: constructor-impl, reason: not valid java name */
                public static String m195constructorimpl(@NotNull String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value;
                }

                /* renamed from: equals-impl, reason: not valid java name */
                public static boolean m196equalsimpl(String str, Object obj) {
                    return (obj instanceof Str) && Intrinsics.areEqual(str, ((Str) obj).m199unboximpl());
                }

                /* renamed from: hashCode-impl, reason: not valid java name */
                public static int m197hashCodeimpl(String str) {
                    return str.hashCode();
                }

                /* renamed from: toString-impl, reason: not valid java name */
                public static String m198toStringimpl(String str) {
                    return "Str(value=" + str + ')';
                }

                public boolean equals(Object obj) {
                    return m196equalsimpl(this.value, obj);
                }

                public int hashCode() {
                    return m197hashCodeimpl(this.value);
                }

                public String toString() {
                    return m198toStringimpl(this.value);
                }

                /* renamed from: unbox-impl, reason: not valid java name */
                public final /* synthetic */ String m199unboximpl() {
                    return this.value;
                }
            }
        }

        @Metadata
        public static final class Variable implements Operand {

            @NotNull
            private final String name;

            private /* synthetic */ Variable(String str) {
                this.name = str;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Variable m200boximpl(String str) {
                return new Variable(str);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static String m201constructorimpl(@NotNull String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                return name;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m202equalsimpl(String str, Object obj) {
                return (obj instanceof Variable) && Intrinsics.areEqual(str, ((Variable) obj).m206unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m203equalsimpl0(String str, String str2) {
                return Intrinsics.areEqual(str, str2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m204hashCodeimpl(String str) {
                return str.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m205toStringimpl(String str) {
                return "Variable(name=" + str + ')';
            }

            public boolean equals(Object obj) {
                return m202equalsimpl(this.name, obj);
            }

            public int hashCode() {
                return m204hashCodeimpl(this.name);
            }

            public String toString() {
                return m205toStringimpl(this.name);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ String m206unboximpl() {
                return this.name;
            }
        }
    }

    @Metadata
    public interface Operator extends Token {

        @Metadata
        public interface Binary extends Operator {

            @Metadata
            public interface Comparison extends Binary {

                @Metadata
                public static final class Greater implements Comparison {

                    @NotNull
                    public static final Greater INSTANCE = new Greater();

                    private Greater() {
                    }

                    @NotNull
                    public String toString() {
                        return ">";
                    }
                }

                @Metadata
                public static final class GreaterOrEqual implements Comparison {

                    @NotNull
                    public static final GreaterOrEqual INSTANCE = new GreaterOrEqual();

                    private GreaterOrEqual() {
                    }

                    @NotNull
                    public String toString() {
                        return ">=";
                    }
                }

                @Metadata
                public static final class Less implements Comparison {

                    @NotNull
                    public static final Less INSTANCE = new Less();

                    private Less() {
                    }

                    @NotNull
                    public String toString() {
                        return "<";
                    }
                }

                @Metadata
                public static final class LessOrEqual implements Comparison {

                    @NotNull
                    public static final LessOrEqual INSTANCE = new LessOrEqual();

                    private LessOrEqual() {
                    }

                    @NotNull
                    public String toString() {
                        return "<=";
                    }
                }
            }

            @Metadata
            public interface Equality extends Binary {

                @Metadata
                public static final class Equal implements Equality {

                    @NotNull
                    public static final Equal INSTANCE = new Equal();

                    private Equal() {
                    }

                    @NotNull
                    public String toString() {
                        return "==";
                    }
                }

                @Metadata
                public static final class NotEqual implements Equality {

                    @NotNull
                    public static final NotEqual INSTANCE = new NotEqual();

                    private NotEqual() {
                    }

                    @NotNull
                    public String toString() {
                        return "!=";
                    }
                }
            }

            @Metadata
            public interface Factor extends Binary {

                @Metadata
                public static final class Division implements Factor {

                    @NotNull
                    public static final Division INSTANCE = new Division();

                    private Division() {
                    }

                    @NotNull
                    public String toString() {
                        return "/";
                    }
                }

                @Metadata
                public static final class Modulo implements Factor {

                    @NotNull
                    public static final Modulo INSTANCE = new Modulo();

                    private Modulo() {
                    }

                    @NotNull
                    public String toString() {
                        return "%";
                    }
                }

                @Metadata
                public static final class Multiplication implements Factor {

                    @NotNull
                    public static final Multiplication INSTANCE = new Multiplication();

                    private Multiplication() {
                    }

                    @NotNull
                    public String toString() {
                        return "*";
                    }
                }
            }

            @Metadata
            public interface Logical extends Binary {

                @Metadata
                public static final class And implements Logical {

                    @NotNull
                    public static final And INSTANCE = new And();

                    private And() {
                    }

                    @NotNull
                    public String toString() {
                        return "&&";
                    }
                }

                @Metadata
                public static final class Or implements Logical {

                    @NotNull
                    public static final Or INSTANCE = new Or();

                    private Or() {
                    }

                    @NotNull
                    public String toString() {
                        return "||";
                    }
                }
            }

            @Metadata
            public static final class Power implements Binary {

                @NotNull
                public static final Power INSTANCE = new Power();

                private Power() {
                }

                @NotNull
                public String toString() {
                    return "^";
                }
            }

            @Metadata
            public interface Sum extends Binary {

                @Metadata
                public static final class Minus implements Sum {

                    @NotNull
                    public static final Minus INSTANCE = new Minus();

                    private Minus() {
                    }

                    @NotNull
                    public String toString() {
                        return "-";
                    }
                }

                @Metadata
                public static final class Plus implements Sum {

                    @NotNull
                    public static final Plus INSTANCE = new Plus();

                    private Plus() {
                    }

                    @NotNull
                    public String toString() {
                        return "+";
                    }
                }
            }
        }

        @Metadata
        public static final class Dot implements Operator {

            @NotNull
            public static final Dot INSTANCE = new Dot();

            private Dot() {
            }

            @NotNull
            public String toString() {
                return ".";
            }
        }

        @Metadata
        public static final class TernaryElse implements Operator {

            @NotNull
            public static final TernaryElse INSTANCE = new TernaryElse();

            private TernaryElse() {
            }

            @NotNull
            public String toString() {
                return StringUtils.PROCESS_POSTFIX_DELIMITER;
            }
        }

        @Metadata
        public static final class TernaryIf implements Operator {

            @NotNull
            public static final TernaryIf INSTANCE = new TernaryIf();

            private TernaryIf() {
            }

            @NotNull
            public String toString() {
                return "?";
            }
        }

        @Metadata
        public static final class TernaryIfElse implements Operator {

            @NotNull
            public static final TernaryIfElse INSTANCE = new TernaryIfElse();

            private TernaryIfElse() {
            }
        }

        @Metadata
        public static final class Try implements Operator {

            @NotNull
            public static final Try INSTANCE = new Try();

            private Try() {
            }

            @NotNull
            public String toString() {
                return "!:";
            }
        }

        @Metadata
        public interface Unary extends Operator {

            @Metadata
            public static final class Minus implements Unary {

                @NotNull
                public static final Minus INSTANCE = new Minus();

                private Minus() {
                }

                @NotNull
                public String toString() {
                    return "-";
                }
            }

            @Metadata
            public static final class Not implements Unary {

                @NotNull
                public static final Not INSTANCE = new Not();

                private Not() {
                }

                @NotNull
                public String toString() {
                    return "!";
                }
            }

            @Metadata
            public static final class Plus implements Unary {

                @NotNull
                public static final Plus INSTANCE = new Plus();

                private Plus() {
                }

                @NotNull
                public String toString() {
                    return "+";
                }
            }
        }
    }
}
