package W3;

import c3.C0292d;
import d3.u;
import io.flutter.plugin.common.EventChannel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class f implements EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    public final EventChannel f3479a;

    /* renamed from: b, reason: collision with root package name */
    public EventChannel.EventSink f3480b;

    public f(EventChannel eventChannel) {
        this.f3479a = eventChannel;
        eventChannel.setStreamHandler(this);
    }

    public final void a(String str, HashMap hashMap) {
        Map map;
        EventChannel.EventSink eventSink = this.f3480b;
        if (eventSink != null) {
            C0292d c0292d = new C0292d("event", str);
            if (hashMap.isEmpty()) {
                map = u.A(c0292d);
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
                linkedHashMap.put("event", str);
                map = linkedHashMap;
            }
            eventSink.success(map);
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        this.f3480b = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f3480b = eventSink;
    }
}
