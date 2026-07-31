package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.zh;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class AdDebuggerMetadata implements Serializable {
    private static final long serialVersionUID = 2490385963596560324L;

    @TypeInfo(type = LinkedHashSet.class)
    private Set<String> devices;

    @TypeInfo(name = "sendInfoEvents")
    private boolean infoEvents;
    private boolean testAds;

    public final Set a() {
        return this.devices;
    }

    public final boolean b() {
        return this.infoEvents;
    }

    public final boolean c() {
        return this.testAds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AdDebuggerMetadata adDebuggerMetadata = (AdDebuggerMetadata) obj;
            if (this.testAds == adDebuggerMetadata.testAds && this.infoEvents == adDebuggerMetadata.infoEvents && zh.a(this.devices, adDebuggerMetadata.devices)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.devices, Boolean.valueOf(this.testAds), Boolean.valueOf(this.infoEvents)};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }
}
