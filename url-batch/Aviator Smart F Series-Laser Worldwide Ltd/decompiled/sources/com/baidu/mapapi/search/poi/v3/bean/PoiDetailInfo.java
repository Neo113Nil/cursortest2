package com.baidu.mapapi.search.poi.v3.bean;

import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* loaded from: classes2.dex */
public class PoiDetailInfo extends BaseParams {

    @Properties(name = "new_catalog")
    private String A;

    @Properties(desc = "poi子点", name = "children")
    private List<ChildrenPoi> B;

    /* renamed from: a, reason: collision with root package name */
    @Properties(desc = "poi分类标签", name = "classified_poi_tag")
    private String f7062a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(desc = "poi分类标签", name = "tag")
    private String f7063b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(desc = "poi别名", name = "new_alias")
    private String f7064c;

    /* renamed from: d, reason: collision with root package name */
    @Properties(desc = "类型", name = "type")
    private String f7065d;

    /* renamed from: e, reason: collision with root package name */
    @Properties(desc = "poi详情页", name = "detail_url")
    private String f7066e;

    /* renamed from: f, reason: collision with root package name */
    @Properties(desc = "poi的营业时间", name = "shop_hours")
    private String f7067f;

    /* renamed from: g, reason: collision with root package name */
    @Properties(desc = "poi商户的价格", name = FirebaseAnalytics.Param.PRICE)
    private String f7068g;

    /* renamed from: h, reason: collision with root package name */
    @Properties(desc = "poi权威标签", name = "label")
    private String f7069h;

    /* renamed from: i, reason: collision with root package name */
    @Properties(desc = "poi综合评分", name = "overall_rating")
    private String f7070i;

    /* renamed from: j, reason: collision with root package name */
    @Properties(desc = "poi图片数", name = "image_num")
    private String f7071j;

    /* renamed from: k, reason: collision with root package name */
    @Properties(desc = "poi的评论数", name = "comment_num")
    private String f7072k;

    /* renamed from: l, reason: collision with root package name */
    @Properties(desc = "poi对应的导航引导点坐标", name = "navi_location")
    private String f7073l;

    /* renamed from: m, reason: collision with root package name */
    @Properties(desc = "poi对应的品牌", name = "brand")
    private String f7074m;

    /* renamed from: n, reason: collision with root package name */
    @Properties(desc = "室内poi所在楼层", name = "indoor_floor")
    private String f7075n;

    /* renamed from: o, reason: collision with root package name */
    @Properties(desc = "poi头图", name = "head_image")
    private String f7076o;

    /* renamed from: p, reason: collision with root package name */
    @Properties(desc = "poi的相关榜单排名", name = "ranking")
    private String f7077p;

    /* renamed from: q, reason: collision with root package name */
    @Properties(desc = "poi父id", name = "parent_id")
    private String f7078q;

    /* renamed from: r, reason: collision with root package name */
    @Properties(desc = "poi图片的下载链接", name = "photos")
    private List<String> f7079r;

    /* renamed from: s, reason: collision with root package name */
    @Properties(desc = "最佳游玩时间 ", name = "best_time")
    private String f7080s;

    /* renamed from: t, reason: collision with root package name */
    @Properties(desc = "建议时长", name = "sug_time")
    private String f7081t;

    /* renamed from: u, reason: collision with root package name */
    @Properties(desc = "描述", name = "description")
    private String f7082u;

    /* renamed from: v, reason: collision with root package name */
    @Properties(name = "content_tag")
    private String f7083v;

    /* renamed from: w, reason: collision with root package name */
    @Properties(name = "alias")
    private List<String> f7084w;

    /* renamed from: x, reason: collision with root package name */
    @Properties(name = "is_default_image")
    private boolean f7085x;

    /* renamed from: y, reason: collision with root package name */
    @Properties(name = "image")
    private String f7086y;

    /* renamed from: z, reason: collision with root package name */
    @Properties(name = "distance")
    private int f7087z;

    public List<String> getAlias() {
        return this.f7084w;
    }

    public String getBestTime() {
        return this.f7080s;
    }

    public String getBrand() {
        return this.f7074m;
    }

    public List<ChildrenPoi> getChildren() {
        return this.B;
    }

    public String getClassifiedPoiTag() {
        return this.f7062a;
    }

    public String getCommentNum() {
        return this.f7072k;
    }

    public String getContentTag() {
        return this.f7083v;
    }

    public String getDescription() {
        return this.f7082u;
    }

    public String getDetailUrl() {
        return this.f7066e;
    }

    public int getDistance() {
        return this.f7087z;
    }

    public String getHeadImage() {
        return this.f7076o;
    }

    public String getImage() {
        return this.f7086y;
    }

    public String getImageNum() {
        return this.f7071j;
    }

    public String getIndoorFloor() {
        return this.f7075n;
    }

    public String getLabel() {
        return this.f7069h;
    }

    public LatLng getNaviLocation() {
        String decodeCoordHash = AppMD5.decodeCoordHash(this.f7073l);
        if (decodeCoordHash.isEmpty()) {
            return null;
        }
        String[] split = decodeCoordHash.split(SystemInfoUtil.COMMA);
        return new LatLng(Double.parseDouble(split[1]), Double.parseDouble(split[0]));
    }

    public String getNewAlias() {
        return this.f7064c;
    }

    public String getNewCatalog() {
        return this.A;
    }

    public String getOverallRating() {
        return this.f7070i;
    }

    public String getParentId() {
        return this.f7078q;
    }

    public List<String> getPhotos() {
        return this.f7079r;
    }

    public String getPrice() {
        return this.f7068g;
    }

    public String getRanking() {
        return this.f7077p;
    }

    public String getShopHours() {
        return this.f7067f;
    }

    public String getSugTime() {
        return this.f7081t;
    }

    public String getTag() {
        return this.f7063b;
    }

    public String getType() {
        return this.f7065d;
    }

    public boolean isDefaultImage() {
        return this.f7085x;
    }

    public void setAlias(List<String> list) {
        this.f7084w = list;
    }

    public void setBestTime(String str) {
        this.f7080s = str;
    }

    public void setBrand(String str) {
        this.f7074m = str;
    }

    public void setChildren(List<ChildrenPoi> list) {
        this.B = list;
    }

    public void setClassifiedPoiTag(String str) {
        this.f7062a = str;
    }

    public void setCommentNum(String str) {
        this.f7072k = str;
    }

    public void setContentTag(String str) {
        this.f7083v = str;
    }

    public void setDefaultImage(boolean z7) {
        this.f7085x = z7;
    }

    public void setDescription(String str) {
        this.f7082u = str;
    }

    public void setDetailUrl(String str) {
        this.f7066e = str;
    }

    public void setDistance(int i8) {
        this.f7087z = i8;
    }

    public void setHeadImage(String str) {
        this.f7076o = str;
    }

    public void setImage(String str) {
        this.f7086y = str;
    }

    public void setImageNum(String str) {
        this.f7071j = str;
    }

    public void setIndoorFloor(String str) {
        this.f7075n = str;
    }

    public void setLabel(String str) {
        this.f7069h = str;
    }

    public void setNaviLocation(LatLng latLng) {
        if (latLng != null) {
            this.f7073l = AppMD5.encodeCoordHash(latLng.longitude, latLng.latitude);
        }
    }

    public void setNewAlias(String str) {
        this.f7064c = str;
    }

    public void setNewCatalog(String str) {
        this.A = str;
    }

    public void setOverallRating(String str) {
        this.f7070i = str;
    }

    public void setParentId(String str) {
        this.f7078q = str;
    }

    public void setPhotos(List<String> list) {
        this.f7079r = list;
    }

    public void setPrice(String str) {
        this.f7068g = str;
    }

    public void setRanking(String str) {
        this.f7077p = str;
    }

    public void setShopHours(String str) {
        this.f7067f = str;
    }

    public void setSugTime(String str) {
        this.f7081t = str;
    }

    public void setTag(String str) {
        this.f7063b = str;
    }

    public void setType(String str) {
        this.f7065d = str;
    }
}
