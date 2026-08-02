package kotlin.reflect.jvm.internal.impl.name;

import kotlin.text.Regex;

/* loaded from: classes9.dex */
public final class NameUtils {
    public static final NameUtils INSTANCE = new NameUtils();
    public static final Regex SANITIZE_AS_JAVA_INVALID_CHARACTERS = new Regex("[^\\p{L}\\p{Digit}]");
    public static final String CONTEXT_RECEIVER_PREFIX = "$context_receiver";

    public static final Name contextReceiverName(int i) {
        Name identifier = Name.identifier(CONTEXT_RECEIVER_PREFIX + '_' + i);
        identifier.getClass();
        return identifier;
    }

    public static final String sanitizeAsJavaIdentifier(String str) {
        str.getClass();
        return SANITIZE_AS_JAVA_INVALID_CHARACTERS.replace(str, "_");
    }
}
