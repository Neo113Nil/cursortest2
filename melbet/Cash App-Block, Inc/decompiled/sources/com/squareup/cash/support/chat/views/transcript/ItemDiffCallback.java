package com.squareup.cash.support.chat.views.transcript;

import androidx.recyclerview.widget.DiffUtil;
import com.squareup.cash.investingcrypto.viewmodels.news.Bookmark;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsArticleListItem;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsArticleViewModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoViewAllNewsModel;
import com.squareup.cash.support.chat.viewmodels.ChatRowViewModel;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ItemDiffCallback extends DiffUtil {
    public final /* synthetic */ int $r8$classId;

    @Override // androidx.recyclerview.widget.DiffUtil
    public final boolean areContentsTheSame(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return Intrinsics.areEqual(((ChatRowViewModel) obj).getModel(), ((ChatRowViewModel) obj2).getModel());
            case 1:
                return ((InvestingCryptoNewsArticleListItem) obj).equals((InvestingCryptoNewsArticleListItem) obj2);
            default:
                return ((Option) obj).equals((Option) obj2);
        }
    }

    @Override // androidx.recyclerview.widget.DiffUtil
    public final boolean areItemsTheSame(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ChatRowViewModel chatRowViewModel = (ChatRowViewModel) obj;
                ChatRowViewModel chatRowViewModel2 = (ChatRowViewModel) obj2;
                return ((chatRowViewModel instanceof ChatRowViewModel.MessageRowViewModel) && (chatRowViewModel2 instanceof ChatRowViewModel.MessageRowViewModel)) ? ((ChatRowViewModel.MessageRowViewModel) chatRowViewModel).model.getId().equals(((ChatRowViewModel.MessageRowViewModel) chatRowViewModel2).model.getId()) : Intrinsics.areEqual(chatRowViewModel.getModel(), chatRowViewModel2.getModel());
            case 1:
                InvestingCryptoNewsArticleListItem investingCryptoNewsArticleListItem = (InvestingCryptoNewsArticleListItem) obj;
                InvestingCryptoNewsArticleListItem investingCryptoNewsArticleListItem2 = (InvestingCryptoNewsArticleListItem) obj2;
                if (((investingCryptoNewsArticleListItem instanceof Bookmark) && (investingCryptoNewsArticleListItem2 instanceof Bookmark)) || ((investingCryptoNewsArticleListItem instanceof InvestingCryptoViewAllNewsModel) && (investingCryptoNewsArticleListItem2 instanceof InvestingCryptoViewAllNewsModel))) {
                    return true;
                }
                if ((investingCryptoNewsArticleListItem instanceof InvestingCryptoNewsArticleViewModel) && (investingCryptoNewsArticleListItem2 instanceof InvestingCryptoNewsArticleViewModel)) {
                    return Intrinsics.areEqual(((InvestingCryptoNewsArticleViewModel) investingCryptoNewsArticleListItem).url, ((InvestingCryptoNewsArticleViewModel) investingCryptoNewsArticleListItem2).url);
                }
                return false;
            default:
                return ((Option) obj).equals((Option) obj2);
        }
    }

    @Override // androidx.recyclerview.widget.DiffUtil
    public Object getChangePayload(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 1:
                return Unit.INSTANCE;
            default:
                return super.getChangePayload(obj, obj2);
        }
    }
}
