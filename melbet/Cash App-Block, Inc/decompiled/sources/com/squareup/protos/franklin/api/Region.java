package com.squareup.protos.franklin.api;

import com.plaid.internal.EnumC0170g;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0003\b\u0081\u0002\b\u0086\u0081\u0002\u0018\u0000 \u0084\u00022\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002\u0084\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001j\u0003\bÜ\u0001j\u0003\bÝ\u0001j\u0003\bÞ\u0001j\u0003\bß\u0001j\u0003\bà\u0001j\u0003\bá\u0001j\u0003\bâ\u0001j\u0003\bã\u0001j\u0003\bä\u0001j\u0003\bå\u0001j\u0003\bæ\u0001j\u0003\bç\u0001j\u0003\bè\u0001j\u0003\bé\u0001j\u0003\bê\u0001j\u0003\bë\u0001j\u0003\bì\u0001j\u0003\bí\u0001j\u0003\bî\u0001j\u0003\bï\u0001j\u0003\bð\u0001j\u0003\bñ\u0001j\u0003\bò\u0001j\u0003\bó\u0001j\u0003\bô\u0001j\u0003\bõ\u0001j\u0003\bö\u0001j\u0003\b÷\u0001j\u0003\bø\u0001j\u0003\bù\u0001j\u0003\bú\u0001j\u0003\bû\u0001j\u0003\bü\u0001j\u0003\bý\u0001j\u0003\bþ\u0001j\u0003\bÿ\u0001j\u0003\b\u0080\u0002j\u0003\b\u0081\u0002j\u0003\b\u0082\u0002j\u0003\b\u0083\u0002¨\u0006\u0085\u0002"}, d2 = {"Lcom/squareup/protos/franklin/api/Region;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "USA", "CAN", "GBR", "AUS", "ABW", "AFG", "AGO", "AIA", "ALA", "ALB", "AND", "ARE", "ARG", "ARM", "ASM", "ATA", "ATF", "ATG", "AUT", "AZE", "BDI", "BEL", "BEN", "BES", "BFA", "BGD", "BGR", "BHR", "BHS", "BIH", "BLM", "BLR", "BLZ", "BMU", "BOL", "BRA", "BRB", "BRN", "BTN", "BVT", "BWA", "CAF", "CCK", "CHE", "CHL", "CHN", "CIV", "CMR", "COD", "COG", "COK", "COL", "COM", "CPV", "CRI", "CUB", "CUW", "CXR", "CYM", "CYP", "CZE", "DEU", "DJI", "DMA", "DNK", "DOM", "DZA", "ECU", "EGY", "ERI", "ESH", "ESP", "EST", "ETH", "FIN", "FJI", "FLK", "FRA", "FRO", "FSM", "GAB", "GEO", "GGY", "GHA", "GIB", "GIN", "GLP", "GMB", "GNB", "GNQ", "GRC", "GRD", "GRL", "GTM", "GUF", "GUM", "GUY", "HKG", "HMD", "HND", "HRV", "HTI", "HUN", "IDN", "IMN", "IND", "IOT", "IRL", "IRN", "IRQ", "ISL", "ISR", "ITA", "JAM", "JEY", "JOR", "JPN", "KAZ", "KEN", "KGZ", "KHM", "KIR", "KNA", "KOR", "KWT", "LAO", "LBN", "LBR", "LBY", "LCA", "LIE", "LKA", "LSO", "LTU", "LUX", "LVA", "MAC", "MAF", "MAR", "MCO", "MDA", "MDG", "MDV", "MEX", "MHL", "MKD", "MLI", "MLT", "MMR", "MNE", "MNG", "MNP", "MOZ", "MRT", "MSR", "MTQ", "MUS", "MWI", "MYS", "MYT", "NAM", "NCL", "NER", "NFK", "NGA", "NIC", "NIU", "NLD", "NOR", "NPL", "NRU", "NZL", "OMN", "PAK", "PAN", "PCN", "PER", "PHL", "PLW", "PNG", "POL", "PRI", "PRK", "PRT", "PRY", "PSE", "PYF", "QAT", "REU", "ROU", "RUS", "RWA", "SAU", "SDN", "SEN", "SGP", "SGS", "SHN", "SJM", "SLB", "SLE", "SLV", "SMR", "SOM", "SPM", "SRB", "SSD", "STP", "SUR", "SVK", "SVN", "SWE", "SWZ", "SXM", "SYC", "SYR", "TCA", "TCD", "TGO", "THA", "TJK", "TKL", "TKM", "TLS", "TON", "TTO", "TUN", "TUR", "TUV", "TWN", "TZA", "UGA", "UKR", "UMI", "URY", "UZB", "VAT", "VCT", "VEN", "VGB", "VIR", "VNM", "VUT", "WLF", "WSM", "YEM", "ZAF", "ZMB", "ZWE", "XXL", "XTS", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Region implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Region[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final Region USA = new Region("USA", 0, 1);
    public static final Region CAN = new Region("CAN", 1, 2);
    public static final Region GBR = new Region("GBR", 2, 3);
    public static final Region AUS = new Region("AUS", 3, 4);
    public static final Region ABW = new Region("ABW", 4, 5);
    public static final Region AFG = new Region("AFG", 5, 6);
    public static final Region AGO = new Region("AGO", 6, 7);
    public static final Region AIA = new Region("AIA", 7, 8);
    public static final Region ALA = new Region("ALA", 8, 9);
    public static final Region ALB = new Region("ALB", 9, 10);
    public static final Region AND = new Region("AND", 10, 11);
    public static final Region ARE = new Region("ARE", 11, 12);
    public static final Region ARG = new Region("ARG", 12, 13);
    public static final Region ARM = new Region("ARM", 13, 14);
    public static final Region ASM = new Region("ASM", 14, 15);
    public static final Region ATA = new Region("ATA", 15, 16);
    public static final Region ATF = new Region("ATF", 16, 17);
    public static final Region ATG = new Region("ATG", 17, 18);
    public static final Region AUT = new Region("AUT", 18, 19);
    public static final Region AZE = new Region("AZE", 19, 20);
    public static final Region BDI = new Region("BDI", 20, 21);
    public static final Region BEL = new Region("BEL", 21, 22);
    public static final Region BEN = new Region("BEN", 22, 23);
    public static final Region BES = new Region("BES", 23, 24);
    public static final Region BFA = new Region("BFA", 24, 25);
    public static final Region BGD = new Region("BGD", 25, 26);
    public static final Region BGR = new Region("BGR", 26, 27);
    public static final Region BHR = new Region("BHR", 27, 28);
    public static final Region BHS = new Region("BHS", 28, 29);
    public static final Region BIH = new Region("BIH", 29, 30);
    public static final Region BLM = new Region("BLM", 30, 31);
    public static final Region BLR = new Region("BLR", 31, 32);
    public static final Region BLZ = new Region("BLZ", 32, 33);
    public static final Region BMU = new Region("BMU", 33, 34);
    public static final Region BOL = new Region("BOL", 34, 35);
    public static final Region BRA = new Region("BRA", 35, 36);
    public static final Region BRB = new Region("BRB", 36, 37);
    public static final Region BRN = new Region("BRN", 37, 38);
    public static final Region BTN = new Region("BTN", 38, 39);
    public static final Region BVT = new Region("BVT", 39, 40);
    public static final Region BWA = new Region("BWA", 40, 41);
    public static final Region CAF = new Region("CAF", 41, 42);
    public static final Region CCK = new Region("CCK", 42, 43);
    public static final Region CHE = new Region("CHE", 43, 44);
    public static final Region CHL = new Region("CHL", 44, 45);
    public static final Region CHN = new Region("CHN", 45, 46);
    public static final Region CIV = new Region("CIV", 46, 47);
    public static final Region CMR = new Region("CMR", 47, 48);
    public static final Region COD = new Region("COD", 48, 49);
    public static final Region COG = new Region("COG", 49, 50);
    public static final Region COK = new Region("COK", 50, 51);
    public static final Region COL = new Region("COL", 51, 52);
    public static final Region COM = new Region("COM", 52, 53);
    public static final Region CPV = new Region("CPV", 53, 54);
    public static final Region CRI = new Region("CRI", 54, 55);
    public static final Region CUB = new Region("CUB", 55, 56);
    public static final Region CUW = new Region("CUW", 56, 57);
    public static final Region CXR = new Region("CXR", 57, 58);
    public static final Region CYM = new Region("CYM", 58, 59);
    public static final Region CYP = new Region("CYP", 59, 60);
    public static final Region CZE = new Region("CZE", 60, 61);
    public static final Region DEU = new Region("DEU", 61, 62);
    public static final Region DJI = new Region("DJI", 62, 63);
    public static final Region DMA = new Region("DMA", 63, 64);
    public static final Region DNK = new Region("DNK", 64, 65);
    public static final Region DOM = new Region("DOM", 65, 66);
    public static final Region DZA = new Region("DZA", 66, 67);
    public static final Region ECU = new Region("ECU", 67, 68);
    public static final Region EGY = new Region("EGY", 68, 69);
    public static final Region ERI = new Region("ERI", 69, 70);
    public static final Region ESH = new Region("ESH", 70, 71);
    public static final Region ESP = new Region("ESP", 71, 72);
    public static final Region EST = new Region("EST", 72, 73);
    public static final Region ETH = new Region("ETH", 73, 74);
    public static final Region FIN = new Region("FIN", 74, 75);
    public static final Region FJI = new Region("FJI", 75, 76);
    public static final Region FLK = new Region("FLK", 76, 77);
    public static final Region FRA = new Region("FRA", 77, 78);
    public static final Region FRO = new Region("FRO", 78, 79);
    public static final Region FSM = new Region("FSM", 79, 80);
    public static final Region GAB = new Region("GAB", 80, 81);
    public static final Region GEO = new Region("GEO", 81, 82);
    public static final Region GGY = new Region("GGY", 82, 83);
    public static final Region GHA = new Region("GHA", 83, 84);
    public static final Region GIB = new Region("GIB", 84, 85);
    public static final Region GIN = new Region("GIN", 85, 86);
    public static final Region GLP = new Region("GLP", 86, 87);
    public static final Region GMB = new Region("GMB", 87, 88);
    public static final Region GNB = new Region("GNB", 88, 89);
    public static final Region GNQ = new Region("GNQ", 89, 90);
    public static final Region GRC = new Region("GRC", 90, 91);
    public static final Region GRD = new Region("GRD", 91, 92);
    public static final Region GRL = new Region("GRL", 92, 93);
    public static final Region GTM = new Region("GTM", 93, 94);
    public static final Region GUF = new Region("GUF", 94, 95);
    public static final Region GUM = new Region("GUM", 95, 96);
    public static final Region GUY = new Region("GUY", 96, 97);
    public static final Region HKG = new Region("HKG", 97, 98);
    public static final Region HMD = new Region("HMD", 98, 99);
    public static final Region HND = new Region("HND", 99, 100);
    public static final Region HRV = new Region("HRV", 100, 101);
    public static final Region HTI = new Region("HTI", 101, 102);
    public static final Region HUN = new Region("HUN", 102, 103);
    public static final Region IDN = new Region("IDN", 103, 104);
    public static final Region IMN = new Region("IMN", 104, 105);
    public static final Region IND = new Region("IND", 105, 106);
    public static final Region IOT = new Region("IOT", 106, 107);

    @Deprecated
    public static final Region IRL = new Region("IRL", 107, 108);
    public static final Region IRN = new Region("IRN", 108, 109);
    public static final Region IRQ = new Region("IRQ", 109, 110);
    public static final Region ISL = new Region("ISL", 110, 111);
    public static final Region ISR = new Region("ISR", 111, 112);
    public static final Region ITA = new Region("ITA", 112, 113);
    public static final Region JAM = new Region("JAM", 113, 114);
    public static final Region JEY = new Region("JEY", 114, 115);
    public static final Region JOR = new Region("JOR", 115, 116);
    public static final Region JPN = new Region("JPN", 116, 117);
    public static final Region KAZ = new Region("KAZ", 117, 118);
    public static final Region KEN = new Region("KEN", 118, 119);
    public static final Region KGZ = new Region("KGZ", 119, 120);
    public static final Region KHM = new Region("KHM", 120, 121);
    public static final Region KIR = new Region("KIR", 121, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
    public static final Region KNA = new Region("KNA", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
    public static final Region KOR = new Region("KOR", EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
    public static final Region KWT = new Region("KWT", EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 125);
    public static final Region LAO = new Region("LAO", 125, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
    public static final Region LBN = new Region("LBN", EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 127);
    public static final Region LBR = new Region("LBR", 127, 128);
    public static final Region LBY = new Region("LBY", 128, EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
    public static final Region LCA = new Region("LCA", EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
    public static final Region LIE = new Region("LIE", EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 131);
    public static final Region LKA = new Region("LKA", 131, EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE);
    public static final Region LSO = new Region("LSO", EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE);
    public static final Region LTU = new Region("LTU", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE);
    public static final Region LUX = new Region("LUX", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE);
    public static final Region LVA = new Region("LVA", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, 136);
    public static final Region MAC = new Region("MAC", 136, EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE);
    public static final Region MAF = new Region("MAF", EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE);
    public static final Region MAR = new Region("MAR", EnumC0170g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE);
    public static final Region MCO = new Region("MCO", EnumC0170g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 140);
    public static final Region MDA = new Region("MDA", 140, EnumC0170g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE);
    public static final Region MDG = new Region("MDG", EnumC0170g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, EnumC0170g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE);
    public static final Region MDV = new Region("MDV", EnumC0170g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, EnumC0170g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE);
    public static final Region MEX = new Region("MEX", EnumC0170g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, 144);
    public static final Region MHL = new Region("MHL", 144, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE);
    public static final Region MKD = new Region("MKD", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE);
    public static final Region MLI = new Region("MLI", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, 147);
    public static final Region MLT = new Region("MLT", 147, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE);
    public static final Region MMR = new Region("MMR", EnumC0170g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE);
    public static final Region MNE = new Region("MNE", EnumC0170g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, 150);
    public static final Region MNG = new Region("MNG", 150, 151);
    public static final Region MNP = new Region("MNP", 151, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE);
    public static final Region MOZ = new Region("MOZ", EnumC0170g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, 153);
    public static final Region MRT = new Region("MRT", 153, EnumC0170g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE);
    public static final Region MSR = new Region("MSR", EnumC0170g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE);
    public static final Region MTQ = new Region("MTQ", EnumC0170g.SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE);
    public static final Region MUS = new Region("MUS", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE);
    public static final Region MWI = new Region("MWI", EnumC0170g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE);
    public static final Region MYS = new Region("MYS", EnumC0170g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE);
    public static final Region MYT = new Region("MYT", EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
    public static final Region NAM = new Region("NAM", EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE);
    public static final Region NCL = new Region("NCL", EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE);
    public static final Region NER = new Region("NER", EnumC0170g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE);
    public static final Region NFK = new Region("NFK", EnumC0170g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE);
    public static final Region NGA = new Region("NGA", EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 165);
    public static final Region NIC = new Region("NIC", 165, EnumC0170g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE);
    public static final Region NIU = new Region("NIU", EnumC0170g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, 167);
    public static final Region NLD = new Region("NLD", 167, EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
    public static final Region NOR = new Region("NOR", EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, EnumC0170g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE);
    public static final Region NPL = new Region("NPL", EnumC0170g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
    public static final Region NRU = new Region("NRU", EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE);
    public static final Region NZL = new Region("NZL", EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE);
    public static final Region OMN = new Region("OMN", EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE);
    public static final Region PAK = new Region("PAK", EnumC0170g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE);
    public static final Region PAN = new Region("PAN", EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE);
    public static final Region PCN = new Region("PCN", EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE);
    public static final Region PER = new Region("PER", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE);
    public static final Region PHL = new Region("PHL", EnumC0170g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE);
    public static final Region PLW = new Region("PLW", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE);
    public static final Region PNG = new Region("PNG", EnumC0170g.SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE);
    public static final Region POL = new Region("POL", EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE);
    public static final Region PRI = new Region("PRI", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE);
    public static final Region PRK = new Region("PRK", EnumC0170g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE);
    public static final Region PRT = new Region("PRT", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
    public static final Region PRY = new Region("PRY", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, 185);
    public static final Region PSE = new Region("PSE", 185, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE);
    public static final Region PYF = new Region("PYF", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE);
    public static final Region QAT = new Region("QAT", EnumC0170g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, 188);
    public static final Region REU = new Region("REU", 188, EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE);
    public static final Region ROU = new Region("ROU", EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
    public static final Region RUS = new Region("RUS", EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
    public static final Region RWA = new Region("RWA", EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 192);
    public static final Region SAU = new Region("SAU", 192, EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE);
    public static final Region SDN = new Region("SDN", EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, EnumC0170g.SDK_ASSET_ICON_EXTERNAL_VALUE);
    public static final Region SEN = new Region("SEN", EnumC0170g.SDK_ASSET_ICON_EXTERNAL_VALUE, EnumC0170g.SDK_ASSET_ICON_ALERT_WARNING_VALUE);
    public static final Region SGP = new Region("SGP", EnumC0170g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE);
    public static final Region SGS = new Region("SGS", EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, EnumC0170g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE);
    public static final Region SHN = new Region("SHN", EnumC0170g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, EnumC0170g.SDK_ASSET_ICON_ARROW_UP_VALUE);
    public static final Region SJM = new Region("SJM", EnumC0170g.SDK_ASSET_ICON_ARROW_UP_VALUE, EnumC0170g.SDK_ASSET_ICON_CANCEL_VALUE);
    public static final Region SLB = new Region("SLB", EnumC0170g.SDK_ASSET_ICON_CANCEL_VALUE, 200);
    public static final Region SLE = new Region("SLE", 200, EnumC0170g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE);
    public static final Region SLV = new Region("SLV", EnumC0170g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE);
    public static final Region SMR = new Region("SMR", EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE);
    public static final Region SOM = new Region("SOM", EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, EnumC0170g.SDK_ASSET_ICON_CLEARED_REC_VALUE);
    public static final Region SPM = new Region("SPM", EnumC0170g.SDK_ASSET_ICON_CLEARED_REC_VALUE, EnumC0170g.SDK_ASSET_ICON_CLIPBOARD_VALUE);
    public static final Region SRB = new Region("SRB", EnumC0170g.SDK_ASSET_ICON_CLIPBOARD_VALUE, EnumC0170g.SDK_ASSET_ICON_CLOCK_VALUE);
    public static final Region SSD = new Region("SSD", EnumC0170g.SDK_ASSET_ICON_CLOCK_VALUE, EnumC0170g.SDK_ASSET_ICON_COMMENT_VALUE);
    public static final Region STP = new Region("STP", EnumC0170g.SDK_ASSET_ICON_COMMENT_VALUE, EnumC0170g.SDK_ASSET_ICON_INCOME_VALUE);
    public static final Region SUR = new Region("SUR", EnumC0170g.SDK_ASSET_ICON_INCOME_VALUE, EnumC0170g.SDK_ASSET_ICON_INCOMPLETE_VALUE);
    public static final Region SVK = new Region("SVK", EnumC0170g.SDK_ASSET_ICON_INCOMPLETE_VALUE, EnumC0170g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
    public static final Region SVN = new Region("SVN", EnumC0170g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 211);
    public static final Region SWE = new Region("SWE", 211, EnumC0170g.SDK_ASSET_ICON_OVERRIDE_VALUE);
    public static final Region SWZ = new Region("SWZ", EnumC0170g.SDK_ASSET_ICON_OVERRIDE_VALUE, EnumC0170g.SDK_ASSET_ICON_PAUSE_VALUE);
    public static final Region SXM = new Region("SXM", EnumC0170g.SDK_ASSET_ICON_PAUSE_VALUE, EnumC0170g.SDK_ASSET_ICON_PIN_VALUE);
    public static final Region SYC = new Region("SYC", EnumC0170g.SDK_ASSET_ICON_PIN_VALUE, EnumC0170g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE);
    public static final Region SYR = new Region("SYR", EnumC0170g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
    public static final Region TCA = new Region("TCA", EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, EnumC0170g.SDK_ASSET_ICON_PROGRESS_VALUE);
    public static final Region TCD = new Region("TCD", EnumC0170g.SDK_ASSET_ICON_PROGRESS_VALUE, EnumC0170g.SDK_ASSET_ICON_QUESTION_VALUE);
    public static final Region TGO = new Region("TGO", EnumC0170g.SDK_ASSET_ICON_QUESTION_VALUE, EnumC0170g.SDK_ASSET_ICON_REJECTED_REC_VALUE);
    public static final Region THA = new Region("THA", EnumC0170g.SDK_ASSET_ICON_REJECTED_REC_VALUE, EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
    public static final Region TJK = new Region("TJK", EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, EnumC0170g.SDK_ASSET_ICON_SUBMIT_VALUE);
    public static final Region TKL = new Region("TKL", EnumC0170g.SDK_ASSET_ICON_SUBMIT_VALUE, EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE);
    public static final Region TKM = new Region("TKM", EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
    public static final Region TLS = new Region("TLS", EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 224);
    public static final Region TON = new Region("TON", 224, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE);
    public static final Region TTO = new Region("TTO", EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE);
    public static final Region TUN = new Region("TUN", EnumC0170g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE);
    public static final Region TUR = new Region("TUR", EnumC0170g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
    public static final Region TUV = new Region("TUV", EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE);
    public static final Region TWN = new Region("TWN", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE);
    public static final Region TZA = new Region("TZA", EnumC0170g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE);
    public static final Region UGA = new Region("UGA", EnumC0170g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
    public static final Region UKR = new Region("UKR", EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
    public static final Region UMI = new Region("UMI", EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE);
    public static final Region URY = new Region("URY", EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE);
    public static final Region UZB = new Region("UZB", EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
    public static final Region VAT = new Region("VAT", EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE);
    public static final Region VCT = new Region("VCT", EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE);
    public static final Region VEN = new Region("VEN", EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, 239);
    public static final Region VGB = new Region("VGB", 239, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
    public static final Region VIR = new Region("VIR", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE);
    public static final Region VNM = new Region("VNM", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE);
    public static final Region VUT = new Region("VUT", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE);
    public static final Region WLF = new Region("WLF", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
    public static final Region WSM = new Region("WSM", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE);
    public static final Region YEM = new Region("YEM", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE);
    public static final Region ZAF = new Region("ZAF", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE);
    public static final Region ZMB = new Region("ZMB", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
    public static final Region ZWE = new Region("ZWE", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE);
    public static final Region XXL = new Region("XXL", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, 900);
    public static final Region XTS = new Region("XTS", EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, 963);

    private static final /* synthetic */ Region[] $values() {
        return new Region[]{USA, CAN, GBR, AUS, ABW, AFG, AGO, AIA, ALA, ALB, AND, ARE, ARG, ARM, ASM, ATA, ATF, ATG, AUT, AZE, BDI, BEL, BEN, BES, BFA, BGD, BGR, BHR, BHS, BIH, BLM, BLR, BLZ, BMU, BOL, BRA, BRB, BRN, BTN, BVT, BWA, CAF, CCK, CHE, CHL, CHN, CIV, CMR, COD, COG, COK, COL, COM, CPV, CRI, CUB, CUW, CXR, CYM, CYP, CZE, DEU, DJI, DMA, DNK, DOM, DZA, ECU, EGY, ERI, ESH, ESP, EST, ETH, FIN, FJI, FLK, FRA, FRO, FSM, GAB, GEO, GGY, GHA, GIB, GIN, GLP, GMB, GNB, GNQ, GRC, GRD, GRL, GTM, GUF, GUM, GUY, HKG, HMD, HND, HRV, HTI, HUN, IDN, IMN, IND, IOT, IRL, IRN, IRQ, ISL, ISR, ITA, JAM, JEY, JOR, JPN, KAZ, KEN, KGZ, KHM, KIR, KNA, KOR, KWT, LAO, LBN, LBR, LBY, LCA, LIE, LKA, LSO, LTU, LUX, LVA, MAC, MAF, MAR, MCO, MDA, MDG, MDV, MEX, MHL, MKD, MLI, MLT, MMR, MNE, MNG, MNP, MOZ, MRT, MSR, MTQ, MUS, MWI, MYS, MYT, NAM, NCL, NER, NFK, NGA, NIC, NIU, NLD, NOR, NPL, NRU, NZL, OMN, PAK, PAN, PCN, PER, PHL, PLW, PNG, POL, PRI, PRK, PRT, PRY, PSE, PYF, QAT, REU, ROU, RUS, RWA, SAU, SDN, SEN, SGP, SGS, SHN, SJM, SLB, SLE, SLV, SMR, SOM, SPM, SRB, SSD, STP, SUR, SVK, SVN, SWE, SWZ, SXM, SYC, SYR, TCA, TCD, TGO, THA, TJK, TKL, TKM, TLS, TON, TTO, TUN, TUR, TUV, TWN, TZA, UGA, UKR, UMI, URY, UZB, VAT, VCT, VEN, VGB, VIR, VNM, VUT, WLF, WSM, YEM, ZAF, ZMB, ZWE, XXL, XTS};
    }

    static {
        Region[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Region.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.Region$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public Region fromValue(int value) {
                return Region.INSTANCE.fromValue(value);
            }
        };
    }

    private Region(String str, int i, int i2) {
        this.value = i2;
    }

    public static final Region fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static Region valueOf(String str) {
        return (Region) Enum.valueOf(Region.class, str);
    }

    public static Region[] values() {
        return (Region[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/Region$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/Region;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Region fromValue(int value) {
            if (value == 900) {
                return Region.XXL;
            }
            if (value == 963) {
                return Region.XTS;
            }
            switch (value) {
                case 1:
                    return Region.USA;
                case 2:
                    return Region.CAN;
                case 3:
                    return Region.GBR;
                case 4:
                    return Region.AUS;
                case 5:
                    return Region.ABW;
                case 6:
                    return Region.AFG;
                case 7:
                    return Region.AGO;
                case 8:
                    return Region.AIA;
                case 9:
                    return Region.ALA;
                case 10:
                    return Region.ALB;
                case 11:
                    return Region.AND;
                case 12:
                    return Region.ARE;
                case 13:
                    return Region.ARG;
                case 14:
                    return Region.ARM;
                case 15:
                    return Region.ASM;
                case 16:
                    return Region.ATA;
                case 17:
                    return Region.ATF;
                case 18:
                    return Region.ATG;
                case 19:
                    return Region.AUT;
                case 20:
                    return Region.AZE;
                case 21:
                    return Region.BDI;
                case 22:
                    return Region.BEL;
                case 23:
                    return Region.BEN;
                case 24:
                    return Region.BES;
                case 25:
                    return Region.BFA;
                case 26:
                    return Region.BGD;
                case 27:
                    return Region.BGR;
                case 28:
                    return Region.BHR;
                case 29:
                    return Region.BHS;
                case 30:
                    return Region.BIH;
                case 31:
                    return Region.BLM;
                case 32:
                    return Region.BLR;
                case 33:
                    return Region.BLZ;
                case 34:
                    return Region.BMU;
                case 35:
                    return Region.BOL;
                case 36:
                    return Region.BRA;
                case 37:
                    return Region.BRB;
                case 38:
                    return Region.BRN;
                case 39:
                    return Region.BTN;
                case 40:
                    return Region.BVT;
                case 41:
                    return Region.BWA;
                case 42:
                    return Region.CAF;
                case 43:
                    return Region.CCK;
                case 44:
                    return Region.CHE;
                case 45:
                    return Region.CHL;
                case 46:
                    return Region.CHN;
                case 47:
                    return Region.CIV;
                case 48:
                    return Region.CMR;
                case 49:
                    return Region.COD;
                case 50:
                    return Region.COG;
                case 51:
                    return Region.COK;
                case 52:
                    return Region.COL;
                case 53:
                    return Region.COM;
                case 54:
                    return Region.CPV;
                case 55:
                    return Region.CRI;
                case 56:
                    return Region.CUB;
                case 57:
                    return Region.CUW;
                case 58:
                    return Region.CXR;
                case 59:
                    return Region.CYM;
                case 60:
                    return Region.CYP;
                case 61:
                    return Region.CZE;
                case 62:
                    return Region.DEU;
                case 63:
                    return Region.DJI;
                case 64:
                    return Region.DMA;
                case 65:
                    return Region.DNK;
                case 66:
                    return Region.DOM;
                case 67:
                    return Region.DZA;
                case 68:
                    return Region.ECU;
                case 69:
                    return Region.EGY;
                case 70:
                    return Region.ERI;
                case 71:
                    return Region.ESH;
                case 72:
                    return Region.ESP;
                case 73:
                    return Region.EST;
                case 74:
                    return Region.ETH;
                case 75:
                    return Region.FIN;
                case 76:
                    return Region.FJI;
                case 77:
                    return Region.FLK;
                case 78:
                    return Region.FRA;
                case 79:
                    return Region.FRO;
                case 80:
                    return Region.FSM;
                case 81:
                    return Region.GAB;
                case 82:
                    return Region.GEO;
                case 83:
                    return Region.GGY;
                case 84:
                    return Region.GHA;
                case 85:
                    return Region.GIB;
                case 86:
                    return Region.GIN;
                case 87:
                    return Region.GLP;
                case 88:
                    return Region.GMB;
                case 89:
                    return Region.GNB;
                case 90:
                    return Region.GNQ;
                case 91:
                    return Region.GRC;
                case 92:
                    return Region.GRD;
                case 93:
                    return Region.GRL;
                case 94:
                    return Region.GTM;
                case 95:
                    return Region.GUF;
                case 96:
                    return Region.GUM;
                case 97:
                    return Region.GUY;
                case 98:
                    return Region.HKG;
                case 99:
                    return Region.HMD;
                case 100:
                    return Region.HND;
                case 101:
                    return Region.HRV;
                case 102:
                    return Region.HTI;
                case 103:
                    return Region.HUN;
                case 104:
                    return Region.IDN;
                case 105:
                    return Region.IMN;
                case 106:
                    return Region.IND;
                case 107:
                    return Region.IOT;
                case 108:
                    return Region.IRL;
                case 109:
                    return Region.IRN;
                case 110:
                    return Region.IRQ;
                case 111:
                    return Region.ISL;
                case 112:
                    return Region.ISR;
                case 113:
                    return Region.ITA;
                case 114:
                    return Region.JAM;
                case 115:
                    return Region.JEY;
                case 116:
                    return Region.JOR;
                case 117:
                    return Region.JPN;
                case 118:
                    return Region.KAZ;
                case 119:
                    return Region.KEN;
                case 120:
                    return Region.KGZ;
                case 121:
                    return Region.KHM;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                    return Region.KIR;
                case SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE:
                    return Region.KNA;
                case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                    return Region.KOR;
                case 125:
                    return Region.KWT;
                case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                    return Region.LAO;
                case 127:
                    return Region.LBN;
                case 128:
                    return Region.LBR;
                case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                    return Region.LBY;
                case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                    return Region.LCA;
                case 131:
                    return Region.LIE;
                case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                    return Region.LKA;
                case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                    return Region.LSO;
                case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                    return Region.LTU;
                case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
                    return Region.LUX;
                case 136:
                    return Region.LVA;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                    return Region.MAC;
                case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                    return Region.MAF;
                case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                    return Region.MAR;
                case 140:
                    return Region.MCO;
                case SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE:
                    return Region.MDA;
                case SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE:
                    return Region.MDG;
                case SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE:
                    return Region.MDV;
                case 144:
                    return Region.MEX;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
                    return Region.MHL;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                    return Region.MKD;
                case 147:
                    return Region.MLI;
                case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
                    return Region.MLT;
                case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
                    return Region.MMR;
                case 150:
                    return Region.MNE;
                case 151:
                    return Region.MNG;
                case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                    return Region.MNP;
                case 153:
                    return Region.MOZ;
                case SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE:
                    return Region.MRT;
                case SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE:
                    return Region.MSR;
                case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE:
                    return Region.MTQ;
                case SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE:
                    return Region.MUS;
                case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                    return Region.MWI;
                case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                    return Region.MYS;
                case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
                    return Region.MYT;
                case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE:
                    return Region.NAM;
                case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
                    return Region.NCL;
                case SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE:
                    return Region.NER;
                case SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE:
                    return Region.NFK;
                case 165:
                    return Region.NGA;
                case SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE:
                    return Region.NIC;
                case 167:
                    return Region.NIU;
                case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE:
                    return Region.NLD;
                case SDK_ASSET_HEADER_CARD_COLLECT_VALUE:
                    return Region.NOR;
                case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                    return Region.NPL;
                case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE:
                    return Region.NRU;
                case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE:
                    return Region.NZL;
                case SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE:
                    return Region.OMN;
                case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
                    return Region.PAK;
                case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE:
                    return Region.PAN;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE:
                    return Region.PCN;
                case SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE:
                    return Region.PER;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE:
                    return Region.PHL;
                case SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE:
                    return Region.PLW;
                case SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE:
                    return Region.PNG;
                case SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE:
                    return Region.POL;
                case SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE:
                    return Region.PRI;
                case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE:
                    return Region.PRK;
                case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE:
                    return Region.PRT;
                case 185:
                    return Region.PRY;
                case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE:
                    return Region.PSE;
                case SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE:
                    return Region.PYF;
                case 188:
                    return Region.QAT;
                case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE:
                    return Region.REU;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE:
                    return Region.ROU;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE:
                    return Region.RUS;
                case 192:
                    return Region.RWA;
                case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE:
                    return Region.SAU;
                case SDK_ASSET_ICON_EXTERNAL_VALUE:
                    return Region.SDN;
                case SDK_ASSET_ICON_ALERT_WARNING_VALUE:
                    return Region.SEN;
                case SDK_ASSET_ICON_ARROW_DOWN_VALUE:
                    return Region.SGP;
                case SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE:
                    return Region.SGS;
                case SDK_ASSET_ICON_ARROW_UP_VALUE:
                    return Region.SHN;
                case SDK_ASSET_ICON_CANCEL_VALUE:
                    return Region.SJM;
                case 200:
                    return Region.SLB;
                case SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE:
                    return Region.SLE;
                case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE:
                    return Region.SLV;
                case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE:
                    return Region.SMR;
                case SDK_ASSET_ICON_CLEARED_REC_VALUE:
                    return Region.SOM;
                case SDK_ASSET_ICON_CLIPBOARD_VALUE:
                    return Region.SPM;
                case SDK_ASSET_ICON_CLOCK_VALUE:
                    return Region.SRB;
                case SDK_ASSET_ICON_COMMENT_VALUE:
                    return Region.SSD;
                case SDK_ASSET_ICON_INCOME_VALUE:
                    return Region.STP;
                case SDK_ASSET_ICON_INCOMPLETE_VALUE:
                    return Region.SUR;
                case SDK_ASSET_ICON_NEW_WINDOW_VALUE:
                    return Region.SVK;
                case 211:
                    return Region.SVN;
                case SDK_ASSET_ICON_OVERRIDE_VALUE:
                    return Region.SWE;
                case SDK_ASSET_ICON_PAUSE_VALUE:
                    return Region.SWZ;
                case SDK_ASSET_ICON_PIN_VALUE:
                    return Region.SXM;
                case SDK_ASSET_ICON_PRODUCT_IDV_VALUE:
                    return Region.SYC;
                case SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE:
                    return Region.SYR;
                case SDK_ASSET_ICON_PROGRESS_VALUE:
                    return Region.TCA;
                case SDK_ASSET_ICON_QUESTION_VALUE:
                    return Region.TCD;
                case SDK_ASSET_ICON_REJECTED_REC_VALUE:
                    return Region.TGO;
                case SDK_ASSET_ICON_SHIELD_CAUTION_VALUE:
                    return Region.THA;
                case SDK_ASSET_ICON_SUBMIT_VALUE:
                    return Region.TJK;
                case SDK_ASSET_ICON_SUBTRACT_VALUE:
                    return Region.TKL;
                case SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE:
                    return Region.TKM;
                case 224:
                    return Region.TLS;
                case SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE:
                    return Region.TON;
                case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE:
                    return Region.TTO;
                case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE:
                    return Region.TUN;
                case SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE:
                    return Region.TUR;
                case SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE:
                    return Region.TUV;
                case SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE:
                    return Region.TWN;
                case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
                    return Region.TZA;
                case SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE:
                    return Region.UGA;
                case SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE:
                    return Region.UKR;
                case SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE:
                    return Region.UMI;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE:
                    return Region.URY;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE:
                    return Region.UZB;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE:
                    return Region.VAT;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
                    return Region.VCT;
                case 239:
                    return Region.VEN;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE:
                    return Region.VGB;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE:
                    return Region.VIR;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE:
                    return Region.VNM;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE:
                    return Region.VUT;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE:
                    return Region.WLF;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE:
                    return Region.WSM;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE:
                    return Region.YEM;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE:
                    return Region.ZAF;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                    return Region.ZMB;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE:
                    return Region.ZWE;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }
}
