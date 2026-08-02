package net.idrnd.face.iad.capture.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes9.dex */
public final class j2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final j2 DEFAULT_INSTANCE;
    private static volatile Parser<j2> PARSER = null;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    private int x_;
    private int y_;

    static {
        j2 j2Var = new j2();
        DEFAULT_INSTANCE = j2Var;
        GeneratedMessageLite.registerDefaultInstance(j2.class, j2Var);
    }

    public static i2 c() {
        return (i2) DEFAULT_INSTANCE.createBuilder();
    }

    public final int a() {
        return this.x_;
    }

    public final int b() {
        return this.y_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (r0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new j2();
            case 2:
                return new i2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"x_", "y_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<j2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (j2.class) {
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
