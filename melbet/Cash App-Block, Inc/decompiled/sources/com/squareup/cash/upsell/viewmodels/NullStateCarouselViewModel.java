package com.squareup.cash.upsell.viewmodels;

import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface NullStateCarouselViewModel {

    public final class Content implements NullStateCarouselViewModel {
        public final String buttonText;
        public final ArrayList pages;

        public final class Page {
            public final String body;
            public final String header;
            public final Image image;

            public Page(Image image, String str, String str2) {
                str.getClass();
                str2.getClass();
                this.image = image;
                this.header = str;
                this.body = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Page)) {
                    return false;
                }
                Page page = (Page) obj;
                return this.image.equals(page.image) && Intrinsics.areEqual(this.header, page.header) && Intrinsics.areEqual(this.body, page.body);
            }

            public final int hashCode() {
                return this.body.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.image.hashCode() * 31, 31, this.header);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Matcher$$ExternalSyntheticOutline0.m(this.image, "Page(image=", ", header=", this.header, ", body="), this.body, ")");
            }
        }

        public Content(String str, ArrayList arrayList) {
            str.getClass();
            this.pages = arrayList;
            this.buttonText = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.pages.equals(content.pages) && Intrinsics.areEqual(this.buttonText, content.buttonText);
        }

        public final int hashCode() {
            return this.buttonText.hashCode() + (this.pages.hashCode() * 31);
        }

        public final String toString() {
            return "Content(pages=" + this.pages + ", buttonText=" + this.buttonText + ")";
        }
    }

    public final class Loading implements NullStateCarouselViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 389337560;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
