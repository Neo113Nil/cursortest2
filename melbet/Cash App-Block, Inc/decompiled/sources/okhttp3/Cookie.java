package okhttp3;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.controller.MiSnapController;
import com.miteksystems.misnap.workflow.MiSnapFinalResult;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice;
import com.squareup.cash.investing.backend.api.model.EntitySelectionBlocker;
import com.squareup.cash.investing.db.Investment_entity;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Image;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.cash.ColorsKt;
import com.squareup.wire.MoshiJsonIntegration;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http.DateFormattingKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.commonmark.internal.util.LinkScanner;

/* loaded from: classes9.dex */
public final class Cookie {
    public final String domain;
    public final long expiresAt;
    public final boolean hostOnly;
    public final boolean httpOnly;
    public final String name;
    public final String path;
    public final boolean persistent;
    public final String sameSite;
    public final boolean secure;
    public final String value;
    public static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.persistent = z3;
        this.hostOnly = z4;
        this.sameSite = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return cookie.name.equals(this.name) && cookie.value.equals(this.value) && cookie.expiresAt == this.expiresAt && cookie.domain.equals(this.domain) && cookie.path.equals(this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly && Intrinsics.areEqual(cookie.sameSite, this.sameSite);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(527, 31, this.name), 31, this.value), 31, this.expiresAt), 31, this.domain), 31, this.path), 31, this.secure), 31, this.httpOnly), 31, this.persistent), 31, this.hostOnly);
        String str = this.sameSite;
        return m + (str != null ? str.hashCode() : 0);
    }

    public final String name() {
        return this.name;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        if (this.persistent) {
            long j = this.expiresAt;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format2 = ((DateFormat) DateFormattingKt.STANDARD_DATE_FORMAT.get()).format(new Date(j));
                format2.getClass();
                sb.append(format2);
            }
        }
        if (!this.hostOnly) {
            sb.append("; domain=");
            sb.append(this.domain);
        }
        sb.append("; path=");
        sb.append(this.path);
        if (this.secure) {
            sb.append("; secure");
        }
        if (this.httpOnly) {
            sb.append("; httponly");
        }
        String str = this.sameSite;
        if (str != null) {
            sb.append("; samesite=");
            sb.append(str);
        }
        return sb.toString();
    }

    public final String value() {
        return this.value;
    }

    public abstract class Companion {
        public static final MiSnapFinalResult a(MiSnapController.FrameResult frameResult, byte[] bArr) {
            frameResult.getClass();
            if (frameResult instanceof MiSnapController.FrameResult.BarcodeAnalysis) {
                MiSnapController.FrameResult.BarcodeAnalysis barcodeAnalysis = (MiSnapController.FrameResult.BarcodeAnalysis) frameResult;
                return new MiSnapFinalResult.BarcodeSession(barcodeAnalysis.a, bArr, barcodeAnalysis.b, barcodeAnalysis.c, barcodeAnalysis.d, barcodeAnalysis.e, barcodeAnalysis.f);
            }
            if (frameResult instanceof MiSnapController.FrameResult.DocumentAnalysis) {
                MiSnapController.FrameResult.DocumentAnalysis documentAnalysis = (MiSnapController.FrameResult.DocumentAnalysis) frameResult;
                return new MiSnapFinalResult.DocumentSession(documentAnalysis.a, bArr, documentAnalysis.b, documentAnalysis.c, documentAnalysis.d, documentAnalysis.e, documentAnalysis.f, documentAnalysis.g, documentAnalysis.h);
            }
            if (frameResult instanceof MiSnapController.FrameResult.FaceAnalysis) {
                MiSnapController.FrameResult.FaceAnalysis faceAnalysis = (MiSnapController.FrameResult.FaceAnalysis) frameResult;
                return new MiSnapFinalResult.FaceSession(faceAnalysis.a, bArr, faceAnalysis.b, faceAnalysis.c, faceAnalysis.d, faceAnalysis.e, faceAnalysis.f);
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }

        public static final InvestingStockSelectionViewModel.SearchResultItemModel access$SearchResultItemModel(Investment_entity investment_entity) {
            InvestmentEntityToken investmentEntityToken = new InvestmentEntityToken(investment_entity.token);
            String str = investment_entity.display_name;
            String str2 = investment_entity.symbol;
            Image image = investment_entity.icon;
            if (image == null) {
                String str3 = investment_entity.icon_url;
                str3.getClass();
                image = new Image(str3, str3, 4);
            }
            Color color = investment_entity.entity_color;
            if (color == null) {
                String str4 = investment_entity.color;
                str4.getClass();
                color = ColorsKt.toColor(str4);
            }
            return new InvestingStockSelectionViewModel.SearchResultItemModel(investmentEntityToken, str, str2, new InvestingCryptoAvatarContentModel$Image(image, new ColorModel.Accented(color)), false, true);
        }

        public static final InvestingStockSelectionViewModel.SearchResultItemModel access$updateStatus(InvestingStockSelectionViewModel.SearchResultItemModel searchResultItemModel, Set set, boolean z) {
            boolean contains = set.contains(searchResultItemModel.entityToken.value);
            boolean z2 = contains || !z;
            InvestmentEntityToken investmentEntityToken = searchResultItemModel.entityToken;
            String str = searchResultItemModel.stockName;
            String str2 = searchResultItemModel.symbol;
            LinkScanner linkScanner = searchResultItemModel.avatar;
            investmentEntityToken.getClass();
            str.getClass();
            str2.getClass();
            linkScanner.getClass();
            return new InvestingStockSelectionViewModel.SearchResultItemModel(investmentEntityToken, str, str2, linkScanner, contains, z2);
        }

        public static int dateCharacterOffset(int i, int i2, String str, boolean z) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        public static final Pair getSelectionConfigs(EntitySelectionBlocker entitySelectionBlocker, Set set) {
            if (entitySelectionBlocker instanceof EntitySelectionBlocker.MultiSelectData) {
                EntitySelectionBlocker.MultiSelectData.MultiSelectConfig multiSelectConfig = ((EntitySelectionBlocker.MultiSelectData) entitySelectionBlocker).multiSelectConfig;
                return new Pair(Boolean.valueOf(set.size() >= multiSelectConfig.maxSelections), CollectionsKt.union(set, multiSelectConfig.selectedInvestmentEntities));
            }
            if ((entitySelectionBlocker instanceof EntitySelectionBlocker.SingleSelectData) || entitySelectionBlocker == null) {
                return new Pair(Boolean.FALSE, EmptySet.INSTANCE);
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }

        public static Cookie parse(HttpUrl httpUrl, String str) {
            HttpUrl httpUrl2;
            long j;
            String str2;
            httpUrl.getClass();
            str.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            char c = ';';
            int delimiterOffset$default = _UtilCommonKt.delimiterOffset$default(str, ';', 0, 0, 6);
            char c2 = '=';
            int delimiterOffset$default2 = _UtilCommonKt.delimiterOffset$default(str, '=', 0, delimiterOffset$default, 2);
            String str3 = null;
            if (delimiterOffset$default2 != delimiterOffset$default) {
                String trimSubstring = _UtilCommonKt.trimSubstring(0, delimiterOffset$default2, str);
                if (trimSubstring.length() != 0 && _UtilCommonKt.indexOfControlOrNonAscii(trimSubstring) == -1) {
                    String trimSubstring2 = _UtilCommonKt.trimSubstring(delimiterOffset$default2 + 1, delimiterOffset$default, str);
                    if (_UtilCommonKt.indexOfControlOrNonAscii(trimSubstring2) == -1) {
                        int i = delimiterOffset$default + 1;
                        int length = str.length();
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        String str4 = null;
                        boolean z4 = true;
                        long j2 = 253402300799999L;
                        long j3 = -1;
                        String str5 = null;
                        while (true) {
                            if (i >= length) {
                                if (j3 == Long.MIN_VALUE) {
                                    httpUrl2 = httpUrl;
                                    j = Long.MIN_VALUE;
                                } else if (j3 != -1) {
                                    long j4 = currentTimeMillis + (j3 <= 9223372036854775L ? j3 * 1000 : Long.MAX_VALUE);
                                    if (j4 < currentTimeMillis || j4 > 253402300799999L) {
                                        httpUrl2 = httpUrl;
                                        j = 253402300799999L;
                                    } else {
                                        httpUrl2 = httpUrl;
                                        j = j4;
                                    }
                                } else {
                                    httpUrl2 = httpUrl;
                                    j = j2;
                                }
                                String str6 = httpUrl2.host;
                                if (str3 != null) {
                                    if (Intrinsics.areEqual(str6, str3) || (StringsKt__StringsJVMKt.endsWith(str6, str3, false) && str6.charAt((str6.length() - str3.length()) - 1) == '.' && !_HostnamesCommonKt.VERIFY_AS_IP_ADDRESS.matches(str6))) {
                                        str2 = str3;
                                    }
                                    return null;
                                }
                                str2 = str6;
                                if (str6.length() == str2.length() || PublicSuffixDatabase.instance.getEffectiveTldPlusOne(str2) != null) {
                                    if (str5 == null || !StringsKt__StringsJVMKt.startsWith(str5, "/", false)) {
                                        String encodedPath = httpUrl2.encodedPath();
                                        int lastIndexOf$default = StringsKt.lastIndexOf$default('/', 0, 6, (CharSequence) encodedPath);
                                        str5 = lastIndexOf$default != 0 ? encodedPath.substring(0, lastIndexOf$default) : "/";
                                    }
                                    return new Cookie(trimSubstring, trimSubstring2, j, str2, str5, z3, z, z2, z4, str4);
                                }
                                return null;
                            }
                            int delimiterOffset = _UtilCommonKt.delimiterOffset(str, c, i, length);
                            int delimiterOffset2 = _UtilCommonKt.delimiterOffset(str, c2, i, delimiterOffset);
                            String trimSubstring3 = _UtilCommonKt.trimSubstring(i, delimiterOffset2, str);
                            String trimSubstring4 = delimiterOffset2 < delimiterOffset ? _UtilCommonKt.trimSubstring(delimiterOffset2 + 1, delimiterOffset, str) : "";
                            if (trimSubstring3.equalsIgnoreCase("expires")) {
                                try {
                                    j2 = parseExpires(trimSubstring4.length(), trimSubstring4);
                                    z2 = true;
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                                i = delimiterOffset + 1;
                                c = ';';
                                c2 = '=';
                            } else if (trimSubstring3.equalsIgnoreCase("max-age")) {
                                try {
                                    j3 = Long.parseLong(trimSubstring4);
                                    if (j3 <= 0) {
                                        j3 = Long.MIN_VALUE;
                                    }
                                } catch (NumberFormatException e) {
                                    if (!new Regex("-?\\d+").matches(trimSubstring4)) {
                                        throw e;
                                    }
                                    j3 = StringsKt__StringsJVMKt.startsWith(trimSubstring4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                }
                                z2 = true;
                                i = delimiterOffset + 1;
                                c = ';';
                                c2 = '=';
                            } else {
                                if (trimSubstring3.equalsIgnoreCase("domain")) {
                                    if (StringsKt__StringsJVMKt.endsWith(trimSubstring4, ".", false)) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    String canonicalHost = _HostnamesCommonKt.toCanonicalHost(StringsKt.removePrefix(".", trimSubstring4));
                                    if (canonicalHost == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str3 = canonicalHost;
                                    z4 = false;
                                } else if (trimSubstring3.equalsIgnoreCase("path")) {
                                    str5 = trimSubstring4;
                                } else if (trimSubstring3.equalsIgnoreCase("secure")) {
                                    z3 = true;
                                } else if (trimSubstring3.equalsIgnoreCase("httponly")) {
                                    z = true;
                                } else if (trimSubstring3.equalsIgnoreCase("samesite")) {
                                    str4 = trimSubstring4;
                                }
                                i = delimiterOffset + 1;
                                c = ';';
                                c2 = '=';
                            }
                        }
                    }
                }
            }
            return null;
        }

        public static List parseAll(HttpUrl httpUrl, Headers headers) {
            httpUrl.getClass();
            headers.getClass();
            List values = headers.values("Set-Cookie");
            int size = values.size();
            List list = null;
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                Cookie parse = parse(httpUrl, (String) values.get(i));
                if (parse != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(parse);
                }
            }
            if (arrayList != null) {
                list = Collections.unmodifiableList(arrayList);
                list.getClass();
            }
            return list == null ? EmptyList.INSTANCE : list;
        }

        public static long parseExpires(int i, String str) {
            int dateCharacterOffset = dateCharacterOffset(0, i, str, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(str);
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            while (dateCharacterOffset < i) {
                int dateCharacterOffset2 = dateCharacterOffset(dateCharacterOffset + 1, i, str, true);
                matcher.region(dateCharacterOffset, dateCharacterOffset2);
                if (i3 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    String group = matcher.group(1);
                    group.getClass();
                    i3 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    group2.getClass();
                    i6 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    group3.getClass();
                    i7 = Integer.parseInt(group3);
                } else if (i4 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    String group4 = matcher.group(1);
                    group4.getClass();
                    i4 = Integer.parseInt(group4);
                } else {
                    if (i5 == -1) {
                        Pattern pattern = Cookie.MONTH_PATTERN;
                        if (matcher.usePattern(pattern).matches()) {
                            String group5 = matcher.group(1);
                            group5.getClass();
                            Locale locale = Locale.US;
                            String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, group5, locale);
                            String pattern2 = pattern.pattern();
                            pattern2.getClass();
                            i5 = StringsKt.indexOf$default((CharSequence) pattern2, m, 0, false, 6) / 4;
                        }
                    }
                    if (i2 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                        String group6 = matcher.group(1);
                        group6.getClass();
                        i2 = Integer.parseInt(group6);
                    }
                }
                dateCharacterOffset = dateCharacterOffset(dateCharacterOffset2 + 1, i, str, false);
            }
            if (70 <= i2 && i2 < 100) {
                i2 += 1900;
            }
            if (i2 >= 0 && i2 < 70) {
                i2 += 2000;
            }
            if (i2 < 1601) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                return 0L;
            }
            if (i5 == -1) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                return 0L;
            }
            if (1 > i4 || i4 >= 32) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                return 0L;
            }
            if (i3 < 0 || i3 >= 24) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                return 0L;
            }
            if (i6 < 0 || i6 >= 60) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                return 0L;
            }
            if (i7 < 0 || i7 >= 60) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                return 0L;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(_UtilJvmKt.UTC);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i2);
            gregorianCalendar.set(2, i5 - 1);
            gregorianCalendar.set(5, i4);
            gregorianCalendar.set(11, i3);
            gregorianCalendar.set(12, i6);
            gregorianCalendar.set(13, i7);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        public static final InvestingStockSelectionViewModel.SearchResultItemModel access$SearchResultItemModel(InvestmentEntityWithPrice investmentEntityWithPrice) {
            InvestmentEntityToken token = investmentEntityWithPrice.getToken();
            String displayName = investmentEntityWithPrice.getDisplayName();
            String symbol = investmentEntityWithPrice.getSymbol();
            Image icon = investmentEntityWithPrice.getIcon();
            icon.getClass();
            return new InvestingStockSelectionViewModel.SearchResultItemModel(token, displayName, symbol, new InvestingCryptoAvatarContentModel$Image(icon, MoshiJsonIntegration.toModel(investmentEntityWithPrice.getAccentColor())), false, true);
        }
    }
}
