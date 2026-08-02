package com.squareup.cash.wallet.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.work.screens.WorkHomeScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class CardControlDialogViewModel {
    public final String message;
    public final Button primaryButton;
    public final Button secondaryButton;
    public final String title;

    public final class Button {
        public final Response action;
        public final boolean isDestructive;
        public final String text;

        public interface Response extends Parcelable {

            public final class Dismiss implements Response {
                public static final Dismiss INSTANCE = new Dismiss();
                public static final Parcelable.Creator<Dismiss> CREATOR = new WorkHomeScreen.Creator(1);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Dismiss);
                }

                public final int hashCode() {
                    return 1306738838;
                }

                public final String toString() {
                    return "Dismiss";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }

            public final class OpenUrl implements Response {
                public static final Parcelable.Creator<OpenUrl> CREATOR = new WorkHomeScreen.Creator(2);
                public final String url;

                public OpenUrl(String str) {
                    str.getClass();
                    this.url = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.url);
                }
            }
        }

        public Button(String str, boolean z, Response response) {
            this.text = str;
            this.isDestructive = z;
            this.action = response;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return this.text.equals(button.text) && this.isDestructive == button.isDestructive && this.action.equals(button.action);
        }

        public final int hashCode() {
            return this.action.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.text.hashCode() * 31, 31, this.isDestructive);
        }

        public final String toString() {
            StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("Button(text=", this.text, ", isDestructive=", ", action=", this.isDestructive);
            m1540m.append(this.action);
            m1540m.append(")");
            return m1540m.toString();
        }
    }

    public CardControlDialogViewModel(String str, String str2, Button button, Button button2) {
        this.title = str;
        this.message = str2;
        this.primaryButton = button;
        this.secondaryButton = button2;
    }
}
