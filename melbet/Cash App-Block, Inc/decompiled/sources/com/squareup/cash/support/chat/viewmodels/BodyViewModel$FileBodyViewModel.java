package com.squareup.cash.support.chat.viewmodels;

import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BodyViewModel$FileBodyViewModel extends ViewModelKt {
    public final boolean chatUiUpliftEnabled;
    public final String description;
    public final String name;
    public final String uri;

    public BodyViewModel$FileBodyViewModel(String str, String str2, String str3, boolean z) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.uri = str;
        this.name = str2;
        this.description = str3;
        this.chatUiUpliftEnabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BodyViewModel$FileBodyViewModel)) {
            return false;
        }
        BodyViewModel$FileBodyViewModel bodyViewModel$FileBodyViewModel = (BodyViewModel$FileBodyViewModel) obj;
        return Intrinsics.areEqual(this.uri, bodyViewModel$FileBodyViewModel.uri) && Intrinsics.areEqual(this.name, bodyViewModel$FileBodyViewModel.name) && Intrinsics.areEqual(this.description, bodyViewModel$FileBodyViewModel.description) && this.chatUiUpliftEnabled == bodyViewModel$FileBodyViewModel.chatUiUpliftEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.chatUiUpliftEnabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.uri.hashCode() * 31, 31, this.name), 31, this.description);
    }

    public final String toString() {
        return re$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FileBodyViewModel(uri=", this.uri, ", name=", this.name, ", description="), this.description, ", chatUiUpliftEnabled=", this.chatUiUpliftEnabled, ")");
    }
}
