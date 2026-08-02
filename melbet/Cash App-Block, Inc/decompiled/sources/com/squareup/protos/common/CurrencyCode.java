package com.squareup.protos.common;

import androidx.room.RoomDatabase;
import com.knotapi.knot.utilities.Constants;
import com.plaid.internal.EnumC0170g;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0003\b¼\u0001\b\u0086\u0081\u0002\u0018\u0000 ¿\u00012\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002¿\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001¨\u0006À\u0001"}, d2 = {"Lcom/squareup/protos/common/CurrencyCode;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BOV", "BRL", "BSD", "BTN", "BWP", "BYR", "BZD", "CAD", "CDF", "CHE", "CHF", "CHW", "CLF", "CLP", "CNY", "COP", "COU", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "INR", "IQD", "IRR", "ISK", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LTL", "LVL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MUR", "MVR", "MWK", "MXN", "MXV", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD", "SSP", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TWD", "TZS", "UAH", "UGX", "USD", "USN", "USS", "UYI", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XAG", "XAU", "XBA", "XBB", "XBC", "XBD", "XCD", "XDR", "XOF", "XPD", "XPF", "XPT", "XTS", "XXX", "YER", "ZAR", "ZMK", "ZMW", "BTC", "XUS", "SLE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CurrencyCode implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CurrencyCode[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final CurrencyCode AED = new CurrencyCode("AED", 0, 784);
    public static final CurrencyCode AFN = new CurrencyCode("AFN", 1, 971);
    public static final CurrencyCode ALL = new CurrencyCode("ALL", 2, 8);
    public static final CurrencyCode AMD = new CurrencyCode("AMD", 3, 51);
    public static final CurrencyCode ANG = new CurrencyCode("ANG", 4, 532);
    public static final CurrencyCode AOA = new CurrencyCode("AOA", 5, 973);
    public static final CurrencyCode ARS = new CurrencyCode("ARS", 6, 32);
    public static final CurrencyCode AUD = new CurrencyCode("AUD", 7, 36);
    public static final CurrencyCode AWG = new CurrencyCode("AWG", 8, 533);
    public static final CurrencyCode AZN = new CurrencyCode("AZN", 9, 944);
    public static final CurrencyCode BAM = new CurrencyCode("BAM", 10, 977);
    public static final CurrencyCode BBD = new CurrencyCode("BBD", 11, 52);
    public static final CurrencyCode BDT = new CurrencyCode("BDT", 12, 50);
    public static final CurrencyCode BGN = new CurrencyCode("BGN", 13, 975);
    public static final CurrencyCode BHD = new CurrencyCode("BHD", 14, 48);
    public static final CurrencyCode BIF = new CurrencyCode("BIF", 15, 108);
    public static final CurrencyCode BMD = new CurrencyCode("BMD", 16, 60);
    public static final CurrencyCode BND = new CurrencyCode("BND", 17, 96);
    public static final CurrencyCode BOB = new CurrencyCode("BOB", 18, 68);
    public static final CurrencyCode BOV = new CurrencyCode("BOV", 19, 984);
    public static final CurrencyCode BRL = new CurrencyCode("BRL", 20, 986);
    public static final CurrencyCode BSD = new CurrencyCode("BSD", 21, 44);
    public static final CurrencyCode BTN = new CurrencyCode("BTN", 22, 64);
    public static final CurrencyCode BWP = new CurrencyCode("BWP", 23, 72);
    public static final CurrencyCode BYR = new CurrencyCode("BYR", 24, 974);
    public static final CurrencyCode BZD = new CurrencyCode("BZD", 25, 84);
    public static final CurrencyCode CAD = new CurrencyCode("CAD", 26, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
    public static final CurrencyCode CDF = new CurrencyCode("CDF", 27, 976);
    public static final CurrencyCode CHE = new CurrencyCode("CHE", 28, 947);
    public static final CurrencyCode CHF = new CurrencyCode("CHF", 29, 756);
    public static final CurrencyCode CHW = new CurrencyCode("CHW", 30, 948);
    public static final CurrencyCode CLF = new CurrencyCode("CLF", 31, 990);
    public static final CurrencyCode CLP = new CurrencyCode("CLP", 32, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE);
    public static final CurrencyCode CNY = new CurrencyCode("CNY", 33, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE);
    public static final CurrencyCode COP = new CurrencyCode("COP", 34, EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
    public static final CurrencyCode COU = new CurrencyCode("COU", 35, 970);
    public static final CurrencyCode CRC = new CurrencyCode("CRC", 36, 188);
    public static final CurrencyCode CUC = new CurrencyCode("CUC", 37, 931);
    public static final CurrencyCode CUP = new CurrencyCode("CUP", 38, 192);
    public static final CurrencyCode CVE = new CurrencyCode("CVE", 39, EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE);
    public static final CurrencyCode CZK = new CurrencyCode("CZK", 40, EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE);
    public static final CurrencyCode DJF = new CurrencyCode("DJF", 41, EnumC0170g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE);
    public static final CurrencyCode DKK = new CurrencyCode("DKK", 42, EnumC0170g.SDK_ASSET_ICON_INCOME_VALUE);
    public static final CurrencyCode DOP = new CurrencyCode("DOP", 43, EnumC0170g.SDK_ASSET_ICON_PIN_VALUE);
    public static final CurrencyCode DZD = new CurrencyCode("DZD", 44, 12);
    public static final CurrencyCode EGP = new CurrencyCode("EGP", 45, 818);
    public static final CurrencyCode ERN = new CurrencyCode("ERN", 46, EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
    public static final CurrencyCode ETB = new CurrencyCode("ETB", 47, EnumC0170g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE);
    public static final CurrencyCode EUR = new CurrencyCode("EUR", 48, 978);
    public static final CurrencyCode FJD = new CurrencyCode("FJD", 49, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE);
    public static final CurrencyCode FKP = new CurrencyCode("FKP", 50, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE);
    public static final CurrencyCode GBP = new CurrencyCode("GBP", 51, 826);
    public static final CurrencyCode GEL = new CurrencyCode("GEL", 52, 981);
    public static final CurrencyCode GHS = new CurrencyCode("GHS", 53, 936);
    public static final CurrencyCode GIP = new CurrencyCode("GIP", 54, EnumC0170g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE);
    public static final CurrencyCode GMD = new CurrencyCode("GMD", 55, EnumC0170g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE);
    public static final CurrencyCode GNF = new CurrencyCode("GNF", 56, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
    public static final CurrencyCode GTQ = new CurrencyCode("GTQ", 57, 320);
    public static final CurrencyCode GYD = new CurrencyCode("GYD", 58, EnumC0170g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE);
    public static final CurrencyCode HKD = new CurrencyCode("HKD", 59, 344);
    public static final CurrencyCode HNL = new CurrencyCode("HNL", 60, 340);
    public static final CurrencyCode HRK = new CurrencyCode("HRK", 61, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
    public static final CurrencyCode HTG = new CurrencyCode("HTG", 62, 332);
    public static final CurrencyCode HUF = new CurrencyCode("HUF", 63, 348);
    public static final CurrencyCode IDR = new CurrencyCode("IDR", 64, 360);
    public static final CurrencyCode ILS = new CurrencyCode("ILS", 65, 376);
    public static final CurrencyCode INR = new CurrencyCode("INR", 66, 356);
    public static final CurrencyCode IQD = new CurrencyCode("IQD", 67, 368);
    public static final CurrencyCode IRR = new CurrencyCode("IRR", 68, 364);
    public static final CurrencyCode ISK = new CurrencyCode("ISK", 69, 352);
    public static final CurrencyCode JMD = new CurrencyCode("JMD", 70, 388);
    public static final CurrencyCode JOD = new CurrencyCode("JOD", 71, 400);
    public static final CurrencyCode JPY = new CurrencyCode("JPY", 72, 392);
    public static final CurrencyCode KES = new CurrencyCode("KES", 73, HttpStatusCode.NOT_FOUND_404);
    public static final CurrencyCode KGS = new CurrencyCode("KGS", 74, 417);
    public static final CurrencyCode KHR = new CurrencyCode("KHR", 75, 116);
    public static final CurrencyCode KMF = new CurrencyCode("KMF", 76, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE);
    public static final CurrencyCode KPW = new CurrencyCode("KPW", 77, 408);
    public static final CurrencyCode KRW = new CurrencyCode("KRW", 78, 410);
    public static final CurrencyCode KWD = new CurrencyCode("KWD", 79, 414);
    public static final CurrencyCode KYD = new CurrencyCode("KYD", 80, 136);
    public static final CurrencyCode KZT = new CurrencyCode("KZT", 81, 398);
    public static final CurrencyCode LAK = new CurrencyCode("LAK", 82, 418);
    public static final CurrencyCode LBP = new CurrencyCode("LBP", 83, HttpStatusCode.UNPROCESSABLE_ENTITY_422);
    public static final CurrencyCode LKR = new CurrencyCode("LKR", 84, 144);
    public static final CurrencyCode LRD = new CurrencyCode("LRD", 85, 430);
    public static final CurrencyCode LSL = new CurrencyCode("LSL", 86, 426);
    public static final CurrencyCode LTL = new CurrencyCode("LTL", 87, 440);
    public static final CurrencyCode LVL = new CurrencyCode("LVL", 88, 428);
    public static final CurrencyCode LYD = new CurrencyCode("LYD", 89, 434);
    public static final CurrencyCode MAD = new CurrencyCode("MAD", 90, 504);
    public static final CurrencyCode MDL = new CurrencyCode("MDL", 91, 498);
    public static final CurrencyCode MGA = new CurrencyCode("MGA", 92, 969);
    public static final CurrencyCode MKD = new CurrencyCode("MKD", 93, 807);
    public static final CurrencyCode MMK = new CurrencyCode("MMK", 94, 104);
    public static final CurrencyCode MNT = new CurrencyCode("MNT", 95, 496);
    public static final CurrencyCode MOP = new CurrencyCode("MOP", 96, 446);
    public static final CurrencyCode MRO = new CurrencyCode("MRO", 97, 478);
    public static final CurrencyCode MUR = new CurrencyCode("MUR", 98, 480);
    public static final CurrencyCode MVR = new CurrencyCode("MVR", 99, 462);
    public static final CurrencyCode MWK = new CurrencyCode("MWK", 100, Constants.METRO_BY_T_MOBILE);
    public static final CurrencyCode MXN = new CurrencyCode("MXN", 101, 484);
    public static final CurrencyCode MXV = new CurrencyCode("MXV", 102, 979);
    public static final CurrencyCode MYR = new CurrencyCode("MYR", 103, 458);
    public static final CurrencyCode MZN = new CurrencyCode("MZN", 104, 943);
    public static final CurrencyCode NAD = new CurrencyCode("NAD", 105, 516);
    public static final CurrencyCode NGN = new CurrencyCode("NGN", 106, 566);
    public static final CurrencyCode NIO = new CurrencyCode("NIO", 107, 558);
    public static final CurrencyCode NOK = new CurrencyCode("NOK", 108, 578);
    public static final CurrencyCode NPR = new CurrencyCode("NPR", 109, 524);
    public static final CurrencyCode NZD = new CurrencyCode("NZD", 110, 554);
    public static final CurrencyCode OMR = new CurrencyCode("OMR", 111, 512);
    public static final CurrencyCode PAB = new CurrencyCode("PAB", 112, 590);
    public static final CurrencyCode PEN = new CurrencyCode("PEN", 113, 604);
    public static final CurrencyCode PGK = new CurrencyCode("PGK", 114, 598);
    public static final CurrencyCode PHP = new CurrencyCode("PHP", 115, 608);
    public static final CurrencyCode PKR = new CurrencyCode("PKR", 116, 586);
    public static final CurrencyCode PLN = new CurrencyCode("PLN", 117, 985);
    public static final CurrencyCode PYG = new CurrencyCode("PYG", 118, 600);
    public static final CurrencyCode QAR = new CurrencyCode("QAR", 119, 634);
    public static final CurrencyCode RON = new CurrencyCode("RON", 120, 946);
    public static final CurrencyCode RSD = new CurrencyCode("RSD", 121, 941);
    public static final CurrencyCode RUB = new CurrencyCode("RUB", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 643);
    public static final CurrencyCode RWF = new CurrencyCode("RWF", EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 646);
    public static final CurrencyCode SAR = new CurrencyCode("SAR", EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 682);
    public static final CurrencyCode SBD = new CurrencyCode("SBD", 125, 90);
    public static final CurrencyCode SCR = new CurrencyCode("SCR", EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 690);
    public static final CurrencyCode SDG = new CurrencyCode("SDG", 127, 938);
    public static final CurrencyCode SEK = new CurrencyCode("SEK", 128, 752);
    public static final CurrencyCode SGD = new CurrencyCode("SGD", EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 702);
    public static final CurrencyCode SHP = new CurrencyCode("SHP", EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 654);
    public static final CurrencyCode SLL = new CurrencyCode("SLL", 131, 694);
    public static final CurrencyCode SOS = new CurrencyCode("SOS", EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, 706);
    public static final CurrencyCode SRD = new CurrencyCode("SRD", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 968);
    public static final CurrencyCode SSP = new CurrencyCode("SSP", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, 728);
    public static final CurrencyCode STD = new CurrencyCode("STD", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, 678);
    public static final CurrencyCode SVC = new CurrencyCode("SVC", 136, EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE);
    public static final CurrencyCode SYP = new CurrencyCode("SYP", EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, 760);
    public static final CurrencyCode SZL = new CurrencyCode("SZL", EnumC0170g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, 748);
    public static final CurrencyCode THB = new CurrencyCode("THB", EnumC0170g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 764);
    public static final CurrencyCode TJS = new CurrencyCode("TJS", 140, 972);
    public static final CurrencyCode TMT = new CurrencyCode("TMT", EnumC0170g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, 934);
    public static final CurrencyCode TND = new CurrencyCode("TND", EnumC0170g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, 788);
    public static final CurrencyCode TOP = new CurrencyCode("TOP", EnumC0170g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, 776);
    public static final CurrencyCode TRY = new CurrencyCode("TRY", 144, 949);
    public static final CurrencyCode TTD = new CurrencyCode("TTD", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, 780);
    public static final CurrencyCode TWD = new CurrencyCode("TWD", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, 901);
    public static final CurrencyCode TZS = new CurrencyCode("TZS", 147, 834);
    public static final CurrencyCode UAH = new CurrencyCode("UAH", EnumC0170g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE, 980);
    public static final CurrencyCode UGX = new CurrencyCode("UGX", EnumC0170g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, 800);
    public static final CurrencyCode USD = new CurrencyCode("USD", 150, 840);
    public static final CurrencyCode USN = new CurrencyCode("USN", 151, 997);
    public static final CurrencyCode USS = new CurrencyCode("USS", EnumC0170g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, 998);
    public static final CurrencyCode UYI = new CurrencyCode("UYI", 153, 940);
    public static final CurrencyCode UYU = new CurrencyCode("UYU", EnumC0170g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, 858);
    public static final CurrencyCode UZS = new CurrencyCode("UZS", EnumC0170g.SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE, 860);
    public static final CurrencyCode VEF = new CurrencyCode("VEF", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE, 937);
    public static final CurrencyCode VND = new CurrencyCode("VND", EnumC0170g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, 704);
    public static final CurrencyCode VUV = new CurrencyCode("VUV", EnumC0170g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 548);
    public static final CurrencyCode WST = new CurrencyCode("WST", EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, 882);
    public static final CurrencyCode XAF = new CurrencyCode("XAF", EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, 950);
    public static final CurrencyCode XAG = new CurrencyCode("XAG", EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, 961);
    public static final CurrencyCode XAU = new CurrencyCode("XAU", EnumC0170g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, 959);
    public static final CurrencyCode XBA = new CurrencyCode("XBA", EnumC0170g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, 955);
    public static final CurrencyCode XBB = new CurrencyCode("XBB", EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 956);
    public static final CurrencyCode XBC = new CurrencyCode("XBC", 165, 957);
    public static final CurrencyCode XBD = new CurrencyCode("XBD", EnumC0170g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, 958);
    public static final CurrencyCode XCD = new CurrencyCode("XCD", 167, 951);
    public static final CurrencyCode XDR = new CurrencyCode("XDR", EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, 960);
    public static final CurrencyCode XOF = new CurrencyCode("XOF", EnumC0170g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, 952);
    public static final CurrencyCode XPD = new CurrencyCode("XPD", EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 964);
    public static final CurrencyCode XPF = new CurrencyCode("XPF", EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, 953);
    public static final CurrencyCode XPT = new CurrencyCode("XPT", EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, 962);
    public static final CurrencyCode XTS = new CurrencyCode("XTS", EnumC0170g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, 963);
    public static final CurrencyCode XXX = new CurrencyCode("XXX", EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, RoomDatabase.MAX_BIND_PARAMETER_CNT);
    public static final CurrencyCode YER = new CurrencyCode("YER", EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, 886);
    public static final CurrencyCode ZAR = new CurrencyCode("ZAR", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, 710);
    public static final CurrencyCode ZMK = new CurrencyCode("ZMK", EnumC0170g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 894);
    public static final CurrencyCode ZMW = new CurrencyCode("ZMW", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, 967);
    public static final CurrencyCode BTC = new CurrencyCode("BTC", EnumC0170g.SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE, IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO);
    public static final CurrencyCode XUS = new CurrencyCode("XUS", EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA);
    public static final CurrencyCode SLE = new CurrencyCode("SLE", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, 925);

    private static final /* synthetic */ CurrencyCode[] $values() {
        return new CurrencyCode[]{AED, AFN, ALL, AMD, ANG, AOA, ARS, AUD, AWG, AZN, BAM, BBD, BDT, BGN, BHD, BIF, BMD, BND, BOB, BOV, BRL, BSD, BTN, BWP, BYR, BZD, CAD, CDF, CHE, CHF, CHW, CLF, CLP, CNY, COP, COU, CRC, CUC, CUP, CVE, CZK, DJF, DKK, DOP, DZD, EGP, ERN, ETB, EUR, FJD, FKP, GBP, GEL, GHS, GIP, GMD, GNF, GTQ, GYD, HKD, HNL, HRK, HTG, HUF, IDR, ILS, INR, IQD, IRR, ISK, JMD, JOD, JPY, KES, KGS, KHR, KMF, KPW, KRW, KWD, KYD, KZT, LAK, LBP, LKR, LRD, LSL, LTL, LVL, LYD, MAD, MDL, MGA, MKD, MMK, MNT, MOP, MRO, MUR, MVR, MWK, MXN, MXV, MYR, MZN, NAD, NGN, NIO, NOK, NPR, NZD, OMR, PAB, PEN, PGK, PHP, PKR, PLN, PYG, QAR, RON, RSD, RUB, RWF, SAR, SBD, SCR, SDG, SEK, SGD, SHP, SLL, SOS, SRD, SSP, STD, SVC, SYP, SZL, THB, TJS, TMT, TND, TOP, TRY, TTD, TWD, TZS, UAH, UGX, USD, USN, USS, UYI, UYU, UZS, VEF, VND, VUV, WST, XAF, XAG, XAU, XBA, XBB, XBC, XBD, XCD, XDR, XOF, XPD, XPF, XPT, XTS, XXX, YER, ZAR, ZMK, ZMW, BTC, XUS, SLE};
    }

    static {
        CurrencyCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CurrencyCode.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.common.CurrencyCode$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public CurrencyCode fromValue(int value) {
                return CurrencyCode.INSTANCE.fromValue(value);
            }
        };
    }

    private CurrencyCode(String str, int i, int i2) {
        this.value = i2;
    }

    public static final CurrencyCode fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static CurrencyCode valueOf(String str) {
        return (CurrencyCode) Enum.valueOf(CurrencyCode.class, str);
    }

    public static CurrencyCode[] values() {
        return (CurrencyCode[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/common/CurrencyCode$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/common/CurrencyCode;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CurrencyCode fromValue(int value) {
            if (value == 191) {
                return CurrencyCode.HRK;
            }
            if (value == 192) {
                return CurrencyCode.CUP;
            }
            if (value == 417) {
                return CurrencyCode.KGS;
            }
            if (value == 418) {
                return CurrencyCode.LAK;
            }
            if (value == 532) {
                return CurrencyCode.ANG;
            }
            if (value == 533) {
                return CurrencyCode.AWG;
            }
            if (value == 940) {
                return CurrencyCode.UYI;
            }
            if (value == 941) {
                return CurrencyCode.RSD;
            }
            if (value == 943) {
                return CurrencyCode.MZN;
            }
            if (value == 944) {
                return CurrencyCode.AZN;
            }
            switch (value) {
                case 8:
                    return CurrencyCode.ALL;
                case 12:
                    return CurrencyCode.DZD;
                case 32:
                    return CurrencyCode.ARS;
                case 36:
                    return CurrencyCode.AUD;
                case 44:
                    return CurrencyCode.BSD;
                case 48:
                    return CurrencyCode.BHD;
                case 60:
                    return CurrencyCode.BMD;
                case 64:
                    return CurrencyCode.BTN;
                case 68:
                    return CurrencyCode.BOB;
                case 72:
                    return CurrencyCode.BWP;
                case 84:
                    return CurrencyCode.BZD;
                case 90:
                    return CurrencyCode.SBD;
                case 96:
                    return CurrencyCode.BND;
                case 104:
                    return CurrencyCode.MMK;
                case 108:
                    return CurrencyCode.BIF;
                case 116:
                    return CurrencyCode.KHR;
                case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                    return CurrencyCode.CAD;
                case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                    return CurrencyCode.CVE;
                case 136:
                    return CurrencyCode.KYD;
                case 144:
                    return CurrencyCode.LKR;
                case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                    return CurrencyCode.CLP;
                case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE:
                    return CurrencyCode.CNY;
                case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                    return CurrencyCode.COP;
                case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
                    return CurrencyCode.KMF;
                case 188:
                    return CurrencyCode.CRC;
                case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE:
                    return CurrencyCode.CZK;
                case SDK_ASSET_ICON_INCOME_VALUE:
                    return CurrencyCode.DKK;
                case SDK_ASSET_ICON_PIN_VALUE:
                    return CurrencyCode.DOP;
                case SDK_ASSET_ICON_SUBTRACT_VALUE:
                    return CurrencyCode.SVC;
                case SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE:
                    return CurrencyCode.ETB;
                case SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE:
                    return CurrencyCode.ERN;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
                    return CurrencyCode.FKP;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE:
                    return CurrencyCode.FJD;
                case SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE:
                    return CurrencyCode.DJF;
                case SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE:
                    return CurrencyCode.GMD;
                case SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE:
                    return CurrencyCode.GIP;
                case 320:
                    return CurrencyCode.GTQ;
                case SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE:
                    return CurrencyCode.GNF;
                case SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE:
                    return CurrencyCode.GYD;
                case 332:
                    return CurrencyCode.HTG;
                case 340:
                    return CurrencyCode.HNL;
                case 344:
                    return CurrencyCode.HKD;
                case 348:
                    return CurrencyCode.HUF;
                case 352:
                    return CurrencyCode.ISK;
                case 356:
                    return CurrencyCode.INR;
                case 360:
                    return CurrencyCode.IDR;
                case 364:
                    return CurrencyCode.IRR;
                case 368:
                    return CurrencyCode.IQD;
                case 376:
                    return CurrencyCode.ILS;
                case 388:
                    return CurrencyCode.JMD;
                case 392:
                    return CurrencyCode.JPY;
                case 398:
                    return CurrencyCode.KZT;
                case 400:
                    return CurrencyCode.JOD;
                case HttpStatusCode.NOT_FOUND_404 /* 404 */:
                    return CurrencyCode.KES;
                case 408:
                    return CurrencyCode.KPW;
                case 410:
                    return CurrencyCode.KRW;
                case 414:
                    return CurrencyCode.KWD;
                case HttpStatusCode.UNPROCESSABLE_ENTITY_422 /* 422 */:
                    return CurrencyCode.LBP;
                case 426:
                    return CurrencyCode.LSL;
                case 428:
                    return CurrencyCode.LVL;
                case 430:
                    return CurrencyCode.LRD;
                case 434:
                    return CurrencyCode.LYD;
                case 440:
                    return CurrencyCode.LTL;
                case 446:
                    return CurrencyCode.MOP;
                case Constants.METRO_BY_T_MOBILE /* 454 */:
                    return CurrencyCode.MWK;
                case 458:
                    return CurrencyCode.MYR;
                case 462:
                    return CurrencyCode.MVR;
                case 478:
                    return CurrencyCode.MRO;
                case 480:
                    return CurrencyCode.MUR;
                case 484:
                    return CurrencyCode.MXN;
                case 496:
                    return CurrencyCode.MNT;
                case 498:
                    return CurrencyCode.MDL;
                case 504:
                    return CurrencyCode.MAD;
                case 512:
                    return CurrencyCode.OMR;
                case 516:
                    return CurrencyCode.NAD;
                case 524:
                    return CurrencyCode.NPR;
                case 548:
                    return CurrencyCode.VUV;
                case 554:
                    return CurrencyCode.NZD;
                case 558:
                    return CurrencyCode.NIO;
                case 566:
                    return CurrencyCode.NGN;
                case 578:
                    return CurrencyCode.NOK;
                case 586:
                    return CurrencyCode.PKR;
                case 590:
                    return CurrencyCode.PAB;
                case 598:
                    return CurrencyCode.PGK;
                case 600:
                    return CurrencyCode.PYG;
                case 604:
                    return CurrencyCode.PEN;
                case 608:
                    return CurrencyCode.PHP;
                case 634:
                    return CurrencyCode.QAR;
                case 643:
                    return CurrencyCode.RUB;
                case 646:
                    return CurrencyCode.RWF;
                case 654:
                    return CurrencyCode.SHP;
                case 678:
                    return CurrencyCode.STD;
                case 682:
                    return CurrencyCode.SAR;
                case 690:
                    return CurrencyCode.SCR;
                case 694:
                    return CurrencyCode.SLL;
                case 702:
                    return CurrencyCode.SGD;
                case 704:
                    return CurrencyCode.VND;
                case 706:
                    return CurrencyCode.SOS;
                case 710:
                    return CurrencyCode.ZAR;
                case 728:
                    return CurrencyCode.SSP;
                case 748:
                    return CurrencyCode.SZL;
                case 752:
                    return CurrencyCode.SEK;
                case 756:
                    return CurrencyCode.CHF;
                case 760:
                    return CurrencyCode.SYP;
                case 764:
                    return CurrencyCode.THB;
                case 776:
                    return CurrencyCode.TOP;
                case 780:
                    return CurrencyCode.TTD;
                case 784:
                    return CurrencyCode.AED;
                case 788:
                    return CurrencyCode.TND;
                case 800:
                    return CurrencyCode.UGX;
                case 807:
                    return CurrencyCode.MKD;
                case 818:
                    return CurrencyCode.EGP;
                case 826:
                    return CurrencyCode.GBP;
                case 834:
                    return CurrencyCode.TZS;
                case 840:
                    return CurrencyCode.USD;
                case 858:
                    return CurrencyCode.UYU;
                case 860:
                    return CurrencyCode.UZS;
                case 882:
                    return CurrencyCode.WST;
                case 886:
                    return CurrencyCode.YER;
                case 894:
                    return CurrencyCode.ZMK;
                case 901:
                    return CurrencyCode.TWD;
                case 925:
                    return CurrencyCode.SLE;
                case 931:
                    return CurrencyCode.CUC;
                case 934:
                    return CurrencyCode.TMT;
                case 967:
                    return CurrencyCode.ZMW;
                case 968:
                    return CurrencyCode.SRD;
                case 969:
                    return CurrencyCode.MGA;
                case 970:
                    return CurrencyCode.COU;
                case 971:
                    return CurrencyCode.AFN;
                case 972:
                    return CurrencyCode.TJS;
                case 973:
                    return CurrencyCode.AOA;
                case 974:
                    return CurrencyCode.BYR;
                case 975:
                    return CurrencyCode.BGN;
                case 976:
                    return CurrencyCode.CDF;
                case 977:
                    return CurrencyCode.BAM;
                case 978:
                    return CurrencyCode.EUR;
                case 979:
                    return CurrencyCode.MXV;
                case 980:
                    return CurrencyCode.UAH;
                case 981:
                    return CurrencyCode.GEL;
                case 984:
                    return CurrencyCode.BOV;
                case 985:
                    return CurrencyCode.PLN;
                case 986:
                    return CurrencyCode.BRL;
                case 990:
                    return CurrencyCode.CLF;
                case 997:
                    return CurrencyCode.USN;
                case 998:
                    return CurrencyCode.USS;
                case RoomDatabase.MAX_BIND_PARAMETER_CNT /* 999 */:
                    return CurrencyCode.XXX;
                case IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO /* 1001 */:
                    return CurrencyCode.BTC;
                case IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA /* 1002 */:
                    return CurrencyCode.XUS;
                default:
                    switch (value) {
                        case 50:
                            return CurrencyCode.BDT;
                        case 51:
                            return CurrencyCode.AMD;
                        case 52:
                            return CurrencyCode.BBD;
                        default:
                            switch (value) {
                                case 936:
                                    return CurrencyCode.GHS;
                                case 937:
                                    return CurrencyCode.VEF;
                                case 938:
                                    return CurrencyCode.SDG;
                                default:
                                    switch (value) {
                                        case 946:
                                            return CurrencyCode.RON;
                                        case 947:
                                            return CurrencyCode.CHE;
                                        case 948:
                                            return CurrencyCode.CHW;
                                        case 949:
                                            return CurrencyCode.TRY;
                                        case 950:
                                            return CurrencyCode.XAF;
                                        case 951:
                                            return CurrencyCode.XCD;
                                        case 952:
                                            return CurrencyCode.XOF;
                                        case 953:
                                            return CurrencyCode.XPF;
                                        default:
                                            switch (value) {
                                                case 955:
                                                    return CurrencyCode.XBA;
                                                case 956:
                                                    return CurrencyCode.XBB;
                                                case 957:
                                                    return CurrencyCode.XBC;
                                                case 958:
                                                    return CurrencyCode.XBD;
                                                case 959:
                                                    return CurrencyCode.XAU;
                                                case 960:
                                                    return CurrencyCode.XDR;
                                                case 961:
                                                    return CurrencyCode.XAG;
                                                case 962:
                                                    return CurrencyCode.XPT;
                                                case 963:
                                                    return CurrencyCode.XTS;
                                                case 964:
                                                    return CurrencyCode.XPD;
                                                default:
                                                    return null;
                                            }
                                    }
                            }
                    }
            }
        }

        private Companion() {
        }
    }
}
