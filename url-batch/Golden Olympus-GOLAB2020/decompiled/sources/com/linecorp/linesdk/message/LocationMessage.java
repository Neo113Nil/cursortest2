package com.linecorp.linesdk.message;

import androidx.annotation.NonNull;
import com.ironsource.b9;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class LocationMessage extends MessageData {

    @NonNull
    private final String address;

    @NonNull
    private final Double latitude;

    @NonNull
    private final Double longitude;

    @NonNull
    private final String title;

    public LocationMessage(@NonNull String str, @NonNull String str2, @NonNull Double d4, @NonNull Double d5) {
        this.title = str;
        this.address = str2;
        this.latitude = d4;
        this.longitude = d5;
    }

    @Override // com.linecorp.linesdk.message.MessageData
    @NonNull
    public Type getType() {
        return Type.LOCATION;
    }

    @Override // com.linecorp.linesdk.message.MessageData, com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jsonObject = super.toJsonObject();
        jsonObject.put(b9.h.f15436D0, this.title);
        jsonObject.put("address", this.address);
        jsonObject.put("latitude", this.latitude);
        jsonObject.put("longitude", this.longitude);
        return jsonObject;
    }
}
