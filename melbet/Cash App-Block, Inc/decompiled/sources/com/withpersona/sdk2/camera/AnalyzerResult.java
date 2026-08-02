package com.withpersona.sdk2.camera;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AnalyzerResult {
    public final boolean isActiveAnalyzer;
    public final Object result;

    public AnalyzerResult(Object obj, boolean z) {
        this.result = obj;
        this.isActiveAnalyzer = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyzerResult)) {
            return false;
        }
        AnalyzerResult analyzerResult = (AnalyzerResult) obj;
        Object obj2 = analyzerResult.result;
        Result.Companion companion = Result.Companion;
        return Intrinsics.areEqual(this.result, obj2) && this.isActiveAnalyzer == analyzerResult.isActiveAnalyzer;
    }

    public final int hashCode() {
        Result.Companion companion = Result.Companion;
        Object obj = this.result;
        return Boolean.hashCode(this.isActiveAnalyzer) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("AnalyzerResult(result=", Result.m4121toStringimpl(this.result), ", isActiveAnalyzer=", ")", this.isActiveAnalyzer);
    }
}
