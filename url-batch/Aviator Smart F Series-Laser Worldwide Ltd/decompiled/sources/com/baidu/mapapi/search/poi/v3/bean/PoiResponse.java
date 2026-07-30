package com.baidu.mapapi.search.poi.v3.bean;

import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.List;

/* loaded from: classes2.dex */
public class PoiResponse extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(desc = "本次API访问状态，如果成功返回0，如果失败返回其他数字。", name = "status")
    private int f7088a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(desc = "本次API访问状态描述信息，如果成功返回ok，如果失败返回错误原因。", name = "message")
    private String f7089b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(desc = "召回poi数量", name = FileDownloadModel.TOTAL)
    private int f7090c;

    /* renamed from: d, reason: collision with root package name */
    @Properties(desc = "召回结果类型", name = "result_type")
    private String f7091d;

    /* renamed from: e, reason: collision with root package name */
    @Properties(desc = "查询类型", name = "query_type")
    private String f7092e;

    /* renamed from: f, reason: collision with root package name */
    @Properties(desc = "搜索类型", name = "results")
    private List<PoiResult> f7093f;

    public String getMessage() {
        return this.f7089b;
    }

    public String getQueryType() {
        return this.f7092e;
    }

    public String getResultType() {
        return this.f7091d;
    }

    public List<PoiResult> getResults() {
        return this.f7093f;
    }

    public int getStatus() {
        return this.f7088a;
    }

    public int getTotal() {
        return this.f7090c;
    }

    public void setMessage(String str) {
        this.f7089b = str;
    }

    public void setQueryType(String str) {
        this.f7092e = str;
    }

    public void setResultType(String str) {
        this.f7091d = str;
    }

    public void setResults(List<PoiResult> list) {
        this.f7093f = list;
    }

    public void setStatus(int i8) {
        this.f7088a = i8;
    }

    public void setTotal(int i8) {
        this.f7090c = i8;
    }
}
