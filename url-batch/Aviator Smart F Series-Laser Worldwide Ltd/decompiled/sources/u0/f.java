package u0;

import android.util.Log;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.ble.conn.type.CRPChatErrorCode;
import com.my.lib.AFlash;
import com.my.lib.data.ErrorCode;
import com.my.lib.data.SubscriptionInfo;
import f6.p;
import f6.r;
import f6.v;
import java.util.List;
import java.util.Objects;
import y5.w;

/* loaded from: classes2.dex */
public class f {
    public static final String[] AI_SMART_CODES = {"HfWTpeeKmfULxayOkV", "qMPwFGNSxlcXxqvpoR", "eaZNhVWFCyUNAMwvOs", "rAtgouHthjgAzpuYwQ", "gjbOgfUbywFcepqbGh", "vFtykSGjjnyAmnbYww"};
    private String contentId = "";
    private String requestId = "";
    private byte fetchType = 0;

    private String getFetchCode() {
        byte b8 = this.fetchType;
        if (b8 >= 0) {
            String[] strArr = AI_SMART_CODES;
            if (b8 < strArr.length) {
                return strArr[b8];
            }
        }
        return AI_SMART_CODES[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w lambda$requestFetchAgentList$2(String str, Integer num, Integer num2, List list) {
        Log.d("AFlash", "onSuccess: " + list.toString());
        AIProvider.saveAflashFetchList(list);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w lambda$requestFetchAgentList$3(String str, ErrorCode errorCode) {
        Log.d("AFlash", "errorCode: " + errorCode.getCode() + "，Message：" + errorCode.getMessage());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ w lambda$startFetchAgent$0(a aVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, SubscriptionInfo subscriptionInfo) {
        String str8 = "onSuccess: requestId:" + str + "\nsendTextContent:" + str2 + "\ncontentId:" + str4 + "\nanswerTextContent:" + str5 + "\nimgUrl:" + str6 + "\nimgUrl2:" + str7;
        Log.d("AFlash", str8);
        if (Objects.equals(this.requestId, str)) {
            org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.f(str8));
            this.contentId = str4;
            i4.getInstance().sendAIFetchResponse(this.fetchType, str5);
            if (aVar != null) {
                aVar.onSuccess(str5);
            }
            return null;
        }
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.f("requestId不相等  " + str8));
        Log.d("AFlash", "requestId不相等");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w lambda$startFetchAgent$1(a aVar, String str, ErrorCode errorCode) {
        String str2 = "errorCode: " + errorCode.getCode() + "，Message：" + errorCode.getMessage();
        Log.d("AFlash", str2);
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.f(str2));
        com.crrepa.band.my.device.ai.helper.c.checkUnauthorized(errorCode.getCode());
        i4.getInstance().sendFetchError(CRPChatErrorCode.SERVER_BUSY_ERROR);
        if (aVar == null) {
            return null;
        }
        aVar.a(errorCode.getCode(), errorCode.getMessage());
        return null;
    }

    public static void requestFetchAgentList() {
        AFlash.Companion.getInstance().fetchAgentList(com.moyoung.dafit.module.common.utils.d.get(), com.crrepa.band.my.device.ai.helper.d.getUUID(), com.crrepa.band.my.device.ai.helper.c.getWID(), "zh", 20, 1, new r() { // from class: u0.d
            @Override // f6.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                w lambda$requestFetchAgentList$2;
                lambda$requestFetchAgentList$2 = f.lambda$requestFetchAgentList$2((String) obj, (Integer) obj2, (Integer) obj3, (List) obj4);
                return lambda$requestFetchAgentList$2;
            }
        }, new p() { // from class: u0.e
            @Override // f6.p
            public final Object invoke(Object obj, Object obj2) {
                w lambda$requestFetchAgentList$3;
                lambda$requestFetchAgentList$3 = f.lambda$requestFetchAgentList$3((String) obj, (ErrorCode) obj2);
                return lambda$requestFetchAgentList$3;
            }
        });
    }

    public byte getFetchType() {
        return this.fetchType;
    }

    public void resetRequestId() {
        this.requestId = "";
    }

    public void setFetchType(byte b8) {
        if (this.fetchType != b8) {
            this.contentId = "";
        }
        this.fetchType = b8;
    }

    public void startFetchAgent(String str, final a aVar) {
        this.requestId = com.crrepa.band.my.device.ai.helper.d.getUUID();
        String fetchCode = getFetchCode();
        String str2 = "requestId:" + this.requestId + ",contentId:" + this.contentId + ",fetchAgentCode：" + fetchCode + ",question:" + str;
        Log.d("AFlash", "startFetchAgent: " + str2);
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.e(str2));
        AFlash.Companion.getInstance().chat(com.moyoung.dafit.module.common.utils.d.get(), this.requestId, com.crrepa.band.my.device.ai.helper.c.getWID(), this.requestId, fetchCode, "text", this.contentId, str, null, null, com.crrepa.band.my.device.ai.asr.b.getCurrentLanguage(), com.crrepa.band.my.device.ai.asr.b.getCurrentLanguage(), new v(aVar) { // from class: u0.b
            @Override // f6.v
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
                w lambda$startFetchAgent$0;
                lambda$startFetchAgent$0 = f.this.lambda$startFetchAgent$0(null, (String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (SubscriptionInfo) obj8);
                return lambda$startFetchAgent$0;
            }
        }, new p(aVar) { // from class: u0.c
            @Override // f6.p
            public final Object invoke(Object obj, Object obj2) {
                w lambda$startFetchAgent$1;
                lambda$startFetchAgent$1 = f.lambda$startFetchAgent$1(null, (String) obj, (ErrorCode) obj2);
                return lambda$startFetchAgent$1;
            }
        });
    }
}
