package com.google.zxing.client.result;

/* loaded from: classes4.dex */
abstract class AbstractDoCoMoResultParser extends ResultParser {
    AbstractDoCoMoResultParser() {
    }

    static String[] matchDoCoMoPrefixedField(String str, String str2, boolean z7) {
        return ResultParser.matchPrefixedField(str, str2, ';', z7);
    }

    static String matchSingleDoCoMoPrefixedField(String str, String str2, boolean z7) {
        return ResultParser.matchSinglePrefixedField(str, str2, ';', z7);
    }
}
