package io.appmetrica.analytics.idsync.impl;

import com.facebook.react.uimanager.ViewProps;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class z {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return ViewProps.NONE;
        }
        if (i == 2) {
            return "success";
        }
        if (i == 3) {
            return "incompatible_precondition";
        }
        if (i == 4) {
            return "failure";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? AbstractJsonLexerKt.NULL : "FAILURE" : "INCOMPATIBLE_PRECONDITION" : "SUCCESS" : "NONE";
    }
}
