package net.idrnd.face.iad.capture.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes9.dex */
public final class n2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final n2 DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    private static volatile Parser<n2> PARSER = null;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private int height_;
    private int width_;

    static {
        n2 n2Var = new n2();
        DEFAULT_INSTANCE = n2Var;
        GeneratedMessageLite.registerDefaultInstance(n2.class, n2Var);
    }

    public static m2 a() {
        return (m2) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (r0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new n2();
            case 2:
                return new m2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"width_", "height_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<n2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (n2.class) {
                    try {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            default:
                OptionalProvider$$ExternalSyntheticLambda0.m();
            case 7:
                return null;
        }
    }
}
