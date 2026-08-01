package dev.cct.translatorapp;

import dev.cct.translatorapp.dao.TranslationDao;
import dev.cct.translatorapp.dataModel.ConversationModel;
import dev.cct.translatorapp.dataModel.FavoriteModel;
import dev.cct.translatorapp.dataModel.HistoryModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TranslationRepository.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0013J\u0006\u0010\u0016\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u000bJ\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013J\u0019\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0019\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Ldev/cct/translatorapp/TranslationRepository;", "", "translationDao", "Ldev/cct/translatorapp/dao/TranslationDao;", "(Ldev/cct/translatorapp/dao/TranslationDao;)V", "addToFavorite", "", "translation", "Ldev/cct/translatorapp/dataModel/FavoriteModel;", "(Ldev/cct/translatorapp/dataModel/FavoriteModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "Ldev/cct/translatorapp/dataModel/HistoryModel;", "(Ldev/cct/translatorapp/dataModel/HistoryModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllConversation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteConversation", "Ldev/cct/translatorapp/dataModel/ConversationModel;", "(Ldev/cct/translatorapp/dataModel/ConversationModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllConversations", "", "getFavoriteHistory", "getFavorites", "getLastConversation", "getLastTranslation", "getTranslation", "insert", "insertConversation", "removeFromFavorite", "updateFavorite", "", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TranslationRepository {
    private final TranslationDao translationDao;

    public TranslationRepository(TranslationDao translationDao) {
        Intrinsics.checkNotNullParameter(translationDao, "translationDao");
        this.translationDao = translationDao;
    }

    public final Object insert(HistoryModel historyModel, Continuation<? super Unit> continuation) {
        Object insert = this.translationDao.insert(historyModel, continuation);
        return insert == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? insert : Unit.INSTANCE;
    }

    public final Object delete(HistoryModel historyModel, Continuation<? super Unit> continuation) {
        Object deleteTranslation = this.translationDao.deleteTranslation(historyModel, continuation);
        return deleteTranslation == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteTranslation : Unit.INSTANCE;
    }

    public final List<HistoryModel> getTranslation() {
        return this.translationDao.getAllTranslations();
    }

    public final HistoryModel getLastTranslation() {
        return this.translationDao.getLastTranslation();
    }

    public final List<HistoryModel> getFavoriteHistory() {
        return this.translationDao.getFavoriteHistory();
    }

    public final int updateFavorite(HistoryModel translation) {
        Intrinsics.checkNotNullParameter(translation, "translation");
        return this.translationDao.updateFavorite(translation);
    }

    public final List<FavoriteModel> getFavorites() {
        return this.translationDao.getFavorites();
    }

    public final Object addToFavorite(FavoriteModel favoriteModel, Continuation<? super Unit> continuation) {
        Object addToFavorite = this.translationDao.addToFavorite(favoriteModel, continuation);
        return addToFavorite == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? addToFavorite : Unit.INSTANCE;
    }

    public final Object removeFromFavorite(FavoriteModel favoriteModel, Continuation<? super Unit> continuation) {
        Object removeFromFavorite = this.translationDao.removeFromFavorite(favoriteModel, continuation);
        return removeFromFavorite == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? removeFromFavorite : Unit.INSTANCE;
    }

    public final Object insertConversation(ConversationModel conversationModel, Continuation<? super Unit> continuation) {
        Object insertConversation = this.translationDao.insertConversation(conversationModel, continuation);
        return insertConversation == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? insertConversation : Unit.INSTANCE;
    }

    public final Object deleteConversation(ConversationModel conversationModel, Continuation<? super Unit> continuation) {
        Object deleteConversation = this.translationDao.deleteConversation(conversationModel, continuation);
        return deleteConversation == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteConversation : Unit.INSTANCE;
    }

    public final Object deleteAllConversation(Continuation<? super Unit> continuation) {
        Object deleteAllConversations = this.translationDao.deleteAllConversations(continuation);
        return deleteAllConversations == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteAllConversations : Unit.INSTANCE;
    }

    public final List<ConversationModel> getAllConversations() {
        return this.translationDao.getAllConversations();
    }

    public final ConversationModel getLastConversation() {
        return this.translationDao.getLastConversation();
    }
}
