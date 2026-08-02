package com.squareup.cash.support.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.backend.api.articles.Link;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class SupportHomeViewModel {

    public final class Category {
        public final Article.Icon icon;
        public final String title;
        public final String token;

        public Category(String str, String str2, Article.Icon icon) {
            str.getClass();
            str2.getClass();
            this.token = str;
            this.title = str2;
            this.icon = icon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Category)) {
                return false;
            }
            Category category = (Category) obj;
            return Intrinsics.areEqual(this.token, category.token) && Intrinsics.areEqual(this.title, category.title) && Intrinsics.areEqual(this.icon, category.icon);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.title);
            Article.Icon icon = this.icon;
            return m + (icon == null ? 0 : icon.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Category(token=", this.token, ", title=", this.title, ", icon=");
            m.append(this.icon);
            m.append(")");
            return m.toString();
        }
    }

    public final class ContactOption {
        public final boolean enabled;
        public final boolean hasNotificationBadge;
        public final String subtitle;
        public final String title;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1210type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Type {
            public static final /* synthetic */ Type[] $VALUES;
            public static final Type CHAT;
            public static final Type PHONE;

            static {
                Type type2 = new Type("CHAT", 0);
                CHAT = type2;
                Type type3 = new Type("PHONE", 1);
                PHONE = type3;
                $VALUES = new Type[]{type2, type3};
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public ContactOption(String str, String str2, Type type2, boolean z, boolean z2, int i) {
            z = (i & 8) != 0 ? true : z;
            z2 = (i & 16) != 0 ? false : z2;
            str.getClass();
            this.title = str;
            this.subtitle = str2;
            this.f1210type = type2;
            this.enabled = z;
            this.hasNotificationBadge = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContactOption)) {
                return false;
            }
            ContactOption contactOption = (ContactOption) obj;
            return Intrinsics.areEqual(this.title, contactOption.title) && Intrinsics.areEqual(this.subtitle, contactOption.subtitle) && this.f1210type == contactOption.f1210type && this.enabled == contactOption.enabled && this.hasNotificationBadge == contactOption.hasNotificationBadge;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            return Boolean.hashCode(this.hasNotificationBadge) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.f1210type.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.enabled);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ContactOption(title=", this.title, ", subtitle=", this.subtitle, ", type=");
            m.append(this.f1210type);
            m.append(", enabled=");
            m.append(this.enabled);
            m.append(", hasNotificationBadge=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.hasNotificationBadge, ")");
        }
    }

    public final class Loading extends SupportHomeViewModel {
        public final NavigationIcon navigationIcon;

        public Loading(NavigationIcon navigationIcon) {
            this.navigationIcon = navigationIcon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && this.navigationIcon == ((Loading) obj).navigationIcon;
        }

        public final int hashCode() {
            return this.navigationIcon.hashCode();
        }

        public final String toString() {
            return "Loading(navigationIcon=" + this.navigationIcon + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class NavigationIcon {
        public static final /* synthetic */ NavigationIcon[] $VALUES;
        public static final NavigationIcon BACK;
        public static final NavigationIcon CLOSE;

        static {
            NavigationIcon navigationIcon = new NavigationIcon("BACK", 0);
            BACK = navigationIcon;
            NavigationIcon navigationIcon2 = new NavigationIcon("CLOSE", 1);
            CLOSE = navigationIcon2;
            $VALUES = new NavigationIcon[]{navigationIcon, navigationIcon2};
        }

        public static NavigationIcon valueOf(String str) {
            return (NavigationIcon) Enum.valueOf(NavigationIcon.class, str);
        }

        public static NavigationIcon[] values() {
            return (NavigationIcon[]) $VALUES.clone();
        }
    }

    public final class SuggestedAction {
        public final Icon icon;
        public final Link link;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Icon {
            public static final /* synthetic */ Icon[] $VALUES;
            public static final Icon ARTICLE;
            public static final Icon EXTERNAL_LINK;
            public static final Icon INTERNAL_LINK;

            static {
                Icon icon = new Icon("ARTICLE", 0);
                ARTICLE = icon;
                Icon icon2 = new Icon("INTERNAL_LINK", 1);
                INTERNAL_LINK = icon2;
                Icon icon3 = new Icon("EXTERNAL_LINK", 2);
                EXTERNAL_LINK = icon3;
                $VALUES = new Icon[]{icon, icon2, icon3};
            }

            public static Icon valueOf(String str) {
                return (Icon) Enum.valueOf(Icon.class, str);
            }

            public static Icon[] values() {
                return (Icon[]) $VALUES.clone();
            }
        }

        public SuggestedAction(Link link, Icon icon) {
            this.link = link;
            this.icon = icon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuggestedAction)) {
                return false;
            }
            SuggestedAction suggestedAction = (SuggestedAction) obj;
            return this.link.equals(suggestedAction.link) && this.icon == suggestedAction.icon;
        }

        public final int hashCode() {
            return this.icon.hashCode() + (this.link.hashCode() * 31);
        }

        public final String toString() {
            return "SuggestedAction(link=" + this.link + ", icon=" + this.icon + ")";
        }
    }

    public final class Loaded extends SupportHomeViewModel {
        public final ActivitySectionConfig activitySectionConfig;
        public final List categories;
        public final List contactOptions;
        public final SupportHomeDisputes disputes;
        public final NavigationIcon navigationIcon;
        public final List notifications;
        public final String searchPlaceholder;
        public final boolean showArticleError;
        public final boolean showProminentContactSupportButton;
        public final List suggestedActions;

        public interface ActivitySectionConfig {

            public final class DisputeOnly implements ActivitySectionConfig {
                public final SupportHomeDisputes disputes;

                public DisputeOnly(SupportHomeDisputes supportHomeDisputes) {
                    this.disputes = supportHomeDisputes;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof DisputeOnly) && Intrinsics.areEqual(this.disputes, ((DisputeOnly) obj).disputes);
                }

                public final int hashCode() {
                    SupportHomeDisputes supportHomeDisputes = this.disputes;
                    if (supportHomeDisputes == null) {
                        return 0;
                    }
                    return supportHomeDisputes.hashCode();
                }

                public final String toString() {
                    return "DisputeOnly(disputes=" + this.disputes + ")";
                }
            }

            public final class PickerAndDisputes implements ActivitySectionConfig {
                public final UiCallbackModel activityEmbeddedViewModel;
                public final SupportHomeDisputes disputes;

                public PickerAndDisputes(SupportHomeDisputes supportHomeDisputes, UiCallbackModel uiCallbackModel) {
                    this.disputes = supportHomeDisputes;
                    this.activityEmbeddedViewModel = uiCallbackModel;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof PickerAndDisputes)) {
                        return false;
                    }
                    PickerAndDisputes pickerAndDisputes = (PickerAndDisputes) obj;
                    return Intrinsics.areEqual(this.disputes, pickerAndDisputes.disputes) && Intrinsics.areEqual(this.activityEmbeddedViewModel, pickerAndDisputes.activityEmbeddedViewModel);
                }

                public final int hashCode() {
                    SupportHomeDisputes supportHomeDisputes = this.disputes;
                    int hashCode = (supportHomeDisputes == null ? 0 : supportHomeDisputes.hashCode()) * 31;
                    UiCallbackModel uiCallbackModel = this.activityEmbeddedViewModel;
                    return hashCode + (uiCallbackModel != null ? uiCallbackModel.hashCode() : 0);
                }

                public final String toString() {
                    return "PickerAndDisputes(disputes=" + this.disputes + ", activityEmbeddedViewModel=" + this.activityEmbeddedViewModel + ")";
                }
            }
        }

        public Loaded(List list, List list2, String str, List list3, List list4, ActivitySectionConfig.PickerAndDisputes pickerAndDisputes, int i) {
            this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? EmptyList.INSTANCE : list2, str, (i & 8) == 0, (i & 16) != 0 ? EmptyList.INSTANCE : list3, (i & 32) != 0 ? EmptyList.INSTANCE : list4, NavigationIcon.CLOSE, null, pickerAndDisputes, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.contactOptions, loaded.contactOptions) && Intrinsics.areEqual(this.notifications, loaded.notifications) && Intrinsics.areEqual(this.searchPlaceholder, loaded.searchPlaceholder) && this.showArticleError == loaded.showArticleError && Intrinsics.areEqual(this.categories, loaded.categories) && Intrinsics.areEqual(this.suggestedActions, loaded.suggestedActions) && this.navigationIcon == loaded.navigationIcon && Intrinsics.areEqual(this.disputes, loaded.disputes) && Intrinsics.areEqual(this.activitySectionConfig, loaded.activitySectionConfig) && this.showProminentContactSupportButton == loaded.showProminentContactSupportButton;
        }

        public final int hashCode() {
            int hashCode = (this.navigationIcon.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.contactOptions.hashCode() * 31, 31, this.notifications), 31, this.searchPlaceholder), 31, this.showArticleError), 31, this.categories), 31, this.suggestedActions)) * 31;
            SupportHomeDisputes supportHomeDisputes = this.disputes;
            return Boolean.hashCode(this.showProminentContactSupportButton) + ((this.activitySectionConfig.hashCode() + ((hashCode + (supportHomeDisputes == null ? 0 : supportHomeDisputes.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("Loaded(contactOptions=", ", notifications=", ", searchPlaceholder=", this.contactOptions, this.notifications);
            NavAction$$ExternalSyntheticOutline0.m(m, this.searchPlaceholder, ", showArticleError=", this.showArticleError, ", categories=");
            Request$Priority$EnumUnboxingLocalUtility.m(m, this.categories, ", suggestedActions=", this.suggestedActions, ", navigationIcon=");
            m.append(this.navigationIcon);
            m.append(", disputes=");
            m.append(this.disputes);
            m.append(", activitySectionConfig=");
            m.append(this.activitySectionConfig);
            m.append(", showProminentContactSupportButton=");
            m.append(this.showProminentContactSupportButton);
            m.append(")");
            return m.toString();
        }

        public Loaded(List list, List list2, String str, boolean z, List list3, List list4, NavigationIcon navigationIcon, SupportHomeDisputes supportHomeDisputes, ActivitySectionConfig activitySectionConfig, boolean z2) {
            list.getClass();
            list2.getClass();
            str.getClass();
            list3.getClass();
            list4.getClass();
            this.contactOptions = list;
            this.notifications = list2;
            this.searchPlaceholder = str;
            this.showArticleError = z;
            this.categories = list3;
            this.suggestedActions = list4;
            this.navigationIcon = navigationIcon;
            this.disputes = supportHomeDisputes;
            this.activitySectionConfig = activitySectionConfig;
            this.showProminentContactSupportButton = z2;
        }
    }
}
