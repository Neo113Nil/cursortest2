package com.baidu.mapapi.search.poi.v3.bean;

import android.text.TextUtils;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.poi.v3.SuggestionOption;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.actions.SearchIntents;

/* loaded from: classes2.dex */
public class SuggestionRequestParams extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(desc = "检索关键字", name = SearchIntents.EXTRA_QUERY)
    private String f7176a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(desc = "检索行政区划区域", name = TtmlNode.TAG_REGION)
    private String f7177b;

    /* renamed from: d, reason: collision with root package name */
    @Properties(desc = "圆形区域检索中心点，不支持多个点", name = "location")
    private String f7179d;

    /* renamed from: f, reason: collision with root package name */
    @Properties(desc = "检索多边形区域", name = "bounds")
    private String f7181f;

    /* renamed from: i, reason: collision with root package name */
    @Properties(desc = "返回的坐标类型", name = "ret_coordtype")
    private String f7184i;

    /* renamed from: k, reason: collision with root package name */
    @Properties(desc = "开发者密钥", name = BaseParamNames.TOKEN)
    private String f7186k;

    /* renamed from: l, reason: collision with root package name */
    @Properties(desc = "用户的权限签名，当AK设置为SN校验时，该参数必填SN计算方法", name = HttpConstants.SIGN)
    private String f7187l;

    /* renamed from: m, reason: collision with root package name */
    @Properties(desc = "时间戳，与SN配合使用", name = "timestamp")
    private Long f7188m;

    /* renamed from: n, reason: collision with root package name */
    @Properties(name = "from_language")
    private String f7189n;

    /* renamed from: o, reason: collision with root package name */
    @Properties(name = "hotword")
    private boolean f7190o;

    /* renamed from: c, reason: collision with root package name */
    @Properties(desc = "区域数据召回限制", name = "region_limit")
    private boolean f7178c = false;

    /* renamed from: e, reason: collision with root package name */
    @Properties(desc = "检索半径，单位米，默认500米", name = "radius")
    private int f7180e = 500;

    /* renamed from: g, reason: collision with root package name */
    @Properties(desc = "传入的坐标类型", name = "coord_type")
    private int f7182g = 3;

    /* renamed from: h, reason: collision with root package name */
    @Properties(desc = "多语言检索", name = "language")
    private String f7183h = "zh";

    /* renamed from: j, reason: collision with root package name */
    @Properties(desc = "输出数据格式，仅支持json", name = "output")
    private String f7185j = BodyData.TYPE_JSON;

    /* renamed from: p, reason: collision with root package name */
    @Properties(name = "ce")
    private final int f7191p = 1;

    public void apply(SuggestionOption suggestionOption) {
        if (suggestionOption != null) {
            if (!TextUtils.isEmpty(suggestionOption.getQuery())) {
                setQuery(suggestionOption.getQuery());
            }
            if (!TextUtils.isEmpty(suggestionOption.getRegion())) {
                setRegion(suggestionOption.getRegion());
            }
            setRegionLimit(suggestionOption.isRegionLimit());
            if (suggestionOption.getLocation() != null) {
                setLocation(AppMD5.encodeCoordHash(suggestionOption.getLocation().longitude, suggestionOption.getLocation().latitude));
            }
            setRadius(suggestionOption.getRadius());
            if (suggestionOption.getBounds() != null && !suggestionOption.getBounds().isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (int i8 = 0; i8 < suggestionOption.getBounds().size(); i8++) {
                    LatLng latLng = suggestionOption.getBounds().get(i8);
                    sb.append(AppMD5.encodeCoordHash(latLng.longitude, latLng.latitude));
                    sb.append(SystemInfoUtil.COMMA);
                }
                sb.deleteCharAt(sb.length() - 1);
                setBounds(sb.toString());
            }
            setCoordType(suggestionOption.getCoordType());
            if (!TextUtils.isEmpty(suggestionOption.getLanguage())) {
                setLanguage(suggestionOption.getLanguage());
            }
            if (!TextUtils.isEmpty(suggestionOption.getRetCoordType())) {
                setRetCoordType(suggestionOption.getRetCoordType());
            }
            if (!TextUtils.isEmpty(suggestionOption.getFromLanguage())) {
                setFromLanguage(suggestionOption.getFromLanguage());
            }
            setHotword(suggestionOption.isHotword());
        }
    }

    public String getBounds() {
        return this.f7181f;
    }

    public int getCe() {
        return 1;
    }

    public int getCoordType() {
        return this.f7182g;
    }

    public String getFromLanguage() {
        return this.f7189n;
    }

    public String getLanguage() {
        return this.f7183h;
    }

    public String getLocation() {
        return this.f7179d;
    }

    public String getOutput() {
        return this.f7185j;
    }

    public String getQuery() {
        return this.f7176a;
    }

    public int getRadius() {
        return this.f7180e;
    }

    public String getRegion() {
        return this.f7177b;
    }

    public String getRetCoordType() {
        return this.f7184i;
    }

    public String getSign() {
        return this.f7187l;
    }

    public Long getTimestamp() {
        return this.f7188m;
    }

    public String getToken() {
        return this.f7186k;
    }

    public boolean isHotword() {
        return this.f7190o;
    }

    public boolean isRegionLimit() {
        return this.f7178c;
    }

    public SuggestionRequestParams setBounds(String str) {
        this.f7181f = str;
        return this;
    }

    public SuggestionRequestParams setCoordType(int i8) {
        this.f7182g = i8;
        return this;
    }

    public SuggestionRequestParams setFromLanguage(String str) {
        this.f7189n = str;
        return this;
    }

    public SuggestionRequestParams setHotword(boolean z7) {
        this.f7190o = z7;
        return this;
    }

    public SuggestionRequestParams setLanguage(String str) {
        this.f7183h = str;
        return this;
    }

    public SuggestionRequestParams setLocation(String str) {
        this.f7179d = str;
        return this;
    }

    public SuggestionRequestParams setOutput(String str) {
        this.f7185j = str;
        return this;
    }

    public SuggestionRequestParams setQuery(String str) {
        this.f7176a = str;
        return this;
    }

    public SuggestionRequestParams setRadius(int i8) {
        this.f7180e = i8;
        return this;
    }

    public SuggestionRequestParams setRegion(String str) {
        this.f7177b = str;
        return this;
    }

    public SuggestionRequestParams setRegionLimit(boolean z7) {
        this.f7178c = z7;
        return this;
    }

    public SuggestionRequestParams setRetCoordType(String str) {
        this.f7184i = str;
        return this;
    }

    public SuggestionRequestParams setSign(String str) {
        this.f7187l = str;
        return this;
    }

    public SuggestionRequestParams setTimestamp(Long l8) {
        this.f7188m = l8;
        return this;
    }

    public SuggestionRequestParams setToken(String str) {
        this.f7186k = str;
        return this;
    }
}
