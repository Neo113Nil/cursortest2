package com.stripe.android.financialconnections.exception;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/stripe/android/financialconnections/exception/WebAuthFlowFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WebAuthFlowFailedException extends Exception {
    public final String reason;

    public WebAuthFlowFailedException(String str, String str2) {
        super(Recorder$$ExternalSyntheticOutline2.m(str2, " ", str));
        this.reason = str;
    }
}
