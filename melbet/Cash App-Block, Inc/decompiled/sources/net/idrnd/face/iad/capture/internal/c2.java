package net.idrnd.face.iad.capture.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes9.dex */
public final class c2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final c2 DEFAULT_INSTANCE;
    private static volatile Parser<c2> PARSER = null;
    public static final int TIMESTAMP_MS_FIELD_NUMBER = 4;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    public static final int Z_FIELD_NUMBER = 3;
    private long timestampMs_;
    private double x_;
    private double y_;
    private double z_;

    static {
        c2 c2Var = new c2();
        DEFAULT_INSTANCE = c2Var;
        GeneratedMessageLite.registerDefaultInstance(c2.class, c2Var);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (r0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new c2();
            case 2:
                return new b2(0);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0000\u0004\u0002", new Object[]{"x_", "y_", "z_", "timestampMs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<c2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (c2.class) {
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
