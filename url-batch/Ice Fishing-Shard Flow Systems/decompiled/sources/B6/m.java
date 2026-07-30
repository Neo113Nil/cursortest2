package B6;

import A6.AbstractC0091c;
import A6.y;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final n f226a = new n();

    public static final i a(Number value, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(output, "output");
        return new i("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) g(output, -1)));
    }

    public static final i b(int i2, String message, CharSequence input) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(input, "input");
        String message2 = message + "\nJSON input: " + ((Object) g(input, i2));
        Intrinsics.checkNotNullParameter(message2, "message");
        if (i2 >= 0) {
            message2 = "Unexpected JSON token at offset " + i2 + ": " + message2;
        }
        Intrinsics.checkNotNullParameter(message2, "message");
        return new i(message2);
    }

    public static final x6.e c(x6.e descriptor, c2.e module) {
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (!Intrinsics.a(descriptor.c(), x6.h.f8440b)) {
            return descriptor.f() ? c(descriptor.i(0), module) : descriptor;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        return descriptor;
    }

    public static final byte d(char c7) {
        if (c7 < '~') {
            return d.f218b[c7];
        }
        return (byte) 0;
    }

    public static final void e(AbstractC0091c json, p sb, w6.a serializer, y yVar) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(sb, "writer");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        x mode = x.f266i;
        t[] modeReuseCache = new t[x.f271p.a()];
        Intrinsics.checkNotNullParameter(sb, "output");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
        Intrinsics.checkNotNullParameter(sb, "sb");
        Intrinsics.checkNotNullParameter(json, "json");
        new t(new e(sb), json, mode, modeReuseCache).m(serializer, yVar);
    }

    public static final void f(v vVar, String entity) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(entity, "entity");
        vVar.l(vVar.f259b - 1, "Trailing comma before the end of JSON ".concat(entity), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence g(CharSequence charSequence, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i2 != -1) {
                int i5 = i2 - 30;
                int i7 = i2 + 30;
                String str = i5 <= 0 ? "" : ".....";
                String str2 = i7 >= charSequence.length() ? "" : ".....";
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (i5 < 0) {
                    i5 = 0;
                }
                int length = charSequence.length();
                if (i7 > length) {
                    i7 = length;
                }
                sb.append(charSequence.subSequence(i5, i7).toString());
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

    public static final void h(AbstractC0091c json, x6.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.a(eVar.c(), x6.i.f8442b)) {
            A6.j jVar = json.f97a;
        }
    }

    public static final x i(AbstractC0091c abstractC0091c, x6.e desc) {
        Intrinsics.checkNotNullParameter(abstractC0091c, "<this>");
        Intrinsics.checkNotNullParameter(desc, "desc");
        V6.b c7 = desc.c();
        if (c7 instanceof x6.b) {
            return x.f269n;
        }
        if (Intrinsics.a(c7, x6.i.f8443c)) {
            return x.f267l;
        }
        if (!Intrinsics.a(c7, x6.i.f8444d)) {
            return x.f266i;
        }
        x6.e keyDescriptor = c(desc.i(0), abstractC0091c.f98b);
        V6.b c8 = keyDescriptor.c();
        if ((c8 instanceof x6.d) || Intrinsics.a(c8, x6.h.f8441c)) {
            return x.f268m;
        }
        Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        throw new i("Value of type '" + keyDescriptor.b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.c() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final void j(v vVar, Number result) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        v.m(vVar, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
        throw null;
    }

    public static final String k(byte b7) {
        return b7 == 1 ? "quotation mark '\"'" : b7 == 2 ? "string escape sequence '\\'" : b7 == 4 ? "comma ','" : b7 == 5 ? "colon ':'" : b7 == 6 ? "start of the object '{'" : b7 == 7 ? "end of the object '}'" : b7 == 8 ? "start of the array '['" : b7 == 9 ? "end of the array ']'" : b7 == 10 ? "end of the input" : b7 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }
}
