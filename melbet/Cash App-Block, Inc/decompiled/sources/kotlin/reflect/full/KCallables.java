package kotlin.reflect.full;

import android.content.SharedPreferences;
import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.dynamite.zzo;
import com.google.crypto.tink.hybrid.HpkeParameters;
import com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf;
import com.google.crypto.tink.hybrid.internal.HpkeAead;
import com.google.crypto.tink.subtle.EllipticCurves$CurveType;
import com.google.mlkit.vision.text.zza;
import com.google.zxing.Result;
import com.squareup.cash.db.EnumListAdapter$encode$1;
import com.squareup.cash.growtools.presenters.manager.state.RealGrowToolsManagerViewAppearanceTracker;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda0;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.SharedPreferencesKeyValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.KCallable;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.jvm.internal.ReflectKParameter;

/* loaded from: classes4.dex */
public abstract class KCallables {
    public static HpkeAead createAead(HpkeParameters.AeadId aeadId) {
        if (aeadId == HpkeParameters.AeadId.AES_128_GCM) {
            return new zzo(16);
        }
        if (aeadId == HpkeParameters.AeadId.AES_256_GCM) {
            return new zzo(32);
        }
        if (aeadId == HpkeParameters.AeadId.CHACHA20_POLY1305) {
            return new zza(9);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Unrecognized HPKE AEAD identifier");
        return null;
    }

    public static HkdfHpkeKdf createKdf(HpkeParameters.KdfId kdfId) {
        if (kdfId == HpkeParameters.KdfId.HKDF_SHA256) {
            return new HkdfHpkeKdf("HmacSha256");
        }
        if (kdfId == HpkeParameters.KdfId.HKDF_SHA384) {
            return new HkdfHpkeKdf("HmacSha384");
        }
        if (kdfId == HpkeParameters.KdfId.HKDF_SHA512) {
            return new HkdfHpkeKdf("HmacSha512");
        }
        a$$ExternalSyntheticBUOutline0.m$3("Unrecognized HPKE KDF identifier");
        return null;
    }

    public static Result createKem(HpkeParameters.KemId kemId) {
        if (kemId == HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256) {
            return new Result(new HkdfHpkeKdf("HmacSha256"));
        }
        if (kemId == HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256) {
            return Result.fromCurve(EllipticCurves$CurveType.NIST_P256);
        }
        if (kemId == HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384) {
            return Result.fromCurve(EllipticCurves$CurveType.NIST_P384);
        }
        if (kemId == HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512) {
            return Result.fromCurve(EllipticCurves$CurveType.NIST_P521);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Unrecognized HPKE KEM identifier");
        return null;
    }

    public static final ArrayList getValueParameters(KCallable kCallable) {
        kCallable.getClass();
        List parameters = kCallable.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((ReflectKParameter) obj).getKind() == KParameter$Kind.VALUE) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static SharedPreferencesKeyValue provideTracker(SharedPreferences sharedPreferences) {
        KeyValue.OnDeserializationFailure onDeserializationFailure = KeyValue.OnDeserializationFailure.Delete;
        RealGrowToolsManagerViewAppearanceTracker.Companion companion = RealGrowToolsManagerViewAppearanceTracker.Companion;
        return Room.SerDeKeyValue$default(sharedPreferences, "grow_tools_manager_view_tracker", new EnumListAdapter$encode$1(1, companion, RealGrowToolsManagerViewAppearanceTracker.Companion.class, "deserialize", "deserialize(Ljava/lang/String;)Ljava/util/Map;", 0, 10), new EnumListAdapter$encode$1(1, companion, RealGrowToolsManagerViewAppearanceTracker.Companion.class, "serialize", "serialize(Ljava/util/Map;)Ljava/lang/String;", 0, 11), new ClusterItemKt$$ExternalSyntheticLambda0(9), 64);
    }
}
