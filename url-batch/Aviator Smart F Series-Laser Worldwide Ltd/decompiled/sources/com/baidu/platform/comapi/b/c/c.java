package com.baidu.platform.comapi.b.c;

import android.content.Context;
import com.baidu.baidumapsdk_api.R;
import com.baidu.mapapi.map.MapLanguage;

/* loaded from: classes2.dex */
public class c extends com.baidu.platform.comapi.h.s.a {
    public c(Context context, MapLanguage mapLanguage) {
        super(context, mapLanguage);
    }

    public int b0() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_bike_already_riding_en : R.string.sdk_bike_already_riding;
    }

    public int c0() {
        return this.f9252b == MapLanguage.ENGLISH ? R.string.sdk_bike_cycling_to_open_areas_en : R.string.sdk_bike_cycling_to_open_areas;
    }
}
