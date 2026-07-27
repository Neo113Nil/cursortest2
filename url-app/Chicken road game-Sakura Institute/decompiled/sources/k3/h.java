package k3;

import A1.H;
import a.AbstractC0345a;
import e2.C0559a;
import f1.C0607a;
import j3.AbstractC0724c;
import j3.x;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import z2.C1405I;
import z2.C1412P;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final i f7440a = new i();

    public static final d a(Number value, String key, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(output, "output");
        return c(-1, "Unexpected special floating-point value " + value + " with key " + key + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m(output, -1)));
    }

    public static final g b(SerialDescriptor keyDescriptor) {
        Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        String message = "Value of type '" + keyDescriptor.d() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.i() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.";
        Intrinsics.checkNotNullParameter(message, "message");
        return new g(message);
    }

    public static final d c(int i2, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i2 >= 0) {
            message = "Unexpected JSON token at offset " + i2 + ": " + message;
        }
        Intrinsics.checkNotNullParameter(message, "message");
        return new d(message);
    }

    public static final d d(int i2, String message, CharSequence input) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(input, "input");
        return c(i2, message + "\nJSON input: " + ((Object) m(input, i2)));
    }

    public static final C0559a e(AbstractC0724c json, String source) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!json.f7173a.f7212o) {
            return new C0559a(source);
        }
        Intrinsics.checkNotNullParameter(source, "source");
        return new s(source);
    }

    public static final void f(LinkedHashMap linkedHashMap, SerialDescriptor serialDescriptor, String str, int i2) {
        String str2 = Intrinsics.a(serialDescriptor.i(), g3.h.f6806h) ? "enum value" : "property";
        if (!linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, Integer.valueOf(i2));
            return;
        }
        throw new f3.d("The suggested name '" + str + "' for " + str2 + ' ' + serialDescriptor.a(i2) + " is already one of the names for " + str2 + ' ' + serialDescriptor.a(((Number) C1412P.d(str, linkedHashMap)).intValue()) + " in " + serialDescriptor);
    }

    public static final SerialDescriptor g(SerialDescriptor descriptor, A0.q module) {
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (!Intrinsics.a(descriptor.i(), g3.g.f6805h)) {
            return descriptor.b() ? g(descriptor.h(0), module) : descriptor;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        S2.b kClass = AbstractC0345a.s(descriptor);
        if (kClass == null) {
            return descriptor;
        }
        C1405I typeArgumentsSerializers = C1405I.f11931d;
        module.getClass();
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        if (((Map) module.f362c).get(kClass) == null) {
            return descriptor;
        }
        throw new ClassCastException();
    }

    public static final byte h(char c4) {
        if (c4 < '~') {
            return b.f7434b[c4];
        }
        return (byte) 0;
    }

    public static final String i(AbstractC0724c json, SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        for (Annotation annotation : serialDescriptor.k()) {
            if (annotation instanceof j3.i) {
                return ((j3.i) annotation).discriminator();
            }
        }
        return json.f7173a.f7207j;
    }

    public static final Map j(AbstractC0724c abstractC0724c, SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(abstractC0724c, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(abstractC0724c, "<this>");
        C0607a c0607a = abstractC0724c.f7175c;
        i key = f7440a;
        H defaultValue = new H(descriptor, 7, abstractC0724c);
        c0607a.getClass();
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object value = c0607a.v(descriptor);
        if (value == null) {
            value = defaultValue.invoke();
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0607a.f6561e;
            Object obj = concurrentHashMap.get(descriptor);
            if (obj == null) {
                obj = new ConcurrentHashMap(2);
                concurrentHashMap.put(descriptor, obj);
            }
            ((Map) obj).put(key, value);
        }
        return (Map) value;
    }

    public static final int k(SerialDescriptor serialDescriptor, AbstractC0724c json, String name) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        if (json.f7173a.f7210m && Intrinsics.a(serialDescriptor.i(), g3.h.f6806h)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Integer num = (Integer) j(json, serialDescriptor).get(lowerCase);
            if (num != null) {
                return num.intValue();
            }
            return -3;
        }
        n(json, serialDescriptor);
        int c4 = serialDescriptor.c(name);
        if (c4 != -3 || !json.f7173a.f7209l) {
            return c4;
        }
        Integer num2 = (Integer) j(json, serialDescriptor).get(name);
        if (num2 != null) {
            return num2.intValue();
        }
        return -3;
    }

    public static final void l(C0559a c0559a, String entity) {
        Intrinsics.checkNotNullParameter(c0559a, "<this>");
        Intrinsics.checkNotNullParameter(entity, "entity");
        c0559a.n(c0559a.f6165b - 1, "Trailing comma before the end of JSON " + entity, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence m(CharSequence charSequence, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i2 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i4 = i2 - 30;
        int i5 = i2 + 30;
        String str = i4 <= 0 ? "" : ".....";
        String str2 = i5 >= charSequence.length() ? "" : ".....";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (i4 < 0) {
            i4 = 0;
        }
        int length2 = charSequence.length();
        if (i5 > length2) {
            i5 = length2;
        }
        sb.append(charSequence.subSequence(i4, i5).toString());
        sb.append(str2);
        return sb.toString();
    }

    public static final void n(AbstractC0724c json, SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.a(serialDescriptor.i(), g3.i.f6807h)) {
            j3.j jVar = json.f7173a;
        }
    }

    public static final Object o(AbstractC0724c abstractC0724c, String discriminator, x element, KSerializer deserializer) {
        Intrinsics.checkNotNullParameter(abstractC0724c, "<this>");
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return new k(abstractC0724c, element, discriminator, deserializer.getDescriptor()).h(deserializer);
    }

    public static final void p(C0559a c0559a, Number result) {
        Intrinsics.checkNotNullParameter(c0559a, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        C0559a.o(c0559a, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String q(byte b4) {
        return b4 == 1 ? "quotation mark '\"'" : b4 == 2 ? "string escape sequence '\\'" : b4 == 4 ? "comma ','" : b4 == 5 ? "colon ':'" : b4 == 6 ? "start of the object '{'" : b4 == 7 ? "end of the object '}'" : b4 == 8 ? "start of the array '['" : b4 == 9 ? "end of the array ']'" : b4 == 10 ? "end of the input" : b4 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }
}
