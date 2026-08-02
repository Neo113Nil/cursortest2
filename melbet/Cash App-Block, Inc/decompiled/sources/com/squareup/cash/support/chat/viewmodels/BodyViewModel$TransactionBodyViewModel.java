package com.squareup.cash.support.chat.viewmodels;

import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class BodyViewModel$TransactionBodyViewModel extends ViewModelKt {

    public final class Loaded extends BodyViewModel$TransactionBodyViewModel {
        public final StackedAvatarViewModel.Avatar avatar;
        public final String title;

        public Loaded(StackedAvatarViewModel.Avatar avatar, String str) {
            this.avatar = avatar;
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.avatar.equals(loaded.avatar) && Intrinsics.areEqual(this.title, loaded.title);
        }

        public final int hashCode() {
            int hashCode = this.avatar.hashCode() * 31;
            String str = this.title;
            return Boolean.hashCode(false) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return "Loaded(avatar=" + this.avatar + ", title=" + this.title + ", chatUiUpliftEnabled=false)";
        }
    }

    public final class Loading extends BodyViewModel$TransactionBodyViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1283742216;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Missing extends BodyViewModel$TransactionBodyViewModel {
        public static final Missing INSTANCE = new Missing();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Missing);
        }

        public final int hashCode() {
            return -550943198;
        }

        public final String toString() {
            return "Missing";
        }
    }
}
