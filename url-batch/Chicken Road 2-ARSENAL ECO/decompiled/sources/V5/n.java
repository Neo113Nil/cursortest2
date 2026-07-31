package V5;

import U5.AbstractC0216c;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final o f2741a = new o();

    public static final i a(Number number, String str) {
        return new i("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) f(str, -1)));
    }

    public static final i b(int i7, CharSequence input, String message) {
        kotlin.jvm.internal.i.e(message, "message");
        kotlin.jvm.internal.i.e(input, "input");
        String message2 = message + "\nJSON input: " + ((Object) f(input, i7));
        kotlin.jvm.internal.i.e(message2, "message");
        if (i7 >= 0) {
            message2 = "Unexpected JSON token at offset " + i7 + ": " + message2;
        }
        kotlin.jvm.internal.i.e(message2, "message");
        return new i(message2);
    }

    public static final R5.e c(R5.e eVar, U0.h module) {
        kotlin.jvm.internal.i.e(eVar, "<this>");
        kotlin.jvm.internal.i.e(module, "module");
        return (!kotlin.jvm.internal.i.a(eVar.c(), R5.h.f2170b) && eVar.isInline()) ? c(eVar.h(0), module) : eVar;
    }

    public static final byte d(char c7) {
        if (c7 < '~') {
            return d.f2730b[c7];
        }
        return (byte) 0;
    }

    public static final void e(u uVar, String str) {
        uVar.l("Trailing comma before the end of JSON ".concat(str), uVar.f2768b - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence f(CharSequence charSequence, int i7) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i7 != -1) {
                int i8 = i7 - 30;
                int i9 = i7 + 30;
                String str = i8 <= 0 ? "" : ".....";
                String str2 = i9 >= charSequence.length() ? "" : ".....";
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (i8 < 0) {
                    i8 = 0;
                }
                int length = charSequence.length();
                if (i9 > length) {
                    i9 = length;
                }
                sb.append(charSequence.subSequence(i8, i9).toString());
                sb.append(str2);
                return sb.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void g(R5.e eVar, AbstractC0216c json) {
        kotlin.jvm.internal.i.e(eVar, "<this>");
        kotlin.jvm.internal.i.e(json, "json");
        kotlin.jvm.internal.i.a(eVar.c(), R5.i.f2172b);
    }

    public static final w h(R5.e desc, AbstractC0216c abstractC0216c) {
        kotlin.jvm.internal.i.e(desc, "desc");
        A3.c c7 = desc.c();
        if (c7 instanceof R5.b) {
            return w.f2778k;
        }
        if (kotlin.jvm.internal.i.a(c7, R5.i.f2173c)) {
            return w.f2776i;
        }
        if (!kotlin.jvm.internal.i.a(c7, R5.i.f2174d)) {
            return w.f2775h;
        }
        R5.e c8 = c(desc.h(0), abstractC0216c.f2636b);
        A3.c c9 = c8.c();
        if ((c9 instanceof R5.d) || kotlin.jvm.internal.i.a(c9, R5.h.f2171c)) {
            return w.f2777j;
        }
        throw new i("Value of type '" + c8.b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + c8.c() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final void i(u uVar, Number number) {
        u.m(uVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
        throw null;
    }

    public static final String j(byte b7) {
        return b7 == 1 ? "quotation mark '\"'" : b7 == 2 ? "string escape sequence '\\'" : b7 == 4 ? "comma ','" : b7 == 5 ? "colon ':'" : b7 == 6 ? "start of the object '{'" : b7 == 7 ? "end of the object '}'" : b7 == 8 ? "start of the array '['" : b7 == 9 ? "end of the array ']'" : b7 == 10 ? "end of the input" : b7 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }
}
