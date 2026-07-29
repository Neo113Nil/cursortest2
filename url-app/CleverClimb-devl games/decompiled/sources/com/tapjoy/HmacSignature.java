package com.tapjoy;

import android.net.Uri;
import com.mopub.common.Constants;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class HmacSignature {

    /* renamed from: a, reason: collision with root package name */
    private String f7587a;

    /* renamed from: b, reason: collision with root package name */
    private String f7588b;

    public HmacSignature(String str, String str2) {
        this.f7587a = str;
        this.f7588b = str2;
    }

    public String sign(String str, Map map) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f7588b.getBytes(), this.f7587a);
            Mac mac = Mac.getInstance(this.f7587a);
            mac.init(secretKeySpec);
            Uri parse = Uri.parse(str);
            String str2 = parse.getScheme() + "://" + parse.getHost();
            if (!((parse.getScheme().equals(Constants.HTTP) && parse.getPort() == 80) || (parse.getScheme().equals(Constants.HTTPS) && parse.getPort() == 443)) && -1 != parse.getPort()) {
                str2 = str2 + ":" + parse.getPort();
            }
            String str3 = "POST&" + Uri.encode(str2.toLowerCase() + parse.getPath()) + "&" + Uri.encode(a(map));
            TapjoyLog.v("HmacSignature", "Base Url: " + str3);
            byte[] doFinal = mac.doFinal(str3.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b2 : doFinal) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean matches(String str, Map map, String str2) {
        return sign(str, map).equals(str2);
    }

    private static String a(Map map) {
        TreeSet treeSet = new TreeSet(map.keySet());
        StringBuilder sb = new StringBuilder();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append(str + "=" + ((String) map.get(str)) + "&");
        }
        sb.deleteCharAt(sb.lastIndexOf("&"));
        TapjoyLog.v("HmacSignature", "Unhashed String: " + sb.toString());
        return sb.toString();
    }
}
