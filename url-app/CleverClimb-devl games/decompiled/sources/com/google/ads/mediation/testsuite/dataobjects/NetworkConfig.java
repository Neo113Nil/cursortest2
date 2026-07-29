package com.google.ads.mediation.testsuite.dataobjects;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class NetworkConfig implements Parcelable {
    public static final Parcelable.Creator<NetworkConfig> CREATOR = new Parcelable.Creator<NetworkConfig>() { // from class: com.google.ads.mediation.testsuite.dataobjects.NetworkConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NetworkConfig createFromParcel(Parcel parcel) {
            return new NetworkConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NetworkConfig[] newArray(int i) {
            return new NetworkConfig[i];
        }
    };
    public static final int EVERYTHING_WENT_FINE = 5;
    public static final int UNTESTED = -1;
    private AdUnitId adUnitId;
    private NetworkAdapter adapter;
    private int id;
    private String label;
    private int lastErrorCode;
    private Map<String, String> serverParameters;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public NetworkConfig() {
        this.serverParameters = new HashMap();
        this.lastErrorCode = -1;
    }

    public NetworkConfig(int i, String str, NetworkResponse networkResponse, List<NetworkAdapter> list) {
        char c2;
        this.id = i;
        this.serverParameters = new HashMap();
        this.lastErrorCode = -1;
        if (networkResponse.hasValidMediationAdapter()) {
            Map<String, String> data = networkResponse.getData();
            if (networkResponse.isCustomEventAdapter()) {
                NetworkAdapter networkAdapter = new NetworkAdapter();
                for (String str2 : data.keySet()) {
                    String str3 = data.get(str2);
                    int hashCode = str2.hashCode();
                    if (hashCode == -290474766) {
                        if (str2.equals("class_name")) {
                            c2 = 0;
                        }
                        c2 = 65535;
                    } else if (hashCode != 102727412) {
                        if (hashCode == 1954460585 && str2.equals(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD)) {
                            c2 = 1;
                        }
                        c2 = 65535;
                    } else {
                        if (str2.equals("label")) {
                            c2 = 2;
                        }
                        c2 = 65535;
                    }
                    switch (c2) {
                        case 0:
                            networkAdapter.setClassName(str3);
                            break;
                        case 1:
                            this.serverParameters.put(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, str3);
                            break;
                        case 2:
                            String[] split = str3.split("\\.");
                            networkAdapter.setNetworkLabel("Custom: " + split[split.length - 1]);
                            break;
                    }
                }
                networkAdapter.setFormat(str);
                networkAdapter.getServerParameters().put("Parameter", MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                this.adapter = networkAdapter;
                return;
            }
            for (NetworkAdapter networkAdapter2 : list) {
                if (networkAdapter2.getClassName().equals(networkResponse.getClassName()) && networkAdapter2.getFormat().equals(str)) {
                    this.adapter = networkAdapter2;
                    this.label = networkAdapter2.getNetwork().getName();
                }
            }
            this.serverParameters = data;
        }
    }

    public void setAdUnit(AdUnit adUnit) {
        this.adUnitId = new AdUnitId(adUnit.getId(), adUnit.getName());
    }

    public AdUnitId getAdUnitId() {
        return this.adUnitId;
    }

    public boolean matches(String str) {
        return (this.label != null && this.label.toLowerCase().contains(str)) || (this.adapter != null && this.adapter.getClassName().toLowerCase().contains(str)) || (this.adapter != null && this.adapter.getFormat().toLowerCase().startsWith(str));
    }

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public NetworkAdapter getAdapter() {
        return this.adapter;
    }

    public void setAdapter(NetworkAdapter networkAdapter) {
        this.adapter = networkAdapter;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public int getLastErrorCode() {
        return this.lastErrorCode;
    }

    public void setLastErrorCode(int i) {
        this.lastErrorCode = i;
    }

    public Map<String, String> getServerParameters() {
        return this.serverParameters;
    }

    public void setServerParameters(Map<String, String> map) {
        this.serverParameters = map;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.label);
        parcel.writeInt(this.lastErrorCode);
        parcel.writeParcelable(this.adapter, 0);
        parcel.writeInt(this.serverParameters.size());
        for (String str : this.serverParameters.keySet()) {
            parcel.writeString(str);
            parcel.writeString(this.serverParameters.get(str));
        }
        parcel.writeString(this.adUnitId.getId());
        parcel.writeString(this.adUnitId.getName());
    }

    private NetworkConfig(Parcel parcel) {
        this.id = parcel.readInt();
        this.label = parcel.readString();
        this.lastErrorCode = parcel.readInt();
        this.adapter = (NetworkAdapter) parcel.readParcelable(NetworkAdapter.class.getClassLoader());
        this.serverParameters = new HashMap();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.serverParameters.put(parcel.readString(), parcel.readString());
        }
        this.adUnitId = new AdUnitId(parcel.readString(), parcel.readString());
    }
}
