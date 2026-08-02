package com.squareup.encryption;

import android.content.SharedPreferences;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.HybridDecrypt;
import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.config.GlobalTinkFlags;
import com.google.crypto.tink.hybrid.HybridPrivateKey;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.squareup.contour.ContourLayout$geometry$1;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import papa.internal.LaunchTracker;

/* loaded from: classes.dex */
public final class EllipticCurveEncryptionEngine implements Encryptor {
    public final AtomicReference hasRegistered;
    public final LaunchTracker keyManager;
    public final Lazy keyTemplate$delegate;

    public EllipticCurveEncryptionEngine(SharedPreferences sharedPreferences, String str) {
        str.getClass();
        this.hasRegistered = new AtomicReference(Boolean.FALSE);
        Lazy lazy = LazyKt.lazy(new ContourLayout$geometry$1(this, 16));
        this.keyTemplate$delegate = lazy;
        KeyTemplate keyTemplate = (KeyTemplate) lazy.getValue();
        keyTemplate.getClass();
        this.keyManager = new LaunchTracker(str, sharedPreferences, keyTemplate);
    }

    public final byte[] decrypt(byte[] bArr, byte[] bArr2) {
        KeysetHandle rotateKey;
        bArr.getClass();
        register();
        LaunchTracker launchTracker = this.keyManager;
        launchTracker.getClass();
        try {
            rotateKey = KeysetHandle.fromKeyset(((DecryptingKeysetReader) launchTracker.lastAppBecameInvisibleRealtimeMillis).read());
        } catch (NoSuchElementException unused) {
            rotateKey = launchTracker.rotateKey();
        }
        byte[] decrypt = ((HybridDecrypt) rotateKey.getPrimitive(HybridDecrypt.class)).decrypt(bArr, bArr2);
        decrypt.getClass();
        return decrypt;
    }

    @Override // com.squareup.encryption.Encryptor
    public final byte[] encrypt(byte[] bArr) {
        byte[] encrypt = ((HybridEncrypt) getPublicKey().getPrimitive(HybridEncrypt.class)).encrypt(bArr);
        encrypt.getClass();
        return encrypt;
    }

    public final KeysetHandle getPublicKey() {
        KeysetHandle rotateKey;
        TransactorKt legacyProtoKey;
        boolean z;
        KeysetHandle.Entry entry;
        register();
        LaunchTracker launchTracker = this.keyManager;
        launchTracker.getClass();
        try {
            rotateKey = KeysetHandle.fromKeyset(((DecryptingKeysetReader) launchTracker.lastAppBecameInvisibleRealtimeMillis).read());
        } catch (NoSuchElementException unused) {
            rotateKey = launchTracker.rotateKey();
        }
        Keyset keyset = rotateKey.getKeyset();
        List<KeysetHandle.Entry> list = (List) rotateKey.entries;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (KeysetHandle.Entry entry2 : list) {
            TransactorKt key = entry2.getKey();
            KeyStatusType keyStatusType = entry2.keyStatusType;
            if (key instanceof HybridPrivateKey) {
                TransactorKt publicKey = ((HybridPrivateKey) entry2.getKey()).getPublicKey();
                entry = new KeysetHandle.Entry(publicKey, keyStatusType, entry2.id, entry2.isPrimary, false);
                int i2 = entry2.id;
                Integer idRequirementOrNull = publicKey.getIdRequirementOrNull();
                if (idRequirementOrNull != null && idRequirementOrNull.intValue() != i2) {
                    a$$ExternalSyntheticBUOutline0.m$6("Wrong ID set for key with ID requirement");
                    return null;
                }
            } else {
                Keyset.Key key2 = keyset.getKey(i);
                KeyData keyData = key2.getKeyData();
                if (keyData.getKeyMaterialType() != KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE) {
                    a$$ExternalSyntheticBUOutline0.m$6("The keyset contains a non-private key");
                    return null;
                }
                KeyData publicKeyData = Registry.getPublicKeyData(keyData.getTypeUrl(), keyData.getValue());
                GeneratedMessageLite.Builder builder = (GeneratedMessageLite.Builder) key2.dynamicMethod(5);
                if (!builder.defaultInstance.equals(key2)) {
                    builder.copyOnWrite();
                    GeneratedMessageLite.Builder.mergeFromInstance(builder.instance, key2);
                }
                Keyset.Key.Builder builder2 = (Keyset.Key.Builder) builder;
                builder2.copyOnWrite();
                Keyset.Key.access$100((Keyset.Key) builder2.instance, publicKeyData);
                Keyset.Key key3 = (Keyset.Key) builder2.build();
                try {
                    legacyProtoKey = KeysetHandle.toKey(key3);
                    z = false;
                } catch (GeneralSecurityException e) {
                    if (((AtomicBoolean) GlobalTinkFlags.validateKeysetsOnParsing.delegate).get()) {
                        throw e;
                    }
                    legacyProtoKey = new LegacyProtoKey(KeysetHandle.toProtoKeySerialization(key3));
                    z = true;
                }
                TransactorKt transactorKt = legacyProtoKey;
                int keyId = key3.getKeyId();
                entry = new KeysetHandle.Entry(transactorKt, keyStatusType, keyId, keyId == keyset.getPrimaryKeyId(), z);
            }
            arrayList.add(entry);
            i++;
        }
        KeysetHandle keysetHandle = new KeysetHandle(arrayList, (Map) rotateKey.annotationsMap);
        keysetHandle.getAnnotationsOrNull();
        return keysetHandle;
    }

    public final void register() {
        AtomicReference atomicReference = this.hasRegistered;
        if (((Boolean) atomicReference.get()).booleanValue()) {
            return;
        }
        atomicReference.getAndUpdate(new EllipticCurveEncryptionEngine$$ExternalSyntheticLambda0());
    }
}
