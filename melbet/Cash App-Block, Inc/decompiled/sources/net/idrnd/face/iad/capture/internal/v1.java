package net.idrnd.face.iad.capture.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes9.dex */
public final class v1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 1;
    private static final v1 DEFAULT_INSTANCE;
    private static volatile Parser<v1> PARSER = null;
    public static final int POSITION_ON_IMAGE_FIELD_NUMBER = 4;
    public static final int SIZE_FIELD_NUMBER = 2;
    public static final int TOP_LEFT_POINT_ON_IMAGE_FIELD_NUMBER = 3;
    private ByteString content_ = ByteString.EMPTY;
    private int positionOnImage_;
    private n2 size_;
    private j2 topLeftPointOnImage_;

    static {
        v1 v1Var = new v1();
        DEFAULT_INSTANCE = v1Var;
        GeneratedMessageLite.registerDefaultInstance(v1.class, v1Var);
    }

    public static u1 a() {
        return (u1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (r0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new v1();
            case 2:
                return new u1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\t\u0003\t\u0004\f", new Object[]{"content_", "size_", "topLeftPointOnImage_", "positionOnImage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<v1> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (v1.class) {
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
