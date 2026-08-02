package net.idrnd.face.iad.capture.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes9.dex */
public final class x1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final x1 DEFAULT_INSTANCE;
    private static volatile Parser<x1> PARSER = null;
    public static final int QUALITY_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int quality_;
    private int type_;

    static {
        x1 x1Var = new x1();
        DEFAULT_INSTANCE = x1Var;
        GeneratedMessageLite.registerDefaultInstance(x1.class, x1Var);
    }

    public static w1 a() {
        return (w1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (r0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new x1();
            case 2:
                return new w1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[]{"type_", "quality_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<x1> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (x1.class) {
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
