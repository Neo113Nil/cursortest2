package com.horcrux.svg.events;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;

/* loaded from: classes2.dex */
public class SvgOnLayoutEvent extends Event<SvgOnLayoutEvent> {
    public static final String EVENT_NAME = "topSvgLayout";
    public int height;
    public int width;
    public int x;
    public int y;

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    public SvgOnLayoutEvent(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i, i2);
        this.x = i3;
        this.y = i4;
        this.width = i5;
        this.height = i6;
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* renamed from: getEventName */
    public String getName() {
        return EVENT_NAME;
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("x", PixelUtil.toDIPFromPixel(this.x));
        createMap.putDouble("y", PixelUtil.toDIPFromPixel(this.y));
        createMap.putDouble(ViewProps.WIDTH, PixelUtil.toDIPFromPixel(this.width));
        createMap.putDouble(ViewProps.HEIGHT, PixelUtil.toDIPFromPixel(this.height));
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("layout", createMap);
        createMap2.putInt(TypedValues.Attributes.S_TARGET, getViewTag());
        return createMap2;
    }
}
