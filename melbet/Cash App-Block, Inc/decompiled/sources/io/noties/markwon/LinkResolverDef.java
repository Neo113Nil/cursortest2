package io.noties.markwon;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;
import com.squareup.protos.multipass.service.Error;
import com.squareup.protos.payrollconnector.common.TaskType;
import com.squareup.protos.rewardly.ui.common.Icon;
import com.squareup.protos.timecards.ChangeProposal;
import com.squareup.scannerview.Rotation;
import com.stripe.android.model.StripeIntent;
import com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper;
import com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$Companion$create$1;
import com.withpersona.sdk2.camera.camera2.CameraChoice;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.time.Clock;
import kotlin.time.Instant;
import net.idrnd.face.iad.capture.internal.v0;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.intellij.markdown.parser.constraints.CommonMarkdownConstraints;
import papa.SafeTrace;
import squareup.cash.paychecks.BenefitsDetails;

/* loaded from: classes9.dex */
public final class LinkResolverDef implements Clock, Internal.ListAdapter.Converter {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ LinkResolverDef(int i) {
        this.$r8$classId = i;
    }

    public static final CommonMarkdownConstraints access$create(CommonMarkdownConstraints commonMarkdownConstraints, int i, char c, boolean z, int i2) {
        CommonMarkdownConstraints commonMarkdownConstraints2 = CommonMarkdownConstraints.BASE;
        int[] iArr = commonMarkdownConstraints.indents;
        int length = iArr.length;
        int i3 = length + 1;
        int[] copyOf = Arrays.copyOf(iArr, i3);
        char[] copyOf2 = Arrays.copyOf(commonMarkdownConstraints.types, i3);
        boolean[] copyOf3 = Arrays.copyOf(commonMarkdownConstraints.isExplicit, i3);
        copyOf[length] = commonMarkdownConstraints.getIndent() + i;
        copyOf2[length] = c;
        copyOf3[length] = z;
        return commonMarkdownConstraints.createNewConstraints(copyOf, copyOf2, copyOf3, i2);
    }

    public static StripeIntent.Status fromCode$payments_core_release(String str) {
        Object obj;
        EnumEntriesList enumEntriesList = StripeIntent.Status.$ENTRIES;
        ArrayIterator m = CameraState$Type$EnumUnboxingLocalUtility.m(enumEntriesList, enumEntriesList);
        while (true) {
            if (!m.hasNext()) {
                obj = null;
                break;
            }
            obj = m.next();
            if (((StripeIntent.Status) obj).code.equals(str)) {
                break;
            }
        }
        return (StripeIntent.Status) obj;
    }

    public static Rotation fromInt(int i) {
        int i2 = ((i % 360) + 360) % 360;
        if (i2 == 0) {
            return Rotation.ROTATION_0;
        }
        if (i2 == 90) {
            return Rotation.ROTATION_90;
        }
        if (i2 == 180) {
            return Rotation.ROTATION_180;
        }
        if (i2 == 270) {
            return Rotation.ROTATION_270;
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
        return null;
    }

    public static Error fromValue(int i) {
        if (i == 0) {
            return Error.NO_ERROR;
        }
        if (i == 5000) {
            return Error.OTK_INVALID;
        }
        if (i == 8012) {
            return Error.FEDERATED_ACCOUNT_ACTION_BLOCKED;
        }
        switch (i) {
            case IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO /* 1000 */:
                return Error.TEMPORARY_LOCKOUT;
            case IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO /* 1001 */:
                return Error.EMAIL_INVALID;
            case IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA /* 1002 */:
                return Error.USER_TOKEN_INVALID;
            case IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_COLOR_TABLE /* 1003 */:
                return Error.NEW_EMAIL_INVALID;
            case 1004:
                return Error.NEW_EMAIL_TAKEN;
            case IptcConstants.IMAGE_RESOURCE_BLOCK_RESOLUTION_INFO /* 1005 */:
                return Error.PHONE_INVALID;
            case IptcConstants.IMAGE_RESOURCE_BLOCK_ALPHA_CHANNELS_NAMES /* 1006 */:
                return Error.CAPTCHA_REQUIRED;
            case IptcConstants.IMAGE_RESOURCE_BLOCK_DISPLAY_INFO /* 1007 */:
                return Error.CAPTCHA_RESPONSE_INVALID;
            case IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION /* 1008 */:
                return Error.FORWARD_TO_MASTER;
            case IptcConstants.IMAGE_RESOURCE_BLOCK_BORDER_INFORMATION /* 1009 */:
                return Error.VERIFICATION_REQUIRED;
            case IptcConstants.IMAGE_RESOURCE_BLOCK_BACKGROUND_COLOR /* 1010 */:
                return Error.VERIFICATION_METHOD_INVALID;
            case IptcConstants.IMAGE_RESOURCE_BLOCK_PRINT_FLAGS /* 1011 */:
                return Error.VERIFICATION_CODE_NOT_SENT;
            case IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO /* 1012 */:
                return Error.ACCOUNT_LOCKED;
            case IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_HALFTONING_INFO /* 1013 */:
                return Error.ALIAS_IN_USE;
            case IptcConstants.IMAGE_RESOURCE_BLOCK_DUOTONE_HALFTONING_INFO /* 1014 */:
                return Error.ALIAS_INVALID;
            case IptcConstants.IMAGE_RESOURCE_BLOCK_BW_TRANSFER_FUNC /* 1015 */:
                return Error.ACCOUNT_ALREADY_CLAIMED;
            case IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS /* 1016 */:
                return Error.PROOF_OF_WORK_MISSING;
            case IptcConstants.IMAGE_RESOURCE_BLOCK_DUOTONE_TRANSFER_FUNCS /* 1017 */:
                return Error.PROOF_OF_WORK_INVALID;
            case IptcConstants.IMAGE_RESOURCE_BLOCK_DUOTONE_IMAGE_INFO /* 1018 */:
                return Error.PROOF_OF_WORK_EXPIRED;
            case IptcConstants.IMAGE_RESOURCE_BLOCK_EFFECTIVE_BW /* 1019 */:
                return Error.PROOF_OF_WORK_INCORRECT;
            case IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1 /* 1020 */:
                return Error.GENERATE_OTP_FAILED;
            case IptcConstants.IMAGE_RESOURCE_BLOCK_EPS_OPTIONS /* 1021 */:
                return Error.NEW_PHONE_INVALID;
            case IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO /* 1022 */:
                return Error.NEW_PHONE_TAKEN;
            case IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2 /* 1023 */:
                return Error.CAPTCHA_TYPE_INVALID;
            case 1024:
                return Error.ALIAS_MISSING;
            default:
                switch (i) {
                    case 2000:
                        return Error.PASSWORD_INVALID;
                    case 2001:
                        return Error.VERIFICATION_CODE_INVALID;
                    case 2002:
                        return Error.PASSWORD_REUSE;
                    case 2003:
                        return Error.PASSWORD_COMMON;
                    case 2004:
                        return Error.PASSWORD_COMPROMISED;
                    case 2005:
                        return Error.PASSWORD_FAILS_REQUIREMENTS;
                    case 2006:
                        return Error.PASSWORD_TOO_SHORT;
                    case 2007:
                        return Error.PASSWORD_TOO_LONG;
                    case 2008:
                        return Error.PASSWORD_SIMILAR_TO_EMAIL;
                    case 2009:
                        return Error.DORMANT_ACCOUNT;
                    case 2010:
                        return Error.SECURE_CONTACT_CONFLICT;
                    case 2011:
                        return Error.SECURE_CONTACT_VERIFICATION_REQUIRED;
                    case 2012:
                        return Error.SECURE_CONTACT_NOT_FOUND;
                    case 2013:
                        return Error.SECURE_CONTACT_ALIAS_CONFLICT;
                    case 2014:
                        return Error.RECOVERY_ATTEMPTS_EXCEEDED;
                    case 2015:
                        return Error.RECOVERY_DECISION_DECLINED;
                    case 2016:
                        return Error.RECOVERY_VERIFICATION_REQUIRED;
                    case 2017:
                        return Error.BLOCKED_SMS_NUMBER;
                    case 2018:
                        return Error.MANDATORY_2FA;
                    case 2019:
                        return Error.REGISTERED_PASSKEYS_LIMIT;
                    case 2020:
                        return Error.PASSKEY_REGISTRATION_FAILED;
                    case 2021:
                        return Error.PASSKEY_DEREGISTRATION_FAILED;
                    case 2022:
                        return Error.PASSKEY_AUTHENTICATION_FAILED;
                    case 2023:
                        return Error.PASSKEY_AUTHENTICATION_INVALID;
                    case 2024:
                        return Error.OIDC_STATE_INVALID;
                    case 2025:
                        return Error.OIDC_TOKEN_EXCHANGE_FAILED;
                    case 2026:
                        return Error.OIDC_ID_TOKEN_INVALID;
                    case 2027:
                        return Error.OIDC_AUTHORIZATION_DENIED;
                    case 2028:
                        return Error.OIDC_PROVIDER_CONFIG_INVALID;
                    case 2029:
                        return Error.OIDC_NONCE_MISMATCH;
                    case 2030:
                        return Error.OIDC_CODE_EXPIRED;
                    case 2031:
                        return Error.OIDC_CODE_INVALID;
                    case 2032:
                        return Error.OIDC_PROVIDER_NOT_FOUND;
                    case 2033:
                        return Error.OIDC_CALLBACK_INVALID;
                    case 2034:
                        return Error.OIDC_DOMAIN_NOT_AUTHORIZED;
                    case 2035:
                        return Error.OIDC_EMAIL_NOT_VERIFIED;
                    case 2036:
                        return Error.OIDC_REDIRECT_URI_INVALID;
                    default:
                        switch (i) {
                            case 3000:
                                return Error.SESSION_ID_INVALID;
                            case 3001:
                                return Error.SESSION_ID_EXPIRED;
                            case 3002:
                                return Error.SESSION_ID_TERMINATED;
                            case 3003:
                                return Error.SESSION_ID_IDLE;
                            case 3004:
                                return Error.SESSION_ID_INVALID_SELECTION;
                            case 3005:
                                return Error.SESSION_ID_ASSUMED_INVALID;
                            case 3006:
                                return Error.SESSION_SECONDARY_TOKEN_INVALID;
                            case 3007:
                                return Error.SESSION_COOKIE_INVALID;
                            case 3008:
                                return Error.ACCESS_TOKEN_INVALID;
                            case 3009:
                                return Error.OAUTH_SESSION_DISABLED;
                            case 3010:
                                return Error.TOKEN_INVALID;
                            case 3011:
                                return Error.IP_ADDRESS_INVALID;
                            case 3012:
                                return Error.ACCESS_TOKEN_EXPIRED;
                            case 3013:
                                return Error.ACCESS_TOKEN_REVOKED;
                            case 3014:
                                return Error.SESSION_ID_MISSING;
                            case 3015:
                                return Error.ACCESS_TOKEN_MISSING;
                            case 3016:
                                return Error.SESSION_ID_MULTIPLE;
                            case 3017:
                                return Error.ACCESS_TOKEN_MULTIPLE;
                            case 3018:
                                return Error.ACCESS_TOKEN_LEGACY_SANDBOX;
                            case 3019:
                                return Error.REFRESH_TOKEN_INVALID;
                            case 3020:
                                return Error.TWO_FACTOR_REQUIRED;
                            case 3021:
                                return Error.TARGET_TOKEN_MISSING;
                            case 3022:
                                return Error.TARGET_TOKEN_MULTIPLE;
                            case 3023:
                                return Error.ACTOR_ID_INVALID;
                            case 3024:
                                return Error.CALLER_CLIENT_OU_INVALID;
                            case 3025:
                                return Error.END_USER_CREDENTIAL_INVALID;
                            case 3026:
                                return Error.END_USER_CREDENTIAL_MULTIPLE;
                            case 3027:
                                return Error.END_USER_CREDENTIAL_EMPTY;
                            case 3028:
                                return Error.MTST_SESSION_INVALID;
                            case 3029:
                                return Error.MTST_ACTOR_REVOKED;
                            case 3030:
                                return Error.ACCESS_TOKEN_CREATION_FAILED;
                            default:
                                switch (i) {
                                    case 4000:
                                        return Error.DEVICE_DETAILS_INVALID;
                                    case 4001:
                                        return Error.DEVICE_CREDENTIAL_TOKEN_INVALID;
                                    case 4002:
                                        return Error.DEVICE_CREDENTIAL_LIMIT_EXCEEDED;
                                    case 4003:
                                        return Error.DEVICE_CREDENTIAL_EXPECTED_REGISTER_PRODUCT;
                                    case 4004:
                                        return Error.DEVICE_CREDENTIAL_EXPECTED_RETAIL_PRODUCT;
                                    case 4005:
                                        return Error.DEVICE_CREDENTIAL_EXPECTED_RESTAURANT_PRODUCT;
                                    case 4006:
                                        return Error.DEVICE_CREDENTIAL_ALREADY_PAIRED;
                                    case 4007:
                                        return Error.DEVICE_CREDENTIAL_EXPECTED_KDS_PRODUCT;
                                    case 4008:
                                        return Error.DEVICE_CREDENTIAL_EXPECTED_RESTAURANT_MOBILE_PRODUCT;
                                    case 4009:
                                        return Error.DEVICE_CREDENTIAL_SOFTWARE_UPDATE_REQUIRED;
                                    case 4010:
                                        return Error.DEVICE_CREDENTIAL_UNPAIRED_LIMIT_EXCEEDED;
                                    case 4011:
                                        return Error.DEVICE_CREDENTIAL_EXPECTED_TERMINAL_API_PRODUCT;
                                    case 4012:
                                        return Error.DEVICE_CREDENTIAL_EXPECTED_FNB_KIOSK_PRODUCT;
                                    case 4013:
                                        return Error.DEVICE_CREDENTIAL_EXPECTED_INVOICES_PRODUCT;
                                    case 4014:
                                        return Error.DEVICE_CREDENTIAL_CREATE_POLICY_FAILED;
                                    case 4015:
                                        return Error.DEVICE_SUPER_POS_APP_REQUIRED;
                                    case 4016:
                                        return Error.DEVICE_CREDENTIAL_EXPECTED_KIOSK_PRODUCT;
                                    case 4017:
                                        return Error.DEVICE_CREDENTIAL_EXPECTED_SQUID_KIOSK_PRODUCT;
                                    default:
                                        switch (i) {
                                            case 6000:
                                                return Error.REPLICATION_LAG;
                                            case 6001:
                                                return Error.RATE_LIMITED;
                                            case 6002:
                                                return Error.RETRIED_AFTER_SUCCESS;
                                            default:
                                                switch (i) {
                                                    case 7000:
                                                        return Error.MERCHANT_INVALID;
                                                    case 7001:
                                                        return Error.UNIT_INVALID;
                                                    case 7002:
                                                        return Error.APPLICATION_NOT_ALLOWED;
                                                    case 7003:
                                                        return Error.REDIRECT_URL_INVALID;
                                                    case 7004:
                                                        return Error.PERSON_TOKEN_INVALID;
                                                    case 7005:
                                                        return Error.EMPLOYMENTS_INVALID;
                                                    default:
                                                        switch (i) {
                                                            case 8000:
                                                                return Error.CREDENTIAL_TOKEN_INVALID;
                                                            case 8001:
                                                                return Error.PERSON_TOKEN_INVALID_CASH_USER;
                                                            case 8002:
                                                                return Error.CASH_APP_MERCHANT_NO_LOGIN;
                                                            case 8003:
                                                                return Error.DEVICE_CREDENTIAL_EXPECTED_APPOINTMENTS_PRODUCT;
                                                            case 8004:
                                                                return Error.LOGIN_AUTHORIZATION_FAILED;
                                                            case 8005:
                                                                return Error.SANCTIONED_ALIAS_INVALID;
                                                            case 8006:
                                                                return Error.CASH_CUSTOMER_TOKEN_MISSING;
                                                            case 8007:
                                                                return Error.CASH_CUSTOMER_HAS_NO_SQUARE_PERSON;
                                                            case 8008:
                                                                return Error.PERSON_TOKEN_LOOKUP_FAILED;
                                                            case 8009:
                                                                return Error.FEDERATED_ACCOUNT_NOT_LOCKABLE;
                                                            case 8010:
                                                                return Error.FEDERATED_ACCOUNT_NO_PASSWORD;
                                                            default:
                                                                switch (i) {
                                                                    case 9000:
                                                                        return Error.NOT_FOUND;
                                                                    case 9001:
                                                                        return Error.FEATURE_DISABLED;
                                                                    case 9002:
                                                                        return Error.NOT_ELIGIBLE;
                                                                    case 9003:
                                                                        return Error.IDV_PENDING;
                                                                    case 9004:
                                                                        return Error.ACCESS_DENIED;
                                                                    case 9005:
                                                                        return Error.INVITATION_ALREADY_ACCEPTED;
                                                                    case 9006:
                                                                        return Error.EMPLOYEE_PERMISSION_ALLOW_MASK_INVALID;
                                                                    default:
                                                                        return null;
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public Object convert(Object obj) {
        v0 v0Var;
        switch (((Integer) obj).intValue()) {
            case 0:
                v0Var = v0.root_management_apps_found;
                break;
            case 1:
                v0Var = v0.potentially_dangerous_apps_found;
                break;
            case 2:
                v0Var = v0.binary_su_found;
                break;
            case 3:
                v0Var = v0.executable_su_found;
                break;
            case 4:
                v0Var = v0.executable_su_found_by_native_call;
                break;
            case 5:
                v0Var = v0.paths_that_should_not_be_writable_found;
                break;
            case 6:
                v0Var = v0.test_keys_found;
                break;
            case 7:
                v0Var = v0.magisk_binary_found;
                break;
            default:
                v0Var = null;
                break;
        }
        return v0Var == null ? v0.UNRECOGNIZED : v0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object create(CameraChoice cameraChoice, CameraCharacteristics cameraCharacteristics, ArrayList arrayList, CameraDevice cameraDevice, Handler handler, ContinuationImpl continuationImpl) {
        CameraCaptureSessionWrapper$Companion$create$1 cameraCaptureSessionWrapper$Companion$create$1;
        int i;
        CameraCaptureSessionWrapper cameraCaptureSessionWrapper;
        CameraCaptureSessionWrapper cameraCaptureSessionWrapper2;
        if (continuationImpl instanceof CameraCaptureSessionWrapper$Companion$create$1) {
            cameraCaptureSessionWrapper$Companion$create$1 = (CameraCaptureSessionWrapper$Companion$create$1) continuationImpl;
            int i2 = cameraCaptureSessionWrapper$Companion$create$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cameraCaptureSessionWrapper$Companion$create$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cameraCaptureSessionWrapper$Companion$create$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraCaptureSessionWrapper$Companion$create$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CameraCaptureSessionWrapper cameraCaptureSessionWrapper3 = new CameraCaptureSessionWrapper(cameraChoice, arrayList, handler, cameraCharacteristics);
                    cameraCaptureSessionWrapper$Companion$create$1.L$0 = cameraCaptureSessionWrapper3;
                    cameraCaptureSessionWrapper$Companion$create$1.L$1 = cameraCaptureSessionWrapper3;
                    cameraCaptureSessionWrapper$Companion$create$1.label = 1;
                    Object access$createCaptureSession = CameraCaptureSessionWrapper.access$createCaptureSession(cameraCaptureSessionWrapper3, cameraDevice, cameraCaptureSessionWrapper$Companion$create$1);
                    if (access$createCaptureSession == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    cameraCaptureSessionWrapper = cameraCaptureSessionWrapper3;
                    obj = access$createCaptureSession;
                    cameraCaptureSessionWrapper2 = cameraCaptureSessionWrapper;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cameraCaptureSessionWrapper2 = cameraCaptureSessionWrapper$Companion$create$1.L$1;
                    cameraCaptureSessionWrapper = cameraCaptureSessionWrapper$Companion$create$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                cameraCaptureSessionWrapper2.session = (CameraCaptureSession) obj;
                return cameraCaptureSessionWrapper;
            }
        }
        cameraCaptureSessionWrapper$Companion$create$1 = new CameraCaptureSessionWrapper$Companion$create$1(this, continuationImpl);
        Object obj2 = cameraCaptureSessionWrapper$Companion$create$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraCaptureSessionWrapper$Companion$create$1.label;
        if (i != 0) {
        }
        cameraCaptureSessionWrapper2.session = (CameraCaptureSession) obj2;
        return cameraCaptureSessionWrapper;
    }

    @Override // kotlin.time.Clock
    public Instant now() {
        java.time.Instant now = java.time.Instant.now();
        now.getClass();
        Instant.Companion companion = Instant.Companion;
        return Instant.Companion.fromEpochSeconds(now.getNano(), now.getEpochSecond());
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 20:
                return "opentelemetry-trace-span-key";
            default:
                return super.toString();
        }
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static Icon m4117fromValue(int i) {
        switch (i) {
            case 1:
                return Icon.TRENDING_ARROW;
            case 2:
                return Icon.MAX_UP_ARROW;
            case 3:
                return Icon.CLOCK;
            case 4:
                return Icon.LOCK;
            case 5:
                return Icon.PRICE_TAG;
            case 6:
                return Icon.RECURRING_ARROW;
            case 7:
                return Icon.RATE_LIMITING_PAUSE;
            case 8:
                return Icon.UNLOCKED;
            case 9:
                return Icon.PLAY;
            case 10:
                return Icon.CARD;
            case 11:
                return Icon.GLOBE;
            default:
                return null;
        }
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static BenefitsDetails.State m4119fromValue(int i) {
        if (i == 0) {
            return BenefitsDetails.State.UNSPECIFIED;
        }
        if (i == 1) {
            return BenefitsDetails.State.NULL_STATE;
        }
        if (i == 2) {
            return BenefitsDetails.State.PENDING_STATE;
        }
        if (i == 3) {
            return BenefitsDetails.State.ACTIVE_STATE;
        }
        if (i != 4) {
            return null;
        }
        return BenefitsDetails.State.INACTIVE_STATE;
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static ChangeProposal.State m4118fromValue(int i) {
        switch (i) {
            case 0:
                return ChangeProposal.State.DO_NOT_USE;
            case 1:
                return ChangeProposal.State.PENDING_ACCEPTANCE;
            case 2:
                return ChangeProposal.State.PENDING_AUTHORIZATION;
            case 3:
                return ChangeProposal.State.AUTHORIZED;
            case 4:
                return ChangeProposal.State.DECLINED;
            case 5:
                return ChangeProposal.State.FORBIDDEN;
            case 6:
                return ChangeProposal.State.CANCELED;
            case 7:
                return ChangeProposal.State.OBSOLETE;
            case 8:
                return ChangeProposal.State.EXPIRED;
            default:
                return null;
        }
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static TaskType m4116fromValue(int i) {
        switch (i) {
            case 1:
                return TaskType.PAYSTUBS;
            case 2:
                return TaskType.INCOME;
            case 3:
                return TaskType.EMPLOYMENT;
            case 4:
                return TaskType.SHIFTS;
            case 5:
                return TaskType.DIRECT_DEPOSIT_SWITCH;
            case 6:
                return TaskType.DIRECT_DEPOSIT_PAYMENT;
            case 7:
                return TaskType.DIRECT_DEPOSIT_ALLOCATIONS;
            case 8:
                return TaskType.IDENTITY;
            case 9:
                return TaskType.TAX_FORMS;
            case 10:
                return TaskType.PAYOUT_CARDS;
            case 11:
                return TaskType.CARD_SWITCH;
            case 12:
                return TaskType.COMPANY_CENSUS;
            case 13:
                return TaskType.COMPANY_EMPLOYMENTS;
            case 14:
                return TaskType.COMPANY_INCOMES;
            case 15:
                return TaskType.BILL_CANCELLATION;
            default:
                return null;
        }
    }
}
