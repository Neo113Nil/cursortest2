package y2;

import M1.B;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k.C0523b;
import kotlinx.serialization.descriptors.SerialDescriptor;
import n0.o;
import t.u;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final f f8837a = new f();

    public static final c a(int i3, String str, CharSequence charSequence) {
        Z1.i.f(str, "message");
        Z1.i.f(charSequence, "input");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\nJSON input: ");
        Z1.i.f(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i3 == -1) {
                int length = charSequence.length() - 60;
                if (length > 0) {
                    charSequence = "....." + charSequence.subSequence(length, charSequence.length()).toString();
                }
            } else {
                int i4 = i3 - 30;
                int i5 = i3 + 30;
                String str2 = i4 <= 0 ? "" : ".....";
                String str3 = i5 >= charSequence.length() ? "" : ".....";
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                if (i4 < 0) {
                    i4 = 0;
                }
                int length2 = charSequence.length();
                if (i5 > length2) {
                    i5 = length2;
                }
                sb2.append(charSequence.subSequence(i4, i5).toString());
                sb2.append(str3);
                charSequence = sb2.toString();
            }
        }
        sb.append((Object) charSequence);
        String sb3 = sb.toString();
        Z1.i.f(sb3, "message");
        if (i3 >= 0) {
            sb3 = "Unexpected JSON token at offset " + i3 + ": " + sb3;
        }
        Z1.i.f(sb3, "message");
        return new c(sb3);
    }

    public static final void b(LinkedHashMap linkedHashMap, SerialDescriptor serialDescriptor, String str, int i3) {
        String str2 = Z1.i.a(serialDescriptor.i(), u2.g.f8549c) ? "enum value" : "property";
        if (!linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, Integer.valueOf(i3));
            return;
        }
        String str3 = "The suggested name '" + str + "' for " + str2 + ' ' + serialDescriptor.a(i3) + " is already one of the names for " + str2 + ' ' + serialDescriptor.a(((Number) B.D(str, linkedHashMap)).intValue()) + " in " + serialDescriptor;
        Z1.i.f(str3, "message");
        throw new t2.d(str3);
    }

    public static final SerialDescriptor c(SerialDescriptor serialDescriptor, C0523b c0523b) {
        Z1.i.f(serialDescriptor, "<this>");
        Z1.i.f(c0523b, "module");
        if (!Z1.i.a(serialDescriptor.i(), u2.g.f8548b)) {
            return serialDescriptor.b() ? c(serialDescriptor.h(0), c0523b) : serialDescriptor;
        }
        g2.i.O(serialDescriptor);
        return serialDescriptor;
    }

    public static final byte d(char c3) {
        if (c3 < '~') {
            return a.f8832b[c3];
        }
        return (byte) 0;
    }

    public static final String e(SerialDescriptor serialDescriptor, x2.c cVar) {
        Z1.i.f(serialDescriptor, "<this>");
        Z1.i.f(cVar, "json");
        for (Annotation annotation : serialDescriptor.k()) {
            if (annotation instanceof x2.h) {
                return ((x2.h) annotation).discriminator();
            }
        }
        return cVar.f8732a.f8749j;
    }

    public static final Map f(SerialDescriptor serialDescriptor, x2.c cVar) {
        Z1.i.f(cVar, "<this>");
        Z1.i.f(serialDescriptor, "descriptor");
        f fVar = f8837a;
        E1.a aVar = new E1.a(serialDescriptor, 3, cVar);
        o oVar = cVar.f8734c;
        oVar.getClass();
        oVar.getClass();
        f fVar2 = f8837a;
        Z1.i.f(serialDescriptor, "descriptor");
        Map map = (Map) ((ConcurrentHashMap) oVar.f6239a).get(serialDescriptor);
        Object obj = map != null ? map.get(fVar2) : null;
        Object obj2 = obj != null ? obj : null;
        if (obj2 == null) {
            obj2 = aVar.b();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) oVar.f6239a;
            Object obj3 = concurrentHashMap.get(serialDescriptor);
            if (obj3 == null) {
                obj3 = new ConcurrentHashMap(2);
                concurrentHashMap.put(serialDescriptor, obj3);
            }
            ((Map) obj3).put(fVar, obj2);
        }
        return (Map) obj2;
    }

    public static final int g(SerialDescriptor serialDescriptor, x2.c cVar, String str) {
        Z1.i.f(serialDescriptor, "<this>");
        Z1.i.f(cVar, "json");
        Z1.i.f(str, "name");
        x2.i iVar = cVar.f8732a;
        if (iVar.f8752m && Z1.i.a(serialDescriptor.i(), u2.g.f8549c)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Z1.i.e(lowerCase, "toLowerCase(...)");
            Integer num = (Integer) f(serialDescriptor, cVar).get(lowerCase);
            if (num != null) {
                return num.intValue();
            }
            return -3;
        }
        i(serialDescriptor, cVar);
        int c3 = serialDescriptor.c(str);
        if (c3 != -3) {
            return c3;
        }
        if (!iVar.f8751l) {
            return c3;
        }
        Integer num2 = (Integer) f(serialDescriptor, cVar).get(str);
        if (num2 != null) {
            return num2.intValue();
        }
        return -3;
    }

    public static final void h(u uVar, String str) {
        Z1.i.f(str, "entity");
        uVar.m("Trailing comma before the end of JSON ".concat(str), uVar.f7671b - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final void i(SerialDescriptor serialDescriptor, x2.c cVar) {
        Z1.i.f(serialDescriptor, "<this>");
        Z1.i.f(cVar, "json");
        Z1.i.a(serialDescriptor.i(), u2.h.f8550b);
    }

    public static final void j(u uVar, Number number) {
        u.n(uVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String k(byte b2) {
        return b2 == 1 ? "quotation mark '\"'" : b2 == 2 ? "string escape sequence '\\'" : b2 == 4 ? "comma ','" : b2 == 5 ? "colon ':'" : b2 == 6 ? "start of the object '{'" : b2 == 7 ? "end of the object '}'" : b2 == 8 ? "start of the array '['" : b2 == 9 ? "end of the array ']'" : b2 == 10 ? "end of the input" : b2 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }
}
