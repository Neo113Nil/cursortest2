package dev.cct.translatorapp.viewModel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import dev.cct.translatorapp.TranslationRepository;
import dev.cct.translatorapp.dataModel.ConversationModel;
import dev.cct.translatorapp.dataModel.FavoriteModel;
import dev.cct.translatorapp.dataModel.HistoryModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* compiled from: HistoryViewModel.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0019\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0013J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0013J\u0006\u0010\u0016\u001a\u00020\rJ\u0006\u0010\u0017\u001a\u00020\u0010J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013J\u000e\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0010J\u000e\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\rJ\u0019\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Ldev/cct/translatorapp/viewModel/HistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Ldev/cct/translatorapp/TranslationRepository;", "(Ldev/cct/translatorapp/TranslationRepository;)V", "addToFavorite", "", "translation", "Ldev/cct/translatorapp/dataModel/FavoriteModel;", "(Ldev/cct/translatorapp/dataModel/FavoriteModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "Lkotlinx/coroutines/Job;", "deleteConversation", "Ldev/cct/translatorapp/dataModel/ConversationModel;", "(Ldev/cct/translatorapp/dataModel/ConversationModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTranslation", "Ldev/cct/translatorapp/dataModel/HistoryModel;", "(Ldev/cct/translatorapp/dataModel/HistoryModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllConversations", "", "getFavoriteHistory", "getFavorites", "getLastConversation", "getLastTranslation", "getTranslations", "insert", "insertConversation", "removeFromFavorite", "updateFavorite", "", "HistoryViewModelFactory", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HistoryViewModel extends ViewModel {
    private final TranslationRepository repository;

    public HistoryViewModel(TranslationRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    public final Job insert(HistoryModel translation) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(translation, "translation");
        launch$default = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HistoryViewModel$insert$1(this, translation, null), 3, null);
        return launch$default;
    }

    public final Object deleteTranslation(HistoryModel historyModel, Continuation<? super Unit> continuation) {
        Object delete = this.repository.delete(historyModel, continuation);
        return delete == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? delete : Unit.INSTANCE;
    }

    public final List<HistoryModel> getTranslations() {
        return this.repository.getTranslation();
    }

    public final HistoryModel getLastTranslation() {
        return this.repository.getLastTranslation();
    }

    public final List<HistoryModel> getFavoriteHistory() {
        return this.repository.getFavoriteHistory();
    }

    public final int updateFavorite(HistoryModel translation) {
        Intrinsics.checkNotNullParameter(translation, "translation");
        return this.repository.updateFavorite(translation);
    }

    public final List<FavoriteModel> getFavorites() {
        return this.repository.getFavorites();
    }

    public final Object addToFavorite(FavoriteModel favoriteModel, Continuation<? super Unit> continuation) {
        Object addToFavorite = this.repository.addToFavorite(favoriteModel, continuation);
        return addToFavorite == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? addToFavorite : Unit.INSTANCE;
    }

    public final Object removeFromFavorite(FavoriteModel favoriteModel, Continuation<? super Unit> continuation) {
        Object removeFromFavorite = this.repository.removeFromFavorite(favoriteModel, continuation);
        return removeFromFavorite == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? removeFromFavorite : Unit.INSTANCE;
    }

    public final Job insertConversation(ConversationModel translation) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(translation, "translation");
        launch$default = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HistoryViewModel$insertConversation$1(this, translation, null), 3, null);
        return launch$default;
    }

    public final Object deleteConversation(ConversationModel conversationModel, Continuation<? super Unit> continuation) {
        Object deleteConversation = this.repository.deleteConversation(conversationModel, continuation);
        return deleteConversation == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteConversation : Unit.INSTANCE;
    }

    public final List<ConversationModel> getAllConversations() {
        return this.repository.getAllConversations();
    }

    public final Job delete() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HistoryViewModel$delete$1(this, null), 3, null);
        return launch$default;
    }

    public final ConversationModel getLastConversation() {
        return this.repository.getLastConversation();
    }

    /* compiled from: HistoryViewModel.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Ldev/cct/translatorapp/viewModel/HistoryViewModel$HistoryViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "repository", "Ldev/cct/translatorapp/TranslationRepository;", "(Ldev/cct/translatorapp/TranslationRepository;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class HistoryViewModelFactory implements ViewModelProvider.Factory {
        private final TranslationRepository repository;

        public HistoryViewModelFactory(TranslationRepository repository) {
            Intrinsics.checkNotNullParameter(repository, "repository");
            this.repository = repository;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            if (modelClass.isAssignableFrom(HistoryViewModel.class)) {
                return new HistoryViewModel(this.repository);
            }
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
    }
}
