package com.squareup.cash.stablecoin.viewmodels;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public interface StablecoinHomeViewModel {

    public final class AppletState implements StablecoinHomeViewModel {
        public final ArrayList widgets;

        public AppletState(ArrayList arrayList) {
            this.widgets = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AppletState) && this.widgets.equals(((AppletState) obj).widgets);
        }

        public final int hashCode() {
            return this.widgets.hashCode();
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("AppletState(widgets=", ")", this.widgets);
        }
    }

    public final class Loading implements StablecoinHomeViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1586606184;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class NullStateCarousel implements StablecoinHomeViewModel {
        public final UiCallbackModel swipeViewModel;

        public NullStateCarousel(UiCallbackModel uiCallbackModel) {
            this.swipeViewModel = uiCallbackModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NullStateCarousel) && this.swipeViewModel.equals(((NullStateCarousel) obj).swipeViewModel);
        }

        public final int hashCode() {
            return this.swipeViewModel.hashCode();
        }

        public final String toString() {
            return "NullStateCarousel(swipeViewModel=" + this.swipeViewModel + ")";
        }
    }
}
