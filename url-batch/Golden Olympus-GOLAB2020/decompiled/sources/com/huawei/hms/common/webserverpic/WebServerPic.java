package com.huawei.hms.common.webserverpic;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Locale;

/* loaded from: classes.dex */
public class WebServerPic {
    public static final Parcelable.Creator<WebServerPic> CREATOR = new WebServerPicCreator();

    /* renamed from: a, reason: collision with root package name */
    private final Uri f14108a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14109b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14110c;

    public WebServerPic(Uri uri, int i4, int i5) {
        this.f14108a = uri;
        this.f14109b = i4;
        this.f14110c = i5;
        if (uri == null) {
            throw new IllegalArgumentException("url is not able to be null");
        }
        if (i4 < 0 || i5 < 0) {
            throw new IllegalArgumentException("width and height should be positive or 0");
        }
    }

    public final int getHeight() {
        return this.f14110c;
    }

    public final Uri getUrl() {
        return this.f14108a;
    }

    public final int getWidth() {
        return this.f14109b;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "Image %dx%d %s", Integer.valueOf(this.f14109b), Integer.valueOf(this.f14110c), this.f14108a.toString());
    }

    public final void writeToParcel(Parcel parcel, int i4) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getUrl(), i4, false);
        SafeParcelWriter.writeInt(parcel, 2, getWidth());
        SafeParcelWriter.writeInt(parcel, 3, getHeight());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public WebServerPic(Uri uri) {
        this(uri, 0, 0);
    }
}
