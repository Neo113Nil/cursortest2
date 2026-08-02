package com.squareup.cash.support.views.article;

import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class ArticleViewKt$previewActivityItemLoader$1 implements SupportActivityItemLoader {
    @Override // com.squareup.cash.support.backend.api.SupportActivityItemLoader
    public final Flow loadItem(String str) {
        str.getClass();
        return new AppLockMonitor$special$$inlined$map$2(SupportActivityItemLoader.State.Failure.INSTANCE$1, 19);
    }
}
