package com.withpersona.sdk2.inquiry.shared;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes4.dex */
public final class AdapterHelper$ItemInfo {
    public final AdapterHelper$$ExternalSyntheticLambda0 bindViewHolder;
    public final Function3 inflateFn;
    public final Function1 onViewCreated;
    public final KClass viewBindingClass;
    public final int viewType;

    public AdapterHelper$ItemInfo(int i, KClass kClass, Function3 function3, AdapterHelper$$ExternalSyntheticLambda0 adapterHelper$$ExternalSyntheticLambda0, AdapterHelper$$ExternalSyntheticLambda1 adapterHelper$$ExternalSyntheticLambda1) {
        kClass.getClass();
        this.viewType = i;
        this.viewBindingClass = kClass;
        this.inflateFn = function3;
        this.bindViewHolder = adapterHelper$$ExternalSyntheticLambda0;
        this.onViewCreated = adapterHelper$$ExternalSyntheticLambda1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdapterHelper$ItemInfo) {
            AdapterHelper$ItemInfo adapterHelper$ItemInfo = (AdapterHelper$ItemInfo) obj;
            if (this.viewType == adapterHelper$ItemInfo.viewType && Intrinsics.areEqual(this.viewBindingClass, adapterHelper$ItemInfo.viewBindingClass) && this.inflateFn.equals(adapterHelper$ItemInfo.inflateFn) && this.bindViewHolder == adapterHelper$ItemInfo.bindViewHolder && Intrinsics.areEqual(this.onViewCreated, adapterHelper$ItemInfo.onViewCreated)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.bindViewHolder.hashCode() + Recorder$$ExternalSyntheticOutline1.m(this.inflateFn, (this.viewBindingClass.hashCode() + (Integer.hashCode(this.viewType) * 31)) * 31, 31)) * 31;
        Function1 function1 = this.onViewCreated;
        return hashCode + (function1 == null ? 0 : function1.hashCode());
    }

    public final String toString() {
        return "ItemInfo(viewType=" + this.viewType + ", viewBindingClass=" + this.viewBindingClass + ", inflateFn=" + this.inflateFn + ", bindViewHolder=" + this.bindViewHolder + ", onViewCreated=" + this.onViewCreated + ")";
    }
}
