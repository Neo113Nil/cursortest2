package E2;

import B.Y;
import S1.B;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final i f1054a = new i();

    public static final c a(int i3, String str, CharSequence charSequence) {
        f2.j.f(str, "message");
        f2.j.f(charSequence, "input");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\nJSON input: ");
        f2.j.f(charSequence, "<this>");
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
        f2.j.f(sb3, "message");
        if (i3 >= 0) {
            sb3 = "Unexpected JSON token at offset " + i3 + ": " + sb3;
        }
        f2.j.f(sb3, "message");
        return new c(sb3);
    }

    public static final void b(LinkedHashMap linkedHashMap, SerialDescriptor serialDescriptor, String str, int i3) {
        String str2 = f2.j.a(serialDescriptor.i(), A2.j.f256d) ? "enum value" : "property";
        if (!linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, Integer.valueOf(i3));
            return;
        }
        String str3 = "The suggested name '" + str + "' for " + str2 + ' ' + serialDescriptor.a(i3) + " is already one of the names for " + str2 + ' ' + serialDescriptor.a(((Number) B.I(str, linkedHashMap)).intValue()) + " in " + serialDescriptor;
        f2.j.f(str3, "message");
        throw new f(str3);
    }

    public static final SerialDescriptor c(SerialDescriptor serialDescriptor, A1.i iVar) {
        f2.j.f(serialDescriptor, "<this>");
        f2.j.f(iVar, "module");
        if (!f2.j.a(serialDescriptor.i(), A2.j.f255c)) {
            return serialDescriptor.b() ? c(serialDescriptor.h(0), iVar) : serialDescriptor;
        }
        O2.d.O(serialDescriptor);
        return serialDescriptor;
    }

    public static final byte d(char c2) {
        if (c2 < '~') {
            return a.f1045b[c2];
        }
        return (byte) 0;
    }

    public static final String e(D2.c cVar, SerialDescriptor serialDescriptor) {
        f2.j.f(serialDescriptor, "<this>");
        f2.j.f(cVar, "json");
        for (Annotation annotation : serialDescriptor.k()) {
            if (annotation instanceof D2.h) {
                return ((D2.h) annotation).discriminator();
            }
        }
        return cVar.f871a.f888j;
    }

    public static final Map f(D2.c cVar, SerialDescriptor serialDescriptor) {
        f2.j.f(cVar, "<this>");
        f2.j.f(serialDescriptor, "descriptor");
        i iVar = f1054a;
        g gVar = new g(serialDescriptor, 0, cVar);
        Y y3 = cVar.f873c;
        y3.getClass();
        y3.getClass();
        i iVar2 = f1054a;
        f2.j.f(serialDescriptor, "descriptor");
        Map map = (Map) ((ConcurrentHashMap) y3.f334d).get(serialDescriptor);
        Object obj = map != null ? map.get(iVar2) : null;
        Object obj2 = obj != null ? obj : null;
        if (obj2 == null) {
            obj2 = gVar.b();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) y3.f334d;
            Object obj3 = concurrentHashMap.get(serialDescriptor);
            if (obj3 == null) {
                obj3 = new ConcurrentHashMap(2);
                concurrentHashMap.put(serialDescriptor, obj3);
            }
            ((Map) obj3).put(iVar, obj2);
        }
        return (Map) obj2;
    }

    public static final int g(SerialDescriptor serialDescriptor, D2.c cVar, String str) {
        f2.j.f(serialDescriptor, "<this>");
        f2.j.f(cVar, "json");
        f2.j.f(str, "name");
        D2.i iVar = cVar.f871a;
        if (iVar.f891m && f2.j.a(serialDescriptor.i(), A2.j.f256d)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            f2.j.e(lowerCase, "toLowerCase(...)");
            Integer num = (Integer) f(cVar, serialDescriptor).get(lowerCase);
            if (num != null) {
                return num.intValue();
            }
            return -3;
        }
        i(cVar, serialDescriptor);
        int c2 = serialDescriptor.c(str);
        if (c2 != -3) {
            return c2;
        }
        if (!iVar.f890l) {
            return c2;
        }
        Integer num2 = (Integer) f(cVar, serialDescriptor).get(str);
        if (num2 != null) {
            return num2.intValue();
        }
        return -3;
    }

    public static final void h(o oVar, String str) {
        f2.j.f(str, "entity");
        oVar.m(oVar.f1078a - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final void i(D2.c cVar, SerialDescriptor serialDescriptor) {
        f2.j.f(serialDescriptor, "<this>");
        f2.j.f(cVar, "json");
        f2.j.a(serialDescriptor.i(), A2.k.f257c);
    }

    public static final void j(o oVar, Number number) {
        o.n(oVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String k(byte b3) {
        return b3 == 1 ? "quotation mark '\"'" : b3 == 2 ? "string escape sequence '\\'" : b3 == 4 ? "comma ','" : b3 == 5 ? "colon ':'" : b3 == 6 ? "start of the object '{'" : b3 == 7 ? "end of the object '}'" : b3 == 8 ? "start of the array '['" : b3 == 9 ? "end of the array ']'" : b3 == 10 ? "end of the input" : b3 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }
}
