package com.baidu.mapapi.search.poi.v3.bean;

import android.text.TextUtils;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.search.poi.v3.DetailOption;
import com.crrepa.band.my.model.storage.BaseParamNames;

/* loaded from: classes2.dex */
public class DetailRequestParams extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(desc = "poi的uid", name = "uid")
    private String f7050a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(desc = "uid的集合，最多可以传入10个uid，多个uid之间用英文逗号分隔。", name = "uids")
    private String f7051b;

    /* renamed from: f, reason: collision with root package name */
    @Properties(desc = "返回的坐标类型", name = "ret_coordtype")
    private String f7055f;

    /* renamed from: i, reason: collision with root package name */
    @Properties(desc = "开发者密钥", name = BaseParamNames.TOKEN)
    private String f7058i;

    /* renamed from: j, reason: collision with root package name */
    @Properties(desc = "用户的权限签名，当AK设置为SN校验时，该参数必填SN计算方法", name = HttpConstants.SIGN)
    private String f7059j;

    /* renamed from: k, reason: collision with root package name */
    @Properties(desc = "时间戳，与SN配合使用", name = "timestamp")
    private Long f7060k;

    /* renamed from: c, reason: collision with root package name */
    @Properties(desc = "检索结果详细程度", name = "scope")
    private int f7052c = 1;

    /* renamed from: d, reason: collision with root package name */
    @Properties(desc = "是否召回国标行政区划编码", name = "extensions_adcode")
    private boolean f7053d = false;

    /* renamed from: e, reason: collision with root package name */
    @Properties(desc = "是否输出图片信息", name = "photo_show")
    private boolean f7054e = false;

    /* renamed from: g, reason: collision with root package name */
    @Properties(desc = "多语言检索", name = "language")
    private String f7056g = "zh";

    /* renamed from: h, reason: collision with root package name */
    @Properties(desc = "输出数据格式，仅支持json", name = "output")
    private String f7057h = BodyData.TYPE_JSON;

    /* renamed from: l, reason: collision with root package name */
    @Properties(name = "ce")
    private final int f7061l = 1;

    public void apply(DetailOption detailOption) {
        if (detailOption != null) {
            if (!TextUtils.isEmpty(detailOption.getUid())) {
                setUid(detailOption.getUid());
            }
            if (!TextUtils.isEmpty(detailOption.getUids())) {
                setUid(detailOption.getUids());
            }
            setScope(detailOption.getScope());
            setExtensionsAdcode(detailOption.isExtensionsAdcode());
            setPhotoShow(detailOption.isPhotoShow());
            if (!TextUtils.isEmpty(detailOption.getRetCoordType())) {
                setRetCoordType(detailOption.getRetCoordType());
            }
            if (TextUtils.isEmpty(detailOption.getLanguage())) {
                return;
            }
            setLanguage(detailOption.getLanguage());
        }
    }

    public int getCe() {
        return 1;
    }

    public String getLanguage() {
        return this.f7056g;
    }

    public String getOutput() {
        return this.f7057h;
    }

    public String getRetCoordType() {
        return this.f7055f;
    }

    public int getScope() {
        return this.f7052c;
    }

    public String getSign() {
        return this.f7059j;
    }

    public Long getTimestamp() {
        return this.f7060k;
    }

    public String getToken() {
        return this.f7058i;
    }

    public String getUid() {
        return this.f7050a;
    }

    public String getUids() {
        return this.f7051b;
    }

    public boolean isExtensionsAdcode() {
        return this.f7053d;
    }

    public boolean isPhotoShow() {
        return this.f7054e;
    }

    public DetailRequestParams setExtensionsAdcode(boolean z7) {
        this.f7053d = z7;
        return this;
    }

    public DetailRequestParams setLanguage(String str) {
        this.f7056g = str;
        return this;
    }

    public DetailRequestParams setOutput(String str) {
        this.f7057h = str;
        return this;
    }

    public DetailRequestParams setPhotoShow(boolean z7) {
        this.f7054e = z7;
        return this;
    }

    public DetailRequestParams setRetCoordType(String str) {
        this.f7055f = str;
        return this;
    }

    public DetailRequestParams setScope(int i8) {
        this.f7052c = i8;
        return this;
    }

    public DetailRequestParams setSign(String str) {
        this.f7059j = str;
        return this;
    }

    public DetailRequestParams setTimestamp(Long l8) {
        this.f7060k = l8;
        return this;
    }

    public DetailRequestParams setToken(String str) {
        this.f7058i = str;
        return this;
    }

    public DetailRequestParams setUid(String str) {
        this.f7050a = str;
        return this;
    }

    public DetailRequestParams setUids(String str) {
        this.f7051b = str;
        return this;
    }
}
