package com.google.ads.mediation.testsuite.dataobjects;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class AdUnit implements Parcelable {
    public static final Parcelable.Creator<AdUnit> CREATOR = new Parcelable.Creator<AdUnit>() { // from class: com.google.ads.mediation.testsuite.dataobjects.AdUnit.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AdUnit createFromParcel(Parcel parcel) {
            return new AdUnit(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AdUnit[] newArray(int i) {
            return new AdUnit[i];
        }
    };
    public static final String CUSTOM_EVENT_ADAPTER_CLASS = "com.google.ads.mediation.customevent.CustomEventAdapter";
    public static final String GOOGLE_ADAPTER_CLASS = "com.google.ads.mediation.admob.AdMobAdapter";
    private AdUnitId adUnitId;
    private String format;
    private String id;
    private String mediationGroup;
    private String name;
    private List<NetworkConfig> networkConfigs;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AdUnit() {
        this.networkConfigs = new ArrayList();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getMediationGroup() {
        return this.mediationGroup;
    }

    public void setMediationGroup(String str) {
        this.mediationGroup = str;
    }

    public String getId() {
        return this.id;
    }

    public String getPubId() {
        return this.adUnitId.getPubId();
    }

    public String getSlotId() {
        return this.adUnitId.getSlotId();
    }

    public String getTitle() {
        return this.adUnitId.getTitle();
    }

    public void setId(String str) {
        this.id = str;
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public List<NetworkConfig> getNetworkConfigs() {
        return this.networkConfigs;
    }

    public AdUnit(int i, AdUnitResponse adUnitResponse, List<NetworkAdapter> list) {
        this.id = adUnitResponse.getAdUnitId();
        this.name = adUnitResponse.getAdUnitName();
        this.adUnitId = new AdUnitId(this.id, this.name);
        this.format = adUnitResponse.getFormat();
        this.networkConfigs = new ArrayList();
        MediationConfig mediationConfig = adUnitResponse.getMediationConfig();
        if (mediationConfig == null) {
            return;
        }
        this.mediationGroup = mediationConfig.getMediationGroupName();
        List<NetworkResponse> adNetworks = mediationConfig.getAdNetworks();
        if (adNetworks == null) {
            return;
        }
        Iterator<NetworkResponse> it = adNetworks.iterator();
        while (it.hasNext()) {
            NetworkConfig networkConfig = new NetworkConfig(i, getFormat(), it.next(), list);
            if (networkConfig.getAdapter() != null) {
                this.networkConfigs.add(networkConfig);
                i++;
            }
        }
    }

    public boolean matches(String str) {
        return (getName() != null && getName().toLowerCase().contains(str)) || this.format.toLowerCase().startsWith(str) || getSlotId().toLowerCase().startsWith(str) || (getMediationGroup() != null && getMediationGroup().contains(str));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.format);
        parcel.writeString(this.mediationGroup);
        parcel.writeTypedList(this.networkConfigs);
    }

    private AdUnit(Parcel parcel) {
        this.id = parcel.readString();
        this.name = parcel.readString();
        this.adUnitId = new AdUnitId(this.id, this.name);
        this.format = parcel.readString();
        this.mediationGroup = parcel.readString();
        this.networkConfigs = new ArrayList();
        parcel.readTypedList(this.networkConfigs, NetworkConfig.CREATOR);
    }
}
