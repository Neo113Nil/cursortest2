package com.baidu.ar;

import android.text.TextUtils;
import com.baidu.ar.arrender.IARRenderer;
import com.baidu.ar.filter.FilterNode;
import com.baidu.ar.filter.FilterParam;
import com.baidu.ar.filter.FilterStateListener;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.StatisticConstants;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public IARRenderer f2266a;

    /* renamed from: b, reason: collision with root package name */
    public DefaultParams f2267b;

    /* renamed from: c, reason: collision with root package name */
    public FilterStateListener f2268c;

    /* renamed from: g, reason: collision with root package name */
    public String f2272g;

    /* renamed from: d, reason: collision with root package name */
    public HashMap<FilterNode, Boolean> f2269d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    public HashMap<FilterNode, Boolean> f2270e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    public HashMap<FilterNode, Boolean> f2271f = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    public y7 f2273h = new y7();

    public g(DefaultParams defaultParams) {
        this.f2267b = defaultParams;
        HashMap<FilterNode, Boolean> hashMap = this.f2269d;
        if (hashMap != null) {
            FilterNode filterNode = FilterNode.lutFilter;
            Boolean bool = Boolean.FALSE;
            hashMap.put(filterNode, bool);
            this.f2269d.put(FilterNode.skinFilter, bool);
            this.f2269d.put(FilterNode.faceFilter, bool);
            this.f2269d.put(FilterNode.makeupFilter, bool);
        }
        HashMap<FilterNode, Boolean> hashMap2 = this.f2270e;
        if (hashMap2 != null) {
            hashMap2.put(FilterNode.lutFilter, Boolean.TRUE);
            this.f2270e.put(FilterNode.skinFilter, Boolean.valueOf(this.f2267b.isUseBeautyFilter()));
            this.f2270e.put(FilterNode.faceFilter, Boolean.valueOf(this.f2267b.isUseFaceFilter()));
            this.f2270e.put(FilterNode.makeupFilter, Boolean.valueOf(this.f2267b.isUseMakeupFilter()));
        }
    }

    public final String a(Object obj) {
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return "/opacity";
        }
        if (obj instanceof String) {
            return "/texture_path";
        }
        if (obj instanceof Integer) {
            return "/is_enable";
        }
        return null;
    }

    public void b() {
        a(1);
    }

    public void c() {
        IARRenderer iARRenderer = this.f2266a;
        if (iARRenderer != null) {
            iARRenderer.clearCaseLutFilter();
        }
    }

    public String d(String str) {
        if (this.f2266a == null) {
            return null;
        }
        String renderPipeline = this.f2267b.getRenderPipeline();
        if (!TextUtils.isEmpty(renderPipeline) && renderPipeline.contains(FilterNode.highlightFilter.getNodeName())) {
            h.a("ARFilterManager", "updateFilterCase: getRenderPipeline " + renderPipeline);
            this.f2273h.a(str);
        }
        return this.f2266a.updateFilterCase(str);
    }

    public synchronized void e() {
        try {
            this.f2267b = null;
            this.f2266a = null;
            this.f2273h = null;
            this.f2268c = null;
            HashMap<FilterNode, Boolean> hashMap = this.f2269d;
            if (hashMap != null) {
                hashMap.clear();
                this.f2269d = null;
            }
            HashMap<FilterNode, Boolean> hashMap2 = this.f2270e;
            if (hashMap2 != null) {
                hashMap2.clear();
                this.f2270e = null;
            }
            HashMap<FilterNode, Boolean> hashMap3 = this.f2271f;
            if (hashMap3 != null) {
                hashMap3.clear();
                this.f2271f = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void f() {
        a(0);
    }

    public void g() {
        if (this.f2273h.b()) {
            a(this.f2273h.a(), true);
        }
    }

    public final String a(String str) {
        return FilterNode.faceFilter.getNodeName().equals(str) ? "ability_face_filter" : FilterNode.makeupFilter.getNodeName().equals(str) ? "ability_makeup_filter" : "ability_common_filter";
    }

    public final void b(String str) {
        String str2;
        str.hashCode();
        switch (str) {
            case "cheeks":
                str2 = StatisticConstants.EVENT_MAKEUP_BLUSHER_ENTER;
                break;
            case "highlight":
                str2 = StatisticConstants.EVENT_MAKEUP_HIGHLIGHT_ENTER;
                break;
            case "lips":
            case "lips_mask":
                str2 = StatisticConstants.EVENT_MAKEUP_LIPSTICK_ENTER;
                break;
            default:
                str2 = null;
                break;
        }
        if (str2 != null) {
            StatisticApi.onEvent(str2);
        }
    }

    public void c(String str) {
        this.f2272g = str;
    }

    public synchronized void d() {
        try {
            HashMap<FilterNode, Boolean> hashMap = this.f2269d;
            if (hashMap != null) {
                FilterNode filterNode = FilterNode.lutFilter;
                Boolean bool = Boolean.TRUE;
                hashMap.put(filterNode, bool);
                this.f2269d.put(FilterNode.skinFilter, bool);
                this.f2269d.put(FilterNode.faceFilter, bool);
                this.f2269d.put(FilterNode.makeupFilter, bool);
                h.a("ARFilterManager", "onPipelineCreate mPipelineStates = " + this.f2269d.toString());
            }
            a();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void a() {
        HashMap<FilterNode, Boolean> hashMap;
        HashMap<FilterNode, Boolean> hashMap2 = this.f2271f;
        if (hashMap2 != null && (hashMap = this.f2269d) != null && this.f2270e != null) {
            FilterNode filterNode = FilterNode.lutFilter;
            boolean z7 = false;
            hashMap2.put(filterNode, Boolean.valueOf(hashMap.get(filterNode).booleanValue() && this.f2270e.get(filterNode).booleanValue()));
            HashMap<FilterNode, Boolean> hashMap3 = this.f2271f;
            FilterNode filterNode2 = FilterNode.skinFilter;
            hashMap3.put(filterNode2, Boolean.valueOf(this.f2269d.get(filterNode2).booleanValue() && this.f2270e.get(filterNode2).booleanValue()));
            HashMap<FilterNode, Boolean> hashMap4 = this.f2271f;
            FilterNode filterNode3 = FilterNode.faceFilter;
            hashMap4.put(filterNode3, Boolean.valueOf(this.f2269d.get(filterNode3).booleanValue() && this.f2270e.get(filterNode3).booleanValue()));
            HashMap<FilterNode, Boolean> hashMap5 = this.f2271f;
            FilterNode filterNode4 = FilterNode.makeupFilter;
            if (this.f2269d.get(filterNode4).booleanValue() && this.f2270e.get(filterNode4).booleanValue()) {
                z7 = true;
            }
            hashMap5.put(filterNode4, Boolean.valueOf(z7));
            h.a("ARFilterManager", "callbackFilterStates mFilterStates = " + this.f2271f.toString() + " && mCasePath = " + this.f2272g);
        }
        FilterStateListener filterStateListener = this.f2268c;
        if (filterStateListener != null) {
            filterStateListener.onFilterStateChanged(this.f2271f, this.f2272g);
        }
    }

    public final void a(int i8) {
        if (this.f2266a != null) {
            com.baidu.ar.arrender.c cVar = new com.baidu.ar.arrender.c();
            cVar.a("ability_common_filter");
            cVar.c(FilterNode.faceFilter.getNodeName());
            cVar.b("clearAllKnead");
            cVar.a(Integer.valueOf(i8));
            this.f2266a.updateFilterData(cVar);
        }
    }

    public void a(IARRenderer iARRenderer) {
        this.f2266a = iARRenderer;
    }

    public synchronized void a(FilterNode filterNode, boolean z7) {
        HashMap<FilterNode, Boolean> hashMap;
        h.a("ARFilterManager", "updateAbilityState filerName = " + filterNode + " && state = " + z7);
        if (filterNode != null && (hashMap = this.f2270e) != null && hashMap.containsKey(filterNode)) {
            this.f2270e.put(filterNode, Boolean.valueOf(z7));
        }
    }

    public void a(FilterParam filterParam, Object obj) {
        String str;
        boolean z7;
        String str2;
        if (filterParam == null) {
            return;
        }
        FilterNode filterNode = filterParam.getFilterNode();
        if (FilterNode.makeupFilter.equals(filterNode)) {
            str = a(obj);
            if (obj instanceof String) {
                b(filterParam.getParamName());
            } else if (obj instanceof Integer) {
                str2 = str;
                z7 = true;
                a(filterNode.getNodeName(), filterParam.getParamName(), obj, str2, z7);
            }
        } else {
            str = (FilterNode.advanceBeautyFilter.equals(filterNode) && (obj instanceof Float)) ? "/intensity" : null;
        }
        str2 = str;
        z7 = false;
        a(filterNode.getNodeName(), filterParam.getParamName(), obj, str2, z7);
    }

    public void a(FilterStateListener filterStateListener) {
        this.f2268c = filterStateListener;
    }

    public void a(String str, String str2, Object obj) {
        boolean z7;
        String str3;
        String str4 = null;
        if (FilterNode.makeupFilter.getNodeName().equals(str)) {
            if (obj instanceof String) {
                b(str2);
            } else if (obj instanceof Integer) {
                str3 = null;
                z7 = true;
                a(str, str2, obj, str3, z7);
            }
        } else if (FilterNode.advanceBeautyFilter.getNodeName().equals(str) && (obj instanceof Float)) {
            str4 = "/intensity";
        }
        str3 = str4;
        z7 = false;
        a(str, str2, obj, str3, z7);
    }

    public void a(String str, String str2, Object obj, String str3, boolean z7) {
        com.baidu.ar.arrender.c cVar = new com.baidu.ar.arrender.c();
        cVar.a(a(str));
        cVar.c(str);
        cVar.a(obj);
        cVar.a(z7);
        if (TextUtils.isEmpty(str3)) {
            cVar.b(str2);
        } else {
            cVar.b(str2 + str3);
        }
        IARRenderer iARRenderer = this.f2266a;
        if (iARRenderer != null) {
            iARRenderer.updateFilterData(cVar);
        }
    }

    public void a(String str, boolean z7) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.baidu.ar.arrender.c cVar = new com.baidu.ar.arrender.c();
        cVar.a(true);
        cVar.a(a(str));
        cVar.c(str);
        cVar.b("is_enable");
        cVar.a(z7 ? 1 : 0);
        IARRenderer iARRenderer = this.f2266a;
        if (iARRenderer != null) {
            iARRenderer.updateFilterData(cVar);
        }
    }

    public synchronized void a(List<String> list) {
        if (list == null) {
            return;
        }
        try {
            HashMap<FilterNode, Boolean> hashMap = this.f2269d;
            if (hashMap != null) {
                FilterNode filterNode = FilterNode.lutFilter;
                hashMap.put(filterNode, Boolean.valueOf(list.contains(filterNode.getNodeName())));
                HashMap<FilterNode, Boolean> hashMap2 = this.f2269d;
                FilterNode filterNode2 = FilterNode.skinFilter;
                hashMap2.put(filterNode2, Boolean.valueOf(list.contains(filterNode2.getNodeName())));
                HashMap<FilterNode, Boolean> hashMap3 = this.f2269d;
                FilterNode filterNode3 = FilterNode.faceFilter;
                hashMap3.put(filterNode3, Boolean.valueOf(list.contains(filterNode3.getNodeName())));
                HashMap<FilterNode, Boolean> hashMap4 = this.f2269d;
                FilterNode filterNode4 = FilterNode.makeupFilter;
                hashMap4.put(filterNode4, Boolean.valueOf(list.contains(filterNode4.getNodeName())));
                h.a("ARFilterManager", "onPipelineChanged mPipelineStates = " + this.f2269d.toString());
            }
            a();
        } catch (Throwable th) {
            throw th;
        }
    }
}
