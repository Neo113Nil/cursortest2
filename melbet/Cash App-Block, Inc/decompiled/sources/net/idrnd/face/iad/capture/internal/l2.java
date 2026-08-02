package net.idrnd.face.iad.capture.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes9.dex */
public final class l2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ACCELERATION_FIELD_NUMBER = 1;
    public static final int ACCELERATION_INCLUDING_GRAVITY_FIELD_NUMBER = 2;
    public static final int ANGULAR_VELOCITY_FIELD_NUMBER = 3;
    private static final l2 DEFAULT_INSTANCE;
    public static final int MOTION_FIELD_NUMBER = 4;
    private static volatile Parser<l2> PARSER;
    private Internal.ProtobufList<c2> acceleration_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<c2> accelerationIncludingGravity_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<c2> angularVelocity_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<c2> motion_ = GeneratedMessageLite.emptyProtobufList();

    static {
        l2 l2Var = new l2();
        DEFAULT_INSTANCE = l2Var;
        GeneratedMessageLite.registerDefaultInstance(l2.class, l2Var);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (r0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new l2();
            case 2:
                return new b2(2);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"acceleration_", c2.class, "accelerationIncludingGravity_", c2.class, "angularVelocity_", c2.class, "motion_", c2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<l2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (l2.class) {
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
