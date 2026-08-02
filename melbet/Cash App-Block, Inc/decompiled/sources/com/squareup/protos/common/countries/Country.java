package com.squareup.protos.common.countries;

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
import org.apache.commons.imaging.formats.pnm.PnmImageParser;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0003\b\u0081\u0002\b\u0086\u0081\u0002\u0018\u0000 \u0084\u00022\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002\u0084\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001j\u0003\bÜ\u0001j\u0003\bÝ\u0001j\u0003\bÞ\u0001j\u0003\bß\u0001j\u0003\bà\u0001j\u0003\bá\u0001j\u0003\bâ\u0001j\u0003\bã\u0001j\u0003\bä\u0001j\u0003\bå\u0001j\u0003\bæ\u0001j\u0003\bç\u0001j\u0003\bè\u0001j\u0003\bé\u0001j\u0003\bê\u0001j\u0003\bë\u0001j\u0003\bì\u0001j\u0003\bí\u0001j\u0003\bî\u0001j\u0003\bï\u0001j\u0003\bð\u0001j\u0003\bñ\u0001j\u0003\bò\u0001j\u0003\bó\u0001j\u0003\bô\u0001j\u0003\bõ\u0001j\u0003\bö\u0001j\u0003\b÷\u0001j\u0003\bø\u0001j\u0003\bù\u0001j\u0003\bú\u0001j\u0003\bû\u0001j\u0003\bü\u0001j\u0003\bý\u0001j\u0003\bþ\u0001j\u0003\bÿ\u0001j\u0003\b\u0080\u0002j\u0003\b\u0081\u0002j\u0003\b\u0082\u0002j\u0003\b\u0083\u0002¨\u0006\u0085\u0002"}, d2 = {"Lcom/squareup/protos/common/countries/Country;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "US", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KP", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", PnmImageParser.PARAM_VALUE_PNM_RAWBITS_NO, "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "XT", "YE", "YT", "ZA", "ZM", "ZW", "ZZ", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Country implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Country[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final Country US = new Country("US", 0, 840);
    public static final Country AD = new Country("AD", 1, 20);
    public static final Country AE = new Country("AE", 2, 784);
    public static final Country AF = new Country("AF", 3, 4);
    public static final Country AG = new Country("AG", 4, 28);
    public static final Country AI = new Country("AI", 5, 660);
    public static final Country AL = new Country("AL", 6, 8);
    public static final Country AM = new Country("AM", 7, 51);
    public static final Country AO = new Country("AO", 8, 24);
    public static final Country AQ = new Country("AQ", 9, 10);
    public static final Country AR = new Country("AR", 10, 32);
    public static final Country AS = new Country("AS", 11, 16);
    public static final Country AT = new Country("AT", 12, 40);
    public static final Country AU = new Country("AU", 13, 36);
    public static final Country AW = new Country("AW", 14, 533);
    public static final Country AX = new Country("AX", 15, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
    public static final Country AZ = new Country("AZ", 16, 31);
    public static final Country BA = new Country("BA", 17, 70);
    public static final Country BB = new Country("BB", 18, 52);
    public static final Country BD = new Country("BD", 19, 50);
    public static final Country BE = new Country("BE", 20, 56);
    public static final Country BF = new Country("BF", 21, 854);
    public static final Country BG = new Country("BG", 22, 100);
    public static final Country BH = new Country("BH", 23, 48);
    public static final Country BI = new Country("BI", 24, 108);
    public static final Country BJ = new Country("BJ", 25, EnumC0170g.SDK_ASSET_ICON_CLEARED_REC_VALUE);
    public static final Country BL = new Country("BL", 26, 652);
    public static final Country BM = new Country("BM", 27, 60);
    public static final Country BN = new Country("BN", 28, 96);
    public static final Country BO = new Country("BO", 29, 68);
    public static final Country BQ = new Country("BQ", 30, 535);
    public static final Country BR = new Country("BR", 31, 76);
    public static final Country BS = new Country("BS", 32, 44);
    public static final Country BT = new Country("BT", 33, 64);
    public static final Country BV = new Country("BV", 34, 74);
    public static final Country BW = new Country("BW", 35, 72);
    public static final Country BY = new Country("BY", 36, 112);
    public static final Country BZ = new Country("BZ", 37, 84);
    public static final Country CA = new Country("CA", 38, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
    public static final Country CC = new Country("CC", 39, EnumC0170g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE);
    public static final Country CD = new Country("CD", 40, EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE);
    public static final Country CF = new Country("CF", 41, 140);
    public static final Country CG = new Country("CG", 42, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE);
    public static final Country CH = new Country("CH", 43, 756);
    public static final Country CI = new Country("CI", 44, MLKEMEngine.KyberPolyBytes);
    public static final Country CK = new Country("CK", 45, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
    public static final Country CL = new Country("CL", 46, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE);
    public static final Country CM = new Country("CM", 47, 120);
    public static final Country CN = new Country("CN", 48, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE);
    public static final Country CO = new Country("CO", 49, EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
    public static final Country CR = new Country("CR", 50, 188);
    public static final Country CU = new Country("CU", 51, 192);
    public static final Country CV = new Country("CV", 52, EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE);
    public static final Country CW = new Country("CW", 53, 531);
    public static final Country CX = new Country("CX", 54, EnumC0170g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE);
    public static final Country CY = new Country("CY", 55, EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE);
    public static final Country CZ = new Country("CZ", 56, EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE);
    public static final Country DE = new Country("DE", 57, EnumC0170g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE);
    public static final Country DJ = new Country("DJ", 58, EnumC0170g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE);
    public static final Country DK = new Country("DK", 59, EnumC0170g.SDK_ASSET_ICON_INCOME_VALUE);
    public static final Country DM = new Country("DM", 60, EnumC0170g.SDK_ASSET_ICON_OVERRIDE_VALUE);
    public static final Country DO = new Country("DO", 61, EnumC0170g.SDK_ASSET_ICON_PIN_VALUE);
    public static final Country DZ = new Country("DZ", 62, 12);
    public static final Country EC = new Country("EC", 63, EnumC0170g.SDK_ASSET_ICON_QUESTION_VALUE);
    public static final Country EE = new Country("EE", 64, EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
    public static final Country EG = new Country("EG", 65, 818);
    public static final Country EH = new Country("EH", 66, 732);
    public static final Country ER = new Country("ER", 67, EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
    public static final Country ES = new Country("ES", 68, 724);
    public static final Country ET = new Country("ET", 69, EnumC0170g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE);
    public static final Country FI = new Country("FI", 70, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE);
    public static final Country FJ = new Country("FJ", 71, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE);
    public static final Country FK = new Country("FK", 72, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE);
    public static final Country FM = new Country("FM", 73, 583);
    public static final Country FO = new Country("FO", 74, EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE);
    public static final Country FR = new Country("FR", 75, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
    public static final Country GA = new Country("GA", 76, EnumC0170g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE);
    public static final Country GB = new Country("GB", 77, 826);
    public static final Country GD = new Country("GD", 78, EnumC0170g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE);
    public static final Country GE = new Country("GE", 79, EnumC0170g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE);
    public static final Country GF = new Country("GF", 80, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
    public static final Country GG = new Country("GG", 81, 831);
    public static final Country GH = new Country("GH", 82, EnumC0170g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE);
    public static final Country GI = new Country("GI", 83, EnumC0170g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE);
    public static final Country GL = new Country("GL", 84, EnumC0170g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE);
    public static final Country GM = new Country("GM", 85, EnumC0170g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE);
    public static final Country GN = new Country("GN", 86, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
    public static final Country GP = new Country("GP", 87, EnumC0170g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_DARK_APPEARANCE_VALUE);
    public static final Country GQ = new Country("GQ", 88, EnumC0170g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE);
    public static final Country GR = new Country("GR", 89, EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE);
    public static final Country GS = new Country("GS", 90, 239);
    public static final Country GT = new Country("GT", 91, 320);
    public static final Country GU = new Country("GU", 92, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_DARK_APPEARANCE_VALUE);
    public static final Country GW = new Country("GW", 93, 624);
    public static final Country GY = new Country("GY", 94, EnumC0170g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE);
    public static final Country HK = new Country("HK", 95, 344);
    public static final Country HM = new Country("HM", 96, 334);
    public static final Country HN = new Country("HN", 97, 340);
    public static final Country HR = new Country("HR", 98, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
    public static final Country HT = new Country("HT", 99, 332);
    public static final Country HU = new Country("HU", 100, 348);
    public static final Country ID = new Country("ID", 101, 360);
    public static final Country IE = new Country("IE", 102, 372);
    public static final Country IL = new Country("IL", 103, 376);
    public static final Country IM = new Country("IM", 104, 833);
    public static final Country IN = new Country("IN", 105, 356);
    public static final Country IO = new Country("IO", 106, 86);
    public static final Country IQ = new Country("IQ", 107, 368);
    public static final Country IR = new Country("IR", 108, 364);
    public static final Country IS = new Country("IS", 109, 352);
    public static final Country IT = new Country("IT", 110, 380);
    public static final Country JE = new Country("JE", 111, 832);
    public static final Country JM = new Country("JM", 112, 388);
    public static final Country JO = new Country("JO", 113, 400);
    public static final Country JP = new Country("JP", 114, 392);
    public static final Country KE = new Country("KE", 115, HttpStatusCode.NOT_FOUND_404);
    public static final Country KG = new Country("KG", 116, 417);
    public static final Country KH = new Country("KH", 117, 116);
    public static final Country KI = new Country("KI", 118, EnumC0170g.SDK_ASSET_LOADING_INDICATOR_VALUE);
    public static final Country KM = new Country("KM", 119, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE);
    public static final Country KN = new Country("KN", 120, 659);
    public static final Country KP = new Country("KP", 121, 408);
    public static final Country KR = new Country("KR", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 410);
    public static final Country KW = new Country("KW", EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 414);
    public static final Country KY = new Country("KY", EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 136);
    public static final Country KZ = new Country("KZ", 125, 398);
    public static final Country LA = new Country("LA", EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 418);
    public static final Country LB = new Country("LB", 127, HttpStatusCode.UNPROCESSABLE_ENTITY_422);
    public static final Country LC = new Country("LC", 128, 662);
    public static final Country LI = new Country("LI", EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 438);
    public static final Country LK = new Country("LK", EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 144);
    public static final Country LR = new Country("LR", 131, 430);
    public static final Country LS = new Country("LS", EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, 426);
    public static final Country LT = new Country("LT", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 440);
    public static final Country LU = new Country("LU", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, 442);
    public static final Country LV = new Country("LV", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, 428);
    public static final Country LY = new Country("LY", 136, 434);
    public static final Country MA = new Country("MA", EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, 504);
    public static final Country MC = new Country("MC", EnumC0170g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, 492);
    public static final Country MD = new Country("MD", EnumC0170g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 498);
    public static final Country ME = new Country("ME", 140, 499);
    public static final Country MF = new Country("MF", EnumC0170g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, 663);
    public static final Country MG = new Country("MG", EnumC0170g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, 450);
    public static final Country MH = new Country("MH", EnumC0170g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, 584);
    public static final Country MK = new Country("MK", 144, 807);
    public static final Country ML = new Country("ML", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, 466);
    public static final Country MM = new Country("MM", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, 104);
    public static final Country MN = new Country("MN", 147, 496);
    public static final Country MO = new Country("MO", EnumC0170g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE, 446);
    public static final Country MP = new Country("MP", EnumC0170g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, 580);
    public static final Country MQ = new Country("MQ", 150, 474);
    public static final Country MR = new Country("MR", 151, 478);
    public static final Country MS = new Country("MS", EnumC0170g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, 500);
    public static final Country MT = new Country("MT", 153, 470);
    public static final Country MU = new Country("MU", EnumC0170g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, 480);
    public static final Country MV = new Country("MV", EnumC0170g.SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE, 462);
    public static final Country MW = new Country("MW", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE, Constants.METRO_BY_T_MOBILE);
    public static final Country MX = new Country("MX", EnumC0170g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, 484);
    public static final Country MY = new Country("MY", EnumC0170g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 458);
    public static final Country MZ = new Country("MZ", EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, 508);
    public static final Country NA = new Country("NA", EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, 516);
    public static final Country NC = new Country("NC", EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, 540);
    public static final Country NE = new Country("NE", EnumC0170g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, 562);
    public static final Country NF = new Country("NF", EnumC0170g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, 574);
    public static final Country NG = new Country("NG", EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 566);
    public static final Country NI = new Country("NI", 165, 558);
    public static final Country NL = new Country("NL", EnumC0170g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, 528);
    public static final Country NO = new Country(PnmImageParser.PARAM_VALUE_PNM_RAWBITS_NO, 167, 578);
    public static final Country NP = new Country("NP", EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, 524);
    public static final Country NR = new Country("NR", EnumC0170g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, 520);
    public static final Country NU = new Country("NU", EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 570);
    public static final Country NZ = new Country("NZ", EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, 554);
    public static final Country OM = new Country("OM", EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, 512);
    public static final Country PA = new Country("PA", EnumC0170g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, 591);
    public static final Country PE = new Country("PE", EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, 604);
    public static final Country PF = new Country("PF", EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_HEADER_BOLT_VALUE);
    public static final Country PG = new Country("PG", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, 598);
    public static final Country PH = new Country("PH", EnumC0170g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 608);
    public static final Country PK = new Country("PK", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, 586);
    public static final Country PL = new Country("PL", EnumC0170g.SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE, 616);
    public static final Country PM = new Country("PM", EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 666);
    public static final Country PN = new Country("PN", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, 612);
    public static final Country PR = new Country("PR", EnumC0170g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, 630);
    public static final Country PS = new Country("PS", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE);
    public static final Country PT = new Country("PT", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, 620);
    public static final Country PW = new Country("PW", 185, 585);
    public static final Country PY = new Country("PY", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, 600);
    public static final Country QA = new Country("QA", EnumC0170g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, 634);
    public static final Country RE = new Country("RE", 188, 638);
    public static final Country RO = new Country("RO", EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 642);
    public static final Country RS = new Country("RS", EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 688);
    public static final Country RU = new Country("RU", EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 643);
    public static final Country RW = new Country("RW", 192, 646);
    public static final Country SA = new Country("SA", EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, 682);
    public static final Country SB = new Country("SB", EnumC0170g.SDK_ASSET_ICON_EXTERNAL_VALUE, 90);
    public static final Country SC = new Country("SC", EnumC0170g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, 690);
    public static final Country SD = new Country("SD", EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, 729);
    public static final Country SE = new Country("SE", EnumC0170g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, 752);
    public static final Country SG = new Country("SG", EnumC0170g.SDK_ASSET_ICON_ARROW_UP_VALUE, 702);
    public static final Country SH = new Country("SH", EnumC0170g.SDK_ASSET_ICON_CANCEL_VALUE, 654);
    public static final Country SI = new Country("SI", 200, 705);
    public static final Country SJ = new Country("SJ", EnumC0170g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, 744);
    public static final Country SK = new Country("SK", EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, 703);
    public static final Country SL = new Country("SL", EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, 694);
    public static final Country SM = new Country("SM", EnumC0170g.SDK_ASSET_ICON_CLEARED_REC_VALUE, 674);
    public static final Country SN = new Country("SN", EnumC0170g.SDK_ASSET_ICON_CLIPBOARD_VALUE, 686);
    public static final Country SO = new Country("SO", EnumC0170g.SDK_ASSET_ICON_CLOCK_VALUE, 706);
    public static final Country SR = new Country("SR", EnumC0170g.SDK_ASSET_ICON_COMMENT_VALUE, 740);
    public static final Country SS = new Country("SS", EnumC0170g.SDK_ASSET_ICON_INCOME_VALUE, 728);
    public static final Country ST = new Country("ST", EnumC0170g.SDK_ASSET_ICON_INCOMPLETE_VALUE, 678);
    public static final Country SV = new Country("SV", EnumC0170g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE);
    public static final Country SX = new Country("SX", 211, 534);
    public static final Country SY = new Country("SY", EnumC0170g.SDK_ASSET_ICON_OVERRIDE_VALUE, 760);
    public static final Country SZ = new Country("SZ", EnumC0170g.SDK_ASSET_ICON_PAUSE_VALUE, 748);
    public static final Country TC = new Country("TC", EnumC0170g.SDK_ASSET_ICON_PIN_VALUE, 796);
    public static final Country TD = new Country("TD", EnumC0170g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE);
    public static final Country TF = new Country("TF", EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, EnumC0170g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE);
    public static final Country TG = new Country("TG", EnumC0170g.SDK_ASSET_ICON_PROGRESS_VALUE, 768);
    public static final Country TH = new Country("TH", EnumC0170g.SDK_ASSET_ICON_QUESTION_VALUE, 764);
    public static final Country TJ = new Country("TJ", EnumC0170g.SDK_ASSET_ICON_REJECTED_REC_VALUE, 762);
    public static final Country TK = new Country("TK", EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 772);
    public static final Country TL = new Country("TL", EnumC0170g.SDK_ASSET_ICON_SUBMIT_VALUE, 626);
    public static final Country TM = new Country("TM", EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE, 795);
    public static final Country TN = new Country("TN", EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 788);
    public static final Country TO = new Country("TO", 224, 776);
    public static final Country TR = new Country("TR", EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, 792);
    public static final Country TT = new Country("TT", EnumC0170g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, 780);
    public static final Country TV = new Country("TV", EnumC0170g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, 798);
    public static final Country TW = new Country("TW", EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE);
    public static final Country TZ = new Country("TZ", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, 834);
    public static final Country UA = new Country("UA", EnumC0170g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, 804);
    public static final Country UG = new Country("UG", EnumC0170g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, 800);
    public static final Country UM = new Country("UM", EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 581);
    public static final Country UY = new Country("UY", EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 858);
    public static final Country UZ = new Country("UZ", EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 860);
    public static final Country VA = new Country("VA", EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, 336);
    public static final Country VC = new Country("VC", EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, 670);
    public static final Country VE = new Country("VE", EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, 862);
    public static final Country VG = new Country("VG", EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, 92);
    public static final Country VI = new Country("VI", 239, 850);
    public static final Country VN = new Country("VN", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, 704);
    public static final Country VU = new Country("VU", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, 548);
    public static final Country WF = new Country("WF", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, 876);
    public static final Country WS = new Country("WS", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, 882);
    public static final Country XT = new Country("XT", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, 963);
    public static final Country YE = new Country("YE", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 887);
    public static final Country YT = new Country("YT", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE);
    public static final Country ZA = new Country("ZA", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, 710);
    public static final Country ZM = new Country("ZM", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, 894);
    public static final Country ZW = new Country("ZW", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, 716);
    public static final Country ZZ = new Country("ZZ", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, RoomDatabase.MAX_BIND_PARAMETER_CNT);

    private static final /* synthetic */ Country[] $values() {
        return new Country[]{US, AD, AE, AF, AG, AI, AL, AM, AO, AQ, AR, AS, AT, AU, AW, AX, AZ, BA, BB, BD, BE, BF, BG, BH, BI, BJ, BL, BM, BN, BO, BQ, BR, BS, BT, BV, BW, BY, BZ, CA, CC, CD, CF, CG, CH, CI, CK, CL, CM, CN, CO, CR, CU, CV, CW, CX, CY, CZ, DE, DJ, DK, DM, DO, DZ, EC, EE, EG, EH, ER, ES, ET, FI, FJ, FK, FM, FO, FR, GA, GB, GD, GE, GF, GG, GH, GI, GL, GM, GN, GP, GQ, GR, GS, GT, GU, GW, GY, HK, HM, HN, HR, HT, HU, ID, IE, IL, IM, IN, IO, IQ, IR, IS, IT, JE, JM, JO, JP, KE, KG, KH, KI, KM, KN, KP, KR, KW, KY, KZ, LA, LB, LC, LI, LK, LR, LS, LT, LU, LV, LY, MA, MC, MD, ME, MF, MG, MH, MK, ML, MM, MN, MO, MP, MQ, MR, MS, MT, MU, MV, MW, MX, MY, MZ, NA, NC, NE, NF, NG, NI, NL, NO, NP, NR, NU, NZ, OM, PA, PE, PF, PG, PH, PK, PL, PM, PN, PR, PS, PT, PW, PY, QA, RE, RO, RS, RU, RW, SA, SB, SC, SD, SE, SG, SH, SI, SJ, SK, SL, SM, SN, SO, SR, SS, ST, SV, SX, SY, SZ, TC, TD, TF, TG, TH, TJ, TK, TL, TM, TN, TO, TR, TT, TV, TW, TZ, UA, UG, UM, UY, UZ, VA, VC, VE, VG, VI, VN, VU, WF, WS, XT, YE, YT, ZA, ZM, ZW, ZZ};
    }

    static {
        Country[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Country.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.common.countries.Country$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public Country fromValue(int value) {
                return Country.INSTANCE.fromValue(value);
            }
        };
    }

    private Country(String str, int i, int i2) {
        this.value = i2;
    }

    public static final Country fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static Country valueOf(String str) {
        return (Country) Enum.valueOf(Country.class, str);
    }

    public static Country[] values() {
        return (Country[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/common/countries/Country$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/common/countries/Country;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Country fromValue(int value) {
            switch (value) {
                case 4:
                    return Country.AF;
                case 8:
                    return Country.AL;
                case 10:
                    return Country.AQ;
                case 12:
                    return Country.DZ;
                case 16:
                    return Country.AS;
                case 20:
                    return Country.AD;
                case 24:
                    return Country.AO;
                case 28:
                    return Country.AG;
                case 31:
                    return Country.AZ;
                case 32:
                    return Country.AR;
                case 36:
                    return Country.AU;
                case 40:
                    return Country.AT;
                case 44:
                    return Country.BS;
                case 48:
                    return Country.BH;
                case 50:
                    return Country.BD;
                case 51:
                    return Country.AM;
                case 52:
                    return Country.BB;
                case 56:
                    return Country.BE;
                case 60:
                    return Country.BM;
                case 64:
                    return Country.BT;
                case 68:
                    return Country.BO;
                case 70:
                    return Country.BA;
                case 72:
                    return Country.BW;
                case 74:
                    return Country.BV;
                case 76:
                    return Country.BR;
                case 84:
                    return Country.BZ;
                case 86:
                    return Country.IO;
                case 90:
                    return Country.SB;
                case 92:
                    return Country.VG;
                case 96:
                    return Country.BN;
                case 100:
                    return Country.BG;
                case 104:
                    return Country.MM;
                case 108:
                    return Country.BI;
                case 112:
                    return Country.BY;
                case 116:
                    return Country.KH;
                case 120:
                    return Country.CM;
                case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                    return Country.CA;
                case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                    return Country.CV;
                case 136:
                    return Country.KY;
                case 140:
                    return Country.CF;
                case 144:
                    return Country.LK;
                case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
                    return Country.TD;
                case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                    return Country.CL;
                case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE:
                    return Country.CN;
                case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                    return Country.TW;
                case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
                    return Country.CX;
                case SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE:
                    return Country.CC;
                case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                    return Country.CO;
                case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
                    return Country.KM;
                case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE:
                    return Country.YT;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE:
                    return Country.CG;
                case SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE:
                    return Country.CD;
                case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE:
                    return Country.CK;
                case 188:
                    return Country.CR;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE:
                    return Country.HR;
                case 192:
                    return Country.CU;
                case SDK_ASSET_ICON_ARROW_DOWN_VALUE:
                    return Country.CY;
                case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE:
                    return Country.CZ;
                case SDK_ASSET_ICON_CLEARED_REC_VALUE:
                    return Country.BJ;
                case SDK_ASSET_ICON_INCOME_VALUE:
                    return Country.DK;
                case SDK_ASSET_ICON_OVERRIDE_VALUE:
                    return Country.DM;
                case SDK_ASSET_ICON_PIN_VALUE:
                    return Country.DO;
                case SDK_ASSET_ICON_QUESTION_VALUE:
                    return Country.EC;
                case SDK_ASSET_ICON_SUBTRACT_VALUE:
                    return Country.SV;
                case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE:
                    return Country.GQ;
                case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
                    return Country.ET;
                case SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE:
                    return Country.ER;
                case SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE:
                    return Country.EE;
                case SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE:
                    return Country.FO;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
                    return Country.FK;
                case 239:
                    return Country.GS;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE:
                    return Country.FJ;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE:
                    return Country.FI;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                    return Country.AX;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE:
                    return Country.FR;
                case SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE:
                    return Country.GF;
                case SDK_ASSET_HEADER_BOLT_VALUE:
                    return Country.PF;
                case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                    return Country.TF;
                case SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE:
                    return Country.DJ;
                case SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE:
                    return Country.GA;
                case SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE:
                    return Country.GE;
                case SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE:
                    return Country.GM;
                case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE:
                    return Country.PS;
                case SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE:
                    return Country.DE;
                case SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE:
                    return Country.GH;
                case SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE:
                    return Country.GI;
                case SDK_ASSET_LOADING_INDICATOR_VALUE:
                    return Country.KI;
                case SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE:
                    return Country.GR;
                case SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE:
                    return Country.GL;
                case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE:
                    return Country.GD;
                case SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_DARK_APPEARANCE_VALUE:
                    return Country.GP;
                case SDK_ASSET_ILLUSTRATION_SECURE_DATA_DARK_APPEARANCE_VALUE:
                    return Country.GU;
                case 320:
                    return Country.GT;
                case SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE:
                    return Country.GN;
                case SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE:
                    return Country.GY;
                case 332:
                    return Country.HT;
                case 334:
                    return Country.HM;
                case 336:
                    return Country.VA;
                case 340:
                    return Country.HN;
                case 344:
                    return Country.HK;
                case 348:
                    return Country.HU;
                case 352:
                    return Country.IS;
                case 356:
                    return Country.IN;
                case 360:
                    return Country.ID;
                case 364:
                    return Country.IR;
                case 368:
                    return Country.IQ;
                case 372:
                    return Country.IE;
                case 376:
                    return Country.IL;
                case 380:
                    return Country.IT;
                case MLKEMEngine.KyberPolyBytes /* 384 */:
                    return Country.CI;
                case 388:
                    return Country.JM;
                case 392:
                    return Country.JP;
                case 398:
                    return Country.KZ;
                case 400:
                    return Country.JO;
                case HttpStatusCode.NOT_FOUND_404 /* 404 */:
                    return Country.KE;
                case 408:
                    return Country.KP;
                case 410:
                    return Country.KR;
                case 414:
                    return Country.KW;
                case 417:
                    return Country.KG;
                case 418:
                    return Country.LA;
                case HttpStatusCode.UNPROCESSABLE_ENTITY_422 /* 422 */:
                    return Country.LB;
                case 426:
                    return Country.LS;
                case 428:
                    return Country.LV;
                case 430:
                    return Country.LR;
                case 434:
                    return Country.LY;
                case 438:
                    return Country.LI;
                case 440:
                    return Country.LT;
                case 442:
                    return Country.LU;
                case 446:
                    return Country.MO;
                case 450:
                    return Country.MG;
                case Constants.METRO_BY_T_MOBILE /* 454 */:
                    return Country.MW;
                case 458:
                    return Country.MY;
                case 462:
                    return Country.MV;
                case 466:
                    return Country.ML;
                case 470:
                    return Country.MT;
                case 474:
                    return Country.MQ;
                case 478:
                    return Country.MR;
                case 480:
                    return Country.MU;
                case 484:
                    return Country.MX;
                case 492:
                    return Country.MC;
                case 496:
                    return Country.MN;
                case 498:
                    return Country.MD;
                case 499:
                    return Country.ME;
                case 500:
                    return Country.MS;
                case 504:
                    return Country.MA;
                case 508:
                    return Country.MZ;
                case 512:
                    return Country.OM;
                case 516:
                    return Country.NA;
                case 520:
                    return Country.NR;
                case 524:
                    return Country.NP;
                case 528:
                    return Country.NL;
                case 531:
                    return Country.CW;
                case 533:
                    return Country.AW;
                case 534:
                    return Country.SX;
                case 535:
                    return Country.BQ;
                case 540:
                    return Country.NC;
                case 548:
                    return Country.VU;
                case 554:
                    return Country.NZ;
                case 558:
                    return Country.NI;
                case 562:
                    return Country.NE;
                case 566:
                    return Country.NG;
                case 570:
                    return Country.NU;
                case 574:
                    return Country.NF;
                case 578:
                    return Country.NO;
                case 580:
                    return Country.MP;
                case 581:
                    return Country.UM;
                case 583:
                    return Country.FM;
                case 584:
                    return Country.MH;
                case 585:
                    return Country.PW;
                case 586:
                    return Country.PK;
                case 591:
                    return Country.PA;
                case 598:
                    return Country.PG;
                case 600:
                    return Country.PY;
                case 604:
                    return Country.PE;
                case 608:
                    return Country.PH;
                case 612:
                    return Country.PN;
                case 616:
                    return Country.PL;
                case 620:
                    return Country.PT;
                case 624:
                    return Country.GW;
                case 626:
                    return Country.TL;
                case 630:
                    return Country.PR;
                case 634:
                    return Country.QA;
                case 638:
                    return Country.RE;
                case 642:
                    return Country.RO;
                case 643:
                    return Country.RU;
                case 646:
                    return Country.RW;
                case 652:
                    return Country.BL;
                case 654:
                    return Country.SH;
                case 659:
                    return Country.KN;
                case 660:
                    return Country.AI;
                case 662:
                    return Country.LC;
                case 663:
                    return Country.MF;
                case 666:
                    return Country.PM;
                case 670:
                    return Country.VC;
                case 674:
                    return Country.SM;
                case 678:
                    return Country.ST;
                case 682:
                    return Country.SA;
                case 686:
                    return Country.SN;
                case 688:
                    return Country.RS;
                case 690:
                    return Country.SC;
                case 694:
                    return Country.SL;
                case 702:
                    return Country.SG;
                case 703:
                    return Country.SK;
                case 704:
                    return Country.VN;
                case 705:
                    return Country.SI;
                case 706:
                    return Country.SO;
                case 710:
                    return Country.ZA;
                case 716:
                    return Country.ZW;
                case 724:
                    return Country.ES;
                case 728:
                    return Country.SS;
                case 729:
                    return Country.SD;
                case 732:
                    return Country.EH;
                case 740:
                    return Country.SR;
                case 744:
                    return Country.SJ;
                case 748:
                    return Country.SZ;
                case 752:
                    return Country.SE;
                case 756:
                    return Country.CH;
                case 760:
                    return Country.SY;
                case 762:
                    return Country.TJ;
                case 764:
                    return Country.TH;
                case 768:
                    return Country.TG;
                case 772:
                    return Country.TK;
                case 776:
                    return Country.TO;
                case 780:
                    return Country.TT;
                case 784:
                    return Country.AE;
                case 788:
                    return Country.TN;
                case 792:
                    return Country.TR;
                case 795:
                    return Country.TM;
                case 796:
                    return Country.TC;
                case 798:
                    return Country.TV;
                case 800:
                    return Country.UG;
                case 804:
                    return Country.UA;
                case 807:
                    return Country.MK;
                case 818:
                    return Country.EG;
                case 826:
                    return Country.GB;
                case 831:
                    return Country.GG;
                case 832:
                    return Country.JE;
                case 833:
                    return Country.IM;
                case 834:
                    return Country.TZ;
                case 840:
                    return Country.US;
                case 850:
                    return Country.VI;
                case 854:
                    return Country.BF;
                case 858:
                    return Country.UY;
                case 860:
                    return Country.UZ;
                case 862:
                    return Country.VE;
                case 876:
                    return Country.WF;
                case 882:
                    return Country.WS;
                case 887:
                    return Country.YE;
                case 894:
                    return Country.ZM;
                case 963:
                    return Country.XT;
                case RoomDatabase.MAX_BIND_PARAMETER_CNT /* 999 */:
                    return Country.ZZ;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }
}
