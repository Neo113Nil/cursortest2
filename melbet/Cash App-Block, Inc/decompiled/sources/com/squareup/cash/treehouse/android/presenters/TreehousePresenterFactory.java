package com.squareup.cash.treehouse.android.presenters;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.treehouse.android.broadway.TreehouseScreen;
import com.squareup.cash.treehouse.android.viewmodels.TreehouseUiModel;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class TreehousePresenterFactory implements PresenterFactory {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new TreehousePresenterFactory();
        }
    }

    @Override // app.cash.broadway.presenter.PresenterFactory
    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        screen.getClass();
        if (!(screen instanceof TreehouseScreen)) {
            return null;
        }
        TreehouseScreen treehouseScreen = (TreehouseScreen) screen;
        String str = treehouseScreen.f1218app;
        return new TreehousePresenter(new TreehouseUiModel(str, CameraSelector$$ExternalSyntheticOutline0.m("/treehouse/", str, "/", treehouseScreen.link), screenNavigator));
    }
}
