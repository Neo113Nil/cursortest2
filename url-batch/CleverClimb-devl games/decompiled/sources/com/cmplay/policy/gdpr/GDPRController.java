package com.cmplay.policy.gdpr;

import android.app.Activity;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.aiming.mdt.utils.Constants;
import com.umeng.commonsdk.stateless.d;
import com.unity3d.player.UnityPlayer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GDPRController {
    private static boolean DEBUG = false;
    public static final int FROM_MAIN_PAGE = 2;
    public static final int FROM_SETTING = 3;
    public static final int FROM_SPLASH = 1;
    private static volatile boolean bGdprEnable;
    private static volatile boolean bGdprEnforcedStates;
    private static volatile boolean bIsOldUser;
    private static volatile boolean bUserAgreed;
    private static volatile boolean bUserAgreedAdStayInformedUpdates;
    private static volatile boolean bUserAgreedPolicyUpdates;
    private static GDPRCancelDialog mGDPRCancelDialog;
    private static GDPRPolicyDialog mGDPRPolicyDialog;
    private static GDPRController mInst;
    public static Context sContext;
    private static final List<Integer> ENFORCED_STATE_MCC = new ArrayList();
    private static final List<String> ENFORCED_STATE_LAN_AND_COUNTRY_CODE = new ArrayList();
    private static final List<String> ENFORCED_STATE_LAN = new ArrayList();
    public static String mMsgReceiverName = "";
    public static IReport mUserReporter = null;
    public static IReport mReport = new IReport() { // from class: com.cmplay.policy.gdpr.GDPRController.1
        @Override // com.cmplay.policy.gdpr.GDPRController.IReport
        public void doReport(String str, String str2) {
            LogUtil.d("gdpr", "tableName:" + str + "   data:" + str2);
            if (!TextUtils.isEmpty(GDPRController.mMsgReceiverName)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("tableName", str);
                    jSONObject.put("data", str2);
                    UnityPlayer.UnitySendMessage(GDPRController.mMsgReceiverName, "doReport", jSONObject.toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            if (GDPRController.mUserReporter != null) {
                GDPRController.mUserReporter.doReport(str, str2);
            }
        }
    };

    public interface IAgreeListener {
        void onGDPRAgreed(boolean z);
    }

    public interface IReport {
        void doReport(String str, String str2);
    }

    public static void setReport(IReport iReport) {
        mUserReporter = iReport;
    }

    public static void init(Context context) {
        sContext = context.getApplicationContext();
        SharePreferenceHelper.init(sContext);
        ENFORCED_STATE_MCC.add(202);
        ENFORCED_STATE_MCC.add(204);
        ENFORCED_STATE_MCC.add(206);
        ENFORCED_STATE_MCC.add(Integer.valueOf(Constants.VERSION));
        ENFORCED_STATE_MCC.add(214);
        ENFORCED_STATE_MCC.add(216);
        ENFORCED_STATE_MCC.add(219);
        ENFORCED_STATE_MCC.add(222);
        ENFORCED_STATE_MCC.add(226);
        ENFORCED_STATE_MCC.add(230);
        ENFORCED_STATE_MCC.add(231);
        ENFORCED_STATE_MCC.add(232);
        ENFORCED_STATE_MCC.add(234);
        ENFORCED_STATE_MCC.add(235);
        ENFORCED_STATE_MCC.add(238);
        ENFORCED_STATE_MCC.add(Integer.valueOf(DimenUtils.DENSITY_HIGH));
        ENFORCED_STATE_MCC.add(242);
        ENFORCED_STATE_MCC.add(244);
        ENFORCED_STATE_MCC.add(246);
        ENFORCED_STATE_MCC.add(247);
        ENFORCED_STATE_MCC.add(248);
        ENFORCED_STATE_MCC.add(260);
        ENFORCED_STATE_MCC.add(262);
        ENFORCED_STATE_MCC.add(266);
        ENFORCED_STATE_MCC.add(268);
        ENFORCED_STATE_MCC.add(270);
        ENFORCED_STATE_MCC.add(272);
        ENFORCED_STATE_MCC.add(Integer.valueOf(d.f9112a));
        ENFORCED_STATE_MCC.add(274);
        ENFORCED_STATE_MCC.add(278);
        ENFORCED_STATE_MCC.add(280);
        ENFORCED_STATE_MCC.add(284);
        ENFORCED_STATE_MCC.add(288);
        ENFORCED_STATE_MCC.add(290);
        ENFORCED_STATE_MCC.add(293);
        ENFORCED_STATE_MCC.add(294);
        ENFORCED_STATE_MCC.add(295);
        ENFORCED_STATE_MCC.add(308);
        ENFORCED_STATE_MCC.add(340);
        ENFORCED_STATE_MCC.add(346);
        ENFORCED_STATE_MCC.add(348);
        ENFORCED_STATE_MCC.add(350);
        ENFORCED_STATE_MCC.add(354);
        ENFORCED_STATE_MCC.add(376);
        ENFORCED_STATE_MCC.add(543);
        ENFORCED_STATE_MCC.add(546);
        ENFORCED_STATE_MCC.add(547);
        ENFORCED_STATE_MCC.add(647);
        ENFORCED_STATE_MCC.add(742);
        ENFORCED_STATE_MCC.add(750);
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("en_GB");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("de_DE");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("de_LI");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("de_AT");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("de_CH");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("fr_FR");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("fr_BE");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("fr_CH");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("fr_LU");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("nl_NL");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("nl_BE");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("bg_BG");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("hr_HR");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("cs_CZ");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("da_DK");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("et_EE");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("fi_FI");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("el_GR");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("hu_HU");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("en_IE");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("it_IT");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("it_CH");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("lv_LV");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("lt_LT");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("pl_PL");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("pt_PT");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("ro_RO");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("sk_SK");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("sl_SI");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("es_ES");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("sv_SE");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("is_IS");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("nb_NO");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("da_FO");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("da_GL");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("fr_PM");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("fr_AN");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("fr_ANT");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("fr_WF");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("fr_NC");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("fr_PF");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("fr_IO");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("fr_BIOT");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("en_GI");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("en_KY");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("en_CYM");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("en_VG");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("en_MS");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("en_TC");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("en_FK");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("mt_MT");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("en_MT");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("el_CY");
        ENFORCED_STATE_LAN_AND_COUNTRY_CODE.add("tr_CY");
        ENFORCED_STATE_LAN.add("en");
        ENFORCED_STATE_LAN.add("de");
        ENFORCED_STATE_LAN.add("fr");
        ENFORCED_STATE_LAN.add("nl");
        ENFORCED_STATE_LAN.add("bg");
        ENFORCED_STATE_LAN.add("hr");
        ENFORCED_STATE_LAN.add("cs");
        ENFORCED_STATE_LAN.add("da");
        ENFORCED_STATE_LAN.add("et");
        ENFORCED_STATE_LAN.add("fi");
        ENFORCED_STATE_LAN.add("el");
        ENFORCED_STATE_LAN.add("hu");
        ENFORCED_STATE_LAN.add("en");
        ENFORCED_STATE_LAN.add("it");
        ENFORCED_STATE_LAN.add("lv");
        ENFORCED_STATE_LAN.add("lt");
        ENFORCED_STATE_LAN.add("pl");
        ENFORCED_STATE_LAN.add("pt");
        ENFORCED_STATE_LAN.add("ro");
        ENFORCED_STATE_LAN.add("sk");
        ENFORCED_STATE_LAN.add("sl");
        ENFORCED_STATE_LAN.add("es");
        ENFORCED_STATE_LAN.add("sv");
        ENFORCED_STATE_LAN.add(com.umeng.commonsdk.proguard.d.ac);
        ENFORCED_STATE_LAN.add("nb");
    }

    public static boolean checkIsGDPREnforcedCountry(Context context) {
        if (bGdprEnforcedStates) {
            return true;
        }
        if (sContext == null) {
            init(context);
        }
        int mCCInt = getMCCInt(context);
        new StringBuilder();
        String language = getLanguage(context);
        String country = getCountry(context);
        if (!TextUtils.isEmpty(country)) {
            language = language + "_" + country;
        }
        LogUtil.d("gdpr", "mcc:" + String.valueOf(mCCInt) + "  language:" + language);
        if (mCCInt != 0 && ENFORCED_STATE_MCC.contains(Integer.valueOf(mCCInt))) {
            bGdprEnforcedStates = true;
        } else if (-1 == mCCInt) {
            if (language.isEmpty()) {
                bGdprEnforcedStates = true;
            } else if (ENFORCED_STATE_LAN_AND_COUNTRY_CODE.contains(language)) {
                bGdprEnforcedStates = true;
            } else if (ENFORCED_STATE_LAN.contains(language)) {
                bGdprEnforcedStates = true;
            }
        }
        return bGdprEnforcedStates;
    }

    public static void setGDPRAgreedPolicyUpdates(Context context, boolean z) {
        if (sContext == null) {
            init(context);
        }
        SharePreferenceHelper.setBoolean(SharePreferenceHelper.CONFIRM_GDPR_POLICY_UPDATES, z);
    }

    public static boolean checkIfGDPRAgreedPolicyUpdates(Context context) {
        if (bUserAgreedPolicyUpdates) {
            return true;
        }
        if (sContext == null) {
            init(context);
        }
        bUserAgreedPolicyUpdates = SharePreferenceHelper.getBoolean(SharePreferenceHelper.CONFIRM_GDPR_POLICY_UPDATES, !checkIsGDPREnforcedCountry(context));
        return bUserAgreedPolicyUpdates;
    }

    public static void setGDPRAgreedAdStayInformed(Context context, boolean z) {
        LogUtil.d("gdpr", "setGDPRAgreedAdStayInformed:" + z);
        if (sContext == null) {
            init(context);
        }
        SharePreferenceHelper.setBoolean(SharePreferenceHelper.CONFIRM_GDPR_AD_STAY_INFORMED_UPDATE, z);
    }

    public static boolean checkIfGDPRAgreedAdStayInformed(Context context) {
        if (bUserAgreedAdStayInformedUpdates) {
            return true;
        }
        if (sContext == null) {
            init(context);
        }
        bUserAgreedAdStayInformedUpdates = SharePreferenceHelper.getBoolean(SharePreferenceHelper.CONFIRM_GDPR_AD_STAY_INFORMED_UPDATE, !checkIsGDPREnforcedCountry(context));
        return bUserAgreedAdStayInformedUpdates;
    }

    public static boolean checkIfGDPRAgreed(Context context) {
        if (bUserAgreed) {
            return true;
        }
        if (sContext == null) {
            init(context);
        }
        bUserAgreed = checkIfGDPRAgreedPolicyUpdates(context) && checkIfGDPRAgreedAdStayInformed(context);
        return bUserAgreed;
    }

    public static void setGDPRAgreed(Context context) {
        setGDPRAgreedPolicyUpdates(context, true);
        setGDPRAgreedAdStayInformed(context, true);
    }

    public static boolean checkIfShowGDPRPolicyDialog(Context context) {
        return !checkIfGDPRAgreedPolicyUpdates(context) && checkIsGDPREnforcedCountry(context);
    }

    public static boolean checkIfUploadData(Context context) {
        if (bGdprEnable) {
            return bGdprEnable;
        }
        if (!checkIsGDPREnforcedCountry(context)) {
            bGdprEnable = true;
        } else {
            bGdprEnable = checkIfGDPRAgreed(context);
        }
        return bGdprEnable;
    }

    public void releaseGDPRDialogs() {
        if (mGDPRPolicyDialog != null && mGDPRPolicyDialog.isShowing()) {
            mGDPRPolicyDialog.dismiss();
            mGDPRPolicyDialog = null;
        }
        if (mGDPRCancelDialog == null || !mGDPRCancelDialog.isShowing()) {
            return;
        }
        mGDPRCancelDialog.dismiss();
        mGDPRCancelDialog = null;
    }

    public static void showGDPRPolicyAndAdStayInformedDialog(Activity activity, IGDPRDialogListener iGDPRDialogListener, int i) {
        if (mGDPRPolicyDialog != null && mGDPRPolicyDialog.isShowing()) {
            mGDPRPolicyDialog.dismiss();
        }
        mGDPRPolicyDialog = new GDPRPolicyDialog(activity, i);
        mGDPRPolicyDialog.setDialogListener(iGDPRDialogListener);
        mGDPRPolicyDialog.setCanceledOnTouchOutside(false);
        mGDPRPolicyDialog.show();
    }

    public static void showGDPRAdStayInformedDialog(Activity activity, IGDPRDialogListener iGDPRDialogListener, int i) {
        if (mGDPRPolicyDialog != null && mGDPRPolicyDialog.isShowing()) {
            mGDPRPolicyDialog.dismiss();
        }
        mGDPRPolicyDialog = new GDPRPolicyDialog(activity, i);
        mGDPRPolicyDialog.setDialogListener(iGDPRDialogListener);
        mGDPRPolicyDialog.setCanceledOnTouchOutside(false);
        mGDPRPolicyDialog.show();
    }

    public static void showGDPRCancelDialog(Activity activity, IGDPRDialogListener iGDPRDialogListener, int i) {
        if (mGDPRCancelDialog != null && mGDPRCancelDialog.isShowing()) {
            mGDPRCancelDialog.dismiss();
        }
        mGDPRCancelDialog = new GDPRCancelDialog(activity, i);
        mGDPRCancelDialog.setDialogListener(iGDPRDialogListener);
        mGDPRCancelDialog.setCanceledOnTouchOutside(false);
        mGDPRCancelDialog.show();
    }

    public static void showGDPRDialog(final Activity activity, String str) {
        if (activity == null) {
            return;
        }
        if (sContext == null) {
            init(activity);
        }
        mMsgReceiverName = str;
        if (checkIfShowGDPRPolicyDialog(activity)) {
            activity.runOnUiThread(new Runnable() { // from class: com.cmplay.policy.gdpr.GDPRController.2
                @Override // java.lang.Runnable
                public void run() {
                    GDPRController.showGDPRPolicyAndAdStayInformedDialog(activity, new IGDPRDialogListener() { // from class: com.cmplay.policy.gdpr.GDPRController.2.1
                        @Override // com.cmplay.policy.gdpr.IGDPRDialogListener
                        public void onPositiveClick() {
                            if (TextUtils.isEmpty(GDPRController.mMsgReceiverName)) {
                                return;
                            }
                            UnityPlayer.UnitySendMessage(GDPRController.mMsgReceiverName, "onGDPRAgree", String.valueOf(true));
                        }

                        @Override // com.cmplay.policy.gdpr.IGDPRDialogListener
                        public void onNegativeClick() {
                            if (TextUtils.isEmpty(GDPRController.mMsgReceiverName)) {
                                return;
                            }
                            UnityPlayer.UnitySendMessage(GDPRController.mMsgReceiverName, "onGDPRAgree", String.valueOf(false));
                        }
                    }, 1);
                }
            });
        } else {
            if (TextUtils.isEmpty(mMsgReceiverName)) {
                return;
            }
            UnityPlayer.UnitySendMessage(mMsgReceiverName, "onGDPRAgree", String.valueOf(true));
        }
    }

    public static void showGDPRDialog(Activity activity, final IAgreeListener iAgreeListener) {
        if (activity == null) {
            return;
        }
        if (sContext == null) {
            init(activity);
        }
        if (checkIfShowGDPRPolicyDialog(activity)) {
            showGDPRPolicyAndAdStayInformedDialog(activity, new IGDPRDialogListener() { // from class: com.cmplay.policy.gdpr.GDPRController.3
                @Override // com.cmplay.policy.gdpr.IGDPRDialogListener
                public void onPositiveClick() {
                    if (IAgreeListener.this != null) {
                        IAgreeListener.this.onGDPRAgreed(true);
                    }
                }

                @Override // com.cmplay.policy.gdpr.IGDPRDialogListener
                public void onNegativeClick() {
                    if (IAgreeListener.this != null) {
                        IAgreeListener.this.onGDPRAgreed(false);
                    }
                }
            }, 1);
        } else if (iAgreeListener != null) {
            iAgreeListener.onGDPRAgreed(true);
        }
    }

    public static String getMCC(Context context) {
        String simOperator;
        if (context == null || (simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator()) == null || simOperator.length() < 3) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) simOperator, 0, 3);
        return sb.toString();
    }

    public static int getMCCInt(Context context) {
        String mcc = getMCC(context);
        if (TextUtils.isEmpty(mcc)) {
            return -1;
        }
        try {
            return Integer.parseInt(mcc);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static String getLanguage(Context context) {
        if (context == null) {
            return null;
        }
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    public static String getCountry(Context context) {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    public static void setDebug(boolean z) {
        DEBUG = z;
    }

    public static boolean isDebug() {
        return DEBUG;
    }
}
