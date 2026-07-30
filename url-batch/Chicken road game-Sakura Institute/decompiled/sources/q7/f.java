package q7;

import java.lang.annotation.Annotation;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final g f7551a = new g();

    public static final c a(int i7, String str, CharSequence charSequence) {
        r6.k.f(str, "message");
        r6.k.f(charSequence, "input");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\nJSON input: ");
        r6.k.f(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i7 == -1) {
                int length = charSequence.length() - 60;
                if (length > 0) {
                    charSequence = "....." + charSequence.subSequence(length, charSequence.length()).toString();
                }
            } else {
                int i8 = i7 - 30;
                int i9 = i7 + 30;
                String str2 = i8 <= 0 ? "" : ".....";
                String str3 = i9 >= charSequence.length() ? "" : ".....";
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                if (i8 < 0) {
                    i8 = 0;
                }
                int length2 = charSequence.length();
                if (i9 > length2) {
                    i9 = length2;
                }
                sb2.append(charSequence.subSequence(i8, i9).toString());
                sb2.append(str3);
                charSequence = sb2.toString();
            }
        }
        sb.append((Object) charSequence);
        String sb3 = sb.toString();
        r6.k.f(sb3, "message");
        if (i7 >= 0) {
            sb3 = "Unexpected JSON token at offset " + i7 + ": " + sb3;
        }
        r6.k.f(sb3, "message");
        return new c(sb3);
    }

    public static final SerialDescriptor b(SerialDescriptor serialDescriptor, j4.i iVar) {
        r6.k.f(serialDescriptor, "<this>");
        r6.k.f(iVar, "module");
        if (!r6.k.a(serialDescriptor.c(), m7.g.f6461g)) {
            return serialDescriptor.f() ? b(serialDescriptor.j(0), iVar) : serialDescriptor;
        }
        a.a.w(serialDescriptor);
        return serialDescriptor;
    }

    public static final byte c(char c4) {
        if (c4 < '~') {
            return a.f7545b[c4];
        }
        return (byte) 0;
    }

    public static final String d(SerialDescriptor serialDescriptor, p7.c cVar) {
        r6.k.f(serialDescriptor, "<this>");
        r6.k.f(cVar, "json");
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof p7.h) {
                return ((p7.h) annotation).discriminator();
            }
        }
        return cVar.f7215a.f7227e;
    }

    public static final void e(j5.a aVar, String str) {
        aVar.n(aVar.f5034b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final void f(SerialDescriptor serialDescriptor, p7.c cVar) {
        r6.k.f(serialDescriptor, "<this>");
        r6.k.f(cVar, "json");
        r6.k.a(serialDescriptor.c(), m7.h.f6463g);
    }

    public static final void g(j5.a aVar, Number number) {
        j5.a.o(aVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String h(byte b9) {
        return b9 == 1 ? "quotation mark '\"'" : b9 == 2 ? "string escape sequence '\\'" : b9 == 4 ? "comma ','" : b9 == 5 ? "colon ':'" : b9 == 6 ? "start of the object '{'" : b9 == 7 ? "end of the object '}'" : b9 == 8 ? "start of the array '['" : b9 == 9 ? "end of the array ']'" : b9 == 10 ? "end of the input" : b9 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }
}
