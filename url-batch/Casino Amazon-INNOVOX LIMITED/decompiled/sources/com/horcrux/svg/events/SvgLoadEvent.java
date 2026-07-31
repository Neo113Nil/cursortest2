package com.horcrux.svg.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.imagehelper.ImageSource;

/* loaded from: classes2.dex */
public class SvgLoadEvent extends Event<SvgLoadEvent> {
    public static final String EVENT_NAME = "topLoad";
    private final float height;
    private final String uri;
    private final float width;

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    public SvgLoadEvent(int i, int i2, ReactContext reactContext, String str, float f, float f2) {
        super(i, i2);
        this.uri = new ImageSource(reactContext, str).getSource();
        this.width = f;
        this.height = f2;
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* renamed from: getEventName */
    public String getName() {
        return EVENT_NAME;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getName(), getAccessibilityEventData());
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* renamed from: getEventData */
    protected WritableMap getAccessibilityEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(ViewProps.WIDTH, this.width);
        createMap.putDouble(ViewProps.HEIGHT, this.height);
        createMap.putString("uri", this.uri);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("source", createMap);
        return createMap2;
    }
}
