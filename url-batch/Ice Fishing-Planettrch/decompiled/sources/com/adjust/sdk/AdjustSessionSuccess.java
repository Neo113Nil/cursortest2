package com.adjust.sdk;

import org.json.JSONObject;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class AdjustSessionSuccess {
    public String adid;
    public JSONObject jsonResponse;
    public String message;
    public String timestamp;

    public String toString() {
        return Util.formatString("Session Success msg:%s time:%s adid:%s json:%s", this.message, this.timestamp, this.adid, this.jsonResponse);
    }
}
