package com.squareup.cash.tabs.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.common.viewmodels.ColorModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TabToolbarInternalViewModel {
    public static final TabToolbarInternalViewModel EMPTY;
    public static final TabToolbarInternalViewModel EMPTY_NO_PROFILE;
    public final List imageButtons;
    public final ToolbarButton moneybotSpacesButton;
    public final ProfileButton profileButton;
    public final boolean showQrOnAvatar;
    public final StartButtonType startButtonType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ButtonBackgroundType {
        public static final /* synthetic */ ButtonBackgroundType[] $VALUES;
        public static final ButtonBackgroundType NONE;
        public static final ButtonBackgroundType SOLID;
        public static final ButtonBackgroundType TRANSPARENT;

        static {
            ButtonBackgroundType buttonBackgroundType = new ButtonBackgroundType("NONE", 0);
            NONE = buttonBackgroundType;
            ButtonBackgroundType buttonBackgroundType2 = new ButtonBackgroundType("TRANSPARENT", 1);
            TRANSPARENT = buttonBackgroundType2;
            ButtonBackgroundType buttonBackgroundType3 = new ButtonBackgroundType("SOLID", 2);
            SOLID = buttonBackgroundType3;
            $VALUES = new ButtonBackgroundType[]{buttonBackgroundType, buttonBackgroundType2, buttonBackgroundType3};
        }

        public static ButtonBackgroundType valueOf(String str) {
            return (ButtonBackgroundType) Enum.valueOf(ButtonBackgroundType.class, str);
        }

        public static ButtonBackgroundType[] values() {
            return (ButtonBackgroundType[]) $VALUES.clone();
        }
    }

    public final class ImageButton implements ToolbarButton {
        public final ButtonBackgroundType backgroundType;
        public final int iconResId;
        public final ToolbarButton.Id id;

        public ImageButton(ToolbarButton.Id id, int i, ButtonBackgroundType buttonBackgroundType, int i2) {
            buttonBackgroundType = (i2 & 16) != 0 ? ButtonBackgroundType.NONE : buttonBackgroundType;
            this.id = id;
            this.iconResId = i;
            this.backgroundType = buttonBackgroundType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageButton)) {
                return false;
            }
            ImageButton imageButton = (ImageButton) obj;
            return this.id == imageButton.id && this.iconResId == imageButton.iconResId && this.backgroundType == imageButton.backgroundType;
        }

        public final int hashCode() {
            return this.backgroundType.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.iconResId, this.id.hashCode() * 31, 31), 961, 0L);
        }

        public final String toString() {
            return "ImageButton(id=" + this.id + ", iconResId=" + this.iconResId + ", badgeCount=0, badgeViewModel=null, backgroundType=" + this.backgroundType + ")";
        }
    }

    public final class ProfileButton {
        public final String activeAccountCashtag;
        public final TransactorKt badge;
        public final long badgeCount;
        public final boolean isBusiness;
        public final Monogram monogram;
        public final String photoUrl;
        public final String stateAccessibilityText;

        public final class Monogram {
            public final ColorModel.Accented background;
            public final String character;

            public Monogram(String str, ColorModel.Accented accented) {
                this.character = str;
                this.background = accented;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Monogram)) {
                    return false;
                }
                Monogram monogram = (Monogram) obj;
                return this.character.equals(monogram.character) && this.background.equals(monogram.background);
            }

            public final int hashCode() {
                return this.background.hashCode() + (this.character.hashCode() * 31);
            }

            public final String toString() {
                return "Monogram(character=" + this.character + ", background=" + this.background + ")";
            }
        }

        public ProfileButton(String str, String str2, Monogram monogram, boolean z, TabToolbarBadgeViewModel$Text tabToolbarBadgeViewModel$Text, long j, String str3) {
            str.getClass();
            this.stateAccessibilityText = str;
            this.photoUrl = str2;
            this.monogram = monogram;
            this.isBusiness = z;
            this.badge = tabToolbarBadgeViewModel$Text;
            this.badgeCount = j;
            this.activeAccountCashtag = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProfileButton)) {
                return false;
            }
            ProfileButton profileButton = (ProfileButton) obj;
            return Intrinsics.areEqual(this.stateAccessibilityText, profileButton.stateAccessibilityText) && Intrinsics.areEqual(this.photoUrl, profileButton.photoUrl) && Intrinsics.areEqual(this.monogram, profileButton.monogram) && this.isBusiness == profileButton.isBusiness && Intrinsics.areEqual(this.badge, profileButton.badge) && this.badgeCount == profileButton.badgeCount && Intrinsics.areEqual(this.activeAccountCashtag, profileButton.activeAccountCashtag);
        }

        public final int hashCode() {
            int hashCode = this.stateAccessibilityText.hashCode() * 31;
            String str = this.photoUrl;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Monogram monogram = this.monogram;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (monogram == null ? 0 : monogram.hashCode())) * 31, 31, this.isBusiness);
            TransactorKt transactorKt = this.badge;
            int m2 = Recorder$$ExternalSyntheticOutline2.m((m + (transactorKt == null ? 0 : transactorKt.hashCode())) * 31, 31, this.badgeCount);
            String str2 = this.activeAccountCashtag;
            return m2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ProfileButton(stateAccessibilityText=", this.stateAccessibilityText, ", photoUrl=", this.photoUrl, ", monogram=");
            m.append(this.monogram);
            m.append(", isBusiness=");
            m.append(this.isBusiness);
            m.append(", badge=");
            m.append(this.badge);
            m.append(", badgeCount=");
            m.append(this.badgeCount);
            return Recorder$$ExternalSyntheticOutline2.m(m, ", activeAccountCashtag=", this.activeAccountCashtag, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class StartButtonType {
        public static final /* synthetic */ StartButtonType[] $VALUES;
        public static final StartButtonType BACK;
        public static final StartButtonType CLOSE;
        public static final StartButtonType NONE;

        static {
            StartButtonType startButtonType = new StartButtonType("NONE", 0);
            NONE = startButtonType;
            StartButtonType startButtonType2 = new StartButtonType("BACK", 1);
            BACK = startButtonType2;
            StartButtonType startButtonType3 = new StartButtonType("CLOSE", 2);
            CLOSE = startButtonType3;
            $VALUES = new StartButtonType[]{startButtonType, startButtonType2, startButtonType3};
        }

        public static StartButtonType valueOf(String str) {
            return (StartButtonType) Enum.valueOf(StartButtonType.class, str);
        }

        public static StartButtonType[] values() {
            return (StartButtonType[]) $VALUES.clone();
        }
    }

    /* loaded from: classes6.dex */
    public final class TextButton implements ToolbarButton {
        public final String text;

        public TextButton(String str) {
            ToolbarButton.Id id = ToolbarButton.Id.Search;
            ButtonBackgroundType buttonBackgroundType = ButtonBackgroundType.NONE;
            str.getClass();
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextButton)) {
                return false;
            }
            ToolbarButton.Id id = ToolbarButton.Id.Search;
            if (!Intrinsics.areEqual(this.text, ((TextButton) obj).text)) {
                return false;
            }
            ButtonBackgroundType buttonBackgroundType = ButtonBackgroundType.NONE;
            return true;
        }

        public final int hashCode() {
            return ButtonBackgroundType.SOLID.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(ToolbarButton.Id.Moneybot.hashCode() * 31, 31, this.text);
        }

        public final String toString() {
            return "TextButton(id=" + ToolbarButton.Id.Moneybot + ", text=" + this.text + ", backgroundType=" + ButtonBackgroundType.SOLID + ")";
        }
    }

    public interface ToolbarButton {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Id {
            public static final /* synthetic */ Id[] $VALUES;
            public static final Id Moneybot;
            public static final Id MoneybotOverflowMenu;
            public static final Id QR;
            public static final Id Search;

            /* JADX INFO: Fake field, exist only in values array */
            Id EF0;

            static {
                Id id = new Id("Activity", 0);
                Id id2 = new Id("Search", 1);
                Search = id2;
                Id id3 = new Id("Moneybot", 2);
                Moneybot = id3;
                Id id4 = new Id("QR", 3);
                QR = id4;
                Id id5 = new Id("MoneybotOverflowMenu", 4);
                MoneybotOverflowMenu = id5;
                $VALUES = new Id[]{id, id2, id3, id4, id5};
            }

            public static Id valueOf(String str) {
                return (Id) Enum.valueOf(Id.class, str);
            }

            public static Id[] values() {
                return (Id[]) $VALUES.clone();
            }
        }
    }

    static {
        TabToolbarInternalViewModel tabToolbarInternalViewModel = new TabToolbarInternalViewModel(new ProfileButton("", null, null, false, null, 0L, null), 30);
        EMPTY = tabToolbarInternalViewModel;
        EMPTY_NO_PROFILE = new TabToolbarInternalViewModel(null, 30);
        ToolbarButton.Id id = ToolbarButton.Id.Search;
        zzd zzdVar = Icons.Companion;
        copy$default(tabToolbarInternalViewModel, CollectionsKt__CollectionsJVMKt.listOf(new ImageButton(id, R.drawable.icon_search_24, ButtonBackgroundType.TRANSPARENT, 12)), null, null, 29);
    }

    public TabToolbarInternalViewModel(ProfileButton profileButton, List list, StartButtonType startButtonType, ToolbarButton toolbarButton, boolean z) {
        list.getClass();
        startButtonType.getClass();
        this.profileButton = profileButton;
        this.imageButtons = list;
        this.startButtonType = startButtonType;
        this.moneybotSpacesButton = toolbarButton;
        this.showQrOnAvatar = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel$ToolbarButton] */
    public static TabToolbarInternalViewModel copy$default(TabToolbarInternalViewModel tabToolbarInternalViewModel, List list, StartButtonType startButtonType, ImageButton imageButton, int i) {
        ProfileButton profileButton = (i & 1) != 0 ? tabToolbarInternalViewModel.profileButton : null;
        if ((i & 2) != 0) {
            list = tabToolbarInternalViewModel.imageButtons;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            startButtonType = tabToolbarInternalViewModel.startButtonType;
        }
        StartButtonType startButtonType2 = startButtonType;
        ImageButton imageButton2 = imageButton;
        if ((i & 8) != 0) {
            imageButton2 = tabToolbarInternalViewModel.moneybotSpacesButton;
        }
        ImageButton imageButton3 = imageButton2;
        boolean z = (i & 16) != 0 ? tabToolbarInternalViewModel.showQrOnAvatar : false;
        tabToolbarInternalViewModel.getClass();
        list2.getClass();
        startButtonType2.getClass();
        return new TabToolbarInternalViewModel(profileButton, list2, startButtonType2, imageButton3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabToolbarInternalViewModel)) {
            return false;
        }
        TabToolbarInternalViewModel tabToolbarInternalViewModel = (TabToolbarInternalViewModel) obj;
        return Intrinsics.areEqual(this.profileButton, tabToolbarInternalViewModel.profileButton) && Intrinsics.areEqual(this.imageButtons, tabToolbarInternalViewModel.imageButtons) && this.startButtonType == tabToolbarInternalViewModel.startButtonType && Intrinsics.areEqual(this.moneybotSpacesButton, tabToolbarInternalViewModel.moneybotSpacesButton) && this.showQrOnAvatar == tabToolbarInternalViewModel.showQrOnAvatar;
    }

    public final int hashCode() {
        ProfileButton profileButton = this.profileButton;
        int hashCode = (this.startButtonType.hashCode() + Recorder$$ExternalSyntheticOutline2.m((profileButton == null ? 0 : profileButton.hashCode()) * 31, 31, this.imageButtons)) * 31;
        ToolbarButton toolbarButton = this.moneybotSpacesButton;
        return Boolean.hashCode(this.showQrOnAvatar) + ((hashCode + (toolbarButton != null ? toolbarButton.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabToolbarInternalViewModel(profileButton=");
        sb.append(this.profileButton);
        sb.append(", imageButtons=");
        sb.append(this.imageButtons);
        sb.append(", startButtonType=");
        sb.append(this.startButtonType);
        sb.append(", moneybotSpacesButton=");
        sb.append(this.moneybotSpacesButton);
        sb.append(", showQrOnAvatar=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.showQrOnAvatar, ")");
    }

    public TabToolbarInternalViewModel(ProfileButton profileButton, int i) {
        this((i & 1) != 0 ? null : profileButton, EmptyList.INSTANCE, StartButtonType.NONE, null, false);
    }
}
