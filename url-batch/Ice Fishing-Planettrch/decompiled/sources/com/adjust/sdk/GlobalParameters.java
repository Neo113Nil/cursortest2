package com.adjust.sdk;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class GlobalParameters {
    Map<String, String> callbackParameters;
    Map<String, String> partnerParameters;

    public GlobalParameters deepCopy() {
        GlobalParameters globalParameters = new GlobalParameters();
        if (this.callbackParameters != null) {
            globalParameters.callbackParameters = new HashMap(this.callbackParameters);
        }
        if (this.partnerParameters != null) {
            globalParameters.partnerParameters = new HashMap(this.partnerParameters);
        }
        return globalParameters;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GlobalParameters globalParameters = (GlobalParameters) obj;
        return Util.equalObject(this.callbackParameters, globalParameters.callbackParameters) && Util.equalObject(this.partnerParameters, globalParameters.partnerParameters);
    }

    public int hashCode() {
        return Util.hashObject(this.partnerParameters, Util.hashObject(this.callbackParameters, 17));
    }
}
