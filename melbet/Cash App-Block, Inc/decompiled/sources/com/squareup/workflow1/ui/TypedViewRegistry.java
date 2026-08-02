package com.squareup.workflow1.ui;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes8.dex */
public final class TypedViewRegistry implements ViewRegistry {
    public final Map bindings;

    public TypedViewRegistry(ViewFactory... viewFactoryArr) {
        ArrayList arrayList = new ArrayList(viewFactoryArr.length);
        int length = viewFactoryArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            ViewFactory viewFactory = viewFactoryArr[i2];
            i2++;
            arrayList.add(new Pair(viewFactory.getType(), viewFactory));
        }
        Map map = MapsKt__MapsKt.toMap(arrayList);
        if (map.keySet().size() == viewFactoryArr.length) {
            this.bindings = map;
            return;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = new ArrayList(viewFactoryArr.length);
        int length2 = viewFactoryArr.length;
        while (i < length2) {
            ViewFactory viewFactory2 = viewFactoryArr[i];
            i++;
            arrayList2.add(viewFactory2.getType());
        }
        Path$$ExternalSyntheticBUOutline0.m((Object) Recorder$$ExternalSyntheticOutline1.m(" must not have duplicate entries.", sb, arrayList2));
        throw null;
    }
}
