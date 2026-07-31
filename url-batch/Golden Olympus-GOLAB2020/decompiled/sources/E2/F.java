package E2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class F {
    public static final B a(Number value, String key, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(output, "output");
        return d(-1, j(value, key, output));
    }

    public static final D b(Number value, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(output, "output");
        return new D("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) h(output, 0, 1, null)));
    }

    public static final D c(A2.f keyDescriptor) {
        Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        return new D("Value of type '" + keyDescriptor.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final B d(int i4, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i4 >= 0) {
            message = "Unexpected JSON token at offset " + i4 + ": " + message;
        }
        return new B(message);
    }

    public static final B e(int i4, String message, CharSequence input) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(input, "input");
        return d(i4, message + "\nJSON input: " + ((Object) g(input, i4)));
    }

    public static final B f(String key, String input) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(input, "input");
        return d(-1, "Encountered an unknown key '" + key + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) h(input, 0, 1, null)));
    }

    private static final CharSequence g(CharSequence charSequence, int i4) {
        if (charSequence.length() >= 200) {
            if (i4 != -1) {
                int i5 = i4 - 30;
                int i6 = i4 + 30;
                return (i5 <= 0 ? "" : ".....") + charSequence.subSequence(kotlin.ranges.g.d(i5, 0), kotlin.ranges.g.g(i6, charSequence.length())).toString() + (i6 >= charSequence.length() ? "" : ".....");
            }
            int length = charSequence.length() - 60;
            if (length > 0) {
                return "....." + charSequence.subSequence(length, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    static /* synthetic */ CharSequence h(CharSequence charSequence, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = -1;
        }
        return g(charSequence, i4);
    }

    public static final Void i(AbstractC0370a abstractC0370a, Number result) {
        Intrinsics.checkNotNullParameter(abstractC0370a, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        AbstractC0370a.y(abstractC0370a, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new W1.f();
    }

    private static final String j(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) h(str2, 0, 1, null));
    }
}
