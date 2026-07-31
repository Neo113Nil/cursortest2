package com.appsflyer.internal;

import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class AFe1pSDK<Body> implements ResponseNetwork<Body> {
    final Map<String, List<String>> AFInAppEventParameterName;
    public final AFe1tSDK AFInAppEventType;
    final int AFKeystoreWrapper;
    private final Body valueOf;
    final boolean values;

    public AFe1pSDK(Body body, int i, boolean z, Map<String, List<String>> map, AFe1tSDK aFe1tSDK) {
        this.valueOf = body;
        this.AFKeystoreWrapper = i;
        this.values = z;
        this.AFInAppEventParameterName = new HashMap(map);
        this.AFInAppEventType = aFe1tSDK;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public Body getBody() {
        return this.valueOf;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.values;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public List<String> getHeaderField(String str) {
        for (String str2 : this.AFInAppEventParameterName.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.AFInAppEventParameterName.get(str2);
            }
        }
        return null;
    }

    public final String valueOf(String str) {
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
        AFe1pSDK aFe1pSDK = (AFe1pSDK) obj;
        if (this.AFKeystoreWrapper == aFe1pSDK.AFKeystoreWrapper && this.values == aFe1pSDK.values && this.valueOf.equals(aFe1pSDK.valueOf) && this.AFInAppEventParameterName.equals(aFe1pSDK.AFInAppEventParameterName)) {
            return this.AFInAppEventType.equals(aFe1pSDK.AFInAppEventType);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.valueOf.hashCode() * 31) + this.AFKeystoreWrapper) * 31) + (this.values ? 1 : 0)) * 31) + this.AFInAppEventParameterName.hashCode()) * 31) + this.AFInAppEventType.hashCode();
    }
}
