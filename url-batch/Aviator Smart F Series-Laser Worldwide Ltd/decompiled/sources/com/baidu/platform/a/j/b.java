package com.baidu.platform.a.j;

import com.baidu.mapapi.search.sug.OnGetSuggestionResultListener;
import com.baidu.mapapi.search.sug.SuggestionSearchOption;
import com.baidu.platform.base.SearchType;

/* loaded from: classes2.dex */
public class b extends com.baidu.platform.base.b implements a {

    /* renamed from: g, reason: collision with root package name */
    private OnGetSuggestionResultListener f8626g = null;

    @Override // com.baidu.platform.a.j.a
    public boolean a(SuggestionSearchOption suggestionSearchOption) {
        c cVar = new c();
        cVar.a(SearchType.SUGGESTION_SEARCH_TYPE);
        return a(new d(suggestionSearchOption), this.f8626g, cVar);
    }

    @Override // com.baidu.platform.a.j.a
    public void destroy() {
        this.f8690c.lock();
        this.f8626g = null;
        this.f8690c.unlock();
    }

    @Override // com.baidu.platform.a.j.a
    public void a(OnGetSuggestionResultListener onGetSuggestionResultListener) {
        this.f8690c.lock();
        this.f8626g = onGetSuggestionResultListener;
        this.f8690c.unlock();
    }
}
