package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class AFb1mSDK {
    public String AFInAppEventParameterName;
    private byte[] AFInAppEventType;
    String AFKeystoreWrapper;
    public String valueOf;
    public AFe1eSDK values;

    public AFb1mSDK(String str, byte[] bArr, String str2, AFe1eSDK aFe1eSDK) {
        this.AFInAppEventParameterName = str;
        this.AFInAppEventType = bArr;
        this.AFKeystoreWrapper = str2;
        this.values = aFe1eSDK;
    }

    public AFb1mSDK(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        int i = 0;
        int i2 = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.AFInAppEventParameterName = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.AFKeystoreWrapper = nextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.AFKeystoreWrapper);
                if (matcher.matches()) {
                    i = Integer.parseInt(matcher.group(1));
                    i2 = Integer.parseInt(matcher.group(2));
                }
            } else if (nextLine.startsWith("data=")) {
                String trim = nextLine.substring(5).trim();
                this.AFInAppEventType = (i > 4 || i2 >= 11) ? Base64.decode(trim, 2) : trim.getBytes(Charset.defaultCharset());
            } else if (nextLine.startsWith("type=")) {
                String trim2 = nextLine.substring(5).trim();
                try {
                    this.values = AFe1eSDK.valueOf(trim2);
                } catch (Exception e) {
                    AFLogger.afErrorLog("CACHE: Unknown task type: ".concat(String.valueOf(trim2)), e);
                }
            }
        }
        scanner.close();
    }

    public final byte[] AFInAppEventType() {
        return this.AFInAppEventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AFb1mSDK aFb1mSDK = (AFb1mSDK) obj;
            String str = this.AFKeystoreWrapper;
            if (str == null ? aFb1mSDK.AFKeystoreWrapper != null : !str.equals(aFb1mSDK.AFKeystoreWrapper)) {
                return false;
            }
            if (!Arrays.equals(this.AFInAppEventType, aFb1mSDK.AFInAppEventType)) {
                return false;
            }
            String str2 = this.AFInAppEventParameterName;
            if (str2 == null ? aFb1mSDK.AFInAppEventParameterName != null : !str2.equals(aFb1mSDK.AFInAppEventParameterName)) {
                return false;
            }
            String str3 = this.valueOf;
            if (str3 == null ? aFb1mSDK.valueOf != null : !str3.equals(aFb1mSDK.valueOf)) {
                return false;
            }
            if (this.values == aFb1mSDK.values) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.AFKeystoreWrapper;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Arrays.hashCode(this.AFInAppEventType)) * 31;
        String str2 = this.AFInAppEventParameterName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.valueOf;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AFe1eSDK aFe1eSDK = this.values;
        return hashCode3 + (aFe1eSDK != null ? aFe1eSDK.hashCode() : 0);
    }
}
