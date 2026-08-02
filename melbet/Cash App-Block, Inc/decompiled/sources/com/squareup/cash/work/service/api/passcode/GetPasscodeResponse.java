package com.squareup.cash.work.service.api.passcode;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/squareup/cash/work/service/api/passcode/GetPasscodeResponse;", "", "", "passcode", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/squareup/cash/work/service/api/passcode/GetPasscodeResponse;", "Ljava/lang/String;", "getPasscode", "()Ljava/lang/String;", "getPasscode$annotations", "()V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class GetPasscodeResponse {
    public final String passcode;

    public GetPasscodeResponse(@Json(name = "passcode") String str) {
        this.passcode = str;
    }

    @Json(name = "passcode")
    public static /* synthetic */ void getPasscode$annotations() {
    }

    public final GetPasscodeResponse copy(@Json(name = "passcode") String passcode) {
        return new GetPasscodeResponse(passcode);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetPasscodeResponse) && Intrinsics.areEqual(this.passcode, ((GetPasscodeResponse) obj).passcode);
    }

    public final int hashCode() {
        String str = this.passcode;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GetPasscodeResponse(passcode=", this.passcode, ")");
    }
}
