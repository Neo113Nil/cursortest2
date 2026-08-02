package kotlin.reflect.full;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.base.Splitter;
import com.google.crypto.tink.HybridDecrypt;
import com.google.crypto.tink.KeyStatus;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.hybrid.HybridPrivateKey;
import com.google.crypto.tink.hybrid.internal.WrappedHybridDecrypt$HybridDecryptWithId;
import com.google.crypto.tink.hybrid.internal.WrappedHybridDecrypt$WrappedHybridDecryptImpl;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.PrefixMap;
import com.google.crypto.tink.internal.PrimitiveRegistry$$ExternalSyntheticLambda0;
import com.google.crypto.tink.util.Bytes;
import com.google.mlkit.common.internal.zzd;
import com.nimbusds.jose.util.X509CertChainUtils;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Icon;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.KTypeParameterImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.SystemPropertiesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.types.AbstractKType;
import kotlin.reflect.jvm.internal.types.DescriptorKType;
import kotlin.reflect.jvm.internal.types.SimpleKType;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public abstract class KClassifiers {
    public static final GrowToolsManagerViewModel.Loaded.Header.Target.GrowToolsAvatar.DefaultAvatar bitcoinAvatar() {
        zzd zzdVar = Icons.Companion;
        return new GrowToolsManagerViewModel.Loaded.Header.Target.GrowToolsAvatar.DefaultAvatar(new StackedAvatarViewModel.Avatar(null, null, null, null, null, new Icon("FF9MIq"), null, ColorModel.Bitcoin.INSTANCE, false, false, null, false, null, null, 130015));
    }

    public static final void checkArgumentsSize(int i, int i2) {
        if (i == i2) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m(i, i2, "Class declares ", " type parameters, but ", " were provided."));
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.crypto.tink.hybrid.internal.WrappedHybridDecrypt$WrappedHybridDecryptImpl] */
    public static WrappedHybridDecrypt$WrappedHybridDecryptImpl create(KeysetHandle keysetHandle, PrimitiveRegistry$$ExternalSyntheticLambda0 primitiveRegistry$$ExternalSyntheticLambda0) {
        Bytes outputPrefix;
        List arrayList;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < ((List) keysetHandle.entries).size(); i++) {
            KeysetHandle.Entry at = keysetHandle.getAt(i);
            if (at.keyStatus.equals(KeyStatus.ENABLED)) {
                HybridDecrypt hybridDecrypt = (HybridDecrypt) primitiveRegistry$$ExternalSyntheticLambda0.create(at);
                TransactorKt key = at.getKey();
                if (key instanceof HybridPrivateKey) {
                    outputPrefix = ((HybridPrivateKey) key).mo2034getPublicKey().getOutputPrefix();
                } else {
                    if (!(key instanceof LegacyProtoKey)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + key.getClass().getName() + " with parameters " + key.getParameters());
                    }
                    outputPrefix = ((LegacyProtoKey) key).getOutputPrefix();
                }
                WrappedHybridDecrypt$HybridDecryptWithId wrappedHybridDecrypt$HybridDecryptWithId = new WrappedHybridDecrypt$HybridDecryptWithId(hybridDecrypt, at.id);
                byte[] bArr = outputPrefix.data;
                if (bArr.length != 0 && bArr.length != 5) {
                    a$$ExternalSyntheticBUOutline0.m$6("PrefixMap only supports 0 and 5 byte prefixes");
                    return null;
                }
                if (hashMap.containsKey(outputPrefix)) {
                    arrayList = (List) hashMap.get(outputPrefix);
                } else {
                    arrayList = new ArrayList();
                    hashMap.put(outputPrefix, arrayList);
                }
                arrayList.add(wrappedHybridDecrypt$HybridDecryptWithId);
            }
        }
        keysetHandle.getAnnotationsOrNull();
        final PrefixMap prefixMap = new PrefixMap(hashMap);
        return new HybridDecrypt(prefixMap) { // from class: com.google.crypto.tink.hybrid.internal.WrappedHybridDecrypt$WrappedHybridDecryptImpl
            public final PrefixMap allHybridDecrypts;

            {
                this.allHybridDecrypts = prefixMap;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v1, types: [com.google.common.base.Splitter$5] */
            @Override // com.google.crypto.tink.HybridDecrypt
            public final byte[] decrypt(byte[] bArr2, byte[] bArr3) {
                List list;
                HashMap hashMap2 = this.allHybridDecrypts.entries;
                List list2 = (List) hashMap2.get(PrefixMap.EMPTY_BYTES);
                if (bArr2.length >= 5) {
                    list = (List) hashMap2.get(new Bytes(bArr2, 5 > bArr2.length ? bArr2.length : 5));
                } else {
                    list = null;
                }
                if (list2 == null && list == null) {
                    list2 = new ArrayList();
                } else if (list2 == null) {
                    list2 = list;
                } else if (list != null) {
                    list2 = new Splitter.AnonymousClass5(list, list2);
                }
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    try {
                        return ((WrappedHybridDecrypt$HybridDecryptWithId) it.next()).hybridDecrypt.decrypt(bArr2, bArr3);
                    } catch (GeneralSecurityException unused) {
                    }
                }
                a$$ExternalSyntheticBUOutline0.m$6("decryption failed");
                return null;
            }
        };
    }

    public static final AbstractKType createType(KClassifier kClassifier, List list, boolean z, List list2) {
        kClassifier.getClass();
        list.getClass();
        list2.getClass();
        return createTypeImpl(kClassifier, list, z, list2, null);
    }

    public static AbstractKType createType$default(KClassifier kClassifier, ArrayList arrayList, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = EmptyList.INSTANCE;
        }
        return createType(kClassifier, list, false, EmptyList.INSTANCE);
    }

    public static final AbstractKType createTypeImpl(KClassifier kClassifier, List list, boolean z, List list2, KClass kClass) {
        ClassifierDescriptor classifierDescriptor;
        TypeProjectionBase starProjectionImpl;
        kClassifier.getClass();
        list.getClass();
        list2.getClass();
        if (!SystemPropertiesKt.useK1Implementation) {
            KClass kClass2 = kClassifier instanceof KClass ? (KClass) kClassifier : null;
            List allTypeParameters = kClass2 != null ? X509CertChainUtils.allTypeParameters(kClass2) : null;
            if (allTypeParameters == null) {
                allTypeParameters = EmptyList.INSTANCE;
            }
            checkArgumentsSize(allTypeParameters.size(), list.size());
            return new SimpleKType(kClassifier, list, z, list2, null, false, false, false, kClass, null);
        }
        if (kClassifier instanceof KClassImpl) {
            classifierDescriptor = ((KClassImpl) kClassifier).getDescriptor();
        } else {
            if (!(kClassifier instanceof KTypeParameterImpl)) {
                StringBuilder sb = new StringBuilder("Cannot create type for an unsupported classifier: ");
                sb.append(kClassifier);
                Class<?> cls = kClassifier.getClass();
                sb.append(" (");
                sb.append(cls);
                sb.append(')');
                throw new KotlinReflectionInternalError(sb.toString());
            }
            KTypeParameterImpl kTypeParameterImpl = (KTypeParameterImpl) kClassifier;
            TypeParameterDescriptor typeParameterDescriptor = kTypeParameterImpl._descriptor;
            if (typeParameterDescriptor == null) {
                Path$$ExternalSyntheticBUOutline0.m$1(kTypeParameterImpl, "Descriptor-less type parameter: ");
                return null;
            }
            classifierDescriptor = typeParameterDescriptor;
        }
        checkArgumentsSize(classifierDescriptor.getTypeConstructor().getParameters().size(), list.size());
        TypeConstructor typeConstructor = classifierDescriptor.getTypeConstructor();
        typeConstructor.getClass();
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        parameters.getClass();
        TypeAttributes empty = TypeAttributes.Companion.getEmpty();
        List list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        int i = 0;
        for (Object obj : list3) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            KTypeProjection kTypeProjection = (KTypeProjection) obj;
            DescriptorKType descriptorKType = (DescriptorKType) kTypeProjection.f1521type;
            KotlinType kotlinType = descriptorKType != null ? descriptorKType.f1540type : null;
            KVariance kVariance = kTypeProjection.variance;
            int i3 = kVariance == null ? -1 : K1ImplementationKt$WhenMappings.$EnumSwitchMapping$0[kVariance.ordinal()];
            if (i3 == -1) {
                TypeParameterDescriptor typeParameterDescriptor2 = parameters.get(i);
                typeParameterDescriptor2.getClass();
                starProjectionImpl = new StarProjectionImpl(typeParameterDescriptor2);
            } else if (i3 == 1) {
                Variance variance = Variance.INVARIANT;
                kotlinType.getClass();
                starProjectionImpl = new TypeProjectionImpl(variance, kotlinType);
            } else if (i3 == 2) {
                Variance variance2 = Variance.IN_VARIANCE;
                kotlinType.getClass();
                starProjectionImpl = new TypeProjectionImpl(variance2, kotlinType);
            } else {
                if (i3 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                Variance variance3 = Variance.OUT_VARIANCE;
                kotlinType.getClass();
                starProjectionImpl = new TypeProjectionImpl(variance3, kotlinType);
            }
            arrayList.add(starProjectionImpl);
            i = i2;
        }
        return new DescriptorKType(KotlinTypeFactory.simpleType$default(empty, typeConstructor, arrayList, z, (KotlinTypeRefiner) null, 16, (Object) null), null);
    }
}
