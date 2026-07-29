package com.ironsource.sdk.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AdUnitsState implements Parcelable {
    public static final Parcelable.Creator<AdUnitsState> CREATOR = new Parcelable.Creator<AdUnitsState>() { // from class: com.ironsource.sdk.data.AdUnitsState.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AdUnitsState createFromParcel(Parcel parcel) {
            return new AdUnitsState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AdUnitsState[] newArray(int i) {
            return new AdUnitsState[i];
        }
    };
    private String mDisplayedDemandSourceName;
    private int mDisplayedProduct;
    private String mInterstitialAppKey;
    private Map<String, String> mInterstitialExtraParams;
    private ArrayList<String> mInterstitialInitSuccess;
    private ArrayList<String> mInterstitialLoadSuccess;
    private ArrayList<String> mInterstitialReportInit;
    private ArrayList<String> mInterstitialReportLoad;
    private String mInterstitialUserId;
    private Map<String, String> mOfferWallExtraParams;
    private boolean mOfferwallInitSuccess;
    private boolean mOfferwallReportInit;
    private String mRVAppKey;
    private String mRVUserId;
    private boolean mShouldRestore;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AdUnitsState() {
        initialize();
    }

    private AdUnitsState(Parcel parcel) {
        initialize();
        try {
            this.mShouldRestore = parcel.readByte() != 0;
            this.mDisplayedProduct = parcel.readInt();
            this.mRVAppKey = parcel.readString();
            this.mRVUserId = parcel.readString();
            this.mDisplayedDemandSourceName = parcel.readString();
            this.mInterstitialAppKey = parcel.readString();
            this.mInterstitialUserId = parcel.readString();
            this.mInterstitialExtraParams = getMapFromJsonString(parcel.readString());
            this.mOfferwallInitSuccess = parcel.readByte() != 0;
            this.mOfferwallReportInit = parcel.readByte() != 0;
            this.mOfferWallExtraParams = getMapFromJsonString(parcel.readString());
        } catch (Throwable unused) {
            initialize();
        }
    }

    private void initialize() {
        this.mShouldRestore = false;
        this.mDisplayedProduct = -1;
        this.mInterstitialReportInit = new ArrayList<>();
        this.mInterstitialInitSuccess = new ArrayList<>();
        this.mInterstitialReportLoad = new ArrayList<>();
        this.mInterstitialLoadSuccess = new ArrayList<>();
        this.mOfferwallReportInit = true;
        this.mOfferwallInitSuccess = false;
        this.mInterstitialUserId = "";
        this.mInterstitialAppKey = "";
        this.mInterstitialExtraParams = new HashMap();
        this.mOfferWallExtraParams = new HashMap();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeByte(this.mShouldRestore ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.mDisplayedProduct);
            parcel.writeString(this.mRVAppKey);
            parcel.writeString(this.mRVUserId);
            parcel.writeString(this.mDisplayedDemandSourceName);
            parcel.writeString(this.mInterstitialAppKey);
            parcel.writeString(this.mInterstitialUserId);
            parcel.writeString(new JSONObject(this.mInterstitialExtraParams).toString());
            parcel.writeByte(this.mOfferwallInitSuccess ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.mOfferwallReportInit ? (byte) 1 : (byte) 0);
            parcel.writeString(new JSONObject(this.mOfferWallExtraParams).toString());
        } catch (Throwable unused) {
        }
    }

    public String getInterstitialAppKey() {
        return this.mInterstitialAppKey;
    }

    public String getInterstitialUserId() {
        return this.mInterstitialUserId;
    }

    public boolean shouldRestore() {
        return this.mShouldRestore;
    }

    public int getDisplayedProduct() {
        return this.mDisplayedProduct;
    }

    public String getDisplayedDemandSourceName() {
        return this.mDisplayedDemandSourceName;
    }

    public boolean reportInitOfferwall() {
        return this.mOfferwallReportInit;
    }

    public void setOfferWallExtraParams(Map<String, String> map) {
        this.mOfferWallExtraParams = map;
    }

    public void setInterstitialAppKey(String str) {
        this.mInterstitialAppKey = str;
    }

    public void setInterstitialUserId(String str) {
        this.mInterstitialUserId = str;
    }

    public void setReportLoadInterstitial(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            if (this.mInterstitialReportLoad.indexOf(str) == -1) {
                this.mInterstitialReportLoad.add(str);
                return;
            }
            return;
        }
        this.mInterstitialReportLoad.remove(str);
    }

    public void setShouldRestore(boolean z) {
        this.mShouldRestore = z;
    }

    public void adOpened(int i) {
        this.mDisplayedProduct = i;
    }

    public void adClosed() {
        this.mDisplayedProduct = -1;
    }

    public void setOfferwallInitSuccess(boolean z) {
        this.mOfferwallInitSuccess = z;
    }

    public void setOfferwallReportInit(boolean z) {
        this.mOfferwallReportInit = z;
    }

    public String getRVAppKey() {
        return this.mRVAppKey;
    }

    public void setRVAppKey(String str) {
        this.mRVAppKey = str;
    }

    public String getRVUserId() {
        return this.mRVUserId;
    }

    public void setDisplayedDemandSourceName(String str) {
        this.mDisplayedDemandSourceName = str;
    }

    public void setRVUserId(String str) {
        this.mRVUserId = str;
    }

    private Map<String, String> getMapFromJsonString(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("shouldRestore:");
            sb.append(this.mShouldRestore);
            sb.append(", ");
            sb.append("displayedProduct:");
            sb.append(this.mDisplayedProduct);
            sb.append(", ");
            sb.append("ISReportInit:");
            sb.append(this.mInterstitialReportInit);
            sb.append(", ");
            sb.append("ISInitSuccess:");
            sb.append(this.mInterstitialInitSuccess);
            sb.append(", ");
            sb.append("ISAppKey");
            sb.append(this.mInterstitialAppKey);
            sb.append(", ");
            sb.append("ISUserId");
            sb.append(this.mInterstitialUserId);
            sb.append(", ");
            sb.append("ISExtraParams");
            sb.append(this.mInterstitialExtraParams);
            sb.append(", ");
            sb.append("OWReportInit");
            sb.append(this.mOfferwallReportInit);
            sb.append(", ");
            sb.append("OWInitSuccess");
            sb.append(this.mOfferwallInitSuccess);
            sb.append(", ");
            sb.append("OWExtraParams");
            sb.append(this.mOfferWallExtraParams);
            sb.append(", ");
        } catch (Throwable unused) {
        }
        return sb.toString();
    }
}
