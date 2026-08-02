package com.stripe.android.model;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.stripe.android.core.model.serializers.EnumIgnoreUnknownSerializer;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000f\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u0003J\u0006\u0010\u000b\u001a\u00020\u0003J\u0006\u0010\f\u001a\u00020\u0003J\u0006\u0010\r\u001a\u00020\u0003J\u0006\u0010\u000e\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/LinkBrand;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Link", "Onelink", "brandName", "baseUrl", "termsUrl", "privacyUrl", "achAuthorizationTermsUrl", "Serializer", "Companion", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Serializable(with = Serializer.class)
/* loaded from: classes8.dex */
public final class LinkBrand {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LinkBrand[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @SerialName("link")
    public static final LinkBrand Link = new LinkBrand("Link", 0, "link");

    @SerialName("onelink")
    public static final LinkBrand Onelink = new LinkBrand("Onelink", 1, "onelink");
    private final String value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/LinkBrand$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/LinkBrand;", "serializer", "()Lkotlinx/serialization/KSerializer;", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer serializer() {
            return Serializer.INSTANCE;
        }
    }

    public final class Serializer extends EnumIgnoreUnknownSerializer {
        public static final Serializer INSTANCE = new Serializer((Enum[]) LinkBrand.getEntries().toArray(new LinkBrand[0]), LinkBrand.Link);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkBrand.values().length];
            try {
                iArr[LinkBrand.Link.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinkBrand.Onelink.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ LinkBrand[] $values() {
        return new LinkBrand[]{Link, Onelink};
    }

    static {
        LinkBrand[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion();
    }

    private LinkBrand(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static LinkBrand valueOf(String str) {
        return (LinkBrand) Enum.valueOf(LinkBrand.class, str);
    }

    public static LinkBrand[] values() {
        return (LinkBrand[]) $VALUES.clone();
    }

    public final String achAuthorizationTermsUrl() {
        return Recorder$$ExternalSyntheticOutline2.m$1(baseUrl(), "/terms/ach-authorization");
    }

    public final String baseUrl() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "https://link.com";
        }
        if (i == 2) {
            return "https://onelink.com";
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public final String brandName() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "Link";
        }
        if (i == 2) {
            return "Onelink";
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public final String getValue() {
        return this.value;
    }

    public final String privacyUrl() {
        return Recorder$$ExternalSyntheticOutline2.m$1(baseUrl(), "/privacy");
    }

    public final String termsUrl() {
        return Recorder$$ExternalSyntheticOutline2.m$1(baseUrl(), "/terms");
    }
}
