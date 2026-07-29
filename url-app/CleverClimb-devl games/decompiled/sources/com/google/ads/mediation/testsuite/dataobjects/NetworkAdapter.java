package com.google.ads.mediation.testsuite.dataobjects;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.ads.mediation.testsuite.utils.AppInfoUtil;
import com.google.ads.mediation.testsuite.utils.MediationConfigClient;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class NetworkAdapter implements Parcelable {
    public static final Parcelable.Creator<NetworkAdapter> CREATOR = new Parcelable.Creator<NetworkAdapter>() { // from class: com.google.ads.mediation.testsuite.dataobjects.NetworkAdapter.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NetworkAdapter createFromParcel(Parcel parcel) {
            return new NetworkAdapter(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NetworkAdapter[] newArray(int i) {
            return new NetworkAdapter[i];
        }
    };
    private boolean adapterPresent;
    private String className;
    private String format;
    private Network network;
    private String networkLabel;
    private Map<String, String> serverParameters;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public NetworkAdapter() {
        this.serverParameters = new HashMap();
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public String getClassName() {
        return this.className;
    }

    public void setClassName(String str) {
        this.className = str;
    }

    public Network getNetwork() {
        return this.network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public String getNetworkLabel() {
        return this.networkLabel;
    }

    public void setNetworkLabel(String str) {
        this.networkLabel = str;
    }

    public boolean isAdapterPresent() {
        return this.adapterPresent;
    }

    public void setAdapterPresent(boolean z) {
        this.adapterPresent = z;
    }

    public Map<String, String> getServerParameters() {
        return this.serverParameters;
    }

    public void setServerParameters(Map<String, String> map) {
        this.serverParameters = map;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBooleanArray(new boolean[]{this.adapterPresent});
        parcel.writeString(this.format);
        parcel.writeString(this.className);
        parcel.writeString(this.networkLabel);
        parcel.writeParcelable(this.network, 0);
        parcel.writeInt(this.serverParameters.size());
        for (String str : this.serverParameters.keySet()) {
            parcel.writeString(str);
            parcel.writeString(this.serverParameters.get(str));
        }
    }

    private NetworkAdapter(Parcel parcel) {
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.adapterPresent = zArr[0];
        this.format = parcel.readString();
        this.className = parcel.readString();
        this.networkLabel = parcel.readString();
        this.network = (Network) parcel.readParcelable(Network.class.getClassLoader());
        this.serverParameters = new HashMap();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.serverParameters.put(parcel.readString(), parcel.readString());
        }
    }

    public void detectInstallation() {
        this.adapterPresent = AppInfoUtil.classExists(this.className);
        if (this.adapterPresent) {
            Log.i(MediationConfigClient.LOG_TAG, this.className + " class detected.");
            return;
        }
        Log.d(MediationConfigClient.LOG_TAG, this.className + " class NOT detected.");
    }
}
