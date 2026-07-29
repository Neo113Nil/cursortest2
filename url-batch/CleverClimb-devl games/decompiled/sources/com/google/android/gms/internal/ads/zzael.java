package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@SafeParcelable.Class(creator = "AutoClickProtectionConfigurationParcelCreator")
@SafeParcelable.Reserved({1})
@zzadh
/* loaded from: classes.dex */
public final class zzael extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzael> CREATOR = new zzaem();

    @SafeParcelable.Field(id = 2)
    public final boolean zzcfr;

    @SafeParcelable.Field(id = 3)
    public final List<String> zzcfs;

    public zzael() {
        this(false, Collections.emptyList());
    }

    @SafeParcelable.Constructor
    public zzael(@SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) List<String> list) {
        this.zzcfr = z;
        this.zzcfs = list;
    }

    public static zzael zzl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new zzael();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("reporting_urls");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(optJSONArray.getString(i));
                } catch (JSONException e) {
                    zzakb.zzc("Error grabbing url from json.", e);
                }
            }
        }
        return new zzael(jSONObject.optBoolean("enable_protection"), arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzcfr);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzcfs, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
