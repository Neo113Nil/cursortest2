package com.yandex.authsdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import k1.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class YandexAuthOptions implements Parcelable {

    @NotNull
    public static final a CREATOR = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final String f22290b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f22291c;

    /* renamed from: d, reason: collision with root package name */
    private final String f22292d;

    public static final class a implements Parcelable.Creator {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public YandexAuthOptions createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new YandexAuthOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public YandexAuthOptions[] newArray(int i4) {
            return new YandexAuthOptions[i4];
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YandexAuthOptions(Context context) {
        this(context, false, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final String c() {
        return this.f22290b;
    }

    public final String d() {
        return this.f22292d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f22291c;
    }

    public final boolean f() {
        return !TextUtils.equals(this.f22292d, "oauth.yandex.ru");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i4) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f22290b);
        dest.writeByte(this.f22291c ? (byte) 1 : (byte) 0);
        dest.writeString(this.f22292d);
    }

    public YandexAuthOptions(Context context, boolean z4) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            ApplicationInfo a4 = g.a(packageManager, packageName, 128L);
            String string = a4.metaData.getString("com.yandex.auth.CLIENT_ID");
            if (string == null) {
                throw new IllegalStateException("Application should provide client id in gradle.properties");
            }
            this.f22290b = string;
            this.f22291c = z4;
            String string2 = a4.metaData.getString("com.yandex.auth.OAUTH_HOST");
            Intrinsics.checkNotNull(string2);
            this.f22292d = string2;
        } catch (PackageManager.NameNotFoundException e4) {
            throw new RuntimeException(e4);
        }
    }

    public /* synthetic */ YandexAuthOptions(Context context, boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i4 & 2) != 0 ? false : z4);
    }

    protected YandexAuthOptions(Parcel in) {
        Intrinsics.checkNotNullParameter(in, "in");
        String readString = in.readString();
        Intrinsics.checkNotNull(readString);
        this.f22290b = readString;
        this.f22291c = in.readByte() != 0;
        String readString2 = in.readString();
        Intrinsics.checkNotNull(readString2);
        this.f22292d = readString2;
    }
}
