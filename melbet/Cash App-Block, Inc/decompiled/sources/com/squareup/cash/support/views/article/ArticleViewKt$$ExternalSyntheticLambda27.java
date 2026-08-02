package com.squareup.cash.support.views.article;

import com.squareup.cash.support.backend.api.articles.Link;
import com.squareup.cash.support.viewmodels.ArticleViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class ArticleViewKt$$ExternalSyntheticLambda27 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ Link f$1;

    public /* synthetic */ ArticleViewKt$$ExternalSyntheticLambda27(Function1 function1, Link link, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = link;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invoke(new ArticleViewEvent.ClickCallToAction(this.f$1));
                break;
            default:
                this.f$0.invoke(this.f$1);
                break;
        }
        return Unit.INSTANCE;
    }
}
