package com.baidu.mapapi.search.poi.v3.bean;

import android.text.TextUtils;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.poi.v3.PolygonOption;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.google.android.gms.actions.SearchIntents;

/* loaded from: classes2.dex */
public class PolygonRequestParams extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(desc = "检索关键字", name = SearchIntents.EXTRA_QUERY)
    private String f7112a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(desc = "检索多边形区域", name = "bounds")
    private String f7113b;

    /* renamed from: d, reason: collision with root package name */
    @Properties(desc = "对query召回接口进行二次筛选", name = "type")
    private String f7115d;

    /* renamed from: g, reason: collision with root package name */
    @Properties(desc = "检索排序条件", name = "filter")
    private String f7118g;

    /* renamed from: i, reason: collision with root package name */
    @Properties(name = "address_result")
    private String f7120i;

    /* renamed from: o, reason: collision with root package name */
    @Properties(desc = "返回的坐标类型", name = "ret_coordtype")
    private String f7126o;

    /* renamed from: q, reason: collision with root package name */
    @Properties(desc = "开发者密钥", name = BaseParamNames.TOKEN)
    private String f7128q;

    /* renamed from: r, reason: collision with root package name */
    @Properties(desc = "用户的权限签名，当AK设置为SN校验时，该参数必填SN计算方法", name = HttpConstants.SIGN)
    private String f7129r;

    /* renamed from: s, reason: collision with root package name */
    @Properties(desc = "时间戳，与SN配合使用", name = "timestamp")
    private Long f7130s;

    /* renamed from: t, reason: collision with root package name */
    @Properties(name = "extensions_child_poi")
    private boolean f7131t;

    /* renamed from: u, reason: collision with root package name */
    @Properties(name = "homonym")
    private boolean f7132u;

    /* renamed from: v, reason: collision with root package name */
    @Properties(name = "tag")
    private String f7133v;

    /* renamed from: c, reason: collision with root package name */
    @Properties(desc = "true: 优先保证检索速度，排序更简单直接，false: 默认", name = "is_light_version")
    private boolean f7114c = false;

    /* renamed from: e, reason: collision with root package name */
    @Properties(desc = "检索结果详细程度", name = "scope")
    private int f7116e = 1;

    /* renamed from: f, reason: collision with root package name */
    @Properties(desc = "传入的坐标类型", name = "coord_type")
    private int f7117f = 3;

    /* renamed from: h, reason: collision with root package name */
    @Properties(desc = "是否召回国标行政区划编码", name = "extensions_adcode")
    private boolean f7119h = false;

    /* renamed from: j, reason: collision with root package name */
    @Properties(desc = "是否输出图片信息", name = "photo_show")
    private boolean f7121j = false;

    /* renamed from: k, reason: collision with root package name */
    @Properties(desc = "query的语言类型", name = "from_language")
    private String f7122k = "zh";

    /* renamed from: l, reason: collision with root package name */
    @Properties(desc = "多语言检索", name = "language")
    private String f7123l = "zh";

    /* renamed from: m, reason: collision with root package name */
    @Properties(desc = "分页页码", name = "page_num")
    private int f7124m = 0;

    /* renamed from: n, reason: collision with root package name */
    @Properties(desc = "单次召回的数量", name = "page_size")
    private int f7125n = 10;

    /* renamed from: p, reason: collision with root package name */
    @Properties(desc = "输出数据格式，仅支持json", name = "output")
    private String f7127p = BodyData.TYPE_JSON;

    /* renamed from: w, reason: collision with root package name */
    @Properties(name = "ce")
    private final int f7134w = 1;

    public void apply(PolygonOption polygonOption) {
        if (polygonOption != null) {
            if (!TextUtils.isEmpty(polygonOption.getQuery())) {
                setQuery(polygonOption.getQuery());
            }
            if (polygonOption.getBounds() != null && !polygonOption.getBounds().isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (int i8 = 0; i8 < polygonOption.getBounds().size(); i8++) {
                    LatLng latLng = polygonOption.getBounds().get(i8);
                    sb.append(AppMD5.encodeCoordHash(latLng.longitude, latLng.latitude));
                    sb.append(SystemInfoUtil.COMMA);
                }
                sb.deleteCharAt(sb.length() - 1);
                setBounds(sb.toString());
            }
            setLightVersion(polygonOption.isLightVersion());
            if (!TextUtils.isEmpty(polygonOption.getType())) {
                setType(polygonOption.getType());
            }
            setScope(polygonOption.getScope());
            setCoordType(polygonOption.getCoordType());
            if (!TextUtils.isEmpty(polygonOption.getFilter())) {
                setFilter(polygonOption.getFilter());
            }
            setExtensionsAdcode(polygonOption.isExtensionsAdcode());
            if (!TextUtils.isEmpty(polygonOption.getAddressResult())) {
                setAddressResult(polygonOption.getAddressResult());
            }
            setPhotoShow(polygonOption.isPhotoShow());
            if (!TextUtils.isEmpty(polygonOption.getFromLanguage())) {
                setFromLanguage(polygonOption.getFromLanguage());
            }
            if (!TextUtils.isEmpty(polygonOption.getLanguage())) {
                setLanguage(polygonOption.getLanguage());
            }
            setPageNum(polygonOption.getPageNum());
            setPageSize(polygonOption.getPageSize());
            if (!TextUtils.isEmpty(polygonOption.getRetCoordType())) {
                setRetCoordType(polygonOption.getRetCoordType());
            }
            setExtensionsAdcode(polygonOption.isExtensionsChildPoi());
            setHomonym(polygonOption.isHomonym());
            if (TextUtils.isEmpty(polygonOption.getTag())) {
                return;
            }
            setTag(polygonOption.getTag());
        }
    }

    public String getAddressResult() {
        return this.f7120i;
    }

    public String getBounds() {
        return this.f7113b;
    }

    public int getCe() {
        return 1;
    }

    public int getCoordType() {
        return this.f7117f;
    }

    public String getFilter() {
        return this.f7118g;
    }

    public String getFromLanguage() {
        return this.f7122k;
    }

    public String getLanguage() {
        return this.f7123l;
    }

    public String getOutput() {
        return this.f7127p;
    }

    public int getPageNum() {
        return this.f7124m;
    }

    public int getPageSize() {
        return this.f7125n;
    }

    public String getQuery() {
        return this.f7112a;
    }

    public String getRetCoordType() {
        return this.f7126o;
    }

    public int getScope() {
        return this.f7116e;
    }

    public String getSign() {
        return this.f7129r;
    }

    public String getTag() {
        return this.f7133v;
    }

    public Long getTimestamp() {
        return this.f7130s;
    }

    public String getToken() {
        return this.f7128q;
    }

    public String getType() {
        return this.f7115d;
    }

    public boolean isExtensionsAdcode() {
        return this.f7119h;
    }

    public boolean isExtensionsChildPoi() {
        return this.f7131t;
    }

    public boolean isHomonym() {
        return this.f7132u;
    }

    public boolean isLightVersion() {
        return this.f7114c;
    }

    public boolean isPhotoShow() {
        return this.f7121j;
    }

    public PolygonRequestParams setAddressResult(String str) {
        this.f7120i = str;
        return this;
    }

    public PolygonRequestParams setBounds(String str) {
        this.f7113b = str;
        return this;
    }

    public PolygonRequestParams setCoordType(int i8) {
        this.f7117f = i8;
        return this;
    }

    public PolygonRequestParams setExtensionsAdcode(boolean z7) {
        this.f7119h = z7;
        return this;
    }

    public PolygonRequestParams setExtensionsChildPoi(boolean z7) {
        this.f7131t = z7;
        return this;
    }

    public PolygonRequestParams setFilter(String str) {
        this.f7118g = str;
        return this;
    }

    public PolygonRequestParams setFromLanguage(String str) {
        this.f7122k = str;
        return this;
    }

    public PolygonRequestParams setHomonym(boolean z7) {
        this.f7132u = z7;
        return this;
    }

    public PolygonRequestParams setLanguage(String str) {
        this.f7123l = str;
        return this;
    }

    public PolygonRequestParams setLightVersion(boolean z7) {
        this.f7114c = z7;
        return this;
    }

    public PolygonRequestParams setOutput(String str) {
        this.f7127p = str;
        return this;
    }

    public PolygonRequestParams setPageNum(int i8) {
        this.f7124m = i8;
        return this;
    }

    public PolygonRequestParams setPageSize(int i8) {
        this.f7125n = i8;
        return this;
    }

    public PolygonRequestParams setPhotoShow(boolean z7) {
        this.f7121j = z7;
        return this;
    }

    public PolygonRequestParams setQuery(String str) {
        this.f7112a = str;
        return this;
    }

    public PolygonRequestParams setRetCoordType(String str) {
        this.f7126o = str;
        return this;
    }

    public PolygonRequestParams setScope(int i8) {
        this.f7116e = i8;
        return this;
    }

    public PolygonRequestParams setSign(String str) {
        this.f7129r = str;
        return this;
    }

    public PolygonRequestParams setTag(String str) {
        this.f7133v = str;
        return this;
    }

    public void setTimestamp(Long l8) {
        this.f7130s = l8;
    }

    public PolygonRequestParams setToken(String str) {
        this.f7128q = str;
        return this;
    }

    public PolygonRequestParams setType(String str) {
        this.f7115d = str;
        return this;
    }
}
