package com.squareup.cash.support.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class SupportSearchViewModel {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ContactOptionType {
        public static final /* synthetic */ ContactOptionType[] $VALUES;
        public static final ContactOptionType CHAT;
        public static final ContactOptionType PHONE;

        static {
            ContactOptionType contactOptionType = new ContactOptionType("CHAT", 0);
            CHAT = contactOptionType;
            ContactOptionType contactOptionType2 = new ContactOptionType("PHONE", 1);
            PHONE = contactOptionType2;
            $VALUES = new ContactOptionType[]{contactOptionType, contactOptionType2};
        }

        public static ContactOptionType valueOf(String str) {
            return (ContactOptionType) Enum.valueOf(ContactOptionType.class, str);
        }

        public static ContactOptionType[] values() {
            return (ContactOptionType[]) $VALUES.clone();
        }
    }

    public final class HighlightedString {
        public final List highlights;
        public final String text;

        public HighlightedString(String str, List list) {
            str.getClass();
            list.getClass();
            this.text = str;
            this.highlights = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HighlightedString)) {
                return false;
            }
            HighlightedString highlightedString = (HighlightedString) obj;
            return Intrinsics.areEqual(this.text, highlightedString.text) && Intrinsics.areEqual(this.highlights, highlightedString.highlights);
        }

        public final int hashCode() {
            return this.highlights.hashCode() + (this.text.hashCode() * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("HighlightedString(text=", this.text, ", highlights=", ")", this.highlights);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Icon {
        public static final /* synthetic */ Icon[] $VALUES;
        public static final Icon ARTICLE;
        public static final Icon CHAT;
        public static final Icon EXTERNAL_LINK;
        public static final Icon INTERNAL_LINK;
        public static final Icon PHONE;

        static {
            Icon icon = new Icon("ARTICLE", 0);
            ARTICLE = icon;
            Icon icon2 = new Icon("INTERNAL_LINK", 1);
            INTERNAL_LINK = icon2;
            Icon icon3 = new Icon("EXTERNAL_LINK", 2);
            EXTERNAL_LINK = icon3;
            Icon icon4 = new Icon("CHAT", 3);
            CHAT = icon4;
            Icon icon5 = new Icon("PHONE", 4);
            PHONE = icon5;
            $VALUES = new Icon[]{icon, icon2, icon3, icon4, icon5};
        }

        public static Icon valueOf(String str) {
            return (Icon) Enum.valueOf(Icon.class, str);
        }

        public static Icon[] values() {
            return (Icon[]) $VALUES.clone();
        }
    }

    public final class Loaded extends SupportSearchViewModel {
        public final List results;
        public final String searchPlaceholder;

        public Loaded(List list, String str) {
            list.getClass();
            str.getClass();
            this.results = list;
            this.searchPlaceholder = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.results, loaded.results) && Intrinsics.areEqual(this.searchPlaceholder, loaded.searchPlaceholder);
        }

        public final int hashCode() {
            return this.searchPlaceholder.hashCode() + (this.results.hashCode() * 31);
        }

        public final String toString() {
            return "Loaded(results=" + this.results + ", searchPlaceholder=" + this.searchPlaceholder + ")";
        }
    }

    public final class Loading extends SupportSearchViewModel {
        public final String searchPlaceholder;

        public Loading(String str) {
            str.getClass();
            this.searchPlaceholder = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.searchPlaceholder, ((Loading) obj).searchPlaceholder);
        }

        public final int hashCode() {
            return this.searchPlaceholder.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loading(searchPlaceholder=", this.searchPlaceholder, ")");
        }
    }

    public final class NoResults extends SupportSearchViewModel {
        public final List contactOptions;
        public final String searchPlaceholder;

        public NoResults(String str, ListBuilder listBuilder) {
            str.getClass();
            listBuilder.getClass();
            this.searchPlaceholder = str;
            this.contactOptions = listBuilder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoResults)) {
                return false;
            }
            NoResults noResults = (NoResults) obj;
            return Intrinsics.areEqual(this.searchPlaceholder, noResults.searchPlaceholder) && Intrinsics.areEqual(this.contactOptions, noResults.contactOptions);
        }

        public final int hashCode() {
            return this.contactOptions.hashCode() + (this.searchPlaceholder.hashCode() * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("NoResults(searchPlaceholder=", this.searchPlaceholder, ", contactOptions=", ")", this.contactOptions);
        }
    }

    public final class Node {
        public final String token;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1211type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Type {
            public static final /* synthetic */ Type[] $VALUES;
            public static final Type RECENTLY_VIEWED;
            public static final Type SEARCH;
            public static final Type SUGGESTED;

            static {
                Type type2 = new Type("SEARCH", 0);
                SEARCH = type2;
                Type type3 = new Type("SUGGESTED", 1);
                SUGGESTED = type3;
                Type type4 = new Type("RECENTLY_VIEWED", 2);
                RECENTLY_VIEWED = type4;
                $VALUES = new Type[]{type2, type3, type4};
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public Node(String str, Type type2) {
            str.getClass();
            this.token = str;
            this.f1211type = type2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Node)) {
                return false;
            }
            Node node = (Node) obj;
            return Intrinsics.areEqual(this.token, node.token) && this.f1211type == node.f1211type;
        }

        public final int hashCode() {
            return this.f1211type.hashCode() + (this.token.hashCode() * 31);
        }

        public final String toString() {
            return "Node(token=" + this.token + ", type=" + this.f1211type + ")";
        }
    }

    public abstract class SearchResultViewModel {

        public final class ContactOption extends SearchResultViewModel {
            public final boolean enabled;
            public final Icon icon;
            public final String subtitle;
            public final String title;

            /* renamed from: type, reason: collision with root package name */
            public final ContactOptionType f1212type;

            public ContactOption(String str, String str2, Icon icon, boolean z, ContactOptionType contactOptionType) {
                str.getClass();
                this.title = str;
                this.subtitle = str2;
                this.icon = icon;
                this.enabled = z;
                this.f1212type = contactOptionType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ContactOption)) {
                    return false;
                }
                ContactOption contactOption = (ContactOption) obj;
                return Intrinsics.areEqual(this.title, contactOption.title) && Intrinsics.areEqual(this.subtitle, contactOption.subtitle) && this.icon == contactOption.icon && this.enabled == contactOption.enabled && this.f1212type == contactOption.f1212type;
            }

            public final int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.subtitle;
                return this.f1212type.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.icon.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.enabled);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ContactOption(title=", this.title, ", subtitle=", this.subtitle, ", icon=");
                m.append(this.icon);
                m.append(", enabled=");
                m.append(this.enabled);
                m.append(", type=");
                m.append(this.f1212type);
                m.append(")");
                return m.toString();
            }
        }

        public final class Divider extends SearchResultViewModel {
            public static final Divider INSTANCE = new Divider();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Divider);
            }

            public final int hashCode() {
                return -2068543401;
            }

            public final String toString() {
                return "Divider";
            }
        }

        public final class Header extends SearchResultViewModel {
            public final String header;

            public Header(String str) {
                str.getClass();
                this.header = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Header) && Intrinsics.areEqual(this.header, ((Header) obj).header);
            }

            public final int hashCode() {
                return this.header.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Header(header=", this.header, ")");
            }
        }

        public final class Item extends SearchResultViewModel {
            public final boolean enableHighlighting;
            public final Icon icon;
            public final Node node;
            public final HighlightedString previewText;
            public final boolean showChevron;
            public final HighlightedString title;

            public Item(Node node, HighlightedString highlightedString, HighlightedString highlightedString2, Icon icon, boolean z, boolean z2) {
                this.node = node;
                this.title = highlightedString;
                this.previewText = highlightedString2;
                this.icon = icon;
                this.showChevron = z;
                this.enableHighlighting = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Item)) {
                    return false;
                }
                Item item = (Item) obj;
                return Intrinsics.areEqual(this.node, item.node) && Intrinsics.areEqual(this.title, item.title) && Intrinsics.areEqual(this.previewText, item.previewText) && this.icon == item.icon && this.showChevron == item.showChevron && this.enableHighlighting == item.enableHighlighting;
            }

            public final int hashCode() {
                int hashCode = (this.title.hashCode() + (this.node.hashCode() * 31)) * 31;
                HighlightedString highlightedString = this.previewText;
                int hashCode2 = (hashCode + (highlightedString == null ? 0 : highlightedString.hashCode())) * 31;
                Icon icon = this.icon;
                return Boolean.hashCode(this.enableHighlighting) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (icon != null ? icon.hashCode() : 0)) * 31, 31, this.showChevron);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Item(node=");
                sb.append(this.node);
                sb.append(", title=");
                sb.append(this.title);
                sb.append(", previewText=");
                sb.append(this.previewText);
                sb.append(", icon=");
                sb.append(this.icon);
                sb.append(", showChevron=");
                return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.showChevron, ", enableHighlighting=", this.enableHighlighting, ")");
            }
        }
    }
}
