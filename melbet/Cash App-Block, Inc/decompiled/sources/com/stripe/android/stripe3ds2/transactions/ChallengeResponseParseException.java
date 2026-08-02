package com.stripe.android.stripe3ds2.transactions;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "com/google/android/gms/internal/mlkit_vision_barcode/zzap", "3ds2sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ChallengeResponseParseException extends Exception {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final int code;
    public final String description;
    public final String detail;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChallengeResponseParseException(int i, String str, String str2) {
        super(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(r0, str2, ")"));
        str.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" - ");
        sb.append(str);
        sb.append(" (");
        this.code = i;
        this.description = str;
        this.detail = str2;
    }
}
