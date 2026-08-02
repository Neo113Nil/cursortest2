package com.squareup.preferences.values;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/preferences/values/MoneyTabCardIntroState;", "", "preferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MoneyTabCardIntroState {
    public final boolean showIntroDialog;

    public /* synthetic */ MoneyTabCardIntroState(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoneyTabCardIntroState) && this.showIntroDialog == ((MoneyTabCardIntroState) obj).showIntroDialog;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.showIntroDialog);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("MoneyTabCardIntroState(showIntroDialog=", ")", this.showIntroDialog);
    }

    public MoneyTabCardIntroState(boolean z) {
        this.showIntroDialog = z;
    }
}
