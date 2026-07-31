package com.my.tracker.miniapps;

import androidx.annotation.NonNull;
import com.my.tracker.obfuscated.AbstractC1632f1;
import java.util.Map;

/* loaded from: classes2.dex */
public final class MiniAppEvent extends AbstractC1632f1 {
    public final String customUserId;
    public final Map<String, String> eventParams;

    @NonNull
    public final String miniAppId;
    public final String name;

    @NonNull
    public final String platformUserId;
    public final String query;

    MiniAppEvent(int i4, String str, String str2, String str3, String str4, String str5, Map map) {
        super(i4);
        this.miniAppId = str;
        this.platformUserId = str2;
        this.query = str3;
        this.customUserId = str4;
        this.name = str5;
        this.eventParams = map;
    }
}
