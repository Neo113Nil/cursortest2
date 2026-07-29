package com.tapjoy;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.fs;
import java.util.Map;
import java.util.UUID;
import org.w3c.dom.Document;

/* loaded from: classes2.dex */
public class TJCurrency {

    /* renamed from: d, reason: collision with root package name */
    private static TJGetCurrencyBalanceListener f7695d;
    private static TJSpendCurrencyListener e;
    private static TJAwardCurrencyListener f;
    private static TJEarnedCurrencyListener g;

    /* renamed from: a, reason: collision with root package name */
    String f7696a = null;

    /* renamed from: b, reason: collision with root package name */
    int f7697b = 0;

    /* renamed from: c, reason: collision with root package name */
    Context f7698c;

    public TJCurrency(Context context) {
        this.f7698c = context;
    }

    public void saveCurrencyBalance(int i) {
        SharedPreferences.Editor edit = this.f7698c.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).edit();
        edit.putInt(TapjoyConstants.PREF_LAST_CURRENCY_BALANCE, i);
        edit.apply();
    }

    public int getLocalCurrencyBalance() {
        return this.f7698c.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).getInt(TapjoyConstants.PREF_LAST_CURRENCY_BALANCE, -9999);
    }

    public void getCurrencyBalance(TJGetCurrencyBalanceListener tJGetCurrencyBalanceListener) {
        f7695d = tJGetCurrencyBalanceListener;
        final Map uRLParams = TapjoyConnectCore.getURLParams();
        new Thread(new Runnable() { // from class: com.tapjoy.TJCurrency.1
            @Override // java.lang.Runnable
            public final void run() {
                TJCurrency.this.a(new TapjoyURLConnection().getResponseFromURL(TapjoyConnectCore.getHostURL() + TapjoyConstants.TJC_GET_CURRENCY_BALANCE_URL_PATH, uRLParams));
            }
        }).start();
    }

    public void spendCurrency(int i, TJSpendCurrencyListener tJSpendCurrencyListener) {
        if (i < 0) {
            TapjoyLog.e("TJCurrency", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "Amount must be a positive number for the spendCurrency API"));
            return;
        }
        this.f7696a = String.valueOf(i);
        e = tJSpendCurrencyListener;
        final Map uRLParams = TapjoyConnectCore.getURLParams();
        TapjoyUtil.safePut(uRLParams, TapjoyConstants.TJC_CURRENCY, this.f7696a, true);
        new Thread(new Runnable() { // from class: com.tapjoy.TJCurrency.2
            @Override // java.lang.Runnable
            public final void run() {
                TJCurrency.this.b(new TapjoyURLConnection().getResponseFromURL(TapjoyConnectCore.getHostURL() + TapjoyConstants.TJC_SPEND_CURRENCY_URL_PATH, uRLParams));
            }
        }).start();
    }

    public void awardCurrency(int i, TJAwardCurrencyListener tJAwardCurrencyListener) {
        if (i < 0) {
            TapjoyLog.e("TJCurrency", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "Amount must be a positive number for the awardCurrency API"));
            return;
        }
        this.f7697b = i;
        f = tJAwardCurrencyListener;
        String uuid = UUID.randomUUID().toString();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        final Map genericURLParams = TapjoyConnectCore.getGenericURLParams();
        TapjoyUtil.safePut(genericURLParams, TapjoyConstants.TJC_CURRENCY, String.valueOf(this.f7697b), true);
        TapjoyUtil.safePut(genericURLParams, TapjoyConstants.TJC_GUID, uuid, true);
        TapjoyUtil.safePut(genericURLParams, TapjoyConstants.TJC_TIMESTAMP, String.valueOf(currentTimeMillis), true);
        TapjoyUtil.safePut(genericURLParams, TapjoyConstants.TJC_VERIFIER, TapjoyConnectCore.getAwardCurrencyVerifier(currentTimeMillis, this.f7697b, uuid), true);
        new Thread(new Runnable() { // from class: com.tapjoy.TJCurrency.3
            @Override // java.lang.Runnable
            public final void run() {
                TJCurrency.this.c(new TapjoyURLConnection().getResponseFromURL(TapjoyConnectCore.getHostURL() + TapjoyConstants.TJC_AWARD_CURRENCY_URL_PATH, genericURLParams));
            }
        }).start();
    }

    public void setEarnedCurrencyListener(TJEarnedCurrencyListener tJEarnedCurrencyListener) {
        g = tJEarnedCurrencyListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(TapjoyHttpURLResponse tapjoyHttpURLResponse) {
        if (tapjoyHttpURLResponse.response != null) {
            Document buildDocument = TapjoyUtil.buildDocument(tapjoyHttpURLResponse.response);
            if (buildDocument != null) {
                String nodeTrimValue = TapjoyUtil.getNodeTrimValue(buildDocument.getElementsByTagName("Success"));
                if (nodeTrimValue != null && nodeTrimValue.equals("true")) {
                    String nodeTrimValue2 = TapjoyUtil.getNodeTrimValue(buildDocument.getElementsByTagName("TapPoints"));
                    String nodeTrimValue3 = TapjoyUtil.getNodeTrimValue(buildDocument.getElementsByTagName("CurrencyName"));
                    if (nodeTrimValue2 != null && nodeTrimValue3 != null) {
                        try {
                            int parseInt = Integer.parseInt(nodeTrimValue2);
                            int localCurrencyBalance = getLocalCurrencyBalance();
                            if (g != null && localCurrencyBalance != -9999 && parseInt > localCurrencyBalance) {
                                StringBuilder sb = new StringBuilder("earned: ");
                                int i = parseInt - localCurrencyBalance;
                                sb.append(i);
                                TapjoyLog.i("TJCurrency", sb.toString());
                                g.onEarnedCurrency(nodeTrimValue3, i);
                            }
                            saveCurrencyBalance(parseInt);
                            if (f7695d != null) {
                                f7695d.onGetCurrencyBalanceResponse(nodeTrimValue3, parseInt);
                            }
                            return;
                        } catch (Exception e2) {
                            TapjoyLog.e("TJCurrency", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SERVER_ERROR, "Error parsing XML and calling listener: " + e2.toString()));
                        }
                    } else {
                        TapjoyLog.e("TJCurrency", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SERVER_ERROR, "getCurrencyBalance response is invalid -- missing tags."));
                    }
                } else {
                    TapjoyLog.e("TJCurrency", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SERVER_ERROR, "getCurrencyBalance response is invalid -- missing <Success> tag."));
                }
            }
        } else {
            TapjoyLog.e("TJCurrency", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SERVER_ERROR, "getCurrencyBalance response is NULL"));
        }
        if (f7695d != null) {
            f7695d.onGetCurrencyBalanceResponseFailure("Failed to get currency balance");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(TapjoyHttpURLResponse tapjoyHttpURLResponse) {
        String str = "Failed to spend currency";
        if (tapjoyHttpURLResponse.response != null) {
            Document buildDocument = TapjoyUtil.buildDocument(tapjoyHttpURLResponse.response);
            if (buildDocument != null) {
                String nodeTrimValue = TapjoyUtil.getNodeTrimValue(buildDocument.getElementsByTagName("Success"));
                if (nodeTrimValue != null && nodeTrimValue.equals("true")) {
                    String nodeTrimValue2 = TapjoyUtil.getNodeTrimValue(buildDocument.getElementsByTagName("TapPoints"));
                    String nodeTrimValue3 = TapjoyUtil.getNodeTrimValue(buildDocument.getElementsByTagName("CurrencyName"));
                    if (nodeTrimValue2 != null && nodeTrimValue3 != null) {
                        int parseInt = Integer.parseInt(nodeTrimValue2);
                        saveCurrencyBalance(parseInt);
                        if (e != null) {
                            e.onSpendCurrencyResponse(nodeTrimValue3, parseInt);
                        }
                        return;
                    }
                    TapjoyLog.e("TJCurrency", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SERVER_ERROR, "spendCurrency response is invalid -- missing tags."));
                } else if (nodeTrimValue != null && nodeTrimValue.endsWith("false")) {
                    str = TapjoyUtil.getNodeTrimValue(buildDocument.getElementsByTagName("Message"));
                    TapjoyLog.i("TJCurrency", str);
                    if ("BalanceTooLowError".equals(TapjoyUtil.getNodeTrimValue(buildDocument.getElementsByTagName("MessageCode")))) {
                        fs.a();
                    }
                } else {
                    TapjoyLog.e("TJCurrency", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SERVER_ERROR, "spendCurrency response is invalid -- missing <Success> tag."));
                }
            }
        } else {
            TapjoyLog.e("TJCurrency", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SERVER_ERROR, "spendCurrency response is NULL"));
        }
        if (e != null) {
            e.onSpendCurrencyResponseFailure(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c(TapjoyHttpURLResponse tapjoyHttpURLResponse) {
        String str = "Failed to award currency";
        if (tapjoyHttpURLResponse.response != null) {
            Document buildDocument = TapjoyUtil.buildDocument(tapjoyHttpURLResponse.response);
            if (buildDocument != null) {
                String nodeTrimValue = TapjoyUtil.getNodeTrimValue(buildDocument.getElementsByTagName("Success"));
                if (nodeTrimValue != null && nodeTrimValue.equals("true")) {
                    String nodeTrimValue2 = TapjoyUtil.getNodeTrimValue(buildDocument.getElementsByTagName("TapPoints"));
                    String nodeTrimValue3 = TapjoyUtil.getNodeTrimValue(buildDocument.getElementsByTagName("CurrencyName"));
                    if (nodeTrimValue2 != null && nodeTrimValue3 != null) {
                        int parseInt = Integer.parseInt(nodeTrimValue2);
                        saveCurrencyBalance(parseInt);
                        if (f != null) {
                            f.onAwardCurrencyResponse(nodeTrimValue3, parseInt);
                        }
                        return;
                    }
                    TapjoyLog.e("TJCurrency", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SERVER_ERROR, "awardCurrency response is invalid -- missing tags."));
                } else if (nodeTrimValue != null && nodeTrimValue.endsWith("false")) {
                    str = TapjoyUtil.getNodeTrimValue(buildDocument.getElementsByTagName("Message"));
                    TapjoyLog.i("TJCurrency", str);
                } else {
                    TapjoyLog.e("TJCurrency", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SERVER_ERROR, "awardCurrency response is invalid -- missing <Success> tag."));
                }
            }
        } else {
            TapjoyLog.e("TJCurrency", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SERVER_ERROR, "awardCurrency response is NULL"));
        }
        if (f != null) {
            f.onAwardCurrencyResponseFailure(str);
        }
    }
}
