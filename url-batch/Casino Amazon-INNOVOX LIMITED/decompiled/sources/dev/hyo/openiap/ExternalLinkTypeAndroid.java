package dev.hyo.openiap;

import com.google.firebase.ktx.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000b\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/ExternalLinkTypeAndroid;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "Unspecified", "LinkToDigitalContentOffer", "LinkToAppDownload", "toJson", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExternalLinkTypeAndroid {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExternalLinkTypeAndroid[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final ExternalLinkTypeAndroid Unspecified = new ExternalLinkTypeAndroid("Unspecified", 0, BuildConfig.VERSION_NAME);
    public static final ExternalLinkTypeAndroid LinkToDigitalContentOffer = new ExternalLinkTypeAndroid("LinkToDigitalContentOffer", 1, "link-to-digital-content-offer");
    public static final ExternalLinkTypeAndroid LinkToAppDownload = new ExternalLinkTypeAndroid("LinkToAppDownload", 2, "link-to-app-download");

    private static final /* synthetic */ ExternalLinkTypeAndroid[] $values() {
        return new ExternalLinkTypeAndroid[]{Unspecified, LinkToDigitalContentOffer, LinkToAppDownload};
    }

    public static EnumEntries<ExternalLinkTypeAndroid> getEntries() {
        return $ENTRIES;
    }

    public static ExternalLinkTypeAndroid valueOf(String str) {
        return (ExternalLinkTypeAndroid) Enum.valueOf(ExternalLinkTypeAndroid.class, str);
    }

    public static ExternalLinkTypeAndroid[] values() {
        return (ExternalLinkTypeAndroid[]) $VALUES.clone();
    }

    private ExternalLinkTypeAndroid(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    static {
        ExternalLinkTypeAndroid[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/ExternalLinkTypeAndroid$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/ExternalLinkTypeAndroid;", "value", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final ExternalLinkTypeAndroid fromJson(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -1626174665:
                    if (value.equals(BuildConfig.VERSION_NAME)) {
                        return ExternalLinkTypeAndroid.Unspecified;
                    }
                    break;
                case -1476112090:
                    if (value.equals("LinkToDigitalContentOffer")) {
                        return ExternalLinkTypeAndroid.LinkToDigitalContentOffer;
                    }
                    break;
                case -826550029:
                    if (value.equals("link-to-app-download")) {
                        return ExternalLinkTypeAndroid.LinkToAppDownload;
                    }
                    break;
                case -111523244:
                    if (value.equals("LinkToAppDownload")) {
                        return ExternalLinkTypeAndroid.LinkToAppDownload;
                    }
                    break;
                case 41693975:
                    if (value.equals("Unspecified")) {
                        return ExternalLinkTypeAndroid.Unspecified;
                    }
                    break;
                case 1913134516:
                    if (value.equals("link-to-digital-content-offer")) {
                        return ExternalLinkTypeAndroid.LinkToDigitalContentOffer;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown ExternalLinkTypeAndroid value: " + value);
        }
    }

    public final String toJson() {
        return this.rawValue;
    }
}
