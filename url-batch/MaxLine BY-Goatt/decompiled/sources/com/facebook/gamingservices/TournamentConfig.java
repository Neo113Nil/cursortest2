package com.facebook.gamingservices;

import android.media.Image;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.gamingservices.internal.DateFormatter;
import com.facebook.gamingservices.internal.TournamentScoreType;
import com.facebook.gamingservices.internal.TournamentSortOrder;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;
import j$.time.Instant;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class TournamentConfig implements ShareModel {
    public static final CREATOR CREATOR = new CREATOR(null);
    private final Instant endTime;
    private final Image image;
    private final String payload;
    private final TournamentScoreType scoreType;
    private final TournamentSortOrder sortOrder;
    private final String title;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Builder implements ShareModelBuilder<TournamentConfig, Builder> {
        private Instant endTime;
        private Image image;
        private String payload;
        private TournamentScoreType scoreType;
        private TournamentSortOrder sortOrder;
        private String title;

        @Override // com.facebook.share.ShareBuilder
        public TournamentConfig build() {
            return new TournamentConfig(this, null);
        }

        public final Instant getEndTime() {
            return this.endTime;
        }

        public final Image getImage() {
            return this.image;
        }

        public final String getPayload() {
            return this.payload;
        }

        public final TournamentScoreType getScoreType() {
            return this.scoreType;
        }

        public final TournamentSortOrder getSortOrder() {
            return this.sortOrder;
        }

        public final String getTitle() {
            return this.title;
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(TournamentConfig tournamentConfig) {
            if (tournamentConfig == null) {
                return this;
            }
            TournamentSortOrder sortOrder = tournamentConfig.getSortOrder();
            if (sortOrder != null) {
                setTournamentSortOrder(sortOrder);
            }
            TournamentScoreType scoreType = tournamentConfig.getScoreType();
            if (scoreType != null) {
                setTournamentScoreType(scoreType);
            }
            Instant endTime = tournamentConfig.getEndTime();
            if (endTime != null) {
                setTournamentEndTime(endTime);
            }
            String title = tournamentConfig.getTitle();
            if (title != null) {
                setTournamentTitle(title);
            }
            setTournamentPayload(tournamentConfig.getPayload());
            return this;
        }

        public final Builder readFrom$facebook_gamingservices_release(Parcel parcel) {
            parcel.getClass();
            return readFrom((TournamentConfig) parcel.readParcelable(TournamentConfig.class.getClassLoader()));
        }

        public final void setEndTime(Instant instant) {
            this.endTime = instant;
        }

        public final void setImage(Image image) {
            this.image = image;
        }

        public final void setPayload(String str) {
            this.payload = str;
        }

        public final void setScoreType(TournamentScoreType tournamentScoreType) {
            this.scoreType = tournamentScoreType;
        }

        public final void setSortOrder(TournamentSortOrder tournamentSortOrder) {
            this.sortOrder = tournamentSortOrder;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public final Builder setTournamentEndTime(Instant instant) {
            instant.getClass();
            this.endTime = instant;
            return this;
        }

        public final Builder setTournamentImage(Image image) {
            this.image = image;
            return this;
        }

        public final Builder setTournamentPayload(String str) {
            this.payload = str;
            return this;
        }

        public final Builder setTournamentScoreType(TournamentScoreType tournamentScoreType) {
            tournamentScoreType.getClass();
            this.scoreType = tournamentScoreType;
            return this;
        }

        public final Builder setTournamentSortOrder(TournamentSortOrder tournamentSortOrder) {
            tournamentSortOrder.getClass();
            this.sortOrder = tournamentSortOrder;
            return this;
        }

        public final Builder setTournamentTitle(String str) {
            this.title = str;
            return this;
        }
    }

    public TournamentConfig(Parcel parcel) {
        TournamentSortOrder tournamentSortOrder;
        TournamentScoreType tournamentScoreType;
        String readString;
        parcel.getClass();
        this.title = parcel.readString();
        TournamentSortOrder[] values = TournamentSortOrder.values();
        int length = values.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                tournamentSortOrder = null;
                break;
            }
            tournamentSortOrder = values[i2];
            if (Intrinsics.b(tournamentSortOrder.name(), parcel.readString())) {
                break;
            } else {
                i2++;
            }
        }
        this.sortOrder = tournamentSortOrder;
        TournamentScoreType[] values2 = TournamentScoreType.values();
        int length2 = values2.length;
        while (true) {
            if (i >= length2) {
                tournamentScoreType = null;
                break;
            }
            tournamentScoreType = values2[i];
            if (Intrinsics.b(tournamentScoreType.name(), parcel.readString())) {
                break;
            } else {
                i++;
            }
        }
        this.scoreType = tournamentScoreType;
        this.endTime = (Build.VERSION.SDK_INT < 26 || (readString = parcel.readString()) == null) ? null : Instant.from(DateFormatter.INSTANCE.format$facebook_gamingservices_release(readString));
        this.payload = parcel.readString();
        this.image = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Instant getEndTime() {
        return this.endTime;
    }

    public final Image getImage() {
        return this.image;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final TournamentScoreType getScoreType() {
        return this.scoreType;
    }

    public final TournamentSortOrder getSortOrder() {
        return this.sortOrder;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(String.valueOf(this.sortOrder));
        parcel.writeString(String.valueOf(this.scoreType));
        parcel.writeString(String.valueOf(this.endTime));
        parcel.writeString(this.title);
        parcel.writeString(this.payload);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class CREATOR implements Parcelable.Creator<TournamentConfig> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TournamentConfig createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new TournamentConfig(parcel);
        }

        private CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TournamentConfig[] newArray(int i) {
            return new TournamentConfig[i];
        }
    }

    private TournamentConfig(Builder builder) {
        this.title = builder.getTitle();
        this.sortOrder = builder.getSortOrder();
        this.scoreType = builder.getScoreType();
        this.endTime = builder.getEndTime();
        this.image = builder.getImage();
        this.payload = builder.getPayload();
    }

    public /* synthetic */ TournamentConfig(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
