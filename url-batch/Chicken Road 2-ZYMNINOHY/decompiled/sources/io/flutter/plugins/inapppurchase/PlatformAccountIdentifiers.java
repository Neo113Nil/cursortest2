package io.flutter.plugins.inapppurchase;

import d3.j;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlatformAccountIdentifiers {
    public static final Companion Companion = new Companion(null);
    private final String obfuscatedAccountId;
    private final String obfuscatedProfileId;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformAccountIdentifiers fromList(List<? extends Object> pigeonVar_list) {
            i.e(pigeonVar_list, "pigeonVar_list");
            return new PlatformAccountIdentifiers((String) pigeonVar_list.get(0), (String) pigeonVar_list.get(1));
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlatformAccountIdentifiers() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PlatformAccountIdentifiers copy$default(PlatformAccountIdentifiers platformAccountIdentifiers, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = platformAccountIdentifiers.obfuscatedAccountId;
        }
        if ((i4 & 2) != 0) {
            str2 = platformAccountIdentifiers.obfuscatedProfileId;
        }
        return platformAccountIdentifiers.copy(str, str2);
    }

    public final String component1() {
        return this.obfuscatedAccountId;
    }

    public final String component2() {
        return this.obfuscatedProfileId;
    }

    public final PlatformAccountIdentifiers copy(String str, String str2) {
        return new PlatformAccountIdentifiers(str, str2);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(PlatformAccountIdentifiers.class)) {
            if (this == obj) {
                return true;
            }
            PlatformAccountIdentifiers platformAccountIdentifiers = (PlatformAccountIdentifiers) obj;
            MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
            if (messagesPigeonUtils.deepEquals(this.obfuscatedAccountId, platformAccountIdentifiers.obfuscatedAccountId) && messagesPigeonUtils.deepEquals(this.obfuscatedProfileId, platformAccountIdentifiers.obfuscatedProfileId)) {
                return true;
            }
        }
        return false;
    }

    public final String getObfuscatedAccountId() {
        return this.obfuscatedAccountId;
    }

    public final String getObfuscatedProfileId() {
        return this.obfuscatedProfileId;
    }

    public int hashCode() {
        int hashCode = PlatformAccountIdentifiers.class.hashCode() * 31;
        MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
        return ((hashCode + messagesPigeonUtils.deepHash(this.obfuscatedAccountId)) * 31) + messagesPigeonUtils.deepHash(this.obfuscatedProfileId);
    }

    public final List<Object> toList() {
        return j.W(this.obfuscatedAccountId, this.obfuscatedProfileId);
    }

    public String toString() {
        return "PlatformAccountIdentifiers(obfuscatedAccountId=" + this.obfuscatedAccountId + ", obfuscatedProfileId=" + this.obfuscatedProfileId + ")";
    }

    public PlatformAccountIdentifiers(String str, String str2) {
        this.obfuscatedAccountId = str;
        this.obfuscatedProfileId = str2;
    }

    public /* synthetic */ PlatformAccountIdentifiers(String str, String str2, int i4, kotlin.jvm.internal.e eVar) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2);
    }
}
