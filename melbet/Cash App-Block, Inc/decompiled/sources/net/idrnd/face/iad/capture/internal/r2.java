package net.idrnd.face.iad.capture.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes9.dex */
public final class r2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BITRATE_FIELD_NUMBER = 4;
    public static final int CODEC_FIELD_NUMBER = 2;
    public static final int DATA_FIELD_NUMBER = 1;
    private static final r2 DEFAULT_INSTANCE;
    public static final int FPS_FIELD_NUMBER = 5;
    private static volatile Parser<r2> PARSER = null;
    public static final int RESOLUTION_FIELD_NUMBER = 3;
    private int bitrate_;
    private int codec_;
    private ByteString data_ = ByteString.EMPTY;
    private float fps_;
    private n2 resolution_;

    static {
        r2 r2Var = new r2();
        DEFAULT_INSTANCE = r2Var;
        GeneratedMessageLite.registerDefaultInstance(r2.class, r2Var);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (r0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new r2();
            case 2:
                return new b2(5);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\f\u0003\t\u0004\u0004\u0005\u0001", new Object[]{"data_", "codec_", "resolution_", "bitrate_", "fps_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<r2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (r2.class) {
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
