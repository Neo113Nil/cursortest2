package com.squareup.cash.treehouse.android.presenters;

import androidx.lifecycle.LifecycleOwner;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.SavedState;
import app.cash.broadway.screen.Answer;
import com.squareup.cash.treehouse.android.viewmodels.TreehouseUiModel;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes7.dex */
public final class TreehousePresenter implements Presenter {
    public final TreehouseUiModel model;

    public TreehousePresenter(TreehouseUiModel treehouseUiModel) {
        this.model = treehouseUiModel;
    }

    @Override // app.cash.broadway.presenter.Presenter
    public final Presenter.Binding start(CoroutineScope coroutineScope, LifecycleOwner lifecycleOwner, Answer answer, SavedState savedState) {
        coroutineScope.getClass();
        lifecycleOwner.getClass();
        return new Presenter.Binding(this) { // from class: com.squareup.cash.treehouse.android.presenters.TreehousePresenter$start$1
            public final StateFlowImpl models;

            {
                this.models = FlowKt.MutableStateFlow(this.model);
            }

            @Override // app.cash.broadway.presenter.Presenter.Binding
            public final StateFlow getModels() {
                return this.models;
            }

            @Override // app.cash.broadway.presenter.Presenter.Binding
            public final void sendAnswer(Answer answer2) {
            }

            @Override // app.cash.broadway.presenter.Presenter.Binding
            public final void sendEvent(Object obj) {
                ((Void) obj).getClass();
            }
        };
    }
}
