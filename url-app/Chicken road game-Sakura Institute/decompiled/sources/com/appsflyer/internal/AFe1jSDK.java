package com.appsflyer.internal;

import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class AFe1jSDK<Body> implements ResponseNetwork<Body> {
    public final AFe1mSDK AFInAppEventParameterName;
    final Map<String, List<String>> AFInAppEventType;
    final int AFKeystoreWrapper;
    private final Body valueOf;
    final boolean values;

    public AFe1jSDK(Body body, int i2, boolean z4, Map<String, List<String>> map, AFe1mSDK aFe1mSDK) {
        this.valueOf = body;
        this.AFKeystoreWrapper = i2;
        this.values = z4;
        this.AFInAppEventType = new HashMap(map);
        this.AFInAppEventParameterName = aFe1mSDK;
    }

    public final String AFInAppEventParameterName(String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField == null || headerField.isEmpty()) {
            return null;
        }
        Iterator<String> it = headerField.iterator();
        StringBuilder sb = new StringBuilder(it.next());
        while (it.hasNext()) {
            sb.append(", ");
            sb.append(it.next());
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
        AFe1jSDK aFe1jSDK = (AFe1jSDK) obj;
        if (this.AFKeystoreWrapper == aFe1jSDK.AFKeystoreWrapper && this.values == aFe1jSDK.values && this.valueOf.equals(aFe1jSDK.valueOf) && this.AFInAppEventType.equals(aFe1jSDK.AFInAppEventType)) {
            return this.AFInAppEventParameterName.equals(aFe1jSDK.AFInAppEventParameterName);
        }
        return false;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public Body getBody() {
        return this.valueOf;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public List<String> getHeaderField(String str) {
        for (String str2 : this.AFInAppEventType.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.AFInAppEventType.get(str2);
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.AFKeystoreWrapper;
    }

    public int hashCode() {
        return this.AFInAppEventParameterName.hashCode() + ((this.AFInAppEventType.hashCode() + (((((this.valueOf.hashCode() * 31) + this.AFKeystoreWrapper) * 31) + (this.values ? 1 : 0)) * 31)) * 31);
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.values;
    }
}
