package com.baidu.mapapi.search.poi.v3.bean;

import android.text.TextUtils;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.poi.v3.RegionOption;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.actions.SearchIntents;

/* loaded from: classes2.dex */
public class RegionRequestParams extends BaseParams {

    @Properties(name = "tag")
    private String A;

    /* renamed from: a, reason: collision with root package name */
    @Properties(desc = "检索关键字", name = SearchIntents.EXTRA_QUERY)
    private String f7135a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(desc = "检索行政区划区域", name = TtmlNode.TAG_REGION)
    private String f7136b;

    /* renamed from: e, reason: collision with root package name */
    @Properties(desc = "对query召回接口进行二次筛选", name = "type")
    private String f7139e;

    /* renamed from: f, reason: collision with root package name */
    @Properties(desc = "传入poi坐标", name = TtmlNode.CENTER)
    private String f7140f;

    /* renamed from: i, reason: collision with root package name */
    @Properties(desc = "检索排序条件", name = "filter")
    private String f7143i;

    /* renamed from: q, reason: collision with root package name */
    @Properties(desc = "返回的坐标类型", name = "ret_coordtype")
    private String f7151q;

    /* renamed from: s, reason: collision with root package name */
    @Properties(desc = "开发者密钥", name = BaseParamNames.TOKEN)
    private String f7153s;

    /* renamed from: t, reason: collision with root package name */
    @Properties(desc = "用户的权限签名，当AK设置为SN校验时，该参数必填SN计算方法", name = HttpConstants.SIGN)
    private String f7154t;

    /* renamed from: u, reason: collision with root package name */
    @Properties(desc = "时间戳，与SN配合使用", name = "timestamp")
    private Long f7155u;

    /* renamed from: v, reason: collision with root package name */
    @Properties(name = "view_distance")
    private int f7156v;

    /* renamed from: w, reason: collision with root package name */
    @Properties(name = "view_bound")
    private String f7157w;

    /* renamed from: x, reason: collision with root package name */
    @Properties(name = "search_bound")
    private String f7158x;

    /* renamed from: y, reason: collision with root package name */
    @Properties(name = "extensions_child_poi")
    private boolean f7159y;

    /* renamed from: z, reason: collision with root package name */
    @Properties(name = "homonym")
    private boolean f7160z;

    /* renamed from: c, reason: collision with root package name */
    @Properties(desc = "区域数据召回限制", name = "region_limit")
    private boolean f7137c = false;

    /* renamed from: d, reason: collision with root package name */
    @Properties(desc = "true: 优先保证检索速度，排序更简单直接，false: 默认", name = "is_light_version")
    private boolean f7138d = false;

    /* renamed from: g, reason: collision with root package name */
    @Properties(desc = "检索结果详细程度", name = "scope")
    private int f7141g = 1;

    /* renamed from: h, reason: collision with root package name */
    @Properties(desc = "传入的坐标类型", name = "coord_type")
    private int f7142h = 3;

    /* renamed from: j, reason: collision with root package name */
    @Properties(desc = "是否召回国标行政区划编码", name = "extensions_adcode")
    private boolean f7144j = false;

    /* renamed from: k, reason: collision with root package name */
    @Properties(desc = "query传入结构化地址", name = "address_result")
    private boolean f7145k = false;

    /* renamed from: l, reason: collision with root package name */
    @Properties(desc = "是否输出图片信息", name = "photo_show")
    private boolean f7146l = false;

    /* renamed from: m, reason: collision with root package name */
    @Properties(desc = "query的语言类型", name = "from_language")
    private String f7147m = "zh";

    /* renamed from: n, reason: collision with root package name */
    @Properties(desc = "多语言检索", name = "language")
    private String f7148n = "zh";

    /* renamed from: o, reason: collision with root package name */
    @Properties(desc = "分页页码", name = "page_num")
    private int f7149o = 0;

    /* renamed from: p, reason: collision with root package name */
    @Properties(desc = "单次召回的数量", name = "page_size")
    private int f7150p = 10;

    /* renamed from: r, reason: collision with root package name */
    @Properties(desc = "输出数据格式，仅支持json", name = "output")
    private String f7152r = BodyData.TYPE_JSON;

    @Properties(name = "ce")
    private final int B = 1;

    public void apply(RegionOption regionOption) {
        if (regionOption != null) {
            if (!TextUtils.isEmpty(regionOption.getQuery())) {
                setQuery(regionOption.getQuery());
            }
            if (!TextUtils.isEmpty(regionOption.getRegion())) {
                setRegion(regionOption.getRegion());
            }
            setRegionLimit(regionOption.isRegionLimit());
            setLightVersion(regionOption.isLightVersion());
            if (!TextUtils.isEmpty(regionOption.getType())) {
                setType(regionOption.getType());
            }
            if (regionOption.getCenter() != null) {
                setCenter(regionOption.getCenter().latitude + SystemInfoUtil.COMMA + regionOption.getCenter().longitude);
            }
            setScope(regionOption.getScope());
            setCoordType(regionOption.getCoordType());
            if (!TextUtils.isEmpty(regionOption.getFilter())) {
                setFilter(regionOption.getFilter());
            }
            setExtensionsAdcode(regionOption.isExtensionsAdcode());
            setAddressResult(regionOption.isAddressResult());
            setPhotoShow(regionOption.isPhotoShow());
            if (!TextUtils.isEmpty(regionOption.getFromLanguage())) {
                setFromLanguage(regionOption.getFromLanguage());
            }
            if (!TextUtils.isEmpty(regionOption.getLanguage())) {
                setLanguage(regionOption.getLanguage());
            }
            setPageNum(regionOption.getPageNum());
            setPageSize(regionOption.getPageSize());
            if (!TextUtils.isEmpty(regionOption.getRetCoordType())) {
                setRetCoordType(regionOption.getRetCoordType());
            }
            setViewDistance(regionOption.getViewDistance());
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            if (regionOption.getViewBound() != null && !regionOption.getViewBound().isEmpty()) {
                for (int i8 = 0; i8 < regionOption.getViewBound().size(); i8++) {
                    LatLng latLng = regionOption.getViewBound().get(i8);
                    sb.append(latLng.latitude);
                    sb.append(SystemInfoUtil.COMMA);
                    sb.append(latLng.longitude);
                    sb.append(SystemInfoUtil.COMMA);
                }
                sb.deleteCharAt(sb.length() - 1);
            }
            if (regionOption.getSearchBound() != null && !regionOption.getSearchBound().isEmpty()) {
                for (int i9 = 0; i9 < regionOption.getSearchBound().size(); i9++) {
                    LatLng latLng2 = regionOption.getSearchBound().get(i9);
                    sb2.append(latLng2.latitude);
                    sb2.append(SystemInfoUtil.COMMA);
                    sb2.append(latLng2.longitude);
                    sb2.append(SystemInfoUtil.COMMA);
                }
                sb2.deleteCharAt(sb2.length() - 1);
            }
            setViewBound(sb.toString());
            setSearchBound(sb2.toString());
            setExtensionsChildPoi(regionOption.isExtensionsChildPoi());
            setHomonym(regionOption.isHomonym());
            if (TextUtils.isEmpty(regionOption.getTag())) {
                return;
            }
            setTag(regionOption.getTag());
        }
    }

    public int getCe() {
        return 1;
    }

    public String getCenter() {
        return this.f7140f;
    }

    public int getCoordType() {
        return this.f7142h;
    }

    public String getFilter() {
        return this.f7143i;
    }

    public String getFromLanguage() {
        return this.f7147m;
    }

    public String getLanguage() {
        return this.f7148n;
    }

    public String getOutput() {
        return this.f7152r;
    }

    public int getPageNum() {
        return this.f7149o;
    }

    public int getPageSize() {
        return this.f7150p;
    }

    public String getQuery() {
        return this.f7135a;
    }

    public String getRegion() {
        return this.f7136b;
    }

    public String getRetCoordType() {
        return this.f7151q;
    }

    public int getScope() {
        return this.f7141g;
    }

    public String getSearchBound() {
        return this.f7158x;
    }

    public String getSign() {
        return this.f7154t;
    }

    public String getTag() {
        return this.A;
    }

    public Long getTimestamp() {
        return this.f7155u;
    }

    public String getToken() {
        return this.f7153s;
    }

    public String getType() {
        return this.f7139e;
    }

    public String getViewBound() {
        return this.f7157w;
    }

    public int getViewDistance() {
        return this.f7156v;
    }

    public boolean isAddressResult() {
        return this.f7145k;
    }

    public boolean isExtensionsAdcode() {
        return this.f7144j;
    }

    public boolean isExtensionsChildPoi() {
        return this.f7159y;
    }

    public boolean isHomonym() {
        return this.f7160z;
    }

    public boolean isLightVersion() {
        return this.f7138d;
    }

    public boolean isPhotoShow() {
        return this.f7146l;
    }

    public boolean isRegionLimit() {
        return this.f7137c;
    }

    public RegionRequestParams setAddressResult(boolean z7) {
        this.f7145k = z7;
        return this;
    }

    public RegionRequestParams setCenter(String str) {
        this.f7140f = str;
        return this;
    }

    public RegionRequestParams setCoordType(int i8) {
        this.f7142h = i8;
        return this;
    }

    public RegionRequestParams setExtensionsAdcode(boolean z7) {
        this.f7144j = z7;
        return this;
    }

    public RegionRequestParams setExtensionsChildPoi(boolean z7) {
        this.f7159y = z7;
        return this;
    }

    public RegionRequestParams setFilter(String str) {
        this.f7143i = str;
        return this;
    }

    public RegionRequestParams setFromLanguage(String str) {
        this.f7147m = str;
        return this;
    }

    public RegionRequestParams setHomonym(boolean z7) {
        this.f7160z = z7;
        return this;
    }

    public RegionRequestParams setLanguage(String str) {
        this.f7148n = str;
        return this;
    }

    public RegionRequestParams setLightVersion(boolean z7) {
        this.f7138d = z7;
        return this;
    }

    public RegionRequestParams setOutput(String str) {
        this.f7152r = str;
        return this;
    }

    public RegionRequestParams setPageNum(int i8) {
        this.f7149o = i8;
        return this;
    }

    public RegionRequestParams setPageSize(int i8) {
        this.f7150p = i8;
        return this;
    }

    public RegionRequestParams setPhotoShow(boolean z7) {
        this.f7146l = z7;
        return this;
    }

    public RegionRequestParams setQuery(String str) {
        this.f7135a = str;
        return this;
    }

    public RegionRequestParams setRegion(String str) {
        this.f7136b = str;
        return this;
    }

    public RegionRequestParams setRegionLimit(boolean z7) {
        this.f7137c = z7;
        return this;
    }

    public RegionRequestParams setRetCoordType(String str) {
        this.f7151q = str;
        return this;
    }

    public RegionRequestParams setScope(int i8) {
        this.f7141g = i8;
        return this;
    }

    public RegionRequestParams setSearchBound(String str) {
        this.f7158x = str;
        return this;
    }

    public void setSign(String str) {
        this.f7154t = str;
    }

    public RegionRequestParams setTag(String str) {
        this.A = str;
        return this;
    }

    public void setTimestamp(Long l8) {
        this.f7155u = l8;
    }

    public void setToken(String str) {
        this.f7153s = str;
    }

    public RegionRequestParams setType(String str) {
        this.f7139e = str;
        return this;
    }

    public RegionRequestParams setViewBound(String str) {
        this.f7157w = str;
        return this;
    }

    public RegionRequestParams setViewDistance(int i8) {
        this.f7156v = i8;
        return this;
    }
}
