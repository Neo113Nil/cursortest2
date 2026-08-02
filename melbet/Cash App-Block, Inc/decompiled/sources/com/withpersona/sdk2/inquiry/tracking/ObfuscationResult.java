package com.withpersona.sdk2.inquiry.tracking;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/ObfuscationResult;", "", "encryptedPayload", "", "encryptedKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEncryptedPayload", "()Ljava/lang/String;", "getEncryptedKey", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ObfuscationResult {
    private final String encryptedKey;
    private final String encryptedPayload;

    public ObfuscationResult(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.encryptedPayload = str;
        this.encryptedKey = str2;
    }

    public static /* synthetic */ ObfuscationResult copy$default(ObfuscationResult obfuscationResult, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = obfuscationResult.encryptedPayload;
        }
        if ((i & 2) != 0) {
            str2 = obfuscationResult.encryptedKey;
        }
        return obfuscationResult.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEncryptedPayload() {
        return this.encryptedPayload;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEncryptedKey() {
        return this.encryptedKey;
    }

    public final ObfuscationResult copy(String encryptedPayload, String encryptedKey) {
        encryptedPayload.getClass();
        encryptedKey.getClass();
        return new ObfuscationResult(encryptedPayload, encryptedKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ObfuscationResult)) {
            return false;
        }
        ObfuscationResult obfuscationResult = (ObfuscationResult) other;
        return Intrinsics.areEqual(this.encryptedPayload, obfuscationResult.encryptedPayload) && Intrinsics.areEqual(this.encryptedKey, obfuscationResult.encryptedKey);
    }

    public final String getEncryptedKey() {
        return this.encryptedKey;
    }

    public final String getEncryptedPayload() {
        return this.encryptedPayload;
    }

    public int hashCode() {
        return this.encryptedKey.hashCode() + (this.encryptedPayload.hashCode() * 31);
    }

    public String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("ObfuscationResult(encryptedPayload=", this.encryptedPayload, ", encryptedKey=", this.encryptedKey, ")");
    }
}
