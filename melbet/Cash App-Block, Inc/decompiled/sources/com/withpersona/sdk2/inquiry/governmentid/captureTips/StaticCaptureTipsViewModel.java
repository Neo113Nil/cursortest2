package com.withpersona.sdk2.inquiry.governmentid.captureTips;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class StaticCaptureTipsViewModel implements CaptureTipsViewModel {
    public final NextStep.GovernmentId.AssetConfig.CapturePage iconAsset;
    public final String subtext;
    public final String title;

    public StaticCaptureTipsViewModel(String str, String str2, NextStep.GovernmentId.AssetConfig.CapturePage capturePage) {
        this.title = str;
        this.subtext = str2;
        this.iconAsset = capturePage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StaticCaptureTipsViewModel)) {
            return false;
        }
        StaticCaptureTipsViewModel staticCaptureTipsViewModel = (StaticCaptureTipsViewModel) obj;
        return Intrinsics.areEqual(this.title, staticCaptureTipsViewModel.title) && Intrinsics.areEqual(this.subtext, staticCaptureTipsViewModel.subtext) && Intrinsics.areEqual(this.iconAsset, staticCaptureTipsViewModel.iconAsset);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtext;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        NextStep.GovernmentId.AssetConfig.CapturePage capturePage = this.iconAsset;
        return hashCode2 + (capturePage != null ? capturePage.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StaticCaptureTipsViewModel(title=", this.title, ", subtext=", this.subtext, ", iconAsset=");
        m.append(this.iconAsset);
        m.append(")");
        return m.toString();
    }
}
