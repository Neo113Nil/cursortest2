package androidx.privacysandbox.ads.adservices.topics;

import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: EncryptedTopic.kt */
@ExperimentalFeatures.Ext11OptIn
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/EncryptedTopic;", "", "", "encryptedTopic", "", "keyIdentifier", "encapsulatedKey", "<init>", "([BLjava/lang/String;[B)V", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "[B", "getEncryptedTopic", "()[B", "Ljava/lang/String;", "getKeyIdentifier", "getEncapsulatedKey", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EncryptedTopic {

    /* renamed from: encapsulatedKey, reason: from kotlin metadata and from toString */
    private final byte[] EncapsulatedKey;

    /* renamed from: encryptedTopic, reason: from kotlin metadata and from toString */
    private final byte[] EncryptedTopic;

    /* renamed from: keyIdentifier, reason: from kotlin metadata and from toString */
    private final String KeyIdentifier;

    public EncryptedTopic(byte[] encryptedTopic, String keyIdentifier, byte[] encapsulatedKey) {
        Intrinsics.checkNotNullParameter(encryptedTopic, "encryptedTopic");
        Intrinsics.checkNotNullParameter(keyIdentifier, "keyIdentifier");
        Intrinsics.checkNotNullParameter(encapsulatedKey, "encapsulatedKey");
        this.EncryptedTopic = encryptedTopic;
        this.KeyIdentifier = keyIdentifier;
        this.EncapsulatedKey = encapsulatedKey;
    }

    public String toString() {
        return "EncryptedTopic { " + ("EncryptedTopic=" + StringsKt.decodeToString(this.EncryptedTopic) + ", KeyIdentifier=" + this.KeyIdentifier + ", EncapsulatedKey=" + StringsKt.decodeToString(this.EncapsulatedKey) + " }");
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncryptedTopic)) {
            return false;
        }
        EncryptedTopic encryptedTopic = (EncryptedTopic) other;
        return Arrays.equals(this.EncryptedTopic, encryptedTopic.EncryptedTopic) && this.KeyIdentifier.contentEquals(encryptedTopic.KeyIdentifier) && Arrays.equals(this.EncapsulatedKey, encryptedTopic.EncapsulatedKey);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.EncryptedTopic)), this.KeyIdentifier, Integer.valueOf(Arrays.hashCode(this.EncapsulatedKey)));
    }
}
