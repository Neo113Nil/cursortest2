package com.baidu.platform.a.j;

import com.baidu.mapapi.search.sug.OnGetSuggestionResultListener;
import com.baidu.mapapi.search.sug.SuggestionSearchOption;

/* loaded from: classes2.dex */
public interface a {
    void a(OnGetSuggestionResultListener onGetSuggestionResultListener);

    boolean a(SuggestionSearchOption suggestionSearchOption);

    void destroy();
}
