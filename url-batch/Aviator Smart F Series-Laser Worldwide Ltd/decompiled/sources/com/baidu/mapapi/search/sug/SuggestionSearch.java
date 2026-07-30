package com.baidu.mapapi.search.sug;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.search.core.a;
import com.baidu.platform.a.j.b;

/* loaded from: classes2.dex */
public class SuggestionSearch extends a {

    /* renamed from: b, reason: collision with root package name */
    private boolean f7446b = false;

    /* renamed from: a, reason: collision with root package name */
    com.baidu.platform.a.j.a f7445a = new b();

    private SuggestionSearch() {
    }

    public static SuggestionSearch newInstance() {
        BMapManager.init();
        return new SuggestionSearch();
    }

    public void destroy() {
        if (this.f7446b) {
            return;
        }
        this.f7446b = true;
        this.f7445a.destroy();
        BMapManager.destroy();
    }

    public boolean requestSuggestion(SuggestionSearchOption suggestionSearchOption) {
        com.baidu.platform.a.j.a aVar = this.f7445a;
        if (aVar == null) {
            throw new IllegalStateException("BDMapSDKException: suggestionsearch is null, please call newInstance() first.");
        }
        if (suggestionSearchOption == null || suggestionSearchOption.mKeyword == null || suggestionSearchOption.mCity == null) {
            throw new IllegalArgumentException("BDMapSDKException: option or keyword or city can not be null");
        }
        return aVar.a(suggestionSearchOption);
    }

    public void setOnGetSuggestionResultListener(OnGetSuggestionResultListener onGetSuggestionResultListener) {
        com.baidu.platform.a.j.a aVar = this.f7445a;
        if (aVar == null) {
            throw new IllegalStateException("BDMapSDKException: suggestionsearch is null, please call newInstance() first.");
        }
        if (onGetSuggestionResultListener == null) {
            throw new IllegalArgumentException("BDMapSDKException: listener can not be null");
        }
        aVar.a(onGetSuggestionResultListener);
    }
}
