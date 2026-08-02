package net.idrnd.face.iad.capture.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes9.dex */
public final class a2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ANDROID_BUILD_INFO_FIELD_NUMBER = 16;
    public static final int BROWSER_FIELD_NUMBER = 4;
    public static final int CAMERAS_ON_DEVICE_FIELD_NUMBER = 8;
    public static final int CAPTURE_TYPE_FIELD_NUMBER = 15;
    private static final a2 DEFAULT_INSTANCE;
    public static final int ENGINE_FIELD_NUMBER = 5;
    public static final int EXTERNAL_FIELD_NUMBER = 12;
    public static final int FRONT_CAMERA_INFO_FIELD_NUMBER = 13;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    public static final int INITIALIZATION_TIME_FIELD_NUMBER = 9;
    public static final int OS_FIELD_NUMBER = 6;
    private static volatile Parser<a2> PARSER = null;
    public static final int PHOTO_CAPTURE_INFO_FIELD_NUMBER = 14;
    public static final int PLATFORM_FIELD_NUMBER = 7;
    public static final int TIMESTAMPS_MS_FIELD_NUMBER = 10;
    public static final int USED_CAMERA_FIELD_NUMBER = 3;
    public static final int WEBGL_RENDERER_FIELD_NUMBER = 11;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private t0 androidBuildInfo_;
    private d1 browser_;
    private int captureType_;
    private p1 engine_;
    private j1 frontCameraInfo_;
    private int height_;
    private int initializationTime_;
    private f2 os_;
    private l1 photoCaptureInfo_;
    private h2 platform_;
    private p2 timestampsMs_;
    private int width_;
    private String usedCamera_ = "";
    private Internal.ProtobufList<String> camerasOnDevice_ = GeneratedMessageLite.emptyProtobufList();
    private String webglRenderer_ = "";
    private String external_ = "";

    static {
        a2 a2Var = new a2();
        DEFAULT_INSTANCE = a2Var;
        GeneratedMessageLite.registerDefaultInstance(a2.class, a2Var);
    }

    public static z1 a() {
        return (z1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (r0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new a2();
            case 2:
                return new z1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0000\u0001\u0010\u0010\u0000\u0001\u0000\u0001\u0004\u0002\u0004\u0003Ȉ\u0004\t\u0005\t\u0006\t\u0007\t\bȚ\t\u0004\n\t\u000bȈ\fȈ\r\t\u000e\t\u000f\f\u0010\t", new Object[]{"width_", "height_", "usedCamera_", "browser_", "engine_", "os_", "platform_", "camerasOnDevice_", "initializationTime_", "timestampsMs_", "webglRenderer_", "external_", "frontCameraInfo_", "photoCaptureInfo_", "captureType_", "androidBuildInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<a2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (a2.class) {
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
