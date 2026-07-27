package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class AFb1qSDK {
    public String AFInAppEventParameterName;
    private byte[] AFInAppEventType;
    String AFKeystoreWrapper;
    public String valueOf;
    public AFf1zSDK values;

    public AFb1qSDK(String str, byte[] bArr, String str2, AFf1zSDK aFf1zSDK) {
        this.valueOf = str;
        this.AFInAppEventType = bArr;
        this.AFKeystoreWrapper = str2;
        this.values = aFf1zSDK;
    }

    public final byte[] AFInAppEventType() {
        return this.AFInAppEventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AFb1qSDK.class == obj.getClass()) {
            AFb1qSDK aFb1qSDK = (AFb1qSDK) obj;
            String str = this.AFKeystoreWrapper;
            if (str == null ? aFb1qSDK.AFKeystoreWrapper != null : !str.equals(aFb1qSDK.AFKeystoreWrapper)) {
                return false;
            }
            if (!Arrays.equals(this.AFInAppEventType, aFb1qSDK.AFInAppEventType)) {
                return false;
            }
            String str2 = this.valueOf;
            if (str2 == null ? aFb1qSDK.valueOf != null : !str2.equals(aFb1qSDK.valueOf)) {
                return false;
            }
            String str3 = this.AFInAppEventParameterName;
            if (str3 == null ? aFb1qSDK.AFInAppEventParameterName != null : !str3.equals(aFb1qSDK.AFInAppEventParameterName)) {
                return false;
            }
            if (this.values == aFb1qSDK.values) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.AFKeystoreWrapper;
        int hashCode = (Arrays.hashCode(this.AFInAppEventType) + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.valueOf;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.AFInAppEventParameterName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AFf1zSDK aFf1zSDK = this.values;
        return hashCode3 + (aFf1zSDK != null ? aFf1zSDK.hashCode() : 0);
    }

    public AFb1qSDK(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        int i2 = 0;
        int i4 = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.valueOf = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.AFKeystoreWrapper = nextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.AFKeystoreWrapper);
                if (matcher.matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                    i4 = Integer.parseInt(matcher.group(2));
                }
            } else if (nextLine.startsWith("data=")) {
                String trim = nextLine.substring(5).trim();
                this.AFInAppEventType = (i2 > 4 || i4 >= 11) ? Base64.decode(trim, 2) : trim.getBytes(Charset.defaultCharset());
            } else if (nextLine.startsWith("type=")) {
                String trim2 = nextLine.substring(5).trim();
                try {
                    this.values = AFf1zSDK.valueOf(trim2);
                } catch (Exception e4) {
                    AFLogger.afErrorLog("CACHE: Unknown task type: ".concat(String.valueOf(trim2)), e4);
                }
            }
        }
        scanner.close();
    }
}
