package com.squareup.cash.support.viewmodels;

import com.squareup.cash.activity.viewmodels.FullScreenActivityViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface SupportFullScreenActivityPickerViewModel {

    public final class Loaded implements SupportFullScreenActivityPickerViewModel {
        public final FullScreenActivityViewModel fullScreenViewModel;
        public final String headerSubTitle;
        public final String headerTitle;
        public final NavigationIconType toolbarNavigationIconType;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class NavigationIconType {
            public static final /* synthetic */ NavigationIconType[] $VALUES;
            public static final NavigationIconType BACK;
            public static final NavigationIconType CLOSE;

            static {
                NavigationIconType navigationIconType = new NavigationIconType("CLOSE", 0);
                CLOSE = navigationIconType;
                NavigationIconType navigationIconType2 = new NavigationIconType("BACK", 1);
                BACK = navigationIconType2;
                $VALUES = new NavigationIconType[]{navigationIconType, navigationIconType2};
            }

            public static NavigationIconType valueOf(String str) {
                return (NavigationIconType) Enum.valueOf(NavigationIconType.class, str);
            }

            public static NavigationIconType[] values() {
                return (NavigationIconType[]) $VALUES.clone();
            }
        }

        public Loaded(FullScreenActivityViewModel fullScreenActivityViewModel, NavigationIconType navigationIconType, String str, String str2) {
            this.fullScreenViewModel = fullScreenActivityViewModel;
            this.toolbarNavigationIconType = navigationIconType;
            this.headerTitle = str;
            this.headerSubTitle = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.fullScreenViewModel.equals(loaded.fullScreenViewModel) && this.toolbarNavigationIconType == loaded.toolbarNavigationIconType && Intrinsics.areEqual(this.headerTitle, loaded.headerTitle) && Intrinsics.areEqual(this.headerSubTitle, loaded.headerSubTitle);
        }

        public final int hashCode() {
            int hashCode = (this.toolbarNavigationIconType.hashCode() + (this.fullScreenViewModel.hashCode() * 31)) * 31;
            String str = this.headerTitle;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.headerSubTitle;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(fullScreenViewModel=");
            sb.append(this.fullScreenViewModel);
            sb.append(", toolbarNavigationIconType=");
            sb.append(this.toolbarNavigationIconType);
            sb.append(", headerTitle=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.headerTitle, ", headerSubTitle=", this.headerSubTitle, ")");
        }
    }

    public final class Loading implements SupportFullScreenActivityPickerViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -116472615;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
