package kotlin.reflect.jvm.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.types.KTypeSubstitutor;

/* loaded from: classes3.dex */
public final class KCallableOverriddenStorage {
    public static final KCallableOverriddenStorage EMPTY = new KCallableOverriddenStorage(null, KTypeSubstitutor.EMPTY, null, false, false, false, false, false);
    public final boolean forceIsExternal;
    public final boolean forceIsInfix;
    public final boolean forceIsInline;
    public final boolean forceIsOperator;
    public final ReceiverParameterDescriptor instanceReceiverParameter;
    public final boolean isFakeOverride;
    public final Modality modality;
    public final KTypeSubstitutor typeSubstitutor;

    public KCallableOverriddenStorage(ReceiverParameterDescriptor receiverParameterDescriptor, KTypeSubstitutor kTypeSubstitutor, Modality modality, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        kTypeSubstitutor.getClass();
        this.instanceReceiverParameter = receiverParameterDescriptor;
        this.typeSubstitutor = kTypeSubstitutor;
        this.modality = modality;
        this.isFakeOverride = z;
        this.forceIsExternal = z2;
        this.forceIsOperator = z3;
        this.forceIsInfix = z4;
        this.forceIsInline = z5;
    }

    public static KCallableOverriddenStorage copy$default(KCallableOverriddenStorage kCallableOverriddenStorage, ReceiverParameterDescriptor receiverParameterDescriptor, KTypeSubstitutor kTypeSubstitutor, Modality modality, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            receiverParameterDescriptor = kCallableOverriddenStorage.instanceReceiverParameter;
        }
        ReceiverParameterDescriptor receiverParameterDescriptor2 = receiverParameterDescriptor;
        if ((i & 2) != 0) {
            kTypeSubstitutor = kCallableOverriddenStorage.typeSubstitutor;
        }
        KTypeSubstitutor kTypeSubstitutor2 = kTypeSubstitutor;
        if ((i & 4) != 0) {
            modality = kCallableOverriddenStorage.modality;
        }
        Modality modality2 = modality;
        boolean z5 = (i & 8) != 0 ? kCallableOverriddenStorage.isFakeOverride : true;
        if ((i & 16) != 0) {
            z = kCallableOverriddenStorage.forceIsExternal;
        }
        boolean z6 = z;
        if ((i & 32) != 0) {
            z2 = kCallableOverriddenStorage.forceIsOperator;
        }
        boolean z7 = z2;
        if ((i & 64) != 0) {
            z3 = kCallableOverriddenStorage.forceIsInfix;
        }
        boolean z8 = z3;
        boolean z9 = (i & 128) != 0 ? kCallableOverriddenStorage.forceIsInline : z4;
        kCallableOverriddenStorage.getClass();
        kTypeSubstitutor2.getClass();
        return new KCallableOverriddenStorage(receiverParameterDescriptor2, kTypeSubstitutor2, modality2, z5, z6, z7, z8, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KCallableOverriddenStorage)) {
            return false;
        }
        KCallableOverriddenStorage kCallableOverriddenStorage = (KCallableOverriddenStorage) obj;
        return Intrinsics.areEqual(this.instanceReceiverParameter, kCallableOverriddenStorage.instanceReceiverParameter) && Intrinsics.areEqual(this.typeSubstitutor, kCallableOverriddenStorage.typeSubstitutor) && this.modality == kCallableOverriddenStorage.modality && this.isFakeOverride == kCallableOverriddenStorage.isFakeOverride && this.forceIsExternal == kCallableOverriddenStorage.forceIsExternal && this.forceIsOperator == kCallableOverriddenStorage.forceIsOperator && this.forceIsInfix == kCallableOverriddenStorage.forceIsInfix && this.forceIsInline == kCallableOverriddenStorage.forceIsInline;
    }

    public final int hashCode() {
        ReceiverParameterDescriptor receiverParameterDescriptor = this.instanceReceiverParameter;
        int hashCode = (this.typeSubstitutor.hashCode() + ((receiverParameterDescriptor == null ? 0 : receiverParameterDescriptor.hashCode()) * 31)) * 31;
        Modality modality = this.modality;
        return Boolean.hashCode(this.forceIsInline) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (modality != null ? modality.hashCode() : 0)) * 31, 31, this.isFakeOverride), 31, this.forceIsExternal), 31, this.forceIsOperator), 31, this.forceIsInfix);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KCallableOverriddenStorage(instanceReceiverParameter=");
        sb.append(this.instanceReceiverParameter);
        sb.append(", typeSubstitutor=");
        sb.append(this.typeSubstitutor);
        sb.append(", modality=");
        sb.append(this.modality);
        sb.append(", isFakeOverride=");
        sb.append(this.isFakeOverride);
        sb.append(", forceIsExternal=");
        sb.append(this.forceIsExternal);
        sb.append(", forceIsOperator=");
        sb.append(this.forceIsOperator);
        sb.append(", forceIsInfix=");
        sb.append(this.forceIsInfix);
        sb.append(", forceIsInline=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.forceIsInline, ')');
    }
}
