package com.google.ads.mediation.testsuite.dataobjects;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.ads.mediation.testsuite.utils.AppInfoUtil;
import com.google.ads.mediation.testsuite.utils.MediationConfigClient;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Network implements Parcelable {
    public static final Parcelable.Creator<Network> CREATOR = new Parcelable.Creator<Network>() { // from class: com.google.ads.mediation.testsuite.dataobjects.Network.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Network createFromParcel(Parcel parcel) {
            return new Network(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Network[] newArray(int i) {
            return new Network[i];
        }
    };
    private List<NetworkConfig> configs;
    private boolean manifestPresent;
    private String name;
    private List<String> requiredActivities;
    private List<String> requiredPermissions;
    private String sdkDetectionClass;
    private boolean sdkPresent;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Network() {
        this.requiredActivities = new ArrayList();
        this.requiredPermissions = new ArrayList();
        this.configs = new ArrayList();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getSdkDetectionClass() {
        return this.sdkDetectionClass;
    }

    public void setSdkDetectionClass(String str) {
        this.sdkDetectionClass = str;
    }

    public boolean isSdkPresent() {
        return this.sdkPresent;
    }

    public void setSdkPresent(boolean z) {
        this.sdkPresent = z;
    }

    public boolean isManifestPresent() {
        return this.manifestPresent;
    }

    public void setManifestPresent(boolean z) {
        this.manifestPresent = z;
    }

    public List<String> getRequiredActivities() {
        return this.requiredActivities;
    }

    public void setRequiredActivities(List<String> list) {
        this.requiredActivities = list;
    }

    public List<String> getRequiredPermissions() {
        return this.requiredPermissions;
    }

    public void setRequiredPermissions(List<String> list) {
        this.requiredPermissions = list;
    }

    public List<NetworkConfig> getConfigs() {
        return this.configs;
    }

    public void addConfig(NetworkConfig networkConfig) {
        this.configs.add(networkConfig);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Network) {
            return this.name.equals(((Network) obj).getName());
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBooleanArray(new boolean[]{this.sdkPresent, this.manifestPresent});
        parcel.writeString(this.name);
        parcel.writeString(this.sdkDetectionClass);
        parcel.writeStringList(this.requiredActivities);
        parcel.writeStringList(this.requiredPermissions);
    }

    private Network(Parcel parcel) {
        boolean[] zArr = new boolean[2];
        parcel.readBooleanArray(zArr);
        this.sdkPresent = zArr[0];
        this.manifestPresent = zArr[1];
        this.name = parcel.readString();
        this.sdkDetectionClass = parcel.readString();
        this.requiredActivities = new ArrayList();
        parcel.readStringList(this.requiredActivities);
        this.requiredPermissions = new ArrayList();
        parcel.readStringList(this.requiredPermissions);
        this.configs = new ArrayList();
    }

    public void detectInstallation() {
        this.sdkPresent = AppInfoUtil.classExists(this.sdkDetectionClass);
        if (this.sdkPresent) {
            Log.i(MediationConfigClient.LOG_TAG, "Detected SDK class " + this.sdkDetectionClass);
        } else {
            Log.i(MediationConfigClient.LOG_TAG, "Failed to detect SDK class " + this.sdkDetectionClass);
        }
        boolean z = true;
        for (String str : this.requiredActivities) {
            if (AppInfoUtil.activityIsRegistered(str)) {
                Log.i(MediationConfigClient.LOG_TAG, "Required activity '" + str + "' registered.");
            } else {
                Log.d(MediationConfigClient.LOG_TAG, "Required activity '" + str + "' NOT registered.");
                z = false;
            }
        }
        for (String str2 : this.requiredPermissions) {
            if (AppInfoUtil.permissionIsRequested(str2)) {
                Log.i(MediationConfigClient.LOG_TAG, "Required permission '" + str2 + "' requested.");
            } else {
                Log.d(MediationConfigClient.LOG_TAG, "Required permission '" + str2 + "' NOT requested.");
                z = false;
            }
        }
        this.manifestPresent = z;
    }
}
