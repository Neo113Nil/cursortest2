package net.idrnd.face.iad.capture.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes9.dex */
public final class l1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final l1 DEFAULT_INSTANCE;
    public static final int DEVICEROTATION_FIELD_NUMBER = 2;
    public static final int IMAGEROTATION_FIELD_NUMBER = 3;
    private static volatile Parser<l1> PARSER = null;
    public static final int TARGETORIENTATION_FIELD_NUMBER = 1;
    private int deviceRotation_;
    private int imageRotation_;
    private int targetOrientation_;

    static {
        l1 l1Var = new l1();
        DEFAULT_INSTANCE = l1Var;
        GeneratedMessageLite.registerDefaultInstance(l1.class, l1Var);
    }

    public static k1 a() {
        return (k1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (r0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new l1();
            case 2:
                return new k1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\u0004", new Object[]{"targetOrientation_", "deviceRotation_", "imageRotation_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<l1> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (l1.class) {
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
