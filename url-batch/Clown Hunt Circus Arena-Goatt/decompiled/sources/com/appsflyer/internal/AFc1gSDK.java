package com.appsflyer.internal;

import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class AFc1gSDK<Body> implements ResponseNetwork<Body> {
    public final AFc1lSDK AFInAppEventParameterName;
    private final Body AFInAppEventType;
    final int AFKeystoreWrapper;
    final boolean valueOf;
    final Map<String, List<String>> values;

    public AFc1gSDK(Body body, int i, boolean z, Map<String, List<String>> map, AFc1lSDK aFc1lSDK) {
        this.AFInAppEventType = body;
        this.AFKeystoreWrapper = i;
        this.valueOf = z;
        this.values = new HashMap(map);
        this.AFInAppEventParameterName = aFc1lSDK;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public Body getBody() {
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.valueOf;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public List<String> getHeaderField(String str) {
        for (String str2 : this.values.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.values.get(str2);
            }
        }
        return null;
    }

    public final String AFInAppEventType(String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField == null || headerField.isEmpty()) {
            return null;
        }
        Iterator<String> it = headerField.iterator();
        StringBuilder sb = new StringBuilder(it.next());
        while (it.hasNext()) {
            sb.append(", ").append(it.next());
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFc1gSDK aFc1gSDK = (AFc1gSDK) obj;
        if (this.AFKeystoreWrapper == aFc1gSDK.AFKeystoreWrapper && this.valueOf == aFc1gSDK.valueOf && this.AFInAppEventType.equals(aFc1gSDK.AFInAppEventType) && this.values.equals(aFc1gSDK.values)) {
            return this.AFInAppEventParameterName.equals(aFc1gSDK.AFInAppEventParameterName);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.AFInAppEventType.hashCode() * 31) + this.AFKeystoreWrapper) * 31) + (this.valueOf ? 1 : 0)) * 31) + this.values.hashCode()) * 31) + this.AFInAppEventParameterName.hashCode();
    }
}
