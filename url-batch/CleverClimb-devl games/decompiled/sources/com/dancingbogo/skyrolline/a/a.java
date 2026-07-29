package com.dancingbogo.skyrolline.a;

import android.app.Activity;
import android.support.v4.app.NotificationCompat;
import android.support.v7.widget.helper.ItemTouchHelper;
import com.aiming.mdt.utils.Constants;
import com.dancingbogo.skyrolline.util.NativeUtil;
import com.dancingbogo.skyrolline.util.b;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SDKPayUtil.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static String[] f4489a;

    /* renamed from: b, reason: collision with root package name */
    public static String[] f4490b;
    private static a i;

    /* renamed from: c, reason: collision with root package name */
    private final String f4491c = "rs_pay";

    /* renamed from: d, reason: collision with root package name */
    private final String f4492d = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArHHR6U+SlXHS0cQ2Ma/PGFaxrdk/9xPacHxl3Um9LtZ7JL6jiHmGYTO5MWsza6xw5XTSyh83Y7TyFZmmDCr0PLtVco8aUlEu6cFOu5q3z9/4gkFY7aefk4URrToYE4CFFHpXxrUJcAooQ9o07IR8ZgTT7gioDrCnT/vhiMwCyRMgEnTOmWEvVjvqn4VJg4N/Md3rlp9WcmzLba+mMKRSY93iIAVsJgmkmIQvpJJulOs68PrytNxbvT8jnvJ87qApp40acT2YNHIT4R82AHYBF4hNO6hViyNSW6Jdo+gMk+TNVDpSV45mfbUV5dp8rPjzvPdXL2MBSljp5ktE4LjItQIDAQAB";
    private final String e = "https://gdcasapi.cmcm.com/globalpay/gpPay?protocolVer=";
    private final String f = "103";
    private String g = "1";
    private String h = "1";

    public static a a() {
        if (i == null) {
            i = new a();
        }
        return i;
    }

    private a() {
    }

    public boolean a(Activity activity, String str, String str2) {
        b.a("rs_pay", "into init");
        if (activity == null) {
            b.a("rs_pay", "初始化失败:activity == null");
            return false;
        }
        f4489a = str.split("\\|");
        f4490b = str2.split("\\|");
        ArrayList<String> arrayList = new ArrayList<>();
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < f4489a.length; i2++) {
            arrayList.add(i2, f4489a[i2]);
        }
        for (int i3 = 0; i3 < f4490b.length; i3++) {
            jSONArray.put(f4490b[i3]);
        }
        com.cmplay.gppay.b.a();
        com.cmplay.gppay.b.a(jSONArray.toString());
        com.cmplay.gppay.b.a().a(activity, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArHHR6U+SlXHS0cQ2Ma/PGFaxrdk/9xPacHxl3Um9LtZ7JL6jiHmGYTO5MWsza6xw5XTSyh83Y7TyFZmmDCr0PLtVco8aUlEu6cFOu5q3z9/4gkFY7aefk4URrToYE4CFFHpXxrUJcAooQ9o07IR8ZgTT7gioDrCnT/vhiMwCyRMgEnTOmWEvVjvqn4VJg4N/Md3rlp9WcmzLba+mMKRSY93iIAVsJgmkmIQvpJJulOs68PrytNxbvT8jnvJ87qApp40acT2YNHIT4R82AHYBF4hNO6hViyNSW6Jdo+gMk+TNVDpSV45mfbUV5dp8rPjzvPdXL2MBSljp5ktE4LjItQIDAQAB", "https://gdcasapi.cmcm.com/globalpay/gpPay?protocolVer=", "103", this.g, "1", arrayList, this.h, new com.cmplay.gppay.a() { // from class: com.dancingbogo.skyrolline.a.a.1
            @Override // com.cmplay.gppay.a
            public void a(int i4, String str3) {
                b.a("rs_pay", "into onPayCallback status = " + i4);
                b.a("rs_pay", "into onPayCallback msg = " + str3);
                int i5 = i4 / 100;
                if (i5 == 2 || i5 == 3 || i5 == 9) {
                    a.this.a(4, String.valueOf(i4));
                    i4 = a.this.a(i4);
                }
                JSONObject jSONObject = new JSONObject();
                if (a.this.c(str3)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str3);
                        jSONObject.put("status", i4);
                        if (jSONObject2.has("orderJson")) {
                            jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, jSONObject2.get("orderJson").toString());
                        } else {
                            jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str3);
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                        b.a("rs_pay", "into onPayCallback JSONException = " + e.getMessage());
                    }
                } else {
                    try {
                        jSONObject.put("status", i4);
                        jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str3);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                        b.a("rs_pay", "into onPayCallback JSONException = " + e2.getMessage());
                    }
                }
                b.b("rs_pay", "onPayCallback json = " + jSONObject.toString());
                NativeUtil.getInstance().sendUnityMessage("IAPManager", "onPayCallback", jSONObject.toString());
            }

            @Override // com.cmplay.gppay.a
            public void a(String str3) {
                b.a("rs_pay", "into onPayProductInfos infos = " + str3);
                NativeUtil.getInstance().sendUnityMessage("IAPManager", "onPayProductInfos", str3);
                com.cmplay.a.a.a(str3);
            }

            @Override // com.cmplay.gppay.a
            public void a(int i4, String str3, String str4) {
                b.a("rs_pay", "into onQuerySubsTimeInfos");
            }

            @Override // com.cmplay.gppay.a
            public void a(String str3, boolean z) {
                b.a("rs_pay", "into reportInfoc params = " + str3);
                b.a("rs_pay", "into reportInfoc isForce = " + z);
            }

            @Override // com.cmplay.gppay.a
            public void a(String str3, String str4, String str5) {
                b.a("rs_pay", "into reportPurchase productId = " + str3);
                b.a("rs_pay", "into reportPurchase signature = " + str4);
                b.a("rs_pay", "into reportPurchase data = " + str5);
            }
        });
        return true;
    }

    public void b() {
        b.a("rs_pay", "into asyncGetProduceInfos");
        com.cmplay.gppay.b.a();
        com.cmplay.gppay.b.b();
    }

    public void a(String str) {
        b.a("rs_pay", "into asyncPay productId =" + str);
        com.cmplay.gppay.b.a();
        com.cmplay.gppay.b.a(this.g, this.h, str);
    }

    public void c() {
        b.a("rs_pay", "into restoreNoConsumeProducts");
        com.cmplay.gppay.b.a().e();
    }

    public void a(int i2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("action=");
        byte b2 = (byte) i2;
        sb.append((int) b2);
        sb.append("&remark=");
        sb.append(str);
        b.a("rs_pay", sb.toString());
        String b3 = b(str);
        NativeUtil.getInstance().reportInfoc("rollingsky_games_checkbuy", "action=" + ((int) b2) + "&orderid=0&productid=0&remark=" + b3, true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public String b(String str) {
        char c2;
        String str2 = "0";
        int hashCode = str.hashCode();
        if (hashCode == 49865) {
            if (str.equals("290")) {
                c2 = 6;
            }
            c2 = 65535;
        } else if (hashCode == 49867) {
            if (str.equals("292")) {
                c2 = 7;
            }
            c2 = 65535;
        } else if (hashCode != 50550) {
            switch (hashCode) {
                case 49586:
                    if (str.equals("200")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 49587:
                    if (str.equals("201")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 49588:
                    if (str.equals("202")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 49589:
                    if (str.equals("203")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 49590:
                    if (str.equals("204")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 49591:
                    if (str.equals("205")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    switch (hashCode) {
                        case 56313:
                            if (str.equals("900")) {
                                c2 = '\t';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 56314:
                            if (str.equals("901")) {
                                c2 = '\n';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 56315:
                            if (str.equals("902")) {
                                c2 = 11;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 56316:
                            if (str.equals("903")) {
                                c2 = '\f';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 56317:
                            if (str.equals("904")) {
                                c2 = '\r';
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
            }
        } else {
            if (str.equals("303")) {
                c2 = '\b';
            }
            c2 = 65535;
        }
        switch (c2) {
            case 0:
                str2 = "1";
                break;
            case 1:
                str2 = "2";
                break;
            case 2:
                str2 = Constants.ALL_LOAD;
                break;
            case 3:
                str2 = Constants.ALL_READY;
                break;
            case 4:
                str2 = "5";
                break;
            case 5:
                str2 = "6";
                break;
            case 6:
                str2 = "7";
                break;
            case 7:
                str2 = "8";
                break;
            case '\b':
                str2 = Constants.ALL_USELESS_REQUEST;
                break;
            case '\t':
                str2 = Constants.INSTANCE_USELESS_REQUEST;
                break;
            case '\n':
                str2 = Constants.IIMPR;
                break;
            case 11:
                str2 = Constants.ICLICK;
                break;
            case '\f':
                str2 = "13";
                break;
            case '\r':
                str2 = "14";
                break;
        }
        b.a("rs_pay", "getRemarkId---mRemark=" + str2);
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        try {
            new JSONObject(str);
            b.a("rs_pay", "isJson = true");
            return true;
        } catch (Exception unused) {
            b.a("rs_pay", "isJson = false");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i2) {
        b.a("rs_pay", "into getStatus status = " + i2);
        int i3 = (i2 == 200 || i2 == 201 || i2 == 204 || i2 == 290 || i2 == 900 || i2 == 901) ? ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION : 201;
        b.a("rs_pay", "into getStatus status_new = " + i3);
        return i3;
    }
}
