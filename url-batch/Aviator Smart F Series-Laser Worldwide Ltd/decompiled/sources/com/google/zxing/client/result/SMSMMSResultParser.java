package com.google.zxing.client.result;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.zxing.Result;
import com.just.agentweb.DefaultWebClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes4.dex */
public final class SMSMMSResultParser extends ResultParser {
    private static void addNumberVia(Collection<String> collection, Collection<String> collection2, String str) {
        int indexOf = str.indexOf(59);
        if (indexOf < 0) {
            collection.add(str);
            collection2.add(null);
        } else {
            collection.add(str.substring(0, indexOf));
            String substring = str.substring(indexOf + 1);
            collection2.add(substring.startsWith("via=") ? substring.substring(4) : null);
        }
    }

    @Override // com.google.zxing.client.result.ResultParser
    public SMSParsedResult parse(Result result) {
        boolean z7;
        String str;
        String massagedText = ResultParser.getMassagedText(result);
        String str2 = null;
        if (!massagedText.startsWith(DefaultWebClient.SCHEME_SMS) && !massagedText.startsWith("SMS:") && !massagedText.startsWith("mms:") && !massagedText.startsWith("MMS:")) {
            return null;
        }
        Map<String, String> parseNameValuePairs = ResultParser.parseNameValuePairs(massagedText);
        if (parseNameValuePairs == null || parseNameValuePairs.isEmpty()) {
            z7 = false;
            str = null;
        } else {
            str2 = parseNameValuePairs.get("subject");
            str = parseNameValuePairs.get(TtmlNode.TAG_BODY);
            z7 = true;
        }
        int indexOf = massagedText.indexOf(63, 4);
        String substring = (indexOf < 0 || !z7) ? massagedText.substring(4) : massagedText.substring(4, indexOf);
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        int i8 = -1;
        while (true) {
            int i9 = i8 + 1;
            int indexOf2 = substring.indexOf(44, i9);
            if (indexOf2 <= i8) {
                addNumberVia(arrayList, arrayList2, substring.substring(i9));
                return new SMSParsedResult((String[]) arrayList.toArray(new String[arrayList.size()]), (String[]) arrayList2.toArray(new String[arrayList2.size()]), str2, str);
            }
            addNumberVia(arrayList, arrayList2, substring.substring(i9, indexOf2));
            i8 = indexOf2;
        }
    }
}
