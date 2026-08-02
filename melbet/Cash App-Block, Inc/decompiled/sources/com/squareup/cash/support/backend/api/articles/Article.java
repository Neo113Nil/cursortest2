package com.squareup.cash.support.backend.api.articles;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Article {
    public final Appearance appearance;
    public final Link callToAction;
    public final List contactOptions;
    public final String htmlBody;
    public final Icon icon;
    public final boolean includeInRecentlyViewed;
    public final boolean includeIssueDescription;
    public final String language;
    public final List links;
    public final String previewText;
    public final boolean selectPaymentForCaseCreation;
    public final String title;
    public final String token;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Appearance {
        public static final /* synthetic */ Appearance[] $VALUES;
        public static final Appearance ARTICLE;
        public static final Appearance CATEGORY;
        public static final Appearance ISSUE;
        public static final Appearance SUBCATEGORY;

        static {
            Appearance appearance = new Appearance("CATEGORY", 0);
            CATEGORY = appearance;
            Appearance appearance2 = new Appearance("SUBCATEGORY", 1);
            SUBCATEGORY = appearance2;
            Appearance appearance3 = new Appearance("ARTICLE", 2);
            ARTICLE = appearance3;
            Appearance appearance4 = new Appearance("ISSUE", 3);
            ISSUE = appearance4;
            $VALUES = new Appearance[]{appearance, appearance2, appearance3, appearance4};
        }

        public static Appearance valueOf(String str) {
            return (Appearance) Enum.valueOf(Appearance.class, str);
        }

        public static Appearance[] values() {
            return (Appearance[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Color {
        public static final /* synthetic */ Color[] $VALUES;
        public static final Color AMBER;
        public static final Color BITCOIN;
        public static final Color GRAY;
        public static final Color GREEN;
        public static final Color INVESTING;
        public static final Color OCEAN;
        public static final Color PINK;
        public static final Color PURPLE;
        public static final Color ROYAL;
        public static final Color SCARLET;
        public static final Color SKY;
        public static final Color SUNSHINE;
        public static final Color TURQUOISE;
        public static final Color UNSPECIFIED;

        static {
            Color color = new Color("GREEN", 0);
            GREEN = color;
            Color color2 = new Color("TURQUOISE", 1);
            TURQUOISE = color2;
            Color color3 = new Color("SKY", 2);
            SKY = color3;
            Color color4 = new Color("OCEAN", 3);
            OCEAN = color4;
            Color color5 = new Color("ROYAL", 4);
            ROYAL = color5;
            Color color6 = new Color("PURPLE", 5);
            PURPLE = color6;
            Color color7 = new Color("PINK", 6);
            PINK = color7;
            Color color8 = new Color("SCARLET", 7);
            SCARLET = color8;
            Color color9 = new Color("AMBER", 8);
            AMBER = color9;
            Color color10 = new Color("SUNSHINE", 9);
            SUNSHINE = color10;
            Color color11 = new Color("GRAY", 10);
            GRAY = color11;
            Color color12 = new Color("INVESTING", 11);
            INVESTING = color12;
            Color color13 = new Color("BITCOIN", 12);
            BITCOIN = color13;
            Color color14 = new Color("UNSPECIFIED", 13);
            UNSPECIFIED = color14;
            $VALUES = new Color[]{color, color2, color3, color4, color5, color6, color7, color8, color9, color10, color11, color12, color13, color14};
        }

        public static Color valueOf(String str) {
            return (Color) Enum.valueOf(Color.class, str);
        }

        public static Color[] values() {
            return (Color[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ContactOption {
        public static final /* synthetic */ ContactOption[] $VALUES;
        public static final ContactOption CHAT;
        public static final ContactOption EMAIL;
        public static final ContactOption PHONE;

        static {
            ContactOption contactOption = new ContactOption("CHAT", 0);
            CHAT = contactOption;
            ContactOption contactOption2 = new ContactOption("PHONE", 1);
            PHONE = contactOption2;
            ContactOption contactOption3 = new ContactOption("EMAIL", 2);
            EMAIL = contactOption3;
            $VALUES = new ContactOption[]{contactOption, contactOption2, contactOption3};
        }

        public static ContactOption valueOf(String str) {
            return (ContactOption) Enum.valueOf(ContactOption.class, str);
        }

        public static ContactOption[] values() {
            return (ContactOption[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Glyph {
        public static final /* synthetic */ Glyph[] $VALUES;
        public static final Glyph ADD;
        public static final Glyph AFTERPAY;
        public static final Glyph BITCOIN;
        public static final Glyph BOOST;
        public static final Glyph BORROW;
        public static final Glyph BUSINESS_ACCOUNT;
        public static final Glyph CARD;
        public static final Glyph DEFAULT;
        public static final Glyph DEPOSIT;
        public static final Glyph INFO;
        public static final Glyph INVESTING;
        public static final Glyph LIMITS;
        public static final Glyph PAYMENT_PLAN;
        public static final Glyph PAY_WITH_CASH;
        public static final Glyph PEOPLE;
        public static final Glyph PERSONAL;
        public static final Glyph SAVINGS;
        public static final Glyph STAR;
        public static final Glyph TAXES;
        public static final Glyph UNSPECIFIED;
        public static final Glyph WITHDRAW;

        static {
            Glyph glyph = new Glyph("CARD", 0);
            CARD = glyph;
            Glyph glyph2 = new Glyph("BITCOIN", 1);
            BITCOIN = glyph2;
            Glyph glyph3 = new Glyph("INVESTING", 2);
            INVESTING = glyph3;
            Glyph glyph4 = new Glyph("STAR", 3);
            STAR = glyph4;
            Glyph glyph5 = new Glyph("DEPOSIT", 4);
            DEPOSIT = glyph5;
            Glyph glyph6 = new Glyph("LIMITS", 5);
            LIMITS = glyph6;
            Glyph glyph7 = new Glyph("PERSONAL", 6);
            PERSONAL = glyph7;
            Glyph glyph8 = new Glyph("BOOST", 7);
            BOOST = glyph8;
            Glyph glyph9 = new Glyph("BORROW", 8);
            BORROW = glyph9;
            Glyph glyph10 = new Glyph("PAY_WITH_CASH", 9);
            PAY_WITH_CASH = glyph10;
            Glyph glyph11 = new Glyph("BUSINESS_ACCOUNT", 10);
            BUSINESS_ACCOUNT = glyph11;
            Glyph glyph12 = new Glyph("TAXES", 11);
            TAXES = glyph12;
            Glyph glyph13 = new Glyph("ADD", 12);
            ADD = glyph13;
            Glyph glyph14 = new Glyph("WITHDRAW", 13);
            WITHDRAW = glyph14;
            Glyph glyph15 = new Glyph("PEOPLE", 14);
            PEOPLE = glyph15;
            Glyph glyph16 = new Glyph("DEFAULT", 15);
            DEFAULT = glyph16;
            Glyph glyph17 = new Glyph("INFO", 16);
            INFO = glyph17;
            Glyph glyph18 = new Glyph("PAYMENT_PLAN", 17);
            PAYMENT_PLAN = glyph18;
            Glyph glyph19 = new Glyph("SAVINGS", 18);
            SAVINGS = glyph19;
            Glyph glyph20 = new Glyph("AFTERPAY", 19);
            AFTERPAY = glyph20;
            Glyph glyph21 = new Glyph("UNSPECIFIED", 20);
            UNSPECIFIED = glyph21;
            $VALUES = new Glyph[]{glyph, glyph2, glyph3, glyph4, glyph5, glyph6, glyph7, glyph8, glyph9, glyph10, glyph11, glyph12, glyph13, glyph14, glyph15, glyph16, glyph17, glyph18, glyph19, glyph20, glyph21};
        }

        public static Glyph valueOf(String str) {
            return (Glyph) Enum.valueOf(Glyph.class, str);
        }

        public static Glyph[] values() {
            return (Glyph[]) $VALUES.clone();
        }
    }

    public final class Icon {
        public final Color color;
        public final Glyph glyph;

        public Icon(Glyph glyph, Color color) {
            this.glyph = glyph;
            this.color = color;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) obj;
            return this.glyph == icon.glyph && this.color == icon.color;
        }

        public final int hashCode() {
            return this.color.hashCode() + (this.glyph.hashCode() * 31);
        }

        public final String toString() {
            return "Icon(glyph=" + this.glyph + ", color=" + this.color + ")";
        }
    }

    public Article(String str, String str2, Icon icon, List list, Link link, int i) {
        this("token-1", str, str2, "", "This is a test article", (i & 32) != 0 ? Appearance.ARTICLE : Appearance.ISSUE, true, false, true, (i & 512) != 0 ? null : icon, EmptyList.INSTANCE, list, (i & 4096) != 0 ? null : link);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Article)) {
            return false;
        }
        Article article = (Article) obj;
        return Intrinsics.areEqual(this.token, article.token) && Intrinsics.areEqual(this.title, article.title) && Intrinsics.areEqual(this.htmlBody, article.htmlBody) && Intrinsics.areEqual(this.language, article.language) && Intrinsics.areEqual(this.previewText, article.previewText) && this.appearance == article.appearance && this.includeInRecentlyViewed == article.includeInRecentlyViewed && this.selectPaymentForCaseCreation == article.selectPaymentForCaseCreation && this.includeIssueDescription == article.includeIssueDescription && Intrinsics.areEqual(this.icon, article.icon) && Intrinsics.areEqual(this.contactOptions, article.contactOptions) && Intrinsics.areEqual(this.links, article.links) && Intrinsics.areEqual(this.callToAction, article.callToAction);
    }

    public final String getHtmlBody() {
        return this.htmlBody;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.title), 31, this.htmlBody), 31, this.language);
        String str = this.previewText;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.appearance.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.includeInRecentlyViewed), 31, this.selectPaymentForCaseCreation), 31, this.includeIssueDescription);
        Icon icon = this.icon;
        int m3 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((m2 + (icon == null ? 0 : icon.hashCode())) * 31, 31, this.contactOptions), 31, this.links);
        Link link = this.callToAction;
        return m3 + (link != null ? link.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Article(token=", this.token, ", title=", this.title, ", htmlBody=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.htmlBody, ", language=", this.language, ", previewText=");
        m.append(this.previewText);
        m.append(", appearance=");
        m.append(this.appearance);
        m.append(", includeInRecentlyViewed=");
        re$$ExternalSyntheticOutline0.m(m, this.includeInRecentlyViewed, ", selectPaymentForCaseCreation=", this.selectPaymentForCaseCreation, ", includeIssueDescription=");
        m.append(this.includeIssueDescription);
        m.append(", icon=");
        m.append(this.icon);
        m.append(", contactOptions=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.contactOptions, ", links=", this.links, ", callToAction=");
        m.append(this.callToAction);
        m.append(")");
        return m.toString();
    }

    public Article(String str, String str2, String str3, String str4, String str5, Appearance appearance, boolean z, boolean z2, boolean z3, Icon icon, List list, List list2, Link link) {
        str.getClass();
        appearance.getClass();
        list.getClass();
        list2.getClass();
        this.token = str;
        this.title = str2;
        this.htmlBody = str3;
        this.language = str4;
        this.previewText = str5;
        this.appearance = appearance;
        this.includeInRecentlyViewed = z;
        this.selectPaymentForCaseCreation = z2;
        this.includeIssueDescription = z3;
        this.icon = icon;
        this.contactOptions = list;
        this.links = list2;
        this.callToAction = link;
    }
}
