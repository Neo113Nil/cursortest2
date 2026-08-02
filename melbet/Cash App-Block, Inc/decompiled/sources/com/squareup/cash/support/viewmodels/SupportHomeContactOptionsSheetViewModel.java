package com.squareup.cash.support.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SupportHomeContactOptionsSheetViewModel {
    public final ArrayList contactOptions;

    public final class ContactOption {
        public final boolean enabled;
        public final boolean hasNotificationBadge;
        public final String subtitle;
        public final String title;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1209type;

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

        public ContactOption(String str, String str2, Type type2, boolean z, boolean z2) {
            str.getClass();
            this.title = str;
            this.subtitle = str2;
            this.f1209type = type2;
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
            return Intrinsics.areEqual(this.title, contactOption.title) && Intrinsics.areEqual(this.subtitle, contactOption.subtitle) && this.f1209type == contactOption.f1209type && this.enabled == contactOption.enabled && this.hasNotificationBadge == contactOption.hasNotificationBadge;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            return Boolean.hashCode(this.hasNotificationBadge) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.f1209type.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.enabled);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ContactOption(title=", this.title, ", subtitle=", this.subtitle, ", type=");
            m.append(this.f1209type);
            m.append(", enabled=");
            m.append(this.enabled);
            m.append(", hasNotificationBadge=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.hasNotificationBadge, ")");
        }
    }

    public SupportHomeContactOptionsSheetViewModel(ArrayList arrayList) {
        this.contactOptions = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SupportHomeContactOptionsSheetViewModel) && this.contactOptions.equals(((SupportHomeContactOptionsSheetViewModel) obj).contactOptions);
    }

    public final int hashCode() {
        return this.contactOptions.hashCode();
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("SupportHomeContactOptionsSheetViewModel(contactOptions=", ")", this.contactOptions);
    }
}
