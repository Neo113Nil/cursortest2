package com.squareup.cash.transfers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class RecurringReloadOptionScreen implements TransfersScreens, RestoringScreen {
    public static final Parcelable.Creator<RecurringReloadOptionScreen> CREATOR = new WalletHomeScreen.Creator(12);
    public final Screen parentScreen;

    /* renamed from: type, reason: collision with root package name */
    public final ReloadType f1216type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class ReloadType {
        public static final /* synthetic */ ReloadType[] $VALUES;
        public static final ReloadType BALANCE_BASED;
        public static final ReloadType SCHEDULED;

        static {
            ReloadType reloadType = new ReloadType("BALANCE_BASED", 0);
            BALANCE_BASED = reloadType;
            ReloadType reloadType2 = new ReloadType("SCHEDULED", 1);
            SCHEDULED = reloadType2;
            $VALUES = new ReloadType[]{reloadType, reloadType2};
        }

        public static ReloadType valueOf(String str) {
            return (ReloadType) Enum.valueOf(ReloadType.class, str);
        }

        public static ReloadType[] values() {
            return (ReloadType[]) $VALUES.clone();
        }
    }

    public RecurringReloadOptionScreen(ReloadType reloadType, Screen screen) {
        reloadType.getClass();
        this.f1216type = reloadType;
        this.parentScreen = screen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringReloadOptionScreen)) {
            return false;
        }
        RecurringReloadOptionScreen recurringReloadOptionScreen = (RecurringReloadOptionScreen) obj;
        return this.f1216type == recurringReloadOptionScreen.f1216type && Intrinsics.areEqual(this.parentScreen, recurringReloadOptionScreen.parentScreen);
    }

    public final int hashCode() {
        int hashCode = this.f1216type.hashCode() * 31;
        Screen screen = this.parentScreen;
        return hashCode + (screen == null ? 0 : screen.hashCode());
    }

    public final String toString() {
        return "RecurringReloadOptionScreen(type=" + this.f1216type + ", parentScreen=" + this.parentScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f1216type.name());
        parcel.writeParcelable(this.parentScreen, i);
    }
}
