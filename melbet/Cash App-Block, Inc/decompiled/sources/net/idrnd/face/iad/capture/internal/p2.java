package net.idrnd.face.iad.capture.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes9.dex */
public final class p2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CAPTURE_END_FIELD_NUMBER = 4;
    public static final int CAPTURE_START_FIELD_NUMBER = 3;
    public static final int CONTROL_PHOTO_FIELD_NUMBER = 2;
    private static final p2 DEFAULT_INSTANCE;
    private static volatile Parser<p2> PARSER = null;
    public static final int PHOTO_FIELD_NUMBER = 1;
    private long captureEnd_;
    private long captureStart_;
    private long controlPhoto_;
    private long photo_;

    static {
        p2 p2Var = new p2();
        DEFAULT_INSTANCE = p2Var;
        GeneratedMessageLite.registerDefaultInstance(p2.class, p2Var);
    }

    public static o2 a() {
        return (o2) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (r0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new p2();
            case 2:
                return new o2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002", new Object[]{"photo_", "controlPhoto_", "captureStart_", "captureEnd_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<p2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (p2.class) {
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
