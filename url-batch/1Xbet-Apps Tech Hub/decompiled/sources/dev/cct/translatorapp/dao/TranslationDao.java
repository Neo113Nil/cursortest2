package dev.cct.translatorapp.dao;

import dev.cct.translatorapp.dataModel.ConversationModel;
import dev.cct.translatorapp.dataModel.FavoriteModel;
import dev.cct.translatorapp.dataModel.HistoryModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: TranslationDao.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000eH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011H'J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H'J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H'J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H'J\b\u0010\u0015\u001a\u00020\u000bH'J\b\u0010\u0016\u001a\u00020\u000eH'J\u0019\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000eH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0019\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u000eH'J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0005H'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Ldev/cct/translatorapp/dao/TranslationDao;", "", "addToFavorite", "", "translation", "Ldev/cct/translatorapp/dataModel/FavoriteModel;", "(Ldev/cct/translatorapp/dataModel/FavoriteModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllConversations", "deleteConversation", "Ldev/cct/translatorapp/dataModel/ConversationModel;", "(Ldev/cct/translatorapp/dataModel/ConversationModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTranslation", "Ldev/cct/translatorapp/dataModel/HistoryModel;", "(Ldev/cct/translatorapp/dataModel/HistoryModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllConversations", "", "getAllTranslations", "getFavoriteHistory", "getFavorites", "getLastConversation", "getLastTranslation", "insert", "insertConversation", "removeFromFavorite", "updateFavorite", "", "updateFavorite2", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TranslationDao {
    Object addToFavorite(FavoriteModel favoriteModel, Continuation<? super Unit> continuation);

    Object deleteAll(Continuation<? super Unit> continuation);

    Object deleteAllConversations(Continuation<? super Unit> continuation);

    Object deleteConversation(ConversationModel conversationModel, Continuation<? super Unit> continuation);

    Object deleteTranslation(HistoryModel historyModel, Continuation<? super Unit> continuation);

    List<ConversationModel> getAllConversations();

    List<HistoryModel> getAllTranslations();

    List<HistoryModel> getFavoriteHistory();

    List<FavoriteModel> getFavorites();

    ConversationModel getLastConversation();

    HistoryModel getLastTranslation();

    Object insert(HistoryModel historyModel, Continuation<? super Unit> continuation);

    Object insertConversation(ConversationModel conversationModel, Continuation<? super Unit> continuation);

    Object removeFromFavorite(FavoriteModel favoriteModel, Continuation<? super Unit> continuation);

    int updateFavorite(HistoryModel translation);

    int updateFavorite2(FavoriteModel translation);
}
