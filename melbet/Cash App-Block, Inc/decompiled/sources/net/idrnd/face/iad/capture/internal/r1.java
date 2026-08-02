package net.idrnd.face.iad.capture.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes9.dex */
public final class r1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CONSECUTIVE_FRAMES_ARE_DIFFERENT_FIELD_NUMBER = 2;
    public static final int CROP_SIZE_FIELD_NUMBER = 4;
    private static final r1 DEFAULT_INSTANCE;
    public static final int FPS_FIELD_NUMBER = 3;
    private static volatile Parser<r1> PARSER = null;
    public static final int QUANTILES_FIELD_NUMBER = 1;
    public static final int QUANTILE_FIELD_NUMBER = 5;
    public static final int THRESHOLD_FIELD_NUMBER = 6;
    private float cropSize_;
    private float fps_;
    private float quantile_;
    private int threshold_;
    private int quantilesMemoizedSerializedSize = -1;
    private int consecutiveFramesAreDifferentMemoizedSerializedSize = -1;
    private Internal.IntList quantiles_ = GeneratedMessageLite.emptyIntList();
    private Internal.BooleanList consecutiveFramesAreDifferent_ = GeneratedMessageLite.emptyBooleanList();

    static {
        r1 r1Var = new r1();
        DEFAULT_INSTANCE = r1Var;
        GeneratedMessageLite.registerDefaultInstance(r1.class, r1Var);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (r0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new r1();
            case 2:
                return new b2(4);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0002\u0000\u0001'\u0002*\u0003\u0001\u0004\u0001\u0005\u0001\u0006\u0004", new Object[]{"quantiles_", "consecutiveFramesAreDifferent_", "fps_", "cropSize_", "quantile_", "threshold_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<r1> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (r1.class) {
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
