package kotlin.reflect;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.e;
import com.google.crypto.tink.KeyStatus;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.daead.AesSivKey;
import com.google.crypto.tink.daead.internal.LegacyFullDeterministicAead;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.PrimitiveRegistry$$ExternalSyntheticLambda0;
import com.google.crypto.tink.util.Bytes;
import com.squareup.cash.growtools.presenters.manager.state.GrowToolsManagerState;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class KClasses {
    public static final void cast(KClass kClass, Object obj) {
        kClass.getClass();
        if (kClass.isInstance(obj)) {
            obj.getClass();
            return;
        }
        throw new ClassCastException("Value cannot be cast to " + kClass.getQualifiedName());
    }

    public static LegacyFullDeterministicAead create(KeysetHandle keysetHandle, PrimitiveRegistry$$ExternalSyntheticLambda0 primitiveRegistry$$ExternalSyntheticLambda0) {
        Bytes outputPrefix;
        List list;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < ((List) keysetHandle.entries).size(); i++) {
            KeysetHandle.Entry at = keysetHandle.getAt(i);
            if (at.keyStatus.equals(KeyStatus.ENABLED)) {
                TransactorKt key = at.getKey();
                if (key instanceof AesSivKey) {
                    outputPrefix = ((AesSivKey) key).outputPrefix;
                } else {
                    if (!(key instanceof LegacyProtoKey)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + key.getClass().getName() + " with parameters " + key.getParameters());
                    }
                    outputPrefix = ((LegacyProtoKey) key).getOutputPrefix();
                }
                e eVar = new e();
                byte[] bArr = outputPrefix.data;
                if (bArr.length != 0 && bArr.length != 5) {
                    a$$ExternalSyntheticBUOutline0.m$6("PrefixMap only supports 0 and 5 byte prefixes");
                    return null;
                }
                if (hashMap.containsKey(outputPrefix)) {
                    list = (List) hashMap.get(outputPrefix);
                } else {
                    ArrayList arrayList = new ArrayList();
                    hashMap.put(outputPrefix, arrayList);
                    list = arrayList;
                }
                list.add(eVar);
            }
        }
        keysetHandle.getAnnotationsOrNull();
        keysetHandle.getPrimary$1();
        return new LegacyFullDeterministicAead();
    }

    public static final GrowToolsManagerState rememberManagerState(GapComposer gapComposer) {
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new GrowToolsManagerState();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (GrowToolsManagerState) rememberedValue;
    }
}
