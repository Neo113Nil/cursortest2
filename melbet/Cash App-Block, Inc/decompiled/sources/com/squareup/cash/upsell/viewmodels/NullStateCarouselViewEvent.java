package com.squareup.cash.upsell.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public interface NullStateCarouselViewEvent {

    public final class ButtonClick implements NullStateCarouselViewEvent {
        public final int currentPage;

        public ButtonClick(int i) {
            this.currentPage = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ButtonClick) && this.currentPage == ((ButtonClick) obj).currentPage;
        }

        public final int hashCode() {
            return Integer.hashCode(this.currentPage);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.currentPage, "ButtonClick(currentPage=", ")");
        }
    }

    public final class PageSwipe implements NullStateCarouselViewEvent {
        public final int newPage;

        public PageSwipe(int i) {
            this.newPage = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PageSwipe) && this.newPage == ((PageSwipe) obj).newPage;
        }

        public final int hashCode() {
            return Integer.hashCode(this.newPage);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.newPage, "PageSwipe(newPage=", ")");
        }
    }
}
