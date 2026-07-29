package com.aiming.mdt.adt.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public class AdBean implements Parcelable {
    public static final Parcelable.Creator<AdBean> CREATOR = new C0200();
    private final boolean isWebview;
    private final int mAction;
    private final String mAdId;
    private final String mAdType;
    private final String mAdUrl;
    private final String mApkUrl;
    private final boolean mCacheVideo;
    private final String mCampaignId;
    private final String mCid;
    private final List<String> mClktrackers;
    private final String mDescription;
    private final long mExpire;
    private final String mGooglePlayId;
    private final String mIconUrl;
    private final List<String> mImptrackers;
    private final String mMainimgUrl;
    private final String mOriData;
    private final String mPkgName;
    private final String mPlayUrl;
    private final double mRating;
    private final String mResourceMd5;
    private final List<String> mResources;
    private final int mSc;
    private final String mTitle;
    private final String mVideoUrl;
    private final int mVpc;

    /* renamed from: com.aiming.mdt.adt.bean.AdBean$ʽ, reason: contains not printable characters */
    public static class C0199 {

        /* renamed from: ʻ, reason: contains not printable characters */
        private String f679;

        /* renamed from: ʻʼ, reason: contains not printable characters */
        private String f680;

        /* renamed from: ʻʼʽ, reason: contains not printable characters */
        private String f681;

        /* renamed from: ʻʼʽʾ, reason: contains not printable characters */
        private String f682;

        /* renamed from: ʻʼʽʿ, reason: contains not printable characters */
        private long f683;

        /* renamed from: ʻʼʾ, reason: contains not printable characters */
        private String f684;

        /* renamed from: ʻʼʾʿ, reason: contains not printable characters */
        private int f685;

        /* renamed from: ʻʼʿ, reason: contains not printable characters */
        private String f686;

        /* renamed from: ʻʽ, reason: contains not printable characters */
        private String f687;

        /* renamed from: ʻʽʾ, reason: contains not printable characters */
        private String f688;

        /* renamed from: ʻʽʿ, reason: contains not printable characters */
        private int f689;

        /* renamed from: ʻʾ, reason: contains not printable characters */
        private String f690;

        /* renamed from: ʻʾʿ, reason: contains not printable characters */
        private List<String> f691;

        /* renamed from: ʻʿ, reason: contains not printable characters */
        private String f692;

        /* renamed from: ʼ, reason: contains not printable characters */
        private String f693;

        /* renamed from: ʼʽ, reason: contains not printable characters */
        private String f694;

        /* renamed from: ʼʽʾ, reason: contains not printable characters */
        private int f695;

        /* renamed from: ʼʽʿ, reason: contains not printable characters */
        private List<String> f696;

        /* renamed from: ʼʾ, reason: contains not printable characters */
        private String f697;

        /* renamed from: ʼʿ, reason: contains not printable characters */
        private String f698;

        /* renamed from: ʽ, reason: contains not printable characters */
        private String f699;

        /* renamed from: ʽʾ, reason: contains not printable characters */
        private boolean f700;

        /* renamed from: ʽʿ, reason: contains not printable characters */
        private String f701;

        /* renamed from: ʾ, reason: contains not printable characters */
        private boolean f702;

        /* renamed from: ʾʿ, reason: contains not printable characters */
        private List<String> f703;

        /* renamed from: ʿ, reason: contains not printable characters */
        private double f704;

        /* renamed from: ʻ, reason: contains not printable characters */
        public final C0199 m768(int i) {
            this.f689 = i;
            return this;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final C0199 m769(String str) {
            this.f680 = str;
            return this;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final C0199 m770(List<String> list) {
            this.f703 = list;
            return this;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final AdBean m771() {
            return new AdBean(this);
        }

        /* renamed from: ʻʼ, reason: contains not printable characters */
        public final C0199 m772(int i) {
            this.f685 = i;
            return this;
        }

        /* renamed from: ʻʼ, reason: contains not printable characters */
        public final C0199 m773(long j) {
            this.f683 = j;
            return this;
        }

        /* renamed from: ʻʼ, reason: contains not printable characters */
        public final C0199 m774(String str) {
            this.f693 = str;
            return this;
        }

        /* renamed from: ʻʼ, reason: contains not printable characters */
        public final C0199 m775(List<String> list) {
            this.f691 = list;
            return this;
        }

        /* renamed from: ʻʼ, reason: contains not printable characters */
        public final C0199 m776(boolean z) {
            this.f702 = z;
            return this;
        }

        /* renamed from: ʻʼʽ, reason: contains not printable characters */
        public final C0199 m777(String str) {
            this.f694 = str;
            return this;
        }

        /* renamed from: ʻʼʽʾ, reason: contains not printable characters */
        public final C0199 m778(String str) {
            this.f701 = str;
            return this;
        }

        /* renamed from: ʻʼʾ, reason: contains not printable characters */
        public final C0199 m779(String str) {
            this.f688 = str;
            return this;
        }

        /* renamed from: ʻʽ, reason: contains not printable characters */
        public final C0199 m780(String str) {
            this.f679 = str;
            return this;
        }

        /* renamed from: ʻʽ, reason: contains not printable characters */
        public final C0199 m781(boolean z) {
            this.f700 = z;
            return this;
        }

        /* renamed from: ʻʽʾ, reason: contains not printable characters */
        public final C0199 m782(String str) {
            this.f692 = str;
            return this;
        }

        /* renamed from: ʻʾ, reason: contains not printable characters */
        public final C0199 m783(String str) {
            this.f697 = str;
            return this;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public final C0199 m784(double d2) {
            this.f704 = d2;
            return this;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public final C0199 m785(int i) {
            this.f695 = i;
            return this;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public final C0199 m786(String str) {
            this.f687 = str;
            return this;
        }

        /* renamed from: ʼʽ, reason: contains not printable characters */
        public final C0199 m787(String str) {
            this.f690 = str;
            return this;
        }

        /* renamed from: ʼʽʾ, reason: contains not printable characters */
        public final C0199 m788(String str) {
            this.f682 = str;
            return this;
        }

        /* renamed from: ʼʾ, reason: contains not printable characters */
        public final C0199 m789(String str) {
            this.f684 = str;
            return this;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public final C0199 m790(String str) {
            this.f699 = str;
            return this;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public final C0199 m791(List<String> list) {
            this.f696 = list;
            return this;
        }

        /* renamed from: ʽʾ, reason: contains not printable characters */
        public final C0199 m792(String str) {
            this.f698 = str;
            return this;
        }

        /* renamed from: ʽʿ, reason: contains not printable characters */
        public final C0199 m793(String str) {
            this.f686 = str;
            return this;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public final C0199 m794(String str) {
            this.f681 = str;
            return this;
        }
    }

    protected AdBean(Parcel parcel) {
        this.mOriData = parcel.readString();
        this.mCampaignId = parcel.readString();
        this.mAdId = parcel.readString();
        this.mTitle = parcel.readString();
        this.mPkgName = parcel.readString();
        this.mPlayUrl = parcel.readString();
        this.mDescription = parcel.readString();
        this.mAdUrl = parcel.readString();
        this.mVideoUrl = parcel.readString();
        this.isWebview = parcel.readByte() != 0;
        this.mSc = parcel.readInt();
        this.mCacheVideo = parcel.readByte() != 0;
        this.mIconUrl = parcel.readString();
        this.mCid = parcel.readString();
        this.mMainimgUrl = parcel.readString();
        this.mApkUrl = parcel.readString();
        this.mResourceMd5 = parcel.readString();
        this.mGooglePlayId = parcel.readString();
        this.mRating = parcel.readDouble();
        this.mAdType = parcel.readString();
        this.mResources = parcel.createStringArrayList();
        this.mImptrackers = parcel.createStringArrayList();
        this.mClktrackers = parcel.createStringArrayList();
        this.mAction = parcel.readInt();
        this.mExpire = parcel.readLong();
        this.mVpc = parcel.readInt();
    }

    protected AdBean(C0199 c0199) {
        this.mOriData = c0199.f693;
        this.mCampaignId = c0199.f687;
        this.mAdId = c0199.f679;
        this.mTitle = c0199.f699;
        this.mPkgName = c0199.f680;
        this.mPlayUrl = c0199.f690;
        this.mDescription = c0199.f697;
        this.mAdUrl = c0199.f681;
        this.mVideoUrl = c0199.f694;
        this.isWebview = c0199.f702;
        this.mSc = c0199.f695;
        this.mCacheVideo = c0199.f700;
        this.mIconUrl = c0199.f684;
        this.mCid = c0199.f682;
        this.mMainimgUrl = c0199.f688;
        this.mApkUrl = c0199.f701;
        this.mResourceMd5 = c0199.f692;
        this.mGooglePlayId = c0199.f698;
        this.mRating = c0199.f704;
        this.mAdType = c0199.f686;
        this.mResources = c0199.f703;
        this.mImptrackers = c0199.f691;
        this.mClktrackers = c0199.f696;
        this.mAction = c0199.f689;
        this.mExpire = c0199.f683;
        this.mVpc = c0199.f685;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAction() {
        return this.mAction;
    }

    public String getAdId() {
        return this.mAdId;
    }

    public String getAdType() {
        return this.mAdType;
    }

    public String getAdUrl() {
        return this.mAdUrl;
    }

    public String getApkUrl() {
        return this.mApkUrl;
    }

    public String getCampaignId() {
        return this.mCampaignId;
    }

    public String getCid() {
        return this.mCid;
    }

    public List<String> getClktrackers() {
        return this.mClktrackers;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public long getExpire() {
        return this.mExpire;
    }

    public String getGooglePlayId() {
        return this.mGooglePlayId;
    }

    public String getIconUrl() {
        return this.mIconUrl;
    }

    public List<String> getImptrackers() {
        return this.mImptrackers;
    }

    public String getMainimgUrl() {
        return this.mMainimgUrl;
    }

    public String getOriData() {
        return this.mOriData;
    }

    public String getPkgName() {
        return this.mPkgName;
    }

    public String getPlayUrl() {
        return this.mPlayUrl;
    }

    public double getRating() {
        return this.mRating;
    }

    public String getResourceMd5() {
        return this.mResourceMd5;
    }

    public List<String> getResources() {
        return this.mResources;
    }

    public int getSc() {
        return this.mSc;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getVideoUrl() {
        return this.mVideoUrl;
    }

    public int getVpc() {
        return this.mVpc;
    }

    public boolean isCacheVideo() {
        return this.mCacheVideo;
    }

    public boolean isWebview() {
        return this.isWebview;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdBean{mOriData='");
        sb.append(this.mOriData);
        sb.append('\'');
        sb.append(", mCampaignId='");
        sb.append(this.mCampaignId);
        sb.append('\'');
        sb.append(", mAdId='");
        sb.append(this.mAdId);
        sb.append('\'');
        sb.append(", mTitle='");
        sb.append(this.mTitle);
        sb.append('\'');
        sb.append(", mPkgName='");
        sb.append(this.mPkgName);
        sb.append('\'');
        sb.append(", mPlayUrl='");
        sb.append(this.mPlayUrl);
        sb.append('\'');
        sb.append(", mDescription='");
        sb.append(this.mDescription);
        sb.append('\'');
        sb.append(", mAdUrl='");
        sb.append(this.mAdUrl);
        sb.append('\'');
        sb.append(", mVideoUrl='");
        sb.append(this.mVideoUrl);
        sb.append('\'');
        sb.append(", isWebview=");
        sb.append(this.isWebview);
        sb.append(", mSc=");
        sb.append(this.mSc);
        sb.append(", mCacheVideo=");
        sb.append(this.mCacheVideo);
        sb.append(", mIconUrl='");
        sb.append(this.mIconUrl);
        sb.append('\'');
        sb.append(", mCid='");
        sb.append(this.mCid);
        sb.append('\'');
        sb.append(", mMainimgUrl='");
        sb.append(this.mMainimgUrl);
        sb.append('\'');
        sb.append(", mApkUrl='");
        sb.append(this.mApkUrl);
        sb.append('\'');
        sb.append(", mResourceMd5='");
        sb.append(this.mResourceMd5);
        sb.append('\'');
        sb.append(", mGooglePlayId='");
        sb.append(this.mGooglePlayId);
        sb.append('\'');
        sb.append(", mRating=");
        sb.append(this.mRating);
        sb.append(", mAdType='");
        sb.append(this.mAdType);
        sb.append('\'');
        sb.append(", mResources=");
        sb.append(this.mResources);
        sb.append(", mImptrackers=");
        sb.append(this.mImptrackers);
        sb.append(", mClktrackers=");
        sb.append(this.mClktrackers);
        sb.append(", mAction=");
        sb.append(this.mAction);
        sb.append(", mExpire=");
        sb.append(this.mExpire);
        sb.append(", mVpc=");
        sb.append(this.mVpc);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mOriData);
        parcel.writeString(this.mCampaignId);
        parcel.writeString(this.mAdId);
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mPkgName);
        parcel.writeString(this.mPlayUrl);
        parcel.writeString(this.mDescription);
        parcel.writeString(this.mAdUrl);
        parcel.writeString(this.mVideoUrl);
        parcel.writeByte(this.isWebview ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mSc);
        parcel.writeByte(this.mCacheVideo ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mIconUrl);
        parcel.writeString(this.mCid);
        parcel.writeString(this.mMainimgUrl);
        parcel.writeString(this.mApkUrl);
        parcel.writeString(this.mResourceMd5);
        parcel.writeString(this.mGooglePlayId);
        parcel.writeDouble(this.mRating);
        parcel.writeString(this.mAdType);
        parcel.writeStringList(this.mResources);
        parcel.writeStringList(this.mImptrackers);
        parcel.writeStringList(this.mClktrackers);
        parcel.writeInt(this.mAction);
        parcel.writeLong(this.mExpire);
        parcel.writeInt(this.mVpc);
    }
}
