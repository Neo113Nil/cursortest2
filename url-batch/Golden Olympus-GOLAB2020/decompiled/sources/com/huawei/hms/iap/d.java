package com.huawei.hms.iap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.iap.entity.ConsumeOwnedPurchaseReq;
import com.huawei.hms.iap.entity.IsEnvReadyReq;
import com.huawei.hms.iap.entity.IsSandboxActivatedReq;
import com.huawei.hms.iap.entity.OwnedPurchasesReq;
import com.huawei.hms.iap.entity.ProductInfoReq;
import com.huawei.hms.iap.entity.PurchaseIntentReq;
import com.huawei.hms.iap.entity.PurchaseIntentWithPriceReq;
import com.huawei.hms.iap.entity.PurchaseResultInfo;
import com.huawei.hms.iap.entity.RedeemCodeResultInfo;
import com.huawei.hms.iap.entity.StartIapActivityReq;
import com.huawei.hms.iap.task.IapFailureTask;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class d implements IapClient {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f14194a;

    /* renamed from: b, reason: collision with root package name */
    private String f14195b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14196c;

    /* renamed from: d, reason: collision with root package name */
    private String f14197d;

    /* renamed from: e, reason: collision with root package name */
    private f f14198e;

    /* renamed from: f, reason: collision with root package name */
    private e f14199f;

    d(Activity activity) {
        this.f14194a = new WeakReference<>(activity);
    }

    private f a() {
        f fVar;
        f fVar2 = this.f14198e;
        if (fVar2 != null) {
            return fVar2;
        }
        Context context = this.f14194a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "getIapClientImpl context is null.");
            return null;
        }
        String b4 = b();
        b4.getClass();
        switch (b4) {
            case "MCP_MODE":
                String str = TextUtils.isEmpty(this.f14195b) ? this.f14197d : this.f14195b;
                this.f14198e = context instanceof Activity ? new f((Activity) context, str) : new f(context, str);
                break;
            case "GENERAL_MODE":
                fVar = context instanceof Activity ? new f((Activity) context) : new f(context);
                this.f14198e = fVar;
                break;
            case "CONSIGNMENT_MODE":
                fVar = context instanceof Activity ? new f((Activity) context, this.f14197d, this.f14196c) : new f(context, this.f14197d, this.f14196c);
                this.f14198e = fVar;
                break;
        }
        return this.f14198e;
    }

    private String b() {
        return this.f14196c ? !TextUtils.isEmpty(this.f14197d) ? "CONSIGNMENT_MODE" : "GENERAL_MODE" : (TextUtils.isEmpty(this.f14195b) && TextUtils.isEmpty(this.f14197d)) ? "GENERAL_MODE" : "MCP_MODE";
    }

    private e c() {
        e eVar;
        e eVar2 = this.f14199f;
        if (eVar2 != null) {
            return eVar2;
        }
        Context context = this.f14194a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "getIapClientFullImpl context is null.");
            return null;
        }
        String b4 = b();
        b4.getClass();
        switch (b4) {
            case "MCP_MODE":
                this.f14199f = new e(context, TextUtils.isEmpty(this.f14195b) ? this.f14197d : this.f14195b);
                break;
            case "GENERAL_MODE":
                eVar = new e(context);
                this.f14199f = eVar;
                break;
            case "CONSIGNMENT_MODE":
                eVar = new e(context, this.f14197d);
                this.f14199f = eVar;
                break;
        }
        return this.f14199f;
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i consumeOwnedPurchase(ConsumeOwnedPurchaseReq consumeOwnedPurchaseReq) {
        Checker.checkNonNull(consumeOwnedPurchaseReq);
        Context context = this.f14194a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "consumeOwnedPurchase context is null.");
            return new IapFailureTask();
        }
        if (!com.huawei.hms.iap.util.a.a(context, consumeOwnedPurchaseReq.getReservedInfor())) {
            f a4 = a();
            return a4 != null ? a4.consumeOwnedPurchase(consumeOwnedPurchaseReq) : new IapFailureTask();
        }
        HMSLog.i("IapClientEntryImpl", "consumeOwnedPurchase with Full SDK branch.");
        e c4 = c();
        return c4 != null ? c4.consumeOwnedPurchase(consumeOwnedPurchaseReq) : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i createPurchaseIntent(PurchaseIntentReq purchaseIntentReq) {
        Checker.checkNonNull(purchaseIntentReq);
        Context context = this.f14194a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "createPurchaseIntent context is null.");
            return new IapFailureTask();
        }
        if (!com.huawei.hms.iap.util.a.a(context, purchaseIntentReq.getReservedInfor())) {
            f a4 = a();
            return a4 != null ? a4.createPurchaseIntent(purchaseIntentReq) : new IapFailureTask();
        }
        HMSLog.i("IapClientEntryImpl", "createPurchaseIntent with Full SDK branch.");
        e c4 = c();
        return c4 != null ? c4.createPurchaseIntent(purchaseIntentReq) : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i createPurchaseIntentWithPrice(PurchaseIntentWithPriceReq purchaseIntentWithPriceReq) {
        f a4 = a();
        return a4 != null ? a4.createPurchaseIntentWithPrice(purchaseIntentWithPriceReq) : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public void enablePendingPurchase() {
        f a4 = a();
        if (a4 != null) {
            a4.enablePendingPurchase();
        }
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i isEnvReady() {
        return isEnvReady(false);
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i isSandboxActivated(IsSandboxActivatedReq isSandboxActivatedReq) {
        Checker.checkNonNull(isSandboxActivatedReq);
        f a4 = a();
        return a4 != null ? a4.isSandboxActivated(isSandboxActivatedReq) : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i obtainOwnedPurchaseRecord(OwnedPurchasesReq ownedPurchasesReq) {
        Checker.checkNonNull(ownedPurchasesReq);
        Context context = this.f14194a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "obtainOwnedPurchaseRecord context is null.");
            return new IapFailureTask();
        }
        if (!com.huawei.hms.iap.util.a.a(context, ownedPurchasesReq.getReservedInfor())) {
            f a4 = a();
            return a4 != null ? a4.obtainOwnedPurchaseRecord(ownedPurchasesReq) : new IapFailureTask();
        }
        HMSLog.i("IapClientEntryImpl", "obtainOwnedPurchaseRecord with Full SDK branch.");
        e c4 = c();
        return c4 != null ? c4.obtainOwnedPurchaseRecord(ownedPurchasesReq) : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i obtainOwnedPurchases(OwnedPurchasesReq ownedPurchasesReq) {
        Checker.checkNonNull(ownedPurchasesReq);
        Context context = this.f14194a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "obtainOwnedPurchases context is null.");
            return new IapFailureTask();
        }
        if (!com.huawei.hms.iap.util.a.a(context, ownedPurchasesReq.getReservedInfor())) {
            f a4 = a();
            return a4 != null ? a4.obtainOwnedPurchases(ownedPurchasesReq) : new IapFailureTask();
        }
        HMSLog.i("IapClientEntryImpl", "obtainOwnedPurchases with Full SDK branch.");
        e c4 = c();
        return c4 != null ? c4.obtainOwnedPurchases(ownedPurchasesReq) : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i obtainProductInfo(ProductInfoReq productInfoReq) {
        Checker.checkNonNull(productInfoReq);
        Context context = this.f14194a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "obtainProductInfo context is null.");
            return new IapFailureTask();
        }
        if (!com.huawei.hms.iap.util.a.a(context, productInfoReq.getReservedInfor())) {
            f a4 = a();
            return a4 != null ? a4.obtainProductInfo(productInfoReq) : new IapFailureTask();
        }
        HMSLog.i("IapClientEntryImpl", "obtainProductInfo with Full SDK branch.");
        e c4 = c();
        return c4 != null ? c4.obtainProductInfo(productInfoReq) : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public PurchaseResultInfo parsePurchaseResultInfoFromIntent(Intent intent) {
        if (intent == null) {
            intent = new Intent();
        }
        if (!com.huawei.hms.iap.util.c.a(intent, "isFullSdk", false)) {
            f a4 = a();
            return a4 != null ? a4.parsePurchaseResultInfoFromIntent(intent) : new PurchaseResultInfo();
        }
        HMSLog.i("IapClientEntryImpl", "parsePurchaseResultInfoFromIntent with Full SDK branch.");
        e c4 = c();
        return c4 != null ? c4.parsePurchaseResultInfoFromIntent(intent) : new PurchaseResultInfo();
    }

    @Override // com.huawei.hms.iap.IapClient
    public RedeemCodeResultInfo parseRedeemCodeResultInfoFromIntent(Intent intent) {
        if (intent == null) {
            intent = new Intent();
        }
        f a4 = a();
        return a4 != null ? a4.parseRedeemCodeResultInfoFromIntent(intent) : new RedeemCodeResultInfo();
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i scanRedeemCode() {
        f a4 = a();
        return a4 != null ? a4.scanRedeemCode() : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i startIapActivity(StartIapActivityReq startIapActivityReq) {
        Checker.checkNonNull(startIapActivityReq);
        f a4 = a();
        return a4 != null ? a4.startIapActivity(startIapActivityReq) : new IapFailureTask();
    }

    d(Activity activity, String str) {
        this.f14194a = new WeakReference<>(activity);
        this.f14195b = str;
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i isEnvReady(IsEnvReadyReq isEnvReadyReq) {
        Checker.checkNonNull(isEnvReadyReq);
        Context context = this.f14194a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "isEnvReady context is null.");
            return new IapFailureTask();
        }
        if (!com.huawei.hms.iap.util.a.a(context, isEnvReadyReq.getReservedInfor())) {
            return new IapFailureTask();
        }
        HMSLog.i("IapClientEntryImpl", "isEnvReady with Full SDK branch.");
        e c4 = c();
        return c4 != null ? c4.isEnvReady(isEnvReadyReq) : new IapFailureTask();
    }

    d(Activity activity, String str, boolean z4) {
        this.f14194a = new WeakReference<>(activity);
        this.f14197d = str;
        this.f14196c = z4;
    }

    @Override // com.huawei.hms.iap.IapClient
    public z0.i isEnvReady(boolean z4) {
        f a4 = a();
        return a4 != null ? a4.isEnvReady(z4) : new IapFailureTask();
    }

    d(Context context) {
        this.f14194a = new WeakReference<>(context);
    }

    d(Context context, String str) {
        this.f14194a = new WeakReference<>(context);
        this.f14195b = str;
    }

    d(Context context, String str, boolean z4) {
        this.f14194a = new WeakReference<>(context);
        this.f14197d = str;
        this.f14196c = z4;
    }
}
