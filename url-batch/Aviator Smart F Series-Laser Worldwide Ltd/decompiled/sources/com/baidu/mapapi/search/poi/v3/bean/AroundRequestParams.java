package com.baidu.mapapi.search.poi.v3.bean;

import android.text.TextUtils;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.search.poi.v3.AroundOption;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.google.android.gms.actions.SearchIntents;

/* loaded from: classes2.dex */
public class AroundRequestParams extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(desc = "检索关键字", name = SearchIntents.EXTRA_QUERY)
    private String f7019a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(desc = "圆形区域检索中心点，不支持多个点", name = "location")
    private String f7020b;

    /* renamed from: f, reason: collision with root package name */
    @Properties(desc = "对query召回接口进行二次筛选", name = "type")
    private String f7024f;

    /* renamed from: i, reason: collision with root package name */
    @Properties(desc = "检索排序条件", name = "filter")
    private String f7027i;

    /* renamed from: k, reason: collision with root package name */
    @Properties(name = "address_result")
    private String f7029k;

    /* renamed from: q, reason: collision with root package name */
    @Properties(desc = "返回的坐标类型", name = "ret_coordtype")
    private String f7035q;

    /* renamed from: s, reason: collision with root package name */
    @Properties(desc = "开发者密钥", name = BaseParamNames.TOKEN)
    private String f7037s;

    /* renamed from: t, reason: collision with root package name */
    @Properties(desc = "用户的权限签名，当AK设置为SN校验时，该参数必填SN计算方法", name = HttpConstants.SIGN)
    private String f7038t;

    /* renamed from: u, reason: collision with root package name */
    @Properties(desc = "时间戳，与SN配合使用", name = "timestamp")
    private Long f7039u;

    /* renamed from: v, reason: collision with root package name */
    @Properties(name = "extensions_child_poi")
    private boolean f7040v;

    /* renamed from: w, reason: collision with root package name */
    @Properties(name = "homonym")
    private boolean f7041w;

    /* renamed from: x, reason: collision with root package name */
    @Properties(name = "tag")
    private String f7042x;

    /* renamed from: c, reason: collision with root package name */
    @Properties(desc = "检索半径，单位米，默认500米", name = "radius")
    private int f7021c = 500;

    /* renamed from: d, reason: collision with root package name */
    @Properties(desc = "是否严格限定召回结果在设置检索半径范围内。", name = "radius_limit")
    private boolean f7022d = false;

    /* renamed from: e, reason: collision with root package name */
    @Properties(desc = "true: 优先保证检索速度，排序更简单直接，false: 默认", name = "is_light_version")
    private boolean f7023e = false;

    /* renamed from: g, reason: collision with root package name */
    @Properties(desc = "检索结果详细程度", name = "scope")
    private int f7025g = 1;

    /* renamed from: h, reason: collision with root package name */
    @Properties(desc = "传入的坐标类型", name = "coord_type")
    private int f7026h = 3;

    /* renamed from: j, reason: collision with root package name */
    @Properties(desc = "是否召回国标行政区划编码", name = "extensions_adcode")
    private boolean f7028j = false;

    /* renamed from: l, reason: collision with root package name */
    @Properties(desc = "是否输出图片信息", name = "photo_show")
    private boolean f7030l = false;

    /* renamed from: m, reason: collision with root package name */
    @Properties(desc = "query的语言类型", name = "from_language")
    private String f7031m = "zh";

    /* renamed from: n, reason: collision with root package name */
    @Properties(desc = "多语言检索", name = "language")
    private String f7032n = "zh";

    /* renamed from: o, reason: collision with root package name */
    @Properties(desc = "分页页码", name = "page_num")
    private int f7033o = 0;

    /* renamed from: p, reason: collision with root package name */
    @Properties(desc = "单次召回的数量", name = "page_size")
    private int f7034p = 10;

    /* renamed from: r, reason: collision with root package name */
    @Properties(desc = "输出数据格式，仅支持json", name = "output")
    private String f7036r = BodyData.TYPE_JSON;

    /* renamed from: y, reason: collision with root package name */
    @Properties(name = "ce")
    private final int f7043y = 1;

    public void apply(AroundOption aroundOption) {
        if (aroundOption != null) {
            if (!TextUtils.isEmpty(aroundOption.getQuery())) {
                setQuery(aroundOption.getQuery());
            }
            if (aroundOption.getLocation() != null) {
                setLocation(AppMD5.encodeCoordHash(aroundOption.getLocation().longitude, aroundOption.getLocation().latitude));
            }
            setRadius(aroundOption.getRadius());
            setRadiusLimit(aroundOption.isRadiusLimit());
            setLightVersion(aroundOption.isLightVersion());
            if (!TextUtils.isEmpty(aroundOption.getType())) {
                setType(aroundOption.getType());
            }
            setScope(aroundOption.getScope());
            setCoordType(aroundOption.getCoordType());
            if (!TextUtils.isEmpty(aroundOption.getFilter())) {
                setFilter(aroundOption.getFilter());
            }
            setExtensionsAdcode(aroundOption.isExtensionsAdcode());
            if (!TextUtils.isEmpty(aroundOption.getAddressResult())) {
                setAddressResult(aroundOption.getAddressResult());
            }
            setPhotoShow(aroundOption.isPhotoShow());
            if (!TextUtils.isEmpty(aroundOption.getFromLanguage())) {
                setFromLanguage(aroundOption.getFromLanguage());
            }
            if (!TextUtils.isEmpty(aroundOption.getLanguage())) {
                setLanguage(aroundOption.getLanguage());
            }
            setPageNum(aroundOption.getPageNum());
            setPageSize(aroundOption.getPageSize());
            if (!TextUtils.isEmpty(aroundOption.getRetCoordType())) {
                setRetCoordType(aroundOption.getRetCoordType());
            }
            setExtensionsAdcode(aroundOption.isExtensionsChildPoi());
            setHomonym(aroundOption.isHomonym());
            if (TextUtils.isEmpty(aroundOption.getTag())) {
                return;
            }
            setTag(aroundOption.getTag());
        }
    }

    public String getAddressResult() {
        return this.f7029k;
    }

    public int getCe() {
        return 1;
    }

    public int getCoordType() {
        return this.f7026h;
    }

    public String getFilter() {
        return this.f7027i;
    }

    public String getFromLanguage() {
        return this.f7031m;
    }

    public String getLanguage() {
        return this.f7032n;
    }

    public String getLocation() {
        return this.f7020b;
    }

    public String getOutput() {
        return this.f7036r;
    }

    public int getPageNum() {
        return this.f7033o;
    }

    public int getPageSize() {
        return this.f7034p;
    }

    public String getQuery() {
        return this.f7019a;
    }

    public int getRadius() {
        return this.f7021c;
    }

    public String getRetCoordType() {
        return this.f7035q;
    }

    public int getScope() {
        return this.f7025g;
    }

    public String getSign() {
        return this.f7038t;
    }

    public String getTag() {
        return this.f7042x;
    }

    public Long getTimestamp() {
        return this.f7039u;
    }

    public String getToken() {
        return this.f7037s;
    }

    public String getType() {
        return this.f7024f;
    }

    public boolean isExtensionsAdcode() {
        return this.f7028j;
    }

    public boolean isExtensionsChildPoi() {
        return this.f7040v;
    }

    public boolean isHomonym() {
        return this.f7041w;
    }

    public boolean isLightVersion() {
        return this.f7023e;
    }

    public boolean isPhotoShow() {
        return this.f7030l;
    }

    public boolean isRadiusLimit() {
        return this.f7022d;
    }

    public AroundRequestParams setAddressResult(String str) {
        this.f7029k = str;
        return this;
    }

    public AroundRequestParams setCoordType(int i8) {
        this.f7026h = i8;
        return this;
    }

    public AroundRequestParams setExtensionsAdcode(boolean z7) {
        this.f7028j = z7;
        return this;
    }

    public AroundRequestParams setExtensionsChildPoi(boolean z7) {
        this.f7040v = z7;
        return this;
    }

    public AroundRequestParams setFilter(String str) {
        this.f7027i = str;
        return this;
    }

    public AroundRequestParams setFromLanguage(String str) {
        this.f7031m = str;
        return this;
    }

    public AroundRequestParams setHomonym(boolean z7) {
        this.f7041w = z7;
        return this;
    }

    public AroundRequestParams setLanguage(String str) {
        this.f7032n = str;
        return this;
    }

    public AroundRequestParams setLightVersion(boolean z7) {
        this.f7023e = z7;
        return this;
    }

    public AroundRequestParams setLocation(String str) {
        this.f7020b = str;
        return this;
    }

    public AroundRequestParams setOutput(String str) {
        this.f7036r = str;
        return this;
    }

    public AroundRequestParams setPageNum(int i8) {
        this.f7033o = i8;
        return this;
    }

    public AroundRequestParams setPageSize(int i8) {
        this.f7034p = i8;
        return this;
    }

    public AroundRequestParams setPhotoShow(boolean z7) {
        this.f7030l = z7;
        return this;
    }

    public AroundRequestParams setQuery(String str) {
        this.f7019a = str;
        return this;
    }

    public AroundRequestParams setRadius(int i8) {
        this.f7021c = i8;
        return this;
    }

    public AroundRequestParams setRadiusLimit(boolean z7) {
        this.f7022d = z7;
        return this;
    }

    public AroundRequestParams setRetCoordType(String str) {
        this.f7035q = str;
        return this;
    }

    public AroundRequestParams setScope(int i8) {
        this.f7025g = i8;
        return this;
    }

    public AroundRequestParams setSign(String str) {
        this.f7038t = str;
        return this;
    }

    public AroundRequestParams setTag(String str) {
        this.f7042x = str;
        return this;
    }

    public AroundRequestParams setTimestamp(Long l8) {
        this.f7039u = l8;
        return this;
    }

    public AroundRequestParams setToken(String str) {
        this.f7037s = str;
        return this;
    }

    public AroundRequestParams setType(String str) {
        this.f7024f = str;
        return this;
    }
}
