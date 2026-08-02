package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes.dex */
public class PlatformViewTouch {
    public final int action;
    public final int buttonState;
    public final int deviceId;
    public final Number downTime;
    public final int edgeFlags;
    public final Number eventTime;
    public final int flags;
    public final int metaState;
    public final long motionEventId;
    public final int pointerCount;
    public final Object rawPointerCoords;
    public final Object rawPointerPropertiesList;
    public final int source;
    public final int viewId;
    public final float xPrecision;
    public final float yPrecision;

    public PlatformViewTouch(int i4, Number number, Number number2, int i5, int i6, Object obj, Object obj2, int i7, int i8, float f4, float f5, int i9, int i10, int i11, int i12, long j4) {
        this.viewId = i4;
        this.downTime = number;
        this.eventTime = number2;
        this.action = i5;
        this.pointerCount = i6;
        this.rawPointerPropertiesList = obj;
        this.rawPointerCoords = obj2;
        this.metaState = i7;
        this.buttonState = i8;
        this.xPrecision = f4;
        this.yPrecision = f5;
        this.deviceId = i9;
        this.edgeFlags = i10;
        this.source = i11;
        this.flags = i12;
        this.motionEventId = j4;
    }
}
