package com.realsil.sdk.dfu.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.i;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public class DfuProgressInfo implements Parcelable {
    public static final Parcelable.Creator<DfuProgressInfo> CREATOR = new Parcelable.Creator<DfuProgressInfo>() { // from class: com.realsil.sdk.dfu.model.DfuProgressInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DfuProgressInfo createFromParcel(Parcel parcel) {
            return new DfuProgressInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DfuProgressInfo[] newArray(int i8) {
            return new DfuProgressInfo[i8];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public int f16197a;

    /* renamed from: b, reason: collision with root package name */
    public int f16198b;

    /* renamed from: c, reason: collision with root package name */
    public int f16199c;

    /* renamed from: d, reason: collision with root package name */
    public int f16200d;

    /* renamed from: e, reason: collision with root package name */
    public long f16201e;

    /* renamed from: f, reason: collision with root package name */
    public long f16202f;

    /* renamed from: g, reason: collision with root package name */
    public int f16203g;

    /* renamed from: h, reason: collision with root package name */
    public int f16204h;

    /* renamed from: i, reason: collision with root package name */
    public int f16205i;

    /* renamed from: j, reason: collision with root package name */
    public int f16206j;

    /* renamed from: k, reason: collision with root package name */
    public int f16207k;

    /* renamed from: l, reason: collision with root package name */
    public long f16208l;

    /* renamed from: m, reason: collision with root package name */
    public int f16209m;

    /* renamed from: n, reason: collision with root package name */
    public int f16210n;

    /* renamed from: o, reason: collision with root package name */
    public long f16211o;

    /* renamed from: p, reason: collision with root package name */
    public long f16212p;

    /* renamed from: q, reason: collision with root package name */
    public long f16213q;

    /* renamed from: r, reason: collision with root package name */
    public long f16214r;

    /* renamed from: s, reason: collision with root package name */
    public Throughput f16215s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f16216t;

    public DfuProgressInfo() {
        this.f16199c = 0;
        this.f16201e = 0L;
        this.f16202f = 0L;
        this.f16200d = 0;
        this.f16203g = 0;
        this.f16204h = 0;
        this.f16205i = 0;
        this.f16198b = 0;
        this.f16216t = false;
    }

    public final void a() {
        long max = Math.max(0L, this.f16212p - this.f16211o);
        float f8 = max > 0 ? (this.f16198b * 1000.0f) / max : 0.0f;
        long currentTimeMillis = System.currentTimeMillis();
        long j8 = this.f16198b;
        long j9 = j8 - this.f16214r;
        long j10 = currentTimeMillis - this.f16213q;
        float f9 = j10 > 0 ? (j9 * 1000.0f) / j10 : 0.0f;
        this.f16213q = currentTimeMillis;
        this.f16214r = j8;
        Throughput throughput = this.f16215s;
        if (throughput != null) {
            throughput.deltaTime = max;
            throughput.speed = f8;
            throughput.realSpeed = f9;
        }
    }

    public void addBytesSent(int i8) {
        setBytesSent(this.f16198b + i8);
        this.f16209m += i8;
    }

    public void addImageSizeInBytes(int i8) {
        setImageSizeInBytes(this.f16197a + i8);
    }

    public int correctBufferCheckSize(int i8) {
        int remainSizeInBytes = getRemainSizeInBytes();
        if (remainSizeInBytes >= i8) {
            return i8;
        }
        ZLogger.v(String.format("correctBufferCheckSize %d > %d", Integer.valueOf(i8), Integer.valueOf(remainSizeInBytes)));
        return remainSizeInBytes;
    }

    public int correctPacketSize(int i8) {
        int remainSizeInBytes = getRemainSizeInBytes();
        if (remainSizeInBytes >= i8) {
            return i8;
        }
        ZLogger.v(String.format("correctPacketSize %d > %d", Integer.valueOf(i8), Integer.valueOf(remainSizeInBytes)));
        return remainSizeInBytes;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getActiveImageSize() {
        return this.f16210n;
    }

    public int getBinId() {
        return this.f16206j;
    }

    public int getBytesSent() {
        return this.f16198b;
    }

    public int getCurImageId() {
        return this.f16207k;
    }

    public long getCurImageVersion() {
        return this.f16208l;
    }

    public int getCurrentFileIndex() {
        return this.f16203g;
    }

    public int getImageSizeInBytes() {
        return this.f16197a;
    }

    public int getLastFileIndex() {
        return this.f16204h;
    }

    public int getMaxFileCount() {
        return this.f16200d;
    }

    public int getNextFileIndex() {
        return this.f16205i;
    }

    public int getPendingUpdateImageFileIndex() {
        int maxFileCount = getMaxFileCount();
        int nextFileIndex = getNextFileIndex();
        if (nextFileIndex < 0 || nextFileIndex >= maxFileCount) {
            ZLogger.v("invalid FileIndex: " + nextFileIndex + ", reset to 0");
            nextFileIndex = 0;
        }
        this.f16203g = nextFileIndex;
        return nextFileIndex;
    }

    public int getProgress() {
        return this.f16199c;
    }

    public int getRemainSizeInBytes() {
        return this.f16197a - this.f16198b;
    }

    public Throughput getThroughput() {
        return this.f16215s;
    }

    public int getTotalBytesSent() {
        return this.f16209m;
    }

    public int getTotalProgress() {
        int i8 = this.f16200d;
        if (i8 == 0) {
            return 0;
        }
        double d8 = 100.0f / i8;
        int i9 = this.f16197a;
        double d9 = this.f16203g + (i9 == 0 ? i.DOUBLE_EPSILON : (this.f16198b * 1.0d) / i9);
        if (d9 < i8) {
            return (int) (d9 * d8);
        }
        return 100;
    }

    public void initialize(BaseBinInputStream baseBinInputStream, boolean z7) {
        this.f16206j = baseBinInputStream.getBinId();
        this.f16207k = baseBinInputStream.getImageId();
        this.f16208l = baseBinInputStream.getImageVersion();
        this.f16197a = baseBinInputStream.getTotalImageSize();
        this.f16216t = z7;
        setBytesSent(0);
        ZLogger.v(toString());
    }

    public boolean isFileSendOver() {
        return this.f16198b >= this.f16197a;
    }

    public boolean isLastImageFile() {
        return this.f16205i >= this.f16200d;
    }

    public void sendOver() {
        this.f16211o = System.currentTimeMillis();
        this.f16198b = this.f16197a;
        int i8 = this.f16203g;
        this.f16204h = i8;
        this.f16205i = i8 + 1;
        ZLogger.v("sendOver:" + toString());
    }

    public void setActiveImageSize(int i8) {
        this.f16210n = i8;
    }

    public void setBytesSent(int i8) {
        this.f16198b = i8;
        this.f16199c = (int) ((i8 * 100.0f) / this.f16197a);
        this.f16212p = System.currentTimeMillis();
        if (this.f16216t) {
            a();
        }
    }

    public void setImageSizeInBytes(int i8) {
        this.f16197a = i8;
    }

    public void setNextFileIndex(int i8) {
        this.f16205i = i8;
    }

    public void setUpdateContent(List<BaseBinInputStream> list) {
        this.f16200d = list.size();
        long j8 = 0;
        while (list.iterator().hasNext()) {
            j8 += r5.next().getTotalImageSize();
        }
        this.f16201e = j8;
    }

    public void start() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f16211o = currentTimeMillis;
        this.f16212p = currentTimeMillis;
        this.f16213q = currentTimeMillis;
        this.f16214r = 0L;
        this.f16215s = this.f16216t ? new Throughput(this.f16197a, this.f16198b) : null;
        ZLogger.v(toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.US;
        sb.append(String.format(locale, "image: %d/%d", Integer.valueOf(this.f16203g + 1), Integer.valueOf(this.f16200d)));
        sb.append(String.format(locale, "\t{binId=0x%04X, imageId=0x%04X, version=0x%04X}", Integer.valueOf(this.f16206j), Integer.valueOf(this.f16207k), Long.valueOf(this.f16208l)));
        sb.append(String.format(locale, "\tprogress: %d%%(%d/%d)--%d%%", Integer.valueOf(this.f16199c), Integer.valueOf(this.f16198b), Integer.valueOf(this.f16197a), Integer.valueOf(getTotalProgress())));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f16197a);
        parcel.writeInt(this.f16198b);
        parcel.writeInt(this.f16199c);
        parcel.writeInt(this.f16200d);
        parcel.writeInt(this.f16203g);
        parcel.writeInt(this.f16204h);
        parcel.writeInt(this.f16205i);
        parcel.writeInt(this.f16207k);
        parcel.writeLong(this.f16208l);
        parcel.writeInt(this.f16209m);
        parcel.writeInt(this.f16210n);
        parcel.writeLong(this.f16211o);
        parcel.writeLong(this.f16212p);
        parcel.writeLong(this.f16213q);
        parcel.writeLong(this.f16214r);
        parcel.writeParcelable(this.f16215s, i8);
        parcel.writeByte(this.f16216t ? (byte) 1 : (byte) 0);
    }

    public DfuProgressInfo(Parcel parcel) {
        this.f16199c = 0;
        this.f16200d = 0;
        this.f16201e = 0L;
        this.f16202f = 0L;
        this.f16203g = 0;
        this.f16204h = 0;
        this.f16205i = 0;
        this.f16197a = parcel.readInt();
        this.f16198b = parcel.readInt();
        this.f16199c = parcel.readInt();
        this.f16200d = parcel.readInt();
        this.f16203g = parcel.readInt();
        this.f16204h = parcel.readInt();
        this.f16205i = parcel.readInt();
        this.f16207k = parcel.readInt();
        this.f16208l = parcel.readLong();
        this.f16209m = parcel.readInt();
        this.f16210n = parcel.readInt();
        this.f16211o = parcel.readLong();
        this.f16212p = parcel.readLong();
        this.f16213q = parcel.readLong();
        this.f16214r = parcel.readLong();
        this.f16215s = (Throughput) parcel.readParcelable(Throughput.class.getClassLoader());
        this.f16216t = parcel.readByte() != 0;
    }
}
