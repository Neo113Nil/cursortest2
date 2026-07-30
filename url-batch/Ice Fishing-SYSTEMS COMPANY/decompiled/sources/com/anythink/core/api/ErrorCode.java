package com.anythink.core.api;

import com.anythink.basead.b.b.j;
import com.anythink.core.common.d.j;
import com.anythink.core.common.n.a.i;
import com.anythink.core.common.v.m;
import com.anythink.expressad.foundation.h.p;

/* loaded from: classes.dex */
public class ErrorCode {
    public static final String adShowError = "4006";
    public static final String adSourceBidError = "4007";
    public static final String adSourceLoadBidTypeFilterError = "2032";
    public static final String adSourceLoadCappingError = "2022";
    public static final String adSourceLoadPriceFilterError = "2033";
    public static final String adSourceLoadRiskError = "2031";
    public static final String adSourceLoadUnitFilterError = "2034";
    public static final String adSourceNotFilledError = "4008";
    public static final String adapterInnerError = "2006";
    public static final String adapterNotExistError = "2002";
    public static final String appIdError = "10003";
    public static final String appIdOrPlaceIdEmpty = "3002";
    public static final String appKeyError = "10001";
    public static final String biddingResultHasShow = "2019";
    public static final String c2sBiddingCacheError = "2012";
    public static final String compareFailedError = "2035";
    public static final String contextDestoryError = "4002";
    public static final String dataLevelLowError = "9992";
    public static final String exception = "9999";
    public static final String filterByMNErrorCodeReqLimit = "2020";
    public static final String filterByMatchNetworkErrorCode = "2021";
    public static final String filterByRefreshSystemSplash = "2015";
    public static final String filterSourceError = "2010";
    public static final String forbidNetworkByDeveloper = "2018";
    public static final String formatError = "3003";
    public static final String httpStatuException = "9990";
    public static final String inAdxBidFailedInterval = "2017";
    public static final String inAdxBidInterval = "2016";
    public static final String inNetworkErrorCodeRequestFailPacing = "2014";
    public static final String inPacingError = "2004";
    public static final String inPacingError_Format = "2030";
    public static final String inPacingError_Global = "2029";
    public static final String inRequestFailPacing = "2007";
    public static final String loadCappingError = "2009";
    public static final String loadCappingError_Format = "2024";
    public static final String loadCappingError_Global = "2023";
    public static final String loadFailInPacingError = "2008";
    public static final String loadInShowingFilter = "2011";
    public static final String loadingError = "2005";
    public static final String networkError = "1001";
    public static final String networkFirmIdFilterSourceError = "2013";
    public static final String noADError = "4001";
    public static final String noAdsourceConfig = "4004";
    public static final String noAdsourceConfigInDebugerMode = "4009";
    public static final String noAvailableAdsource = "4005";
    public static final String noFillNcError = "2036";
    public static final String noFillSError = "2037";
    public static final String noFillSrError = "2038";
    public static final String outOfCapError = "2003";
    public static final String outOfCapError_day_Format = "2026";
    public static final String outOfCapError_day_Global = "2025";
    public static final String outOfCapError_hour_Format = "2028";
    public static final String outOfCapError_hour_Global = "2027";
    public static final String placeDeletedError = "3004";
    public static final String placeStrategyError = "3001";
    public static final String placementAdClose = "4003";
    public static final String placementIdError = "10004";
    public static final String serverError = "1002";
    public static final String sharedPlacementIdError = "10019";
    public static final String statuError = "9991";
    public static final String timeOutError = "2001";
    public static final String unknown = "-9999";
    public static final String unknownMediationIdError = "10020";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static AdError getErrorCode(String str, String str2, String str3) {
        String str4;
        String str5;
        String str6 = loadingError;
        String str7 = inPacingError;
        String str8 = outOfCapError;
        String str9 = adapterNotExistError;
        String str10 = timeOutError;
        String str11 = serverError;
        str.getClass();
        switch (str.hashCode()) {
            case 1507424:
                str4 = adapterInnerError;
                str5 = networkError;
                if (str.equals(str5)) {
                    r23 = 0;
                    break;
                }
                break;
            case 1507425:
                str4 = adapterInnerError;
                r23 = str.equals(str11) ? (char) 1 : (char) 65535;
                str11 = str11;
                str5 = networkError;
                break;
            case 1537215:
                str4 = adapterInnerError;
                r23 = str.equals(str10) ? (char) 2 : (char) 65535;
                str10 = str10;
                str5 = networkError;
                break;
            case 1537216:
                str4 = adapterInnerError;
                r23 = str.equals(str9) ? (char) 3 : (char) 65535;
                str9 = str9;
                str5 = networkError;
                break;
            case 1537217:
                str4 = adapterInnerError;
                r23 = str.equals(str8) ? (char) 4 : (char) 65535;
                str8 = str8;
                str5 = networkError;
                break;
            case 1537218:
                str4 = adapterInnerError;
                r23 = str.equals(str7) ? (char) 5 : (char) 65535;
                str7 = str7;
                str5 = networkError;
                break;
            case 1537219:
                str4 = adapterInnerError;
                r23 = str.equals(str6) ? (char) 6 : (char) 65535;
                str6 = str6;
                str5 = networkError;
                break;
            case 1537220:
                if (str.equals(adapterInnerError)) {
                    r23 = 7;
                }
                str4 = adapterInnerError;
                str5 = networkError;
                break;
            case 1537221:
                str4 = adapterInnerError;
                if (str.equals(inRequestFailPacing)) {
                    r23 = '\b';
                }
                str5 = networkError;
                break;
            case 1537222:
                str4 = adapterInnerError;
                if (str.equals(loadFailInPacingError)) {
                    r23 = '\t';
                }
                str5 = networkError;
                break;
            case 1537223:
                str4 = adapterInnerError;
                if (str.equals(loadCappingError)) {
                    r23 = '\n';
                }
                str5 = networkError;
                break;
            case 1537245:
                str4 = adapterInnerError;
                if (str.equals(filterSourceError)) {
                    r23 = 11;
                }
                str5 = networkError;
                break;
            case 1537246:
                str4 = adapterInnerError;
                if (str.equals(loadInShowingFilter)) {
                    r23 = '\f';
                }
                str5 = networkError;
                break;
            case 1537247:
                str4 = adapterInnerError;
                if (str.equals(c2sBiddingCacheError)) {
                    r23 = '\r';
                }
                str5 = networkError;
                break;
            case 1537248:
                str4 = adapterInnerError;
                if (str.equals(networkFirmIdFilterSourceError)) {
                    r23 = 14;
                }
                str5 = networkError;
                break;
            case 1537249:
                str4 = adapterInnerError;
                if (str.equals(inNetworkErrorCodeRequestFailPacing)) {
                    r23 = 15;
                }
                str5 = networkError;
                break;
            case 1537250:
                str4 = adapterInnerError;
                if (str.equals(filterByRefreshSystemSplash)) {
                    r23 = 16;
                }
                str5 = networkError;
                break;
            case 1537251:
                str4 = adapterInnerError;
                if (str.equals(inAdxBidInterval)) {
                    r23 = 17;
                }
                str5 = networkError;
                break;
            case 1537252:
                str4 = adapterInnerError;
                if (str.equals(inAdxBidFailedInterval)) {
                    r23 = 18;
                }
                str5 = networkError;
                break;
            case 1537253:
                str4 = adapterInnerError;
                if (str.equals(forbidNetworkByDeveloper)) {
                    r23 = 19;
                }
                str5 = networkError;
                break;
            case 1537276:
                str4 = adapterInnerError;
                if (str.equals(filterByMNErrorCodeReqLimit)) {
                    r23 = 20;
                }
                str5 = networkError;
                break;
            case 1537277:
                str4 = adapterInnerError;
                if (str.equals(filterByMatchNetworkErrorCode)) {
                    r23 = 21;
                }
                str5 = networkError;
                break;
            case 1537278:
                str4 = adapterInnerError;
                if (str.equals(adSourceLoadCappingError)) {
                    r23 = 22;
                }
                str5 = networkError;
                break;
            case 1537279:
                str4 = adapterInnerError;
                if (str.equals(loadCappingError_Global)) {
                    r23 = 23;
                }
                str5 = networkError;
                break;
            case 1537280:
                str4 = adapterInnerError;
                if (str.equals(loadCappingError_Format)) {
                    r23 = 24;
                }
                str5 = networkError;
                break;
            case 1537281:
                str4 = adapterInnerError;
                if (str.equals(outOfCapError_day_Global)) {
                    r23 = 25;
                }
                str5 = networkError;
                break;
            case 1537282:
                str4 = adapterInnerError;
                if (str.equals(outOfCapError_day_Format)) {
                    r23 = 26;
                }
                str5 = networkError;
                break;
            case 1537283:
                str4 = adapterInnerError;
                if (str.equals(outOfCapError_hour_Global)) {
                    r23 = 27;
                }
                str5 = networkError;
                break;
            case 1537284:
                str4 = adapterInnerError;
                if (str.equals(outOfCapError_hour_Format)) {
                    r23 = 28;
                }
                str5 = networkError;
                break;
            case 1537285:
                str4 = adapterInnerError;
                if (str.equals(inPacingError_Global)) {
                    r23 = 29;
                }
                str5 = networkError;
                break;
            case 1537307:
                str4 = adapterInnerError;
                if (str.equals(inPacingError_Format)) {
                    r23 = 30;
                }
                str5 = networkError;
                break;
            case 1537308:
                str4 = adapterInnerError;
                if (str.equals(adSourceLoadRiskError)) {
                    r23 = 31;
                }
                str5 = networkError;
                break;
            case 1537309:
                str4 = adapterInnerError;
                if (str.equals(adSourceLoadBidTypeFilterError)) {
                    r23 = ' ';
                }
                str5 = networkError;
                break;
            case 1537310:
                str4 = adapterInnerError;
                if (str.equals(adSourceLoadPriceFilterError)) {
                    r23 = '!';
                }
                str5 = networkError;
                break;
            case 1537311:
                str4 = adapterInnerError;
                if (str.equals(adSourceLoadUnitFilterError)) {
                    r23 = '\"';
                }
                str5 = networkError;
                break;
            case 1537312:
                str4 = adapterInnerError;
                if (str.equals(compareFailedError)) {
                    r23 = '#';
                }
                str5 = networkError;
                break;
            case 1537313:
                str4 = adapterInnerError;
                if (str.equals(noFillNcError)) {
                    r23 = '$';
                }
                str5 = networkError;
                break;
            case 1537314:
                str4 = adapterInnerError;
                if (str.equals(noFillSError)) {
                    r23 = '%';
                }
                str5 = networkError;
                break;
            case 1537315:
                str4 = adapterInnerError;
                if (str.equals(noFillSrError)) {
                    r23 = '&';
                }
                str5 = networkError;
                break;
            case 1567006:
                str4 = adapterInnerError;
                if (str.equals(placeStrategyError)) {
                    r23 = '\'';
                }
                str5 = networkError;
                break;
            case 1567007:
                str4 = adapterInnerError;
                if (str.equals(appIdOrPlaceIdEmpty)) {
                    r23 = '(';
                }
                str5 = networkError;
                break;
            case 1567008:
                str4 = adapterInnerError;
                if (str.equals(formatError)) {
                    r23 = ')';
                }
                str5 = networkError;
                break;
            case 1596797:
                str4 = adapterInnerError;
                if (str.equals(noADError)) {
                    r23 = '*';
                }
                str5 = networkError;
                break;
            case 1596798:
                str4 = adapterInnerError;
                if (str.equals(contextDestoryError)) {
                    r23 = '+';
                }
                str5 = networkError;
                break;
            case 1596799:
                str4 = adapterInnerError;
                if (str.equals(placementAdClose)) {
                    r23 = ',';
                }
                str5 = networkError;
                break;
            case 1596800:
                str4 = adapterInnerError;
                if (str.equals(noAdsourceConfig)) {
                    r23 = '-';
                }
                str5 = networkError;
                break;
            case 1596801:
                str4 = adapterInnerError;
                if (str.equals(noAvailableAdsource)) {
                    r23 = '.';
                }
                str5 = networkError;
                break;
            case 1596802:
                str4 = adapterInnerError;
                if (str.equals(adShowError)) {
                    r23 = '/';
                }
                str5 = networkError;
                break;
            case 1596803:
                str4 = adapterInnerError;
                if (str.equals(adSourceBidError)) {
                    r23 = '0';
                }
                str5 = networkError;
                break;
            case 1596804:
                str4 = adapterInnerError;
                if (str.equals(adSourceNotFilledError)) {
                    r23 = '1';
                }
                str5 = networkError;
                break;
            case 1596805:
                str4 = adapterInnerError;
                if (str.equals(noAdsourceConfigInDebugerMode)) {
                    r23 = '2';
                }
                str5 = networkError;
                break;
            case 1754679:
                str4 = adapterInnerError;
                if (str.equals(httpStatuException)) {
                    r23 = '3';
                }
                str5 = networkError;
                break;
            case 1754680:
                str4 = adapterInnerError;
                if (str.equals(statuError)) {
                    r23 = '4';
                }
                str5 = networkError;
                break;
            case 1754681:
                str4 = adapterInnerError;
                if (str.equals(dataLevelLowError)) {
                    r23 = '5';
                }
                str5 = networkError;
                break;
            case 1754688:
                str4 = adapterInnerError;
                if (str.equals(exception)) {
                    r23 = '6';
                }
                str5 = networkError;
                break;
            case 46730162:
                str4 = adapterInnerError;
                if (str.equals("10001")) {
                    r23 = '7';
                }
                str5 = networkError;
                break;
            case 46730164:
                str4 = adapterInnerError;
                if (str.equals(appIdError)) {
                    r23 = '8';
                }
                str5 = networkError;
                break;
            case 46730165:
                str4 = adapterInnerError;
                if (str.equals(placementIdError)) {
                    r23 = '9';
                }
                str5 = networkError;
                break;
            case 46730201:
                str4 = adapterInnerError;
                if (str.equals(sharedPlacementIdError)) {
                    r23 = ':';
                }
                str5 = networkError;
                break;
            case 46730223:
                str4 = adapterInnerError;
                if (str.equals(unknownMediationIdError)) {
                    r23 = ';';
                }
                str5 = networkError;
                break;
            default:
                str4 = adapterInnerError;
                str5 = networkError;
                break;
        }
        switch (r23) {
            case 0:
                return new AdError(str5, "Network is unavailable.", str2, str3);
            case 1:
                return new AdError(str11, "Server is unavailable.", str2, str3);
            case 2:
                return new AdError(str10, "Ad load time out.", str2, str3);
            case 3:
                return new AdError(str9, "Adapter does not exist.", str2, str3);
            case 4:
                return new AdError(str8, "Not satisfy the Placement's Cap configuration.", str2, str3);
            case 5:
                return new AdError(str7, "Not satisfy the Placement's Placing configuration.", str2, str3);
            case 6:
                return new AdError(str6, "Placement's Ad is loading.", str2, str3);
            case 7:
                return new AdError(str4, "Please check if your network sdk version is correct and all the network plugin has been put in your package.", str2, str3);
            case '\b':
                return new AdError(inRequestFailPacing, "Not satisfy the Fail-request's Placing configuration.", str2, str3);
            case '\t':
                return new AdError(loadFailInPacingError, "The placement load too frequent within the specified time period after the previous load failure.", str2, str3);
            case '\n':
                return new AdError(loadCappingError, "The placement load too many times within the specified time period.", str2, str3);
            case 11:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                return new AdError(str, str3, str2, str3);
            case '\f':
                return new AdError(loadInShowingFilter, "This unitgroup can't load on showing.", str2, str3);
            case '\r':
                return new AdError(c2sBiddingCacheError, "C2S Bidding Cache error.", str2, str3);
            case 14:
                return new AdError(noAdsourceConfigInDebugerMode, "AdSource filter by network firm id.", str2, str3);
            case 23:
                return new AdError(loadCappingError_Global, "The placement load too many times within global time period.", str2, str3);
            case 24:
                return new AdError(loadCappingError_Format, "The placement load too many times within format time period.", str2, str3);
            case 25:
                return new AdError(outOfCapError_day_Global, "App global cap limit within day.", str2, str3);
            case 26:
                return new AdError(outOfCapError_day_Format, "Ad format cap limit within day.", str2, str3);
            case 27:
                return new AdError(outOfCapError_hour_Global, "App global cap limit within hour.", str2, str3);
            case 28:
                return new AdError(outOfCapError_hour_Format, "Ad format cap limit within hour.", str2, str3);
            case 29:
                return new AdError(inPacingError_Global, "App global pace limit.", str2, str3);
            case 30:
                return new AdError(inPacingError_Format, "Format pace limit.", str2, str3);
            case 31:
                return new AdError(adSourceLoadRiskError, "Risk device filter.", str2, str3);
            case ' ':
                return new AdError(adSourceLoadBidTypeFilterError, "Bid type limit.", str2, str3);
            case '!':
                return new AdError(adSourceLoadPriceFilterError, "Price limit.", str2, str3);
            case '\"':
                return new AdError(adSourceLoadUnitFilterError, "Ad unit limit.", str2, str3);
            case '#':
                return new AdError(compareFailedError, "Multi mediation fail.", str2, str3);
            case '$':
                return new AdError(str, "AdSource continuous no fill.", str2, str3);
            case '%':
                return new AdError(str, "AdSource cumulative no fill.", str2, str3);
            case j.f5963M /* 38 */:
                return new AdError(str, "AdSource cumulative no fill percentage.", str2, str3);
            case '\'':
                return new AdError(placeStrategyError, "Get placement strategy error, please check your appid、appkey and placementid is availiable.", str2, str3);
            case j.f5965O /* 40 */:
                return new AdError(appIdOrPlaceIdEmpty, "AppId or PlacementId is empty.", str2, str3);
            case ')':
                return new AdError(formatError, "Mismatched ad placement and ad format", str2, str3);
            case '*':
                return new AdError(noADError, "Return Ad is empty.", str2, str3);
            case j.f5968R /* 43 */:
                return new AdError(contextDestoryError, "Context or activity has been destory.", str2, str3);
            case j.f5969S /* 44 */:
                return new AdError(placementAdClose, "Placement Ads switch is close.", str2, str3);
            case j.f5970T /* 45 */:
                return new AdError(noAdsourceConfig, "The placement strategy does not contain any ad sources, please check the mediation configuration in TopOn", str2, str3);
            case '.':
                return new AdError(noAvailableAdsource, "Ad sources are filtered, no ad source is currently available", str2, str3);
            case '/':
                return new AdError(adShowError, "Ad show failed", str2, str3);
            case j.f5973W /* 48 */:
                return new AdError(adSourceBidError, "Bid error", str2, str3);
            case j.f5974X /* 49 */:
                return new AdError(adSourceNotFilledError, "Ad source not filled, cause by customize fillter.", str2, str3);
            case '2':
                return new AdError(noAdsourceConfigInDebugerMode, "The placement strategy does not contain any ad sources, please check the debugger configuration in ATSDK.setDebuggerConfig", str2, str3);
            case '3':
                return new AdError(httpStatuException, "Possible network issue on device. Please check your network.", str2, str3);
            case '4':
                return "699".equals(str2) ? new AdError(placeDeletedError, "This Placement has been suspended or deleted and no longer obtains Placement strategy.", "", "") : "700".equals(str2) ? new AdError(statuError, "API access restricted due to too many requests. Please reduce requests or try again later.", "", "") : new AdError(statuError, "Service status error.", str2, str3);
            case i.f14980d /* 53 */:
                return new AdError(dataLevelLowError, "Upload data level is FORBIDDEN, must called 'ATSDK.setGDPRUploadDataLevel' to set the level.", str2, str3);
            case '6':
                return new AdError(exception, "Exception in sdk.", str2, str3);
            case '7':
                return new AdError("10001", "Please check your appkey.", str2, str3);
            case p.a.f19837e /* 56 */:
                return new AdError(appIdError, "Please check your appid.", str2, str3);
            case '9':
                return new AdError(placementIdError, "Please check your placementid.", str2, str3);
            case ':':
                return new AdError(sharedPlacementIdError, "Forbidden placement", str2, str3);
            case j.v.f12748n /* 59 */:
                return new AdError(unknownMediationIdError, "Unknown Mediation ID", str2, str3);
            default:
                return new AdError("-9999", m.f16967e, str2, str3);
        }
    }
}
