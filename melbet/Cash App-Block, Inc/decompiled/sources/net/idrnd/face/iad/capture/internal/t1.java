package net.idrnd.face.iad.capture.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes9.dex */
public final class t1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ANDROID_SECURITY_SOFTWARE_CHECKS_FIELD_NUMBER = 13;
    private static final t1 DEFAULT_INSTANCE;
    public static final int IMMUTABLE_STREAM_ID_FIELD_NUMBER = 5;
    public static final int IS_OBS_FIELD_NUMBER = 3;
    public static final int LISTENER_INCONSISTENCIES_FIELD_NUMBER = 10;
    public static final int MODULE_INTEGRITY_FIELD_NUMBER = 8;
    public static final int NOT_NATIVE_FUNCTION_FIELD_NUMBER = 1;
    public static final int OPEN_CONSOLE_FIELD_NUMBER = 7;
    public static final int OVERRIDE_FUNCTION_NAME_FIELD_NUMBER = 4;
    public static final int OVERRIDE_TO_STRING_FIELD_NUMBER = 2;
    public static final int OVERRIDE_USER_AGENT_FIELD_NUMBER = 12;
    public static final int OVERRIDE_VIDEO_SRC_FIELD_NUMBER = 9;
    private static volatile Parser<t1> PARSER = null;
    public static final int ROOTED_DEVICE_FIELD_NUMBER = 11;
    public static final int TOO_MANY_VIDEO_ELEMENTS_FIELD_NUMBER = 6;
    private b1 androidSecuritySoftwareChecks_;
    private boolean immutableStreamId_;
    private boolean isObs_;
    private boolean listenerInconsistencies_;
    private boolean moduleIntegrity_;
    private boolean notNativeFunction_;
    private boolean openConsole_;
    private boolean overrideFunctionName_;
    private boolean overrideToString_;
    private boolean overrideUserAgent_;
    private boolean overrideVideoSrc_;
    private boolean rootedDevice_;
    private boolean tooManyVideoElements_;

    static {
        t1 t1Var = new t1();
        DEFAULT_INSTANCE = t1Var;
        GeneratedMessageLite.registerDefaultInstance(t1.class, t1Var);
    }

    public static s1 a() {
        return (s1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (r0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new t1();
            case 2:
                return new s1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007\f\u0007\r\t", new Object[]{"notNativeFunction_", "overrideToString_", "isObs_", "overrideFunctionName_", "immutableStreamId_", "tooManyVideoElements_", "openConsole_", "moduleIntegrity_", "overrideVideoSrc_", "listenerInconsistencies_", "rootedDevice_", "overrideUserAgent_", "androidSecuritySoftwareChecks_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<t1> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (t1.class) {
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
