package com.google.firebase.auth.internal;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.firebase.FirebaseError;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.ironsource.cc;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.C3139z9;
import io.jsonwebtoken.JwtParser;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class zzao {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static Status zza(String str, String str2) {
        int i4;
        str.getClass();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -2130504259:
                if (str.equals("USER_CANCELLED")) {
                    c4 = 0;
                    break;
                }
                break;
            case -2065866930:
                if (str.equals("INVALID_RECIPIENT_EMAIL")) {
                    c4 = 1;
                    break;
                }
                break;
            case -2014808264:
                if (str.equals("WEB_CONTEXT_ALREADY_PRESENTED")) {
                    c4 = 2;
                    break;
                }
                break;
            case -2005236790:
                if (str.equals("INTERNAL_SUCCESS_SIGN_OUT")) {
                    c4 = 3;
                    break;
                }
                break;
            case -2001169389:
                if (str.equals("INVALID_IDP_RESPONSE")) {
                    c4 = 4;
                    break;
                }
                break;
            case -1944433728:
                if (str.equals("DYNAMIC_LINK_NOT_ACTIVATED")) {
                    c4 = 5;
                    break;
                }
                break;
            case -1800638118:
                if (str.equals("QUOTA_EXCEEDED")) {
                    c4 = 6;
                    break;
                }
                break;
            case -1774756919:
                if (str.equals("WEB_NETWORK_REQUEST_FAILED")) {
                    c4 = 7;
                    break;
                }
                break;
            case -1699246888:
                if (str.equals("INVALID_RECAPTCHA_VERSION")) {
                    c4 = '\b';
                    break;
                }
                break;
            case -1603818979:
                if (str.equals("RECAPTCHA_NOT_ENABLED")) {
                    c4 = '\t';
                    break;
                }
                break;
            case -1587614300:
                if (str.equals("EXPIRED_OOB_CODE")) {
                    c4 = '\n';
                    break;
                }
                break;
            case -1584641425:
                if (str.equals("UNAUTHORIZED_DOMAIN")) {
                    c4 = 11;
                    break;
                }
                break;
            case -1583894766:
                if (str.equals("INVALID_OOB_CODE")) {
                    c4 = '\f';
                    break;
                }
                break;
            case -1458751677:
                if (str.equals("MISSING_EMAIL")) {
                    c4 = '\r';
                    break;
                }
                break;
            case -1421414571:
                if (str.equals("INVALID_CODE")) {
                    c4 = 14;
                    break;
                }
                break;
            case -1368998244:
                if (str.equals("INVALID_HOSTING_LINK_DOMAIN")) {
                    c4 = 15;
                    break;
                }
                break;
            case -1345867105:
                if (str.equals("TOKEN_EXPIRED")) {
                    c4 = 16;
                    break;
                }
                break;
            case -1340100504:
                if (str.equals("INVALID_TENANT_ID")) {
                    c4 = 17;
                    break;
                }
                break;
            case -1242922234:
                if (str.equals("ALTERNATE_CLIENT_IDENTIFIER_REQUIRED")) {
                    c4 = 18;
                    break;
                }
                break;
            case -1232010689:
                if (str.equals("INVALID_SESSION_INFO")) {
                    c4 = 19;
                    break;
                }
                break;
            case -1202691903:
                if (str.equals("SECOND_FACTOR_EXISTS")) {
                    c4 = 20;
                    break;
                }
                break;
            case -1112393964:
                if (str.equals("INVALID_EMAIL")) {
                    c4 = 21;
                    break;
                }
                break;
            case -1063710844:
                if (str.equals("ADMIN_ONLY_OPERATION")) {
                    c4 = 22;
                    break;
                }
                break;
            case -974503964:
                if (str.equals("MISSING_OR_INVALID_NONCE")) {
                    c4 = 23;
                    break;
                }
                break;
            case -863830559:
                if (str.equals("INVALID_CERT_HASH")) {
                    c4 = 24;
                    break;
                }
                break;
            case -828507413:
                if (str.equals("NO_SUCH_PROVIDER")) {
                    c4 = 25;
                    break;
                }
                break;
            case -749743758:
                if (str.equals("MFA_ENROLLMENT_NOT_FOUND")) {
                    c4 = 26;
                    break;
                }
                break;
            case -736207500:
                if (str.equals("MISSING_PASSWORD")) {
                    c4 = 27;
                    break;
                }
                break;
            case -646022241:
                if (str.equals("CREDENTIAL_TOO_OLD_LOGIN_AGAIN")) {
                    c4 = 28;
                    break;
                }
                break;
            case -595928767:
                if (str.equals("TIMEOUT")) {
                    c4 = 29;
                    break;
                }
                break;
            case -505579581:
                if (str.equals("INVALID_REQ_TYPE")) {
                    c4 = 30;
                    break;
                }
                break;
            case -406804866:
                if (str.equals("INVALID_LOGIN_CREDENTIALS")) {
                    c4 = 31;
                    break;
                }
                break;
            case -380728810:
                if (str.equals("INVALID_RECAPTCHA_ACTION")) {
                    c4 = ' ';
                    break;
                }
                break;
            case -333672188:
                if (str.equals("OPERATION_NOT_ALLOWED")) {
                    c4 = '!';
                    break;
                }
                break;
            case -294485423:
                if (str.equals("WEB_INTERNAL_ERROR")) {
                    c4 = '\"';
                    break;
                }
                break;
            case -217128228:
                if (str.equals("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                    c4 = '#';
                    break;
                }
                break;
            case -122667194:
                if (str.equals("MISSING_MFA_ENROLLMENT_ID")) {
                    c4 = '$';
                    break;
                }
                break;
            case -75433118:
                if (str.equals("USER_NOT_FOUND")) {
                    c4 = '%';
                    break;
                }
                break;
            case -52772551:
                if (str.equals("CAPTCHA_CHECK_FAILED")) {
                    c4 = '&';
                    break;
                }
                break;
            case -40686718:
                if (str.equals("WEAK_PASSWORD")) {
                    c4 = '\'';
                    break;
                }
                break;
            case 15352275:
                if (str.equals("EMAIL_NOT_FOUND")) {
                    c4 = '(';
                    break;
                }
                break;
            case 210308040:
                if (str.equals("UNSUPPORTED_FIRST_FACTOR")) {
                    c4 = ')';
                    break;
                }
                break;
            case 269327773:
                if (str.equals("INVALID_SENDER")) {
                    c4 = '*';
                    break;
                }
                break;
            case 278802867:
                if (str.equals("MISSING_PHONE_NUMBER")) {
                    c4 = '+';
                    break;
                }
                break;
            case 408411681:
                if (str.equals("INVALID_DYNAMIC_LINK_DOMAIN")) {
                    c4 = ',';
                    break;
                }
                break;
            case 423563023:
                if (str.equals("MISSING_MFA_PENDING_CREDENTIAL")) {
                    c4 = '-';
                    break;
                }
                break;
            case 429251986:
                if (str.equals("UNSUPPORTED_PASSTHROUGH_OPERATION")) {
                    c4 = JwtParser.SEPARATOR_CHAR;
                    break;
                }
                break;
            case 483847807:
                if (str.equals("EMAIL_EXISTS")) {
                    c4 = '/';
                    break;
                }
                break;
            case 491979549:
                if (str.equals("INVALID_ID_TOKEN")) {
                    c4 = '0';
                    break;
                }
                break;
            case 492072102:
                if (str.equals("WEB_STORAGE_UNSUPPORTED")) {
                    c4 = '1';
                    break;
                }
                break;
            case 492515765:
                if (str.equals("MISSING_CLIENT_TYPE")) {
                    c4 = '2';
                    break;
                }
                break;
            case 530628231:
                if (str.equals("MISSING_RECAPTCHA_VERSION")) {
                    c4 = '3';
                    break;
                }
                break;
            case 542728406:
                if (str.equals("PASSWORD_LOGIN_DISABLED")) {
                    c4 = '4';
                    break;
                }
                break;
            case 582457886:
                if (str.equals("UNVERIFIED_EMAIL")) {
                    c4 = '5';
                    break;
                }
                break;
            case 605031096:
                if (str.equals("REJECTED_CREDENTIAL")) {
                    c4 = '6';
                    break;
                }
                break;
            case 745638750:
                if (str.equals("INVALID_MFA_PENDING_CREDENTIAL")) {
                    c4 = '7';
                    break;
                }
                break;
            case 786916712:
                if (str.equals("INVALID_VERIFICATION_PROOF")) {
                    c4 = '8';
                    break;
                }
                break;
            case 799258561:
                if (str.equals("INVALID_PROVIDER_ID")) {
                    c4 = '9';
                    break;
                }
                break;
            case 819646646:
                if (str.equals("CREDENTIAL_MISMATCH")) {
                    c4 = ':';
                    break;
                }
                break;
            case 844240628:
                if (str.equals("WEB_CONTEXT_CANCELED")) {
                    c4 = ';';
                    break;
                }
                break;
            case 886186878:
                if (str.equals("REQUIRES_SECOND_FACTOR_AUTH")) {
                    c4 = '<';
                    break;
                }
                break;
            case 895302372:
                if (str.equals("MISSING_CLIENT_IDENTIFIER")) {
                    c4 = cc.f15727T;
                    break;
                }
                break;
            case 922685102:
                if (str.equals("INVALID_MESSAGE_PAYLOAD")) {
                    c4 = '>';
                    break;
                }
                break;
            case 989000548:
                if (str.equals("RESET_PASSWORD_EXCEED_LIMIT")) {
                    c4 = '?';
                    break;
                }
                break;
            case 1034932393:
                if (str.equals("INVALID_PENDING_TOKEN")) {
                    c4 = '@';
                    break;
                }
                break;
            case 1072360691:
                if (str.equals("INVALID_CUSTOM_TOKEN")) {
                    c4 = 'A';
                    break;
                }
                break;
            case 1094975491:
                if (str.equals("INVALID_PASSWORD")) {
                    c4 = 'B';
                    break;
                }
                break;
            case 1107081238:
                if (str.equals("<<Network Error>>")) {
                    c4 = 'C';
                    break;
                }
                break;
            case 1113992697:
                if (str.equals("INVALID_RECAPTCHA_TOKEN")) {
                    c4 = 'D';
                    break;
                }
                break;
            case 1141576252:
                if (str.equals("SESSION_EXPIRED")) {
                    c4 = 'E';
                    break;
                }
                break;
            case 1199811910:
                if (str.equals("MISSING_CODE")) {
                    c4 = 'F';
                    break;
                }
                break;
            case 1226505451:
                if (str.equals("FEDERATED_USER_ID_ALREADY_LINKED")) {
                    c4 = 'G';
                    break;
                }
                break;
            case 1308491624:
                if (str.equals("MISSING_RECAPTCHA_TOKEN")) {
                    c4 = 'H';
                    break;
                }
                break;
            case 1388786705:
                if (str.equals("INVALID_IDENTIFIER")) {
                    c4 = 'I';
                    break;
                }
                break;
            case 1433767024:
                if (str.equals("USER_DISABLED")) {
                    c4 = 'J';
                    break;
                }
                break;
            case 1442968770:
                if (str.equals("INVALID_PHONE_NUMBER")) {
                    c4 = 'K';
                    break;
                }
                break;
            case 1494923453:
                if (str.equals("INVALID_APP_CREDENTIAL")) {
                    c4 = 'L';
                    break;
                }
                break;
            case 1497901284:
                if (str.equals("TOO_MANY_ATTEMPTS_TRY_LATER")) {
                    c4 = 'M';
                    break;
                }
                break;
            case 1803454477:
                if (str.equals("MISSING_CONTINUE_URI")) {
                    c4 = 'N';
                    break;
                }
                break;
            case 1898790704:
                if (str.equals("MISSING_SESSION_INFO")) {
                    c4 = 'O';
                    break;
                }
                break;
            case 2063209097:
                if (str.equals("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                    c4 = 'P';
                    break;
                }
                break;
            case 2082564316:
                if (str.equals("UNSUPPORTED_TENANT_OPERATION")) {
                    c4 = 'Q';
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                i4 = 18001;
                break;
            case 1:
                i4 = 17033;
                break;
            case 2:
                i4 = 17057;
                break;
            case 3:
                i4 = 17091;
                break;
            case 4:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                i4 = FirebaseError.ERROR_INVALID_CREDENTIAL;
                break;
            case 5:
                i4 = 17068;
                break;
            case 6:
                i4 = 17052;
                break;
            case 7:
                i4 = 17061;
                break;
            case '\b':
                i4 = 17206;
                break;
            case '\t':
                i4 = 17200;
                break;
            case '\n':
                i4 = 17029;
                break;
            case 11:
                i4 = 17038;
                break;
            case '\f':
                i4 = 17030;
                break;
            case '\r':
                i4 = 17034;
                break;
            case 14:
                i4 = 17044;
                break;
            case 15:
                i4 = 17214;
                break;
            case 16:
                i4 = FirebaseError.ERROR_USER_TOKEN_EXPIRED;
                break;
            case 17:
                i4 = 17079;
                break;
            case 18:
                i4 = 18002;
                break;
            case 19:
                i4 = 17046;
                break;
            case 20:
                i4 = 17087;
                break;
            case 21:
            case IronSourceConstants.TEST_SUITE_WEB_CONTROLLER_OPEN_SUCCESSFULLY /* 73 */:
                i4 = FirebaseError.ERROR_INVALID_EMAIL;
                break;
            case 22:
                i4 = 17085;
                break;
            case ConnectionResult.API_DISABLED /* 23 */:
                i4 = 17094;
                break;
            case 24:
                i4 = 17064;
                break;
            case 25:
                i4 = FirebaseError.ERROR_NO_SUCH_PROVIDER;
                break;
            case 26:
                i4 = 17084;
                break;
            case 27:
                i4 = 17035;
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                i4 = FirebaseError.ERROR_REQUIRES_RECENT_LOGIN;
                break;
            case 29:
            case 'C':
                i4 = FirebaseError.ERROR_NETWORK_REQUEST_FAILED;
                break;
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                i4 = 17207;
                break;
            case ' ':
                i4 = 17203;
                break;
            case '!':
            case IronSourceConstants.SET_USER_ID /* 52 */:
                i4 = FirebaseError.ERROR_OPERATION_NOT_ALLOWED;
                break;
            case '\"':
                i4 = 17062;
                break;
            case C3139z9.f40333J /* 35 */:
                i4 = 17088;
                break;
            case '$':
                i4 = 17082;
                break;
            case '%':
            case '(':
                i4 = FirebaseError.ERROR_USER_NOT_FOUND;
                break;
            case C3139z9.f40334K /* 38 */:
                i4 = 17056;
                break;
            case '\'':
                i4 = FirebaseError.ERROR_WEAK_PASSWORD;
                break;
            case ')':
                i4 = 17089;
                break;
            case '*':
                i4 = 17032;
                break;
            case '+':
                i4 = 17041;
                break;
            case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                i4 = 17074;
                break;
            case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                i4 = 17081;
                break;
            case '.':
                i4 = 17095;
                break;
            case '/':
                i4 = FirebaseError.ERROR_EMAIL_ALREADY_IN_USE;
                break;
            case '0':
                i4 = FirebaseError.ERROR_INVALID_USER_TOKEN;
                break;
            case '1':
                i4 = 17065;
                break;
            case '2':
                i4 = 17204;
                break;
            case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                i4 = 17205;
                break;
            case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                i4 = 17086;
                break;
            case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                i4 = 17075;
                break;
            case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                i4 = 17083;
                break;
            case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                i4 = 17049;
                break;
            case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                i4 = 17071;
                break;
            case ':':
                i4 = FirebaseError.ERROR_CUSTOM_TOKEN_MISMATCH;
                break;
            case ';':
                i4 = 17058;
                break;
            case '<':
                i4 = 17078;
                break;
            case '=':
                i4 = 17093;
                break;
            case IronSourceConstants.RETRY_LIMIT /* 62 */:
                i4 = 17031;
                break;
            case '?':
            case 'M':
                i4 = FirebaseError.ERROR_TOO_MANY_REQUESTS;
                break;
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                i4 = FirebaseError.ERROR_INVALID_CUSTOM_TOKEN;
                break;
            case 'B':
                i4 = FirebaseError.ERROR_WRONG_PASSWORD;
                break;
            case 'D':
                i4 = 17202;
                break;
            case 'E':
                i4 = 17051;
                break;
            case IronSourceConstants.TEST_SUITE_LAUNCH_TS /* 70 */:
                i4 = 17043;
                break;
            case IronSourceConstants.TEST_SUITE_OPENED_SUCCESSFULLY /* 71 */:
                i4 = FirebaseError.ERROR_CREDENTIAL_ALREADY_IN_USE;
                break;
            case IronSourceConstants.TEST_SUITE_FAILED_TO_OPEN /* 72 */:
                i4 = 17201;
                break;
            case IronSourceConstants.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD /* 74 */:
                i4 = FirebaseError.ERROR_USER_DISABLED;
                break;
            case 'K':
                i4 = 17042;
                break;
            case 'L':
                i4 = FirebaseError.ERROR_APP_NOT_AUTHORIZED;
                break;
            case 'N':
                i4 = 17040;
                break;
            case 'O':
                i4 = 17045;
                break;
            case 'P':
                i4 = 17090;
                break;
            case IronSourceConstants.TROUBLESHOOTING_AD_QUALITY_SDK_INITIALIZED_SUCCESSFULLY_EVENT /* 81 */:
                i4 = 17073;
                break;
            default:
                i4 = 17499;
                break;
        }
        if (i4 != 17499) {
            return new Status(i4, str2);
        }
        if (str2 == null) {
            return new Status(i4, str);
        }
        return new Status(i4, str + StringUtils.PROCESS_POSTFIX_DELIMITER + str2);
    }

    public static Status zza(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(FirebaseError.ERROR_INTERNAL_ERROR);
        }
        String[] split = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER, 2);
        split[0] = split[0].trim();
        if (split.length > 1 && (str2 = split[1]) != null) {
            split[1] = str2.trim();
        }
        List asList = Arrays.asList(split);
        if (asList.size() > 1) {
            return zza((String) asList.get(0), (String) asList.get(1));
        }
        return zza((String) asList.get(0), null);
    }
}
