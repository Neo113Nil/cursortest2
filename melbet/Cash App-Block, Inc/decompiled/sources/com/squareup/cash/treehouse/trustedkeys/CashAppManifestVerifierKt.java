package com.squareup.cash.treehouse.trustedkeys;

import androidx.collection.internal.LruHashMap;
import app.cash.zipline.loader.ManifestVerifier;
import app.cash.zipline.loader.SignatureAlgorithmId;
import app.cash.zipline.loader.internal.InternalJniKt;
import java.util.LinkedHashMap;
import kotlin.collections.MapsKt__MapsKt;
import okio.ByteString;

/* loaded from: classes.dex */
public abstract class CashAppManifestVerifierKt {
    public static final ManifestVerifier CASH_APP_MANIFEST_VERIFIER;

    static {
        ByteString.Companion companion = ByteString.Companion;
        ByteString decodeHex = ByteString.Companion.decodeHex("0463e88285b5c8945a054016f17a1d79aacd9611ec7f80a05e6685158904fbb5e8f9d77215033717e1afb68f3a0efbce298f2fa46e2a5ab2adc5fbd15bc029fa45");
        ByteString decodeHex2 = ByteString.Companion.decodeHex("043d2af0ac457da10185593cd7e49c08f30dadd95b50ce97dcdcf54477e19f89816a1df34173037e94138aa5466f7039bb3dafdb3e550c0493674d1044e06aa236");
        ByteString decodeHex3 = ByteString.Companion.decodeHex("04018f2758e44cf24c657cfc69eb8de703a1938f00b26a7b0c54943f75dbbe0b1e722f780862ac23e2f5bd489d486ae0c7cd1a2079ab2ce5ae113493edb25d991f");
        ByteString decodeHex4 = ByteString.Companion.decodeHex("04226983f151866d20c5fbdcd4c6a8f7b4e283f9ca1e48f683e60caa12b1f837f1358a30aa7aefefb5136d5953b1c738e02198709edf4ab238dee61a85b21759e9");
        ByteString decodeHex5 = ByteString.Companion.decodeHex("04bfbc1028a47f63e1295c94cb1ec3b6bff982873db6ec1003b4a474ae5a346ae21e03e7bef82a01a6d6e8e1f1c78bc651fccb73190ad5eba4238b6dd71f89c052");
        ByteString decodeHex6 = ByteString.Companion.decodeHex("04b539ad19024144a09c844629d91e16ecce8b4af1967c42b40c4f23e9fc567ce5a8e18cedda5ee6c4182a8b5776a7a13ed1d984cb75f52535465fa5980555b7fb");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SignatureAlgorithmId[] signatureAlgorithmIdArr = SignatureAlgorithmId.$VALUES;
        linkedHashMap.put("key1", new ManifestVerifier.Verifier(InternalJniKt.ecdsaP256, decodeHex));
        SignatureAlgorithmId[] signatureAlgorithmIdArr2 = SignatureAlgorithmId.$VALUES;
        linkedHashMap.put("key2", new ManifestVerifier.Verifier(InternalJniKt.ecdsaP256, decodeHex2));
        SignatureAlgorithmId[] signatureAlgorithmIdArr3 = SignatureAlgorithmId.$VALUES;
        linkedHashMap.put("key3", new ManifestVerifier.Verifier(InternalJniKt.ecdsaP256, decodeHex3));
        SignatureAlgorithmId[] signatureAlgorithmIdArr4 = SignatureAlgorithmId.$VALUES;
        linkedHashMap.put("key4", new ManifestVerifier.Verifier(InternalJniKt.ecdsaP256, decodeHex4));
        CASH_APP_MANIFEST_VERIFIER = new ManifestVerifier(MapsKt__MapsKt.toMap(linkedHashMap), true);
        LruHashMap lruHashMap = new LruHashMap(2);
        lruHashMap.addEcdsaP256("key1", decodeHex);
        lruHashMap.addEcdsaP256("key2", decodeHex2);
        lruHashMap.addEcdsaP256("key3", decodeHex3);
        lruHashMap.addEcdsaP256("key4", decodeHex4);
        lruHashMap.addEcdsaP256("internalKey1", decodeHex5);
        lruHashMap.addEcdsaP256("internalKey2", decodeHex6);
        new ManifestVerifier(MapsKt__MapsKt.toMap(lruHashMap.map), true);
    }
}
